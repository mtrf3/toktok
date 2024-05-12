package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes15.dex */
public final class LZ4HCJNICompressor extends LZ4Compressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4HCJNICompressor INSTANCE = new LZ4HCJNICompressor();
    public static LZ4Compressor SAFE_INSTANCE;
    public final int compressionLevel;

    public LZ4HCJNICompressor() {
        this(9);
    }

    public LZ4HCJNICompressor(int i) {
        this.compressionLevel = i;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        byte[] bArr;
        int i6;
        byte[] bArr2;
        ByteBuffer byteBuffer3 = byteBuffer2;
        ByteBuffer byteBuffer4 = byteBuffer;
        ByteBufferUtils.checkNotReadOnly(byteBuffer3);
        ByteBufferUtils.checkRange(byteBuffer4, i, i2);
        ByteBufferUtils.checkRange(byteBuffer3, i3, i4);
        if ((byteBuffer4.hasArray() || byteBuffer4.isDirect()) && (byteBuffer3.hasArray() || byteBuffer3.isDirect())) {
            if (byteBuffer4.hasArray()) {
                bArr = byteBuffer4.array();
                i5 = byteBuffer4.arrayOffset() + i;
                byteBuffer4 = null;
            } else {
                i5 = i;
                bArr = null;
            }
            if (byteBuffer3.hasArray()) {
                bArr2 = byteBuffer3.array();
                i6 = byteBuffer3.arrayOffset() + i3;
                byteBuffer3 = null;
            } else {
                i6 = i3;
                bArr2 = null;
            }
            int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, byteBuffer4, i5, i2, bArr2, byteBuffer3, i6, i4, this.compressionLevel);
            if (LZ4_compressHC > 0) {
                return LZ4_compressHC;
            }
            throw new LZ4Exception();
        }
        LZ4Compressor lZ4Compressor = SAFE_INSTANCE;
        if (lZ4Compressor == null) {
            lZ4Compressor = LZ4Factory.safeInstance().highCompressor(this.compressionLevel);
            SAFE_INSTANCE = lZ4Compressor;
        }
        return lZ4Compressor.compress(byteBuffer4, i, i2, byteBuffer3, i3, i4);
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, null, i, i2, bArr2, null, i3, i4, this.compressionLevel);
        if (LZ4_compressHC > 0) {
            return LZ4_compressHC;
        }
        throw new LZ4Exception();
    }
}
