package com.ss.android.ugc.aweme.servicimpl;

import X.C00F;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService;

/* loaded from: classes8.dex */
public final class SplitVideoServiceImpl implements ISplitVideoService {
    public static ISplitVideoService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ISplitVideoService.class, false);
        if (LIZ != null) {
            return (ISplitVideoService) LIZ;
        }
        if (C58096Mr6.p6 == null) {
            synchronized (ISplitVideoService.class) {
                if (C58096Mr6.p6 == null) {
                    C58096Mr6.p6 = new SplitVideoServiceImpl();
                }
            }
        }
        return C58096Mr6.p6;
    }

    @Override // com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService
    public final boolean playListAutoTake() {
        if (C00F.LIZ(31744, 0, "tiktok_playlist_status", true) != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService
    public final boolean showPlayList() {
        if (C00F.LIZ(31744, 0, "tiktok_playlist_status", true) <= 0) {
            return false;
        }
        return true;
    }
}
