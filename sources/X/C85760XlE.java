package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XlE, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85760XlE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(Activity activity) {
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIZ(activity.getString(R.string.jes));
        c26045AKb.LIZ(true);
        c26045AKb.LJIIJ();
    }

    public static void LJFF(Activity activity) {
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LJFF(activity.getString(R.string.jex));
        c26227ARb.LIZIZ(activity.getString(R.string.jeu));
        UC0.LIZJ(c26227ARb, new AqS181S0100000_15(activity, 256));
        c26227ARb.LJIIIIZZ = false;
        c26227ARb.LJI().LIZLLL();
    }

    public static void LJI(Activity activity) {
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LIZIZ(activity.getString(R.string.jen));
        UC0.LIZJ(c26227ARb, new AqS181S0100000_15(activity, 257));
        c26227ARb.LJIIIIZZ = false;
        c26227ARb.LJI().LIZLLL();
    }

    public static void LIZ(int i, String str) {
        PRC.LIZ(6, "passkey", C012403c.LIZLLL("error code: ", i, ": ", str));
    }

    public static void LIZJ(Activity activity, boolean z, Boolean bool, int i) {
        C85761XlF.LJII(OAF.LIZIZ(activity), z, bool, 0);
        C85761XlF.LJFF(bool, z);
        C85761XlF.LJ(OAF.LIZIZ(activity), z, bool, i);
        if (!z) {
            LJ(activity);
        } else {
            LJFF(activity);
        }
    }

    public static void LIZIZ(Activity activity, boolean z, Boolean bool, InterfaceC65784Pro interfaceC65784Pro, int i) {
        C85761XlF.LJII(OAF.LIZIZ(activity), z, bool, i);
        if (!z) {
            LJ(activity);
            C85761XlF.LJ(OAF.LIZIZ(activity), false, bool, i);
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    public static void LIZLLL(Activity activity, Throwable e, boolean z, boolean z2, Boolean bool, InterfaceC65784Pro noShowCallback) {
        int errorCode;
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(e, "e");
        o.LJIIIZ(noShowCallback, "noShowCallback");
        if (e instanceof C85772XlQ) {
            C85772XlQ c85772XlQ = (C85772XlQ) e;
            noShowCallback.invoke();
            int errorCode2 = c85772XlQ.getErrorCode();
            if (errorCode2 == EnumC85764XlI.PASSKEY_REGISTRATION_NOT_ON_PROFILE.getErrorCode()) {
                LIZ(c85772XlQ.getErrorCode(), "Passkey not shown due to user not on profile page");
            } else {
                if (errorCode2 == EnumC85764XlI.PASSKEY_REGISTRATION_DISMISS_RECREATION_POP_UP.getErrorCode()) {
                    LIZ(c85772XlQ.getErrorCode(), "Passkey not shown due to user rejected passkey recreation");
                    return;
                }
                if (errorCode2 == EnumC85764XlI.PASSKEY_REGISTRATION_NULL_POINTER.getErrorCode()) {
                    LIZIZ(activity, z, bool, noShowCallback, c85772XlQ.getErrorCode());
                    LIZ(c85772XlQ.getErrorCode(), "JSON is null");
                    return;
                } else if (errorCode2 == EnumC85764XlI.PASSKEY_REGISTRATION_ILLEGAL_ARGUMENT.getErrorCode()) {
                    LIZIZ(activity, z, bool, noShowCallback, c85772XlQ.getErrorCode());
                    LIZ(c85772XlQ.getErrorCode(), "JSON file is wrong");
                    return;
                } else {
                    int errorCode3 = c85772XlQ.getErrorCode();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Unexpected custom error: ");
                    LIZ2.append(c85772XlQ.getMessage());
                    LIZ(errorCode3, X1D.LIZIZ(LIZ2));
                }
            }
            C85761XlF.LJII(OAF.LIZIZ(activity), z, bool, c85772XlQ.getErrorCode());
            return;
        }
        if (e instanceof C69084R9k) {
            C69084R9k c69084R9k = (C69084R9k) e;
            C85761XlF.LJ(OAF.LIZIZ(activity), z, bool, c69084R9k.getErrorCode());
            LIZ(c69084R9k.getErrorCode(), c69084R9k.getMessage());
            if (z) {
                if (z2) {
                    LJFF(activity);
                    return;
                } else {
                    C85761XlF.LJII(OAF.LIZIZ(activity), true, bool, c69084R9k.getErrorCode());
                    noShowCallback.invoke();
                    return;
                }
            }
            if (!z2) {
                C85761XlF.LJII(OAF.LIZIZ(activity), false, bool, c69084R9k.getErrorCode());
            }
            if (c69084R9k.getErrorCode() == 2029) {
                C26227ARb c26227ARb = new C26227ARb(activity);
                c26227ARb.LJFF(activity.getString(R.string.jer));
                c26227ARb.LIZIZ(activity.getString(R.string.jeq));
                UC0.LIZJ(c26227ARb, new AqS175S0100000_9(activity, 467));
                c26227ARb.LJIIIIZZ = false;
                c26227ARb.LJI().LIZLLL();
                return;
            }
            if (c69084R9k.getErrorCode() < 0) {
                LJI(activity);
                return;
            } else {
                LJ(activity);
                return;
            }
        }
        if (e instanceof AbstractC23600wG) {
            AbstractC23600wG abstractC23600wG = (AbstractC23600wG) e;
            if (abstractC23600wG instanceof C44091oD) {
                C44091oD c44091oD = (C44091oD) abstractC23600wG;
                AbstractC24960yS domError = c44091oD.getDomError();
                if (domError instanceof C36111bL) {
                    errorCode = -3000;
                } else if (domError instanceof C36121bM) {
                    errorCode = -3001;
                } else if (domError instanceof C36131bN) {
                    errorCode = -3003;
                } else if (domError instanceof C36141bO) {
                    errorCode = -3004;
                } else if (domError instanceof C36151bP) {
                    errorCode = -3010;
                } else if (domError instanceof C36161bQ) {
                    errorCode = -3012;
                } else if (domError instanceof C36171bR) {
                    errorCode = -3014;
                } else if (domError instanceof C36181bS) {
                    errorCode = -3016;
                } else if (domError instanceof C36191bT) {
                    errorCode = -3017;
                } else if (domError instanceof C36201bU) {
                    errorCode = -3022;
                } else if (domError instanceof C36211bV) {
                    errorCode = -3023;
                } else if (domError instanceof C36221bW) {
                    errorCode = -3025;
                } else {
                    errorCode = -3028;
                }
                if (c44091oD.getDomError() instanceof C36171bR) {
                    C85761XlF.LJII(OAF.LIZIZ(activity), z, bool, errorCode);
                    C85761XlF.LJFF(bool, z);
                } else {
                    LIZJ(activity, z, bool, errorCode);
                }
                str = "An error occurred while creating a passkey, please check logs for additional details.";
            } else if (abstractC23600wG instanceof C35451aH) {
                errorCode = EnumC85764XlI.PASSKEY_REGISTRATION_CANCELLATION_EXCEPTION.getErrorCode();
                C85761XlF.LJII(OAF.LIZIZ(activity), z, bool, errorCode);
                C85761XlF.LJFF(bool, z);
                str = "The user intentionally canceled the operation and chose not to register the credential. Check logs for additional details.";
            } else if (abstractC23600wG instanceof C35471aJ) {
                errorCode = EnumC85764XlI.PASSKEY_REGISTRATION_NO_CREATE_OPTION_EXCEPTION.getErrorCode();
                LIZIZ(activity, z, bool, noShowCallback, errorCode);
                str = "no viable creation options were found for the given CreateCredentialRequest.";
            } else if (abstractC23600wG instanceof C35501aM) {
                errorCode = EnumC85764XlI.PASSKEY_REGISTRATION_UNSUPPORTED_EXCEPTION.getErrorCode();
                LIZIZ(activity, z, bool, noShowCallback, errorCode);
                str = "credential manager is unsupported, typically because the device has disabled it or did not ship with this feature enabled. A software update or a restart after enabling may fix this issue, but in certain cases, the device hardware may be the limiting factor.";
            } else if (abstractC23600wG instanceof C35461aI) {
                errorCode = EnumC85764XlI.PASSKEY_REGISTRATION_INTERRUPTED_EXCEPTION.getErrorCode();
                C85761XlF.LJII(OAF.LIZIZ(activity), z, bool, 0);
                C85761XlF.LJFF(bool, z);
                C85761XlF.LJ(OAF.LIZIZ(activity), z, bool, errorCode);
                if (!z) {
                    LJI(activity);
                } else {
                    LJFF(activity);
                }
                str = "The operation was interrupted, please retry the call. Check logs for additional details.";
            } else if (abstractC23600wG instanceof C35481aK) {
                errorCode = EnumC85764XlI.PASSKEY_REGISTRATION_PROVIDER_CONFIGURATION_EXCEPTION.getErrorCode();
                LIZIZ(activity, z, bool, noShowCallback, errorCode);
                str = "Your app is missing the provider configuration dependency. Check logs for additional details.";
            } else if (abstractC23600wG instanceof C35491aL) {
                errorCode = EnumC85764XlI.PASSKEY_REGISTRATION_UNKNOWN_EXCEPTION.getErrorCode();
                LIZIZ(activity, z, bool, noShowCallback, errorCode);
                str = "An unknown error occurred while creating passkey. Check logs for additional details.";
            } else if (abstractC23600wG instanceof C35511aN) {
                errorCode = EnumC85764XlI.PASSKEY_REGISTRATION_CUSTOM_EXCEPTION.getErrorCode();
                LIZJ(activity, z, bool, errorCode);
                str = "An unknown error occurred from a 3rd party SDK. Check logs for additional details.";
            } else {
                errorCode = EnumC85764XlI.PASSKEY_REGISTRATION_DEFAULT_EXCEPTION.getErrorCode();
                LIZIZ(activity, z, bool, noShowCallback, errorCode);
                str = "An unknown error occurred.";
            }
            LIZ(errorCode, str);
            LIZ(errorCode, abstractC23600wG.getMessage());
            return;
        }
        int LJJIIZ = C78688UuS.LJJIIZ(e);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Unknown error during Registration: ");
        LIZ3.append(e.getMessage());
        LIZ(LJJIIZ, X1D.LIZIZ(LIZ3));
    }
}
