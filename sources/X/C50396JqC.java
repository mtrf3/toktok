package X;

import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.JqC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50396JqC implements InterfaceC55109Lk1 {
    public final /* synthetic */ IFeedFragmentAbility LIZ;
    public final /* synthetic */ C68322mC<String> LIZIZ;
    public final /* synthetic */ InterfaceC50392Jq8 LIZJ;

    @Override // X.InterfaceC55109Lk1
    public final void onHide() {
        this.LIZIZ.element = null;
        this.LIZJ.Mt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC55109Lk1
    public final void onShow() {
        PagerAdapter LJJLIIIJJIZ;
        T t;
        IViewPagerComponentAbility viewPagerComponentAbility = this.LIZ.getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null || (LJJLIIIJJIZ = viewPagerComponentAbility.LJJLIIIJJIZ()) == null) {
            return;
        }
        Aweme currentAweme = viewPagerComponentAbility.getCurrentAweme();
        if (currentAweme != null) {
            t = currentAweme.getAid();
        } else {
            t = 0;
        }
        if (o.LJ(t, this.LIZIZ.element)) {
            return;
        }
        this.LIZIZ.element = t;
        this.LIZJ.zX(viewPagerComponentAbility.LLILL(), LJJLIIIJJIZ.getCount(), viewPagerComponentAbility.getCurrentAweme());
    }

    public C50396JqC(IFeedFragmentAbility iFeedFragmentAbility, C68322mC<String> c68322mC, InterfaceC50392Jq8 interfaceC50392Jq8) {
        this.LIZ = iFeedFragmentAbility;
        this.LIZIZ = c68322mC;
        this.LIZJ = interfaceC50392Jq8;
    }
}
