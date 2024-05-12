package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.AbstractC73547Stj;
import X.C0C3;
import X.C1UE;
import X.C220778lV;
import X.C221108m2;
import X.C221138m5;
import X.C54838Lfe;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.KR8;
import X.T16;
import Y.IDaS214S0100000_3;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.IViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StorySwipeComponent extends BaseCellContentComponent<StorySwipeComponent> {
    public final C221138m5 LL;
    public final C221138m5 LLD;
    public final C221138m5 LLF;
    public final C1UE LLFF;
    public final C62822Ol8 LLFFF;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
    }

    public StorySwipeComponent() {
        new LinkedHashMap();
        this.LL = KR8.LJIIJJI(new AqS153S0100000_3(this, 917));
        this.LLD = KR8.LJIIJJI(new AqS153S0100000_3(this, 916));
        this.LLF = KR8.LJIIJJI(new AqS153S0100000_3(this, 915));
        this.LLFF = new C1UE(3);
        this.LLFFF = C221108m2.LIZIZ(C220778lV.LJLIL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        ((C73318Sq2) this.LLFFF.getValue()).LIZLLL();
    }

    public final Aweme ct0() {
        StoryCollectionCellAbility storyCollectionCellAbility = (StoryCollectionCellAbility) this.LLF.getValue();
        if (storyCollectionCellAbility != null) {
            return storyCollectionCellAbility.ct0();
        }
        return null;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C54838Lfe.LJJ(item.getAweme());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LL.getValue();
        if (iViewPagerAbility != null) {
            iViewPagerAbility.addOnPageChangeListener(new C0C3() { // from class: X.8lW
                @Override // X.C0C3
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.C0C3
                public final void onPageSelected(int i) {
                }

                @Override // X.C0C3
                public final void onPageScrollStateChanged(int i) {
                    if (!C220828la.LIZ().getBoolean("key_has_performed_swipe", false)) {
                        C220828la.LIZ().storeBoolean("key_has_performed_swipe", true);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        C1UE c1ue = this.LLFF;
        Aweme ct0 = ct0();
        c1ue.getClass();
        if (C1UE.LIZIZ(ct0)) {
            C78999UzT.LJFF(AbstractC73547Stj.LJIILJJIL(1000L, TimeUnit.MILLISECONDS).LJIILIIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()).LJIIIZ(new IDaS214S0100000_3(this, 1)), (C73318Sq2) this.LLFFF.getValue());
        }
    }
}
