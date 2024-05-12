package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.C1DH;
import X.C210048Me;
import X.C210058Mf;
import X.C210068Mg;
import X.C210078Mh;
import X.C210098Mj;
import X.C210118Ml;
import X.C210248My;
import X.C213688a4;
import X.C214348b8;
import X.C221138m5;
import X.C2304092m;
import X.C26338AVi;
import X.C2K0;
import X.C32151Nz;
import X.C47261Igj;
import X.C53578L1a;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C5H3;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C79045V0n;
import X.C7MY;
import X.C8ON;
import X.C8T7;
import X.C8YN;
import X.InterfaceC55102Lju;
import X.KR8;
import X.M89;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS7S0101000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionProgressBarAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedCollectionProgressBarComponent extends BaseCellSlotComponent implements FeedCollectionProgressBarAbility, ComponentPriorityProtocol, InterfaceC55102Lju {
    public C210118Ml LLFII;
    public final C221138m5 LLFZ;
    public final C221138m5 LLI;
    public final C5H3 LLIFFJFJJ;
    public volatile Integer LLII;
    public final FeedCollectionProgressBarComponent$descExpandModeProtocol$1 LLIIII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.coz;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "bottom_container_story_progress_bar";
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -962867476) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionProgressBarComponent$descExpandModeProtocol$1] */
    public FeedCollectionProgressBarComponent() {
        new LinkedHashMap();
        this.LLFZ = KR8.LJIIJJI(new AqS153S0100000_3(this, 889));
        this.LLI = KR8.LJIIJJI(new AqS153S0100000_3(this, 891));
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C210068Mg.INSTANCE);
        this.LLIIII = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionProgressBarComponent$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                FeedCollectionProgressBarComponent feedCollectionProgressBarComponent = FeedCollectionProgressBarComponent.this;
                if (feedCollectionProgressBarComponent.LLFFF == 0) {
                    feedCollectionProgressBarComponent.Y3().setVisibility(0);
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onCreateView() {
        C210248My.LIZ.LIZLLL(this, "story_layout_progress_bar", new AqS153S0100000_3(this, 890));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLIIII));
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFZ.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
        C54838Lfe.LJJ(item.getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        M89 m89;
        C210118Ml c210118Ml;
        C210118Ml c210118Ml2;
        int i;
        int i2;
        Integer LJI;
        Integer LJI2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 91));
        C210118Ml c210118Ml3 = (C210118Ml) Y3().findViewById(R.id.iac);
        this.LLFII = c210118Ml3;
        Integer num = this.LLII;
        if (num != null) {
            C1DH.LJJIJIIJI(new ARunnableS7S0101000_3(num.intValue(), c210118Ml3, 11));
        }
        C210118Ml c210118Ml4 = this.LLFII;
        if (c210118Ml4 != null) {
            int LIZJ = C8ON.LIZJ();
            C26338AVi.LJI(c210118Ml4, Integer.valueOf(LIZJ), null, Integer.valueOf(LIZJ), null, false, 26);
            if (C2304092m.LIZ()) {
                ViewGroup.LayoutParams layoutParams = c210118Ml4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C7MY.LIZIZ(2);
                    c210118Ml4.setLayoutParams(layoutParams);
                    C210078Mh c210078Mh = new C210078Mh();
                    Context context = c210118Ml4.getContext();
                    if (context != null && (LJI2 = C79045V0n.LJI(R.attr.da, context)) != null) {
                        i = LJI2.intValue();
                    } else {
                        i = 0;
                    }
                    c210078Mh.LIZIZ = i;
                    Context context2 = c210118Ml4.getContext();
                    if (context2 != null && (LJI = C79045V0n.LJI(R.attr.dk, context2)) != null) {
                        i2 = LJI.intValue();
                    } else {
                        i2 = 0;
                    }
                    c210078Mh.LIZ = i2;
                    c210078Mh.LIZJ = C32151Nz.LJIIZILJ(4);
                    c210118Ml4.setProgressBarConfig(c210078Mh);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ() && (c210118Ml2 = this.LLFII) != null) {
            c210118Ml2.setVisibility(8);
        }
        BaseFeedPageParams baseFeedPageParams = a1().LJ;
        if (baseFeedPageParams != null && (m89 = baseFeedPageParams.param) != null && m89.getStoryType() == 1 && (c210118Ml = this.LLFII) != null) {
            c210118Ml.setVisibility(8);
        }
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.7Dj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJZ;
            }
        }, C213688a4.LIZLLL(), C210098Mj.LJLIL, 4);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionProgressBarAbility
    public final void qG(int i) {
        KR8.LJIIJ(this, new C210048Me(this, i, null));
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionProgressBarAbility
    public final void Cy(float f, int i, long j) {
        KR8.LJIIJ(this, new C210058Mf(this, i, f, j, null));
    }
}
