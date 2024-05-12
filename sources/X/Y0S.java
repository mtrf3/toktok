package X;

import Y.IDCListenerS261S0100000_15;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0S {
    public final Y1C LIZ;
    public final Y00 LIZIZ;
    public ValueAnimator LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public Y07 LJFF;
    public View LJI;
    public ViewGroup LJII;

    public final void LIZ() {
        View view;
        ViewGroup viewGroup;
        Y07 y07 = this.LJFF;
        if (y07 != null && (view = this.LJI) != null && (viewGroup = this.LJII) != null) {
            this.LIZIZ.setModel(y07);
            this.LIZIZ.setVideoView(view);
            this.LIZIZ.setVideoContainer(viewGroup);
            Y00 y00 = this.LIZIZ;
            if (!y00.LJLLLL) {
                View decorative_caption_root_view = y00.LIZ(R.id.c4l);
                o.LJIIIIZZ(decorative_caption_root_view, "decorative_caption_root_view");
                if (C16330kX.LIZJ(decorative_caption_root_view) && !decorative_caption_root_view.isLayoutRequested()) {
                    y00.LIZIZ();
                } else {
                    decorative_caption_root_view.addOnLayoutChangeListener(new IDCListenerS261S0100000_15(y00, 2));
                }
            }
        }
    }

    public Y0S(Context context, Y1C controllerDelegate, Y00 decorativeCaptionView) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(controllerDelegate, "controllerDelegate");
        o.LJIIIZ(decorativeCaptionView, "decorativeCaptionView");
        this.LIZ = controllerDelegate;
        this.LIZIZ = decorativeCaptionView;
    }
}
