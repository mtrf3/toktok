package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import kotlin.jvm.internal.AqS57S0201000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.KTz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51783KTz implements C2MJ {
    public final /* synthetic */ RootPanelComponent LJLIL;

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
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C51783KTz(RootPanelComponent rootPanelComponent) {
        this.LJLIL = rootPanelComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        AbstractC55082Lja abstractFeedAdapter;
        Aweme item;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLIL.LJLJJL.getValue();
        if (iFeedPanelPlatformAbility != null && (abstractFeedAdapter = iFeedPanelPlatformAbility.getAbstractFeedAdapter()) != null && (item = abstractFeedAdapter.getItem(i)) != null) {
            RootPanelComponent rootPanelComponent = this.LJLIL;
            KUD.LIZ(rootPanelComponent.getPanelContext(), new AqS57S0201000_8(item, rootPanelComponent, i, 1), false);
        }
    }
}
