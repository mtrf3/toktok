package X;

import android.util.DisplayMetrics;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.level.BarrageEnterRoomResConfig;
import com.bytedance.android.livesdk.livesetting.level.BarrageGradeResConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubSettings;
import com.bytedance.android.livesdk.livesetting.level.LevelSystemResourceConfig;
import com.bytedance.android.livesdk.livesetting.level.LiveLevelSystemResourceSetting;
import com.bytedance.android.livesdk.livesetting.level.TtliveBarrageDependGeckoResourceSwitchSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdk.livesetting.slot.LiveSubscribeAnimationSwitchSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BarrageTypeFansLevelParam;
import com.bytedance.android.livesdk.model.message.BarrageTypeUserGradeParam;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import defpackage.i0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CF1 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(CF2.LJLIL);
    public static final boolean LIZIZ = TtliveBarrageDependGeckoResourceSwitchSetting.INSTANCE.getValue();
    public static final boolean LIZJ = LiveSubscribeAnimationSwitchSetting.INSTANCE.getValue();

    public static boolean LIZ(BarrageMessage barrageMessage) {
        String str;
        o.LJIIIZ(barrageMessage, "barrageMessage");
        Integer valueOf = Integer.valueOf(LIZLLL(barrageMessage));
        if (valueOf.intValue() <= -1) {
            return false;
        }
        BarrageGradeResConfig LJII = LJII(valueOf.intValue(), barrageMessage.msgType);
        IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
        if (iHostResource == null) {
            return false;
        }
        if (LJII == null || (str = LJII.barrageChannel) == null) {
            str = "";
        }
        return iHostResource.Br0(str);
    }

    public static boolean LIZIZ(BarrageMessage barrageMessage) {
        o.LJIIIZ(barrageMessage, "barrageMessage");
        int i = barrageMessage.msgType;
        if (i != 10 && i != 11) {
            return false;
        }
        return true;
    }

    public static BarrageEnterRoomResConfig LIZJ(int i) {
        boolean z;
        int i2;
        List<BarrageEnterRoomResConfig> list;
        int i3;
        if (((Number) C29811Bmx.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        BarrageEnterRoomResConfig barrageEnterRoomResConfig = null;
        if (z) {
            LevelSystemResourceConfig levelSystemResConfig = LiveLevelSystemResourceSetting.INSTANCE.getLevelSystemResConfig();
            if (levelSystemResConfig == null || (list = levelSystemResConfig.levelBarrageEnterRoomConfigList) == null || !(!list.isEmpty())) {
                return null;
            }
            Iterator<BarrageEnterRoomResConfig> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BarrageEnterRoomResConfig next = it.next();
                BarrageEnterRoomResConfig barrageEnterRoomResConfig2 = next;
                if (barrageEnterRoomResConfig2 != null) {
                    i3 = barrageEnterRoomResConfig2.level;
                } else {
                    i3 = 0;
                }
                if (i <= i3) {
                    barrageEnterRoomResConfig = next;
                    break;
                }
            }
            return barrageEnterRoomResConfig;
        }
        List<BarrageEnterRoomResConfig> list2 = UserLevelSettings.INSTANCE.getUserLevelConfig().barrageEnterRoomConfigList;
        if (list2 == null || !(!list2.isEmpty())) {
            return null;
        }
        Iterator<BarrageEnterRoomResConfig> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            BarrageEnterRoomResConfig next2 = it2.next();
            BarrageEnterRoomResConfig barrageEnterRoomResConfig3 = next2;
            if (barrageEnterRoomResConfig3 != null) {
                i2 = barrageEnterRoomResConfig3.level;
            } else {
                i2 = 0;
            }
            if (i <= i2) {
                barrageEnterRoomResConfig = next2;
                break;
            }
        }
        return barrageEnterRoomResConfig;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int LIZLLL(BarrageMessage barrageMessage) {
        if (barrageMessage != null) {
            switch (barrageMessage.msgType) {
                case 8:
                case 9:
                    BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
                    if (barrageTypeUserGradeParam != null) {
                        return barrageTypeUserGradeParam.currentGrade;
                    }
                    break;
                case 10:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    BarrageTypeFansLevelParam barrageTypeFansLevelParam = barrageMessage.fansLevelParam;
                    if (barrageTypeFansLevelParam != null) {
                        return barrageTypeFansLevelParam.currentGrade;
                    }
                    break;
            }
        }
        return -1;
    }

    public static User LJ(BarrageMessage barrageMessage) {
        switch (barrageMessage.msgType) {
            case 8:
            case 9:
                BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
                if (barrageTypeUserGradeParam == null) {
                    return null;
                }
                return barrageTypeUserGradeParam.user;
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                BarrageTypeFansLevelParam barrageTypeFansLevelParam = barrageMessage.fansLevelParam;
                if (barrageTypeFansLevelParam == null) {
                    return null;
                }
                return barrageTypeFansLevelParam.user;
            default:
                return null;
        }
    }

    public static String LJFF(BarrageMessage barrageMessage) {
        User user;
        String LIZIZ2;
        String str;
        if (barrageMessage == null) {
            return "";
        }
        switch (barrageMessage.msgType) {
            case 8:
            case 9:
                BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
                if (barrageTypeUserGradeParam == null || (str = barrageTypeUserGradeParam.userId) == null) {
                    return "";
                }
                return str;
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                BarrageTypeFansLevelParam barrageTypeFansLevelParam = barrageMessage.fansLevelParam;
                if (barrageTypeFansLevelParam == null || (user = barrageTypeFansLevelParam.user) == null || (LIZIZ2 = C278817o.LIZIZ(user)) == null) {
                    return "";
                }
                return LIZIZ2;
            default:
                return "";
        }
    }

    public static BarrageEnterRoomResConfig LJI(int i) {
        boolean z;
        int i2;
        List<BarrageEnterRoomResConfig> list;
        int i3;
        if (((Number) C29811Bmx.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        BarrageEnterRoomResConfig barrageEnterRoomResConfig = null;
        if (z) {
            LevelSystemResourceConfig levelSystemResConfig = LiveLevelSystemResourceSetting.INSTANCE.getLevelSystemResConfig();
            if (levelSystemResConfig == null || (list = levelSystemResConfig.fansBarrageEnterRoomConfigList) == null || !(!list.isEmpty())) {
                return null;
            }
            Iterator<BarrageEnterRoomResConfig> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BarrageEnterRoomResConfig next = it.next();
                BarrageEnterRoomResConfig barrageEnterRoomResConfig2 = next;
                if (barrageEnterRoomResConfig2 != null) {
                    i3 = barrageEnterRoomResConfig2.level;
                } else {
                    i3 = 0;
                }
                if (i <= i3) {
                    barrageEnterRoomResConfig = next;
                    break;
                }
            }
            return barrageEnterRoomResConfig;
        }
        List<BarrageEnterRoomResConfig> list2 = FansClubSettings.INSTANCE.getFansClubConfig().barrageEnterRoomConfigList;
        if (list2 == null || !(!list2.isEmpty())) {
            return null;
        }
        Iterator<BarrageEnterRoomResConfig> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            BarrageEnterRoomResConfig next2 = it2.next();
            BarrageEnterRoomResConfig barrageEnterRoomResConfig3 = next2;
            if (barrageEnterRoomResConfig3 != null) {
                i2 = barrageEnterRoomResConfig3.level;
            } else {
                i2 = 0;
            }
            if (i <= i2) {
                barrageEnterRoomResConfig = next2;
                break;
            }
        }
        return barrageEnterRoomResConfig;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0006 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIIZZ(com.bytedance.android.livesdk.model.message.BarrageMessage r2) {
        /*
            int r0 = r2.msgType
            r1 = 1
            switch(r0) {
                case 8: goto L8;
                case 9: goto L8;
                case 10: goto Ld;
                case 11: goto Ld;
                default: goto L6;
            }
        L6:
            r1 = 0
        L7:
            return r1
        L8:
            com.bytedance.android.livesdk.model.message.BarrageTypeUserGradeParam r0 = r2.userGradeParam
            if (r0 == 0) goto L6
            goto L7
        Ld:
            com.bytedance.android.livesdk.model.message.BarrageTypeFansLevelParam r0 = r2.fansLevelParam
            if (r0 == 0) goto L12
        L11:
            return r1
        L12:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CF1.LJIIIIZZ(com.bytedance.android.livesdk.model.message.BarrageMessage):boolean");
    }

    public static boolean LJIIIZ(BarrageMessage barrageMessage) {
        int i = barrageMessage.msgType;
        if (i == 8 || i == 9 || LIZIZ(barrageMessage)) {
            return true;
        }
        return false;
    }

    public static String LJIIJ(String noSuffixFileName) {
        float f;
        o.LJIIIZ(noSuffixFileName, "noSuffixFileName");
        DisplayMetrics displayMetrics = (DisplayMetrics) LIZ.getValue();
        if (displayMetrics != null) {
            f = displayMetrics.density;
            if (f >= 2.7f) {
                return i0.LJFF(noSuffixFileName, "@3x.png");
            }
        } else {
            f = 0.0f;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("selectGeckoImage density:");
        LIZ2.append(f);
        C0NB.LJIIIZ("GradeBarrageUtils", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(noSuffixFileName);
        LIZ3.append("@2x.png");
        return X1D.LIZIZ(LIZ3);
    }

    public static boolean LJIIJJI(BarrageMessage barrageMessage) {
        if (barrageMessage == null || barrageMessage.msgType != 4 || barrageMessage.displayConfig <= 0) {
            return false;
        }
        return true;
    }

    public static BarrageGradeResConfig LJII(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        List<BarrageGradeResConfig> list;
        int i5;
        List<BarrageGradeResConfig> list2;
        int i6;
        if (((Number) C29811Bmx.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        BarrageGradeResConfig barrageGradeResConfig = null;
        if (z) {
            if (i2 == 10) {
                LevelSystemResourceConfig levelSystemResConfig = LiveLevelSystemResourceSetting.INSTANCE.getLevelSystemResConfig();
                if (levelSystemResConfig == null || (list2 = levelSystemResConfig.fansBarrageResConfigList) == null || !(!list2.isEmpty())) {
                    return null;
                }
                Iterator<BarrageGradeResConfig> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BarrageGradeResConfig next = it.next();
                    BarrageGradeResConfig barrageGradeResConfig2 = next;
                    if (barrageGradeResConfig2 != null) {
                        i6 = barrageGradeResConfig2.level;
                    } else {
                        i6 = 0;
                    }
                    if (i <= i6) {
                        barrageGradeResConfig = next;
                        break;
                    }
                }
                return barrageGradeResConfig;
            }
            LevelSystemResourceConfig levelSystemResConfig2 = LiveLevelSystemResourceSetting.INSTANCE.getLevelSystemResConfig();
            if (levelSystemResConfig2 == null || (list = levelSystemResConfig2.levelBarrageResConfigList) == null || !(!list.isEmpty())) {
                return null;
            }
            Iterator<BarrageGradeResConfig> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BarrageGradeResConfig next2 = it2.next();
                BarrageGradeResConfig barrageGradeResConfig3 = next2;
                if (barrageGradeResConfig3 != null) {
                    i5 = barrageGradeResConfig3.level;
                } else {
                    i5 = 0;
                }
                if (i <= i5) {
                    barrageGradeResConfig = next2;
                    break;
                }
            }
            return barrageGradeResConfig;
        }
        if (i2 == 10) {
            List<BarrageGradeResConfig> list3 = FansClubSettings.INSTANCE.getFansClubConfig().barrageResConfigList;
            if (list3 == null || !(!list3.isEmpty())) {
                return null;
            }
            Iterator<BarrageGradeResConfig> it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                BarrageGradeResConfig next3 = it3.next();
                BarrageGradeResConfig barrageGradeResConfig4 = next3;
                if (barrageGradeResConfig4 != null) {
                    i4 = barrageGradeResConfig4.level;
                } else {
                    i4 = 0;
                }
                if (i <= i4) {
                    barrageGradeResConfig = next3;
                    break;
                }
            }
            return barrageGradeResConfig;
        }
        List<BarrageGradeResConfig> list4 = UserLevelSettings.INSTANCE.getUserLevelConfig().barrageResConfigList;
        if (list4 == null || !(!list4.isEmpty())) {
            return null;
        }
        Iterator<BarrageGradeResConfig> it4 = list4.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            BarrageGradeResConfig next4 = it4.next();
            BarrageGradeResConfig barrageGradeResConfig5 = next4;
            if (barrageGradeResConfig5 != null) {
                i3 = barrageGradeResConfig5.level;
            } else {
                i3 = 0;
            }
            if (i <= i3) {
                barrageGradeResConfig = next4;
                break;
            }
        }
        return barrageGradeResConfig;
    }
}
