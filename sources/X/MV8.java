package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class MV8 implements View.OnTouchListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ ImageView LJLILLLLZI;
    public final /* synthetic */ ImageView LJLJI;

    public MV8(View view, C119624mk c119624mk, C119624mk c119624mk2) {
        this.LJLIL = view;
        this.LJLILLLLZI = c119624mk;
        this.LJLJI = c119624mk2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            this.LJLILLLLZI.clearColorFilter();
            this.LJLJI.clearColorFilter();
            return false;
        }
        Integer LIZIZ = C19N.LIZIZ(this.LJLIL, "container.context", R.attr.df);
        if (LIZIZ == null) {
            return false;
        }
        ImageView imageView = this.LJLILLLLZI;
        ImageView imageView2 = this.LJLJI;
        int intValue = LIZIZ.intValue();
        imageView.setColorFilter(intValue);
        imageView2.setColorFilter(intValue);
        return false;
    }
}
