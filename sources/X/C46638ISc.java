package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.nio.BufferUnderflowException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ISc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46638ISc implements ISY {
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public boolean LJFF;
    public FileChannel LJI;
    public MappedByteBuffer LJII;
    public boolean LJ = true;
    public final HashMap<String, HashMap<String, String>> LJIIIIZZ = new HashMap<>();
    public int LIZ = 0;

    @Override // X.ISY
    public final void LIZJ() {
        if (this.LJII == null) {
            return;
        }
        this.LJFF = false;
        LJIIIZ(false);
        MappedByteBuffer mappedByteBuffer = this.LJII;
        if (mappedByteBuffer == null) {
            return;
        }
        mappedByteBuffer.rewind();
    }

    public final JSONObject LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        if (this.LJII == null || LJFF() < 128) {
            return jSONObject;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            try {
                byte b = this.LJII.get();
                sb.append((char) b);
                if (b == 125) {
                    break;
                }
            } catch (IndexOutOfBoundsException | JSONException unused) {
                return jSONObject;
            }
        }
        jSONObject = new JSONObject(sb.toString());
        return jSONObject;
    }

    public final String LJ() {
        if (this.LJII == null || this.LJI == null) {
            this.LJ = false;
            return null;
        }
        byte[] bArr = new byte[2];
        try {
            LJI(0);
            this.LJII.get(bArr, 0, 2);
            return new String(bArr);
        } catch (IndexOutOfBoundsException | BufferUnderflowException unused) {
            return null;
        }
    }

    public final int LJFF() {
        MappedByteBuffer mappedByteBuffer = this.LJII;
        if (mappedByteBuffer == null) {
            return -1;
        }
        return mappedByteBuffer.remaining();
    }

    public static String LJII(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(jSONObject2);
        for (int min = Math.min(jSONObject2.length(), 128); min < 128; min += 10) {
            sb.append("0000000000");
        }
        return sb.toString();
    }

    @Override // X.ISY
    public final boolean LIZIZ(EnumC46636ISa enumC46636ISa) {
        int i = C46637ISb.LIZ[enumC46636ISa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return this.LJFF;
        }
        return this.LJ;
    }

    public final int LJI(int i) {
        MappedByteBuffer mappedByteBuffer = this.LJII;
        if (mappedByteBuffer == null || i < 0) {
            return -1;
        }
        int position = mappedByteBuffer.position();
        this.LJII.position(i);
        return position;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f8, code lost:
    
        r12.LJIIIIZZ.put(r7, r6);
        r2 = true;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        if (r10 > 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46638ISc.LJIIIIZZ(java.lang.String):boolean");
    }

    public final void LJIIIZ(boolean z) {
        String str;
        if (this.LJII == null) {
            return;
        }
        int LJI = LJI(2);
        if (!z) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        try {
            this.LJII.put(str.getBytes(), 0, Math.min(str.length(), 1));
        } catch (IndexOutOfBoundsException unused) {
        }
        if (LJI > 2) {
            LJI(LJI);
        }
    }

    public C46638ISc(String str, int i) {
        this.LIZLLL = str;
        this.LIZIZ = i;
        if (!TextUtils.isEmpty("01")) {
            this.LIZJ = "01";
        } else {
            this.LIZJ = "01";
        }
    }

    public final boolean LJIIJ(String str, boolean z) {
        int i;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str) && this.LIZ >= 0 && this.LJII != null) {
            int LJI = LJI(3);
            if (LJFF() < 128) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = this.LIZ - 1;
            } else {
                i = this.LIZ + 1;
            }
            this.LIZ = i;
            try {
                jSONObject.put("sid", str);
                jSONObject.put("num", this.LIZ);
                this.LJII.put(LJII(jSONObject).getBytes(), 0, 128);
                z2 = true;
            } catch (IndexOutOfBoundsException | BufferUnderflowException | JSONException unused) {
            }
            if (LJI > 3) {
                LJI(LJI);
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00af  */
    @Override // X.ISY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46638ISc.LIZ(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
