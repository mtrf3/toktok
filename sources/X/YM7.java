package X;

import com.bytedance.compression.zstd.Zstd;

/* loaded from: classes16.dex */
public final class YM7 extends RuntimeException {
    public final long LJLIL;

    public long getErrorCode() {
        return this.LJLIL;
    }

    public YM7(long j) {
        this(Zstd.getErrorCode(j), Zstd.getErrorName(j));
    }

    public YM7(long j, String str) {
        super(str);
        this.LJLIL = j;
    }
}
