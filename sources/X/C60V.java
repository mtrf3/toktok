package X;

import Y.ALAdapterS1S0200000_2;
import Y.AUListenerS90S0100000_1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.60V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60V {
    public final ViewGroup LIZ;
    public final List<View> LIZIZ;
    public final List<View> LIZJ;
    public final Activity LIZLLL;
    public final VideoPublishEditModel LJ;
    public C1534160j LJFF;
    public View LJI;
    public LinearLayout LJII;
    public ImageView LJIIIIZZ;
    public ViewGroup LJIIIZ;
    public final long LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;

    public final void LIZIZ() {
        LinearLayout linearLayout;
        C1534160j c1534160j = this.LJFF;
        if (c1534160j != null) {
            c1534160j.LIZ(false);
        }
        if (!this.LJIIL && (linearLayout = this.LJII) != null) {
            ImageView imageView = this.LJIIIIZZ;
            if (imageView != null) {
                imageView.setRotation(0.0f);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.LJIIJJI, 0);
            ofInt.setDuration(this.LJIIJ);
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(linearLayout, 16));
            ofInt.addListener(new ALAdapterS1S0200000_2(this, linearLayout, 6));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "alpha", 1.0f, 0.0f);
            AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat, this.LJIIJ);
            LIZLLL.playTogether(ofInt, ofFloat);
            LIZLLL.start();
        }
    }

    public final void LIZJ() {
        LinearLayout linearLayout;
        Integer num;
        C1534160j c1534160j = this.LJFF;
        if (c1534160j != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", c1534160j.LIZ.LLJLIL().getCreationId());
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("shoot_way", c1534160j.LIZ.LLJLIL().mShootWay);
            c145995oB.LJI("content_type", H8F.LJII(c1534160j.LIZ.LLJLIL()));
            c145995oB.LJI("content_source", H8F.LJI(c1534160j.LIZ.LLJLIL()));
            c145995oB.LIZ(H8F.LJIIL(c1534160j.LIZ.LLJLIL()), "is_multi_content");
            FMX.LJIIL("click_more_icon", c145995oB.LIZ);
            C60U c60u = c1534160j.LIZ;
            C1533460c c1533460c = c60u.LJLLLL;
            InterfaceC153275zv editToolbarViewModel = c60u.LLJJLIIIJLLLLLLLZ();
            C60U c60u2 = c1534160j.LIZ;
            java.util.Map<Integer, Integer> indexMap = c60u2.LJLLLLLL;
            C60V c60v = c60u2.LJLJLLL;
            if (c60v != null) {
                num = Integer.valueOf(c60v.LJIILLIIL);
            } else {
                num = null;
            }
            c1533460c.getClass();
            o.LJIIIZ(editToolbarViewModel, "editToolbarViewModel");
            o.LJIIIZ(indexMap, "indexMap");
            Integer num2 = (Integer) ((LinkedHashMap) indexMap).get(20);
            if (num2 != null) {
                int intValue = num2.intValue();
                if (num == null || intValue >= num.intValue()) {
                    c1533460c.LIZ(editToolbarViewModel);
                }
            }
        }
        C1534160j c1534160j2 = this.LJFF;
        if (c1534160j2 != null) {
            c1534160j2.LIZ(true);
        }
        if (this.LJIIL && (linearLayout = this.LJII) != null) {
            ImageView imageView = this.LJIIIIZZ;
            if (imageView != null) {
                imageView.setRotation(180.0f);
            }
            linearLayout.measure(0, 0);
            int measuredHeight = linearLayout.getMeasuredHeight();
            this.LJIIJJI = measuredHeight;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, measuredHeight);
            ofInt.setDuration(this.LJIIJ);
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(linearLayout, 16));
            ofInt.addListener(new ALAdapterS1S0200000_2(this, linearLayout, 7));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "alpha", 0.0f, 1.0f);
            AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat, this.LJIIJ);
            LIZLLL.playTogether(ofInt, ofFloat);
            LIZLLL.start();
        }
    }

    public final void LIZ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) KL2.LIZJ(this.LIZLLL, 12.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C60V(ViewGroup viewGroup, List<? extends View> list, List<? extends View> list2, Activity activity, VideoPublishEditModel publishEditModel) {
        int i;
        o.LJIIIZ(publishEditModel, "publishEditModel");
        this.LIZ = viewGroup;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = activity;
        this.LJ = publishEditModel;
        this.LJIIJ = 250L;
        this.LJIIL = true;
        this.LJIILIIL = 568;
        int LJJI = SFS.LJJI(C81184Vtc.LIZIZ(activity), activity);
        this.LJIILJJIL = LJJI;
        if (!C151965xo.LIZJ(publishEditModel)) {
            if (LJJI > 568) {
                i = Integer.MAX_VALUE;
            } else {
                i = 4;
            }
        } else if (LJJI > 650) {
            if (((ArrayList) list).size() <= 9) {
                i = 9;
            } else {
                i = 8;
            }
        } else {
            i = 6;
        }
        this.LJIILL = i;
        this.LJIILLIIL = i - 1;
    }
}
