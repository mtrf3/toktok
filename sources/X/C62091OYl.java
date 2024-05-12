package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import kotlin.jvm.internal.AqS32S1300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OYl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62091OYl implements InterfaceC62093OYn {
    public final /* synthetic */ C62089OYj LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZJ;

    @Override // X.InterfaceC62093OYn
    public final void LJIL() {
    }

    @Override // X.InterfaceC62093OYn
    public final void LIZ() {
        String str;
        C62089OYj view = this.LIZ;
        Context context = this.LIZIZ;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(System.currentTimeMillis());
        LIZ.append(C38352F3k.LIZJ(X1D.LIZIZ(LIZ2)));
        LIZ.append(".png");
        C62090OYk.LIZLLL = X1D.LIZIZ(LIZ);
        C62090OYk.LIZJ = C16880lQ.LLIIIL(context).getAbsolutePath();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C62090OYk.LIZJ);
        String str2 = C62090OYk.LIZJ;
        if (str2 != null && C40689Fy1.LLIFFJFJJ(str2) == '/') {
            str = "live_share";
        } else {
            str = "/live_share";
        }
        LIZ3.append(str);
        C62090OYk.LIZJ = X1D.LIZIZ(LIZ3);
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            o.LJI(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(view, canvas);
            if (createBitmap == null || !BitmapUtils.saveBitmapToSD(createBitmap, C62090OYk.LIZJ, C62090OYk.LIZLLL)) {
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(C62090OYk.LIZJ);
            LIZ4.append('/');
            LIZ4.append(C62090OYk.LIZLLL);
            String LIZIZ = X1D.LIZIZ(LIZ4);
            if (LIZIZ == null) {
                return;
            }
            this.LIZJ.invoke(LIZIZ);
        }
    }

    public C62091OYl(C62089OYj c62089OYj, Context context, AqS32S1300000_10 aqS32S1300000_10) {
        this.LIZ = c62089OYj;
        this.LIZIZ = context;
        this.LIZJ = aqS32S1300000_10;
    }
}
