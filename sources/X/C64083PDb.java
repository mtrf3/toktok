package X;

import android.util.Base64;
import com.bytedance.mt.protector.impl.string2number.CastByteProtector;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: X.PDb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64083PDb {
    public static final byte LIZ = CastByteProtector.parseByte("01110000", 2);
    public static final byte LIZIZ = CastByteProtector.parseByte("00001111", 2);

    public static String LIZ() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b = array[0];
        array[16] = b;
        array[0] = (byte) ((b & LIZIZ) | LIZ);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
