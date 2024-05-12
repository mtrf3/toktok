package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.DJt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33681DJt extends View {
    public EnumC35439DvX LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public int LJLJI;

    private final Paint getPaint() {
        return (Paint) this.LJLILLLLZI.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        getPaint().setStrokeWidth(getHeight());
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.cf, context);
        if (LJI != null) {
            getPaint().setColor(LJI.intValue());
        }
        float height = getHeight() / 2;
        canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), height, height, getPaint());
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI2 = C79045V0n.LJI(this.LJLIL.getAttrRes(), context2);
        if (LJI2 != null) {
            getPaint().setColor(LJI2.intValue());
        }
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        if (C26338AVi.LIZJ(context3)) {
            canvas.drawRoundRect(getWidth() - ((this.LJLJI / 300) * getWidth()), 0.0f, getWidth(), getHeight(), height, height, getPaint());
        } else {
            canvas.drawRoundRect(0.0f, 0.0f, (this.LJLJI / 300) * getWidth(), getHeight(), height, height, getPaint());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33681DJt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = EnumC35439DvX.INIT;
        this.LJLILLLLZI = C221108m2.LIZIZ(C33677DJp.LJLIL);
        this.LJLJI = 4;
    }
}
