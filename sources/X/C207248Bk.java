package X;

import Y.ARunnableS39S0100000_3;
import Y.IDCListenerS253S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.8Bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207248Bk implements InterfaceC207258Bl {
    public final ViewGroup LIZ;
    public final TuxIconView LIZIZ;
    public final java.util.Set<View> LIZJ;
    public final java.util.Set<String> LIZLLL;
    public boolean LJ;

    public final void LJFF() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LIZIZ.post(new ARunnableS39S0100000_3(this, 129));
    }

    public final void LJI() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        TextView textView;
        boolean z2;
        int i5;
        if (!this.LIZLLL.isEmpty()) {
            z2 = false;
        } else {
            if (this.LIZIZ.isAttachedToWindow() && this.LIZIZ.getWidth() != 0 && this.LIZIZ.getHeight() != 0) {
                for (View view : this.LIZJ) {
                    if (view.getVisibility() == 0 && view.getWidth() != 0 && view.getHeight() != 0) {
                        ViewGroup.LayoutParams layoutParams = null;
                        if (!(view instanceof TextView) || (textView = (TextView) view) == null || textView.length() != 0) {
                            float LJII = LJII(view);
                            float LJII2 = LJII(this.LIZIZ);
                            float width = view.getWidth() + LJII;
                            ViewGroup.LayoutParams layoutParams2 = this.LIZIZ.getLayoutParams();
                            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                                layoutParams2 = null;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                            if (marginLayoutParams != null) {
                                i = marginLayoutParams.leftMargin;
                            } else {
                                i = 0;
                            }
                            if (width >= LJII2 - i) {
                                float width2 = LJII2 + this.LIZIZ.getWidth();
                                ViewGroup.LayoutParams layoutParams3 = this.LIZIZ.getLayoutParams();
                                if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                                    layoutParams3 = null;
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                if (marginLayoutParams2 != null) {
                                    i2 = marginLayoutParams2.rightMargin;
                                } else {
                                    i2 = 0;
                                }
                                if (LJII > width2 + i2) {
                                    continue;
                                } else {
                                    float LJIIIIZZ = LJIIIIZZ(view);
                                    float LJIIIIZZ2 = LJIIIIZZ(this.LIZIZ);
                                    float height = view.getHeight() + LJIIIIZZ;
                                    ViewGroup.LayoutParams layoutParams4 = this.LIZIZ.getLayoutParams();
                                    if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                                        layoutParams4 = null;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                    if (marginLayoutParams3 != null) {
                                        i3 = marginLayoutParams3.topMargin;
                                    } else {
                                        i3 = 0;
                                    }
                                    if (height >= LJIIIIZZ2 - i3) {
                                        float height2 = LJIIIIZZ2 + this.LIZIZ.getHeight();
                                        ViewGroup.LayoutParams layoutParams5 = this.LIZIZ.getLayoutParams();
                                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                                            layoutParams = layoutParams5;
                                        }
                                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams;
                                        if (marginLayoutParams4 != null) {
                                            i4 = marginLayoutParams4.bottomMargin;
                                        } else {
                                            i4 = 0;
                                        }
                                        if (LJIIIIZZ <= height2 + i4) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            z = false;
            z2 = !z;
        }
        TuxIconView tuxIconView = this.LIZIZ;
        if (z2) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        tuxIconView.setVisibility(i5);
        this.LJ = false;
    }

    @Override // X.InterfaceC207258Bl
    public final void LIZ(View view) {
        o.LJIIIZ(view, "view");
        this.LIZJ.add(view);
        LJFF();
    }

    @Override // X.InterfaceC207258Bl
    public final void LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        LIZLLL(aweme.isPhotoMode());
    }

    @Override // X.InterfaceC207258Bl
    public final void LIZJ(String reason) {
        o.LJIIIZ(reason, "reason");
        this.LIZLLL.remove(reason);
        LJFF();
    }

    @Override // X.InterfaceC207258Bl
    public final void LIZLLL(boolean z) {
        if (z) {
            LIZJ(EnumC207238Bj.NOT_PHOTO_MODE.getValue());
        } else {
            LJ(EnumC207238Bj.NOT_PHOTO_MODE.getValue());
        }
    }

    @Override // X.InterfaceC207258Bl
    public final void LJ(String reason) {
        o.LJIIIZ(reason, "reason");
        this.LIZLLL.add(reason);
        LJFF();
    }

    public final float LJII(View view) {
        if (o.LJ(view, this.LIZ)) {
            return 0.0f;
        }
        Object parent = view.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        return LJII((View) parent) + view.getX();
    }

    public final float LJIIIIZZ(View view) {
        if (o.LJ(view, this.LIZ)) {
            return 0.0f;
        }
        Object parent = view.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        return LJIIIIZZ((View) parent) + view.getY();
    }

    public C207248Bk(ViewGroup container, TuxIconView tuxIconView) {
        o.LJIIIZ(container, "container");
        this.LIZ = container;
        this.LIZIZ = tuxIconView;
        this.LIZJ = new LinkedHashSet();
        this.LIZLLL = new LinkedHashSet();
        container.addOnLayoutChangeListener(new IDCListenerS253S0100000_3(this, 6));
        LJI();
    }
}
