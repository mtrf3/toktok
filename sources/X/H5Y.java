package X;

import Y.ACallableS110S0100000_7;
import com.bytedance.ies.nle.editor_jni.INLEHTTPClientDelegateWrapper;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEMediaRemoteJniJNI;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H5Y extends AbstractC43455H3r {
    public C67996QmO LJFF;
    public C43403H1r LJI;
    public H5Z LJII;
    public C76940UHo LJIIIIZZ;

    static {
        C43490H5a c43490H5a = C43490H5a.LIZJ;
        synchronized (c43490H5a) {
            if (!C43490H5a.LIZ) {
                com.bytedance.ies.nleeditor.NLE.INSTANCE.getLibraryLoader().LIZ(C47261Igj.LJII("NLEMediaRemoteJni"));
                INLEHTTPClientDelegateWrapper iNLEHTTPClientDelegateWrapper = C43490H5a.LIZIZ;
                if (iNLEHTTPClientDelegateWrapper != null) {
                    NLEMediaRemoteJniJNI.NLENetworkClientDelegateWrapper_setHttpClientWrapper(INLEHTTPClientDelegateWrapper.getCPtr(iNLEHTTPClientDelegateWrapper), iNLEHTTPClientDelegateWrapper);
                }
                C43490H5a.LIZ = true;
            }
        }
        c43490H5a.LIZ(new C36627EZb());
    }

    public final void LJIIJJI() {
        InterfaceC153045zY interfaceC153045zY;
        H5Z h5z = this.LJII;
        if (h5z != null && (interfaceC153045zY = h5z.LIZLLL) != null) {
            C10K.LIZJ(new ACallableS110S0100000_7(interfaceC153045zY, 54));
        }
        C76940UHo c76940UHo = this.LJIIIIZZ;
        if (c76940UHo != null) {
            c76940UHo.LIZ();
        }
        this.LJIIIIZZ = null;
        C163156al.LIZ = null;
    }

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.CLOUD_MERGE;
    }

    public final void LJIIL(AbstractC42364Gjw abstractC42364Gjw) {
        C67996QmO c67996QmO = this.LJFF;
        if (c67996QmO != null) {
            c67996QmO.LJ(abstractC42364Gjw, false);
            LJIIJJI();
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZ(AbstractC42983Gtv cause, C87623YaB c87623YaB) {
        C43491H5b c43491H5b;
        o.LJIIIZ(cause, "cause");
        super.LIZ(cause, c87623YaB);
        H5Z h5z = this.LJII;
        if (h5z != null && (c43491H5b = h5z.LJ) != null) {
            NLEError.swigToEnum(NLEMediaRemoteJniJNI.NLEMediaCloudEdit_cancelExport(c43491H5b.LIZ, c43491H5b));
        }
        LJIIJJI();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x018c, code lost:
    
        r4.invoke(new X.C42366Gjy(-4, 14));
     */
    @Override // X.AbstractC43455H3r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.ERR r24, X.C67996QmO r25) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5Y.LJI(X.ERR, X.QmO):void");
    }
}
