package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import fjb.a;
import kotlin.jvm.internal.AqS30S1000000_7;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.AsyncPhotoSaver$saveBitmap$1", f = "AsyncPhotoSaver.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.HBj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43655HBj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Bitmap LJLJI;
    public final /* synthetic */ CreativeInfo LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ NowsShootModel LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43655HBj(boolean z, Bitmap bitmap, CreativeInfo creativeInfo, boolean z2, boolean z3, NowsShootModel nowsShootModel, InterfaceC67352kd<? super C43655HBj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = bitmap;
        this.LJLJJI = creativeInfo;
        this.LJLJJL = z2;
        this.LJLJJLL = z3;
        this.LJLJL = nowsShootModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C43655HBj c43655HBj = new C43655HBj(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c43655HBj.LJLIL = obj;
        return c43655HBj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        if (this.LJLILLLLZI) {
            Bitmap srcBitmap = this.LJLJI;
            o.LJIIIZ(srcBitmap, "srcBitmap");
            float width = srcBitmap.getWidth() / 71;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-16777216);
            paint.setStrokeWidth(width);
            bitmap = Bitmap.createBitmap(srcBitmap.getWidth(), srcBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            float width2 = srcBitmap.getWidth() * 0.15f;
            float f = width / 2;
            RectF rectF = new RectF(f, f, bitmap.getWidth() - f, bitmap.getHeight() - f);
            canvas.drawRoundRect(rectF, width2, width2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            int i = (int) width;
            canvas.drawBitmap(srcBitmap, (Rect) null, new Rect(i, i, bitmap.getWidth() - i, bitmap.getHeight() - i), paint);
            paint.setXfermode(null);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawRoundRect(rectF, width2, width2, paint);
        } else {
            bitmap = this.LJLJI;
        }
        String LIZJ = C43653HBh.LIZJ(this.LJLJJI, this.LJLJJL);
        C84661XKn LIZIZ = XKX.LIZIZ(interfaceC70422pa, null, null, new C43654HBi(bitmap, LIZJ, this.LJLILLLLZI, this.LJLJJL, this.LJLJL, this.LJLJJI, null), 3);
        if (this.LJLJJLL) {
            String LIZIZ2 = C65282hI.LIZIZ(LIZJ);
            C84661XKn LIZIZ3 = XKX.LIZIZ(interfaceC70422pa, null, null, new C36485ETp(bitmap, null), 3);
            LIZIZ3.LJJIII(new AqS30S1000000_7(LIZIZ2, 1));
            C65282hI.LIZ(LIZIZ2, LIZIZ3);
        }
        C65282hI.LIZ(LIZJ, LIZIZ);
        LIZIZ.LJJIII(new AqS30S1000000_7(LIZJ, 2));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
