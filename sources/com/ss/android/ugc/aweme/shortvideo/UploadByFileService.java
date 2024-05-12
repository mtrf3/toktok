package com.ss.android.ugc.aweme.shortvideo;

import X.XFL;
import com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UploadByFileService implements IAudioExtractUpload {
    public XFL LIZ;

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final void cancelUpload() {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            xfl.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final long getCurrentUploadOffset() {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            return ((Long) ((Comparable) xfl.LJIILLIIL.LIZ)).longValue();
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final long getFileSize() {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            if (xfl.LJII) {
                return xfl.LJIILL.length();
            }
            return -1L;
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final long getHeaderSize() {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            return xfl.LJFF();
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final boolean isProduceFinish() {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            return xfl.LJII;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final void disableDeleteCacheWhenEnd(boolean z) {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            xfl.LJIJJLI = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final void stopUpload(boolean z) {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            xfl.LJIIIZ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final long getCrc32ByOffset(long j, long j2) {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            return xfl.LJ(j, j2);
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final int consume(int i, byte[] bArr, int i2) {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            return xfl.LIZLLL(i, bArr, i2);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final void init(String filePath, String publishId, boolean z) {
        o.LJIIIZ(filePath, "filePath");
        o.LJIIIZ(publishId, "publishId");
        XFL xfl = new XFL(filePath, publishId);
        if (z) {
            xfl.LJI();
        }
        this.LIZ = xfl;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final void produce(byte[] bArr, long j, int i, boolean z) {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            xfl.LJIIIIZZ(bArr, j, i, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final int streamConsume(long j, byte[] bArr, int i, int i2) {
        XFL xfl = this.LIZ;
        if (xfl != null) {
            return xfl.LJIIJ(j, bArr, i, i2);
        }
        return 0;
    }
}
