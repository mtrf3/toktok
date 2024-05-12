package X;

import com.bytedance.ies.bullet.service.popup.BulletPopUpFragment;
import com.ss.android.ugc.aweme.bullet.BulletEventObserver;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.Nns, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60444Nns extends C60446Nnu {
    public BulletEventObserver LIZ;

    @Override // X.C60446Nnu, X.InterfaceC60443Nnr
    public final void LIZ(InterfaceC60447Nnv component) {
        o.LJIIIZ(component, "component");
        if ((component instanceof BulletPopUpFragment) && this.LIZ != null) {
            EventBus.LIZJ().LJIJ(this.LIZ);
            this.LIZ = null;
        }
    }

    @Override // X.C60446Nnu, X.InterfaceC60443Nnr
    public final void LIZLLL(BulletPopUpFragment component) {
        o.LJIIIZ(component, "component");
        this.LIZ = new BulletEventObserver(component.LJLIL, null);
        EventBus.LIZJ().LJIILJJIL(this.LIZ);
    }
}
