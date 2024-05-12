package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import java.util.HashMap;

/* renamed from: X.QJp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66801QJp implements PA0 {
    @Override // X.PA0
    public final String LIZIZ(String str, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty("application/json; charset=utf-8")) {
            hashMap.put("Content-Type", "application/json; charset=utf-8");
        }
        return post(str, hashMap, bArr);
    }

    @Override // X.PA0
    public final String get(String str, java.util.Map<String, String> map) {
        try {
            return AbstractC66805QJt.LIZ.LIZIZ(str, map, null);
        } catch (Exception e) {
            if (e instanceof C36616EYq) {
                C36616EYq c36616EYq = (C36616EYq) e;
                throw new C64809Pc5(c36616EYq.getResponseCode(), c36616EYq.getCause());
            }
            throw new C64809Pc5(LiveChatShowDelayForHotLiveSetting.DEFAULT, e.getCause());
        }
    }

    @Override // X.PA0
    public final byte[] LIZ(String str, java.util.Map map, byte[] bArr) {
        try {
            return AbstractC66805QJt.LIZ.LJFF(str, bArr, map);
        } catch (C36616EYq e) {
            throw new C64809Pc5(e.getResponseCode(), e.getCause());
        }
    }

    @Override // X.PA0
    public final String post(String str, java.util.Map map, byte[] bArr) {
        try {
            return AbstractC66805QJt.LIZ.LJ(str, bArr, map, null);
        } catch (C36616EYq e) {
            throw new C64809Pc5(e.getResponseCode(), e.getCause());
        }
    }
}
