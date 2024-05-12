package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.AbstractC72278SYg;
import X.C210408No;
import X.C222588oQ;
import X.C51029K0z;
import X.C57939MoZ;
import X.C72808Sho;
import X.InterfaceC57784Mm4;
import X.SYL;
import X.TBR;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGuideCardFakeListComponent extends BaseCellContentComponent<StoryGuideCardFakeListComponent> {
    public SYL LL;
    public StoryGuideCardViewModel LLD;

    public StoryGuideCardFakeListComponent() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        final StoryGuideCardViewModel storyGuideCardViewModel;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        b4(item.getAweme());
        SYL syl = this.LL;
        if (syl != null && (storyGuideCardViewModel = this.LLD) != null) {
            C72808Sho<InterfaceC57784Mm4> state = syl.getState();
            o.LJIIIIZZ(state, "it.state");
            storyGuideCardViewModel.setListState(state);
            syl.LJLJLLL((AbstractC72278SYg) new TBR(storyGuideCardViewModel) { // from class: X.8Nn
                @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
                public final Object get() {
                    return ((AssemListViewModel) this.receiver).getConfig();
                }
            }.get());
        }
        StoryGuideCardViewModel storyGuideCardViewModel2 = this.LLD;
        if (storyGuideCardViewModel2 != null) {
            storyGuideCardViewModel2.kv0(item.getAweme(), "fake_list_onBind");
        }
    }

    public final void b4(Aweme aweme) {
        Fragment fragment;
        Aweme LIZJ = C210408No.LIZJ(aweme);
        C222588oQ c222588oQ = a1().LIZLLL;
        String str = null;
        if (c222588oQ != null) {
            fragment = c222588oQ.LIZJ;
        } else {
            fragment = null;
        }
        if (LIZJ != null) {
            str = LIZJ.getAid();
        }
        this.LLD = C210408No.LIZIZ(fragment, str);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SYL syl;
        o.LJIIIZ(view, "view");
        if (view instanceof SYL) {
            syl = (SYL) view;
        } else {
            syl = null;
        }
        this.LL = syl;
        if (syl != null) {
            C57939MoZ c57939MoZ = new C57939MoZ();
            c57939MoZ.LIZ = 5;
            c57939MoZ.LIZIZ = false;
            syl.setListConfig(c57939MoZ);
            syl.LLLF.LJZL(StorySkylightCell.class);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        b4(aweme);
        StoryGuideCardViewModel storyGuideCardViewModel = this.LLD;
        if (storyGuideCardViewModel != null) {
            storyGuideCardViewModel.kv0(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), "fake_list_selected");
        }
    }
}
