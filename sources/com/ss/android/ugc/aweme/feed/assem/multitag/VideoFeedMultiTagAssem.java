package com.ss.android.ugc.aweme.feed.assem.multitag;

import X.C16880lQ;
import X.C16970lZ;
import X.C208968Ia;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C2K0;
import X.C45804HyK;
import X.C47261Igj;
import X.C55096Ljo;
import X.C5H3;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78596Usy;
import X.C7G8;
import X.C7G9;
import X.C7GC;
import X.C8IE;
import X.C8IF;
import X.C8IJ;
import X.C8IK;
import X.C8IL;
import X.C8IO;
import X.C8IP;
import X.C8IQ;
import X.C8IR;
import X.C8IU;
import X.C8IV;
import X.C8IW;
import X.C8IX;
import X.C8MM;
import X.C8YN;
import X.DPB;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC72642tA;
import X.InterfaceC74236TBo;
import X.TBT;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.assem.friendeffect.FriendEffectPromptVM;
import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoFeedMultiTagAssem extends BaseCellSlotComponent implements FeedMultiAnchorAbility, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIL;
    public final C62822Ol8 LLFII;
    public C7G8 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final C5H3 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public final VideoFeedMultiTagAssem$descExpandModeProtocol$1 LLIIIJ;

    static {
        TBT tbt = new TBT(VideoFeedMultiTagAssem.class, "tagVM", "getTagVM()Lcom/ss/android/ugc/aweme/feed/assem/multitag/VideoFeedMultiTagVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.boh;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -666077674) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagAssem$descExpandModeProtocol$1] */
    public VideoFeedMultiTagAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 336));
        C65776Prg LIZ = C65352Pkq.LIZ(VideoFeedMultiTagVM.class);
        this.LLI = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 337), null, C8IX.INSTANCE, null, null);
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C8IU.INSTANCE);
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C8IV.INSTANCE);
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C8IW.INSTANCE);
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FriendEffectPromptVM.class), C208968Ia.INSTANCE);
        this.LLIIIJ = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagAssem$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                VideoFeedMultiTagAssem videoFeedMultiTagAssem = VideoFeedMultiTagAssem.this;
                if (videoFeedMultiTagAssem.LLFFF == 0) {
                    videoFeedMultiTagAssem.Y3().setVisibility(0);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.multitag.FeedMultiAnchorAbility
    public final List<AnchorCommonStruct> h4() {
        C7G8 c7g8 = this.LLFZ;
        if (c7g8 != null) {
            return c7g8.getShownAnchors();
        }
        return null;
    }

    public final VideoFeedMultiTagVM q4() {
        return (VideoFeedMultiTagVM) this.LLI.LIZ(this, LLIIIL[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLIIIJ));
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C7G9 c7g9 = item.commodityCard;
        C7G8 c7g8 = this.LLFZ;
        if (c7g8 != null) {
            c7g8.setCommodityCard(c7g9);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_component_clickable", new AqS169S0100000_3(this, 204));
        c8mm.LIZ("event_component_hint_text", new AqS169S0100000_3(this, 205));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C7G8 c7g8;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C7G8 c7g82 = (C7G8) view.findViewById(R.id.feed_multi_tag_layout);
        this.LLFZ = c7g82;
        if (c7g82 != null) {
            c7g82.setOnInternalEventListener(new InterfaceC72642tA() { // from class: X.8II
                @Override // X.InterfaceC72642tA
                public final void onInternalEvent(Object obj) {
                    DataCenter dataCenter;
                    VideoItemParams gv0 = VideoFeedMultiTagAssem.this.q4().gv0();
                    if (gv0 != null && (dataCenter = gv0.dataCenter) != null) {
                        dataCenter.jv0(obj, "feed_internal_event");
                    }
                }
            });
        }
        C8YN.LJII(this, q4(), new TBT() { // from class: X.8Ib
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8IY) obj).LJLIL;
            }
        }, null, C8IO.LJLIL, 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.8IZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8IY) obj).LJLILLLLZI;
            }
        }, null, C8IE.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.8Ig
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C209038Ih) obj).LJLIL;
            }
        }, null, C8IQ.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.8IS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C8IP.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.8IT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), C8IF.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.8Ic
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLFZ;
            }
        }, null, C8IR.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.8IH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLL;
            }
        }, null, C8IJ.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.8Id
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLLL;
            }
        }, null, C8IK.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.8If
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLLL;
            }
        }, C213688a4.LIZLLL(), C8IL.LJLIL, 4);
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) && (view.getContext() instanceof Activity) && this.LLFZ != null) {
            if (C78596Usy.LJJIJL(C7GC.LJLIL, DPB.LIZJ())) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                o.LJI(LJIJJ);
                View LIZLLL = C16970lZ.LIZLLL(LJIJJ, R.layout.aa0);
                if (LIZLLL != null && (c7g8 = this.LLFZ) != null) {
                    c7g8.LJLJLJ.put(Integer.valueOf(R.layout.aa0), LIZLLL);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        C7G8 c7g8 = this.LLFZ;
        if (c7g8 != null) {
            c7g8.LJLIL.LJ();
        }
    }
}
