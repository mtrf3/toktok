package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: X.WLn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnTouchListenerC82139WLn implements View.OnTouchListener {
    public ImageView LJLIL;
    public SY2 LJLILLLLZI;
    public TextView LJLJI;
    public TextView LJLJJI;
    public String LJLJJL;
    public WG4 LJLJJLL;
    public RelativeLayout LJLJL;
    public View LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public boolean LJLLL;
    public InterfaceC30027BqR LJLLLL;
    public InterfaceC82142WLq LJLLLLLL;

    public final int LIZ() {
        if (this.LJLJLLL >= this.LJLLI) {
            return (int) (((this.LJLILLLLZI.getWidth() * 1.0f) * 15000.0f) / this.LJLLI);
        }
        return (int) (((this.LJLILLLLZI.getWidth() * 1.0d) * this.LJLJLLL) / this.LJLLI);
    }

    public final int LIZIZ() {
        if (this.LJLJLLL >= this.LJLLI || this.LJLLL) {
            return this.LJLILLLLZI.getWidth();
        }
        return (int) (((this.LJLILLLLZI.getWidth() * 1.0d) * this.LJLJLLL) / this.LJLLI);
    }

    public final void LIZJ(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        ImageView imageView = this.LJLIL;
        int i5 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        SY2 sy2 = this.LJLILLLLZI;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        sy2.setVisibility(i2);
        TextView textView = this.LJLJI;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        TextView textView2 = this.LJLJJI;
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView2.setVisibility(i4);
        WG4 wg4 = this.LJLJJLL;
        if (!z) {
            i5 = 0;
        }
        wg4.setVisibility(i5);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI(WM7.SCENE_SERVICE, "MusicDragView");
        c145995oB.LIZ(!z ? 1 : 0, "status");
        GXR.LIZ("tool_performance_show_music_wave", c145995oB.LIZ);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            int i = 0;
            if (action != 1) {
                if (action == 2 && !this.LJLLL) {
                    float rawX = this.LJLLJ + (motionEvent.getRawX() - this.LJLLILLLL);
                    if (rawX < this.LJLILLLLZI.getX() - (this.LJLIL.getWidth() / 2)) {
                        rawX = this.LJLILLLLZI.getX() - (this.LJLIL.getWidth() / 2);
                    }
                    if ((rawX - this.LJLILLLLZI.getX()) + (this.LJLIL.getWidth() / 2) >= this.LJLILLLLZI.getWidth() - LIZ()) {
                        rawX = ((this.LJLILLLLZI.getX() - (this.LJLIL.getWidth() / 2)) + this.LJLILLLLZI.getWidth()) - LIZ();
                    }
                    if (rawX < 0.0f) {
                        rawX = 0.0f;
                    }
                    this.LJLIL.animate().x(rawX).setDuration(0L).start();
                    int x = (int) ((this.LJLIL.getX() + (this.LJLIL.getWidth() / 2)) - this.LJLILLLLZI.getX());
                    if (x < 0 || this.LJLLL) {
                        x = 0;
                    }
                    this.LJLILLLLZI.setStart(x);
                    this.LJLILLLLZI.setLength(LIZIZ());
                    TextView textView = this.LJLJI;
                    int i2 = this.LJLLI;
                    int x2 = (int) (((((this.LJLIL.getX() * 1.0d) - this.LJLILLLLZI.getX()) + (this.LJLIL.getWidth() / 2)) / this.LJLILLLLZI.getWidth()) * i2);
                    if (x2 < 0) {
                        x2 = 0;
                    }
                    if (x2 <= i2) {
                        i = x2;
                    }
                    textView.setText(C78605Ut7.LJIIL(i));
                }
            } else {
                int x3 = (int) ((this.LJLIL.getX() - this.LJLILLLLZI.getX()) + (this.LJLIL.getWidth() / 2));
                if (x3 >= 0) {
                    i = x3;
                }
                int width = (int) (((i * 1.0d) / this.LJLILLLLZI.getWidth()) * this.LJLLI);
                this.LJLL = width;
                InterfaceC82142WLq interfaceC82142WLq = this.LJLLLLLL;
                if (interfaceC82142WLq != null) {
                    ((C82141WLp) interfaceC82142WLq).LIZLLL.LJJIIJ(width);
                }
            }
        } else {
            this.LJLLILLLL = motionEvent.getRawX();
            this.LJLLJ = this.LJLIL.getX();
        }
        return true;
    }
}
