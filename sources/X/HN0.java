package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HN0 {
    public static final /* synthetic */ int LIZ = 0;

    public static String[] LIZIZ(H72[] waterMarkImages, String str, String commonName) {
        o.LJIIIZ(waterMarkImages, "waterMarkImages");
        o.LJIIIZ(commonName, "commonName");
        ArrayList arrayList = new ArrayList();
        int length = waterMarkImages.length;
        for (int i = 0; i < length; i++) {
            String path = new File(str, C0NY.LIZIZ(commonName, i, ".png")).getPath();
            if (waterMarkImages[i].LIZLLL(path)) {
                o.LJIIIIZZ(path, "path");
                arrayList.add(path);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static H72[] LIZ(int i, int i2, String text, boolean z, boolean z2, boolean z3, HN4 hn4) {
        boolean z4;
        boolean z5;
        H72 h72;
        o.LJIIIZ(text, "text");
        List LJIIJ = C78939UyV.LJIIJ(hn4.LIZIZ);
        if (C32151Nz.LJJIIJZLJL(LJIIJ)) {
            TypedArray obtainTypedArray = C44172HVg.LIZ.getResources().obtainTypedArray(R.array.bg);
            o.LJIIIIZZ(obtainTypedArray, "application.getResources….array.water_mark_images)");
            int length = obtainTypedArray.length();
            ArrayList arrayList = new ArrayList();
            String LIZIZ = QZZ.LIZIZ('@', text);
            for (int i3 = 0; i3 < length; i3++) {
                H72 h722 = new H72();
                int resourceId = obtainTypedArray.getResourceId(i3, 0);
                if (z2 && MEX.LIZ() == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Resources resources = C44172HVg.LIZ.getResources();
                o.LJIIIIZZ(resources, "application.getResources()");
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, resourceId, null);
                o.LJIIIIZZ(decodeResource, "decodeResource(resources, resId, null)");
                if (!z5) {
                    h72 = h722;
                    h722.LIZIZ(i, i2, LIZIZ, decodeResource, z, z3, hn4);
                } else {
                    h72 = h722;
                    h722.LIZ(i, i2, LIZIZ, decodeResource, z, z3);
                }
                arrayList.add(h72);
            }
            obtainTypedArray.recycle();
            return (H72[]) arrayList.toArray(new H72[0]);
        }
        String LIZIZ2 = QZZ.LIZIZ('@', text);
        ArrayList arrayList2 = new ArrayList();
        o.LJI(LJIIJ);
        int size = ((ArrayList) LJIIJ).size();
        for (int i4 = 0; i4 < size; i4++) {
            H72 h723 = new H72();
            String picPath = ((HN3) ListProtector.get(LJIIJ, i4)).LJLILLLLZI;
            if (z2 && MEX.LIZ() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            o.LJIIIZ(picPath, "picPath");
            Bitmap decodeFile = BitmapFactory.decodeFile(picPath);
            o.LJIIIIZZ(decodeFile, "decodeFile(picPath)");
            if (!z4) {
                h723.LIZIZ(i, i2, LIZIZ2, decodeFile, z, z3, hn4);
            } else {
                h723.LIZ(i, i2, LIZIZ2, decodeFile, z, z3);
            }
            arrayList2.add(h723);
        }
        return (H72[]) arrayList2.toArray(new H72[0]);
    }
}
