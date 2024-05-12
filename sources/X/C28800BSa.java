package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$notifyRedEnvelopeInfos$3$5", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BSa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28800BSa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ RedEnvelopeWidget LJLIL;
    public final /* synthetic */ C68322mC<Bitmap> LJLILLLLZI;
    public final /* synthetic */ C68322mC<Bitmap> LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ C68322mC<C29701Eo> LJLJJL;
    public final /* synthetic */ C34K LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ android.net.Uri LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28800BSa(RedEnvelopeWidget redEnvelopeWidget, C68322mC<Bitmap> c68322mC, C68322mC<Bitmap> c68322mC2, C68322mC<String> c68322mC3, C68322mC<C29701Eo> c68322mC4, C34K c34k, String str, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, android.net.Uri uri, InterfaceC67352kd<? super C28800BSa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = redEnvelopeWidget;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c68322mC2;
        this.LJLJJI = c68322mC3;
        this.LJLJJL = c68322mC4;
        this.LJLJJLL = c34k;
        this.LJLJL = str;
        this.LJLJLJ = redEnvelopeInfoModel4FE;
        this.LJLJLLL = z;
        this.LJLL = uri;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28800BSa(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i;
        int height;
        float width;
        float f;
        int height2;
        C141335gf.LIZJ(obj);
        if (this.LJLIL.context == null) {
            return C76800UCe.LIZ;
        }
        Bitmap bitmap3 = this.LJLILLLLZI.element;
        if (bitmap3 != null) {
            int width2 = bitmap3.getWidth();
            int height3 = bitmap3.getHeight();
            if (bitmap3.getWidth() < bitmap3.getHeight()) {
                height2 = bitmap3.getWidth();
            } else {
                height2 = bitmap3.getHeight();
            }
            float f2 = 192 / height2;
            Matrix matrix = new Matrix();
            matrix.postScale(f2, f2);
            bitmap = Bitmap.createBitmap(bitmap3, (width2 - height2) / 2, (height3 - height2) / 2, height2, height2, matrix, true);
        } else {
            bitmap = null;
        }
        RedEnvelopeWidget redEnvelopeWidget = this.LJLIL;
        Bitmap bitmap4 = this.LJLJI.element;
        String str = this.LJLJJI.element;
        redEnvelopeWidget.getClass();
        if (bitmap4 != null) {
            if (bitmap4.getWidth() < bitmap4.getHeight()) {
                height = bitmap4.getWidth();
            } else {
                height = bitmap4.getHeight();
            }
            Paint LIZIZ = C6D8.LIZIZ(true);
            Bitmap createBitmap = Bitmap.createBitmap(height, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float f3 = height / 2.0f;
            canvas.drawCircle(f3, f3, f3, LIZIZ);
            LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            if (bitmap4.getWidth() < bitmap4.getHeight()) {
                width = 0.0f;
            } else {
                width = (bitmap4.getWidth() - bitmap4.getHeight()) / 2.0f;
            }
            if (bitmap4.getWidth() < bitmap4.getHeight()) {
                f = (bitmap4.getHeight() - bitmap4.getWidth()) / 2.0f;
            } else {
                f = 0.0f;
            }
            canvas.drawBitmap(bitmap4, width, f, LIZIZ);
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(redEnvelopeWidget.context), R.layout.dg_, null, false);
            AppCompatImageView appCompatImageView = (AppCompatImageView) LLLLIILL.findViewById(R.id.hy6);
            C47121t6 c47121t6 = (C47121t6) LLLLIILL.findViewById(R.id.hy7);
            c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
            if (str.length() <= 7) {
                c47121t6.setTextSize(0, 33.0f);
            } else {
                c47121t6.setTextSize(0, 27.0f);
            }
            c47121t6.setText(str);
            LLLLIILL.measure(View.MeasureSpec.makeMeasureSpec(192, 1073741824), View.MeasureSpec.makeMeasureSpec(48, 1073741824));
            LLLLIILL.layout(0, 0, LLLLIILL.getMeasuredWidth(), LLLLIILL.getMeasuredHeight());
            appCompatImageView.setImageBitmap(createBitmap);
            bitmap2 = Bitmap.createBitmap(LLLLIILL.getWidth(), LLLLIILL.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmap2);
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(LLLLIILL, canvas2);
        } else {
            bitmap2 = null;
        }
        RedEnvelopeWidget redEnvelopeWidget2 = this.LJLIL;
        View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(redEnvelopeWidget2.context), R.layout.dg8, null, false);
        ((TextView) LLLLIILL2.findViewById(R.id.hy4)).setText(redEnvelopeWidget2.context.getString(R.string.np9));
        LLLLIILL2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(42, 1073741824));
        LLLLIILL2.layout(0, 0, LLLLIILL2.getMeasuredWidth(), LLLLIILL2.getMeasuredHeight());
        Bitmap createBitmap2 = Bitmap.createBitmap(LLLLIILL2.getWidth(), LLLLIILL2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas3 = new Canvas(createBitmap2);
        C37203Eit.LIZJ.getClass();
        C39214FaE.LIZ(LLLLIILL2, canvas3);
        C68322mC<C29701Eo> c68322mC = this.LJLJJL;
        c68322mC.element.addLottieOnCompositionLoadedListener(new C28801BSb(bitmap, bitmap2, createBitmap2, c68322mC));
        if (this.LJLJJLL.element) {
            i = 0;
        } else {
            i = -1;
        }
        C28792BRs.LIZJ(i, this.LJLJL, this.LJLJLJ.envelopList, Boolean.valueOf(this.LJLJLLL), null, this.LJLIL.LJLJJL);
        RedEnvelopeWidget redEnvelopeWidget3 = this.LJLIL;
        android.net.Uri uri = this.LJLL;
        o.LJIIIIZZ(uri, "uri");
        redEnvelopeWidget3.LJLZ(uri, this.LJLJJL.element);
        this.LJLIL.LJZI();
        this.LJLIL.LJZ().LJI();
        this.LJLIL.LJZ().LIZLLL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
