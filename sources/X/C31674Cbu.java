package X;

import Y.AfS0S0211000_5;
import Y.IDhS3S1000000_5;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cbu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31674Cbu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Bitmap bitmap, View view, boolean z, int i, Runnable runnable) {
        int density;
        Rect rect = null;
        if (bitmap != null) {
            byte[] ninePatchChunk = bitmap.getNinePatchChunk();
            if (ninePatchChunk != null) {
                ByteBuffer order = ByteBuffer.wrap(ninePatchChunk).order(ByteOrder.nativeOrder());
                if (order.get() != 0) {
                    order.get();
                    order.get();
                    order.get();
                    order.getInt();
                    order.getInt();
                    rect = new Rect();
                    rect.left = order.getInt();
                    rect.right = order.getInt();
                    rect.top = order.getInt();
                    rect.bottom = order.getInt();
                }
            }
            if (bitmap != null && bitmap.getNinePatchChunk() != null && rect != null) {
                NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(C15380j0.LJIIJ(), bitmap, bitmap.getNinePatchChunk(), rect, null);
                if (i > 0 && bitmap.getDensity() > 0 && bitmap.getHeight() > 0 && (density = (bitmap.getDensity() * i) / bitmap.getHeight()) > 0 && density != 1) {
                    ninePatchDrawable.setTargetDensity(density);
                }
                ninePatchDrawable.setAutoMirrored(z);
                view.setBackground(ninePatchDrawable);
                if (z && CCJ.LIZ(C15380j0.LIZLLL())) {
                    view.setPadding(rect.right, rect.top, rect.left, rect.bottom);
                } else {
                    view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        if (bitmap != null) {
            C0NB.LJ("NinePatchUtil", "downloaded bitmap is null.");
        } else {
            C0NB.LJ("NinePatchUtil", "no ninepatch chunk found in bitmap.");
        }
    }

    public static void LIZIZ(ImageModel imageModel, View view, boolean z, int i, Runnable runnable) {
        String str;
        o.LJIIIZ(view, "view");
        if (C32151Nz.LJJIIJZLJL(imageModel.getUrls())) {
            return;
        }
        List<String> urls = imageModel.getUrls();
        if (urls != null) {
            str = (String) ListProtector.get(urls, 0);
        } else {
            str = null;
        }
        AbstractC73672Svk.LJJIJIL(0).LJJL(T16.LIZ()).LJJIJL(new IDhS3S1000000_5(str, 2)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S0211000_5(view, z, i, runnable, 3), C31675Cbv.LJLIL);
    }
}
