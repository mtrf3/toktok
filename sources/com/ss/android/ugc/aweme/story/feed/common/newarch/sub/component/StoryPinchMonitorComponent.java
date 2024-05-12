package com.ss.android.ugc.aweme.story.feed.common.newarch.sub.component;

import X.C212428Vi;
import X.C221138m5;
import X.C51029K0z;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C8MM;
import X.C8MP;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import X.KR8;
import com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryGestureEducationAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryFakePlayerAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryPinchMonitorComponent extends BaseCellLogicComponent<StoryPinchMonitorComponent> implements IPinchMonitorAbility {
    public final C221138m5 LJLLL = KR8.LJIIJJI(new AqS153S0100000_3(this, 942));
    public final C221138m5 LJLLLL = KR8.LJIIJJI(new AqS153S0100000_3(this, 941));
    public final C221138m5 LJLLLLLL = KR8.LJIIJJI(new AqS153S0100000_3(this, 943));
    public final C221138m5 LJLZ = KR8.LJIIJJI(new AqS153S0100000_3(this, 944));
    public boolean LJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility
    public final void LLJLIL() {
        if (!C55723Ltv.LIZIZ.LJIJ().LJIJ(C212428Vi.LIZLLL(this))) {
            return;
        }
        this.LJZ = false;
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LJLLL.getValue();
        if (iPlayerComponentAbility == null || iPlayerComponentAbility.gu() != 3) {
            return;
        }
        IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LJLLL.getValue();
        if (iPlayerComponentAbility2 != null) {
            iPlayerComponentAbility2.handlePlay(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), true);
        }
        StoryFakePlayerAbility storyFakePlayerAbility = (StoryFakePlayerAbility) this.LJLLLLLL.getValue();
        if (storyFakePlayerAbility != null) {
            storyFakePlayerAbility.mr();
        }
        StoryGestureEducationAbility storyGestureEducationAbility = (StoryGestureEducationAbility) this.LJLZ.getValue();
        if (storyGestureEducationAbility != null) {
            storyGestureEducationAbility.resume();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility
    public final void m() {
        if (!C55723Ltv.LIZIZ.LJIJ().LJIJ(C212428Vi.LIZLLL(this))) {
            return;
        }
        this.LJZ = true;
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LJLLL.getValue();
        if (iPlayerComponentAbility == null || iPlayerComponentAbility.gu() != 2) {
            return;
        }
        IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LJLLL.getValue();
        if (iPlayerComponentAbility2 != null) {
            iPlayerComponentAbility2.handlePlay(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), true);
        }
        StoryFakePlayerAbility storyFakePlayerAbility = (StoryFakePlayerAbility) this.LJLLLLLL.getValue();
        if (storyFakePlayerAbility != null) {
            storyFakePlayerAbility.nm0();
        }
        StoryGestureEducationAbility storyGestureEducationAbility = (StoryGestureEducationAbility) this.LJLZ.getValue();
        if (storyGestureEducationAbility != null) {
            storyGestureEducationAbility.pause();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onDestroy() {
        InterfaceC55100Ljs mi0;
        InterfaceC55235Lm3 LJIJ;
        super.onDestroy();
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LJLLLL.getValue();
        if (commonCellAbility != null && (mi0 = commonCellAbility.mi0()) != null && (LJIJ = C55096Ljo.LJIJ(mi0)) != null) {
            C55096Ljo.LJIILL(LJIJ, IPinchMonitorAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.C8W0
    public final void onParentSet() {
        InterfaceC55100Ljs mi0;
        InterfaceC55235Lm3 LJIJ;
        super.onParentSet();
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LJLLLL.getValue();
        if (commonCellAbility != null && (mi0 = commonCellAbility.mi0()) != null && (LJIJ = C55096Ljo.LJIJ(mi0)) != null) {
            C55096Ljo.LJIIJJI(LJIJ, this, IPinchMonitorAbility.class, null);
        }
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        C8MP.LIZ(this, "event_on_play_progress_change", new AqS169S0100000_3(this, 441));
    }
}
