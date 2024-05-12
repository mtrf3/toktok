package Y;

import X.ActivityC45651qj;
import X.C0A2;
import X.C15890jp;
import X.C1794972r;
import X.C210118Ml;
import X.C212428Vi;
import X.C222038nX;
import X.C26045AKb;
import X.C2MA;
import X.C32151Nz;
import X.C32420Cnw;
import X.C62198Ob4;
import X.C62846OlW;
import X.C63081OpJ;
import X.C78866UxK;
import X.C78923UyF;
import X.C7MY;
import X.C7WD;
import X.C84B;
import X.C84E;
import X.C8NS;
import X.KL2;
import X.PU1;
import X.PU2;
import X.SYL;
import X.X1D;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.feed.assem.duetbutton.VideoDuetButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.stitchbutton.VideoStitchButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionListAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveUserFeedComponent;
import com.ss.android.ugc.aweme.topic.ui.TopicFloatingActionAssem;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponentV2;
import com.ss.android.ugc.feed.platform.cell.interact.top.topwarn.TopWarnAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ARunnableS7S0101000_3 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        DanmakuPresentAssem danmakuPresentAssem;
        int i;
        int i2;
        IMFToolBarAbility iMFToolBarAbility;
        int i3;
        int LIZIZ;
        int i4;
        Rect bc;
        View view;
        View findViewById;
        Integer Do0;
        MainActivityScope LJJLIIIJJI;
        View view2 = ((DanmakuPresentAssem) this.l0).LLIIL;
        Integer num = null;
        if (view2 != null && view2.getParent() != null && (i2 = (danmakuPresentAssem = (DanmakuPresentAssem) this.l0).LLIIIJ) != (i = this.i1) && Math.abs(i2 - i) > 10) {
            danmakuPresentAssem.LLIIIJ = i;
            ActivityC45651qj LIZ = C212428Vi.LIZ(danmakuPresentAssem);
            if (LIZ != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZ)) != null) {
                iMFToolBarAbility = C78923UyF.LJIJJ(LJJLIIIJJI);
            } else {
                iMFToolBarAbility = null;
            }
            Context context = danmakuPresentAssem.getContext();
            int i5 = 0;
            if (context != null) {
                i3 = C63081OpJ.LJJJJLI(context);
            } else {
                i3 = 0;
            }
            if (iMFToolBarAbility != null && (Do0 = iMFToolBarAbility.Do0()) != null) {
                LIZIZ = Do0.intValue();
            } else {
                LIZIZ = C7MY.LIZIZ(58);
            }
            int i6 = i3 + LIZIZ;
            Fragment LIZLLL = C212428Vi.LIZLLL(danmakuPresentAssem);
            if (LIZLLL != null && (view = LIZLLL.getView()) != null && (findViewById = view.findViewById(DanmakuPresentAssem.LLILLIZIL.LJIILIIL())) != null) {
                i4 = findViewById.getBottom();
            } else {
                i4 = 0;
            }
            TopWarnAbility topWarnAbility = (TopWarnAbility) danmakuPresentAssem.LLILII.getValue();
            if (topWarnAbility != null && (bc = topWarnAbility.bc()) != null) {
                i5 = bc.bottom;
            }
            int max = Math.max(i4, Math.max(i6, i5));
            ViewGroup.LayoutParams layoutParams = danmakuPresentAssem.getContainerView().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            float LJII = danmakuPresentAssem.LLII.LJII();
            float LJFF = danmakuPresentAssem.LLII.LJFF();
            float LJI = danmakuPresentAssem.LLII.LJI();
            float f = max + LJII;
            float f2 = i;
            if (danmakuPresentAssem.LLII.LJ() + f + LJII <= f2) {
                int i7 = (int) ((4 * LJI) + (LJFF * 3));
                layoutParams2.height = i7;
                layoutParams2.topMargin = (int) ((LJI / 2) + ((f2 - LJII) - i7));
                danmakuPresentAssem.LLIIII.LIZJ.LIZ(3);
            } else if (danmakuPresentAssem.LLII.LIZLLL() + f + LJII <= f2) {
                float f3 = 2;
                int i8 = (int) ((3 * LJI) + (LJFF * f3));
                layoutParams2.height = i8;
                layoutParams2.topMargin = (int) ((LJI / f3) + ((f2 - LJII) - i8));
                danmakuPresentAssem.LLIIII.LIZJ.LIZ(2);
            } else if (danmakuPresentAssem.LLII.LIZJ() + f + LJII <= f2) {
                int i9 = (int) (LJFF + LJI);
                layoutParams2.height = i9;
                layoutParams2.topMargin = (int) ((LJI / 2) + ((f2 - LJII) - i9));
                danmakuPresentAssem.LLIIII.LIZJ.LIZ(1);
            } else {
                layoutParams2.height = (int) (LJFF + LJI);
                layoutParams2.topMargin = (int) f;
                danmakuPresentAssem.LLIIII.LIZJ.LIZ(1);
            }
            StringBuilder LJ = C7MY.LJ("initLayout: bottomHeight ", max, ", height ");
            C15890jp.LIZIZ(LJ, layoutParams2.height, ", viewTop: ", i, ", statusBarHeight:");
            Context context2 = danmakuPresentAssem.getContext();
            if (context2 != null) {
                num = Integer.valueOf(C63081OpJ.LJJJJLI(context2));
            }
            LJ.append(num);
            X1D.LIZIZ(LJ);
            danmakuPresentAssem.getContainerView().setLayoutParams(layoutParams2);
        }
    }

    public final void LIZ$1() {
        ActivityC45651qj requireActivity = ((CollectionContentFragment) this.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C26045AKb c26045AKb = new C26045AKb(requireActivity);
        Resources resources = ((CollectionContentFragment) this.l0).getResources();
        int i = this.i1;
        c26045AKb.LJIIIZ(resources.getQuantityString(R.plurals.fk, i, String.valueOf(i)));
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LJIIJ();
    }

    public final void LIZ$2() {
        View view;
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        int i = rect.top;
        int i2 = this.i1;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        Object parent = ((View) this.l0).getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        view.setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$3() {
        if (this.i1 < ((C84B) this.l0).LJLJL.size()) {
            ((View) ListProtector.get(((C84B) this.l0).LJLJL, this.i1)).setAlpha(1.0f);
            ((ImageView) ListProtector.get(((C84B) this.l0).LJLJL, this.i1)).setImageResource(R.drawable.aj_);
        }
    }

    public final void LIZ$4() {
        C62846OlW roundImageView = ((C62198Ob4) this.l0).getRoundImageView();
        C62198Ob4 c62198Ob4 = (C62198Ob4) this.l0;
        int i = this.i1;
        float LJIIZILJ = C32151Nz.LJIIZILJ(Float.valueOf(308.0f));
        ViewGroup.LayoutParams layoutParams = c62198Ob4.getRoundImageView().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        float LJIIL = i - KL2.LJIIL(c62198Ob4.getContext());
        float min = Math.min(LJIIZILJ, 0.8f * LJIIL);
        float min2 = Math.min(C32151Nz.LJIIZILJ(40), (LJIIL - min) * 0.25f);
        layoutParams2.height = (int) min;
        layoutParams2.width = (int) (0.75f * min);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) min2;
        roundImageView.setLayoutParams(layoutParams2);
    }

    public final void LIZ$5() {
        C7WD c7wd = (C7WD) ((HashMap) PU1.LIZIZ).get(((C32420Cnw) this.l0).LIZ);
        if (c7wd == null) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) c7wd.LIZIZ).iterator();
        while (it.hasNext()) {
            ((PU2) it.next()).onProgress(this.i1);
        }
    }

    public static final void run$0(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            ((VideoDuetButtonAssem) aRunnableS7S0101000_3.l0).getContainerView().setVisibility(aRunnableS7S0101000_3.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            aRunnableS7S0101000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            PostModePhotosComponentV2 postModePhotosComponentV2 = (PostModePhotosComponentV2) aRunnableS7S0101000_3.l0;
            ActivityC45651qj activityC45651qj = postModePhotosComponentV2.LJLIL.LIZIZ;
            Aweme aweme = postModePhotosComponentV2.LJLILLLLZI.getAweme();
            o.LJIIIIZZ(aweme, "videoItemParams.aweme");
            C8NS.LJII(activityC45651qj, aweme, aRunnableS7S0101000_3.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            C210118Ml c210118Ml = (C210118Ml) aRunnableS7S0101000_3.l0;
            if (c210118Ml != null) {
                c210118Ml.LJ(aRunnableS7S0101000_3.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            ((View) aRunnableS7S0101000_3.l0).setVisibility(aRunnableS7S0101000_3.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            ((VideoStitchButtonAssem) aRunnableS7S0101000_3.l0).getContainerView().setVisibility(aRunnableS7S0101000_3.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            if (Math.abs(aRunnableS7S0101000_3.i1 - ((C84E) aRunnableS7S0101000_3.l0).LJLJJI) > 1) {
                int i = aRunnableS7S0101000_3.i1;
                C84E c84e = (C84E) aRunnableS7S0101000_3.l0;
                if (i < c84e.LJLJL) {
                    ((ImageView) ListProtector.get(c84e.LJLJLJ, i)).setImageResource(R.drawable.un);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            ((StoryImmersiveUserFeedComponent) aRunnableS7S0101000_3.l0).c4().LIZ(aRunnableS7S0101000_3.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            ((C1794972r) aRunnableS7S0101000_3.l0).setCurrentItem(aRunnableS7S0101000_3.i1, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        LinearLayoutManager linearLayoutManager;
        try {
            SYL syl = ((NowOtherCollectionListAssem) aRunnableS7S0101000_3.l0).LJZL;
            if (syl != null) {
                C0A2 layoutManager = syl.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    linearLayoutManager.LJFF(aRunnableS7S0101000_3.i1, 0);
                    return;
                }
                return;
            }
            o.LJIJI("list");
            throw null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            aRunnableS7S0101000_3.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            ((CommentListPageFragment) aRunnableS7S0101000_3.l0).Vl(aRunnableS7S0101000_3.i1, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            aRunnableS7S0101000_3.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            ((VideoAuthorInfoRelationAssem) aRunnableS7S0101000_3.l0).getContainerView().setVisibility(aRunnableS7S0101000_3.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            aRunnableS7S0101000_3.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            TopicFloatingActionAssem topicFloatingActionAssem = (TopicFloatingActionAssem) aRunnableS7S0101000_3.l0;
            topicFloatingActionAssem.LJLZ = aRunnableS7S0101000_3.i1;
            topicFloatingActionAssem.O3();
            ((TopicFloatingActionAssem) aRunnableS7S0101000_3.l0).M3().animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            aRunnableS7S0101000_3.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        try {
            aRunnableS7S0101000_3.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS7S0101000_3 aRunnableS7S0101000_3) {
        boolean LIZ;
        C2MA Y6;
        try {
            C222038nX c222038nX = (C222038nX) aRunnableS7S0101000_3.l0;
            if (c222038nX.LL && (Y6 = c222038nX.Y6()) != null) {
                Y6.l8(aRunnableS7S0101000_3.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S0101000_3(View view, int i) {
        this.$t = i;
        this.l0 = view;
        this.i1 = 8;
    }

    public ARunnableS7S0101000_3(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
