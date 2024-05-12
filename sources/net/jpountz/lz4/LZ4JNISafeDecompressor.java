package net.jpountz.lz4;

import X.X1D;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes15.dex */
public final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    public static LZ4SafeDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        byte[] bArr;
        int i6;
        byte[] bArr2;
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        ByteBufferUtils.checkNotReadOnly(byteBuffer4);
        ByteBufferUtils.checkRange(byteBuffer3, i, i2);
        ByteBufferUtils.checkRange(byteBuffer4, i3, i4);
        if ((byteBuffer3.hasArray() || byteBuffer3.isDirect()) && (byteBuffer4.hasArray() || byteBuffer4.isDirect())) {
            if (byteBuffer3.hasArray()) {
                bArr = byteBuffer3.array();
                i5 = byteBuffer3.arrayOffset() + i;
                byteBuffer3 = null;
            } else {
                i5 = i;
                bArr = null;
            }
            if (byteBuffer4.hasArray()) {
                bArr2 = byteBuffer4.array();
                i6 = byteBuffer4.arrayOffset() + i3;
                byteBuffer4 = null;
            } else {
                i6 = i3;
                bArr2 = null;
            }
            int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, byteBuffer3, i5, i2, bArr2, byteBuffer4, i6, i4);
            if (LZ4_decompress_safe >= 0) {
                return LZ4_decompress_safe;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error decoding offset ");
            LIZ.append(i5 - LZ4_decompress_safe);
            LIZ.append(" of input buffer");
            throw new LZ4Exception(X1D.LIZIZ(LIZ));
        }
        LZ4SafeDecompressor lZ4SafeDecompressor = SAFE_INSTANCE;
        if (lZ4SafeDecompressor == null) {
            lZ4SafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
            SAFE_INSTANCE = lZ4SafeDecompressor;
        }
        return lZ4SafeDecompressor.decompress(byteBuffer3, i, i2, byteBuffer4, i3, i4);
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public final int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, null, i, i2, bArr2, null, i3, i4);
        if (LZ4_decompress_safe >= 0) {
            return LZ4_decompress_safe;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error decoding offset ");
        LIZ.append(i - LZ4_decompress_safe);
        LIZ.append(" of input buffer");
        throw new LZ4Exception(X1D.LIZIZ(LIZ));
    }
}
