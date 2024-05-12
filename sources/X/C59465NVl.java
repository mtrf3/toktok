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

/* renamed from: X.NVl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59465NVl extends LinearLayout implements InterfaceC59635Nap {
    public int LJLIL;
    public Space LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public C59462NVi LJLJJL;
    public boolean LJLJJLL;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.gwj);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.nav_bar_divide)");
        Space space = (Space) findViewById;
        this.LJLILLLLZI = space;
        space.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS197S0100000_10(this, 1));
    }

    public final C59462NVi getTitleBar() {
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
                this.LJLIL = (int) motionEvent.getY();
            } else if (valueOf.intValue() == 2) {
                int y = (int) motionEvent.getY();
                int i = y - this.LJLIL;
                Space space = this.LJLILLLLZI;
                if (space != null) {
                    int height = space.getHeight();
                    this.LJLIL = y;
                    if (height > 0 && i < 0) {
                        Space space2 = this.LJLILLLLZI;
                        if (space2 != null) {
                            ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
                            int i2 = layoutParams.height + i;
                            layoutParams.height = i2;
                            if (i2 < 0) {
                                layoutParams.height = 0;
                            }
                            Space space3 = this.LJLILLLLZI;
                            if (space3 != null) {
                                space3.setLayoutParams(layoutParams);
                                C59462NVi c59462NVi = this.LJLJJL;
                                if (c59462NVi != null) {
                                    c59462NVi.setBackgroundAlpha(layoutParams.height / this.LJLJI);
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
                        Space space4 = this.LJLILLLLZI;
                        if (space4 != null) {
                            ViewGroup.LayoutParams layoutParams2 = space4.getLayoutParams();
                            int i3 = layoutParams2.height + i;
                            layoutParams2.height = i3;
                            int i4 = this.LJLJI;
                            if (i3 > i4) {
                                layoutParams2.height = i4;
                            }
                            C59462NVi c59462NVi2 = this.LJLJJL;
                            if (c59462NVi2 != null) {
                                c59462NVi2.setBackgroundAlpha(layoutParams2.height / i4);
                            }
                            Space space5 = this.LJLILLLLZI;
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
        Space space = this.LJLILLLLZI;
        if (space != null) {
            if (space.getHeight() != this.LJLJI) {
                Space space2 = this.LJLILLLLZI;
                if (space2 != null) {
                    ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
                    layoutParams.height = this.LJLJI;
                    Space space3 = this.LJLILLLLZI;
                    if (space3 != null) {
                        space3.setLayoutParams(layoutParams);
                        return;
                    } else {
                        o.LJIJI("space");
                        throw null;
                    }
                }
                o.LJIJI("space");
                throw null;
            }
            return;
        }
        o.LJIJI("space");
        throw null;
    }

    public final void setTitleBar(C59462NVi c59462NVi) {
        this.LJLJJL = c59462NVi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59465NVl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.view.View, X.InterfaceC59635Nap
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.LJLJJI = i2;
    }
}
