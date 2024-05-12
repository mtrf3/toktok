package X;

import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRepetitionTtlSetting;
import com.bytedance.android.livesdk.model.LiveRepetitionTtlConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BMy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28668BMy {
    public static int LIZJ;
    public static String LIZLLL;
    public static C28669BMz LJ;
    public static boolean LJFF;
    public static final HashMap<Long, Long> LIZ = new HashMap<>();
    public static final HashMap<Long, Long> LIZIZ = new HashMap<>();
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C28664BMu.LJLIL);

    public static final void LJ() {
        int i;
        int i2;
        LiveRepetitionTtlSetting liveRepetitionTtlSetting = LiveRepetitionTtlSetting.INSTANCE;
        if (liveRepetitionTtlSetting.getValue().enableLivePetitionShow <= 0) {
            return;
        }
        String enterMethod = BM1.LJIILLIIL;
        String enterFromMerge = BM1.LJIILL;
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFromMerge, "enterFromMerge");
        if (liveRepetitionTtlSetting.getValue().enableLivePetitionShow <= 0 || (i = LIZJ) == 5 || i == 6) {
            return;
        }
        if (o.LJ("homepage_hot", enterFromMerge) && o.LJ("video_head", enterMethod)) {
            i2 = 2;
        } else if (o.LJ("homepage_hot", enterFromMerge) && o.LJ("live_cell", enterMethod)) {
            i2 = 1;
        } else if (o.LJ("live_merge", enterFromMerge) && o.LJ("live_cover", enterMethod)) {
            i2 = 3;
        } else if (o.LJ("live_end", enterFromMerge) && o.LJ("live_cover", enterMethod)) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        LIZJ = i2;
    }

    public static final boolean LIZ(EnterRoomConfig config) {
        o.LJIIIZ(config, "config");
        EnterRoomConfig.RoomsData roomsData = config.mRoomsData;
        String str = roomsData.enterFromMerge;
        String str2 = roomsData.enterMethod;
        boolean z = config.drawParams.openLiveFromDrawer;
        if (((java.util.Set) LJI.getValue()).contains(C00F.LIZIZ(str, '_', str2)) || z) {
            return true;
        }
        return false;
    }

    public static final void LIZLLL(Room room) {
        String str;
        String str2;
        String l;
        LiveRepetitionTtlSetting liveRepetitionTtlSetting = LiveRepetitionTtlSetting.INSTANCE;
        if (liveRepetitionTtlSetting.getValue().enableLivePetitionShow > 0 && room != null) {
            Long valueOf = Long.valueOf(room.getOwnerUserId());
            Long valueOf2 = Long.valueOf(room.getId());
            if (liveRepetitionTtlSetting.getValue().enableLivePetitionShow <= 0) {
                return;
            }
            int i = LIZJ;
            if (i != 5) {
                if (i != 6) {
                    str = null;
                } else {
                    str = "drawer_single";
                }
            } else {
                str = "drawer_double";
            }
            LIZLLL = str;
            if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_dup_live_delete")) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_dup_live_delete");
            String str3 = "";
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "";
            }
            LIZ2.LJIJJ(str2, "del_anchor_id");
            if (valueOf2 != null && (l = valueOf2.toString()) != null) {
                str3 = l;
            }
            LIZ2.LJIJJ(str3, "del_room_id");
            C1FL.LJI(LIZ2, LIZLLL, "drawer_mode");
        }
    }

    public static final void LJFF(int i) {
        if (LiveRepetitionTtlSetting.INSTANCE.getValue().enableLivePetitionShow <= 0) {
            return;
        }
        LIZJ = i;
    }

    public static final void LJI(C28669BMz c28669BMz) {
        long j;
        LJFF = true;
        long j2 = c28669BMz.LIZ;
        c28669BMz.LIZJ = j2;
        C28669BMz c28669BMz2 = LJ;
        if (c28669BMz2 != null) {
            j = c28669BMz2.LIZJ;
        } else {
            j = -1;
        }
        if (j > j2) {
            c28669BMz.LIZJ = j;
        }
        LJ = c28669BMz;
    }

    public static final boolean LIZIZ(int i, Room room) {
        long j;
        Long l;
        long j2;
        long j3;
        o.LJIIIZ(room, "room");
        long id = room.getId();
        long currentTimeMillis = System.currentTimeMillis();
        LiveRepetitionTtlSetting liveRepetitionTtlSetting = LiveRepetitionTtlSetting.INSTANCE;
        if (liveRepetitionTtlSetting.getValue().enableLivePetitionShow <= 0 || id <= 0) {
            return false;
        }
        Long valueOf = Long.valueOf(id);
        if (i == 2) {
            HashMap<Long, Long> hashMap = LIZIZ;
            if (valueOf != null) {
                j3 = valueOf.longValue();
            } else {
                j3 = 0;
            }
            l = hashMap.get(Long.valueOf(j3));
        } else {
            HashMap<Long, Long> hashMap2 = LIZ;
            if (valueOf != null) {
                j = valueOf.longValue();
            } else {
                j = 0;
            }
            l = hashMap2.get(Long.valueOf(j));
        }
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 0) {
                switch (LIZJ) {
                    case 1:
                        long j4 = liveRepetitionTtlSetting.getValue().foruCardTtl;
                        LiveRepetitionTtlConfig value = liveRepetitionTtlSetting.getValue();
                        if (j4 > 0) {
                            j2 = value.foruCardTtl;
                            break;
                        } else {
                            j2 = value.defaultTtl;
                            break;
                        }
                    case 2:
                        long j5 = liveRepetitionTtlSetting.getValue().foruHeadTtl;
                        LiveRepetitionTtlConfig value2 = liveRepetitionTtlSetting.getValue();
                        if (j5 > 0) {
                            j2 = value2.foruHeadTtl;
                            break;
                        } else {
                            j2 = value2.defaultTtl;
                            break;
                        }
                    case 3:
                        long j6 = liveRepetitionTtlSetting.getValue().liveSquareTtl;
                        LiveRepetitionTtlConfig value3 = liveRepetitionTtlSetting.getValue();
                        if (j6 > 0) {
                            j2 = value3.liveSquareTtl;
                            break;
                        } else {
                            j2 = value3.defaultTtl;
                            break;
                        }
                    case 4:
                        long j7 = liveRepetitionTtlSetting.getValue().closePage;
                        LiveRepetitionTtlConfig value4 = liveRepetitionTtlSetting.getValue();
                        if (j7 > 0) {
                            j2 = value4.closePage;
                            break;
                        } else {
                            j2 = value4.defaultTtl;
                            break;
                        }
                    case 5:
                        long j8 = liveRepetitionTtlSetting.getValue().drawerTwoTtl;
                        LiveRepetitionTtlConfig value5 = liveRepetitionTtlSetting.getValue();
                        if (j8 > 0) {
                            j2 = value5.drawerTwoTtl;
                            break;
                        } else {
                            j2 = value5.defaultTtl;
                            break;
                        }
                    case 6:
                        long j9 = liveRepetitionTtlSetting.getValue().drawerOneTtl;
                        LiveRepetitionTtlConfig value6 = liveRepetitionTtlSetting.getValue();
                        if (j9 > 0) {
                            j2 = value6.drawerOneTtl;
                            break;
                        } else {
                            j2 = value6.defaultTtl;
                            break;
                        }
                    default:
                        j2 = -1;
                        break;
                }
                long j10 = j2 * 1000;
                if (j10 > 0 && currentTimeMillis - longValue <= j10) {
                    return true;
                }
                LIZJ(i, id, currentTimeMillis);
                return false;
            }
        }
        LIZJ(i, id, currentTimeMillis);
        return false;
    }

    public static final void LIZJ(int i, long j, long j2) {
        if (LiveRepetitionTtlSetting.INSTANCE.getValue().enableLivePetitionShow > 0 && j > 0) {
            if (i == 2) {
                LIZIZ.put(Long.valueOf(j), Long.valueOf(j2));
            } else {
                LIZ.put(Long.valueOf(j), Long.valueOf(j2));
            }
        }
    }
}
