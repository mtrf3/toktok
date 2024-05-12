package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BTj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28835BTj implements C4RH {
    public static final C28835BTj LIZ = new C28835BTj();
    public static final LruCache<Long, C28837BTl> LIZIZ = new LruCache<>(5);

    public static final C28837BTl LIZJ(String str) {
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        Room room = null;
        if (c28246B6s != null) {
            room = c28246B6s.LIZIZ;
        }
        C28837BTl c28837BTl = new C28837BTl();
        if (room != null) {
            c28837BTl.LJII = room.getOwnerUserId();
            c28837BTl.LJI = room.getId();
            C28837BTl c28837BTl2 = LIZIZ.get(Long.valueOf(room.getId()));
            if (c28837BTl2 != null) {
                String str2 = c28837BTl2.LIZ;
                c28837BTl.LIZ = str2;
                if (str2.equals("1")) {
                    c28837BTl.LIZIZ = c28837BTl2.LIZIZ;
                    c28837BTl.LIZJ = c28837BTl2.LIZJ;
                    c28837BTl.LIZLLL = c28837BTl2.LIZLLL;
                    c28837BTl.LJIIIIZZ = c28837BTl2.LJIIIIZZ;
                    c28837BTl.LJIIIZ = c28837BTl2.LJIIIZ;
                }
            }
        }
        c28837BTl.LJ = C28594BKc.LIZJ().LIZ();
        c28837BTl.LJFF = C28594BKc.LIZJ().LIZIZ();
        LJIIIZ(c28837BTl, C28655BMl.LIZ(B4T.LIZ(), Long.valueOf(B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.roomId), false, 2));
        c28837BTl.LJIIJ = str;
        return c28837BTl;
    }

    public static final boolean LIZLLL(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCT.class)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final boolean LJ(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig == null) {
            return false;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (roomsData.enterFromAd) {
            return true;
        }
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = roomsData.adLiveEnterRoomConfig;
        if (adLiveEnterRoomConfig == null || !o.LJ(adLiveEnterRoomConfig.isPseudoAd, "1")) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(DataChannel dataChannel) {
        if (dataChannel == null) {
            return false;
        }
        if (o.LJ(dataChannel.kv0(BCT.class), Boolean.TRUE)) {
            return true;
        }
        AdLiveEnterRoomConfig LJII = LJII(dataChannel);
        if (LJII == null || !o.LJ(LJII.isPseudoAd, "1")) {
            return false;
        }
        return true;
    }

    public static final HashMap<String, String> LJI(C28837BTl c28837BTl) {
        C39685Fhp c39685Fhp = new C39685Fhp();
        c39685Fhp.LIZJ("is_ad", c28837BTl.LIZ);
        c39685Fhp.LIZJ("creative_id", c28837BTl.LIZIZ);
        c39685Fhp.LIZJ("log_extra", c28837BTl.LIZJ);
        c39685Fhp.LIZJ("feed_id", c28837BTl.LIZLLL);
        c39685Fhp.LIZJ("enter_from_merge", c28837BTl.LJ);
        c39685Fhp.LIZJ("enter_method", c28837BTl.LJFF);
        c39685Fhp.LIZJ("room_id", String.valueOf(c28837BTl.LJI));
        c39685Fhp.LIZJ("anchor_id", String.valueOf(c28837BTl.LJII));
        c39685Fhp.LIZJ("ad_id", c28837BTl.LJIIIIZZ);
        c39685Fhp.LIZJ("adv_id", c28837BTl.LJIIIZ);
        c39685Fhp.LIZJ("label", c28837BTl.LJIIJ);
        c39685Fhp.LIZJ("tag", "live_ad");
        HashMap<String, String> hashMap = (HashMap) c39685Fhp.LJLILLLLZI;
        o.LJIIIIZZ(hashMap, "GenerateApiMap()\n       …Log.TAG)\n            .map");
        return hashMap;
    }

    public static final AdLiveEnterRoomConfig LJII(DataChannel dataChannel) {
        if (dataChannel == null) {
            return null;
        }
        return (AdLiveEnterRoomConfig) dataChannel.kv0(BDC.class);
    }

    public static final C28837BTl LJIIIIZZ(EnterRoomConfig enterRoomConfig) {
        long j;
        String str;
        o.LJIIIZ(enterRoomConfig, "enterRoomConfig");
        C28837BTl c28837BTl = new C28837BTl();
        if (!TextUtils.isEmpty(enterRoomConfig.mLogData.anchorId)) {
            try {
                String str2 = enterRoomConfig.mLogData.anchorId;
                if (str2 != null) {
                    j = CastLongProtector.parseLong(str2);
                } else {
                    j = 0;
                }
                c28837BTl.LJII = j;
            } catch (Exception e) {
                C0NB.LJI("live_ad", e);
            }
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = roomsData.adLiveEnterRoomConfig;
        c28837BTl.LJI = roomsData.roomId;
        c28837BTl.LJ = roomsData.enterFromMerge;
        c28837BTl.LJFF = roomsData.enterMethod;
        LJIIIZ(c28837BTl, C28655BMl.LIZ(B4T.LIZ(), Long.valueOf(enterRoomConfig.mRoomsData.roomId), false, 2));
        if (adLiveEnterRoomConfig != null) {
            c28837BTl.LIZLLL = adLiveEnterRoomConfig.aid;
            c28837BTl.LJIIIIZZ = adLiveEnterRoomConfig.adId;
            c28837BTl.LJIIIZ = adLiveEnterRoomConfig.advId;
            c28837BTl.LIZIZ = adLiveEnterRoomConfig.creativeId;
            c28837BTl.LIZJ = adLiveEnterRoomConfig.logExtra;
        }
        if (enterRoomConfig.mRoomsData.enterFromAd) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c28837BTl.LIZ = str;
        return c28837BTl;
    }

    public static void LJIIIZ(C28837BTl c28837BTl, String str) {
        if (!TextUtils.isEmpty(str)) {
            c28837BTl.LJFF = i0.LJFF("commerce_flow_banner-", str);
        }
    }

    public static final C28837BTl LIZIZ(Room room, DataChannel dataChannel, String str) {
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C28837BTl c28837BTl = new C28837BTl();
        AdLiveEnterRoomConfig LJII = LJII(dataChannel);
        if (LIZLLL(dataChannel) && LJII != null) {
            z = true;
            str2 = "1";
        } else {
            z = false;
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c28837BTl.LIZ = str2;
        if (z) {
            String str7 = null;
            if (LJII != null) {
                str3 = LJII.creativeId;
            } else {
                str3 = null;
            }
            c28837BTl.LIZIZ = str3;
            if (LJII != null) {
                str4 = LJII.logExtra;
            } else {
                str4 = null;
            }
            c28837BTl.LIZJ = str4;
            if (LJII != null) {
                str5 = LJII.aid;
            } else {
                str5 = null;
            }
            c28837BTl.LIZLLL = str5;
            if (LJII != null) {
                str6 = LJII.adId;
            } else {
                str6 = null;
            }
            c28837BTl.LJIIIIZZ = str6;
            if (LJII != null) {
                str7 = LJII.advId;
            }
            c28837BTl.LJIIIZ = str7;
        }
        if (room != null || (room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class)) != null) {
            c28837BTl.LJII = room.getOwnerUserId();
            c28837BTl.LJI = room.getId();
        }
        c28837BTl.LJ = C28594BKc.LIZJ().LIZ();
        c28837BTl.LJFF = C28594BKc.LIZJ().LIZIZ();
        LJIIIZ(c28837BTl, C28655BMl.LIZ(B4T.LIZ(), Long.valueOf(B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.roomId), false, 2));
        if (str != null) {
            c28837BTl.LJIIJ = str;
        }
        return c28837BTl;
    }

    public static final void LIZ(String str, String str2, java.util.Map<String, ? extends Object> map, java.util.Map<String, ? extends Object> map2) {
        ((IAdLiveHelperService) CN1.LIZ(IAdLiveHelperService.class)).ik(str, str2, map, map2);
    }
}
