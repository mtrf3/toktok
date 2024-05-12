package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.FiR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39723FiR {
    public final ArrayList<HashMap<String, String>> LIZ = new ArrayList<>();
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;

    public final String LIZIZ() {
        String str;
        if (this.LIZ.isEmpty()) {
            return LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.LIZ.size(); i++) {
                HashMap hashMap = (HashMap) ListProtector.get(this.LIZ, i);
                if (hashMap.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : hashMap.keySet()) {
                        jSONObject.put(str2, hashMap.get(str2));
                    }
                    jSONArray.put(jSONObject);
                }
            }
            str = jSONArray.toString();
        } catch (Exception unused) {
            C46496IMq.LIZIZ();
            str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        this.LIZ.clear();
        if (TextUtils.isEmpty(str)) {
            return LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        return str;
    }

    public final void LIZLLL(ByteBuffer byteBuffer) {
        int i;
        String valueOf;
        ArrayList<HashMap<String, String>> arrayList;
        byte b;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        byteBuffer.limit(limit);
        byte[] bArr2 = new byte[remaining];
        int i2 = 0;
        int i3 = 0;
        while (i2 < remaining) {
            int i4 = i2 + 3;
            if (i4 < remaining && bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3 && ((b = bArr[i4]) == 0 || b == 1 || b == 2 || b == 3)) {
                int i5 = i3 + 1;
                bArr2[i3] = 0;
                int i6 = i5 + 1;
                bArr2[i5] = 0;
                i3 = i6 + 1;
                bArr2[i6] = bArr[i4];
                i2 = i4;
            } else {
                bArr2[i3] = bArr[i2];
                i3++;
            }
            i2++;
        }
        if (remaining < 10) {
            return;
        }
        if (LIZ(9, bArr2) == 0 && (arrayList = this.LIZ) != null && arrayList.size() > 0) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        int i7 = 6;
        int LIZ = (LIZ(7, bArr2) << 8) + LIZ(6, bArr2);
        if (LIZ > 65280) {
            LIZ = 65280;
        }
        int i8 = 10;
        for (int i9 = 0; i9 < LIZ && (i = i8 + 5) < remaining; i9++) {
            int LIZ2 = (LIZ(i8 + 1, bArr2) << 8) + LIZ(i8, bArr2);
            if (LIZ2 <= 0) {
                break;
            }
            int LIZ3 = (LIZ(i8 + 3, bArr2) << 8) + LIZ(i8 + 2, bArr2);
            int LIZ4 = (LIZ(i, bArr2) << 8) + LIZ(i8 + 4, bArr2);
            String valueOf2 = String.valueOf(LIZ3);
            if (LIZ3 == i7) {
                if (this.LIZLLL == 1) {
                    valueOf = String.valueOf(LIZ4 + 1);
                }
                valueOf = String.valueOf(LIZ4);
            } else if (LIZ3 == 5) {
                if (this.LIZJ == 1) {
                    valueOf = String.valueOf(LIZ4 + 1);
                }
                valueOf = String.valueOf(LIZ4);
            } else if (LIZ3 == 10) {
                if (this.LIZIZ == 1) {
                    valueOf = String.valueOf(LIZ4 + 1);
                }
                valueOf = String.valueOf(LIZ4);
            } else {
                if (LIZ3 == 11 && this.LJ == 1) {
                    valueOf = String.valueOf(LIZ4 + 1);
                }
                valueOf = String.valueOf(LIZ4);
            }
            hashMap.put(valueOf2, valueOf);
            i7 = 6;
            i8 = i8 + LIZ2 + 6;
        }
        ArrayList<HashMap<String, String>> arrayList2 = this.LIZ;
        if (!hashMap.containsKey(String.valueOf(i7)) && this.LIZLLL == 1) {
            hashMap.put(String.valueOf(i7), "1");
        }
        if (!hashMap.containsKey(String.valueOf(5)) && this.LIZJ == 1) {
            hashMap.put(String.valueOf(5), "1");
        }
        if (!hashMap.containsKey(String.valueOf(10)) && this.LIZIZ == 1) {
            hashMap.put(String.valueOf(10), "1");
        }
        if (!hashMap.containsKey(String.valueOf(11)) && this.LJ == 1) {
            hashMap.put(String.valueOf(11), "1");
        }
        arrayList2.add(hashMap);
    }

    public static int LIZ(int i, byte[] bArr) {
        if (bArr.length > i) {
            byte b = bArr[i];
            if (b < 0) {
                return b + 256;
            }
            return b;
        }
        return 0;
    }

    public final void LIZJ(Object obj, int i, int i2, String str) {
        if (i == 111) {
            this.LIZIZ = i2;
            return;
        }
        if (i == 110) {
            this.LJ = i2;
            return;
        }
        if (i == 108) {
            this.LIZJ = i2;
            return;
        }
        if (i == 107) {
            this.LIZLLL = i2;
            return;
        }
        if (i == 109 || i != 105 || obj == null) {
            return;
        }
        try {
            if (this.LIZ.size() < 10 && (obj instanceof ByteBuffer)) {
                LIZLLL((ByteBuffer) obj);
            }
        } catch (Exception unused) {
            C46496IMq.LIZIZ();
        }
    }
}
