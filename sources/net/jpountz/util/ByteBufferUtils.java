package net.jpountz.util;

import X.V0N;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes15.dex */
public enum ByteBufferUtils {
    ;

    public static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void checkNotReadOnly(ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly()) {
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    public static ByteBuffer inLittleEndianOrder(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (order.equals(byteOrder)) {
            return byteBuffer;
        }
        return byteBuffer.duplicate().order(byteOrder);
    }

    public static ByteBuffer inNativeByteOrder(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = Utils.NATIVE_BYTE_ORDER;
        if (order.equals(byteOrder)) {
            return byteBuffer;
        }
        return byteBuffer.duplicate().order(byteOrder);
    }

    public static ByteBufferUtils valueOf(String str) {
        return (ByteBufferUtils) V0N.LJJJ(ByteBufferUtils.class, str);
    }

    public static void checkRange(ByteBuffer byteBuffer, int i) {
        if (i >= 0 && i < byteBuffer.capacity()) {
        } else {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public static byte readByte(ByteBuffer byteBuffer, int i) {
        return byteBuffer.get(i);
    }

    public static int readInt(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i);
    }

    public static int readIntLE(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i);
    }

    public static long readLong(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getLong(i);
    }

    public static long readLongLE(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getLong(i);
    }

    public static int readShortLE(ByteBuffer byteBuffer, int i) {
        return ((byteBuffer.get(i + 1) & 255) << 8) | (byteBuffer.get(i) & 255);
    }

    public static void checkRange(ByteBuffer byteBuffer, int i, int i2) {
        SafeUtils.checkLength(i2);
        if (i2 > 0) {
            checkRange(byteBuffer, i);
            checkRange(byteBuffer, (i + i2) - 1);
        }
    }

    public static void writeByte(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put(i, (byte) i2);
    }

    public static void writeInt(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.putInt(i, i2);
    }

    public static void writeLong(ByteBuffer byteBuffer, int i, long j) {
        byteBuffer.putLong(i, j);
    }

    public static void writeShortLE(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put(i, (byte) i2);
        byteBuffer.put(i + 1, (byte) (i2 >>> 8));
    }
}
