package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aTV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93601aTV extends View {
    public final C93776aWK LJLIL;
    public C93714aVK LJLILLLLZI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            C93776aWK c93776aWK = this.LJLIL;
            C93714aVK c93714aVK = this.LJLILLLLZI;
            if (c93714aVK != null) {
                EnumC93715aVL transState = c93714aVK.LIZ;
                c93776aWK.getClass();
                o.LJIIIZ(transState, "transState");
                EnumC93715aVL enumC93715aVL = EnumC93715aVL.ALL;
                if (transState == enumC93715aVL || transState == EnumC93715aVL.X) {
                    float measuredWidth = getMeasuredWidth() / 2.0f;
                    canvas.drawLine(measuredWidth, 0.0f, measuredWidth, c93776aWK.LIZIZ, c93776aWK.LIZ());
                    float measuredHeight = getMeasuredHeight();
                    canvas.drawLine(measuredWidth, measuredHeight - c93776aWK.LIZIZ, measuredWidth, measuredHeight, c93776aWK.LIZ());
                }
                if (transState == enumC93715aVL || transState == EnumC93715aVL.Y) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    canvas.drawLine(0.0f, measuredHeight2, c93776aWK.LIZIZ, measuredHeight2, c93776aWK.LIZ());
                    float measuredWidth2 = getMeasuredWidth();
                    canvas.drawLine(measuredWidth2 - c93776aWK.LIZIZ, measuredHeight2, measuredWidth2, measuredHeight2, c93776aWK.LIZ());
                    return;
                }
                return;
            }
            o.LJIJI("transAdsorptionHelper");
            throw null;
        }
    }

    public final void setTransAdsorptionHelper(C93714aVK helper) {
        o.LJIIIZ(helper, "helper");
        this.LJLILLLLZI = helper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93601aTV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        C93776aWK c93776aWK = new C93776aWK();
        c93776aWK.LIZ().setColor(C04330Ez.LIZIZ(context, R.color.ady));
        this.LJLIL = c93776aWK;
    }
}
