package X;

import Y.ARunnableS39S0100000_3;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.7oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC197297oj implements View.OnTouchListener {
    public static final /* synthetic */ int LJLL = 0;
    public final View LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final InterfaceC197307ok LJLJI;
    public final int LJLJJI = C7MY.LIZIZ(16);
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public boolean LJLJLLL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.LJLJLLL) {
                    float rawX = event.getRawX() - this.LJLJL;
                    float rawY = event.getRawY() - this.LJLJLJ;
                    int LJJIIZ = O6R.LJJIIZ(this.LJLJJL + rawX);
                    int i = this.LJLJJI;
                    if (LJJIIZ < i || LJJIIZ > (i = (this.LJLILLLLZI.getWidth() - this.LJLIL.getWidth()) - this.LJLJJI)) {
                        LJJIIZ = i;
                    }
                    int LJJIIZ2 = O6R.LJJIIZ(this.LJLJJLL + rawY);
                    int i2 = this.LJLJJI;
                    if (LJJIIZ2 < i2 || LJJIIZ2 > (i2 = (this.LJLILLLLZI.getHeight() - this.LJLIL.getHeight()) - this.LJLJJI)) {
                        LJJIIZ2 = i2;
                    }
                    v.animate().x(LJJIIZ).y(LJJIIZ2).setDuration(0L).start();
                }
            } else {
                this.LJLILLLLZI.requestDisallowInterceptTouchEvent(false);
                if (this.LJLJLLL) {
                    InterfaceC197307ok interfaceC197307ok = this.LJLJI;
                    float rawX2 = event.getRawX();
                    event.getRawY();
                    interfaceC197307ok.LJIJ(rawX2, v);
                } else {
                    float rawX3 = event.getRawX();
                    float rawY2 = event.getRawY();
                    int[] iArr = new int[2];
                    this.LJLIL.getLocationOnScreen(iArr);
                    int i3 = iArr[0];
                    int width = this.LJLIL.getWidth() + i3;
                    int LJJIIZ3 = O6R.LJJIIZ(rawX3);
                    if (i3 <= LJJIIZ3 && LJJIIZ3 <= width) {
                        int i4 = iArr[1];
                        int height = this.LJLIL.getHeight() + i4;
                        int LJJIIZ4 = O6R.LJJIIZ(rawY2);
                        if (i4 <= LJJIIZ4 && LJJIIZ4 <= height) {
                            this.LJLJI.LJJJLL(v);
                        }
                    }
                }
            }
        } else {
            this.LJLILLLLZI.requestDisallowInterceptTouchEvent(true);
            this.LJLJJL = v.getX();
            this.LJLJJLL = v.getY();
            this.LJLJL = event.getRawX();
            this.LJLJLJ = event.getRawY();
            this.LJLJLLL = false;
            v.postDelayed(new ARunnableS39S0100000_3(this, 210), 200L);
        }
        return true;
    }

    public ViewOnTouchListenerC197297oj(SmartImageView smartImageView, ConstraintLayout constraintLayout, InterfaceC197307ok interfaceC197307ok) {
        this.LJLIL = smartImageView;
        this.LJLILLLLZI = constraintLayout;
        this.LJLJI = interfaceC197307ok;
    }
}
