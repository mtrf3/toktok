package com.ss.android.ugc.aweme.feed.ui.seekbar;

import X.C183477Hz;
import X.C32151Nz;
import X.C46382IIg;
import X.C55369LoD;
import X.C55468Lpo;
import X.C56448MDk;
import X.C76800UCe;
import X.C77869UhF;
import X.C7I0;
import X.C7MY;
import X.C81238VuU;
import X.C90193gN;
import X.IHZ;
import X.InterfaceC65784Pro;
import X.LAK;
import X.X1D;
import android.content.Context;
import android.graphics.Rect;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class VideoSeekBarMaskView extends FrameLayout {
    public C56448MDk LJLIL;
    public C81238VuU LJLILLLLZI;
    public C55369LoD LJLJI;
    public Rect LJLJJI;
    public boolean LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public float LJLL;
    public boolean LJLLI;
    public final IHZ LJLLILLLL;
    public final boolean LJLLJ;
    public final boolean LJLLL;
    public boolean LJLLLL;
    public C55468Lpo LJLLLLLL;

    public final C55369LoD getController() {
        return this.LJLJI;
    }

    public final boolean getDisableSeekTouch() {
        return this.LJLLI;
    }

    public final float getLastDownRawX() {
        return this.LJLJJLL;
    }

    public final float getLastDownRawY() {
        return this.LJLJL;
    }

    public final float getMoveDx() {
        return this.LJLL;
    }

    public final C81238VuU getMutableSeekBar() {
        return this.LJLILLLLZI;
    }

    public final boolean getNeedHandleMove() {
        return this.LJLJLJ;
    }

    public final Rect getSeekBarRect() {
        return this.LJLJJI;
    }

    public final int getTouchSlop() {
        return this.LJLJLLL;
    }

    public final C56448MDk getVideoSeekBar() {
        return this.LJLIL;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSeekBarMaskView(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LJLLJ && this.LJLJJL) {
            return true;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).canScrollVertically(i)) {
                return true;
            }
        }
        return super.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        C55468Lpo c55468Lpo = this.LJLLLLLL;
        if (c55468Lpo == null || !c55468Lpo.LIZ()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 3) {
                return true;
            }
            if (c55468Lpo.LIZIZ.sM()) {
                c55468Lpo.LIZIZ.Zt0(false);
            }
            c55468Lpo.LJI.removeMessages(1);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c55468Lpo.LJ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            c55468Lpo.LIZLLL = false;
            return true;
        }
        View view = c55468Lpo.LJFF;
        if (view != null) {
            view.setVisibility(8);
        }
        C77869UhF c77869UhF = c55468Lpo.LIZJ;
        if (c77869UhF != null) {
            c77869UhF.clearAnimation();
        }
        c55468Lpo.LJI.removeMessages(2);
        if (C183477Hz.LIZ(motionEvent.getX(), motionEvent.getY(), c55468Lpo.LIZ.getWidth(), c55468Lpo.LIZ.getHeight()) == C7I0.INVALID_ZONE) {
            return true;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = motionEvent;
        c55468Lpo.LJI.sendMessageDelayed(obtain, 300L);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C56448MDk c56448MDk;
        C56448MDk c56448MDk2;
        C56448MDk c56448MDk3;
        Integer valueOf;
        if (!this.LJLLJ || (((c56448MDk = this.LJLIL) != null && c56448MDk.getVisibility() == 8) || (((c56448MDk2 = this.LJLIL) != null && c56448MDk2.getVisibility() == 4) || (((c56448MDk3 = this.LJLIL) != null && c56448MDk3.getSeekBarShowType() == 3) || this.LJLLI)))) {
            if (this.LJLLL) {
                this.LJLJJL = false;
                this.LJLJLJ = false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        C55468Lpo c55468Lpo = this.LJLLLLLL;
        if (c55468Lpo != null && c55468Lpo.LIZ()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        Rect rect = new Rect();
        this.LJLJJI = rect;
        C81238VuU c81238VuU = this.LJLILLLLZI;
        if (c81238VuU != null) {
            c81238VuU.getGlobalVisibleRect(rect);
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                SettingsManager.LIZLLL().getClass();
                float LJIIZILJ = C32151Nz.LJIIZILJ(Integer.valueOf(SettingsManager.LJ("increase_seek_bar_touch_area", 100) / 2));
                int LIZIZ = C7MY.LIZIZ(12);
                if (this.LJLJJI != null && rawX >= r2.left + LIZIZ && rawX <= r2.right - LIZIZ && rawY >= r2.top - LJIIZILJ && rawY <= r2.bottom + LJIIZILJ) {
                    this.LJLJJL = true;
                    this.LJLJJLL = motionEvent.getRawX();
                    this.LJLJL = motionEvent.getRawY();
                } else {
                    this.LJLJJL = false;
                }
            } else if (valueOf.intValue() == 2) {
                if (this.LJLJJL) {
                    float abs = Math.abs(this.LJLJJLL - motionEvent.getRawX());
                    float abs2 = Math.abs(this.LJLJL - motionEvent.getRawY());
                    this.LJLL = abs;
                    if (abs > this.LJLJLLL && abs > abs2) {
                        this.LJLJLJ = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                if (this.LJLJJL && this.LJLJLJ) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.LJLJJL = false;
                this.LJLJLJ = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        C55369LoD c55369LoD;
        C56448MDk c56448MDk;
        if ((!this.LJLLJ || (((c56448MDk = this.LJLIL) != null && c56448MDk.getSeekBarShowType() == 3) || this.LJLLI)) && motionEvent != null && motionEvent.getAction() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        C55468Lpo c55468Lpo = this.LJLLLLLL;
        if (c55468Lpo != null && c55468Lpo.LIZ()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 2) {
                float rawX = motionEvent.getRawX() - this.LJLJJLL;
                if (this.LJLLLL) {
                    rawX = -rawX;
                }
                if (Math.abs(rawX) > this.LJLJLLL || this.LJLJLJ) {
                    C55369LoD c55369LoD2 = this.LJLJI;
                    if (c55369LoD2 != null) {
                        c55369LoD2.LIZ(rawX, false);
                    }
                    this.LJLJLJ = true;
                    this.LJLJJLL = motionEvent.getRawX();
                }
            } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                if (this.LJLJLJ && (c55369LoD = this.LJLJI) != null) {
                    c55369LoD.LIZ(0.0f, true);
                }
                this.LJLJJL = false;
                this.LJLJLJ = false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setController(C55369LoD c55369LoD) {
        this.LJLJI = c55369LoD;
    }

    public final void setDisableSeekTouch(boolean z) {
        this.LJLLI = z;
    }

    public final void setDownInRect(boolean z) {
        this.LJLJJL = z;
    }

    public final void setLastDownRawX(float f) {
        this.LJLJJLL = f;
    }

    public final void setLastDownRawY(float f) {
        this.LJLJL = f;
    }

    public final void setMoveDx(float f) {
        this.LJLL = f;
    }

    public final void setMutableSeekBar(C81238VuU c81238VuU) {
        this.LJLILLLLZI = c81238VuU;
    }

    public final void setNeedHandleMove(boolean z) {
        this.LJLJLJ = z;
    }

    public final void setRTL(boolean z) {
        this.LJLLLL = z;
    }

    public final void setSeekBarController(C55369LoD c55369LoD) {
        this.LJLJI = c55369LoD;
    }

    public final void setSeekBarRect(Rect rect) {
        this.LJLJJI = rect;
    }

    public final void setSeekBarView(C56448MDk videoSeekBarView) {
        o.LJIIIZ(videoSeekBarView, "videoSeekBarView");
        this.LJLIL = videoSeekBarView;
        this.LJLILLLLZI = videoSeekBarView.getMutableSeekBar();
        this.LJLLLL = C90193gN.LIZ();
        IHZ ihz = this.LJLLILLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("seekbar init, is touch area open: ");
        LIZ.append(this.LJLLJ);
        LIZ.append(", ");
        ihz.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    public final void setTouchSlop(int i) {
        this.LJLJLLL = i;
    }

    public final void setVideoSeekBar(C56448MDk c56448MDk) {
        this.LJLIL = c56448MDk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSeekBarMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLLILLLL = new IHZ("VideoSeekBarMaskView");
        this.LJLLJ = ((Boolean) LAK.LIZ.getValue()).booleanValue();
        this.LJLLL = C46382IIg.LIZ;
        this.LJLJLLL = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
