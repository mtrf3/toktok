package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: X.VpT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80927VpT {
    public static final void LIZ(int i, Context context, Bitmap bitmap, Bitmap bitmap2) {
        float f;
        RenderScript create = RenderScript.create(context);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        if (i > 0) {
            while (true) {
                if (i - 10 > 0) {
                    f = 10.0f;
                } else {
                    f = i;
                }
                create2.setRadius(f);
                create2.setInput(createFromBitmap);
                create2.forEach(createTyped);
                i -= 10;
                if (i <= 0) {
                    break;
                } else {
                    createFromBitmap.copyFrom(createTyped);
                }
            }
            createTyped.copyTo(bitmap2);
        }
        createBitmap.recycle();
    }
}
