package com.ss.android.ugc.aweme.feed.assem.container;

import X.AnonymousClass391;
import X.C204257zx;
import X.C209418Jt;
import X.C213688a4;
import X.C214348b8;
import X.C214368bA;
import X.C241249dQ;
import X.C32151Nz;
import X.C35183DrP;
import X.C37179EiV;
import X.C3YP;
import X.C45804HyK;
import X.C51029K0z;
import X.C54838Lfe;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C74220TAy;
import X.C79004UzY;
import X.C7MY;
import X.C87B;
import X.C87F;
import X.C87G;
import X.C87H;
import X.C87I;
import X.C8D3;
import X.C8VR;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.M89;
import X.O6R;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RightAreaContainerAssem extends FeedBaseContentAssem<RightAreaContainerAssem> {
    public static final C87I LLFZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public static final int LLIFFJFJJ;
    public static final int LLII;
    public static final int LLIIII;
    public final C74220TAy LJZL;
    public final BaseFeedPageParams LL;
    public final InterfaceC65784Pro<Long> LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final C5H3 LLFFF;
    public boolean LLFII;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.87I] */
    static {
        TBT tbt = new TBT(RightAreaContainerAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt, new TBT(RightAreaContainerAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0)};
        LLFZ = new Object() { // from class: X.87I
        };
        LLIFFJFJJ = C7MY.LIZIZ(76);
        LLII = C7MY.LIZIZ(56);
        LLIIII = AnonymousClass391.LIZ(22.5d);
    }

    public final synchronized void b4() {
        if (this.LLFII) {
            return;
        }
        C8VR.LIZ(this, new AqS169S0100000_3(this, 189));
        this.LLFII = true;
    }

    public final RightAreaContainerVM Z3() {
        return (RightAreaContainerVM) this.LLF.LIZ(this, LLI[0]);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        M89 m89;
        Context context;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        ISearchService LLLZI = SearchServiceImpl.LLLZI();
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        BaseFeedPageParams baseFeedPageParams = item.baseFeedPageParams;
        if (baseFeedPageParams != null) {
            m89 = baseFeedPageParams.param;
        } else {
            m89 = null;
        }
        if (LLLZI.LJI(aweme, m89) && (context = getContext()) != null && !C79004UzY.LJJIJIIJI(context)) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(TakoAssem.class));
        }
    }

    public final void a4(boolean z) {
        if (z) {
            View containerView = getContainerView();
            if (containerView.getVisibility() != 0) {
                containerView.post(new ARunnableS39S0100000_3(this, 57));
                return;
            }
            return;
        }
        getContainerView().setVisibility(8);
        getContainerView().postDelayed(new ARunnableS39S0100000_3(this, 58), 100L);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        RelativeLayout.LayoutParams layoutParams;
        o.LJIIIZ(view, "view");
        a4(false);
        Z3().getClass();
        View findViewById = view.findViewById(R.id.acg);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.avatar_layout)");
        findViewById.setTag(R.id.bpz, "feed_avatar");
        View findViewById2 = view.findViewById(R.id.c_v);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.digg_layout)");
        findViewById2.setTag(R.id.bpz, "feed_digg");
        View findViewById3 = view.findViewById(R.id.bkv);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.comment_layout)");
        findViewById3.setTag(R.id.bpz, "feed_comment");
        View findViewById4 = view.findViewById(R.id.jtg);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.share_layout)");
        findViewById4.setTag(R.id.bpz, "feed_share");
        if (!C79004UzY.LJJIJIIJI(view.getContext())) {
            View findViewById5 = view.findViewById(R.id.gmn);
            o.LJIIIIZZ(findViewById5, "findViewById(R.id.more_layout)");
            findViewById5.setTag(R.id.bpz, "feed_more");
        }
        if (FavoriteServiceImpl.LJIJJLI().LJI() > 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            int LJJIIZ = (LLIFFJFJJ - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C204257zx.LJ())))) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(C204257zx.LIZLLL())));
            Context context = getContext();
            if (context != null && C79004UzY.LJJIJIIJI(context)) {
                if (C209418Jt.LIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()).LIZ()) {
                    if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                        layoutParams3.addRule(12);
                        layoutParams3.addRule(21);
                        layoutParams3.setMarginEnd(LLII);
                    }
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.j2q);
                    linearLayout.setOrientation(0);
                    C45804HyK.LJJL(LLIIII, linearLayout);
                } else {
                    if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams2).addRule(12);
                    }
                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.j2q);
                    linearLayout2.setGravity(1);
                    C45804HyK.LJJL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)) + LLIIII, linearLayout2);
                    if (C8D3.LIZIZ()) {
                        C45804HyK.LJJLI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), linearLayout2);
                    }
                }
            } else if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.bottomMargin = LJJIIZ;
            }
            view.setLayoutParams(layoutParams2);
        }
        if (((Boolean) C35183DrP.LJIILJJIL.getValue()).booleanValue()) {
            if (!C54838Lfe.LJJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                C37179EiV.LIZ().postAtFrontOfQueue(new ARunnableS39S0100000_3(this, 59));
            } else {
                b4();
            }
        } else {
            b4();
        }
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 302);
        if (C3YP.LIZ()) {
            C214368bA.LIZ().execute(new ARunnableS39S0100000_3((Object) aqS153S0100000_3, 60));
        } else {
            aqS153S0100000_3.invoke();
        }
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.87E
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), C87B.LJLIL, 4);
    }

    public RightAreaContainerAssem(C74220TAy assemSwitchHelper, BaseFeedPageParams params, InterfaceC65784Pro<Long> infoProvider) {
        o.LJIIIZ(assemSwitchHelper, "assemSwitchHelper");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(infoProvider, "infoProvider");
        new LinkedHashMap();
        this.LJZL = assemSwitchHelper;
        this.LL = params;
        this.LLD = infoProvider;
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RightAreaContainerVM.class);
        this.LLF = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 303), null, C87F.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoDiggVM.class);
        this.LLFF = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 304), null, C87G.INSTANCE, null, null);
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C87H.INSTANCE);
    }
}
