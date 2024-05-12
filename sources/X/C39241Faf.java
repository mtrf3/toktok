package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Faf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39241Faf {
    public static String LIZIZ(List<String> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                sb.append((String) ListProtector.get(list, i));
            }
            return sb.toString();
        }
        return null;
    }

    public static List<String> LIZ(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), str, 64);
            ArrayList arrayList = new ArrayList();
            Signature[] signatureArr = LLLLLLZ.signatures;
            if (signatureArr != null) {
                for (Signature signature : signatureArr) {
                    arrayList.add(C30581Hy.LJIIZILJ(signature.toByteArray()));
                }
                return arrayList;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
