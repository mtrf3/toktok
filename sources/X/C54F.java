package X;

import Y.ALAdapterS1S0100000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS165S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;

/* renamed from: X.54F, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54F extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final float LJLJI;
    public final int LJLJJI;
    public final float LJLJJL;
    public C54J LJLJJLL;
    public C1294856i LJLJL;
    public boolean LJLJLJ;
    public final int LJLJLLL;
    public C54I LJLL;
    public C54H LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL;

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLLILLLL;
        Integer valueOf = Integer.valueOf(R.id.n7w);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.n7w);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LJ() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 23));
        ofFloat.addListener(new ALAdapterS1S0100000_2(this, 13));
        ofFloat.start();
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LJLIL.getValue()).booleanValue();
    }

    public final EditorProContext getEditorContext() {
        return (EditorProContext) this.LJLILLLLZI.getValue();
    }

    public final float getMaxSelectFrameWidthOnScreen() {
        return this.LJLJLLL - (2 * this.LJLJI);
    }

    public final long getVideoSelectFrameEndTime() {
        float f;
        C54J c54j = this.LJLJJLL;
        if (c54j != null) {
            f = c54j.getVideoFrameScale();
        } else {
            f = this.LJLJJL;
        }
        return getVideoSelectFrameStartTime() + O6R.LJJIJ((((C54Y) LIZ()).getSelectFrameRect().width() / f) * 1000);
    }

    public final long getVideoSelectFrameStartTime() {
        int i;
        float f;
        float f2;
        C54J c54j = this.LJLJJLL;
        if (c54j != null) {
            i = c54j.getScrollX();
        } else {
            i = 0;
        }
        C54J c54j2 = this.LJLJJLL;
        if (c54j2 != null) {
            f = c54j2.getVideoFrameScale();
        } else {
            f = this.LJLJJL;
        }
        float LJIIJJI = ((float) (getEditorContext().getMainTrack().LJIIJJI() / 1000)) * f;
        float videoSelectFrameLeft = getVideoSelectFrameLeft();
        float videoSelectFrameRight = getVideoSelectFrameRight();
        float f3 = i;
        if (LIZJ()) {
            f2 = (LJIIJJI - f3) - videoSelectFrameRight;
        } else {
            f2 = f3 + videoSelectFrameLeft;
        }
        return O6R.LJJIJ((f2 / f) * 1000);
    }

    public final void LIZIZ() {
        float f = -((getMaxSelectFrameWidthOnScreen() - getVideoSelectFrameRight()) + this.LJLJI);
        C1294856i c1294856i = this.LJLJL;
        if (c1294856i == null) {
            return;
        }
        if (!LIZJ()) {
            f = getVideoSelectFrameLeft() + this.LJLJI;
        }
        c1294856i.setTranslationX(f);
    }

    public final void LJFF() {
        if (LIZ().getVisibility() != 0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 24));
            ofFloat.addListener(new ALAdapterS1S0100000_2(this, 14));
            ofFloat.start();
        }
    }

    public final float getVideoSelectFrameLeft() {
        RectF selectFrameRect;
        C54Y c54y = (C54Y) LIZ();
        if (c54y != null && (selectFrameRect = c54y.getSelectFrameRect()) != null) {
            return selectFrameRect.left - this.LJLJI;
        }
        return 0.0f;
    }

    public final float getVideoSelectFrameRight() {
        RectF selectFrameRect;
        C54Y c54y = (C54Y) LIZ();
        if (c54y != null && (selectFrameRect = c54y.getSelectFrameRect()) != null) {
            return selectFrameRect.right - this.LJLJI;
        }
        return 0.0f;
    }

    public final C1294856i getCursor$tools_camera_edit_release() {
        return this.LJLJL;
    }

    public final int getScreenWidth() {
        return this.LJLJLLL;
    }

    public final C54I getVideoCursorTouchListener() {
        return this.LJLL;
    }

    public final C54J getVideoFrameTrack$tools_camera_edit_release() {
        return this.LJLJJLL;
    }

    public final C54H getVideoSelectFrameMoveListener() {
        return this.LJLLI;
    }

    public final void LIZLLL(float f) {
        if (!this.LJLJLJ) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        float width = ((C54Y) LIZ()).getSelectFrameRect().width() * f;
        float videoSelectFrameRight = ((getVideoSelectFrameRight() - getMaxSelectFrameWidthOnScreen()) - width) - this.LJLJI;
        C1294856i c1294856i = this.LJLJL;
        if (c1294856i == null) {
            return;
        }
        if (!LIZJ()) {
            videoSelectFrameRight = getVideoSelectFrameLeft() + this.LJLJI + width;
        }
        c1294856i.setTranslationX(videoSelectFrameRight);
    }

    public final void setCursor$tools_camera_edit_release(C1294856i c1294856i) {
        this.LJLJL = c1294856i;
    }

    public final void setVideoCursorTouchListener(C54I c54i) {
        this.LJLL = c54i;
    }

    public final void setVideoFrameTrack$tools_camera_edit_release(C54J c54j) {
        this.LJLJJLL = c54j;
    }

    public final void setVideoSelectFrameMoveListener(C54H c54h) {
        this.LJLLI = c54h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLILLLL = C62850Ola.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(context, 834));
        this.LJLILLLLZI = C221108m2.LIZIZ(C123534t3.LJLIL);
        this.LJLJI = C134845Qy.LIZ(42.0f);
        this.LJLJJI = C134845Qy.LIZ(34.0f);
        this.LJLJJL = C134845Qy.LIZ(34.0f) / 1000.0f;
        this.LJLJLJ = true;
        this.LJLJLLL = C134845Qy.LIZJ(C58S.LIZ());
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.asl, this, true);
        if ((LLLLIILL instanceof ViewGroup) && LLLLIILL != null) {
            this.LJLJJLL = (C54J) LLLLIILL.findViewById(R.id.n5q);
            this.LJLJL = (C1294856i) LLLLIILL.findViewById(R.id.n5p);
        }
        C1294856i c1294856i = this.LJLJL;
        if (c1294856i != null) {
            c1294856i.setOnMoveListener(new AqS165S0200000_2(c1294856i, this, 3));
            c1294856i.setOnMoveDownListener(new AqS168S0100000_2(this, 504));
            c1294856i.setOnMoveUpListener(new AqS168S0100000_2(this, 505));
        }
        ((C54Y) LIZ()).setOnMoveDownListener(new AqS168S0100000_2(this, 506));
        ((C54Y) LIZ()).setOnMoveListener(new AqS184S0100000_2(this, 66));
        ((C54Y) LIZ()).setOnMoveUpListener(new AqS168S0100000_2(this, 499));
    }
}
