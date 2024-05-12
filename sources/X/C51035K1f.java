package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;

/* renamed from: X.K1f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51035K1f extends AbstractC50421Jqb<AbstractC51036K1g, C51031K1b<AbstractC51036K1g>> {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return LiveCenterDelayLoadSetting.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C51035K1f(AbstractC51036K1g abstractC51036K1g) {
        this.mModel = abstractC51036K1g;
        this.mPresenter = new C51031K1b();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final boolean init(Fragment fragment) {
        if (this.mModel != 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        this.mPresenter.LJIILL(m89.getAid());
    }
}
