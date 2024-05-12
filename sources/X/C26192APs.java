package X;

import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS36S0200000_1;
import Y.IDAListenerS4S0300000_3;
import Y.IDAListenerS72S0100000_3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.APs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26192APs extends FrameLayout {
    public final C113534cv LJLIL;
    public final C26193APt LJLILLLLZI;
    public List<UrlModel> LJLJI;
    public final java.util.Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZLLL() {
        C26193APt c26193APt = this.LJLILLLLZI;
        if (c26193APt != null) {
            AnimatorSet animatorSet = c26193APt.LIZ;
            if (animatorSet != null && animatorSet.isRunning()) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = c26193APt.LIZIZ;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = c26193APt.LIZJ;
            if (animatorSet3 != null && animatorSet3.isRunning()) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = c26193APt.LIZLLL;
            if (animatorSet4 != null && animatorSet4.isRunning()) {
                animatorSet4.cancel();
            }
        }
    }

    public final boolean LJ() {
        AnimatorSet animatorSet;
        C26193APt c26193APt = this.LJLILLLLZI;
        if (c26193APt == null) {
            return false;
        }
        AnimatorSet animatorSet2 = c26193APt.LIZ;
        if ((animatorSet2 == null || !animatorSet2.isRunning()) && ((animatorSet = c26193APt.LIZLLL) == null || !animatorSet.isRunning())) {
            return false;
        }
        return true;
    }

    public final void LJII() {
        C26193APt c26193APt = this.LJLILLLLZI;
        if (c26193APt != null) {
            SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) LIZ(R.id.eye);
            SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) LIZ(R.id.eyj);
            SmartAvatarImageView smartAvatarImageView3 = (SmartAvatarImageView) LIZ(R.id.eyk);
            List<UrlModel> list = this.LJLJI;
            if (smartAvatarImageView == null || smartAvatarImageView2 == null || smartAvatarImageView3 == null || list == null || list.isEmpty() || list.size() == 1) {
                return;
            }
            AnimatorSet animatorSet = c26193APt.LIZLLL;
            if (animatorSet != null && animatorSet.isRunning()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            C26193APt.LIZ(smartAvatarImageView2, arrayList, false);
            if (list.size() > 2) {
                C26193APt.LIZ(smartAvatarImageView3, arrayList, false);
            }
            C26193APt.LIZ(smartAvatarImageView, arrayList, true);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(arrayList);
            animatorSet2.addListener(new IDAListenerS4S0300000_3(smartAvatarImageView, smartAvatarImageView2, smartAvatarImageView3, 2));
            animatorSet2.addListener(new IDAListenerS4S0300000_3(smartAvatarImageView, smartAvatarImageView2, smartAvatarImageView3, 3));
            c26193APt.LIZLLL = animatorSet2;
            animatorSet2.start();
        }
    }

    public final View getAnchorPoint() {
        View iv_avatar = LIZ(R.id.eye);
        o.LJIIIIZZ(iv_avatar, "iv_avatar");
        return iv_avatar;
    }

    public C26192APs(Context context) {
        super(context, null, 0);
        if (C26197APx.LIZJ()) {
            FrameLayout.inflate(context, R.layout.c8x, this);
            this.LJLILLLLZI = new C26193APt();
            this.LJLIL = (C113534cv) findViewById(R.id.i_i);
        } else if (C26197APx.LIZLLL()) {
            FrameLayout.inflate(context, R.layout.c8y, this);
            this.LJLILLLLZI = new C26193APt();
        } else {
            FrameLayout.inflate(context, R.layout.c8w, this);
        }
        C9AE.LIZ(this, C9AC.ALPHA, 0.0f);
    }

    public final void LIZJ(List list) {
        this.LJLJI = list;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            SmartImageView iv_avatar_2 = (SmartImageView) LIZ(R.id.eyj);
            o.LJIIIIZZ(iv_avatar_2, "iv_avatar_2");
            W5F LJII = W5U.LJII(C78939UyV.LJ((UrlModel) ListProtector.get(list, 1)));
            LJII.LJIILIIL(J7H.LIZ(100));
            LJII.LJJIJIIJIL = true;
            LJII.LJJIIJ = iv_avatar_2;
            C16880lQ.LLJJJ(LJII);
        }
        if (list.size() > 2) {
            SmartImageView iv_avatar_3 = (SmartImageView) LIZ(R.id.eyk);
            o.LJIIIIZZ(iv_avatar_3, "iv_avatar_3");
            W5F LJII2 = W5U.LJII(C78939UyV.LJ((UrlModel) ListProtector.get(list, 2)));
            LJII2.LJIILIIL(J7H.LIZ(100));
            LJII2.LJJIJIIJIL = true;
            LJII2.LJJIIJ = iv_avatar_3;
            C16880lQ.LLJJJ(LJII2);
        }
    }

    public final void LJI(AnimatorSet animatorSet) {
        C113534cv c113534cv;
        C26193APt c26193APt;
        if (LIZ(R.id.bcs) != null && (c113534cv = this.LJLIL) != null && (c26193APt = this.LJLILLLLZI) != null) {
            ConstraintLayout cl_entrance_container = (ConstraintLayout) LIZ(R.id.bcs);
            o.LJIIIIZZ(cl_entrance_container, "cl_entrance_container");
            AnimatorSet animatorSet2 = c26193APt.LIZ;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                return;
            }
            c113534cv.setAlpha(0.0f);
            c113534cv.setVisibility(0);
            c113534cv.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            View capsuleInnerView = c113534cv.getCapsuleInnerView();
            int i = -capsuleInnerView.getMeasuredWidth();
            int LIZ = C47135Ieh.LIZ(8, i + 146);
            ViewGroup.LayoutParams layoutParams = capsuleInnerView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(i - O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
            capsuleInnerView.setLayoutParams(marginLayoutParams);
            ValueAnimator ofInt = ValueAnimator.ofInt(LIZ, 0);
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(capsuleInnerView, 29));
            ofInt.setDuration(400L);
            ofInt.setStartDelay(700L);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c113534cv, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(400L);
            ofFloat.setStartDelay(700L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c113534cv, "alpha", 1.0f, 0.0f);
            ofFloat2.setDuration(300L);
            ofFloat2.setStartDelay(4100L);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(0, LIZ);
            ofInt2.addUpdateListener(new AUListenerS90S0100000_1(capsuleInnerView, 30));
            ofInt2.setDuration(300L);
            ofInt2.setStartDelay(4100L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ofInt, ofFloat, ofFloat2, ofInt2);
            animatorSet3.addListener(new IDAListenerS36S0200000_1(c113534cv, capsuleInnerView, 1));
            animatorSet3.addListener(new IDAListenerS36S0200000_1(c113534cv, capsuleInnerView, 2));
            c26193APt.LIZ = animatorSet3;
            c26193APt.LIZIZ = animatorSet;
            cl_entrance_container.setVisibility(0);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cl_entrance_container, "alpha", 1.0f, 0.0f);
            ofFloat3.setDuration(400L);
            ofFloat3.setStartDelay(700L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cl_entrance_container, "alpha", 0.0f, 1.0f);
            ofFloat4.setDuration(200L);
            ofFloat4.setStartDelay(4200L);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(cl_entrance_container, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.4f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.4f, 1.0f));
            o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(o…inalView, scaleX, scaleY)");
            ofPropertyValuesHolder.setDuration(200L);
            ofPropertyValuesHolder.setStartDelay(4200L);
            ofPropertyValuesHolder.setInterpolator(C55953Lxd.LJII());
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ofFloat3, ofFloat4, ofPropertyValuesHolder);
            animatorSet4.addListener(new IDAListenerS72S0100000_3(cl_entrance_container, 39));
            animatorSet4.addListener(new IDAListenerS72S0100000_3(cl_entrance_container, 40));
            c26193APt.LIZJ = animatorSet4;
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(c26193APt.LIZIZ, c26193APt.LIZJ, c26193APt.LIZ);
            animatorSet5.start();
        }
    }

    public final void setContentDescription(String description) {
        o.LJIIIZ(description, "description");
        View LIZ = LIZ(R.id.eye);
        if (LIZ == null) {
            return;
        }
        LIZ.setContentDescription(description);
    }

    public final void setIconAvatarUrl(UrlModel urlModel) {
        if (urlModel == null) {
            VA9 va9 = (VA9) LIZ(R.id.eye);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            va9.setImageDrawable(new SY9(context, R.raw.icon_footprint));
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJIILIIL(J7H.LIZ(100));
        int width = getWidth();
        int height = getHeight();
        LJII.LJII = width;
        LJII.LJIIIIZZ = height;
        LJII.LJJIJIIJIL = true;
        LJII.LJJIIJ = (SmartImageView) LIZ(R.id.eye);
        C16880lQ.LLJJJ(LJII);
    }

    public final void setUnReadNum(int i) {
        int i2;
        View LIZ = LIZ(R.id.mcl);
        if (i > 0) {
            ((TextView) LIZ(R.id.mcl)).setText(String.valueOf(Math.min(i, 99)));
            i2 = 0;
        } else {
            i2 = 8;
        }
        LIZ.setVisibility(i2);
    }

    public final void LJFF(List<UrlModel> list, boolean z) {
        boolean z2;
        if (list == null || list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !z) {
            setIconAvatarUrl(null);
            LIZ(R.id.cxu).setVisibility(8);
            ((ImageView) LIZ(R.id.eye)).setVisibility(0);
            ((TextView) LIZ(R.id.mcl)).setPaddingRelative(C7MY.LIZIZ(2), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 0);
            return;
        }
        if (list.size() == 1) {
            setIconAvatarUrl((UrlModel) ListProtector.get(list, 0));
            LIZ(R.id.cxu).setVisibility(8);
            ((ImageView) LIZ(R.id.eye)).setVisibility(0);
            ((TextView) LIZ(R.id.mcl)).setPaddingRelative(C7MY.LIZIZ(2), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 0);
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ((UrlModel) ListProtector.get(list, 0)));
        LJII.LJIILIIL(J7H.LIZ(100));
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        int LIZIZ = C7MY.LIZIZ(16);
        LJII.LJII = LJJIIZ;
        LJII.LJIIIIZZ = LIZIZ;
        LJII.LJJIJIIJIL = true;
        LJII.LJJIIJ = (SmartImageView) LIZ(R.id.e3f);
        C16880lQ.LLJJJ(LJII);
        W5F LJII2 = W5U.LJII(C78939UyV.LJ((UrlModel) ListProtector.get(list, 1)));
        LJII2.LJIILIIL(J7H.LIZ(100));
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        int LIZIZ2 = C7MY.LIZIZ(16);
        LJII2.LJII = LJJIIZ2;
        LJII2.LJIIIIZZ = LIZIZ2;
        LJII2.LJJIJIIJIL = true;
        LJII2.LJJIIJ = (SmartImageView) LIZ(R.id.e3g);
        C16880lQ.LLJJJ(LJII2);
        LIZ(R.id.cxu).setVisibility(0);
        ((ImageView) LIZ(R.id.eye)).setVisibility(8);
        ((TextView) LIZ(R.id.mcl)).setPaddingRelative(C7MY.LIZIZ(2), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), 0);
    }

    public final void LIZIZ(int i, int i2, List list) {
        C113534cv c113534cv = this.LJLIL;
        if (c113534cv != null) {
            c113534cv.LIZ(R.id.g1t).setVisibility(8);
            int i3 = 0;
            if (list != null) {
                if (list.isEmpty()) {
                    c113534cv.LIZ(R.id.g1t).setVisibility(8);
                } else {
                    if (list.size() == 1) {
                        SmartAvatarImageView iv_avatarStart = (SmartAvatarImageView) c113534cv.LIZ(R.id.eyh);
                        o.LJIIIIZZ(iv_avatarStart, "iv_avatarStart");
                        c113534cv.LIZIZ(iv_avatarStart, (UrlModel) ORZ.LJLLLLLL(0, list));
                        ((ImageView) c113534cv.LIZ(R.id.eyh)).setVisibility(0);
                        ((ImageView) c113534cv.LIZ(R.id.eyg)).setVisibility(8);
                        ((ImageView) c113534cv.LIZ(R.id.eyf)).setVisibility(8);
                    } else if (list.size() == 2) {
                        SmartAvatarImageView iv_avatarStart2 = (SmartAvatarImageView) c113534cv.LIZ(R.id.eyh);
                        o.LJIIIIZZ(iv_avatarStart2, "iv_avatarStart");
                        c113534cv.LIZIZ(iv_avatarStart2, (UrlModel) ORZ.LJLLLLLL(1, list));
                        SmartAvatarImageView iv_avatarMiddle = (SmartAvatarImageView) c113534cv.LIZ(R.id.eyg);
                        o.LJIIIIZZ(iv_avatarMiddle, "iv_avatarMiddle");
                        c113534cv.LIZIZ(iv_avatarMiddle, (UrlModel) ORZ.LJLLLLLL(0, list));
                        ((ImageView) c113534cv.LIZ(R.id.eyh)).setVisibility(0);
                        ((ImageView) c113534cv.LIZ(R.id.eyg)).setVisibility(0);
                        ((ImageView) c113534cv.LIZ(R.id.eyf)).setVisibility(8);
                    } else if (list.size() > 2) {
                        SmartAvatarImageView iv_avatarStart3 = (SmartAvatarImageView) c113534cv.LIZ(R.id.eyh);
                        o.LJIIIIZZ(iv_avatarStart3, "iv_avatarStart");
                        c113534cv.LIZIZ(iv_avatarStart3, (UrlModel) ORZ.LJLLLLLL(2, list));
                        SmartAvatarImageView iv_avatarMiddle2 = (SmartAvatarImageView) c113534cv.LIZ(R.id.eyg);
                        o.LJIIIIZZ(iv_avatarMiddle2, "iv_avatarMiddle");
                        c113534cv.LIZIZ(iv_avatarMiddle2, (UrlModel) ORZ.LJLLLLLL(1, list));
                        SmartAvatarImageView iv_avatarEnd = (SmartAvatarImageView) c113534cv.LIZ(R.id.eyf);
                        o.LJIIIIZZ(iv_avatarEnd, "iv_avatarEnd");
                        c113534cv.LIZIZ(iv_avatarEnd, (UrlModel) ORZ.LJLLLLLL(0, list));
                        ((ImageView) c113534cv.LIZ(R.id.eyh)).setVisibility(0);
                        ((ImageView) c113534cv.LIZ(R.id.eyg)).setVisibility(0);
                        ((ImageView) c113534cv.LIZ(R.id.eyf)).setVisibility(0);
                    }
                    c113534cv.LIZ(R.id.g1t).setVisibility(0);
                }
            }
            TextView textView = (TextView) c113534cv.LIZ(R.id.m1m);
            int min = Math.min(i, 99);
            String quantityString = c113534cv.getContext().getResources().getQuantityString(R.plurals.qu, min, Integer.valueOf(min));
            o.LJIIIIZZ(quantityString, "context.resources.getQua…          count\n        )");
            textView.setText(quantityString);
            TextView textView2 = (TextView) c113534cv.LIZ(R.id.m1m);
            int LIZ = C47135Ieh.LIZ(8, C47135Ieh.LIZ(12, i2));
            if (list != null && !list.isEmpty()) {
                i3 = C47959Irz.LIZJ(8, (list.size() * c113534cv.LJLIL) - ((list.size() - 1) * c113534cv.LJLILLLLZI));
            }
            textView2.setMaxWidth((LIZ - i3) - c113534cv.LJLJI);
        }
    }
}
