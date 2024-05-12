package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6cP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164176cP {
    public final C29S LIZ;
    public final FrameLayout LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    public final void LIZ() {
        FrameLayout frameLayout = this.LIZIZ;
        LinearLayout linearLayout = new LinearLayout(this.LIZ);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TuxIconView tuxIconView = new TuxIconView(this.LIZ, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_tick_circle_fill);
        tuxIconView.setTintColorRes(R.attr.e8);
        int i = this.LJI;
        tuxIconView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
        tuxTextView.setTuxFont(33);
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, this.LIZ));
        tuxTextView.setText(this.LIZ.getString(R.string.iva));
        tuxTextView.setGravity(1);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view = new View(this.LIZ);
        view.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.dz, this.LIZ));
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, this.LJIIIZ));
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = this.LJII;
        layoutParams2.bottomMargin = this.LJIIIIZZ;
        tuxIconView.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams.setMarginStart(this.LJFF);
        marginLayoutParams.setMarginEnd(this.LJFF);
        tuxTextView.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
        int i2 = this.LJFF;
        layoutParams5.topMargin = this.LJIIJ;
        layoutParams5.setMarginEnd(i2);
        layoutParams5.setMarginStart(i2);
        view.setLayoutParams(layoutParams5);
        linearLayout.addView(tuxIconView);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(view);
        frameLayout.addView(linearLayout);
    }

    public final void LIZIZ(String str) {
        FrameLayout frameLayout = this.LIZIZ;
        LinearLayout linearLayout = new LinearLayout(this.LIZ);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        final C29S c29s = this.LIZ;
        SmartImageView smartImageView = new SmartImageView(c29s) { // from class: X.6cF
            public final float LJLJLJ;
            public final Paint LJLJLLL;
            public final Path LJLL;

            @Override // X.VA9, android.widget.ImageView, android.view.View
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                C54339LUh.LIZ(this);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c29s);
                o.LJIIIZ(c29s, "context");
                new LinkedHashMap();
                float LIZ = C74275TDb.LIZ(0.5f);
                this.LJLJLJ = C74275TDb.LIZ(2.0f);
                int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dz, c29s);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(LJIIIIZZ);
                paint.setStrokeWidth(LIZ);
                paint.setStyle(Paint.Style.STROKE);
                this.LJLJLLL = paint;
                this.LJLL = new Path();
            }

            @Override // X.VA9, android.widget.ImageView, android.view.View
            public final void onDraw(Canvas canvas) {
                Path path = this.LJLL;
                float width = getWidth();
                float height = getHeight();
                float f = this.LJLJLJ;
                path.addRoundRect(0.0f, 0.0f, width, height, f, f, Path.Direction.CW);
                if (canvas != null) {
                    canvas.save();
                    canvas.clipPath(this.LJLL);
                }
                super.onDraw(canvas);
                if (canvas != null) {
                    canvas.restore();
                    canvas.drawPath(this.LJLL, this.LJLJLLL);
                }
            }
        };
        smartImageView.setLayoutParams(new LinearLayout.LayoutParams(this.LIZJ, this.LIZLLL));
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
        LJIIIIZZ.LJIIJJI = R.drawable.aja;
        LJIIIIZZ.LIZJ = this.LIZ;
        LJIIIIZZ.LJJIIJ = smartImageView;
        LJIIIIZZ.LIZIZ("dislike reason");
        LJIIIIZZ.LIZLLL(new AbstractC72439Sbr() { // from class: X.7FZ
            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                o.LJIIIZ(uri, "uri");
            }

            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
                o.LJIIIZ(uri, "uri");
            }
        });
        TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
        tuxTextView.setTuxFont(23);
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, this.LIZ));
        tuxTextView.setText(this.LIZ.getString(R.string.iv4));
        tuxTextView.setGravity(1);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 1;
        smartImageView.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = this.LJ;
        layoutParams4.setMarginStart(this.LJFF);
        layoutParams4.setMarginEnd(this.LJFF);
        tuxTextView.setLayoutParams(layoutParams4);
        linearLayout.addView(smartImageView);
        linearLayout.addView(tuxTextView);
        frameLayout.addView(linearLayout);
    }

    public C164176cP(C29S activity, FrameLayout frameLayout) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = frameLayout;
        this.LIZJ = (int) C74275TDb.LIZ(60.0f);
        this.LIZLLL = (int) C74275TDb.LIZ(80.0f);
        this.LJ = (int) C74275TDb.LIZ(24.0f);
        this.LJFF = (int) C74275TDb.LIZ(16.0f);
        this.LJI = (int) C74275TDb.LIZ(40.0f);
        this.LJII = (int) C74275TDb.LIZ(36.0f);
        this.LJIIIIZZ = (int) C74275TDb.LIZ(8.0f);
        this.LJIIIZ = (int) C74275TDb.LIZ(0.5f);
        this.LJIIJ = (int) C74275TDb.LIZ(28.5f);
    }
}
