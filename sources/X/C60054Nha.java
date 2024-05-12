package X;

import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Nha, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60054Nha implements InterfaceC50422Jqc {
    @Override // X.InterfaceC50422Jqc
    public final InterfaceC51679KPz LIZ(M89 param, final AbstractC51036K1g<?, ?> abstractC51036K1g, JediViewModel<?> jediViewModel) {
        o.LJIIIZ(param, "param");
        return new AbstractC50421Jqb<C74166T8w, C51031K1b<C74166T8w>>(abstractC51036K1g) { // from class: X.8lR
            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final int getPageType(int i) {
                return i + 21000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
            {
                this.mModel = (!(abstractC51036K1g instanceof C74166T8w) || abstractC51036K1g == null) ? new C74166T8w() : abstractC51036K1g;
                this.mPresenter = new C51031K1b();
            }

            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final void request(int i, M89 feedParam, int i2, boolean z) {
                o.LJIIIZ(feedParam, "feedParam");
                this.mPresenter.LJIILL(Integer.valueOf(i), feedParam.getVoiceId(), Integer.valueOf(feedParam.getVideoType()));
            }
        };
    }
}
