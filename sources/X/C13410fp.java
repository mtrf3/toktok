package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.0fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13410fp {
    public static final C13410fp LIZ = new C13410fp();

    public static FontVariationAxis[] LIZLLL(C13610g9 c13610g9, Context context) {
        if (context != null) {
            C78847Ux1.LIZIZ(context);
        } else if (c13610g9.LIZIZ) {
            throw new IllegalStateException("Required density, but not provided");
        }
        ArrayList arrayList = (ArrayList) c13610g9.LIZ;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC13600g8 interfaceC13600g8 = (InterfaceC13600g8) ListProtector.get(arrayList, i);
            arrayList2.add(new FontVariationAxis(interfaceC13600g8.LIZJ(), interfaceC13600g8.LIZIZ()));
        }
        Object[] array = arrayList2.toArray(new FontVariationAxis[0]);
        o.LJII(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (FontVariationAxis[]) array;
    }

    public static final Typeface LIZIZ(File file, Context context, C13610g9 variationSettings) {
        o.LJIIIZ(file, "file");
        o.LJIIIZ(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(file).setFontVariationSettings(LIZLLL(variationSettings, context)).build();
    }

    public static final Typeface LIZJ(ParcelFileDescriptor fileDescriptor, Context context, C13610g9 variationSettings) {
        o.LJIIIZ(fileDescriptor, "fileDescriptor");
        o.LJIIIZ(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(fileDescriptor.getFileDescriptor()).setFontVariationSettings(LIZLLL(variationSettings, context)).build();
    }

    public static final Typeface LIZ(AssetManager assetManager, String path, Context context, C13610g9 variationSettings) {
        o.LJIIIZ(assetManager, "assetManager");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(assetManager, path).setFontVariationSettings(LIZLLL(variationSettings, context)).build();
    }
}
