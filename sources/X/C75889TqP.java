package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import kotlin.jvm.internal.o;

/* renamed from: X.TqP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75889TqP implements InterfaceC75414Tik<PermitResult> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C75878TqE LJLILLLLZI;
    public final /* synthetic */ C75993Ts5 LJLJI;
    public final /* synthetic */ MultiHostMultiAdapterImpl LJLJJI;
    public final /* synthetic */ InterfaceC75414Tik<PermitResult> LJLJJL;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(PermitResult permitResult) {
        PermitResult value = permitResult;
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApply, onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (this.LJLIL) {
            this.LJLILLLLZI.LJIJI(this.LJLJI.LIZIZ, value.logId);
        } else {
            C75878TqE c75878TqE = this.LJLILLLLZI;
            C75993Ts5 c75993Ts5 = this.LJLJI;
            c75878TqE.LJJJ(c75993Ts5.LJ, c75993Ts5.LIZIZ, value.logId);
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJJI.LJLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJJLIIIJLLLLLLLZ = this.LJLJI.LIZIZ;
            linkCrossRoomDataHolder.LJJLIIJ = C44432HcC.LJI();
        }
        InterfaceC75414Tik<PermitResult> interfaceC75414Tik = this.LJLJJL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApply, onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (this.LJLIL) {
            C75878TqE c75878TqE = this.LJLILLLLZI;
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(this.LJLJI.LIZIZ), true);
            c75878TqE.LJIIJ(th);
            c75878TqE.LJIIJJI();
            c75878TqE.LJIILLIIL("accept_apply_failed");
        } else {
            C75878TqE c75878TqE2 = this.LJLILLLLZI;
            C75993Ts5 c75993Ts5 = this.LJLJI;
            c75878TqE2.LJJIJLIJ(c75993Ts5.LJ, c75993Ts5.LIZIZ, th);
        }
        InterfaceC75414Tik<PermitResult> interfaceC75414Tik = this.LJLJJL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }

    public C75889TqP(boolean z, C75878TqE c75878TqE, C75993Ts5 c75993Ts5, MultiHostMultiAdapterImpl multiHostMultiAdapterImpl, InterfaceC75414Tik<PermitResult> interfaceC75414Tik) {
        this.LJLIL = z;
        this.LJLILLLLZI = c75878TqE;
        this.LJLJI = c75993Ts5;
        this.LJLJJI = multiHostMultiAdapterImpl;
        this.LJLJJL = interfaceC75414Tik;
    }
}
