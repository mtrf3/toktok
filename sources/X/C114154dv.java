package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.4dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114154dv extends LinearLayout {
    public final float LJLIL;
    public final SY9 LJLILLLLZI;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        float f2 = 2;
        canvas.rotate(350.0f, C74275TDb.LIZ(290.0f) / f2, C74275TDb.LIZ(115.0f) / f2);
        canvas.translate(-C74275TDb.LIZ(21.0f), -C74275TDb.LIZ(30.0f));
        int i = 0;
        do {
            float f3 = 0.0f;
            if (i % 2 == 0) {
                f = C74275TDb.LIZ(52.0f);
            } else {
                f = 0.0f;
            }
            if (i != 0) {
                f3 = (C74275TDb.LIZ(5.0f) + this.LJLIL) * i;
            }
            int i2 = 0;
            do {
                float f4 = this.LJLIL;
                this.LJLILLLLZI.setBounds((int) f, (int) f3, (int) (f + f4), (int) (f4 + f3));
                this.LJLILLLLZI.draw(canvas);
                f += C74275TDb.LIZ(85.0f) + this.LJLIL;
                i2++;
            } while (i2 < 3);
            i++;
        } while (i < 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C114154dv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        float LIZ = C74275TDb.LIZ(19.0f);
        this.LJLIL = LIZ;
        C2068389v c2068389v = new C2068389v();
        int i = (int) LIZ;
        c2068389v.LIZJ = i;
        c2068389v.LIZIZ = i;
        c2068389v.LIZ = R.raw.icon_color_tiktok_logo_light;
        this.LJLILLLLZI = c2068389v.LIZ(context);
    }
}
