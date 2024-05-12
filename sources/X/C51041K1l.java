package X;

import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.K1l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51041K1l implements InterfaceC50422Jqc {
    @Override // X.InterfaceC50422Jqc
    public final InterfaceC51679KPz LIZ(M89 param, AbstractC51036K1g<?, ?> abstractC51036K1g, JediViewModel<?> jediViewModel) {
        o.LJIIIZ(param, "param");
        final String ids = param.getIds();
        return new C224708rq(ids) { // from class: X.8rs
            @Override // X.C224708rq, X.InterfaceC51679KPz
            public final int getPageType(int i) {
                return i + LivePlayerResourceReleaseSetting.ENABLE;
            }

            @Override // X.C224708rq, X.InterfaceC51679KPz
            public final void request(int i, M89 m89, int i2, boolean z) {
                this.LJLILLLLZI.LJLILLLLZI = m89.getPageType();
                super.request(i, m89, i2, z);
            }
        };
    }
}
