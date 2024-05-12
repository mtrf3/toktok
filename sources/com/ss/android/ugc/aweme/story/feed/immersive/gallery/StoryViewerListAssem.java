package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.ActivityC45651qj;
import X.C0A2;
import X.C187317Wt;
import X.C189297bp;
import X.C189377bx;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C221138m5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.KR8;
import X.SYL;
import X.TBT;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryViewerListAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryViewerListAssem extends UIListContentAssem<StoryViewerListViewModel> implements StoryViewerListAbility {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C221138m5 LJLJI;

    public StoryViewerListAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1002));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StoryViewerListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1004), C187317Wt.INSTANCE, null);
        this.LJLJI = KR8.LJIIJJI(new AqS153S0100000_3(this, 1005));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: C3, reason: merged with bridge method [inline-methods] */
    public final StoryViewerListViewModel A3() {
        return (StoryViewerListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryViewerListAbility
    public final boolean isVisible() {
        if (v3().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryViewerListAbility
    public final boolean oi() {
        View childAt = v3().getChildAt(0);
        if (childAt == null) {
            return true;
        }
        if (childAt.getTop() < 0 || childAt.getTop() >= childAt.getHeight() || v3().getLayoutManager() == null || C0A2.LJJJLL(childAt) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), StoryViewerListAbility.class, null);
        }
        int hashCode = hashCode();
        C62822Ol8 c62822Ol8 = C189297bp.LIZJ;
        ((Set) c62822Ol8.getValue()).remove(Integer.valueOf(hashCode));
        if (((Set) c62822Ol8.getValue()).isEmpty()) {
            C189297bp.LIZIZ = null;
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C189377bx hL;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        v3().LLLF.LJZL(StoryViewerCell.class, StoryAnalyticsCell.class, StoryViewerHintCell.class);
        ((Set) C189297bp.LIZJ.getValue()).add(Integer.valueOf(hashCode()));
        if (C189297bp.LIZIZ == null) {
            C189297bp.LIZIZ = new C189297bp();
        }
        C8YN.LJII(this, A3(), new TBT() { // from class: X.7bn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C189257bl) obj).LJLILLLLZI;
            }
        }, null, new AqS185S0100000_3(this, 86), 6);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.7bm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C189257bl c189257bl = (C189257bl) obj;
                c189257bl.getClass();
                return C208708Ha.LIZLLL(c189257bl);
            }
        }, null, null, new AqS153S0100000_3(this, 1003), new AqS169S0100000_3(this, 465), 6, null);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, StoryViewerListAbility.class, null);
        }
        StoryViewerListHostAbility storyViewerListHostAbility = (StoryViewerListHostAbility) this.LJLJI.getValue();
        if (storyViewerListHostAbility != null && (hL = storyViewerListHostAbility.hL()) != null) {
            StoryViewerListViewModel A3 = A3();
            A3.getClass();
            A3.LJLILLLLZI = hL;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryViewerListAbility
    public final boolean HA(int i, int i2) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        v3().getDrawingRect(rect);
        v3().getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        return rect.contains(i, i2);
    }
}
