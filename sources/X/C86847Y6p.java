package X;

import Y.ACallableS92S0200000_15;
import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.services.audio.IVopPermissionService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.gamora.recorder.vopclone.VopPermissionService;
import kotlin.jvm.internal.o;

/* renamed from: X.Y6p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86847Y6p implements InterfaceC61107NyZ {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C86848Y6q LIZIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC86851Y6t> LIZJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        if (results.length == 0) {
            return;
        }
        C164906da c164906da = results[0];
        EnumC61598OFm enumC61598OFm = c164906da.LIZIZ;
        EnumC61598OFm enumC61598OFm2 = EnumC61598OFm.DENIED_PERMANENT;
        String str = null;
        if (enumC61598OFm == enumC61598OFm2 && this.LIZ) {
            IVopPermissionService LIZ = VopPermissionService.LIZ();
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            o.LJII(validTopActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            LIZ.showRequestAudioSettingDialog((ActivityC45651qj) validTopActivity);
            InterfaceC38263Ezz interfaceC38263Ezz = this.LIZIZ.LJLIL;
            if (interfaceC38263Ezz != null) {
                str = interfaceC38263Ezz.LIZIZ();
            }
            InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
            interfaceC86851Y6t.setVopCode(-3);
            this.LIZJ.onFailure(0, "client error", interfaceC86851Y6t);
            return;
        }
        if (enumC61598OFm == enumC61598OFm2 || enumC61598OFm == EnumC61598OFm.THIS_OPERATION_NOT_PERMITTED) {
            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LIZIZ.LJLIL;
            if (interfaceC38263Ezz2 != null) {
                str = interfaceC38263Ezz2.LIZIZ();
            }
            InterfaceC86851Y6t interfaceC86851Y6t2 = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
            interfaceC86851Y6t2.setVopCode(-3);
            this.LIZJ.onFailure(0, "client error", interfaceC86851Y6t2);
            return;
        }
        if (!c164906da.LIZ()) {
            return;
        }
        C10K.LIZJ(new ACallableS92S0200000_15(this.LIZJ, this.LIZIZ, 23));
    }

    public C86847Y6p(boolean z, C86848Y6q c86848Y6q, C37356ElM c37356ElM) {
        this.LIZ = z;
        this.LIZIZ = c86848Y6q;
        this.LIZJ = c37356ElM;
    }
}
