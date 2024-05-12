package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C189667cQ;
import X.C189677cR;
import X.C189697cT;
import X.C214298b3;
import X.C221108m2;
import X.C221138m5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.InterfaceC80118VcQ;
import X.KR8;
import X.SYL;
import X.TBT;
import Y.AObserverS71S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryCoverListAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel;
import com.ss.android.ugc.aweme.story.feed.ui.gallery.StoryGalleryLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGalleryCoverListAssem extends UIContentAssem {
    public SYL LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C214298b3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C221138m5 LJLJL;

    public StoryGalleryCoverListAssem() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(C189697cT.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 999));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 998));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StoryGalleryListViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 996), C189667cQ.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(StoryViewerListViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ2, c9bd, new AqS153S0100000_3(LIZ2, 997), C189677cR.INSTANCE, null);
        this.LJLJL = KR8.LJIIJJI(new AqS153S0100000_3(this, 1000));
    }

    public final StoryGalleryListViewModel v3() {
        return (StoryGalleryListViewModel) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        v3().LJLJI = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        Aweme aweme;
        Aweme aweme2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLIL = (SYL) view.findViewById(R.id.dq2);
        StoryViewerListHostAbility storyViewerListHostAbility = (StoryViewerListHostAbility) this.LJLJL.getValue();
        if (storyViewerListHostAbility != null && storyViewerListHostAbility.WR()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StoryGalleryListViewModel v3 = v3();
            Aweme story = storyViewerListHostAbility.ke0();
            v3.getClass();
            o.LJIIIZ(story, "story");
            v3.setState(new AqS134S0200000_3(v3, story, 7));
        } else {
            StoryFeedViewModel storyFeedViewModel = (StoryFeedViewModel) this.LJLJJI.getValue();
            if (storyFeedViewModel != null) {
                StoryGalleryListViewModel v32 = v3();
                if (storyViewerListHostAbility != null) {
                    aweme = storyViewerListHostAbility.ke0();
                    aweme2 = storyViewerListHostAbility.Af0();
                } else {
                    aweme = null;
                    aweme2 = null;
                }
                v32.getClass();
                v32.LJLJI = storyFeedViewModel;
                storyFeedViewModel.iv0("LOAD_USER_STORY_SUCCESS", new AObserverS71S0100000_3(v32, 0), false);
                storyFeedViewModel.iv0("UPLOADING_USER_STORY_SUCCESS", new AObserverS71S0100000_3(v32, 1), false);
                storyFeedViewModel.iv0("UPLOADING_USER_STORY_FAIL", new AObserverS71S0100000_3(v32, 2), false);
                v32.setState(new AqS49S0400000_3(aweme2, storyFeedViewModel, v32, aweme, 3));
            }
        }
        SYL syl = this.LJLIL;
        if (syl != null) {
            syl.setOrientation(0);
            syl.LLLF.LJZL(StoryGalleryCoverCell.class);
            StoryGalleryLayoutManager storyGalleryLayoutManager = (StoryGalleryLayoutManager) this.LJLILLLLZI.getValue();
            InterfaceC80118VcQ interfaceC80118VcQ = new InterfaceC80118VcQ() { // from class: X.7cP
                @Override // X.InterfaceC80118VcQ
                public final void LIZ(int i) {
                    if (i == 0) {
                        StoryGalleryCoverListAssem storyGalleryCoverListAssem = StoryGalleryCoverListAssem.this;
                        storyGalleryCoverListAssem.withStateSafe(storyGalleryCoverListAssem.v3(), new AqS169S0100000_3(StoryGalleryCoverListAssem.this, 22));
                    }
                }

                @Override // X.InterfaceC80118VcQ
                public final void LIZIZ(int i, View view2) {
                    StoryGalleryListViewModel v33 = StoryGalleryCoverListAssem.this.v3();
                    v33.getClass();
                    v33.setState(new AqS93S0101000_3(v33, i, 3));
                }
            };
            storyGalleryLayoutManager.getClass();
            ((List) storyGalleryLayoutManager.LL.getValue()).add(interfaceC80118VcQ);
            syl.setItemAnimator(null);
        }
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7cS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C189487c8) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 83), 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7cN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C189487c8) obj).LJLJI;
            }
        }, null, new AqS166S0200000_3(this, storyViewerListHostAbility, 15), 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7cO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C189487c8) obj).LJLILLLLZI);
            }
        }, null, new AqS185S0100000_3(this, 84), 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7c4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C189487c8) obj).LJLJJI;
            }
        }, null, new AqS185S0100000_3(this, 85), 6);
    }
}
