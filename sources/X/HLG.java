package X;

import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploaderListener;

/* loaded from: classes8.dex */
public final class HLG implements BDVideoUploaderListener {
    public final /* synthetic */ HLJ LIZ;

    public HLG(HLJ hlj) {
        this.LIZ = hlj;
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final String getStringFromExtern(int i) {
        this.LIZ.LIZ();
        return null;
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onUploadVideoStage(int i, long j) {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final int videoUploadCheckNetState(int i, int i2) {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onLog(int i, int i2, String str) {
        this.LIZ.LJ();
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onNotify(int i, long j, BDVideoInfo bDVideoInfo) {
        String str;
        long j2;
        String str2;
        HLJ hlj = this.LIZ;
        String str3 = null;
        if (bDVideoInfo != null) {
            str3 = bDVideoInfo.mTosKey;
            str = bDVideoInfo.mVideoId;
            j2 = bDVideoInfo.mErrorCode;
            str2 = bDVideoInfo.mErrorMsg;
        } else {
            str = null;
            j2 = 0;
            str2 = null;
        }
        hlj.LIZLLL(i, j, new AbstractVideoUploader.VideoUploadInfo(str3, str, j2, str2));
    }
}
