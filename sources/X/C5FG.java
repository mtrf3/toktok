package X;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.ugc.android.editor.core.api.params.TextStyleInfo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/* renamed from: X.5FG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FG {
    public static TextStyleInfo LIZ() {
        String str;
        String str2;
        BufferedReader bufferedReader;
        if (!TextUtils.equals(Locale.getDefault().getLanguage(), "zh")) {
            str = "LocalResource/default.bundle/textStyleEn.json";
        } else {
            str = "LocalResource/default.bundle/textStyle.json";
        }
        Object obj = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(C125444w8.LIZ().LIZ().getAssets().open(str)));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AssetUtils#loadJson::jsonFilePath=");
            LIZ.append(str);
            LIZ.append(", Exception = ");
            LIZ.append(e);
            C131935Ft.LIZJ(X1D.LIZIZ(LIZ));
            str2 = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            str2 = sb.toString();
            AnonymousClass636.LJFF(bufferedReader, null);
            Gson gson = C6YK.LIZIZ;
            if (gson != null) {
                try {
                    obj = gson.LJI(str2, TextStyleInfo.class);
                } catch (Exception unused) {
                }
            }
            TextStyleInfo textStyleInfo = (TextStyleInfo) obj;
            if (textStyleInfo == null) {
                return new TextStyleInfo();
            }
            return textStyleInfo;
        } finally {
        }
    }
}
