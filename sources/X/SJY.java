package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SJY implements C0GM {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ C71885SJd LIZIZ;

    public SJY(Context context, C71885SJd c71885SJd) {
        this.LIZ = context;
        this.LIZIZ = c71885SJd;
    }

    @Override // X.C0GM
    public final void LIZ(C0GY c0gy) {
        View innerTextView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZ), R.layout.ard, null, false);
        C71885SJd c71885SJd = this.LIZIZ;
        o.LJIIIIZZ(innerTextView, "innerTextView");
        String str = this.LIZIZ.LJLIL.LJ.LJLIL;
        c71885SJd.getClass();
        c71885SJd.updateBitmap("image_12", C71885SJd.LIZ(innerTextView, str, 128, 36, 30));
        C71885SJd c71885SJd2 = this.LIZIZ;
        c71885SJd2.updateBitmap("image_11", C71885SJd.LIZ(innerTextView, c71885SJd2.LJLIL.LJ.LJLILLLLZI, 128, 30, 24));
        C71885SJd c71885SJd3 = this.LIZIZ;
        c71885SJd3.updateBitmap("image_8", C71885SJd.LIZ(innerTextView, c71885SJd3.LJLIL.LJ.LJLIL, 104, 34, 26));
        C71885SJd c71885SJd4 = this.LIZIZ;
        c71885SJd4.updateBitmap("image_9", C71885SJd.LIZ(innerTextView, c71885SJd4.LJLIL.LJ.LJLILLLLZI, 104, 28, 22));
        C71885SJd c71885SJd5 = this.LIZIZ;
        String string = this.LIZ.getResources().getString(R.string.f4e);
        o.LJIIIIZZ(string, "context.resources.getStr…ell_tc_scope_first_order)");
        c71885SJd5.getClass();
        c71885SJd5.updateBitmap("image_13", C71885SJd.LIZ(innerTextView, string, 128, 28, 22));
        C71885SJd c71885SJd6 = this.LIZIZ;
        String LIZ = C29822Bn8.LIZ(this.LIZ, R.string.f4e, "context.resources.getStr…ell_tc_scope_first_order)");
        Context context = c71885SJd6.getContext();
        o.LJIIIIZZ(context, "context");
        float f = context.getResources().getDisplayMetrics().density;
        AppCompatTextView appCompatTextView = (AppCompatTextView) innerTextView.findViewById(R.id.enn);
        appCompatTextView.setText(LIZ);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setTypeface(Typeface.defaultFromStyle(1));
        Paint paint = new Paint(appCompatTextView.getPaint());
        paint.setTextSize(20.0f);
        int measureText = (int) paint.measureText(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("editTextBitmapWithMarquee newWidth = ");
        LIZ2.append(measureText);
        LIZ2.append(", width = ");
        LIZ2.append(110);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ2));
        if (measureText > 110) {
            appCompatTextView.setGravity(8388627);
            C023107f.LIZJ(appCompatTextView, 0);
            appCompatTextView.setTextSize(0, 20.0f);
            c71885SJd6.addValueCallback(new C263711t("enrich first order", "text first order 3.png"), (C263711t) C0GO.LJFF, (C06800Om<C263711t>) new SJZ((((measureText - 110) / 2.0f) + 6) * f));
        } else {
            C023107f.LIZJ(appCompatTextView, 0);
            appCompatTextView.setTypeface(Typeface.defaultFromStyle(1));
            appCompatTextView.setTextSize(0, 20.0f);
            c71885SJd6.addValueCallback(new C263711t("enrich first order", "text first order 3.png"), (C263711t) C0GO.LJFF, (C06800Om<C263711t>) new C71882SJa());
            measureText = 110;
        }
        innerTextView.measure(View.MeasureSpec.makeMeasureSpec(measureText, 1073741824), View.MeasureSpec.makeMeasureSpec(26, 1073741824));
        innerTextView.layout(0, 0, innerTextView.getMeasuredWidth(), innerTextView.getMeasuredHeight());
        appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(measureText, 1073741824), View.MeasureSpec.makeMeasureSpec(26, 1073741824));
        appCompatTextView.layout(0, 0, appCompatTextView.getMeasuredWidth(), appCompatTextView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(innerTextView.getWidth(), innerTextView.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        C37203Eit.LIZJ.getClass();
        C39214FaE.LIZ(innerTextView, canvas);
        c71885SJd6.updateBitmap("image_1", createBitmap);
    }
}
