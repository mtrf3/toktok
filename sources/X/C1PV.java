package X;

import com.bytedance.compression.zstd.ZstdCompress;
import com.bytedance.compression.zstd.ZstdDictCompress;

/* renamed from: X.1PV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PV implements PAN {
    @Override // X.PAN
    public final byte[] LIZ(byte[] bArr) {
        return ZstdCompress.compress(bArr, 15);
    }

    @Override // X.PAN
    public final byte[] LIZIZ(byte[] bArr, byte[] bArr2) {
        return ZstdCompress.compress(bArr, new ZstdDictCompress(bArr2, 15));
    }
}
