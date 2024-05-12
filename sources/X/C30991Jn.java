package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: X.1Jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30991Jn implements InterfaceC06370Mv {
    public final java.util.Map<String, InterfaceC06370Mv> LIZ;

    public C30991Jn() {
        HashMap hashMap = new HashMap();
        this.LIZ = hashMap;
        hashMap.put("eg_ccdc_global_card_number", new InterfaceC06370Mv() { // from class: X.17W
            @Override // X.InterfaceC06370Mv
            public final C24000wu LIZ(C23990wt... c23990wtArr) {
                C24000wu c24000wu = new C24000wu();
                c24000wu.LIZ = true;
                C23990wt c23990wt = c23990wtArr[0];
                String str = c23990wt.LJI;
                if (c23990wt.LIZIZ() && TextUtils.isEmpty(str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_card_number");
                } else {
                    C24050wz LIZIZ = C22780uw.LIZ.LIZIZ(str);
                    if (LIZIZ != null) {
                        C0RB LIZ = C276216o.LJIIL.LIZ();
                        if (((HashMap) LIZ.LJFF).get(LIZIZ.LJI) == null) {
                            c24000wu.LIZ = false;
                            c24000wu.LIZIZ("pipo_common_error_card_not_supported", new String[0]);
                        } else {
                            if (LIZIZ.LIZLLL == null) {
                                LIZIZ.LIZLLL = new ArrayList();
                                if (LIZIZ.LIZJ != null) {
                                    for (int i = 0; i < LIZIZ.LIZJ.length(); i++) {
                                        try {
                                            ((ArrayList) LIZIZ.LIZLLL).add((Integer) LIZIZ.LIZJ.get(i));
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            }
                            if (!((ArrayList) LIZIZ.LIZLLL).contains(Integer.valueOf(str.length()))) {
                                c24000wu.LIZ = false;
                                c24000wu.LIZIZ("pipo_common_error_card_number_length", new String[0]);
                            } else if (!Pattern.matches("^[0-9]+$", str)) {
                                c24000wu.LIZ = false;
                                c24000wu.LIZIZ("pipo_common_error_card_check", new String[0]);
                            } else if (!C78977Uz7.LJJJJLL(str)) {
                                c24000wu.LIZ = false;
                                c24000wu.LIZIZ("pipo_common_error_card_number", new String[0]);
                            }
                        }
                    } else {
                        c24000wu.LIZ = false;
                        c24000wu.LIZIZ("pipo_common_error_card_number", new String[0]);
                    }
                }
                return c24000wu;
            }
        });
        hashMap.put("eg_ccdc_global_cvv", new InterfaceC06370Mv() { // from class: X.17Y
            @Override // X.InterfaceC06370Mv
            public final C24000wu LIZ(C23990wt... c23990wtArr) {
                C23980ws c23980ws;
                String str;
                C24000wu c24000wu = new C24000wu();
                c24000wu.LIZ = true;
                C23990wt c23990wt = c23990wtArr[0];
                String str2 = c23990wt.LJI;
                Object obj = c23990wt.LJIIIZ;
                if (obj != null) {
                    c23980ws = (C23980ws) obj;
                } else {
                    c23980ws = null;
                }
                if (c23990wt.LIZIZ() && TextUtils.isEmpty(str2)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_security_code");
                } else if (c23980ws != null) {
                    if (c23980ws.LIZ().size() > 0) {
                        str = c23980ws.LIZ().toString().replace("[", "{").replace("]", "}").replace(" ", "");
                    } else {
                        str = "{3,4}";
                    }
                    if (!Pattern.matches(C16880lQ.LLLZ("^[0-9]%s$", new Object[]{str}), str2)) {
                        c24000wu.LIZ = false;
                        c24000wu.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
                    } else if (!Pattern.matches("^[0-9]{3,4}$", str2)) {
                        c24000wu.LIZ = false;
                        c24000wu.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
                    }
                } else {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
                }
                return c24000wu;
            }
        });
        hashMap.put("eg_ccdc_global_expiration_year", new InterfaceC06370Mv() { // from class: X.17a
            @Override // X.InterfaceC06370Mv
            public final C24000wu LIZ(C23990wt... c23990wtArr) {
                int LJIJI;
                C23990wt c23990wt = c23990wtArr[0];
                C23990wt c23990wt2 = c23990wtArr[1];
                C24000wu c24000wu = new C24000wu();
                c24000wu.LIZ = true;
                Calendar calendar = Calendar.getInstance();
                int i = calendar.get(1);
                int i2 = calendar.get(2);
                String str = c23990wt.LJI;
                int i3 = -1;
                if (c23990wt.LIZIZ() && TextUtils.isEmpty(str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_expiry_date");
                    LJIJI = -1;
                } else {
                    LJIJI = O5Y.LJIJI(str);
                    if (!Pattern.matches("^[0-9]{2}$", str)) {
                        c24000wu.LIZ = false;
                        c24000wu.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (!Pattern.matches("^[0-9]{2}$", str)) {
                        c24000wu.LIZ = false;
                        c24000wu.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (LJIJI > i + 15) {
                        c24000wu.LIZ = false;
                        c24000wu.LIZIZ("pipo_common_error_year_too_far", new String[0]);
                    } else {
                        int LJIJ = O5Y.LJIJ(c23990wt2.LJI);
                        if (LJIJI < i || (LJIJI == i && LJIJ < i2)) {
                            c24000wu.LIZ = false;
                            c24000wu.LIZIZ("pipo_common_error_card_expired", new String[0]);
                        }
                    }
                }
                C24000wu c24000wu2 = new C24000wu();
                c24000wu2.LIZ = true;
                String str2 = c23990wt2.LJI;
                if (c23990wt2.LIZIZ() && TextUtils.isEmpty(str2)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_expiry_date");
                } else {
                    try {
                        i3 = CastIntegerProtector.parseInt(str2);
                    } catch (Throwable unused) {
                    }
                    if (!Pattern.matches("^[0-9]{2}$", str2)) {
                        c24000wu2.LIZ = false;
                        c24000wu2.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (!Pattern.matches("^[0-9]{2}$", str2)) {
                        c24000wu2.LIZ = false;
                        c24000wu2.LIZIZ("pipo_common_payin_expiry_date", new String[0]);
                    } else if (i3 > 12 || i3 < 1) {
                        c24000wu2.LIZ = false;
                        c24000wu2.LIZIZ("pipo_common_error_month_check", new String[0]);
                    } else if ((LJIJI == i && i3 < i2) || LJIJI < i) {
                        c24000wu2.LIZ = false;
                        c24000wu2.LIZIZ("pipo_common_error_card_expired", new String[0]);
                    }
                }
                if (c24000wu.LIZLLL == null) {
                    c24000wu.LIZLLL = new ArrayList();
                }
                ((ArrayList) c24000wu.LIZLLL).add(c24000wu2);
                return c24000wu;
            }
        });
        hashMap.put("eg_ccdc_global_billing_address_country_regin", new InterfaceC06370Mv() { // from class: X.17V
            @Override // X.InterfaceC06370Mv
            public final C24000wu LIZ(C23990wt... c23990wtArr) {
                C24000wu c24000wu = new C24000wu();
                c24000wu.LIZ = true;
                String str = c23990wtArr[0].LJI;
                String str2 = c23990wtArr[1].LJI;
                String str3 = c23990wtArr[2].LJI;
                boolean isEmpty = TextUtils.isEmpty(str);
                boolean isEmpty2 = TextUtils.isEmpty(str2);
                boolean isEmpty3 = TextUtils.isEmpty(str3);
                if ((isEmpty || isEmpty2 || isEmpty3) && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3))) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("invalid_billing_address", new String[0]);
                } else if (!TextUtils.isEmpty(str3) && str3.length() > 300) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("invalid_post_code", new String[0]);
                }
                return c24000wu;
            }
        });
        hashMap.put("eg_ccdc_global_identity", new InterfaceC06370Mv() { // from class: X.17X
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
            
                if (r6 == r7) goto L7;
             */
            @Override // X.InterfaceC06370Mv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C24000wu LIZ(X.C23990wt... r15) {
                /*
                    r14 = this;
                    X.0wu r9 = new X.0wu
                    r9.<init>()
                    r0 = 1
                    r9.LIZ = r0
                    r8 = 0
                    r0 = r15[r8]
                    java.lang.String r1 = r0.LJI
                    boolean r0 = r0.LIZIZ()
                    java.lang.String r13 = "pipo_common_payin_CPF"
                    if (r0 == 0) goto L27
                    boolean r0 = android.text.TextUtils.isEmpty(r1)
                    if (r0 == 0) goto L27
                    r9.LIZ = r8
                    java.lang.String r1 = "pipo_common_error_required_field"
                    java.lang.String[] r0 = new java.lang.String[]{r13}
                    r9.LIZIZ(r1, r0)
                L26:
                    return r9
                L27:
                    java.lang.String r0 = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"
                    boolean r0 = java.util.regex.Pattern.matches(r0, r1)
                    java.lang.String r10 = "pipo_common_error_is_invalid"
                    if (r0 != 0) goto L3b
                    r9.LIZ = r8
                    java.lang.String[] r0 = new java.lang.String[]{r13}
                    r9.LIZIZ(r10, r0)
                    goto L26
                L3b:
                    java.lang.String r0 = "\\d+/g"
                    java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
                    java.util.regex.Matcher r3 = r0.matcher(r1)
                    boolean r0 = r3.find()
                    if (r0 != 0) goto L55
                L4b:
                    r9.LIZ = r8
                    java.lang.String[] r0 = new java.lang.String[]{r13}
                    r9.LIZIZ(r10, r0)
                    goto L26
                L55:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r1 = 0
                L5b:
                    int r0 = r3.groupCount()
                    if (r1 >= r0) goto L6b
                    java.lang.String r0 = r3.group(r1)
                    r2.append(r0)
                    int r1 = r1 + 1
                    goto L5b
                L6b:
                    java.lang.String r12 = r2.toString()
                    r4 = 9
                    java.lang.String r5 = r12.substring(r8, r4)
                    r11 = 10
                    r3 = 0
                    r2 = 0
                    r1 = 10
                L7b:
                    int r0 = r5.length()
                    r7 = -1
                    if (r3 >= r0) goto L96
                    char r0 = r5.charAt(r3)
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    int r7 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> L8e
                L8e:
                    int r0 = r1 + (-1)
                    int r7 = r7 * r1
                    int r2 = r2 + r7
                    int r3 = r3 + 1
                    r1 = r0
                    goto L7b
                L96:
                    r6 = 11
                    int r2 = r2 % r6
                    int r1 = 11 - r2
                    if (r1 < r11) goto L9e
                    r1 = 0
                L9e:
                    char r0 = r12.charAt(r4)
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> Lab
                    goto Lac
                Lab:
                    r0 = -1
                Lac:
                    if (r1 == r0) goto Laf
                    goto L4b
                Laf:
                    java.lang.String r5 = r12.substring(r8, r11)
                    r4 = 0
                    r3 = 0
                    r2 = 11
                Lb7:
                    int r0 = r5.length()
                    if (r4 >= r0) goto Ld3
                    char r0 = r5.charAt(r4)
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> Lca
                    goto Lcb
                Lca:
                    r1 = -1
                Lcb:
                    int r0 = r2 + (-1)
                    int r1 = r1 * r2
                    int r3 = r3 + r1
                    int r4 = r4 + 1
                    r2 = r0
                    goto Lb7
                Ld3:
                    int r3 = r3 % r6
                    int r6 = r6 - r3
                    if (r6 < r11) goto Ld8
                    r6 = 0
                Ld8:
                    char r0 = r12.charAt(r11)
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    int r7 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> Le4
                Le4:
                    if (r6 == r7) goto L26
                    goto L4b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C17X.LIZ(X.0wt[]):X.0wu");
            }
        });
        hashMap.put("eg_pi_ew_ovo_c_d_local_id_wallet_id", new InterfaceC06370Mv() { // from class: X.17c
            @Override // X.InterfaceC06370Mv
            public final C24000wu LIZ(C23990wt... c23990wtArr) {
                C24000wu c24000wu = new C24000wu();
                c24000wu.LIZ = true;
                C23990wt c23990wt = c23990wtArr[0];
                String str = c23990wt.LJI;
                if (c23990wt.LIZIZ() && TextUtils.isEmpty(str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_ovo_id");
                } else if (!Pattern.matches("^08[0-9]{8,11}$", str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_ovo_id");
                }
                return c24000wu;
            }
        });
        hashMap.put("eg_ccdc_global_holder_name", new InterfaceC06370Mv() { // from class: X.17b
            @Override // X.InterfaceC06370Mv
            public final C24000wu LIZ(C23990wt... c23990wtArr) {
                C24000wu c24000wu = new C24000wu();
                c24000wu.LIZ = true;
                C23990wt c23990wt = c23990wtArr[0];
                String str = c23990wt.LJI;
                if (c23990wt.LIZIZ() && TextUtils.isEmpty(str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_cardholder_name");
                } else if (!Pattern.matches("^[\\p{sc=Latin}\\s.-]*$", str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_cardholder_name");
                }
                return c24000wu;
            }
        });
        hashMap.put("eg_ccdc_global_email", new InterfaceC06370Mv() { // from class: X.17Z
            @Override // X.InterfaceC06370Mv
            public final C24000wu LIZ(C23990wt... c23990wtArr) {
                C24000wu c24000wu = new C24000wu();
                c24000wu.LIZ = true;
                C23990wt c23990wt = c23990wtArr[0];
                String str = c23990wt.LJI;
                if (c23990wt.LIZIZ() && TextUtils.isEmpty(str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_Email");
                } else if (!Pattern.matches("^(([^<>()\\[\\]\\\\.,;:\\s@\"]+(\\.[^<>()\\[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$", str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_is_invalid", "pipo_common_payin_Email");
                }
                return c24000wu;
            }
        });
        hashMap.put("eg_ccdc_global_billing_address", new InterfaceC06370Mv() { // from class: X.17e
            @Override // X.InterfaceC06370Mv
            public final C24000wu LIZ(C23990wt... c23990wtArr) {
                C24000wu c24000wu = new C24000wu();
                c24000wu.LIZ = true;
                C23990wt c23990wt = c23990wtArr[0];
                String str = c23990wt.LJI;
                if (c23990wt.LIZIZ() && TextUtils.isEmpty(str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_mobile_address1");
                }
                return c24000wu;
            }
        });
        hashMap.put("eg_ccdc_global_billing_address_street_mobile", new InterfaceC06370Mv() { // from class: X.17f
            @Override // X.InterfaceC06370Mv
            public final C24000wu LIZ(C23990wt... c23990wtArr) {
                C24000wu c24000wu = new C24000wu();
                c24000wu.LIZ = true;
                C23990wt c23990wt = c23990wtArr[0];
                String str = c23990wt.LJI;
                if (c23990wt.LIZIZ() && TextUtils.isEmpty(str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_address");
                }
                return c24000wu;
            }
        });
        hashMap.put("eg_ccdc_global_billing_address_postal_code", new InterfaceC06370Mv() { // from class: X.17d
            @Override // X.InterfaceC06370Mv
            public final C24000wu LIZ(C23990wt... c23990wtArr) {
                C24000wu c24000wu = new C24000wu();
                c24000wu.LIZ = true;
                C23990wt c23990wt = c23990wtArr[0];
                String str = c23990wt.LJI;
                if (c23990wt.LIZIZ() && TextUtils.isEmpty(str)) {
                    c24000wu.LIZ = false;
                    c24000wu.LIZIZ("pipo_common_error_required_field", "pipo_common_payin_postalcode");
                }
                return c24000wu;
            }
        });
    }

    @Override // X.InterfaceC06370Mv
    public final C24000wu LIZ(C23990wt... c23990wtArr) {
        InterfaceC06370Mv interfaceC06370Mv = (InterfaceC06370Mv) ((HashMap) this.LIZ).get(c23990wtArr[0].LIZ);
        C24000wu c24000wu = new C24000wu();
        if (interfaceC06370Mv != null) {
            return interfaceC06370Mv.LIZ(c23990wtArr);
        }
        return c24000wu;
    }
}
