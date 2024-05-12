package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.portal.PortalAdLabelEnableSetting;
import fjb.a;
import java.util.concurrent.CountDownLatch;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$notifyPortal$4$3", f = "PortalLeaf.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BSd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28803BSd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC<View> LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ CountDownLatch LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28803BSd(C68322mC<View> c68322mC, C34K c34k, CountDownLatch countDownLatch, InterfaceC67352kd<? super C28803BSd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c34k;
        this.LJLJI = countDownLatch;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28803BSd(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (PortalAdLabelEnableSetting.INSTANCE.getValue()) {
            C15490jB.LJIIJJI((C29701Eo) this.LJLIL.element, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_revenue_normal_1"), "liveroom_portal_entrance_pushinto_ad_label.zip", false, new C28804BSe(this.LJLILLLLZI, this.LJLJI));
        } else {
            C15490jB.LJIIJJI((C29701Eo) this.LJLIL.element, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_revenue_normal_1"), "liveroom_portal_entrance_pushinto.zip", false, new C28805BSf(this.LJLILLLLZI, this.LJLJI));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
