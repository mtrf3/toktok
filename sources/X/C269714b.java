package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: X.14b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C269714b {
    public int LIZ;
    public final Object LIZIZ;

    public final boolean LIZ() {
        if (this.LIZ + 4 > ((byte[]) this.LIZIZ).length) {
            P4Q.LIZJ("TEParcel", "out of border");
            return false;
        }
        if (LIZJ() == 0) {
            return false;
        }
        return true;
    }

    public final float LIZIZ() {
        if (this.LIZ + 4 > ((byte[]) this.LIZIZ).length) {
            P4Q.LIZJ("TEParcel", "out of border");
            return -1.0f;
        }
        return Float.intBitsToFloat(LIZJ());
    }

    public final int LIZJ() {
        int i = this.LIZ;
        int i2 = i + 4;
        Object obj = this.LIZIZ;
        if (i2 > ((byte[]) obj).length) {
            P4Q.LIZJ("TEParcel", "out of border");
            return -1;
        }
        int i3 = (((byte[]) obj)[i] & 255) | ((((byte[]) obj)[i + 1] & 255) << 8) | ((((byte[]) obj)[i + 2] & 255) << 16) | ((((byte[]) obj)[i + 3] & Byte.MAX_VALUE) << 24);
        if ((((byte[]) obj)[i + 3] >> 7) != 0) {
            i3 -= LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        this.LIZ = i + 4;
        return i3;
    }

    public final Long LJ() {
        int i = this.LIZ;
        int i2 = i + 8;
        Object obj = this.LIZIZ;
        if (i2 > ((byte[]) obj).length) {
            P4Q.LIZJ("TEParcel", "out of border");
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap((byte[]) obj, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        this.LIZ += 8;
        return Long.valueOf(wrap.getLong());
    }

    public /* synthetic */ C269714b(byte[] bArr) {
        this.LIZIZ = bArr;
    }

    public final void LJFF(Object obj) {
        int i = this.LIZ;
        Object[] objArr = (Object[]) this.LIZIZ;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.LIZ = i + 1;
        }
    }

    public final String LIZLLL(int i, int i2) {
        int i3 = this.LIZ;
        int i4 = i3 + i2;
        Object obj = this.LIZIZ;
        if (i4 > ((byte[]) obj).length) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("readString out of bound(data size=");
            LIZ.append(((byte[]) this.LIZIZ).length);
            LIZ.append(", start=");
            C15890jp.LIZIZ(LIZ, this.LIZ, ", len=", i2, ")");
            P4Q.LIZJ("TEParcel", X1D.LIZIZ(LIZ));
            return null;
        }
        String str = new String((byte[]) obj, i3, i, Charset.forName("UTF-8"));
        this.LIZ += i2;
        return str;
    }
}
