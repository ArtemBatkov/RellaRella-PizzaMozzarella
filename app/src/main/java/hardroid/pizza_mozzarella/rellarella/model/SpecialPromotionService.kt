package hardroid.pizza_mozzarella.rellarella.model

class SpecialPromotionService {
    private var PromotionsList: MutableList<SpecialPromotionModel> = mutableListOf()

    init{
        PromotionsList.add(SpecialPromotionModel(1, IMAGES[0]))
        PromotionsList.add(SpecialPromotionModel(2,IMAGES[1]))
        PromotionsList.add(SpecialPromotionModel(3,IMAGES[2]))
        PromotionsList.add(SpecialPromotionModel(4,IMAGES[3]))
        PromotionsList.add(SpecialPromotionModel(5,IMAGES[4]))

    }

    companion object {
        private var IMAGES = mutableListOf(
            "https://lh3.googleusercontent.com/pw/AL9nZEWL4tFdEm-0LHLUiA9L1u2ZbvIf_YkcWzWnhvSpu7e9qdSADyXTBNRp7j8kim9-nOOSWgPF1jbpfhpDeZNMMpbKWmSeaDcJBPgRoCPGS_-RwX0fguQeLo-knZbaj2yO53N0E6xu6r9dLpw5dz2_eEhW=w760-h727-no?authuser=0",
            "https://lh3.googleusercontent.com/uPPdNIe0CCVRnv0rvi8WoAP0s77xlaHbE0XOrMn4IPOHyON4nP3iFJT2mXFO2iT0AdWJRiLPW3bBCXyFYcqyjYJ0PZqOxqLanzQc1B0Yi0lyhIiGEYCL36uRabtfL8Cf2XfVC1mcidVJUDrAT_SJIy1wjpFZdgFh1bpoLSYxZnpArHJt3irgGqPbBfiD6bAoX9gCkUx-6gMp2teA9Nx274JlBpjTwxK_hOO8RtbiVNv8jGcWsgpZg1xbYHgK869xPTU7XRyetycrqqh18OoeKOeHr56KBqUHIUbJJY6DupJfLnQLv_ZF6ychm71jMXaCothSRBVDRXqkQJHh_pbQoLo47bE2exFBGMOhRscKsRQeE6fqMIBsbqsy1JT7C3S8yz-cuP1gfu_rHtKS7pfknRrKCuMDYiepwcX7-9SdIFUSVQky3M-M0gUfg7AYcP5vQsMTwjRpDYZP2PW0ig8jCrOw2ryIL59lzmHNvIWVunkmld1n_zneNhdjtTflnbbIl9gw6WMS9K1-22pcVc0pF4FNhi5EwY78OvhwUmtqboL7y5wlAF8BpVGOCiBLiYmIR-2i0ZUwoJStrq_AbAJmK9VAp3svOBSqBBSHnBqlaEd-kmPwzzEbe7XWseqCZ6T6APHD4W9ByboCbWXpsTPRCZFcl0-ApaP9OGayVkU4Fjt1XAZB_-Bn3mxJ3qNTCyVTcS2mxDYam9K_l2KSp8BuZ5aqFTHPX0kg3sdkDfv3CgLLijA5rDL8HBQtnc1U2Z7DC4E6L0XgRm4fcu6h0X_78SzJUKhrdnW392yLRq-B5TppEOWwX4z4hlgOiNyHCB-FyrMF3HIZo3XtXSyundoAWty6xujBB3eFlSmCQ3X-jqvZ68qb5NjuNzaHz-eHBPgBR1DSomGYUX8eNEdOWHa2tVO9f7gZ6ykPQqBYoKJaxhMkhCJONHa5tU4ZOCvva7o3LjorPJy7JKTI9H0KuchYZw3s7DWF3JecSm4dBKbTxTKFXH22vezKq1z5CuJAkpMAsWUuHeQQ6wG5dRvWq5G4S36KlA=s500-no?authuser=0",
            "https://lh3.googleusercontent.com/fNgYeYChZAvChG_M5-1qDGNrvcFAqyps2tO9ZlW8YG6HT7aRmbwspX_YVZLYc-VrkhDfUiL3TxSrsFR-OXJDBt7nkx1L-_qnTE0cCGYn4eTkIfaBQHf-wAHvMja4EqJCT_x2qxmdMhX4DG1gPzWgTyC4rdEQMwtGzhlFfFxmB7Rjy-KN92i0uYDXUV2jkwKGzgqnTp_Dj9yZNAp_EUKygIOjhbhQ64xWaljxa_OlsRgQe5smgRQwJa1Pg-yLdmUXZrA3xFKceZ9VyHUP5rPworqnmPhqyXhU7nEI0Xlx0uPRDUT0iBCijpXlraRyahsEGdMhWESlKhi7yh_XK2tabGGhfGM5cHTKkkZ1uUc23W9wCI-M5-5rb2S71h2gLZoeBcuIsnMIq_0TEoGu5c1XJSphNo1D3GLtipHYwedHZLLQF0VmJOpKjcsmXjTYFUiaHivpkW-B9Dk-24RnpZBMl4K07rfCFFuR-B7DgQ0c3AS1ejwFoD27DWNv9yowlcOMYAQkvAqBsXbOGGD_TwyNDEOUbHM8db6tPrkrUBRbSG7qw2hJeCoBiowRdPDiwWsoXP-5frBDimcCrMobWcMTh9d25iNgfVNKHSSTFuec7kgy_RwVZVAlVWcIbBdjdoxrlJC2rGENyyBT_xRgfYwsFjhmr0_goPhjZVP0Qfycly4lxm2KumhrlgFD46LatOjGxF9RBHrj5BvCxbfgbvW3KIF98FD7SYaZ8Hy1iXv1cbKHXiuqZ_cPFGdoH1NhMlC_UGtvtNzRPVbwRDQ1pNuXa0uJxMu-AcSH9XFJUCOJ1cr2AkQMAPgpHspj2NckM6kHcBpnltkCTABxr02mwkatwMi5wBFUNILE2wlePJL0dkBfwL8PFbU1RtdpzzFvuUTvsJuGkGGd7sjfGw048wSndURuxfTnALCiw7BQbozt-N7IezR2Isvtsmvnm6byOhlJF7pNFoJAyjBvZMiYcBFzRnUkpMj8kFyCtVYBEsLBv538-UVxOmsgOhxDHYJEldoM-s-yr9sS0CQtYtaamnrPjlq-2A=s600-no?authuser=0",
            "https://lh3.googleusercontent.com/jW1iRe4BDcCal9hAh0GnbxtYDYGLLFOfTzKf8abtU6g9c5f_DahwoBm8GGzkkmBxTh8O7dbGFYuoTOriuf6B8o1gtGD5FMOze0I1sOBvcpvYO-zw70AA-SHPgCGcQvmWchsaNChIFLoYp3inFUxCvyN6BiJFN6-Rbwqbkixh7ie1rD685kgvqawfP4c1YvlBGoOeCfTGFy8nS8VBRkTlA4_83wBBr1Alsg5SgUGYIV99ZoVKDPv8FTjIHZpI6RR5aH1BqQOgw2UOzXjujGGBfrttD1HEAJ1LC9OI1I0hIrVZQlpb4DptmMzpAszgP7EjWe7hD9iYVv30pFcdwbb5fcFB2m38WIFZrA7P1U287c_-PCHKNXbnPzd62NJ7BChm3oYzS6X1Jy7Cbuyh6u314chiuRzz_G7xAGrxiMGs-57SjC6m3xjCh8J1ALb-oTCshKztALZzmpilCKtSLjr5zJYRPF_HBA_e4BSTBBQBr6ztzeP8-m2H4GxYoEEMmEgarhgpR0Rl0WPa-mUAI3LCbPalDL7TAotLAyNPGZj82Dt715KFC7Mv-Wk6Z5LjjeZoSdXBlSL-qBkSNxqfyZSpfl19yA4buqnKS2-8BqU4LCCa1GTsXYRCFsyBQOatBkjS6elE32tIjfruQglwEit3Dy5mWHmuGd80LHRiW2jqAXyDbx6UovtuyTw7PNg95pfgb1qWjW6WRKGVw878YQ6kRUqKsKZSZVsPwlgIWY8hGHiFWAdk1C9Tw2xZSKbcy3I04zzRqC7EplwMcN52DXFDJiInRQqFCdou_PoNi_LX5P1PKFpGFaFpECmDxcbzZ5amar52Rz1OhLdFhs25klwMXi8JPFmkKwEZUlvuK8-Pe_c_fceQlVHowASsiZjFP0EosA0HYFQ7rXDaewc_JDV-RBA3SfPn9Caq3zhCTCKLiaXzo0JbUqxvYM7wr-w95R3RPbdyF5tn57c6TD2MOhOaTXoImbDChCG7adOXFOH2ZzZqRlIQEy4a886B00k77f8fuTX1_xgBYPef7_-HB3sM1GWJ8A=s819-no?authuser=0",
            "https://lh3.googleusercontent.com/9e583WD-6K5XzRbtyhOwVf2RGGLKlNVHmYKOsIlksNw8rBKeRlWurmbupV8DAI8_u6-R5n246RUuMcAyKjBTHxn96o14YszXxw5Q_SzJK0waxXMRM4SqAgAbYUB15xXlYCzkGvadh9ZC8fRI3SVQm8cIva4XxuS1A19UVC9gng0O2kmTjqmG2GQccv347okM82VLLNOHTgGUhg3UqI2d_Qqxb0RZdSystiWwDmS9oSI3zoMljNtmKIL2Im4tQrURp3HIAdA_OSwrm5uIcHt335vPc2Ez24EG5EwR8Ekt7PG512fmOgzFg0kMDIu4LamfGBVh7ICc4kj2u-VtHl71izoG87VeI4tCTvDhUV9M3OBh8BFTsZTwV41VPLjJjjWvGspUXhWQEK_aBM1jUvBDd970ULB-6IMzcWmL01A6u5-EiALdJEj1gZYHJ4Tom7pQ1VwrSVS3y_w_sgfx6q0nolqIl1ylHGeTuJgAIBNCtXdwYb_KAeGbPdeWe_aadIK3A9QA0TV5Gm0XmsHB3BIN9CGn7QtHwXtpRxNQPV2Bsbjf-1pMs75sROh7U0eMDGHK5tzX0_syT6L2Wq_r8WIQM85LMMZ0IYrFggFz6Vx6_8gzH3A4JUt6yNGuKpCBDYunkA13RCPtIAzs-gxs5FLhc7ThhNnV_8bgvr6EVR9ggOayGveI36HLQwo7QrhAkjPRJu5pBa9stHsASZ4XJnplawpBL_zLDLgiFeOfApQojMNcJGr4P3j53BGXrPdKi5eaFMwp3VcgDh-DZPhDG2vmE9eGnw7mdwSeH4vWSI8pLf7T-bhH0rgNf7H80v5wjKRjKtoMKqZzt_cj8xLhksxOOLeM7VI3hf1IYEoFMx6vnhrGXgs5PrPBAyeZmgXbx_J2OcdBnAlhkdk3wQm__aT1H6y_FsnVxZOD8Y5KzjGIslCHlUIHQ0QI1gjs0236IJsxea2Q2pbRUItgH5XkQc2hks8q1z4UhRFdmZelaj_UPWhuWExzk83YI27YhmVh44llk7G-PPAmqe7VjQ5pIR_MoFYu3w=w380-h247-no?authuser=0",
            "https://lh3.googleusercontent.com/iwXBTZvZWoAL-BKRdpPCiXSeC5W-_nqsBIUQGY5JFq1VNGFafs4S8qsz61Lv1VTV2j-eS5oHT9Lk_cq-uu7Acs0_K9scnGJh8Ct8LvNX7iQd0h9xslEmdB_vtolNfqxfawVUYAC20HylhmcUVgMFR3KqipE2X7bxk8cktRM7rY33CCPoohYUHDNptQ4SLXSG54_puTb9hYzYw_ZG8FAL8awFYAwJ63yq5J1sDWmSFginlHCgl4pYQ-jDr1JpHUO9rYKpRi_sD068X2xVtQGhzX8JFbbIz1t4w4yaBIz8CNPIHC0JZsb93CvFpvEL9SpeyqtCMw1UsUlFlzLPX_b_upXIIIer1unHMXqRysNJRfvXMsnRNYMHn2UVEB92Qs9z59vfWO4c1Vlksxnz-o-1SJyd9XgT62oLviTEE-HZQRwk97HknjS02hXFpFBYkwN99jRnMqMG49NYXk0qrHok5hF4CnBig1ljxEk0uRzJJ_IDAXvweR-jjN-4BaZw9MHHfk4vaW351weIRhEA03N_jAVhhUpGFFl41JvGAIkaP6YQcV19Wm4hWau8EHpwN1vZHVXanFl087Ki__GXyqIaCBj2wYqIGo4GfpB_lLVXg01x9mJVN_CRrcg8w0dR90NERBWf-8_2odB7dFqZfuwf0JmWJhzXqKE2y0i7Hg5NZwFHeGXlGDQbas1I4_D282B9wMbiBIv2jR6rNasJg87jL7CC-_lk8WPQoiaiNTblV35TM94aOnZslQb38ccrg5f4oXfE8XSz-QE0jU7jWlh844vqyoLB4Scf56UjD_SF6KOZl26kfRcxfG7oFMWAJJTjXMEz1isqyiiAWD1uNIB-Rs0TEwU6qA7da4ImZnCro6lTHI8l7NJGBvXVqpfrzTJJMPI2pmgO-jxdIipsTnmf69CWTyO-WuUQLjVEYBDBySBzX0PCaOoqCaNGJAVQl-x9PEm7JSIdwg1FnE7zVq_D49e50g0nt7cRT9dL9nuEszvNkqt4O0PR5C44MCJB2drBKLsds0GWYqW3kawecrsZD4ROKw=w940-h788-no?authuser=0"
        )
    }

    fun getPromotionsList():MutableList<SpecialPromotionModel>{
        return PromotionsList
    }
}