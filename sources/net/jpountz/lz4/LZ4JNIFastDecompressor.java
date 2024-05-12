package net.jpountz.lz4;

import X.X1D;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes15.dex */
public final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    public static LZ4FastDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        byte[] bArr;
        byte[] bArr2;
        ByteBuffer byteBuffer3 = byteBuffer2;
        int i4 = i2;
        int i5 = i;
        ByteBuffer byteBuffer4 = byteBuffer;
        ByteBufferUtils.checkNotReadOnly(byteBuffer3);
        ByteBufferUtils.checkRange(byteBuffer4, i5);
        ByteBufferUtils.checkRange(byteBuffer3, i4, i3);
        if ((byteBuffer4.hasArray() || byteBuffer4.isDirect()) && (byteBuffer3.hasArray() || byteBuffer3.isDirect())) {
            if (byteBuffer4.hasArray()) {
                bArr = byteBuffer4.array();
                i5 += byteBuffer4.arrayOffset();
                byteBuffer4 = null;
            } else {
                bArr = null;
            }
            if (byteBuffer3.hasArray()) {
                bArr2 = byteBuffer3.array();
                i4 += byteBuffer3.arrayOffset();
                byteBuffer3 = null;
            } else {
                bArr2 = null;
            }
            int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, byteBuffer4, i5, bArr2, byteBuffer3, i4, i3);
            if (LZ4_decompress_fast >= 0) {
                return LZ4_decompress_fast;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error decoding offset ");
            LIZ.append(i5 - LZ4_decompress_fast);
            LIZ.append(" of input buffer");
            throw new LZ4Exception(X1D.LIZIZ(LIZ));
        }
        LZ4FastDecompressor lZ4FastDecompressor = SAFE_INSTANCE;
        if (lZ4FastDecompressor == null) {
            lZ4FastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
            SAFE_INSTANCE = lZ4FastDecompressor;
        }
        return lZ4FastDecompressor.decompress(byteBuffer4, i5, byteBuffer3, i4, i3);
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public final int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        SafeUtils.checkRange(bArr, i);
        SafeUtils.checkRange(bArr2, i2, i3);
        int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, null, i, bArr2, null, i2, i3);
        if (LZ4_decompress_fast >= 0) {
            return LZ4_decompress_fast;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error decoding offset ");
        LIZ.append(i - LZ4_decompress_fast);
        LIZ.append(" of input buffer");
        throw new LZ4Exception(X1D.LIZIZ(LIZ));
    }
}
