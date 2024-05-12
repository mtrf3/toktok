package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.resize.MvBitMapUtilsExt$makeEffectIcon$2", f = "MvBitMapUtilsExt.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4ma, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119524ma extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ Bitmap LJLIL;
    public final /* synthetic */ List<Integer> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ String LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119524ma(int i, int i2, int i3, int i4, int i5, Bitmap bitmap, String str, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = bitmap;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
        this.LJLJJLL = i4;
        this.LJLJL = i5;
        this.LJLJLJ = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C119524ma(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLIL, this.LJLJLJ, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Bitmap bitmap = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("make effect icon, bitmap size = ");
        LIZ.append(bitmap.getWidth());
        LIZ.append('x');
        LIZ.append(bitmap.getHeight());
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
        List<Integer> list = this.LJLILLLLZI;
        if (list != null && list.size() == 2) {
            int intValue = (int) ((((Number) ListProtector.get(this.LJLILLLLZI, 0)).intValue() * bitmap.getWidth()) / 100.0f);
            int intValue2 = (int) ((((Number) ListProtector.get(this.LJLILLLLZI, 1)).intValue() * bitmap.getHeight()) / 100.0f);
            bitmap = Bitmap.createBitmap(bitmap, intValue / 2, intValue2 / 2, bitmap.getWidth() - intValue, bitmap.getHeight() - intValue2);
            o.LJIIIIZZ(bitmap, "createBitmap(result, wid…lt.height - heightOffset)");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cropped size, bitmap size = ");
            LIZ2.append(bitmap.getWidth());
            LIZ2.append('x');
            LIZ2.append(bitmap.getHeight());
            H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ2));
        }
        Bitmap LJI = C42307Gj1.LJI(bitmap, this.LJLJI, this.LJLJJI, 0, 1);
        o.LJIIIIZZ(LJI, "zoomImg(\n            res…ls.ASPECT_FILL,\n        )");
        int i = this.LJLJJL;
        Bitmap createBitmap = Bitmap.createBitmap(LJI.getWidth(), LJI.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, LJI.getWidth(), LJI.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawColor(0);
        float f = i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(LJI, rect, rect, paint);
        C42307Gj1.LIZLLL(LJI);
        o.LJIIIIZZ(createBitmap, "roundCorner(result, radius)");
        int i2 = this.LJLJJLL;
        int i3 = this.LJLJL;
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth() + i2, createBitmap.getHeight() + i3, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.drawColor(0);
        canvas2.drawBitmap(createBitmap, i2 / 2.0f, i3 / 2.0f, (Paint) null);
        C42307Gj1.LIZLLL(createBitmap);
        o.LJIIIIZZ(createBitmap2, "addPadding(result, paddingX, paddingY)");
        return Boolean.valueOf(C42307Gj1.LJ(createBitmap2, new File(this.LJLJLJ), 100, Bitmap.CompressFormat.PNG));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
