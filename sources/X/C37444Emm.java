package X;

import com.bytedance.pia.core.PiaManifest;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Emm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37444Emm implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ AtomicBoolean LJLIL;
    public final /* synthetic */ C37499Enf LJLILLLLZI;
    public final /* synthetic */ PiaManifest LJLJI;
    public final /* synthetic */ C37385Elp LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJL;

    public final void LIZ(String error) {
        o.LJIIJ(error, "error");
        if (this.LJLIL.compareAndSet(false, true)) {
            this.LJLILLLLZI.LJII.LIZIZ("nsr_worker", 1009, error);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[NSR] Run nsr failed (URL: ");
            LIZ.append(this.LJLJI.LIZ);
            LIZ.append(", Reason: ");
            LIZ.append(error);
            LIZ.append(')');
            C37238EjS.LJI(6, X1D.LIZIZ(LIZ), null);
            C37440Emi c37440Emi = C37440Emi.LIZIZ;
            C37499Enf c37499Enf = this.LJLILLLLZI;
            String uri = this.LJLJI.LIZ.toString();
            o.LJFF(uri, "manifest.uri.toString()");
            C37385Elp c37385Elp = this.LJLJJI;
            c37440Emi.getClass();
            C37440Emi.LIZIZ(c37499Enf, uri, false, c37385Elp);
            InterfaceC88472Yns interfaceC88472Yns = this.LJLJJL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(error);
            }
        }
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(String str) {
        LIZ(str);
        return C76800UCe.LIZ;
    }

    public C37444Emm(AtomicBoolean atomicBoolean, C37499Enf c37499Enf, PiaManifest piaManifest, C37385Elp c37385Elp, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = atomicBoolean;
        this.LJLILLLLZI = c37499Enf;
        this.LJLJI = piaManifest;
        this.LJLJJI = c37385Elp;
        this.LJLJJL = interfaceC88472Yns;
    }
}
