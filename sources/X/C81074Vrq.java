package X;

import Y.IDAListenerS44S0200000_14;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Vrq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81074Vrq {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(int i, ArrayList arrayList) {
        PoiGalleryAnchorData poiGalleryAnchorData;
        if (arrayList == null || i < 0 || i >= arrayList.size() || 1 == 0 || (poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i)) == null || poiGalleryAnchorData.x < 0 || poiGalleryAnchorData.y < 0 || poiGalleryAnchorData.w <= 0 || poiGalleryAnchorData.h <= 0) {
            return false;
        }
        return true;
    }

    public static void LIZ(Context context, View view, ArrayList arrayList, C81078Vru c81078Vru, int i) {
        float f;
        o.LJIIIZ(context, "context");
        PoiGalleryAnchorData poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i);
        if (poiGalleryAnchorData != null && poiGalleryAnchorData.x >= 0 && poiGalleryAnchorData.y >= 0 && poiGalleryAnchorData.w > 0 && poiGalleryAnchorData.h > 0) {
            Matrix LIZLLL = C81081Vrx.LIZLLL();
            RectF LJI = C81081Vrx.LJI();
            c81078Vru.LIZJ(LJI);
            LIZLLL.set(c81078Vru.LJLLI);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("currentAnchor x: ");
            LIZ2.append(poiGalleryAnchorData.x);
            LIZ2.append(", y: ");
            LIZ2.append(poiGalleryAnchorData.y);
            LIZ2.append(", w: ");
            LIZ2.append(poiGalleryAnchorData.w);
            LIZ2.append(", h: ");
            LIZ2.append(poiGalleryAnchorData.h);
            LIZ2.append("; \n bound: x: ");
            LIZ2.append(LJI.left);
            LIZ2.append(", y: ");
            LIZ2.append(LJI.top);
            LIZ2.append(", w: ");
            LIZ2.append(LJI.width());
            LIZ2.append(", h: ");
            LIZ2.append(LJI.height());
            String msg = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg, "msg");
            float f2 = 2;
            LIZLLL.postScale(poiGalleryAnchorData.w / LJI.width(), poiGalleryAnchorData.h / LJI.height(), (LJI.width() / f2) + LJI.left, (LJI.height() / f2) + LJI.top);
            LIZLLL.postTranslate(((poiGalleryAnchorData.w / 2.0f) + poiGalleryAnchorData.x) - ((LJI.width() / 2.0f) + LJI.left), ((poiGalleryAnchorData.h / 2.0f) + (poiGalleryAnchorData.y - KL2.LJIIL(context))) - ((LJI.height() / 2.0f) + LJI.top));
            if (view != null) {
                f = view.getAlpha();
            } else {
                f = 0.0f;
            }
            c81078Vru.LJI(LIZLLL, 300L, new IDAListenerS44S0200000_14(LIZLLL, context, 0), new C81073Vrp(view, f));
        }
    }
}
