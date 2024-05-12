package X;

import android.text.TextUtils;

/* renamed from: X.BTy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28850BTy implements BU3<BU8> {
    @Override // X.BU3
    public final void LIZ(Object obj, java.util.Map map) {
        BU8 bu8 = (BU8) obj;
        if (bu8 == null) {
            return;
        }
        if (!TextUtils.isEmpty(bu8.LIZ)) {
            map.put("request_page", bu8.LIZ);
        }
        long j = bu8.LIZIZ;
        if (j > 0) {
            map.put("to_user_id", String.valueOf(j));
        }
        if (TextUtils.isEmpty(null)) {
            return;
        }
        map.put("type", null);
    }
}
