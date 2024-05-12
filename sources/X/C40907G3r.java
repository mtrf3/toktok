package X;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.G3r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40907G3r {
    public static final FQV LIZ(Context context, String str, Locale currentLocale, boolean z) {
        boolean z2;
        o.LJIIIZ(currentLocale, "currentLocale");
        o.LJIIIZ(context, "context");
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = null;
        if (z2) {
            return null;
        }
        C40912G3w c40912G3w = C40908G3s.LIZIZ;
        if (c40912G3w != null) {
            c40912G3w.LIZJ = "json";
        }
        String LJIILLIIL = o.LJIILLIIL(".json", o.LJIILLIIL(O5Y.LJJJJJ(currentLocale), G45.LIZ));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) str);
        LIZ.append('/');
        LIZ.append(LJIILLIIL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C40912G3w c40912G3w2 = C40908G3s.LIZIZ;
        if (c40912G3w2 != null) {
            o.LJIIIZ(LIZIZ, "<set-?>");
            c40912G3w2.LJFF = LIZIZ;
        }
        File file = new File(LIZIZ);
        if (!file.exists()) {
            return null;
        }
        try {
            str2 = C36869EdV.LIZ(new FileInputStream(file));
        } catch (FileNotFoundException unused) {
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalAccessException("Patch String is null or empty.");
        }
        C40912G3w c40912G3w3 = C40908G3s.LIZIZ;
        if (c40912G3w3 != null) {
            o.LJIIIZ(str2, "<set-?>");
            c40912G3w3.LJI = str2;
        }
        JSONObject jSONObject = new JSONObject(str2);
        if (z) {
            return new G40(jSONObject);
        }
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        return new C40915G3z(jSONObject, resources);
    }
}
