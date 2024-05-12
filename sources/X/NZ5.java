package X;

import Y.IDLListenerS197S0100000_10;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NZ5 extends LinearLayout {
    public Space LJLIL;
    public NZR LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public NZ3 LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.gwj);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.nav_bar_divide)");
        Space space = (Space) findViewById;
        this.LJLIL = space;
        space.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS197S0100000_10(this, 4));
    }

    public final NZ3 getTitleBar() {
        return this.LJLJJL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (!this.LJLJJLL) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
            if (valueOf.intValue() == 0) {
                motionEvent.getY();
                this.LJLJL = (int) motionEvent.getY();
            } else if (valueOf.intValue() == 2) {
                int y = (int) motionEvent.getY();
                int i = y - this.LJLJL;
                Space space = this.LJLIL;
                if (space != null) {
                    int height = space.getHeight();
                    this.LJLJL = y;
                    if (height > 0 && i < 0) {
                        Space space2 = this.LJLIL;
                        if (space2 != null) {
                            ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
                            int i2 = layoutParams.height + i;
                            layoutParams.height = i2;
                            if (i2 < 0) {
                                layoutParams.height = 0;
                            }
                            Space space3 = this.LJLIL;
                            if (space3 != null) {
                                space3.setLayoutParams(layoutParams);
                                NZ3 nz3 = this.LJLJJL;
                                if (nz3 != null) {
                                    nz3.setBackgroundAlpha(layoutParams.height / this.LJLJI);
                                }
                                return true;
                            }
                            o.LJIJI("space");
                            throw null;
                        }
                        o.LJIJI("space");
                        throw null;
                    }
                    if (height < this.LJLJI && this.LJLJJI == 0 && i > 0) {
                        Space space4 = this.LJLIL;
                        if (space4 != null) {
                            ViewGroup.LayoutParams layoutParams2 = space4.getLayoutParams();
                            int i3 = layoutParams2.height + i;
                            layoutParams2.height = i3;
                            int i4 = this.LJLJI;
                            if (i3 > i4) {
                                layoutParams2.height = i4;
                            }
                            NZ3 nz32 = this.LJLJJL;
                            if (nz32 != null) {
                                nz32.setBackgroundAlpha(layoutParams2.height / i4);
                            }
                            Space space5 = this.LJLIL;
                            if (space5 != null) {
                                space5.setLayoutParams(layoutParams2);
                                return true;
                            }
                            o.LJIJI("space");
                            throw null;
                        }
                        o.LJIJI("space");
                        throw null;
                    }
                } else {
                    o.LJIJI("space");
                    throw null;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setGradualChangeMode(boolean z) {
        this.LJLJJLL = z;
        Space space = this.LJLIL;
        if (space != null) {
            if (space.getHeight() != this.LJLJI) {
                Space space2 = this.LJLIL;
                if (space2 != null) {
                    ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
                    layoutParams.height = this.LJLJI;
                    Space space3 = this.LJLIL;
                    if (space3 != null) {
                        space3.setLayoutParams(layoutParams);
                    } else {
                        o.LJIJI("space");
                        throw null;
                    }
                } else {
                    o.LJIJI("space");
                    throw null;
                }
            }
            View findViewById = findViewById(R.id.c02);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.cross_react_view)");
            NZR LIZ = ((NXI) ((NZQ) findViewById).LJI(NXI.class)).LIZ();
            o.LJIIIIZZ(LIZ, "crossPlatformWebView.get…Wrap::class.java).webView");
            this.LJLILLLLZI = LIZ;
            LIZ.setWebScrollListener(new NZ6(this));
            return;
        }
        o.LJIJI("space");
        throw null;
    }

    public final void setTitleBar(NZ3 nz3) {
        this.LJLJJL = nz3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NZ5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
