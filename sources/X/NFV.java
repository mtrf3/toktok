package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.utils.GsonHolder;

/* loaded from: classes11.dex */
public final class NFV implements InterfaceC59967NgB {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final /* synthetic */ AdLiveEnterRoomConfig LJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJII;

    @Override // X.InterfaceC59967NgB
    public final InterfaceC42995Gu7 LIZ() {
        return new NFW(this.LJII);
    }

    @Override // X.InterfaceC59967NgB
    public final AdDislikeInfo LIZJ() {
        Object LIZ;
        String str;
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = this.LJI;
        Object obj = null;
        try {
            Gson LIZ2 = GsonHolder.LIZLLL().LIZ();
            if (adLiveEnterRoomConfig != null) {
                str = adLiveEnterRoomConfig.dislikeInfo;
            } else {
                str = null;
            }
            LIZ = (AdDislikeInfo) LIZ2.LJI(str, AdDislikeInfo.class);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (AdDislikeInfo) obj;
    }

    @Override // X.InterfaceC59966NgA
    public final Context LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC59966NgA
    public final String LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC59966NgA
    public final String LJIJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC59966NgA
    public final String getAid() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC59966NgA
    public final String getLogExtra() {
        return this.LJFF;
    }

    @Override // X.InterfaceC59966NgA
    public final String getRoomId() {
        return this.LIZLLL;
    }

    public NFV(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        String str2;
        String str3;
        String str4;
        this.LJI = adLiveEnterRoomConfig;
        this.LJII = interfaceC65784Pro;
        this.LIZ = context;
        if (adLiveEnterRoomConfig != null) {
            str = adLiveEnterRoomConfig.aid;
        } else {
            str = null;
        }
        this.LIZIZ = str;
        if (adLiveEnterRoomConfig != null) {
            str2 = adLiveEnterRoomConfig.adId;
        } else {
            str2 = null;
        }
        this.LIZJ = str2;
        if (adLiveEnterRoomConfig != null) {
            str3 = adLiveEnterRoomConfig.roomId;
        } else {
            str3 = null;
        }
        this.LIZLLL = String.valueOf(str3);
        if (adLiveEnterRoomConfig != null) {
            str4 = adLiveEnterRoomConfig.creativeId;
        } else {
            str4 = null;
        }
        this.LJ = str4;
        this.LJFF = adLiveEnterRoomConfig != null ? adLiveEnterRoomConfig.logExtra : null;
    }
}
