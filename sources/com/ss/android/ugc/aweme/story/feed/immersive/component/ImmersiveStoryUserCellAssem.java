package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C215178cT;
import X.C221138m5;
import X.C222588oQ;
import X.C224238r5;
import X.C2II;
import X.C50420Jqa;
import X.C7MY;
import X.C8XO;
import X.C92D;
import X.InterfaceC222598oR;
import X.InterfaceC2302191t;
import X.InterfaceC72642tA;
import X.KOZ;
import X.KR8;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.story.feed.immersive.StoryImmersiveCollectionVH;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.UserFeedAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ImmersiveStoryUserCellAssem extends ReusedUISlotAssem<ImmersiveStoryUserCellAssem> implements C8XO<StoryImmersiveFeedItem>, KOZ {
    public final int LLFF;
    public final C221138m5 LLFFF;
    public final C221138m5 LLFII;
    public StoryImmersiveCollectionVH LLFZ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.co9;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    @Override // X.KOZ
    public final void k2() {
        UserFeedAbility userFeedAbility;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageUnselected, immersiveCollectionVH = ");
        StoryImmersiveCollectionVH storyImmersiveCollectionVH = this.LLFZ;
        Integer num = null;
        if (storyImmersiveCollectionVH != null) {
            num = Integer.valueOf(storyImmersiveCollectionVH.hashCode());
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        StoryImmersiveCollectionVH storyImmersiveCollectionVH2 = this.LLFZ;
        if (storyImmersiveCollectionVH2 != null) {
            storyImmersiveCollectionVH2.t7(true);
        }
        StoryImmersiveCollectionVH storyImmersiveCollectionVH3 = this.LLFZ;
        if ((storyImmersiveCollectionVH3 instanceof InterfaceC222598oR) && storyImmersiveCollectionVH3 != null && (userFeedAbility = (UserFeedAbility) this.LLFFF.getValue()) != null) {
            userFeedAbility.Ox(storyImmersiveCollectionVH3);
        }
    }

    public ImmersiveStoryUserCellAssem(int i) {
        new LinkedHashMap();
        this.LLFF = i;
        this.LLFFF = KR8.LJIIJJI(new AqS153S0100000_3(this, 960));
        this.LLFII = KR8.LJIIJJI(new AqS153S0100000_3(this, 959));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(StoryImmersiveFeedItem storyImmersiveFeedItem) {
        StoryImmersiveFeedItem item = storyImmersiveFeedItem;
        o.LJIIIZ(item, "item");
        StoryImmersiveCollectionVH storyImmersiveCollectionVH = this.LLFZ;
        if (storyImmersiveCollectionVH != null) {
            storyImmersiveCollectionVH.LIZLLL(item.getStoryCollection());
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(StoryImmersiveFeedItem storyImmersiveFeedItem) {
        return true;
    }

    @Override // X.KOZ
    public final void onPageSelected(int i) {
        C2II storyFeedListHelper;
        UserFeedAbility userFeedAbility;
        StringBuilder LJ = C7MY.LJ("onPageSelected, position = ", i, ", immersiveCollectionVH = ");
        StoryImmersiveCollectionVH storyImmersiveCollectionVH = this.LLFZ;
        Integer num = null;
        if (storyImmersiveCollectionVH != null) {
            num = Integer.valueOf(storyImmersiveCollectionVH.hashCode());
        }
        LJ.append(num);
        X1D.LIZIZ(LJ);
        StoryImmersiveCollectionVH storyImmersiveCollectionVH2 = this.LLFZ;
        if ((storyImmersiveCollectionVH2 instanceof InterfaceC222598oR) && storyImmersiveCollectionVH2 != null && (userFeedAbility = (UserFeedAbility) this.LLFFF.getValue()) != null) {
            userFeedAbility.vk0(storyImmersiveCollectionVH2);
        }
        StoryImmersiveCollectionVH storyImmersiveCollectionVH3 = this.LLFZ;
        if (storyImmersiveCollectionVH3 != null) {
            storyImmersiveCollectionVH3.l8(i);
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLFII.getValue();
        if (iFeedPanelPlatformAbility != null && (storyFeedListHelper = iFeedPanelPlatformAbility.getStoryFeedListHelper()) != null) {
            storyFeedListHelper.LIZ();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C222588oQ c222588oQ;
        o.LJIIIZ(view, "view");
        UserFeedAbility userFeedAbility = (UserFeedAbility) this.LLFFF.getValue();
        StoryImmersiveCollectionVH storyImmersiveCollectionVH = null;
        if (userFeedAbility != null) {
            c222588oQ = userFeedAbility.Bm(view);
        } else {
            c222588oQ = null;
        }
        if (!(c222588oQ instanceof C222588oQ) || c222588oQ == null) {
            return;
        }
        C215178cT c215178cT = C215178cT.LIZ;
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = c222588oQ.LIZIZ;
        Fragment fragment = c222588oQ.LIZJ;
        View.OnTouchListener onTouchListener = c222588oQ.LIZLLL;
        BaseFeedPageParams baseFeedPageParams = c222588oQ.LJ;
        InterfaceC2302191t interfaceC2302191t = c222588oQ.LJFF;
        C224238r5 c224238r5 = c222588oQ.LJI;
        View.OnTouchListener onTouchListener2 = c222588oQ.LJII;
        C92D c92d = c222588oQ.LJIIIIZZ;
        String str = baseFeedPageParams.eventType;
        if (str == null) {
            str = "";
        }
        Object LJIILLIIL = c215178cT.LJIILLIIL(new C222588oQ(view, interfaceC72642tA, fragment, onTouchListener, baseFeedPageParams, interfaceC2302191t, c224238r5, onTouchListener2, c92d, str, baseFeedPageParams.pageType, c222588oQ.LJIIJJI, c222588oQ.LJIIL, c222588oQ.LJIILIIL, this.LLFF, c222588oQ.LJIILL, c222588oQ.LJIILLIIL, c222588oQ.LJIIZILJ));
        if (LJIILLIIL instanceof StoryImmersiveCollectionVH) {
            storyImmersiveCollectionVH = (StoryImmersiveCollectionVH) LJIILLIIL;
        }
        this.LLFZ = storyImmersiveCollectionVH;
        view.setTag(R.id.d87, storyImmersiveCollectionVH);
        StoryImmersiveCollectionVH storyImmersiveCollectionVH2 = this.LLFZ;
        if (storyImmersiveCollectionVH2 != null) {
            storyImmersiveCollectionVH2.k7(view);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(StoryImmersiveFeedItem storyImmersiveFeedItem) {
    }
}
