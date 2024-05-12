package X;

import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wep, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82815Wep {
    public static final C82817Wer LJIIIZ = C82817Wer.LJLIL;
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final ImageView LIZJ;
    public final TextView LIZLLL;
    public ValueAnimator LJ;
    public final C122694rh LJFF;
    public final C82816Weq LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;

    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        LIZ(1.0f, callback);
    }

    public C82815Wep(Context context, ViewGroup viewGroup) {
        o.LJIIIZ(context, "context");
        this.LIZ = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.kde);
        o.LJIIIIZZ(findViewById, "this.viewGroup.findViewB…R.id.start_record_btn_vg)");
        this.LIZIZ = findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.kdk);
        o.LJIIIIZZ(findViewById2, "this.viewGroup.findViewB…d.start_record_video_img)");
        this.LIZJ = (ImageView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.kdj);
        o.LJIIIIZZ(findViewById3, "this.viewGroup.findViewB…(R.id.start_record_title)");
        this.LIZLLL = (TextView) findViewById3;
        this.LJFF = new C122694rh(0);
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "this.context.resources");
        this.LJI = new C82816Weq(resources);
        this.LJII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 359));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 358));
    }

    public final void LIZ(float f, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        float f2 = this.LJFF.LIZJ;
        if (f2 == f) {
            return;
        }
        ValueAnimator valueAnimator = this.LJ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        this.LJII.getValue();
        this.LJIIIIZZ.getValue();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.LJ = ofFloat;
        if (ofFloat != null) {
            ofFloat.setRepeatCount(0);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 37));
            ofFloat.addListener(new C82814Weo(this, ofFloat, interfaceC65784Pro, f));
            ofFloat.start();
        }
    }
}
