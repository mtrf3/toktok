package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.RlA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70468RlA extends FrameLayout implements InterfaceC70267Rhv<C70257Rhl> {
    public final SmartImageView LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final View LJLJI;
    public C70257Rhl LJLJJI;
    public final S3L LJLJJL;
    public final Paint LJLJJLL;
    public final Paint LJLJL;
    public final Path LJLJLJ;
    public final Path LJLJLLL;
    public final Path LJLL;
    public Bitmap LJLLI;

    @Override // X.InterfaceC70267Rhv
    public final void LJJIII() {
    }

    public final void LIZ() {
        if (this.LJLLI == null) {
            this.LJLLI = Bitmap.createBitmap(C7MY.LIZIZ(32), C7MY.LIZIZ(32), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap = this.LJLLI;
        if (bitmap == null) {
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawPath(this.LJLJLLL, this.LJLJJLL);
        canvas.drawPath(this.LJLL, this.LJLJJLL);
        canvas.drawPath(this.LJLJLJ, this.LJLJL);
        setForeground(new BitmapDrawable(bitmap));
    }

    @Override // X.InterfaceC70267Rhv
    public final void LJFF() {
        C70257Rhl m36getUiData = m36getUiData();
        if (m36getUiData == null) {
            return;
        }
        setUiData(C70257Rhl.LIZJ(m36getUiData, false));
        this.LJLJI.setVisibility(8);
        if (m36getUiData.LJFF) {
            setForeground(null);
        } else {
            LIZ();
        }
    }

    @Override // X.InterfaceC70267Rhv
    public final void LJJIFFI() {
        C70257Rhl m36getUiData = m36getUiData();
        if (m36getUiData == null) {
            return;
        }
        setUiData(C70257Rhl.LIZJ(m36getUiData, true));
        this.LJLJI.setVisibility(0);
        if (m36getUiData.LJFF) {
            setForeground(null);
        } else {
            LIZ();
        }
    }

    /* renamed from: getUiData, reason: merged with bridge method [inline-methods] */
    public C70257Rhl m36getUiData() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70468RlA(Context context) {
        super(context, null);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLJJLL = paint;
        Paint paint2 = new Paint();
        this.LJLJL = paint2;
        Path path = new Path();
        this.LJLJLJ = path;
        Path path2 = new Path();
        this.LJLJLLL = path2;
        Path path3 = new Path();
        this.LJLL = path3;
        SmartImageView smartImageView = new SmartImageView(getContext());
        this.LJLIL = smartImageView;
        smartImageView.setLayoutParams(new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(32))));
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        addView(smartImageView);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "getContext()");
        TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
        this.LJLILLLLZI = tuxIconView;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_image_slash;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        tuxIconView.setTuxIcon(c2068389v);
        tuxIconView.setLayoutParams(new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(20))));
        ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        tuxIconView.setVisibility(8);
        addView(tuxIconView);
        View view = new View(getContext());
        this.LJLJI = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(38)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(38))));
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = -O6R.LJJIIZ(C32151Nz.LJIIZILJ(3));
        layoutParams4.setMarginStart(-O6R.LJJIIZ(C32151Nz.LJIIZILJ(3)));
        view.setBackgroundResource(R.drawable.ac2);
        view.setVisibility(8);
        addView(view);
        setLayoutParams(new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(32))));
        S3I s3i = new S3I();
        s3i.LIZLLL = KL2.LIZJ(context, 4.0f);
        s3i.LIZJ = AnonymousClass636.LJIIIIZZ(R.attr.dz, context);
        s3i.LIZIZ = AnonymousClass391.LIZ(0.5d);
        this.LJLJJL = new S3L(s3i);
        setClipChildren(false);
        float LJIIZILJ = C32151Nz.LJIIZILJ(Float.valueOf(4.0f));
        float LJIIZILJ2 = C32151Nz.LJIIZILJ(32);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        Float valueOf = Float.valueOf(1.0f);
        paint2.setStrokeWidth(C32151Nz.LJIIZILJ(valueOf));
        float f = LJIIZILJ / 4.0f;
        float f2 = LJIIZILJ / 2.0f;
        path.moveTo(f, LJIIZILJ2 - f2);
        float f3 = LJIIZILJ2 - (LJIIZILJ / 2);
        path.lineTo(f3, f);
        float f4 = LJIIZILJ2 - f;
        path.lineTo(f4, f2);
        path.lineTo(f2, f4);
        path.close();
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        paint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.dz, context3));
        paint.setStrokeWidth(C32151Nz.LJIIZILJ(valueOf));
        path2.moveTo(f, f3);
        path2.lineTo(f3, f);
        path3.moveTo(f2, f4);
        path3.lineTo(f4, f2);
    }

    @Override // X.InterfaceC70267Rhv
    public final void LJJ(InterfaceC70269Rhx interfaceC70269Rhx) {
        C62562cu c62562cu;
        if (!(interfaceC70269Rhx instanceof C70257Rhl)) {
            return;
        }
        C70257Rhl c70257Rhl = (C70257Rhl) interfaceC70269Rhx;
        setUiData(c70257Rhl);
        C27583As7 c27583As7 = new C27583As7();
        c27583As7.LIZJ = "sku_detail";
        c27583As7.LIZ(c70257Rhl.LIZLLL);
        Image image = c70257Rhl.LIZIZ;
        if (image != null) {
            c62562cu = image.toThumbFirstImageUrlModel();
        } else {
            c62562cu = null;
        }
        c27583As7.LIZIZ(c62562cu);
        W5F LJ = C70759Rpr.LJ(c70257Rhl.LIZIZ);
        LJ.LJIJJLI = this.LJLJJL;
        LJ.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LJ.LIZIZ("SkcItemView");
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJIIJ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(4.0f)));
        c110614Vt.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(4.0f)));
        c110614Vt.LJIIJJI = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(4.0f)));
        c110614Vt.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(4.0f)));
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cj);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        LJ.LJIILIIL = c110614Vt.LIZ(context);
        LJ.LJJIIJ = this.LJLIL;
        L9G.LIZIZ(LJ, new C70395Rjz(c27583As7, this));
        invalidate();
    }

    public void setUiData(C70257Rhl c70257Rhl) {
        this.LJLJJI = c70257Rhl;
    }
}
