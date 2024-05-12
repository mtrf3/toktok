package X;

import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;

/* loaded from: classes8.dex */
public final class I0D implements HPI {
    public final /* synthetic */ I0F LIZ;

    public I0D(I0F i0f) {
        this.LIZ = i0f;
    }

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        Integer num;
        RecordPageOptionalConfig recordPageOptionalConfig = this.LIZ.getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            num = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            num = null;
        }
        C44108HSu.LIZIZ(num, HRG.SUCCESS);
        this.LIZ.openAlbum();
    }
}
