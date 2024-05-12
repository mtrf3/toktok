package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.Mjd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57633Mjd implements InterfaceC78660Uu0 {
    public final String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ float LJLJJI;

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadBitmap: onCanceled ");
        LIZ.append(this.LJLIL);
        C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadBitmap: onCompleted, ");
        LIZ.append(this.LJLIL);
        LIZ.append(", bitmap=");
        LIZ.append(bitmap);
        C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ));
        if (bitmap == null || bitmap.getWidth() < 1 || bitmap.getHeight() < 1) {
            C57686MkU.LIZJ.put(this.LJLILLLLZI, C57686MkU.LIZIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("bitmap == ");
            LIZ2.append(bitmap);
            LIZ2.append(" || bitmap.width = ");
            Integer num2 = null;
            if (bitmap != null) {
                num = Integer.valueOf(bitmap.getWidth());
            } else {
                num = null;
            }
            LIZ2.append(num);
            LIZ2.append(" || bitmap.height = ");
            if (bitmap != null) {
                num2 = Integer.valueOf(bitmap.getHeight());
            }
            LIZ2.append(num2);
            C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ2));
            return;
        }
        int width = bitmap.getWidth();
        int height = (int) (bitmap.getHeight() * this.LJLJJI);
        if (height < 1) {
            height = 1;
        }
        Rect rect = new Rect(0, 0, width, height);
        C57686MkU c57686MkU = C57686MkU.LIZ;
        Object obj = this.LJLJI;
        c57686MkU.getClass();
        int LIZIZ = C57686MkU.LIZIZ(bitmap, rect, obj);
        float[] fArr = new float[3];
        Color.colorToHSV(LIZIZ, fArr);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("tag = ");
        LIZ3.append(this.LJLJI);
        LIZ3.append(" topHsv[H] = ");
        LIZ3.append(fArr[0]);
        LIZ3.append(",topHsv[S] = ");
        LIZ3.append(fArr[1]);
        LIZ3.append(", topHsv[B] = ");
        LIZ3.append(fArr[2]);
        C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ3));
        int height2 = bitmap.getHeight();
        int height3 = (int) (bitmap.getHeight() * this.LJLJJI);
        if (height3 < 1) {
            height3 = 1;
        }
        float[] fArr2 = new float[3];
        Color.colorToHSV(C57686MkU.LIZIZ(bitmap, new Rect(0, height2 - height3, bitmap.getWidth(), bitmap.getHeight()), this.LJLJI), fArr2);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("tag = ");
        LIZ4.append(this.LJLJI);
        LIZ4.append(" bottomHsv[H] = ");
        LIZ4.append(fArr2[0]);
        LIZ4.append(",bottomHsv[S] = ");
        LIZ4.append(fArr2[1]);
        LIZ4.append(", bottomHsv[B] = ");
        LIZ4.append(fArr2[2]);
        C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ4));
        float f = fArr[1];
        float f2 = fArr2[1];
        double d = f;
        if (d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d < 0.15d) {
            double d2 = f2;
            if (d2 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d2 < 0.15d) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("fail tops = [");
                LIZ5.append(f);
                LIZ5.append("], bottoms = [");
                LIZ5.append(f2);
                LIZ5.append(']');
                C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ5));
                C57686MkU.LIZJ.put(this.LJLILLLLZI, C57686MkU.LIZIZ);
                return;
            }
        }
        C57686MkU.LIZ(fArr);
        C57686MkU.LIZ(fArr2);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("tag = ");
        LIZ6.append(this.LJLJI);
        LIZ6.append(" adjust topHsv[H] = ");
        LIZ6.append(fArr[0]);
        LIZ6.append(",adjust topHsv[S] = ");
        LIZ6.append(fArr[1]);
        LIZ6.append(", adjust topHsv[B] = ");
        LIZ6.append(fArr[2]);
        C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ6));
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("tag = ");
        LIZ7.append(this.LJLJI);
        LIZ7.append(" adjust bottomHsv[H] = ");
        LIZ7.append(fArr2[0]);
        LIZ7.append(",adjust bottomHsv[S] = ");
        LIZ7.append(fArr2[1]);
        LIZ7.append(", adjust bottomHsv[B] = ");
        LIZ7.append(fArr2[2]);
        C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ7));
        int HSVToColor = Color.HSVToColor(fArr);
        int HSVToColor2 = Color.HSVToColor(fArr2);
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("adjTopColor = ");
        LIZ8.append(V1M.LJJJLIIL(HSVToColor));
        LIZ8.append(",adjBottomColor = ");
        LIZ8.append(V1M.LJJJLIIL(HSVToColor2));
        LIZ8.append(',');
        C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ8));
        C57686MkU.LIZJ.put(this.LJLILLLLZI, new int[]{HSVToColor, HSVToColor2});
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadBitmap: onFailed ");
        LIZ.append(this.LJLIL);
        LIZ.append(" and reason = ");
        if (th != null) {
            str = th.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ));
    }

    public C57633Mjd(String str, Object obj, float f) {
        this.LJLILLLLZI = str;
        this.LJLJI = obj;
        this.LJLJJI = f;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("url=");
        LIZ.append(str);
        LIZ.append(", tag=");
        LIZ.append(obj);
        this.LJLIL = X1D.LIZIZ(LIZ);
    }
}
