package X;

import Y.AfS57S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Bwv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30429Bwv extends FrameLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public final CKO LJLJI;
    public int LJLJJI;
    public View LJLJJL;
    public final ImageView LJLJJLL;
    public final ImageView LJLJL;
    public C30735C4l LJLJLJ;
    public DataChannel LJLJLLL;
    public C73411SrX LJLL;
    public final AnimatorSet LJLLI;
    public final AnimatorSet LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public final java.util.Map<Integer, View> LJLLLL = new LinkedHashMap();

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLLLL;
        Integer valueOf = Integer.valueOf(R.id.d2_);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.d2_);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        this.LJLLJ = false;
        this.LJLLI.cancel();
        View view = this.LJLJJL;
        if (view == null) {
            return;
        }
        view.setAlpha(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void LIZJ() {
        ImageView imageView = this.LJLJJLL;
        if (imageView != null) {
            C29306Beo.LJJLJLI(imageView);
        }
        ImageView imageView2 = this.LJLJL;
        if (imageView2 != null) {
            C29306Beo.LJI(imageView2);
        }
        View view = this.LJLJJL;
        if (view != null) {
            view.setX(this.LJLIL - C15380j0.LIZ(47.0f));
        }
        View view2 = this.LJLJJL;
        if (view2 != null) {
            view2.setY(this.LJLILLLLZI - C15380j0.LIZ(60.0f));
        }
        ImageView imageView3 = this.LJLJJLL;
        if (imageView3 != null) {
            LJ(imageView3);
        }
    }

    public final void LIZLLL() {
        ImageView imageView = this.LJLJJLL;
        if (imageView != null) {
            C29306Beo.LJI(imageView);
        }
        ImageView imageView2 = this.LJLJL;
        if (imageView2 != null) {
            C29306Beo.LJJLJLI(imageView2);
        }
        View view = this.LJLJJL;
        if (view != null) {
            view.setX(this.LJLIL - C15380j0.LIZ(72.0f));
        }
        View view2 = this.LJLJJL;
        if (view2 != null) {
            view2.setY(this.LJLILLLLZI - C15380j0.LIZ(60.0f));
        }
        ImageView imageView3 = this.LJLJL;
        if (imageView3 != null) {
            LJ(imageView3);
        }
    }

    public final void LJFF() {
        if (!this.LJLLJ) {
            this.LJLLI.cancel();
        }
        this.LJLLJ = true;
        this.LJLL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(500L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 219));
    }

    public final void LJI() {
        List list;
        int LJIIL;
        int exposureCompensationRange;
        this.LJLLI.cancel();
        this.LJLLILLLL.cancel();
        DataChannel dataChannel = this.LJLJLLL;
        if (dataChannel != null) {
            list = (List) dataChannel.kv0(C55022Dy.class);
        } else {
            list = null;
        }
        if (list != null) {
            this.LJLIL = ((Number) ListProtector.get(list, 0)).floatValue();
        }
        if (list != null && list.size() > 0) {
            this.LJLILLLLZI = ((Number) ListProtector.get(list, 1)).floatValue();
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            LJIIL = C15380j0.LJIIL() / 2;
        } else {
            LJIIL = C15380j0.LJIIL();
        }
        if (C26338AVi.LIZLLL(this)) {
            if (LJIIL - this.LJLIL < C15380j0.LIZ(43.0f)) {
                LIZJ();
            } else {
                LIZLLL();
            }
        } else if (LJIIL - this.LJLIL < C15380j0.LIZ(43.0f)) {
            LIZLLL();
        } else {
            LIZJ();
        }
        View view = this.LJLJJL;
        if (view != null) {
            C29306Beo.LJI(view);
        }
        if (C29306Beo.LJJI()) {
            InterfaceC30359Bvn LJIILIIL = C87277YNd.LJIILIIL(this.LJLJLLL);
            if (LJIILIIL != null) {
                exposureCompensationRange = LJIILIIL.getCameraInfo();
            }
            exposureCompensationRange = 0;
        } else {
            CKO cko = this.LJLJI;
            if (cko != null) {
                exposureCompensationRange = cko.getExposureCompensationRange();
            }
            exposureCompensationRange = 0;
        }
        this.LJLJJI = exposureCompensationRange;
        C30735C4l c30735C4l = this.LJLJLJ;
        if (c30735C4l != null) {
            c30735C4l.setMax(1000);
        }
        C30735C4l c30735C4l2 = this.LJLJLJ;
        if (c30735C4l2 != null) {
            c30735C4l2.LIZ();
        }
        if (C29306Beo.LJJI()) {
            InterfaceC30359Bvn LJIILIIL2 = C87277YNd.LJIILIIL(this.LJLJLLL);
            if (LJIILIIL2 != null) {
                LJIILIIL2.setExposureCompensation(0);
            }
        } else {
            CKO cko2 = this.LJLJI;
            if (cko2 != null) {
                cko2.setExposureCompensation(0.0f);
            }
        }
        C30735C4l c30735C4l3 = this.LJLJLJ;
        if (c30735C4l3 != null) {
            c30735C4l3.setOnSeekBarChangeListener(new C30430Bww(this));
        }
        View view2 = this.LJLJJL;
        if (view2 != null) {
            C29306Beo.LJJLJLI(view2);
        }
        View view3 = this.LJLJJL;
        if (view3 != null) {
            view3.setAlpha(1.0f);
        }
        C29306Beo.LJJLJLI(LIZ());
        C30735C4l c30735C4l4 = this.LJLJLJ;
        if (c30735C4l4 != null) {
            C29306Beo.LJI(c30735C4l4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C73411SrX c73411SrX = this.LJLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLLI.cancel();
        this.LJLLILLLL.cancel();
    }

    public final DataChannel getDataChannel() {
        return this.LJLJLLL;
    }

    public final C30735C4l getExposureBar() {
        return this.LJLJLJ;
    }

    public final View getView() {
        return this.LJLJJL;
    }

    public C30429Bwv(Context context) {
        super(context, null, 0);
        ImageView imageView;
        ImageView imageView2;
        this.LJLJI = C3Z.LIZ.LIZIZ();
        this.LJLLI = new AnimatorSet();
        this.LJLLILLLL = new AnimatorSet();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dko, this, false);
        this.LJLJJL = LLLLIILL;
        addView(LLLLIILL);
        View view = this.LJLJJL;
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.djf);
        } else {
            imageView = null;
        }
        this.LJLJJLL = imageView;
        View view2 = this.LJLJJL;
        if (view2 != null) {
            imageView2 = (ImageView) view2.findViewById(R.id.djg);
        } else {
            imageView2 = null;
        }
        this.LJLJL = imageView2;
        View view3 = this.LJLJJL;
        this.LJLJLJ = view3 != null ? (C30735C4l) view3.findViewById(R.id.d29) : null;
        View view4 = this.LJLJJL;
        if (view4 != null) {
            C29306Beo.LJI(view4);
        }
    }

    public final void LJ(ImageView imageView) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(500L);
        o.LJIIIIZZ(duration, "ofFloat(view, View.SCALE…tDuration(ANIM_DELAY_500)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(500L);
        o.LJIIIIZZ(duration2, "ofFloat(view, View.SCALE…tDuration(ANIM_DELAY_500)");
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(LIZ(), (Property<View, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(500L);
        o.LJIIIIZZ(duration3, "ofFloat(exposure_sun, Vi…tDuration(ANIM_DELAY_500)");
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(LIZ(), (Property<View, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(500L);
        o.LJIIIIZZ(duration4, "ofFloat(exposure_sun, Vi…tDuration(ANIM_DELAY_500)");
        this.LJLLILLLL.playTogether(duration, duration2, duration3, duration4);
        this.LJLLILLLL.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLJLLL = dataChannel;
    }

    public final void setExposureBar(C30735C4l c30735C4l) {
        this.LJLJLJ = c30735C4l;
    }

    public final void setView(View view) {
        this.LJLJJL = view;
    }
}
