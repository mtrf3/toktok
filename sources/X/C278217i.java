package X;

import Y.IDLAdapterS2S0100000;
import Y.IDUListenerS263S0100000;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import java.util.HashMap;

/* renamed from: X.17i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C278217i extends AbstractC004900f {
    public final C45101pq LIZ;
    public final C005500l LIZIZ;
    public ValueAnimator LIZJ;
    public TimeInterpolator LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJJI;
    public boolean LJIILIIL;
    public boolean LJIIJ = true;
    public boolean LJIIL = true;

    @Override // X.AbstractC004900f
    public final void LIZ() {
        ((HashMap) C005600m.LIZ).remove(this.LIZIZ.LJIIJJI);
        this.LIZ.dismiss();
        this.LJIIJJI = false;
        InterfaceC005200i interfaceC005200i = this.LIZIZ.LJIILIIL;
        if (interfaceC005200i != null) {
            interfaceC005200i.onDismiss();
        }
    }

    public final View LIZIZ() {
        this.LJIIIZ = ViewConfiguration.get(this.LIZIZ.LIZ).getScaledTouchSlop();
        return this.LIZIZ.LIZIZ;
    }

    public final void LIZJ() {
        if (this.LJIIJ || !this.LJIIJJI) {
            return;
        }
        LIZIZ().setVisibility(4);
        this.LJIIJJI = false;
        InterfaceC005200i interfaceC005200i = this.LIZIZ.LJIILIIL;
        if (interfaceC005200i == null) {
            return;
        }
        interfaceC005200i.onHide();
    }

    public final void LIZLLL() {
        if (this.LJIIJ) {
            this.LIZ.init();
            this.LJIIJ = false;
            this.LJIIJJI = true;
        } else {
            if (this.LJIIJJI && LIZIZ().getVisibility() == 0) {
                return;
            }
            LIZIZ().setVisibility(0);
            this.LJIIJJI = true;
        }
        InterfaceC005200i interfaceC005200i = this.LIZIZ.LJIILIIL;
        if (interfaceC005200i != null) {
            interfaceC005200i.onShow();
        }
        this.LIZIZ.getClass();
    }

    public final void LJ() {
        if (this.LIZIZ.LJIIJ == null) {
            if (this.LIZLLL == null) {
                this.LIZLLL = new DecelerateInterpolator();
            }
            this.LIZIZ.LJIIJ = this.LIZLLL;
        }
        this.LIZJ.setInterpolator(this.LIZIZ.LJIIJ);
        this.LIZJ.addListener(new IDLAdapterS2S0100000(this, 0));
        this.LIZJ.setDuration(this.LIZIZ.LJIIIZ).start();
        InterfaceC005200i interfaceC005200i = this.LIZIZ.LJIILIIL;
        if (interfaceC005200i != null) {
            interfaceC005200i.LJIIIIZZ();
        }
    }

    public C278217i() {
    }

    public C278217i(C005500l c005500l) {
        this.LIZIZ = c005500l;
        C45101pq c45101pq = new C45101pq(c005500l.LIZ);
        this.LIZ = c45101pq;
        LIZIZ().setOnTouchListener(new View.OnTouchListener() { // from class: X.00k
            public float LJLIL;
            public float LJLILLLLZI;
            public float LJLJI;
            public float LJLJJI;
            public int LJLJJL;
            public int LJLJJLL;
            public final Point LJLJL = new Point();

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z;
                int i;
                InterfaceC005200i interfaceC005200i;
                InterfaceC005200i interfaceC005200i2;
                boolean z2;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            C278217i.this.LJIILIIL = false;
                        } else {
                            this.LJLJI = motionEvent.getRawX() - this.LJLIL;
                            this.LJLJJI = motionEvent.getRawY() - this.LJLILLLLZI;
                            C278217i c278217i = C278217i.this;
                            if (!c278217i.LJIILIIL) {
                                if (Math.abs(motionEvent.getRawX() - C278217i.this.LJ) > C278217i.this.LJIIIZ || Math.abs(motionEvent.getRawY() - C278217i.this.LJFF) > C278217i.this.LJIIIZ) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c278217i.LJIILIIL = z2;
                            }
                            if (C278217i.this.LJIILIIL) {
                                this.LJLJI = motionEvent.getRawX() - this.LJLIL;
                                this.LJLJJI = motionEvent.getRawY() - this.LJLILLLLZI;
                                if (Math.abs(this.LJLJI) > 0.0f || Math.abs(this.LJLJJI) > 0.0f) {
                                    C278217i c278217i2 = C278217i.this;
                                    C45101pq c45101pq2 = c278217i2.LIZ;
                                    this.LJLJJL = (int) (c45101pq2.LJLJJL + this.LJLJI);
                                    this.LJLJJLL = (int) (c45101pq2.LJLJJLL + this.LJLJJI);
                                    c278217i2.LIZIZ.getClass();
                                    C278217i c278217i3 = C278217i.this;
                                    if (c278217i3.LIZIZ.LJI != 5) {
                                        c278217i3.LIZ.LLLLZLLIL(this.LJLJJL, this.LJLJJLL);
                                        C278217i c278217i4 = C278217i.this;
                                        InterfaceC005200i interfaceC005200i3 = c278217i4.LIZIZ.LJIILIIL;
                                        if (interfaceC005200i3 != null) {
                                            if (c278217i4.LJIIL) {
                                                interfaceC005200i3.LJIIIIZZ();
                                                C278217i.this.LJIIL = false;
                                            }
                                            C278217i.this.LIZIZ.LJIILIIL.LJ(this.LJLJJL, this.LJLJJLL);
                                        }
                                    }
                                }
                                this.LJLIL = motionEvent.getRawX();
                                this.LJLILLLLZI = motionEvent.getRawY();
                            }
                        }
                    } else {
                        C278217i.this.LJI = motionEvent.getRawX();
                        C278217i.this.LJII = motionEvent.getRawY();
                        C278217i c278217i5 = C278217i.this;
                        float abs = Math.abs(c278217i5.LJI - c278217i5.LJ);
                        C278217i c278217i6 = C278217i.this;
                        if (abs > c278217i6.LJIIIZ || Math.abs(c278217i6.LJII - c278217i6.LJFF) > C278217i.this.LJIIIZ) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c278217i5.LJIIIIZZ = z;
                        C278217i c278217i7 = C278217i.this;
                        c278217i7.LJIILIIL = false;
                        C005500l c005500l2 = c278217i7.LIZIZ;
                        int i2 = c005500l2.LJI;
                        if (i2 != 3) {
                            if (i2 == 4) {
                                ValueAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.X, c278217i7.LIZ.LJLJJL, c005500l2.LJ), PropertyValuesHolder.ofFloat((Property<?, Float>) View.Y, c278217i7.LIZ.LJLJJLL, c278217i7.LIZIZ.LJFF));
                                c278217i7.LIZJ = ofPropertyValuesHolder;
                                ofPropertyValuesHolder.addUpdateListener(new IDUListenerS263S0100000(c278217i7, 0));
                                c278217i7.LJ();
                            }
                            if (!c278217i7.LJIIIIZZ && (interfaceC005200i2 = c005500l2.LJIILIIL) != null) {
                                interfaceC005200i2.LIZIZ();
                            }
                            if (c278217i7.LJIIIIZZ && (interfaceC005200i = c278217i7.LIZIZ.LJIILIIL) != null) {
                                interfaceC005200i.LJFF();
                            }
                        } else {
                            if (c278217i7.LJIIIIZZ) {
                                int i3 = c278217i7.LIZ.LJLJJL;
                                if (view.getWidth() + (i3 * 2) > KL2.LJIIJJI(c278217i7.LIZIZ.LIZ)) {
                                    i = (KL2.LJIIJJI(c278217i7.LIZIZ.LIZ) - view.getWidth()) - c278217i7.LIZIZ.LJIIIIZZ;
                                } else {
                                    i = c278217i7.LIZIZ.LJII;
                                }
                                int i4 = c278217i7.LIZ.LJLJJLL;
                                c278217i7.LIZIZ.getClass();
                                if (i4 < 0) {
                                    c278217i7.LIZIZ.getClass();
                                } else {
                                    int LJIIJJI = C15380j0.LJIIJJI();
                                    c278217i7.LIZIZ.getClass();
                                    if (i4 > LJIIJJI) {
                                        C15380j0.LJIIJJI();
                                        c278217i7.LIZIZ.getClass();
                                    }
                                }
                                c278217i7.LIZIZ.getClass();
                                c278217i7.LIZIZ.getClass();
                                ValueAnimator ofInt = ObjectAnimator.ofInt(i3, i);
                                c278217i7.LIZJ = ofInt;
                                ofInt.addUpdateListener(new IDUListenerS263S0100000(c278217i7, 1));
                                c278217i7.LJ();
                            }
                            if (!c278217i7.LJIIIIZZ) {
                                interfaceC005200i2.LIZIZ();
                            }
                            if (c278217i7.LJIIIIZZ) {
                                interfaceC005200i.LJFF();
                            }
                        }
                    }
                } else {
                    C278217i.this.LJ = motionEvent.getRawX();
                    C278217i.this.LJFF = motionEvent.getRawY();
                    this.LJLIL = motionEvent.getRawX();
                    this.LJLILLLLZI = motionEvent.getRawY();
                    C278217i c278217i8 = C278217i.this;
                    ValueAnimator valueAnimator = c278217i8.LIZJ;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        c278217i8.LIZJ.cancel();
                    }
                    C278217i c278217i9 = C278217i.this;
                    WindowManager windowManager = c278217i9.LIZ.LJLILLLLZI;
                    if (windowManager != null) {
                        windowManager.getDefaultDisplay().getSize(this.LJLJL);
                        C278217i.this.getClass();
                    } else {
                        KL2.LJIIIZ(c278217i9.LIZIZ.LIZ);
                        KL2.LJIIJJI(C278217i.this.LIZIZ.LIZ);
                    }
                    C278217i c278217i10 = C278217i.this;
                    c278217i10.LJIIL = true;
                    c278217i10.LJIILIIL = false;
                }
                return C278217i.this.LJIIIIZZ;
            }
        });
        c45101pq.LLLLZIL(c005500l.LIZJ, c005500l.LIZLLL);
        c45101pq.LLLLZ(c005500l.LJ, c005500l.LJFF);
        c45101pq.LJLJJI = c005500l.LIZIZ;
        if (!GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
            new C005000g(c005500l.LIZ, new C278117h(this));
        }
    }
}
