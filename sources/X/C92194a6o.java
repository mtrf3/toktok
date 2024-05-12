package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a6o, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92194a6o implements InterfaceC91946a2o<String> {
    public final /* synthetic */ C92363a9X LIZ;
    public final /* synthetic */ EnumC91839a15 LIZIZ;
    public final /* synthetic */ EnumC91837a13 LIZJ;

    public C92194a6o(C92363a9X c92363a9X, EnumC91839a15 enumC91839a15, EnumC91837a13 enumC91837a13) {
        this.LIZ = c92363a9X;
        this.LIZIZ = enumC91839a15;
        this.LIZJ = enumC91837a13;
    }

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String it) {
        o.LJIIIZ(it, "it");
        try {
            C92363a9X c92363a9X = this.LIZ;
            EnumC91839a15 enumC91839a15 = c92363a9X.LJJIJ;
            if (enumC91839a15 != null) {
                EnumC91839a15 enumC91839a152 = EnumC91839a15.Credit;
                if (enumC91839a15 == enumC91839a152) {
                    EnumC91837a13 enumC91837a13 = c92363a9X.LJJIJIIJI;
                    if (enumC91837a13 != null) {
                        EnumC91837a13 enumC91837a132 = EnumC91837a13.Prepaid;
                        if (enumC91837a13 == enumC91837a132) {
                            if (this.LIZIZ != enumC91839a152 || this.LIZJ != enumC91837a132) {
                                return C91945a2n.LIZ("pipo_cashier_form_error_CC_prepaid");
                            }
                            return C91945a2n.LIZIZ();
                        }
                    } else {
                        o.LJIJI("supportedPrepaidType");
                        throw null;
                    }
                }
                EnumC91839a15 enumC91839a153 = EnumC91839a15.Debit;
                if (enumC91839a15 == enumC91839a153) {
                    EnumC91837a13 enumC91837a133 = c92363a9X.LJJIJIIJI;
                    if (enumC91837a133 != null) {
                        EnumC91837a13 enumC91837a134 = EnumC91837a13.Prepaid;
                        if (enumC91837a133 == enumC91837a134) {
                            if (this.LIZIZ != enumC91839a153 || this.LIZJ != enumC91837a134) {
                                return C91945a2n.LIZ("pipo_cashier_form_error_DC_prepaid");
                            }
                            return C91945a2n.LIZIZ();
                        }
                    } else {
                        o.LJIJI("supportedPrepaidType");
                        throw null;
                    }
                }
                if (C91840a16.LIZ(enumC91839a15)) {
                    EnumC91837a13 enumC91837a135 = this.LIZ.LJJIJIIJI;
                    if (enumC91837a135 != null) {
                        EnumC91837a13 enumC91837a136 = EnumC91837a13.Prepaid;
                        if (enumC91837a135 == enumC91837a136) {
                            if (this.LIZJ != enumC91837a136) {
                                return C91945a2n.LIZ("pipo_cashier_form_error_CCDC_prepaid");
                            }
                            return C91945a2n.LIZIZ();
                        }
                    } else {
                        o.LJIJI("supportedPrepaidType");
                        throw null;
                    }
                }
                C92363a9X c92363a9X2 = this.LIZ;
                EnumC91839a15 enumC91839a154 = c92363a9X2.LJJIJ;
                if (enumC91839a154 != null) {
                    if (enumC91839a154 == enumC91839a152) {
                        EnumC91837a13 enumC91837a137 = c92363a9X2.LJJIJIIJI;
                        if (enumC91837a137 != null) {
                            EnumC91837a13 enumC91837a138 = EnumC91837a13.NonPrepaid;
                            if (enumC91837a137 == enumC91837a138) {
                                if (this.LIZIZ != enumC91839a152 || this.LIZJ != enumC91837a138) {
                                    return C91945a2n.LIZ("pipo_cashier_form_error_CC_noprepaid");
                                }
                                return C91945a2n.LIZIZ();
                            }
                        } else {
                            o.LJIJI("supportedPrepaidType");
                            throw null;
                        }
                    }
                    if (enumC91839a154 == enumC91839a153) {
                        EnumC91837a13 enumC91837a139 = c92363a9X2.LJJIJIIJI;
                        if (enumC91837a139 != null) {
                            EnumC91837a13 enumC91837a1310 = EnumC91837a13.NonPrepaid;
                            if (enumC91837a139 == enumC91837a1310) {
                                if (this.LIZIZ != enumC91839a153 || this.LIZJ != enumC91837a1310) {
                                    return C91945a2n.LIZ("pipo_cashier_form_error_DC_noprepaid");
                                }
                                return C91945a2n.LIZIZ();
                            }
                        } else {
                            o.LJIJI("supportedPrepaidType");
                            throw null;
                        }
                    }
                    if (C91840a16.LIZ(enumC91839a154)) {
                        EnumC91837a13 enumC91837a1311 = this.LIZ.LJJIJIIJI;
                        if (enumC91837a1311 != null) {
                            EnumC91837a13 enumC91837a1312 = EnumC91837a13.NonPrepaid;
                            if (enumC91837a1311 == enumC91837a1312) {
                                if (this.LIZJ != enumC91837a1312) {
                                    return C91945a2n.LIZ("pipo_cashier_form_error_CCDC_noprepaid");
                                }
                                return C91945a2n.LIZIZ();
                            }
                        } else {
                            o.LJIJI("supportedPrepaidType");
                            throw null;
                        }
                    }
                    C92363a9X c92363a9X3 = this.LIZ;
                    EnumC91839a15 enumC91839a155 = c92363a9X3.LJJIJ;
                    if (enumC91839a155 != null) {
                        if (enumC91839a155 == enumC91839a152) {
                            EnumC91837a13 enumC91837a1313 = c92363a9X3.LJJIJIIJI;
                            if (enumC91837a1313 != null) {
                                if (C91838a14.LIZ(enumC91837a1313)) {
                                    if (this.LIZIZ != enumC91839a152) {
                                        return C91945a2n.LIZ("pipo_cashier_form_error_CC_noprepaid");
                                    }
                                    return C91945a2n.LIZIZ();
                                }
                            } else {
                                o.LJIJI("supportedPrepaidType");
                                throw null;
                            }
                        }
                        C92363a9X c92363a9X4 = this.LIZ;
                        EnumC91839a15 enumC91839a156 = c92363a9X4.LJJIJ;
                        if (enumC91839a156 != null) {
                            if (enumC91839a156 == enumC91839a153) {
                                EnumC91837a13 enumC91837a1314 = c92363a9X4.LJJIJIIJI;
                                if (enumC91837a1314 != null) {
                                    if (C91838a14.LIZ(enumC91837a1314)) {
                                        if (this.LIZIZ != enumC91839a153) {
                                            return C91945a2n.LIZ("pipo_cashier_form_error_DC_noprepaid");
                                        }
                                        return C91945a2n.LIZIZ();
                                    }
                                } else {
                                    o.LJIJI("supportedPrepaidType");
                                    throw null;
                                }
                            }
                            EnumC91839a15 enumC91839a157 = this.LIZ.LJJIJ;
                            if (enumC91839a157 != null) {
                                if (C91840a16.LIZ(enumC91839a157)) {
                                    EnumC91837a13 enumC91837a1315 = this.LIZ.LJJIJIIJI;
                                    if (enumC91837a1315 != null) {
                                        C91838a14.LIZ(enumC91837a1315);
                                    } else {
                                        o.LJIJI("supportedPrepaidType");
                                        throw null;
                                    }
                                }
                                return C91945a2n.LIZIZ();
                            }
                            o.LJIJI("supportedCCDCType");
                            throw null;
                        }
                        o.LJIJI("supportedCCDCType");
                        throw null;
                    }
                    o.LJIJI("supportedCCDCType");
                    throw null;
                }
                o.LJIJI("supportedCCDCType");
                throw null;
            }
            o.LJIJI("supportedCCDCType");
            throw null;
        } catch (Throwable unused) {
            return C91945a2n.LIZ("");
        }
    }
}
