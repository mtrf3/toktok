package X;

import com.bytedance.pia.core.PiaManifest;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Eml, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37443Eml implements InterfaceC88471Ynr<String, Boolean, C76800UCe> {
    public final /* synthetic */ AtomicBoolean LJLIL;
    public final /* synthetic */ PiaManifest LJLILLLLZI;
    public final /* synthetic */ C37499Enf LJLJI;
    public final /* synthetic */ C37385Elp LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr LJLJJL;

    public final void LIZ(String html, boolean z) {
        o.LJIIJ(html, "html");
        if (this.LJLIL.compareAndSet(false, true)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[NSR] Run nsr success. (URL: ");
            LIZ.append(this.LJLILLLLZI.LIZ);
            LIZ.append(')');
            C37238EjS.LJI(6, X1D.LIZIZ(LIZ), null);
            C37440Emi c37440Emi = C37440Emi.LIZIZ;
            C37499Enf c37499Enf = this.LJLJI;
            String uri = this.LJLILLLLZI.LIZ.toString();
            o.LJFF(uri, "manifest.uri.toString()");
            C37385Elp c37385Elp = this.LJLJJI;
            c37440Emi.getClass();
            C37440Emi.LIZIZ(c37499Enf, uri, true, c37385Elp);
            InterfaceC88471Ynr interfaceC88471Ynr = this.LJLJJL;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(html, Boolean.valueOf(z));
            }
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final /* bridge */ /* synthetic */ C76800UCe invoke(String str, Boolean bool) {
        LIZ(str, bool.booleanValue());
        return C76800UCe.LIZ;
    }

    public C37443Eml(AtomicBoolean atomicBoolean, PiaManifest piaManifest, C37499Enf c37499Enf, C37385Elp c37385Elp, InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LJLIL = atomicBoolean;
        this.LJLILLLLZI = piaManifest;
        this.LJLJI = c37499Enf;
        this.LJLJJI = c37385Elp;
        this.LJLJJL = interfaceC88471Ynr;
    }
}
