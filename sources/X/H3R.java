package X;

import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploaderListener;

/* loaded from: classes8.dex */
public final class H3R implements BDVideoUploaderListener {
    public final /* synthetic */ H3S LIZ;

    public H3R(C43424H2m c43424H2m) {
        this.LIZ = c43424H2m;
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final String getStringFromExtern(int i) {
        String LIZ = this.LIZ.LIZ();
        if (LIZ == null) {
            return "";
        }
        return LIZ;
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onUploadVideoStage(int i, long j) {
        this.LIZ.LIZJ(i);
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final int videoUploadCheckNetState(int i, int i2) {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onLog(int i, int i2, String str) {
        if (i != 100) {
            if (i != 101) {
                return;
            }
            this.LIZ.onLog(100, i2, str);
            return;
        }
        this.LIZ.onLog(101, i2, str);
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onNotify(int i, long j, BDVideoInfo bDVideoInfo) {
        long j2;
        C43340Gzg LJFF = C1JI.LJFF(bDVideoInfo);
        if (LJFF == null) {
            Long l = -2147483648L;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            LJFF = new C43340Gzg(j2, null, 479);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 121) {
                            return;
                        }
                        this.LIZ.LIZLLL(4, j, LJFF);
                        return;
                    }
                    this.LIZ.LIZLLL(4, j, LJFF);
                    return;
                }
                this.LIZ.LIZLLL(2, j, LJFF);
                return;
            }
            this.LIZ.LIZLLL(3, j, LJFF);
            return;
        }
        this.LIZ.LIZLLL(1, j, LJFF);
    }
}
