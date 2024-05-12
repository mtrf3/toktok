package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.SJd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71885SJd extends C29701Eo {
    public final C62847OlX<C71266Ry2> LJLIL;
    public boolean LJLILLLLZI;

    public final synchronized void play() {
        if (this.LJLILLLLZI) {
            super.playAnimation();
        }
    }

    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C29701Eo
    public final void playAnimation() {
        LiveOuterService.LJJJLL().LJJIIZ();
        C71891SJj.LIZ.loadGeckoLottie(this, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_outside_demand_1"), "new_user_shorttouch_lottie.zip", false, new C71886SJe(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71885SJd(Context context, C62847OlX c62847OlX) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLIL = c62847OlX;
        setLayoutParams(new ViewGroup.LayoutParams(C17N.LJIILL(c62847OlX.LIZIZ), C17N.LJIILL(c62847OlX.LIZJ)));
        addLottieOnCompositionLoadedListener(new SJY(context, this));
    }

    public static Bitmap LIZ(View view, String str, int i, int i2, int i3) {
        TextView textView = (TextView) view.findViewById(R.id.enn);
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        C023107f.LIZIZ(textView, 20, i3, 1, 0);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        textView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        C37203Eit.LIZJ.getClass();
        C39214FaE.LIZ(view, canvas);
        return createBitmap;
    }
}
