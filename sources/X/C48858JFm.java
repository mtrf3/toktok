package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: X.JFm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48858JFm extends AbstractC48851JFf {
    public C48858JFm() {
        super(2);
    }

    @Override // X.AbstractC48851JFf
    public final Object LIZIZ(Object[] objArr) {
        if (objArr[0] == null) {
            return null;
        }
        SharedPreferences LIZIZ = F9J.LIZIZ((Context) objArr[0], 0, C48857JFl.LIZJ());
        String string = LIZIZ.getString("cdid", "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        LIZIZ.edit().putString("cdid", uuid).apply();
        return uuid;
    }
}
