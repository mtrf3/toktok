package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.level.FansClubScoreTextRtlSettings;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.CKz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31165CKz extends C47121t6 {
    public final C47121t6 LJLLLL;
    public float LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;

    public final boolean getStrokeEnable() {
        return this.LJZ;
    }

    public final void LJJIJLIJ(int i) {
        TextPaint paint;
        float f = this.LJLLLLLL;
        this.LJZ = true;
        this.LJLZ = i;
        this.LJLLLLLL = f;
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null && (paint = c47121t6.getPaint()) != null) {
            paint.setStrokeWidth(this.LJLLLLLL);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        C47121t6 c47121t62 = this.LJLLLL;
        if (c47121t62 != null) {
            c47121t62.setTextColor(this.LJLZ);
        }
        C47121t6 c47121t63 = this.LJLLLL;
        if (c47121t63 == null) {
            return;
        }
        c47121t63.setGravity(getGravity());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C47121t6 c47121t6;
        if (this.LJZ && canvas != null && (c47121t6 = this.LJLLLL) != null) {
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(c47121t6, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // X.C41541k6, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setLayoutParams(layoutParams);
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setStrokeEnable(boolean z) {
        this.LJZ = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setVisibility(i);
        }
        super.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31165CKz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z;
        a1.LJFF(context, "context");
        this.LJLLLLLL = C15380j0.LIZ(1.7f);
        FansClubScoreTextRtlSettings fansClubScoreTextRtlSettings = FansClubScoreTextRtlSettings.INSTANCE;
        if (fansClubScoreTextRtlSettings != null) {
            z = fansClubScoreTextRtlSettings.getValue();
        } else {
            z = false;
        }
        C47121t6 c47121t6 = new C47121t6(context, attributeSet, 0);
        this.LJLLLL = c47121t6;
        TextPaint paint = c47121t6.getPaint();
        if (paint != null) {
            paint.setStrokeWidth(this.LJLLLLLL);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        c47121t6.setTextColor(this.LJLZ);
        c47121t6.setGravity(getGravity());
        c47121t6.setIncludeFontPadding(getIncludeFontPadding());
        if (z && C15380j0.LJIIZILJ()) {
            c47121t6.setTextDirection(4);
        }
    }

    @Override // X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            if (!o.LJ(c47121t6.getText(), getText())) {
                c47121t6.setText(getText());
                postInvalidate();
            }
            c47121t6.measure(i, i2);
        }
        super.onMeasure(i, i2);
    }

    @Override // X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.setTextSize(i, f);
        }
        super.setTextSize(i, f);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            c47121t6.layout(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
