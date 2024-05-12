package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.O5e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61330O5e extends O43 {
    public C61330O5e() {
        super(false);
    }

    @Override // X.O43
    public final String LIZLLL() {
        return "(.*)/ies_fonts/(.+).ttf$";
    }

    @Override // X.O43
    public final InputStream LIZIZ(String str) {
        InputStream inputStream = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        Context context = C61331O5f.LIZ().LIZIZ;
        java.util.Map<String, String> map = C61331O5f.LIZ().LIZ;
        if (map == null || map.size() == 0) {
            return null;
        }
        String str2 = map.get(substring);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            inputStream = context.getAssets().open(str2);
            return inputStream;
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            return inputStream;
        }
    }
}
