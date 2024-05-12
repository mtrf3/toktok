package X;

import Y.ARunnableS50S0100000_14;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.WXt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnTouchListenerC82457WXt implements View.OnTouchListener {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final View LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final View LJLJI;
    public final WY6 LJLJJI;
    public final int LJLJJL = C7MY.LIZIZ(18);
    public final int LJLJJLL = C7MY.LIZIZ(16);
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public boolean LJLLI;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        if (!this.LJLJJI.LJJJLZIJ()) {
            return false;
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.LJLLI) {
                    float rawX = event.getRawX() - this.LJLJLLL;
                    float rawY = event.getRawY() - this.LJLL;
                    int i = this.LJLJJL;
                    int LJJIIZ = O6R.LJJIIZ(this.LJLJL + rawX);
                    if (LJJIIZ >= i && LJJIIZ <= (i = (this.LJLILLLLZI.getWidth() - v.getWidth()) - i)) {
                        i = LJJIIZ;
                    }
                    int i2 = this.LJLJJL;
                    int LJJIIZ2 = O6R.LJJIIZ(this.LJLJLJ + rawY);
                    if (LJJIIZ2 >= i2 && LJJIIZ2 <= (i2 = (this.LJLILLLLZI.getHeight() - v.getHeight()) - i2)) {
                        i2 = LJJIIZ2;
                    }
                    v.setX(i);
                    v.setY(i2);
                    View view = this.LJLJI;
                    int i3 = this.LJLJJLL;
                    int LJJIIZ3 = O6R.LJJIIZ(this.LJLJL + (rawX - O6R.LJJIIZ(C32151Nz.LJIIZILJ(2))));
                    if (LJJIIZ3 >= i3 && LJJIIZ3 <= (i3 = (this.LJLILLLLZI.getWidth() - view.getWidth()) - i3)) {
                        i3 = LJJIIZ3;
                    }
                    View view2 = this.LJLJI;
                    int i4 = this.LJLJJLL;
                    int LJJIIZ4 = O6R.LJJIIZ(this.LJLJLJ + (rawY - O6R.LJJIIZ(C32151Nz.LJIIZILJ(2))));
                    if (LJJIIZ4 >= i4 && LJJIIZ4 <= (i4 = (this.LJLILLLLZI.getHeight() - view2.getHeight()) - i4)) {
                        i4 = LJJIIZ4;
                    }
                    this.LJLJI.setX(i3);
                    this.LJLJI.setY(i4);
                }
            } else {
                this.LJLILLLLZI.requestDisallowInterceptTouchEvent(false);
                if (this.LJLLI) {
                    WY6 wy6 = this.LJLJJI;
                    float rawX2 = event.getRawX();
                    event.getRawY();
                    wy6.LJIJ(rawX2, v);
                } else {
                    float rawX3 = event.getRawX();
                    float rawY2 = event.getRawY();
                    int[] iArr = new int[2];
                    this.LJLIL.getLocationOnScreen(iArr);
                    int i5 = iArr[0];
                    int width = this.LJLIL.getWidth() + i5;
                    int LJJIIZ5 = O6R.LJJIIZ(rawX3);
                    if (i5 <= LJJIIZ5 && LJJIIZ5 <= width) {
                        int i6 = iArr[1];
                        int height = this.LJLIL.getHeight() + i6;
                        int LJJIIZ6 = O6R.LJJIIZ(rawY2);
                        if (i6 <= LJJIIZ6 && LJJIIZ6 <= height) {
                            this.LJLJJI.LJJJLL(v);
                        }
                    }
                }
            }
        } else {
            this.LJLILLLLZI.requestDisallowInterceptTouchEvent(true);
            this.LJLJL = v.getX();
            this.LJLJLJ = v.getY();
            this.LJLJLLL = event.getRawX();
            this.LJLL = event.getRawY();
            this.LJLLI = false;
            v.postDelayed(new ARunnableS50S0100000_14(this, 70), 200L);
        }
        return true;
    }

    public ViewOnTouchListenerC82457WXt(SmartImageView smartImageView, ViewGroup viewGroup, C1547165j c1547165j, C82456WXs c82456WXs) {
        this.LJLIL = smartImageView;
        this.LJLILLLLZI = viewGroup;
        this.LJLJI = c1547165j;
        this.LJLJJI = c82456WXs;
    }
}
