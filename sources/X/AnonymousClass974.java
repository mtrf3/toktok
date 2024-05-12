package X;

import Y.ACListenerS32S0100000_12;
import Y.ALAdapterS3S0100000_4;
import Y.AUListenerS93S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.974, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass974 implements TGU {
    public static final /* synthetic */ int LJIIJ = 0;
    public View LIZ;
    public final InterpolatorC61446O9q LIZIZ;
    public final InterpolatorC61446O9q LIZJ;
    public final InterpolatorC61446O9q LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final View LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final int LJIIIZ;

    public final float LJFF() {
        if (this.LJII.getHeight() > 0) {
            return this.LJII.getHeight();
        }
        return this.LJI.getResources().getDimension(R.dimen.a85);
    }

    public final AnimatorSet LJI() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJII, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(210L);
        ofFloat.setInterpolator(this.LIZJ);
        ofFloat.setStartDelay(90L);
        ofFloat.addListener(new ALAdapterS3S0100000_4(this, 20));
        View view = this.LIZ;
        if (view != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat2.setDuration(90L);
            ofFloat2.setInterpolator(this.LIZIZ);
            ofFloat2.addListener(new ALAdapterS3S0100000_4(this, 21));
            ValueAnimator ofInt = ValueAnimator.ofInt(this.LJIIIIZZ.getHeight(), (int) LJFF());
            ofInt.setDuration(300L);
            ofInt.setInterpolator(this.LIZLLL);
            ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 60));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
            return animatorSet;
        }
        o.LJIJI("searchStickerView");
        throw null;
    }

    @Override // X.TGU
    public final boolean LIZ() {
        return this.LJFF;
    }

    @Override // X.TGU
    public final void LIZIZ(int i) {
        this.LJ = true;
        int i2 = this.LJIIIZ;
        if (i2 == 1) {
            LJIIIIZZ(i).start();
            this.LJFF = true;
            return;
        }
        if (i2 != 2) {
            return;
        }
        if (this.LJFF) {
            ValueAnimator ofInt = ValueAnimator.ofInt(this.LJIIIIZZ.getHeight(), i);
            ofInt.setDuration(300L);
            ofInt.setInterpolator(this.LIZLLL);
            ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 59));
            ofInt.start();
            return;
        }
        LIZLLL(false);
        LJIIIIZZ(i).start();
        this.LJFF = true;
    }

    @Override // X.TGU
    public final void LIZJ(boolean z) {
        boolean z2 = this.LJ;
        if (!z2 && !this.LJFF) {
            return;
        }
        int i = this.LJIIIZ;
        if (i == 1) {
            if (z) {
                this.LJII.setVisibility(0);
                this.LJII.setAlpha(0.0f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJII, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(210L);
                ofFloat.setInterpolator(this.LIZJ);
                ofFloat.setStartDelay(90L);
                View view = this.LIZ;
                if (view != null) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                    ofFloat2.setDuration(90L);
                    ofFloat2.setInterpolator(this.LIZIZ);
                    ofFloat2.addListener(new ALAdapterS3S0100000_4(this, 26));
                    ValueAnimator ofInt = ValueAnimator.ofInt(this.LJIIIIZZ.getHeight(), (int) LJFF());
                    ofInt.setDuration(300L);
                    ofInt.setInterpolator(this.LIZLLL);
                    ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 57));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
                    animatorSet.start();
                } else {
                    o.LJIJI("searchStickerView");
                    throw null;
                }
            } else {
                LJI().start();
            }
            this.LJFF = false;
        } else if (i == 2) {
            if (z) {
                if (z2) {
                    LIZLLL(true);
                    LJI().start();
                    this.LJFF = false;
                } else {
                    LIZLLL(true);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJII, "alpha", 0.0f, 1.0f);
                    ofFloat3.setDuration(210L);
                    ofFloat3.setInterpolator(this.LIZJ);
                    ofFloat3.setStartDelay(90L);
                    ofFloat3.addListener(new ALAdapterS3S0100000_4(this, 24));
                    View view2 = this.LIZ;
                    if (view2 != null) {
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
                        ofFloat4.setDuration(90L);
                        ofFloat4.setInterpolator(this.LIZIZ);
                        ofFloat4.addListener(new ALAdapterS3S0100000_4(this, 25));
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(ofFloat3, ofFloat4);
                        animatorSet2.start();
                        this.LJFF = false;
                    } else {
                        o.LJIJI("searchStickerView");
                        throw null;
                    }
                }
            } else {
                ValueAnimator ofInt2 = ValueAnimator.ofInt(this.LJIIIIZZ.getHeight(), (int) LJFF());
                ofInt2.setDuration(300L);
                ofInt2.setInterpolator(this.LIZLLL);
                ofInt2.addUpdateListener(new AUListenerS93S0100000_4(this, 58));
                ofInt2.start();
                this.LJFF = true;
            }
        }
        this.LJ = false;
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            if (this.LJIIIZ == 2) {
                this.LJI.setVisibility(0);
                return;
            }
            return;
        }
        this.LJI.setVisibility(8);
    }

    public final void LJII(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
    }

    public final AnimatorSet LJIIIIZZ(int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJII, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(90L);
        ofFloat.setInterpolator(this.LIZIZ);
        ofFloat.addListener(new ALAdapterS3S0100000_4(this, 22));
        View view = this.LIZ;
        if (view != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(210L);
            ofFloat2.setStartDelay(90L);
            ofFloat2.setInterpolator(this.LIZJ);
            ofFloat2.addListener(new ALAdapterS3S0100000_4(this, 23));
            ValueAnimator ofInt = ValueAnimator.ofInt(this.LJIIIIZZ.getHeight(), i);
            ofInt.setDuration(300L);
            ofInt.setInterpolator(this.LIZLLL);
            ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 61));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
            return animatorSet;
        }
        o.LJIJI("searchStickerView");
        throw null;
    }

    public AnonymousClass974(int i, View view, View stickerView, View stickerViewContainer) {
        o.LJIIIZ(stickerView, "stickerView");
        o.LJIIIZ(stickerViewContainer, "stickerViewContainer");
        this.LJI = view;
        this.LJII = stickerView;
        this.LJIIIIZZ = stickerViewContainer;
        this.LJIIIZ = i;
        float dimension = view.getResources().getDimension(R.dimen.a6l);
        this.LIZIZ = new InterpolatorC61446O9q(0.3f, 0.0f, 0.9f, 0.6f);
        this.LIZJ = new InterpolatorC61446O9q(0.0f, 0.4f, 0.2f, 1.0f);
        this.LIZLLL = new InterpolatorC61446O9q(0.4f, 0.0f, 0.2f, 1.0f);
        View searchIconBg = view.findViewById(R.id.fmh);
        TextView textView = (TextView) view.findViewById(R.id.klf);
        textView.setText("Search");
        o.LJIIIIZZ(searchIconBg, "searchIconBg");
        ViewGroup.LayoutParams layoutParams = searchIconBg.getLayoutParams();
        if (i != 1) {
            if (i != 2) {
                return;
            }
            textView.setVisibility(0);
            layoutParams.width = (int) dimension;
            searchIconBg.setLayoutParams(layoutParams);
            LIZLLL(true);
            return;
        }
        LIZLLL(false);
    }

    public final SearchStickerViewContainer LJ(ActivityC45651qj activity, ViewGroup content, TF5 requiredDependency, TEJ optionalDependency, TF1 searchStickerViewModel, TGD stickerViewConfigure) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(optionalDependency, "optionalDependency");
        o.LJIIIZ(searchStickerViewModel, "searchStickerViewModel");
        o.LJIIIZ(stickerViewConfigure, "stickerViewConfigure");
        int i = this.LJIIIZ;
        LifecycleOwner LJI = C78598Ut0.LJI(content);
        if (LJI == null) {
            LJI = activity;
        }
        SearchStickerViewContainer searchStickerViewContainer = new SearchStickerViewContainer(activity, content, requiredDependency, searchStickerViewModel, 2, i, stickerViewConfigure, null, LJI);
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(searchStickerViewContainer, 188), this.LJI);
        return searchStickerViewContainer;
    }
}
