package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.C211428Rm;
import X.C211438Rn;
import X.C211498Rt;
import X.C213688a4;
import X.C214348b8;
import X.C221118m3;
import X.C221138m5;
import X.C55096Ljo;
import X.C5H3;
import X.C65352Pkq;
import X.C8YN;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import X.KR8;
import X.TBT;
import X.XKQ;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryGestureEducationAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGestureEducationComponent extends BaseCellContentComponent<StoryGestureEducationComponent> implements StoryGestureEducationAbility {
    public final C221138m5 LL;
    public final C221138m5 LLD;
    public final C5H3 LLF;
    public final C5H3 LLFF;
    public Aweme LLFFF;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        iO(false);
    }

    public StoryGestureEducationComponent() {
        new LinkedHashMap();
        this.LL = KR8.LJIIJJI(new AqS153S0100000_3(this, 907));
        this.LLD = KR8.LJIIJJI(new AqS153S0100000_3(this, 906));
        this.LLF = C221118m3.LIZ(new AqS153S0100000_3(this, 908));
        this.LLFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C211428Rm.INSTANCE);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        InterfaceC55100Ljs mi0;
        InterfaceC55235Lm3 LJIJ;
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLD.getValue();
        if (commonCellAbility != null && (mi0 = commonCellAbility.mi0()) != null && (LJIJ = C55096Ljo.LJIJ(mi0)) != null) {
            C55096Ljo.LJIILL(LJIJ, StoryGestureEducationAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryGestureEducationAbility
    public final void pause() {
        C211498Rt c211498Rt = (C211498Rt) this.LLF.getValue();
        XKQ xkq = c211498Rt.LIZLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        c211498Rt.LIZLLL = null;
        c211498Rt.LJFF.clear();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryGestureEducationAbility
    public final void resume() {
        ((C211498Rt) this.LLF.getValue()).LIZLLL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        InterfaceC55100Ljs mi0;
        InterfaceC55235Lm3 LJIJ;
        super.onParentSet();
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLD.getValue();
        if (commonCellAbility != null && (mi0 = commonCellAbility.mi0()) != null && (LJIJ = C55096Ljo.LJIJ(mi0)) != null) {
            C55096Ljo.LJIIJJI(LJIJ, this, StoryGestureEducationAbility.class, null);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLFFF = item.getAweme();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIII(int i) {
        iO(true);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryGestureEducationAbility
    public final void iO(boolean z) {
        C211498Rt c211498Rt = (C211498Rt) this.LLF.getValue();
        XKQ xkq = c211498Rt.LIZLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        c211498Rt.LJFF.clear();
        c211498Rt.LIZJ(z);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, (AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.8Ro
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLJ;
            }
        }, C213688a4.LIZLLL(), C211438Rn.LJLIL, 4);
    }
}
