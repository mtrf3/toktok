package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MVS implements View.OnTouchListener {
    public final /* synthetic */ C68322mC<Drawable> LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    public MVS(C68322mC<Drawable> c68322mC, float f) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.graphics.drawable.Drawable] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Drawable colorDrawable;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            view.setBackground(this.LJLIL.element);
            return false;
        }
        this.LJLIL.element = view.getBackground();
        Integer LIZIZ = C19N.LIZIZ(view, "v.context", R.attr.dr);
        if (LIZIZ == null) {
            return false;
        }
        float f = this.LJLILLLLZI;
        int intValue = LIZIZ.intValue();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "v.context");
        if (f > 0.0f) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = Integer.valueOf(intValue);
            c110614Vt.LIZJ = Float.valueOf(f);
            colorDrawable = c110614Vt.LIZ(context);
        } else {
            colorDrawable = new ColorDrawable(intValue);
        }
        view.setBackground(colorDrawable);
        return false;
    }
}
