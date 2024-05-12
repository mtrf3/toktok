package Y;

import X.AbstractC23670wN;
import X.C16880lQ;
import X.C221018lt;
import X.C26045AKb;
import X.C35521aO;
import X.C35531aP;
import X.C35541aQ;
import X.C35551aR;
import X.C35561aS;
import X.C35571aT;
import X.C35581aU;
import X.C36561c4;
import X.C43023GuZ;
import X.C69084R9k;
import X.C78688UuS;
import X.C84763XOl;
import X.C84923XUp;
import X.C85760XlE;
import X.C85761XlF;
import X.C85772XlQ;
import X.C85774XlS;
import X.EnumC84152X0y;
import X.EnumC85762XlG;
import X.OAF;
import X.X1D;
import X.XZG;
import android.app.Activity;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.DismissLoginCredentialManagerEvent;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.ss.android.ugc.awemepushlib.experiments.PushPermissionPopupGuideExp;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ARunnableS14S0210000_15 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int errorCode;
        String str;
        AuthorizeActivity activity = (AuthorizeActivity) this.l1;
        Throwable e = (Throwable) this.l0;
        boolean z = this.z2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(e, "e");
        String str2 = "";
        if (e instanceof AbstractC23670wN) {
            boolean z2 = false;
            if (e instanceof C35521aO) {
                errorCode = EnumC85762XlG.PASSKEY_LOGIN_CANCELLATION_EXCEPTION.getErrorCode();
                C85761XlF.LJI(0, OAF.LIZIZ(activity));
                DismissLoginCredentialManagerEvent dismissLoginCredentialManagerEvent = new DismissLoginCredentialManagerEvent();
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_from");
                if (LLJJIJIIJIL == null) {
                    LLJJIJIIJIL = "";
                }
                dismissLoginCredentialManagerEvent.LIZLLL(LLJJIJIIJIL, "enter_from");
                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_method");
                if (LLJJIJIIJIL2 == null) {
                    LLJJIJIIJIL2 = "";
                }
                dismissLoginCredentialManagerEvent.LIZLLL(LLJJIJIIJIL2, "enter_method");
                String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "login_panel_type");
                if (LLJJIJIIJIL3 != null) {
                    str2 = LLJJIJIIJIL3;
                }
                dismissLoginCredentialManagerEvent.LIZLLL(str2, "login_panel_type");
                dismissLoginCredentialManagerEvent.LJFF();
                str = "A user intentionally cancels an operation.";
            } else {
                if (e instanceof C35571aT) {
                    EnumC85762XlG enumC85762XlG = EnumC85762XlG.PASSKEY_LOGIN_CUSTOM_EXCEPTION;
                    errorCode = enumC85762XlG.getErrorCode();
                    C85761XlF.LJI(enumC85762XlG.getErrorCode(), OAF.LIZIZ(activity));
                    str = "Represents a custom error thrown during a get flow with CredentialManager.";
                } else if (e instanceof C35531aP) {
                    errorCode = EnumC85762XlG.PASSKEY_LOGIN_INTERRUPTED_EXCEPTION.getErrorCode();
                    str = "Interruption occurs that may warrant retrying or at least does not indicate a purposeful desire to close or tap away from credential manager.";
                } else if (e instanceof C35541aQ) {
                    EnumC85762XlG enumC85762XlG2 = EnumC85762XlG.PASSKEY_LOGIN_PROVIDER_CONFIGURATION_EXCEPTION;
                    errorCode = enumC85762XlG2.getErrorCode();
                    C85761XlF.LJI(enumC85762XlG2.getErrorCode(), OAF.LIZIZ(activity));
                    str = "Configurations are mismatched for the provider, typically indicating the provider dependency is missing in the manifest or some system service is not enabled.";
                } else if (e instanceof C35551aR) {
                    EnumC85762XlG enumC85762XlG3 = EnumC85762XlG.PASSKEY_LOGIN_UNKNOWN_EXCEPTION;
                    errorCode = enumC85762XlG3.getErrorCode();
                    C85761XlF.LJI(enumC85762XlG3.getErrorCode(), OAF.LIZIZ(activity));
                    str = "Get credential operation failed with no more detailed information.";
                } else if (e instanceof C35561aS) {
                    EnumC85762XlG enumC85762XlG4 = EnumC85762XlG.PASSKEY_LOGIN_UNSUPPORTED_EXCEPTION;
                    errorCode = enumC85762XlG4.getErrorCode();
                    C85761XlF.LJI(enumC85762XlG4.getErrorCode(), OAF.LIZIZ(activity));
                    str = "Credential manager is unsupported, typically because the device has disabled it or did not ship with this feature enabled.";
                } else if (e instanceof C36561c4) {
                    EnumC85762XlG enumC85762XlG5 = EnumC85762XlG.PASSKEY_LOGIN_PUBLIC_KEY_EXCEPTION;
                    errorCode = enumC85762XlG5.getErrorCode();
                    int errorCode2 = enumC85762XlG5.getErrorCode();
                    String message = e.getMessage();
                    str = "Unique exceptions thrown specific only to PublicKeyCredentials.";
                    if (message == null) {
                        message = "Unique exceptions thrown specific only to PublicKeyCredentials.";
                    }
                    C85761XlF.LJI(0, OAF.LIZIZ(activity));
                    C85761XlF.LIZIZ(activity);
                    C85761XlF.LIZJ(activity, "passkey");
                    C85761XlF.LIZ(activity, "passkey", String.valueOf(errorCode2), message);
                } else if (e instanceof C35581aU) {
                    EnumC85762XlG enumC85762XlG6 = EnumC85762XlG.PASSKEY_LOGIN_NO_CREDENTIAL_EXCEPTION;
                    errorCode = enumC85762XlG6.getErrorCode();
                    C85761XlF.LJI(enumC85762XlG6.getErrorCode(), OAF.LIZIZ(activity));
                    str = "no viable credential is available for the the user.";
                } else {
                    EnumC85762XlG enumC85762XlG7 = EnumC85762XlG.PASSKEY_LOGIN_DEFAULT_EXCEPTION;
                    errorCode = enumC85762XlG7.getErrorCode();
                    C85761XlF.LJI(enumC85762XlG7.getErrorCode(), OAF.LIZIZ(activity));
                    str = "default exception";
                }
                z2 = true;
            }
            C85760XlE.LIZ(errorCode, e.getMessage());
            C85760XlE.LIZ(errorCode, str);
            if (z2) {
                C85760XlE.LJ(activity);
            }
        } else if (e instanceof C85774XlS) {
            String valueOf = String.valueOf(EnumC85762XlG.PASSKEY_LOGIN_TOKEN_PARSING_EXCEPTION.getErrorCode());
            String message2 = e.getMessage();
            if (message2 != null) {
                str2 = message2;
            }
            C85761XlF.LIZ(activity, "google_onetap", valueOf, str2);
            C85760XlE.LJ(activity);
        } else if (e instanceof C69084R9k) {
            C69084R9k c69084R9k = (C69084R9k) e;
            C85760XlE.LIZ(c69084R9k.getErrorCode(), c69084R9k.getMessage());
            if (!z) {
                C85761XlF.LJI(c69084R9k.getErrorCode(), OAF.LIZIZ(activity));
            } else {
                String valueOf2 = String.valueOf(c69084R9k.getErrorCode());
                String message3 = c69084R9k.getMessage();
                if (message3 != null) {
                    str2 = message3;
                }
                C85761XlF.LIZ(activity, "passkey", valueOf2, str2);
                if (c69084R9k.getErrorCode() == 1011) {
                    C26045AKb c26045AKb = new C26045AKb(activity);
                    c26045AKb.LJIIIZ(c69084R9k.getMessage());
                    c26045AKb.LIZ(true);
                    c26045AKb.LJIIJ();
                } else {
                    C85760XlE.LJ(activity);
                }
            }
        } else if (e instanceof C85772XlQ) {
            C85772XlQ c85772XlQ = (C85772XlQ) e;
            C85760XlE.LJ(activity);
            int errorCode3 = c85772XlQ.getErrorCode();
            if (errorCode3 == EnumC85762XlG.PASSKEY_LOGIN_MISSING_RESPONSE_JSON.getErrorCode()) {
                String valueOf3 = String.valueOf(c85772XlQ.getErrorCode());
                String message4 = c85772XlQ.getMessage();
                if (message4 != null) {
                    str2 = message4;
                }
                C85761XlF.LIZ(activity, "passkey", valueOf3, str2);
                C85760XlE.LIZ(c85772XlQ.getErrorCode(), "missing response json object");
            } else if (errorCode3 == EnumC85762XlG.PASSKEY_LOGIN_UNEXPECTED_CREDENTIAL_TYPE.getErrorCode()) {
                String valueOf4 = String.valueOf(c85772XlQ.getErrorCode());
                String message5 = c85772XlQ.getMessage();
                if (message5 != null) {
                    str2 = message5;
                }
                C85761XlF.LIZ(activity, "passkey", valueOf4, str2);
                C85760XlE.LIZ(c85772XlQ.getErrorCode(), "Unknown Credential type");
            } else if (errorCode3 == EnumC85762XlG.PASSKEY_LOGIN_NONCE_VERIFICATION_FAIL.getErrorCode()) {
                String valueOf5 = String.valueOf(c85772XlQ.getErrorCode());
                String message6 = c85772XlQ.getMessage();
                if (message6 != null) {
                    str2 = message6;
                }
                C85761XlF.LIZ(activity, "google_onetap", valueOf5, str2);
                C85760XlE.LIZ(c85772XlQ.getErrorCode(), "nonce verification failed");
            } else if (errorCode3 == EnumC85762XlG.PASSKEY_LOGIN_ILLEGAL_ARGUMENT.getErrorCode()) {
                C85761XlF.LJI(c85772XlQ.getErrorCode(), OAF.LIZIZ(activity));
                C85760XlE.LIZ(c85772XlQ.getErrorCode(), "illegal argument");
            } else if (errorCode3 == EnumC85762XlG.PASSKEY_LOGIN_NULL_POINTER.getErrorCode()) {
                C85761XlF.LJI(c85772XlQ.getErrorCode(), OAF.LIZIZ(activity));
                C85760XlE.LIZ(c85772XlQ.getErrorCode(), "null json");
            } else {
                String valueOf6 = String.valueOf(c85772XlQ.getErrorCode());
                String message7 = c85772XlQ.getMessage();
                if (message7 != null) {
                    str2 = message7;
                }
                C85761XlF.LIZ(activity, "passkey", valueOf6, str2);
                int errorCode4 = c85772XlQ.getErrorCode();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unknown PasskeyTikTokCustomException: ");
                LIZ.append(c85772XlQ.getMessage());
                C85760XlE.LIZ(errorCode4, X1D.LIZIZ(LIZ));
            }
        } else {
            int LJJIIZ = C78688UuS.LJJIIZ(e);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Unknown Error Type: ");
            LIZ2.append(e.getMessage());
            C85760XlE.LIZ(LJJIIZ, X1D.LIZIZ(LIZ2));
        }
        ((AuthorizeActivity) this.l1).finish();
    }

    public final void LIZ$1() {
        int i;
        VerticalMusicView verticalMusicView = (VerticalMusicView) this.l0;
        verticalMusicView.LLJ.LJI = Boolean.TRUE;
        verticalMusicView.LJJJIL(false, true);
        C43023GuZ c43023GuZ = new C43023GuZ(this.z2, 0, 0, null, 0L, (List) this.l1, false, 110);
        VerticalMusicView verticalMusicView2 = (VerticalMusicView) this.l0;
        XZG xzg = verticalMusicView2.LLJ;
        boolean z = verticalMusicView2.LLJLL;
        if (z) {
            xzg.LIZ.clear();
        }
        ArrayList<MusicModel> arrayList = xzg.LIZ;
        List<? extends MusicModel> list = c43023GuZ.LIZ;
        if (list != null) {
            arrayList.addAll(list);
        }
        xzg.LIZJ = c43023GuZ.LIZLLL;
        xzg.LIZLLL = c43023GuZ.LJ;
        List<? extends MusicModel> list2 = c43023GuZ.LIZ;
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        xzg.LJ = i;
        verticalMusicView2.LJJJI(z);
        ((VerticalMusicView) this.l0).LLJLL = false;
    }

    public final void LIZ$2() {
        Activity LJIIIIZZ;
        String str;
        C221018lt.LIZ("PushPermissionPopup", "showPushPermissionMask.run");
        if (this.z2) {
            LJIIIIZZ = (Activity) this.l0;
        } else {
            LJIIIIZZ = C84763XOl.LJIIIIZZ();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showExplanationBeforePermission(useCtx: ");
        LIZ.append(this.z2);
        LIZ.append(", ctx: ");
        Activity activity = (Activity) this.l0;
        String str2 = null;
        if (activity != null) {
            str = activity.getLocalClassName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", current: ");
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ2 != null) {
            str2 = LJIIIIZZ2.getLocalClassName();
        }
        LIZ.append(str2);
        LIZ.append(')');
        C221018lt.LIZ("PushPermissionPopup", X1D.LIZIZ(LIZ));
        if (LJIIIIZZ != null) {
            ((PushPermissionPopupManager) this.l1).LJIIIZ(LJIIIIZZ, !PushPermissionPopupGuideExp.INSTANCE.withGuideAndMask());
        }
    }

    public static final void run$0(ARunnableS14S0210000_15 aRunnableS14S0210000_15) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS14S0210000_15.l1).enableMulticamZoom((TECameraCapture) aRunnableS14S0210000_15.l0, aRunnableS14S0210000_15.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS14S0210000_15 aRunnableS14S0210000_15) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS14S0210000_15.l1).setAutoExposureLock((TECameraCapture) aRunnableS14S0210000_15.l0, aRunnableS14S0210000_15.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS14S0210000_15 aRunnableS14S0210000_15) {
        boolean LIZ;
        try {
            aRunnableS14S0210000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS14S0210000_15 aRunnableS14S0210000_15) {
        boolean LIZ;
        try {
            aRunnableS14S0210000_15.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS14S0210000_15 aRunnableS14S0210000_15) {
        boolean LIZ;
        try {
            aRunnableS14S0210000_15.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS14S0210000_15 aRunnableS14S0210000_15) {
        C84923XUp c84923XUp = (C84923XUp) aRunnableS14S0210000_15.l0;
        c84923XUp.LJFF.LJ.LLILZ((MusicModel) aRunnableS14S0210000_15.l1, aRunnableS14S0210000_15.z2);
    }

    public ARunnableS14S0210000_15(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
        this.z2 = z;
    }

    public ARunnableS14S0210000_15(AuthorizeActivity authorizeActivity, Throwable th, boolean z, boolean z2, int i) {
        this.$t = i;
        this.l1 = authorizeActivity;
        this.l0 = th;
        this.z2 = z;
    }
}
