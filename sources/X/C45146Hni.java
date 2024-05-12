package X;

import Y.AfS46S0300000_7;
import Y.AfS59S0100000_7;
import Y.IDaS218S0100000_7;
import Y.IDhS11S1100000_7;
import Y.IDuS319S0100000_7;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.ITosDelegate;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Hni, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45146Hni extends ITosDelegate {
    public String LIZ;
    public boolean LIZIZ;
    public InterfaceC45141Hnd LIZJ;

    public C45146Hni() {
        LIZ();
    }

    public final void LIZ() {
        if (C45093Hmr.LIZ() || this.LIZIZ) {
            return;
        }
        String str = this.LIZ;
        if (str != null && C78685UuP.LJJJZ(str)) {
            return;
        }
        this.LIZIZ = true;
        AbstractC73672Svk.LJIIJ(new IDuS319S0100000_7(this, 3)).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new AfS59S0100000_7(this, 41), C45147Hnj.LJLIL);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.3kP] */
    @Override // com.bytedance.ies.smartmovie.jni.ITosDelegate
    public final void getTosUrl(String str, CommonRequestCallback commonRequestCallback) {
        if (!C48203Ivv.LJ(C5L7.LIZ())) {
            if (commonRequestCallback != null) {
                commonRequestCallback.onFailure(SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue(), "Local Network NoAvailable", new UnorderedMapStrStr());
            }
            InterfaceC45141Hnd interfaceC45141Hnd = this.LIZJ;
            if (interfaceC45141Hnd != null) {
                interfaceC45141Hnd.LJFF(SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue(), "Local Network NoAvailable", str, false);
            }
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutTosDelegate getTosUrl: no net");
            return;
        }
        InterfaceC45141Hnd interfaceC45141Hnd2 = this.LIZJ;
        if (interfaceC45141Hnd2 != null) {
            interfaceC45141Hnd2.LIZLLL();
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = AbstractC73672Svk.LJIIJ(new IDuS319S0100000_7(this, 3)).LJJIII(new IDhS11S1100000_7(this, str, 1), false).LJJLIIIJJI(30L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJIILLIIL(new IDaS218S0100000_7(this, 2)).LJJJLIIL(new AfS46S0300000_7(c68322mC, commonRequestCallback, this, 5), new C45145Hnh(c68322mC, commonRequestCallback, this, str));
    }
}
