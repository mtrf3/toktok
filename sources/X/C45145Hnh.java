package X;

import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;

/* renamed from: X.Hnh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45145Hnh<T> implements InterfaceC64592gB {
    public final /* synthetic */ C68322mC<InterfaceC92693kP> LJLIL;
    public final /* synthetic */ CommonRequestCallback LJLILLLLZI;
    public final /* synthetic */ C45146Hni LJLJI;
    public final /* synthetic */ String LJLJJI;

    public C45145Hnh(C68322mC<InterfaceC92693kP> c68322mC, CommonRequestCallback commonRequestCallback, C45146Hni c45146Hni, String str) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = commonRequestCallback;
        this.LJLJI = c45146Hni;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        String message;
        String str2;
        Throwable th = (Throwable) obj;
        InterfaceC92693kP interfaceC92693kP = this.LJLIL.element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTosDelegate getTosUrl errorCode=UPLOAD_TOS_FAILURE-2, msg=");
        String str3 = "";
        if (th == null || (str = th.getMessage()) == null) {
            str = "";
        }
        C45243HpH.LIZIZ(LIZ, str, LIZ);
        CommonRequestCallback commonRequestCallback = this.LJLILLLLZI;
        if (commonRequestCallback != null) {
            int swigValue = SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue();
            if (th == null || (str2 = th.getMessage()) == null) {
                str2 = "";
            }
            commonRequestCallback.onFailure(swigValue, str2, new UnorderedMapStrStr());
        }
        InterfaceC45141Hnd interfaceC45141Hnd = this.LJLJI.LIZJ;
        if (interfaceC45141Hnd != null) {
            int swigValue2 = SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue();
            if (th != null && (message = th.getMessage()) != null) {
                str3 = message;
            }
            interfaceC45141Hnd.LJFF(swigValue2, str3, this.LJLJJI, false);
        }
    }
}
