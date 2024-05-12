package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;

/* loaded from: classes11.dex */
public final class NFS implements AK0 {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    @Override // X.AK0
    public final Integer LIZ() {
        return null;
    }

    @Override // X.AK0
    public final String LIZIZ() {
        return "live_ad";
    }

    @Override // X.AK0
    public final String LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.AK0
    public final String getAid() {
        return this.LIZIZ;
    }

    @Override // X.AK0
    public final String getCid() {
        return this.LJ;
    }

    @Override // X.AK0
    public final Context getContext() {
        return this.LIZ;
    }

    @Override // X.AK0
    public final String getLogExtra() {
        return this.LJFF;
    }

    @Override // X.AK0
    public final String getRoomId() {
        return this.LIZJ;
    }

    public NFS(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, String str) {
        String str2;
        String str3;
        String str4;
        this.LIZ = context;
        if (adLiveEnterRoomConfig != null) {
            str2 = adLiveEnterRoomConfig.aid;
        } else {
            str2 = null;
        }
        this.LIZIZ = str2;
        if (adLiveEnterRoomConfig != null) {
            str3 = adLiveEnterRoomConfig.roomId;
        } else {
            str3 = null;
        }
        this.LIZJ = str3;
        this.LIZLLL = str;
        if (adLiveEnterRoomConfig != null) {
            str4 = adLiveEnterRoomConfig.creativeId;
        } else {
            str4 = null;
        }
        this.LJ = str4;
        this.LJFF = adLiveEnterRoomConfig != null ? adLiveEnterRoomConfig.logExtra : null;
    }
}
