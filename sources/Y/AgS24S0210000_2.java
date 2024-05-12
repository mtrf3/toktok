package Y;

import X.C10I;
import X.C10K;
import X.C147295qH;
import X.C36747EbX;
import X.C41028G8i;
import X.C42278GiY;
import X.C63C;
import X.C76800UCe;
import X.C78983UzD;
import X.H78;
import X.InterfaceC147865rC;
import X.ProgressDialogC43239Gy3;
import X.X1D;
import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AgS24S0210000_2 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS24S0210000_2 agS24S0210000_2, C10K c10k) {
        try {
            if (agS24S0210000_2.z2) {
                NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) agS24S0210000_2.l0;
                nowsEditRootScene.getClass();
                if (C41028G8i.LIZ()) {
                    C42278GiY c42278GiY = nowsEditRootScene.LLFZ;
                    if (c42278GiY != null) {
                        c42278GiY.dismiss();
                    }
                    nowsEditRootScene.LLFZ = null;
                } else {
                    ProgressDialogC43239Gy3 progressDialogC43239Gy3 = nowsEditRootScene.LLI;
                    if (progressDialogC43239Gy3 != null && progressDialogC43239Gy3.isShowing()) {
                        ProgressDialogC43239Gy3 progressDialogC43239Gy32 = nowsEditRootScene.LLI;
                        if (progressDialogC43239Gy32 != null) {
                            progressDialogC43239Gy32.dismiss();
                        }
                        nowsEditRootScene.LLI = null;
                    }
                }
            }
            C63C LLLI = ((NowsEditRootScene) agS24S0210000_2.l0).LLLI();
            if (LLLI != null) {
                LLLI.LJIJJ(false);
            }
            Runnable runnable = (Runnable) agS24S0210000_2.l1;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Crash happens in edit -> publish: ");
            String LIZIZ = C36747EbX.LIZIZ(th);
            o.LJIIIIZZ(LIZIZ, "getStackTraceAsString(this)");
            LIZ.append(LIZIZ);
            H78.LIZJ(X1D.LIZIZ(LIZ));
            C78983UzD.LJIJ(th, "edit -> publish");
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS24S0210000_2 agS24S0210000_2, C10K c10k) {
        C147295qH c147295qH;
        VideoPublishEditModel videoPublishEditModel;
        try {
            if (agS24S0210000_2.z2) {
                ((C147295qH) agS24S0210000_2.l0).LLLIIIL(1107);
            }
            ((C147295qH) agS24S0210000_2.l0).LLJJIII().LJIJJ(false);
            c147295qH = (C147295qH) agS24S0210000_2.l0;
            videoPublishEditModel = c147295qH.LJLLJ;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Crash happens in edit -> publish: ");
            String LIZIZ = C36747EbX.LIZIZ(th);
            o.LJIIIIZZ(LIZIZ, "getStackTraceAsString(this)");
            LIZ.append(LIZIZ);
            H78.LIZJ(X1D.LIZIZ(LIZ));
            C78983UzD.LJIJ(th, "edit -> publish");
        }
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.creativeModel.postPageModel.isEnterFromEPDirectly) {
                InterfaceC147865rC interfaceC147865rC = c147295qH.LJZI;
                if (interfaceC147865rC != null) {
                    interfaceC147865rC.Dq();
                } else {
                    o.LJIJI("editStickerApi");
                    throw null;
                }
            }
            Runnable runnable = (Runnable) agS24S0210000_2.l1;
            if (runnable != null) {
                runnable.run();
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public AgS24S0210000_2(boolean z, Object obj, Object obj2, int i) {
        this.$t = i;
        this.z2 = z;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
