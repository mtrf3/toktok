package com.ss.android.ugc.aweme.feed.assem.ffpbutton;

import X.C213688a4;
import X.C214348b8;
import X.C225998tv;
import X.C226028ty;
import X.C226038tz;
import X.C226048u0;
import X.C226668v0;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import X.C8YN;
import X.C9BD;
import X.EnumC57853MnB;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.L2J;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FollowButtonFFPAssem extends BaseCellSlotComponent<FollowButtonFFPAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public RelationButton LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final C5H3 LLI;
    public final boolean LLIFFJFJJ;

    static {
        TBT tbt = new TBT(FollowButtonFFPAssem.class, "followBtnVM", "getFollowBtnVM()Lcom/ss/android/ugc/aweme/feed/assem/ffpbutton/FollowButtonFFPViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aa8;
    }

    public FollowButtonFFPAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FollowButtonFFPViewModel.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 331), null, C226028ty.INSTANCE, null, null);
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C226038tz.INSTANCE);
        this.LLIFFJFJJ = L2J.LIZ();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        User user;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        RelationButton relationButton = this.LLFII;
        if (relationButton != null) {
            C226668v0 c226668v0 = new C226668v0();
            Aweme aweme = item.getAweme();
            if (aweme != null) {
                user = aweme.getAuthor();
            } else {
                user = null;
            }
            c226668v0.LIZ = user;
            c226668v0.LJIIIZ = getHostLifecycleOwner();
            c226668v0.LIZJ(EnumC57853MnB.TUX_SEMI_TRANSPARENT);
            c226668v0.LIZIZ = true;
            c226668v0.LJIIIIZZ = true;
            relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
            RelationButton relationButton2 = this.LLFII;
            if (relationButton2 != null) {
                relationButton2.setTracker(new AqS150S0200000_3(this, item, 60));
                RelationButton relationButton3 = this.LLFII;
                if (relationButton3 != null) {
                    int i = 0;
                    this.LLFZ.LIZ(this, LLII[0]).getClass();
                    if (item.getAweme().getAuthor().getFollowStatus() != 0 || item.getAweme().isAd()) {
                        i = 8;
                    }
                    relationButton3.setVisibility(i);
                    return;
                }
                o.LJIJI("relationButton");
                throw null;
            }
            o.LJIJI("relationButton");
            throw null;
        }
        o.LJIJI("relationButton");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        getContainerView().post(new ARunnableS39S0100000_3(this, 64));
        View findViewById = view.findViewById(R.id.dk5);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.follow_button_hide)");
        RelationButton relationButton = (RelationButton) findViewById;
        this.LLFII = relationButton;
        if (this.LLIFFJFJJ) {
            ViewGroup.LayoutParams layoutParams = relationButton.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C7MY.LIZIZ(32);
                relationButton.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.8tr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLLILLLL;
            }
        }, null, C225998tv.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.LIZ(this, LLII[0]), new TBT() { // from class: X.8tx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C226008tw) obj).LJLIL);
            }
        }, C213688a4.LJ(), C226048u0.LJLIL, 4);
        RelationButton relationButton2 = this.LLFII;
        if (relationButton2 != null) {
            relationButton2.setDataChangeListener(new AqS169S0100000_3(this, 200));
        } else {
            o.LJIJI("relationButton");
            throw null;
        }
    }
}
