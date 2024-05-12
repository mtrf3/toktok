package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: X.VpY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80932VpY extends AbstractC78749UvR {
    public final int LIZ;
    public final Context LIZIZ;
    public final int LIZJ;
    public C245519kJ LIZLLL;

    @Override // X.AbstractC78749UvR, X.VA3
    public final W6U getPostprocessorCacheKey() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new C245519kJ(C16880lQ.LLLZI(null, "IntrinsicBlur;%d", new Object[]{Integer.valueOf(this.LIZJ)}));
        }
        return this.LIZLLL;
    }

    @Override // X.AbstractC78749UvR
    public final void process(Bitmap bitmap) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.LIZ;
        int i2 = this.LIZJ;
        bitmap.getClass();
        C32151Nz.LJI(bitmap.isMutable());
        if (bitmap.getHeight() <= 2048.0f) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (bitmap.getWidth() <= 2048.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        if (i2 > 0 && i2 <= 25) {
            z3 = true;
        } else {
            z3 = false;
        }
        C32151Nz.LJI(z3);
        if (i > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C32151Nz.LJI(z4);
        try {
            QXX.LLFF(i, i2, bitmap);
        } catch (OutOfMemoryError e) {
            W58.LJI("IterativeBoxBlurFilter", C16880lQ.LLLZI(null, "OOM: %d iterations on %dx%d with %d radius", new Object[]{Integer.valueOf(i), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i2)}));
            throw e;
        }
    }

    @Override // X.AbstractC78749UvR
    public final void process(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        Context context = this.LIZIZ;
        int i = this.LIZJ;
        bitmap.getClass();
        bitmap2.getClass();
        context.getClass();
        if (i > 0 && i <= 25) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        try {
            RenderScript create = RenderScript.create(context);
            try {
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap2);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, bitmap);
                create2.setRadius(i);
                create2.setInput(createFromBitmap);
                create2.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(bitmap);
                if (create != null) {
                    create.destroy();
                }
            } catch (Throwable th) {
                if (create != null) {
                    create.destroy();
                    throw th;
                }
            }
        } catch (Throwable th2) {
        }
    }

    @Override // X.AbstractC78749UvR, X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7) {
        Bitmap bitmap2;
        if (!bitmap.getConfig().equals(Bitmap.Config.ARGB_8888)) {
            bitmap2 = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        } else {
            bitmap2 = bitmap;
        }
        C81392Vwy<Bitmap> LJ = abstractC78853Ux7.LJ(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            process(LJ.LJI(), bitmap2);
            return C81392Vwy.LIZJ(LJ);
        } finally {
            C81392Vwy.LJ(LJ);
        }
    }

    public C80932VpY(int i, int i2, Context context) {
        boolean z;
        if (i > 0 && i <= 25) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        C32151Nz.LJI(i2 > 0);
        context.getClass();
        this.LIZ = i2;
        this.LIZJ = i;
        this.LIZIZ = context;
    }
}
