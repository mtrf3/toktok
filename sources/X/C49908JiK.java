package X;

import X.AbstractC51030K1a;
import androidx.fragment.app.Fragment;
import b25.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JiK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49908JiK<MODEL extends e<?, ?>, PRESENTER extends AbstractC51030K1a<MODEL, Aweme>> extends AbstractC50421Jqb<MODEL, PRESENTER> implements InterfaceC50391Jq7 {
    @Override // X.InterfaceC50391Jq7
    public final void bindPreLoadView(InterfaceC51032K1c interfaceC51032K1c) {
        ((AbstractC51030K1a) this.mPresenter).LJLJJL = interfaceC51032K1c;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        if (this.mModel != 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50391Jq7
    public final void setPreLoad(boolean z) {
        ((AbstractC51030K1a) this.mPresenter).LJLJJLL = true;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        this.mPresenter.LJIILL(Integer.valueOf(i));
    }
}
