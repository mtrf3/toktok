package djb;

import X.ActivityC45651qj;
import X.C138075bP;
import X.C138115bT;
import X.C138355br;
import X.C144115l9;
import X.C144245lM;
import X.C144265lO;
import X.C1DH;
import X.C43045Guv;
import X.C78915Uy7;
import X.H78;
import X.InterfaceC48698J9i;
import X.MB6;
import X.MBA;
import X.X1D;
import android.util.Log;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public class IDaS67S0100000_2 extends MB6 implements CoroutineExceptionHandler {
    public final int $t;
    public Object l0;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        switch (this.$t) {
            case 0:
                handleException$0(this, mba, th);
                return;
            case 1:
                handleException$1(this, mba, th);
                return;
            case 2:
                handleException$2(this, mba, th);
                return;
            case 3:
                handleException$3(this, mba, th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS67S0100000_2(InterfaceC48698J9i interfaceC48698J9i, Object obj, int i) {
        super(interfaceC48698J9i);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void handleException$0(IDaS67S0100000_2 iDaS67S0100000_2, MBA mba, Throwable th) {
        C43045Guv.LIZLLL(new AqS152S0100000_2((FTCVideoPublishFragment) iDaS67S0100000_2.l0, 77), 0L);
        H78.LIZLLL("FTCVideoPublishFragment", th);
    }

    public static final void handleException$1(IDaS67S0100000_2 iDaS67S0100000_2, MBA mba, Throwable th) {
        String str = "";
        if (th instanceof C144115l9) {
            C144265lO c144265lO = ((C144245lM) iDaS67S0100000_2.l0).LJZI;
            if (c144265lO != null) {
                int errorCode = ((C144115l9) th).getErrorCode();
                String message = th.getMessage();
                if (message != null) {
                    str = message;
                }
                c144265lO.LIZJ(errorCode, str);
            }
        } else {
            C144265lO c144265lO2 = ((C144245lM) iDaS67S0100000_2.l0).LJZI;
            if (c144265lO2 != null) {
                String message2 = th.getMessage();
                if (message2 != null) {
                    str = message2;
                }
                c144265lO2.LIZJ(-1, str);
            }
        }
        C144245lM c144245lM = (C144245lM) iDaS67S0100000_2.l0;
        c144245lM.LJZI = null;
        c144245lM.LLFFF().dismiss();
        ActivityC45651qj activity = ((C144245lM) iDaS67S0100000_2.l0).getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        String string = ((C144245lM) iDaS67S0100000_2.l0).getActivity().getString(R.string.tlp);
        o.LJIIIIZZ(string, "activity.getString(R.str…Page_creationError_toast)");
        creativeToastBuilder.message(string);
        C78915Uy7.LJJIIZI(activity, 1033, creativeToastBuilder);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("video2sticker compile error: ");
        LIZ.append(Log.getStackTraceString(th));
        H78.LIZJ(X1D.LIZIZ(LIZ));
    }

    public static final void handleException$2(IDaS67S0100000_2 iDaS67S0100000_2, MBA mba, Throwable th) {
        C138115bT c138115bT = ((C138075bP) iDaS67S0100000_2.l0).LLILLL;
        String message = th.getMessage();
        if (message == null) {
            message = "unknow error";
        }
        c138115bT.LIZJ(message);
        ((C138075bP) iDaS67S0100000_2.l0).LLILLL.LIZIZ(C1DH.LJJJIL(new C138355br().LIZ(900)));
        C138075bP.LLLLZLLIL((C138075bP) iDaS67S0100000_2.l0, null, 1, null);
    }

    public static final void handleException$3(IDaS67S0100000_2 iDaS67S0100000_2, MBA mba, Throwable th) {
        ((TTSFragment) iDaS67S0100000_2.l0).LLIIL = true;
    }
}
