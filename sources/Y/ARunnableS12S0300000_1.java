package Y;

import X.AV1;
import X.AbstractC1029742j;
import X.AbstractC48820JEa;
import X.C1034444e;
import X.C107794Kx;
import X.C109544Rq;
import X.C111684Zw;
import X.C116144h8;
import X.C116194hD;
import X.C139825eE;
import X.C2MA;
import X.C2MM;
import X.C34K;
import X.C35168DrA;
import X.C3KH;
import X.C3L4;
import X.C3Q9;
import X.C3TV;
import X.C3TZ;
import X.C47135Ieh;
import X.C47959Irz;
import X.C4I8;
import X.C53119Kt1;
import X.C56742Ko;
import X.C56752Kp;
import X.C58152Pz;
import X.C60692Zt;
import X.C68322mC;
import X.C777333h;
import X.C78685UuP;
import X.C78996UzQ;
import X.C82682Wcg;
import X.C84443Tc;
import X.C84453Td;
import X.C9K4;
import X.FMW;
import X.InterfaceC1029942l;
import X.InterfaceC48720JAe;
import X.InterfaceC57784Mm4;
import X.InterfaceC59191NKx;
import X.InterfaceC75532xp;
import X.InterfaceC82683Wch;
import X.InterfaceC82689Wcn;
import X.InterfaceC84463Te;
import X.WHL;
import X.WM7;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.assem.TrendingBillboardHeaderAssem;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import com.ss.android.ugc.feed.platform.panel.player.PlayerPanelComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ARunnableS12S0300000_1 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Resources resources;
        String string;
        Context context = ((QnaAskQuestionFragment) this.l0).getContext();
        if (context != null && (resources = context.getResources()) != null && (string = resources.getString(R.string.po_, AV1.LIZLLL((User) this.l1))) != null) {
            QnaAskQuestionFragment qnaAskQuestionFragment = (QnaAskQuestionFragment) this.l0;
            View view = (View) this.l2;
            Context context2 = qnaAskQuestionFragment.getContext();
            o.LJI(context2);
            C139825eE c139825eE = new C139825eE(context2);
            c139825eE.LIZIZ(view);
            c139825eE.LJI(WHL.TOP);
            c139825eE.LIZJ = string;
            C82682Wcg c82682Wcg = c139825eE.LIZ;
            c82682Wcg.LJII = 3000L;
            c82682Wcg.LJIIIZ = true;
            c139825eE.LIZJ().show();
        }
    }

    public final void LIZ$1() {
        if (((C56752Kp) ((InterfaceC59191NKx) this.l0)).LIZJ.FQ() == 0) {
            ((InterfaceC48720JAe) this.l1).LJI(((C56752Kp) ((InterfaceC59191NKx) this.l0)).LIZIZ, (Context) this.l2, ((C56752Kp) ((InterfaceC59191NKx) this.l0)).LIZLLL.mAdapter.Q8());
            ((C56752Kp) ((InterfaceC59191NKx) this.l0)).LIZIZ().removeCallbacks(this);
            return;
        }
        ((C56752Kp) ((InterfaceC59191NKx) this.l0)).LIZIZ().postDelayed(this, 100L);
    }

    public final void LIZ$2() {
        User author = ((Aweme) this.l0).getAuthor();
        if (author != null && author.getFollowStatus() == 2 && ((Boolean) C53119Kt1.LIZJ.getValue()).booleanValue() && C78685UuP.LJJJZ(author.getSecUid()) && o.LJ(author.getUid(), ((FollowStatus) this.l1).userId)) {
            IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJII(author, new AqS151S0100000_1((FeedAvatarDefaultAssem) this.l2, 60));
        }
    }

    public final void LIZ$3() {
        if (((C107794Kx) this.l0).LJLJJL == "personal_homepage") {
            ((C111684Zw) this.l1).setElevation(0.0f);
            C111684Zw c111684Zw = (C111684Zw) this.l1;
            Context context = (Context) this.l2;
            ViewGroup.LayoutParams layoutParams = c111684Zw.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = C47959Irz.LIZJ(1, context.getResources().getDimensionPixelOffset(R.dimen.a8c));
                c111684Zw.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void LIZ$4() {
        int LIZ = C47135Ieh.LIZ(16, C47135Ieh.LIZ(12, ((FrameLayout) this.l0).getWidth()));
        TuxTextView tuxTextView = ((TrendingBillboardHeaderAssem) this.l1).LJLL;
        if (tuxTextView != null) {
            tuxTextView.LJJJ(70.0f);
            TuxTextView tuxTextView2 = ((TrendingBillboardHeaderAssem) this.l1).LJLL;
            if (tuxTextView2 != null) {
                float f = LIZ;
                if (tuxTextView2.getPaint().measureText(((CharSequence) this.l2).toString()) > f) {
                    TuxTextView tuxTextView3 = ((TrendingBillboardHeaderAssem) this.l1).LJLL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.LJJJ(56.0f);
                        TuxTextView tuxTextView4 = ((TrendingBillboardHeaderAssem) this.l1).LJLL;
                        if (tuxTextView4 != null) {
                            if (tuxTextView4.getPaint().measureText(((CharSequence) this.l2).toString()) > f) {
                                TuxTextView tuxTextView5 = ((TrendingBillboardHeaderAssem) this.l1).LJLL;
                                if (tuxTextView5 != null) {
                                    tuxTextView5.LJJJ(48.0f);
                                } else {
                                    o.LJIJI("trendingText");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("trendingText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("trendingText");
                        throw null;
                    }
                }
                TuxTextView tuxTextView6 = ((TrendingBillboardHeaderAssem) this.l1).LJLL;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText((CharSequence) this.l2);
                    return;
                } else {
                    o.LJIJI("trendingText");
                    throw null;
                }
            }
            o.LJIJI("trendingText");
            throw null;
        }
        o.LJIJI("trendingText");
        throw null;
    }

    public final void LIZ$5() {
        String str;
        String LJII = ((PlayerComponentTemp) this.l0).LJII((C2MA) this.l2, (Aweme) this.l1, false);
        C58152Pz.LIZJ("tryPlay", LJII);
        if (C35168DrA.LIZ()) {
            C9K4 c9k4 = C9K4.LIZ;
            C56742Ko c56742Ko = new C56742Ko();
            c56742Ko.LIZ(C78996UzQ.LJIIL((Aweme) this.l1), "aid");
            c56742Ko.LIZ("PlayerController", "caller");
            c56742Ko.LIZ(LJII, "result");
            BaseListFragmentPanel baseListFragmentPanel = ((PlayerComponentTemp) this.l0).LJLIL;
            if (baseListFragmentPanel == null || (str = baseListFragmentPanel.getEventType()) == null) {
                str = "";
            }
            c56742Ko.LIZ(str, WM7.SCENE_SERVICE);
            c56742Ko.LIZ("tryPlay", "source");
            C9K4.LJ(c9k4, c56742Ko.LIZ, C78996UzQ.LJIIL((Aweme) this.l1), null, 28);
        }
    }

    public final void LIZ$6() {
        Set set = (Set) this.l0;
        C3KH c3kh = (C3KH) this.l2;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            LiveData liveData = (LiveData) ((ConcurrentHashMap) c3kh.LJLJJL).remove(it.next());
            if (liveData != null) {
                liveData.removeObserver(c3kh.LJLJL);
            }
        }
        Set<String> set2 = (Set) this.l1;
        C3KH c3kh2 = (C3KH) this.l2;
        for (String str : set2) {
            if (!AV1.LJIJI(str)) {
                ((ConcurrentHashMap) c3kh2.LJLJJL).put(str, c3kh2.LJIIIZ(str));
            }
        }
    }

    public final void LIZ$7() {
        C139825eE c139825eE = new C139825eE((Context) this.l0);
        c139825eE.LIZIZ((View) this.l1);
        c139825eE.LIZ.LJIIIZ = true;
        c139825eE.LJI(WHL.BOTTOM);
        c139825eE.LJIIJJI(R.string.gxu);
        final Keva keva = (Keva) this.l2;
        c139825eE.LIZ.LJJII = new InterfaceC82689Wcn() { // from class: X.4IA
            @Override // X.InterfaceC82689Wcn
            public final void onShow() {
                Keva.this.storeBoolean("im_key_guide_show", true);
            }
        };
        InterfaceC82683Wch LIZJ = c139825eE.LIZJ();
        C4I8.LIZIZ = LIZJ;
        LIZJ.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$8() {
        if (o.LJ("comment_preload_task", ((C60692Zt) ((C68322mC) this.l0).element).LIZ)) {
            ((C34K) this.l2).element = C2MM.LIZ().LIZ(((C777333h) this.l1).LIZLLL, ((C777333h) this.l1).LJFF, false, ((C777333h) this.l1).LJ);
        } else {
            if (!o.LJ("profile_preload_task", ((C60692Zt) ((C68322mC) this.l0).element).LIZ)) {
                return;
            }
            ((C34K) this.l2).element = C2MM.LIZ().LIZ(((C777333h) this.l1).LIZLLL, ((C777333h) this.l1).LJFF, true, ((C777333h) this.l1).LJ);
        }
    }

    public static final void run$0(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            aRunnableS12S0300000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            aRunnableS12S0300000_1.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            List list = (List) aRunnableS12S0300000_1.l0;
            if (list != null) {
                list.add((C116144h8) aRunnableS12S0300000_1.l1);
            }
            List<? extends InterfaceC57784Mm4> list2 = (List) aRunnableS12S0300000_1.l0;
            if (list2 != null) {
                ((C116194hD) aRunnableS12S0300000_1.l2).LIZ.LIZIZ(list2, true);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            ((LiveData) aRunnableS12S0300000_1.l0).observe((LifecycleOwner) aRunnableS12S0300000_1.l1, (Observer) aRunnableS12S0300000_1.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            ((LiveData) aRunnableS12S0300000_1.l0).observe((LifecycleOwner) aRunnableS12S0300000_1.l1, (Observer) aRunnableS12S0300000_1.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            C3TV c3tv = C3TV.LIZ;
            C3L4 c3l4 = (C3L4) aRunnableS12S0300000_1.l0;
            C3Q9 c3q9 = (C3Q9) aRunnableS12S0300000_1.l1;
            InterfaceC75532xp interfaceC75532xp = (InterfaceC75532xp) aRunnableS12S0300000_1.l2;
            c3tv.getClass();
            C3TV.LJ(c3q9, interfaceC75532xp, c3l4);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        int i;
        try {
            C1034444e c1034444e = (C1034444e) aRunnableS12S0300000_1.l0;
            View view = (View) aRunnableS12S0300000_1.l1;
            C109544Rq c109544Rq = (C109544Rq) aRunnableS12S0300000_1.l2;
            RecyclerView recyclerView = c1034444e.LIZIZ.LJLJLLL;
            if (recyclerView != null) {
                i = recyclerView.getWidth();
            } else {
                i = 0;
            }
            c1034444e.LJ(i, view, c109544Rq);
            ((C1034444e) aRunnableS12S0300000_1.l0).LJFF((C109544Rq) aRunnableS12S0300000_1.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            aRunnableS12S0300000_1.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            aRunnableS12S0300000_1.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            aRunnableS12S0300000_1.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            Runnable runnable = (Runnable) aRunnableS12S0300000_1.l0;
            if (runnable != null) {
                runnable.run();
            }
            AbstractC1029742j abstractC1029742j = (AbstractC1029742j) aRunnableS12S0300000_1.l1;
            List<? extends C109544Rq> list = (List) aRunnableS12S0300000_1.l2;
            Iterator<InterfaceC1029942l> it = abstractC1029742j.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().Vj(list);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            if (o.LJ((InterfaceC84463Te) aRunnableS12S0300000_1.l0, C84453Td.LIZ)) {
                ((INetworkStandardUIService) aRunnableS12S0300000_1.l1).showNetworkToast(((C3TZ) aRunnableS12S0300000_1.l2).LJLIL, C84443Tc.LIZ, "");
            } else {
                ((INetworkStandardUIService) aRunnableS12S0300000_1.l1).showNetworkToast(((C3TZ) aRunnableS12S0300000_1.l2).LJLIL, (InterfaceC84463Te) aRunnableS12S0300000_1.l0, "");
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            aRunnableS12S0300000_1.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            if (o.LJ((InterfaceC84463Te) aRunnableS12S0300000_1.l0, C84453Td.LIZ)) {
                ((INetworkStandardUIService) aRunnableS12S0300000_1.l1).showNetworkToast((Activity) aRunnableS12S0300000_1.l2, C84443Tc.LIZ, "");
            } else {
                ((INetworkStandardUIService) aRunnableS12S0300000_1.l1).showNetworkToast((Activity) aRunnableS12S0300000_1.l2, (InterfaceC84463Te) aRunnableS12S0300000_1.l0, "");
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            aRunnableS12S0300000_1.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            aRunnableS12S0300000_1.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            aRunnableS12S0300000_1.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            FMW.LIZ(new ARunnableS12S0300000_1((PlayerComponentTemp) aRunnableS12S0300000_1.l0, (Aweme) aRunnableS12S0300000_1.l1, (C2MA) aRunnableS12S0300000_1.l2, 6));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            String I3 = ((PlayerPanelComponent) aRunnableS12S0300000_1.l0).I3((C2MA) aRunnableS12S0300000_1.l2, (Aweme) aRunnableS12S0300000_1.l1, false);
            AbstractC48820JEa v3 = ((PlayerPanelComponent) aRunnableS12S0300000_1.l0).v3();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[tryPlayWhenOnPageSelected] ");
            LIZ2.append(I3);
            v3.LJII((Aweme) aRunnableS12S0300000_1.l1, X1D.LIZIZ(LIZ2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS12S0300000_1 aRunnableS12S0300000_1) {
        boolean LIZ;
        try {
            FMW.LIZ(new ARunnableS12S0300000_1((PlayerPanelComponent) aRunnableS12S0300000_1.l0, (Aweme) aRunnableS12S0300000_1.l1, (C2MA) aRunnableS12S0300000_1.l2, 8));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS12S0300000_1(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
