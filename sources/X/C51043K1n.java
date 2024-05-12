package X;

import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.K1n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51043K1n implements InterfaceC50422Jqc {
    @Override // X.InterfaceC50422Jqc
    public final InterfaceC51679KPz LIZ(final M89 param, final AbstractC51036K1g<?, ?> abstractC51036K1g, JediViewModel<?> jediViewModel) {
        o.LJIIIZ(param, "param");
        return new AbstractC50421Jqb<C81553Hz, C51031K1b<C81553Hz>>(abstractC51036K1g, param) { // from class: X.8TA
            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final int getPageType(int i) {
                return i;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
            {
                o.LJIIIZ(param, "param");
                this.mPresenter = new C51031K1b();
                this.mModel = abstractC51036K1g instanceof C81553Hz ? abstractC51036K1g : new C81553Hz();
            }

            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final void request(int i, M89 param2, int i2, boolean z) {
                o.LJIIIZ(param2, "param");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("queryType: ");
                LIZ.append(i);
                LIZ.append(", top up1: ");
                LIZ.append(param2.getExtra().get("upvoter1_uid"));
                LIZ.append(", top2 up2: ");
                LIZ.append(param2.getExtra().get("upvoter2_uid"));
                LIZ.append(", videoType: ");
                LIZ.append(param2.getVideoType());
                C221018lt.LJFF("InboxRepostList", X1D.LIZIZ(LIZ));
                PRESENTER presenter = this.mPresenter;
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(i);
                Object obj = param2.getExtra().get("upvoter1_uid");
                Object obj2 = "";
                if (obj == null) {
                    obj = "";
                }
                objArr[1] = obj;
                Object obj3 = param2.getExtra().get("upvoter2_uid");
                if (obj3 != null) {
                    obj2 = obj3;
                }
                objArr[2] = obj2;
                objArr[3] = Integer.valueOf(param2.getVideoType());
                presenter.LJIILL(objArr);
            }
        };
    }
}
