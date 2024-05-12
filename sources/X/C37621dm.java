package X;

import Y.IDRunnableS85S0100000;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.google.android.play.core.appupdate.h;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.1dm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37621dm implements InterfaceC18170nV {
    public final String LIZ;
    public final BFR LIZIZ;
    public final java.util.Map<String, Object> LIZJ;

    @Override // X.InterfaceC18170nV
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC18170nV
    public final void onSuccess() {
        ((ExecutorService) AnonymousClass124.LIZ.getValue()).submit(new IDRunnableS85S0100000(this, 115));
    }

    @Override // X.InterfaceC18170nV
    public final void LIZ(String error) {
        h ce0;
        o.LJIIIZ(error, "error");
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest() && (ce0 = ((IDebugService) CN1.LIZ(IDebugService.class)).ce0()) != null) {
            BFR bfr = this.LIZIZ;
            String str = bfr.LJLIL;
            String str2 = this.LIZ;
            String str3 = bfr.LJLJI;
            String str4 = bfr.LJLILLLLZI;
            C43588H8u.LIZLLL(str, "triggerType", str2, "businessName", str3, "rulePkgName", str4, "ruleName");
            InterfaceC31193CMb interfaceC31193CMb = (InterfaceC31193CMb) ce0.LIZ;
            if (interfaceC31193CMb != null) {
                ((CMZ) interfaceC31193CMb).LIZ(str, str2, str3, str4, error, false);
            }
        }
        C17130lp.LIZ();
        AnonymousClass126.LIZ(false, this.LIZ, this.LIZIZ, C17130lp.LIZ(), error);
    }

    public C37621dm(String triggerBusinessName, BFR bfr, java.util.Map<String, ? extends Object> abParams) {
        o.LJIIIZ(triggerBusinessName, "triggerBusinessName");
        o.LJIIIZ(abParams, "abParams");
        this.LIZ = triggerBusinessName;
        this.LIZIZ = bfr;
        this.LIZJ = abParams;
    }
}
