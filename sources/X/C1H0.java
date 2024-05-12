package X;

import Y.IDUListenerS263S0100000;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1H0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1H0 extends ConstraintLayout {
    public View LJLIL;
    public C41101jO LJLILLLLZI;
    public C47061t0 LJLJI;
    public C47121t6 LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public final int LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public float LJLLJ;
    public ValueAnimator LJLLL;
    public int LJLLLL;
    public InterfaceC88472Yns<? super AbstractC07650Rt, C76800UCe> LJLLLLLL;

    public final void LJJLJLI() {
        this.LJLJL = -1.0f;
        this.LJLJJLL = -1.0f;
        this.LJLJJL = -1.0f;
        this.LJLJLLL = false;
        this.LJLL = false;
        this.LJLLI = false;
    }

    public final void LJJLL() {
        ValueAnimator valueAnimator = this.LJLLL;
        if (valueAnimator == null) {
            valueAnimator = ValueAnimator.ofFloat(0.0f, 360.0f);
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(4000L);
            valueAnimator.setInterpolator(new LinearInterpolator());
            valueAnimator.addUpdateListener(new IDUListenerS263S0100000(this, 12));
            this.LJLLL = valueAnimator;
        }
        if (valueAnimator.isPaused()) {
            valueAnimator.resume();
        } else {
            valueAnimator.start();
        }
    }

    public final InterfaceC88472Yns<AbstractC07650Rt, C76800UCe> getCarrier() {
        return this.LJLLLLLL;
    }

    public final C47061t0 getCoverView() {
        return this.LJLJI;
    }

    public final int getCurRedDotCount() {
        return this.LJLLLL;
    }

    public final View getHoverContainer() {
        return this.LJLIL;
    }

    public final boolean getInStickerRegion() {
        return this.LJLLI;
    }

    public final C41101jO getLyricView() {
        return this.LJLILLLLZI;
    }

    public final boolean getNeedDragSticker() {
        return this.LJLL;
    }

    public final boolean getNeedUpdatePosition() {
        return this.LJLJLLL;
    }

    public final C47121t6 getRedDotView() {
        return this.LJLJJI;
    }

    public final ValueAnimator getRotateAnimator() {
        return this.LJLLL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1H0.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        View view;
        C48459J0d<Float> c48459J0d;
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTouch-Event: ");
        LIZ.append(event.getAction());
        C0NB.LIZIZ("KLyric", X1D.LIZIZ(LIZ));
        if (this.LJLIL == null) {
            return super.onTouchEvent(event);
        }
        if (!this.LJLL) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    LJJLJLI();
                }
            } else {
                View view2 = this.LJLIL;
                if (view2 != null) {
                    C0NB.LIZIZ("KLyric", "onTouch-Move");
                    event.getX();
                    float y = view2.getY() + (event.getY() - this.LJLJL);
                    if (y < 0.0f) {
                        y = 0.0f;
                    }
                    if (y > this.LJLLJ) {
                        C0NB.LIZIZ("KLyric", "onTouch-Move1");
                        y = this.LJLLJ;
                    }
                    if (y != view2.getY()) {
                        C0NB.LIZIZ("KLyric", "onTouch-Move2");
                        View view3 = this.LJLIL;
                        if (view3 != null) {
                            view3.setY(y);
                        }
                        this.LJLJL = event.getY();
                        this.LJLJLLL = true;
                    }
                } else {
                    return false;
                }
            }
        } else {
            if (this.LJLJLLL && (view = this.LJLIL) != null) {
                if (this.LJLLILLLL == 1) {
                    c48459J0d = InterfaceC30442Bx8.G3;
                } else {
                    c48459J0d = InterfaceC30442Bx8.H3;
                }
                c48459J0d.LIZ(Float.valueOf(view.getY()));
            }
            LJJLJLI();
        }
        return true;
    }

    public final void setCarrier(InterfaceC88472Yns<? super AbstractC07650Rt, C76800UCe> interfaceC88472Yns) {
        this.LJLLLLLL = interfaceC88472Yns;
    }

    public final void setCoverView(C47061t0 c47061t0) {
        this.LJLJI = c47061t0;
    }

    public final void setCurRedDotCount(int i) {
        this.LJLLLL = i;
    }

    public final void setHoverContainer(View view) {
        this.LJLIL = view;
    }

    public final void setInStickerRegion(boolean z) {
        this.LJLLI = z;
    }

    public final void setLyricView(C41101jO c41101jO) {
        this.LJLILLLLZI = c41101jO;
    }

    public final void setNeedDragSticker(boolean z) {
        this.LJLL = z;
    }

    public final void setNeedUpdatePosition(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setRedDot(int i) {
        this.LJLLLL = i;
        if (i == 0) {
            View findViewById = findViewById(R.id.k6u);
            o.LJIIIIZZ(findViewById, "findViewById<View>(R.id.song_cover_icon_area)");
            C26340AVk.LIZIZ(findViewById);
        } else {
            View findViewById2 = findViewById(R.id.k6u);
            o.LJIIIIZZ(findViewById2, "findViewById<View>(R.id.song_cover_icon_area)");
            C26340AVk.LIZ(findViewById2, i);
        }
    }

    public final void setRedDotView(C47121t6 c47121t6) {
        this.LJLJJI = c47121t6;
    }

    public final void setRole(int i) {
        Float rememberY;
        this.LJLLILLLL = i;
        View view = this.LJLIL;
        if (view != null) {
            if (i == 1) {
                rememberY = InterfaceC30442Bx8.G3.LIZJ();
            } else {
                rememberY = InterfaceC30442Bx8.H3.LIZJ();
            }
            if (!o.LIZJ(rememberY, -1.0f)) {
                o.LJIIIIZZ(rememberY, "rememberY");
                view.setY(rememberY.floatValue());
            } else {
                view.setY(C15380j0.LIZ(70.0f));
            }
        }
    }

    public final void setRotateAnimator(ValueAnimator valueAnimator) {
        this.LJLLL = valueAnimator;
    }

    public final void setRtl$liveeffect_impl_release(boolean z) {
        if (z) {
            C47061t0 c47061t0 = this.LJLJI;
            if (c47061t0 == null) {
                return;
            }
            c47061t0.setRotationY(180.0f);
            return;
        }
        C47061t0 c47061t02 = this.LJLJI;
        if (c47061t02 == null) {
            return;
        }
        c47061t02.setRotationY(0.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1H0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LJLJLJ = ViewConfiguration.get(context).getScaledTouchSlop();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.d9z, this, false);
        C47061t0 c47061t0 = null;
        if (LLLLIILL != null) {
            C41101jO c41101jO = (C41101jO) LLLLIILL.findViewById(R.id.gbb);
            if (c41101jO != null) {
                C17E displayConfig = c41101jO.getDisplayConfig();
                Context context2 = c41101jO.getContext();
                o.LJIIIIZZ(context2, "getContext()");
                displayConfig.getClass();
                int LIZIZ = C259910h.LIZIZ(R.attr.aw_, context2);
                displayConfig.LJFF.setTextSize(C15380j0.LIZ(17.0f));
                displayConfig.LJFF.setColor(C15380j0.LIZIZ(R.color.a65));
                displayConfig.LJFF.setDither(true);
                displayConfig.LJFF.setFakeBoldText(true);
                displayConfig.LJFF.setShadowLayer(10.0f, 0.0f, 0.0f, LIZIZ);
                displayConfig.LJFF.setAntiAlias(true);
                displayConfig.LJFF.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                displayConfig.LJI.setTextSize(C15380j0.LIZ(17.0f));
                displayConfig.LJI.setColor(C259910h.LIZIZ(R.attr.aw9, context2));
                displayConfig.LJI.setDither(true);
                displayConfig.LJI.setAntiAlias(true);
                displayConfig.LJI.setFakeBoldText(true);
                displayConfig.LJI.setShadowLayer(10.0f, 0.0f, 0.0f, LIZIZ);
                displayConfig.LJI.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                displayConfig.LJII.setTextSize(C15380j0.LIZ(17.0f));
                displayConfig.LJII.setColor(C15380j0.LIZIZ(R.color.a66));
                displayConfig.LJII.setDither(true);
                displayConfig.LJII.setAntiAlias(true);
                displayConfig.LJII.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                displayConfig.LJ.setTextSize(C15380j0.LIZ(17.0f));
                displayConfig.LJ.setColor(C15380j0.LIZIZ(R.color.a65));
                displayConfig.LJ.setDither(true);
                displayConfig.LJ.setFakeBoldText(true);
                displayConfig.LJ.setShadowLayer(10.0f, 0.0f, 0.0f, LIZIZ);
                displayConfig.LJ.setAntiAlias(true);
                displayConfig.LJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            } else {
                c41101jO = null;
            }
            this.LJLILLLLZI = c41101jO;
            this.LJLJJI = (C47121t6) LLLLIILL.findViewById(R.id.gzv);
            C47061t0 c47061t02 = (C47061t0) LLLLIILL.findViewById(R.id.k6t);
            if (c47061t02 != null) {
                C29306Beo.LJJJLL(c47061t02, 500L, new IDqS416S0100000(this, 60));
                c47061t0 = c47061t02;
            }
            this.LJLJI = c47061t0;
        } else {
            LLLLIILL = null;
        }
        this.LJLIL = LLLLIILL;
        if (LLLLIILL != null) {
            addView(LLLLIILL);
            setRtl$liveeffect_impl_release(C15380j0.LJIIZILJ());
        }
    }
}
