package com.ss.android.ugc.aweme.nows.interaction.viewmodel;

import X.AbstractC193937jJ;
import X.AnonymousClass030;
import X.C10K;
import X.C1799074g;
import X.C181847Bs;
import X.C182997Gd;
import X.C183007Ge;
import X.C193927jI;
import X.C194147je;
import X.C195937mX;
import X.C33Q;
import X.C36411bp;
import X.C43I;
import X.C48203Ivv;
import X.C65352Pkq;
import X.C78847Ux1;
import X.C79004UzY;
import X.C7AH;
import X.C7MK;
import X.C7ML;
import X.InterfaceC1798974f;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.K02;
import X.TBV;
import Y.ACallableS106S0100000_3;
import Y.AgS27S0301000_3;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowLikeViewModel extends NowInteractionBaseViewModel<C7AH> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public boolean LJLJI;
    public final C36411bp LJLILLLLZI = new C36411bp((InterfaceC65784Pro) C182997Gd.LJLIL);
    public final boolean LJLJJI = true;

    static {
        TBV tbv = new TBV(NowLikeViewModel.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C7AH(null, null, 63);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean isHolderVM() {
        return this.LJLJJI;
    }

    public static long iv0(C7ML c7ml) {
        long j;
        AwemeStatistics statistics = c7ml.getAweme().getStatistics();
        if (statistics != null) {
            j = statistics.getDiggCount();
        } else {
            j = 0;
        }
        if (c7ml.getAweme().getUserDigg() == 1 && j == 0) {
            return 1L;
        }
        return j;
    }

    public final void jv0(boolean z) {
        Aweme aweme;
        C7ML gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            aweme.setUserDigg(z ? 1 : 0);
            if (aweme.getStatistics() == null) {
                return;
            }
            if (z) {
                AwemeStatistics statistics = aweme.getStatistics();
                statistics.setDiggCount(statistics.getDiggCount() + 1);
            } else if (aweme.getStatistics().getDiggCount() > 0) {
                aweme.getStatistics().setDiggCount(r4.getDiggCount() - 1);
            }
        }
        setState(new AqS46S0110000_3(z, this, 6));
    }

    @Override // com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowInteractionBaseViewModel
    public final C7AH hv0(C7AH state, C7ML item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        boolean z = true;
        if (item.getAweme().getUserDigg() != 1) {
            z = false;
        }
        return new C7AH(new C43I(Boolean.valueOf(z)), new C43I(Long.valueOf(iv0(item))), 57);
    }

    public final void mv0(int i, long j) {
        Aweme aweme;
        C7ML gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            aweme.setUserDigg(i);
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                statistics.setDiggCount(j);
            }
        }
        setState(new AqS93S0101000_3(i, this, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lv0(boolean z, AbstractC193937jJ abstractC193937jJ, C181847Bs c181847Bs, int i) {
        String str;
        String str2;
        String str3;
        C7ML gv0 = gv0();
        if (gv0 == null) {
            return;
        }
        if (this.LJLJI) {
            str = "click_double_like";
        } else {
            str = "click_like";
        }
        String str4 = ((C7AH) getState()).LJLJJL;
        String str5 = "homepage_now";
        if (str4 == null) {
            str4 = "homepage_now";
        }
        boolean LJIIL = C195937mX.LJIIL(gv0.getAweme().getAuthor(), ((C7AH) getState()).LJLJJLL);
        if (!o.LJ(abstractC193937jJ, C193927jI.LIZ)) {
            str5 = c181847Bs.LJLJJL;
        }
        if (z) {
            str2 = "like";
        } else {
            str2 = "like_cancel";
        }
        C183007Ge c183007Ge = new C183007Ge(str2);
        c183007Ge.LJLIIIL = 1;
        c183007Ge.LJJLL = str;
        c183007Ge.LIZLLL = str4;
        c183007Ge.LJJLIIIJL = str5;
        c183007Ge.LJIILL = "now";
        c183007Ge.LJJIIZ(gv0.getAweme());
        c183007Ge.LJJLIIIIJ = gv0.getAweme().getRequestId();
        c183007Ge.LJLZ = str4;
        c183007Ge.LJJJJZ = C7MK.LIZ(gv0.getAweme().getAuthor());
        NowPostInfo nowPostInfo = gv0.getAweme().nowPostInfo;
        if (nowPostInfo == null || (str3 = nowPostInfo.getNowMediaType()) == null) {
            str3 = "post";
        }
        c183007Ge.LL = str3;
        c183007Ge.LLD = C79004UzY.LJJJIL((Context) this.LJLILLLLZI.LIZIZ(LJLJJL[0]), gv0.getAweme());
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        c183007Ge.LJ("interaction_type", "reaction", c1799074g);
        c183007Ge.LJ("enter_position", C7MK.LJ(c181847Bs.LJLJJI, gv0), c1799074g);
        c183007Ge.LIZJ(i, "is_now_clear");
        c183007Ge.LIZJ(C78847Ux1.LJJIJIL(gv0), "has_small_window");
        c183007Ge.LIZJ(C78847Ux1.LJJJJ(gv0.getAweme()), "is_original");
        if (z) {
            c183007Ge.LIZ(K02.LIZIZ("like", gv0.getAweme(), str4));
            c183007Ge.LIZLLL("now_card_type", C7MK.LIZIZ(gv0.getAweme()));
            c183007Ge.LIZJ(LJIIL ? 1 : 0, "is_blue_v_user");
            c183007Ge.LIZJ(abstractC193937jJ.LIZIZ(), "is_new_page");
            if (o.LJ(abstractC193937jJ, C194147je.LIZ)) {
                c183007Ge.LIZLLL("now_tab_enter_method", c181847Bs.LJLJJLL);
            }
        } else {
            c183007Ge.LIZ(K02.LIZIZ("like_cancel", gv0.getAweme(), str4));
        }
        c183007Ge.LJIILIIL();
    }

    public final void kv0(View view, boolean z, AbstractC193937jJ scene, C181847Bs nowsFeedHierarchyData, int i) {
        Aweme aweme;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(nowsFeedHierarchyData, "nowsFeedHierarchyData");
        C7ML gv0 = gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null) {
            return;
        }
        Context context = (Context) this.LJLILLLLZI.LIZIZ(LJLJJL[0]);
        if (context != null && !C48203Ivv.LJ(context)) {
            AnonymousClass030.LJ(view, R.string.img);
            return;
        }
        if (aweme.getUserDigg() == 1) {
            if (z) {
                return;
            }
            jv0(false);
            this.LJLJI = false;
            C10K LIZJ = C10K.LIZJ(new ACallableS106S0100000_3(aweme, 12));
            o.LJIIIIZZ(LIZJ, "aweme: Aweme) : Task<Boo…kground likeUpdated\n    }");
            LIZJ.LJ(new AgS27S0301000_3(this, scene, nowsFeedHierarchyData, i, 0), C10K.LJIIIIZZ, null);
            return;
        }
        jv0(true);
        this.LJLJI = z;
        C10K LIZJ2 = C10K.LIZJ(new ACallableS106S0100000_3(aweme, 11));
        o.LJIIIIZZ(LIZJ2, "aweme: Aweme) : Task<Boo…kground likeUpdated\n    }");
        LIZJ2.LJ(new AgS27S0301000_3(this, scene, nowsFeedHierarchyData, i, 1), C10K.LJIIIIZZ, null);
    }
}
