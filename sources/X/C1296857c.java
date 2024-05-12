package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.57c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1296857c extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final C53I LJLILLLLZI;
    public final TextView LJLJI;
    public final ImageView LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296857c(ActivityC45651qj context, View view) {
        super(view);
        o.LJIIIZ(context, "context");
        this.LJLIL = view;
        this.LJLILLLLZI = C1291054w.LIZ().LJLIL;
        View findViewById = view.findViewById(R.id.m7f);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_function_item)");
        this.LJLJI = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.f3i);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_function_item)");
        this.LJLJJI = (ImageView) findViewById2;
    }

    public final void L(AnonymousClass523 anonymousClass523, boolean z) {
        SpannableString spannableString = new SpannableString("&");
        Object obj = anonymousClass523.LJIIIIZZ.get("small_drawable");
        ImageSpan imageSpan = null;
        if (obj == null) {
            obj = null;
        }
        final Drawable drawable = (Drawable) obj;
        final int i = 0;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (z) {
            if (drawable != null) {
                final int i2 = C1293855y.LJ;
                imageSpan = new ImageSpan(drawable, i2) { // from class: X.6B4
                    public final int LJLIL;

                    {
                        this.LJLIL = i2;
                    }

                    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
                        o.LJIIIZ(paint, "paint");
                        return getDrawable().getBounds().right + this.LJLIL;
                    }

                    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f, int i5, int i6, int i7, Paint paint) {
                        o.LJIIIZ(canvas, "canvas");
                        o.LJIIIZ(paint, "paint");
                        Drawable drawable2 = getDrawable();
                        canvas.save();
                        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                        float f2 = i6;
                        canvas.translate(f + this.LJLIL, ((((fontMetrics.ascent + f2) + f2) + fontMetrics.descent) / 2) - ((getDrawable().getBounds().bottom + getDrawable().getBounds().top) / 2));
                        drawable2.draw(canvas);
                        canvas.restore();
                    }
                };
            }
        } else if (drawable != null) {
            imageSpan = new ImageSpan(drawable, i) { // from class: X.6B4
                public final int LJLIL;

                {
                    this.LJLIL = i;
                }

                @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
                    o.LJIIIZ(paint, "paint");
                    return getDrawable().getBounds().right + this.LJLIL;
                }

                @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f, int i5, int i6, int i7, Paint paint) {
                    o.LJIIIZ(canvas, "canvas");
                    o.LJIIIZ(paint, "paint");
                    Drawable drawable2 = getDrawable();
                    canvas.save();
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    float f2 = i6;
                    canvas.translate(f + this.LJLIL, ((((fontMetrics.ascent + f2) + f2) + fontMetrics.descent) / 2) - ((getDrawable().getBounds().bottom + getDrawable().getBounds().top) / 2));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
            };
        }
        spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 17);
        this.LJLJI.append(spannableString);
    }
}
