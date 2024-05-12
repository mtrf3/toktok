package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.KQz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51705KQz implements C2MJ {
    public final /* synthetic */ DiggPanelComponent LJLIL;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
    }

    public C51705KQz(DiggPanelComponent diggPanelComponent) {
        this.LJLIL = diggPanelComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        int i3;
        int LJIIIZ;
        DiggPanelComponent diggPanelComponent = this.LJLIL;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) diggPanelComponent.LJLJJL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            i3 = iFeedPanelPlatformAbility.getCurrentIndex();
        } else {
            i3 = i;
        }
        if (i == i3) {
            C5WY c5wy = diggPanelComponent.LJLJLJ;
            if (c5wy != null) {
                c5wy.setTranslationY(-i2);
                return;
            }
            return;
        }
        ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) diggPanelComponent.LJLJJLL.getValue();
        if (iLoadMoreAbility == null || (LJIIIZ = iLoadMoreAbility.getMeasuredHeight()) == 0) {
            LJIIIZ = KL2.LJIIIZ(diggPanelComponent.getPanelContext().LIZ());
        }
        C61447O9r c61447O9r = C57092Lx.LIZ;
        if (c61447O9r.LJFF) {
            LJIIIZ = c61447O9r.LIZJ;
        }
        float f2 = LJIIIZ - i2;
        C5WY c5wy2 = diggPanelComponent.LJLJLJ;
        if (c5wy2 == null) {
            return;
        }
        c5wy2.setTranslationY(f2);
    }
}
