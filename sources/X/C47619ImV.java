package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.ImV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47619ImV implements InterfaceC46858IaE {
    public final WeakReference<TTVideoEngineImpl> LIZ;

    public final java.util.Map<String, Long> LIZ() {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("vds", Long.valueOf(interfaceC47775Ip1.getLongOption(45, 0L)));
        hashMap.put("vps", Long.valueOf(interfaceC47775Ip1.getLongOption(46, 0L)));
        hashMap.put("download_speed", Long.valueOf(interfaceC47775Ip1.getLongOption(63, -1L)));
        hashMap.put("vlen", Long.valueOf(interfaceC47775Ip1.getLongOption(72, -1L)));
        hashMap.put("alen", Long.valueOf(interfaceC47775Ip1.getLongOption(73, -1L)));
        hashMap.put("vDecLen", Long.valueOf(interfaceC47775Ip1.getLongOption(602, -1L)));
        hashMap.put("aDecLen", Long.valueOf(interfaceC47775Ip1.getLongOption(603, -1L)));
        hashMap.put("vBaseLen", Long.valueOf(interfaceC47775Ip1.getLongOption(604, -1L)));
        hashMap.put("aBaseLen", Long.valueOf(interfaceC47775Ip1.getLongOption(605, -1L)));
        hashMap.put("avGap", Long.valueOf(interfaceC47775Ip1.getLongOption(606, -1L)));
        hashMap.put("single_vds", Long.valueOf(interfaceC47775Ip1.getLongOption(145, 0L)));
        hashMap.put("accu_vds", Long.valueOf(interfaceC47775Ip1.getLongOption(476, 0L)));
        return hashMap;
    }

    public final String LJFF() {
        int i;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl != null) {
            if (tTVideoEngineImpl.LIZ(160, tTVideoEngineImpl.A0) == 0) {
                i = tTVideoEngineImpl.LIZ(160, tTVideoEngineImpl.A0);
            } else {
                return C47148Ieu.LIZ.LJJIIZI(tTVideoEngineImpl.Z4);
            }
        } else {
            i = 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("videoEngine is:");
        LIZ.append(tTVideoEngineImpl);
        LIZ.append(", dataloader enable:");
        LIZ.append(i);
        C78253UnR.LIZLLL("TTVideoEngine", X1D.LIZIZ(LIZ));
        return null;
    }

    public C47619ImV(TTVideoEngineImpl tTVideoEngineImpl) {
        this.LIZ = new WeakReference<>(tTVideoEngineImpl);
    }

    public final float LIZIZ(int i) {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return -1.0f;
        }
        if (i != 82) {
            if (i != 83) {
                return -1.0f;
            }
            return interfaceC47775Ip1.getFloatOption(150, -1.0f);
        }
        return interfaceC47775Ip1.getFloatOption(151, -1.0f);
    }

    public final int LIZJ(int i) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null) {
            return -1;
        }
        switch (i) {
            case 21:
                return tTVideoEngineImpl.LJIIL;
            case 22:
                return tTVideoEngineImpl.LJIILIIL;
            case 23:
                return tTVideoEngineImpl.LJIIJJI;
            case 24:
                InterfaceC47775Ip1 interfaceC47775Ip1 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip1 == null) {
                    return -1;
                }
                if (tTVideoEngineImpl.LJJLIL < 0) {
                    tTVideoEngineImpl.LJJLIL = interfaceC47775Ip1.LJIIJJI(157, -1);
                }
                return tTVideoEngineImpl.LJJLIL;
            case 25:
                InterfaceC47775Ip1 interfaceC47775Ip12 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip12 == null) {
                    return -1;
                }
                if (tTVideoEngineImpl.LJJLJ < 0) {
                    tTVideoEngineImpl.LJJLJ = interfaceC47775Ip12.LJIIJJI(158, -1);
                }
                return tTVideoEngineImpl.LJJLJ;
            case 26:
                return (int) tTVideoEngineImpl.LLJJJIL();
            case 27:
                InterfaceC47775Ip1 interfaceC47775Ip13 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip13 == null) {
                    return -1;
                }
                if (interfaceC47775Ip13.isMute()) {
                    return 1;
                }
                return 0;
            case 30:
                return tTVideoEngineImpl.LLILIL;
            case 34:
                return tTVideoEngineImpl.LIZ(203, tTVideoEngineImpl.LLIZ);
            case 35:
                return tTVideoEngineImpl.LLLLLIL;
            case 36:
                return tTVideoEngineImpl.LIZ(198, tTVideoEngineImpl.H0);
            case 42:
                InterfaceC47775Ip1 interfaceC47775Ip14 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip14 == null) {
                    return -1;
                }
                return interfaceC47775Ip14.LJIIJJI(221, -1);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                InterfaceC47775Ip1 interfaceC47775Ip15 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip15 == null) {
                    return -1;
                }
                return interfaceC47775Ip15.LJIIJJI(222, -1);
            case 44:
                InterfaceC47775Ip1 interfaceC47775Ip16 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip16 == null) {
                    return -1;
                }
                return interfaceC47775Ip16.LJIIJJI(245, -1);
            case C61447O9r.LJIIJ:
                InterfaceC47775Ip1 interfaceC47775Ip17 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip17 == null) {
                    return -1;
                }
                return interfaceC47775Ip17.LJIIJJI(44, -1);
            case 61:
                InterfaceC47775Ip1 interfaceC47775Ip18 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip18 == null) {
                    return -1;
                }
                return interfaceC47775Ip18.LJIIJJI(53, -1);
            case 63:
                int i2 = tTVideoEngineImpl.B5;
                if (i2 != -1) {
                    return i2;
                }
                InterfaceC47775Ip1 interfaceC47775Ip19 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip19 != null) {
                    tTVideoEngineImpl.B5 = interfaceC47775Ip19.LJIIJJI(403, -1);
                }
                return tTVideoEngineImpl.B5;
            case 64:
                int i3 = tTVideoEngineImpl.A5;
                if (i3 != -1) {
                    return i3;
                }
                InterfaceC47775Ip1 interfaceC47775Ip110 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip110 != null) {
                    tTVideoEngineImpl.A5 = interfaceC47775Ip110.LJIIJJI(402, -1);
                }
                return tTVideoEngineImpl.A5;
            case 67:
                int i4 = tTVideoEngineImpl.y5;
                if (i4 > 0) {
                    return i4;
                }
                InterfaceC47775Ip1 interfaceC47775Ip111 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip111 == null) {
                    return -1;
                }
                return interfaceC47775Ip111.getCurrentPosition();
            case 69:
                InterfaceC47775Ip1 interfaceC47775Ip112 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip112 == null) {
                    return -1;
                }
                return interfaceC47775Ip112.LJIIJJI(601, -1);
            case 77:
                InterfaceC47775Ip1 interfaceC47775Ip113 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip113 == null) {
                    return -1;
                }
                return interfaceC47775Ip113.LJIIJJI(540, -1);
            case 79:
                InterfaceC47775Ip1 interfaceC47775Ip114 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip114 == null) {
                    return -1;
                }
                return interfaceC47775Ip114.LJIIJJI(826, -1);
            case 81:
                InterfaceC47775Ip1 interfaceC47775Ip115 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip115 == null) {
                    return -1;
                }
                return interfaceC47775Ip115.LJIIJJI(643, -1);
            case 84:
                InterfaceC47775Ip1 interfaceC47775Ip116 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip116 == null) {
                    return -1;
                }
                return interfaceC47775Ip116.LJIIJJI(186, -1);
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                return 0;
            case 87:
                if (tTVideoEngineImpl.LJIIIIZZ == null) {
                    return 1;
                }
                return 0;
            case 88:
                return tTVideoEngineImpl.LJJLIIIJL;
            case 89:
                C47634Imk c47634Imk = tTVideoEngineImpl.f;
                if (c47634Imk == null) {
                    return -1;
                }
                return c47634Imk.LIZIZ() ? 1 : 0;
            case 90:
                C47634Imk c47634Imk2 = tTVideoEngineImpl.f;
                if (c47634Imk2 == null) {
                    return -1;
                }
                return c47634Imk2.LIZJ() ? 1 : 0;
            case 97:
                InterfaceC47775Ip1 interfaceC47775Ip117 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip117 == null) {
                    return -1;
                }
                return interfaceC47775Ip117.LJIIJJI(181, -1);
            case 100:
                return tTVideoEngineImpl.G6;
            case 101:
                return tTVideoEngineImpl.LLJZIJLIL() ? 1 : 0;
            case 103:
                InterfaceC47775Ip1 interfaceC47775Ip118 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip118 == null) {
                    return -1;
                }
                return interfaceC47775Ip118.LJIIJJI(24, -1);
            case 109:
                DefaultABRModule defaultABRModule = tTVideoEngineImpl.E3;
                if (defaultABRModule == null) {
                    return -1;
                }
                return (int) defaultABRModule.getLongOption(53, -1L);
            case 113:
                int i5 = tTVideoEngineImpl.f2;
                tTVideoEngineImpl.f2 = 0;
                return i5;
            case 114:
                InterfaceC47775Ip1 interfaceC47775Ip119 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip119 == null) {
                    return -1;
                }
                return interfaceC47775Ip119.LJIIJJI(469, -1);
            case 121:
                return TTVideoEngine.LJIIJJI;
            case 122:
                return TTVideoEngine.LJIIL;
            case 142:
                InterfaceC47775Ip1 interfaceC47775Ip120 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip120 == null) {
                    return -1;
                }
                return interfaceC47775Ip120.LJIIJJI(754, -1);
            case 145:
                InterfaceC47775Ip1 interfaceC47775Ip121 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip121 == null) {
                    return 0;
                }
                return interfaceC47775Ip121.LJIIJJI(758, 0);
            case 147:
                InterfaceC47775Ip1 interfaceC47775Ip122 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip122 == null) {
                    return -1;
                }
                return interfaceC47775Ip122.LJIIJJI(1339, -1);
            case 148:
                return TTVideoEngine.LJIILL;
            case 154:
                InterfaceC47775Ip1 interfaceC47775Ip123 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip123 == null) {
                    return -1;
                }
                return interfaceC47775Ip123.LJIIJJI(1354, -1);
            case 155:
                InterfaceC47775Ip1 interfaceC47775Ip124 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip124 == null) {
                    return -1;
                }
                return interfaceC47775Ip124.LJIIJJI(959, -1);
            case 156:
                InterfaceC47775Ip1 interfaceC47775Ip125 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip125 == null) {
                    return -1;
                }
                return interfaceC47775Ip125.LJIIJJI(964, -1);
            case 157:
                InterfaceC47775Ip1 interfaceC47775Ip126 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip126 == null) {
                    return -1;
                }
                return interfaceC47775Ip126.LJIIJJI(965, -1);
            default:
                return -1;
        }
    }

    public final long LIZLLL(int i) {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || i == 95 || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return -1L;
        }
        if (i != 91) {
            if (i != 92) {
                if (i != 137) {
                    if (i != 138) {
                        if (i != 140) {
                            if (i != 141) {
                                int i2 = -1;
                                switch (i) {
                                    case 7:
                                        return interfaceC47775Ip1.getLongOption(68, -1L);
                                    case 10:
                                        return interfaceC47775Ip1.getLongOption(69, -1L);
                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                        return interfaceC47775Ip1.getLongOption(70, -1L);
                                    case 12:
                                        return interfaceC47775Ip1.getLongOption(75, -1L);
                                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                        return interfaceC47775Ip1.getLongOption(76, -1L);
                                    case 14:
                                        return interfaceC47775Ip1.getLongOption(77, -1L);
                                    case 15:
                                        return interfaceC47775Ip1.getLongOption(78, -1L);
                                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                        return interfaceC47775Ip1.getLongOption(156, -1L);
                                    case 17:
                                        return interfaceC47775Ip1.getLongOption(155, -1L);
                                    case 18:
                                        return interfaceC47775Ip1.getLongOption(163, -1L);
                                    case 19:
                                        return interfaceC47775Ip1.getLongOption(162, -1L);
                                    case 45:
                                        return interfaceC47775Ip1.getLongOption(152, -1L);
                                    case 66:
                                        return interfaceC47775Ip1.getLongOption(517, -1L);
                                    case 68:
                                        return interfaceC47775Ip1.getLongOption(72, -1L);
                                    case 75:
                                        return interfaceC47775Ip1.getLongOption(171, -1L);
                                    case 96:
                                        return interfaceC47775Ip1.getLongOption(526, -1L);
                                    case 112:
                                        return tTVideoEngineImpl.e2;
                                    case 144:
                                        if (tTVideoEngineImpl.LIZ(742, tTVideoEngineImpl.c2) != 0) {
                                            i2 = -2;
                                        }
                                        return interfaceC47775Ip1.getLongOption(757, i2);
                                    case 149:
                                        if (tTVideoEngineImpl.LIZ(742, tTVideoEngineImpl.c2) != 0) {
                                            i2 = -3;
                                        }
                                        return interfaceC47775Ip1.getLongOption(757, i2);
                                    case 150:
                                        return interfaceC47775Ip1.getLongOption(759, -1L);
                                    case 152:
                                        return interfaceC47775Ip1.getLongOption(1352, -1L);
                                    case 153:
                                        return interfaceC47775Ip1.getLongOption(1353, -1L);
                                    default:
                                        switch (i) {
                                            case 38:
                                                return interfaceC47775Ip1.getLongOption(307, -1L);
                                            case 39:
                                                return interfaceC47775Ip1.getLongOption(308, -1L);
                                            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                                                return tTVideoEngineImpl.LJJIZ;
                                            case 41:
                                                return tTVideoEngineImpl.T2;
                                            default:
                                                switch (i) {
                                                    case 51:
                                                        return interfaceC47775Ip1.getLongOption(267, -1L);
                                                    case 52:
                                                        return interfaceC47775Ip1.getLongOption(268, -1L);
                                                    case 53:
                                                        return interfaceC47775Ip1.getLongOption(269, -1L);
                                                    case 54:
                                                        return interfaceC47775Ip1.getLongOption(606, -1L);
                                                    default:
                                                        switch (i) {
                                                            case 56:
                                                                return interfaceC47775Ip1.getLongOption(45, -1L);
                                                            case 57:
                                                                return interfaceC47775Ip1.getLongOption(607, -1L);
                                                            case 58:
                                                                return interfaceC47775Ip1.getLongOption(608, -1L);
                                                            default:
                                                                switch (i) {
                                                                    case 70:
                                                                        return interfaceC47775Ip1.getLongOption(636, -1L);
                                                                    case 71:
                                                                        return interfaceC47775Ip1.getLongOption(637, -1L);
                                                                    case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                                                                        return interfaceC47775Ip1.getLongOption(638, -1L);
                                                                    case 73:
                                                                        return interfaceC47775Ip1.getLongOption(639, -1L);
                                                                    default:
                                                                        switch (i) {
                                                                            case 104:
                                                                                return interfaceC47775Ip1.getLongOption(73, -1L);
                                                                            case 105:
                                                                                return interfaceC47775Ip1.getLongOption(72, -1L);
                                                                            case 106:
                                                                                return interfaceC47775Ip1.getLongOption(579, tTVideoEngineImpl.m);
                                                                            case 107:
                                                                                return interfaceC47775Ip1.getLongOption(577, tTVideoEngineImpl.m);
                                                                            case 108:
                                                                                return interfaceC47775Ip1.getLongOption(578, tTVideoEngineImpl.m);
                                                                            default:
                                                                                switch (i) {
                                                                                    case 115:
                                                                                        return interfaceC47775Ip1.getLongOption(583, -1L);
                                                                                    case 116:
                                                                                        return interfaceC47775Ip1.getLongOption(588, -1L);
                                                                                    case 117:
                                                                                        return interfaceC47775Ip1.getLongOption(584, -1L);
                                                                                    case 118:
                                                                                        return interfaceC47775Ip1.getLongOption(589, -1L);
                                                                                    case 119:
                                                                                        return interfaceC47775Ip1.getLongOption(585, -1L);
                                                                                    case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                                                                                        return interfaceC47775Ip1.getLongOption(590, -1L);
                                                                                    default:
                                                                                        return -1L;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                            }
                            return interfaceC47775Ip1.getLongOption(753, -1L);
                        }
                        return interfaceC47775Ip1.getLongOption(752, -1L);
                    }
                    return interfaceC47775Ip1.getLongOption(856, -1L);
                }
                return interfaceC47775Ip1.getLongOption(1801, -1L);
            }
            return tTVideoEngineImpl.t;
        }
        return tTVideoEngineImpl.LJJLIIIJLJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.Ipj] */
    public final String LJ(int i) {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        String str;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        String str2 = "";
        if (tTVideoEngineImpl == null) {
            return "";
        }
        String str3 = "unknown_codec";
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        String str4 = null;
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 110) {
                                    if (i != 111) {
                                        switch (i) {
                                            case 29:
                                                return tTVideoEngineImpl.LLILL;
                                            case 37:
                                                return C47148Ieu.LIZ.LJJIJ(6);
                                            case 46:
                                                C47750Ioc c47750Ioc = tTVideoEngineImpl.e;
                                                if (c47750Ioc == null) {
                                                    return "";
                                                }
                                                return c47750Ioc.LJJLIIIJ;
                                            case 55:
                                                InterfaceC47775Ip1 interfaceC47775Ip12 = tTVideoEngineImpl.LJ;
                                                if (interfaceC47775Ip12 != null) {
                                                    return interfaceC47775Ip12.LIZIZ(609);
                                                }
                                            case 65:
                                                InterfaceC47775Ip1 interfaceC47775Ip13 = tTVideoEngineImpl.LJ;
                                                if (interfaceC47775Ip13 != null) {
                                                    return interfaceC47775Ip13.LIZIZ(516);
                                                }
                                            case 76:
                                                C47160If6 c47160If6 = tTVideoEngineImpl.u;
                                                if (c47160If6 == null) {
                                                    return "";
                                                }
                                                return c47160If6.LIZIZ(7);
                                            case 78:
                                                InterfaceC47775Ip1 interfaceC47775Ip14 = tTVideoEngineImpl.LJ;
                                                if (interfaceC47775Ip14 != null) {
                                                    return interfaceC47775Ip14.LIZIZ(825);
                                                }
                                            case 80:
                                                InterfaceC47775Ip1 interfaceC47775Ip15 = tTVideoEngineImpl.LJ;
                                                if (interfaceC47775Ip15 != null) {
                                                    return interfaceC47775Ip15.LIZIZ(824);
                                                }
                                            case 102:
                                                return tTVideoEngineImpl.w3;
                                            case 139:
                                                if (tTVideoEngineImpl.LIZ(1402, tTVideoEngineImpl.M7 ? 1 : 0) == 1) {
                                                    String str5 = tTVideoEngineImpl.LLLZZ;
                                                    String str6 = tTVideoEngineImpl.P7;
                                                    DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
                                                    if (TextUtils.isEmpty(str6)) {
                                                        str = str5;
                                                    } else {
                                                        str = str6;
                                                    }
                                                    dataLoaderHelper.getClass();
                                                    if (!TextUtils.isEmpty(str)) {
                                                        dataLoaderHelper.LJJ.LIZJ(1);
                                                        try {
                                                            try {
                                                                AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIZ;
                                                                if (aVMDLDataLoader != null) {
                                                                    str4 = aVMDLDataLoader.getStringValueByStr(str, 1012);
                                                                }
                                                            } catch (Exception e) {
                                                                TTVideoEngineLog.d(e);
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    StringBuilder LIZLLL = C06540Nm.LIZLLL("get preloadTraceId = ", str4, ", groupId = ", str6, ", videoID = ");
                                                    LIZLLL.append(str5);
                                                    LIZLLL.append(", engine = ");
                                                    LIZLLL.append(tTVideoEngineImpl);
                                                    C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZLLL));
                                                    if (!TextUtils.isEmpty(str4)) {
                                                        DataLoaderHelper dataLoaderHelper2 = C47148Ieu.LIZ;
                                                        dataLoaderHelper2.getClass();
                                                        if (!TextUtils.isEmpty(str5)) {
                                                            dataLoaderHelper2.LJJ.LIZJ(1);
                                                            try {
                                                                try {
                                                                    if (dataLoaderHelper2.LJIIIZ != null && dataLoaderHelper2.LIZJ == 0) {
                                                                        dataLoaderHelper2.LJIIIZ.resetPreloadTraceId(str5);
                                                                    }
                                                                } catch (Exception e2) {
                                                                    TTVideoEngineLog.d(e2);
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        StringBuilder LIZ = X1D.LIZ();
                                                        LIZ.append("reset preloadTraceId = ");
                                                        LIZ.append(str4);
                                                        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
                                                    }
                                                }
                                                return str4;
                                            case 143:
                                                if (tTVideoEngineImpl.LIZ(1215, tTVideoEngineImpl.t6) != 1 || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
                                                    return "";
                                                }
                                                return interfaceC47775Ip1.LIZIZ(755);
                                            case 146:
                                                InterfaceC47775Ip1 interfaceC47775Ip16 = tTVideoEngineImpl.LJ;
                                                if (interfaceC47775Ip16 != null) {
                                                    String LIZIZ = interfaceC47775Ip16.LIZIZ(479);
                                                    if (!TextUtils.isEmpty(LIZIZ)) {
                                                        str3 = LIZIZ;
                                                    }
                                                    StringBuilder LIZ2 = X1D.LIZ();
                                                    LIZ2.append("audio codec: ");
                                                    LIZ2.append(str3);
                                                    C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ2));
                                                    return str3;
                                                }
                                            case 151:
                                                InterfaceC47775Ip1 interfaceC47775Ip17 = tTVideoEngineImpl.LJ;
                                                if (interfaceC47775Ip17 != null) {
                                                    return interfaceC47775Ip17.LIZIZ(481);
                                                }
                                            default:
                                                switch (i) {
                                                    case 31:
                                                        try {
                                                            return Build.BOARD;
                                                        } catch (Exception e3) {
                                                            TTVideoEngineLog.d(e3);
                                                            return "";
                                                        }
                                                    case 32:
                                                        try {
                                                            return Build.HARDWARE;
                                                        } catch (Exception e4) {
                                                            TTVideoEngineLog.d(e4);
                                                            return "";
                                                        }
                                                    case 33:
                                                        InterfaceC47775Ip1 interfaceC47775Ip18 = tTVideoEngineImpl.LJ;
                                                        if (interfaceC47775Ip18 != null) {
                                                            return interfaceC47775Ip18.LIZIZ(200);
                                                        }
                                                    default:
                                                        return "";
                                                }
                                        }
                                    } else {
                                        if (TTVideoEngineImpl.a8 == null) {
                                            try {
                                                BufferedReader bufferedReader = new BufferedReader(new FileReader("proc/cpuinfo"));
                                                String readLine = bufferedReader.readLine();
                                                while (true) {
                                                    if (readLine == null) {
                                                        break;
                                                    }
                                                    if (readLine.contains("Hardware")) {
                                                        String[] split = readLine.split(":");
                                                        if (split.length > 1) {
                                                            str2 = split[1];
                                                        }
                                                    } else {
                                                        readLine = bufferedReader.readLine();
                                                    }
                                                }
                                                TTVideoEngineImpl.a8 = str2.trim();
                                            } catch (Exception e5) {
                                                TTVideoEngineLog.d(e5);
                                            }
                                        }
                                        return TTVideoEngineImpl.a8;
                                    }
                                } else {
                                    InterfaceC47775Ip1 interfaceC47775Ip19 = tTVideoEngineImpl.LJ;
                                    if (interfaceC47775Ip19 != null) {
                                        return interfaceC47775Ip19.LIZIZ(467);
                                    }
                                }
                            } else {
                                InterfaceC47775Ip1 interfaceC47775Ip110 = tTVideoEngineImpl.LJ;
                                if (interfaceC47775Ip110 != null) {
                                    return interfaceC47775Ip110.LIZIZ(71);
                                }
                            }
                        } else {
                            ?? r0 = tTVideoEngineImpl.LLZ;
                            if (r0 != 0) {
                                str4 = r0;
                            }
                            if (str4 == null) {
                                return "own";
                            }
                            return "user";
                        }
                    } else {
                        return tTVideoEngineImpl.A;
                    }
                } else {
                    InterfaceC47775Ip1 interfaceC47775Ip111 = tTVideoEngineImpl.LJ;
                    if (interfaceC47775Ip111 != null) {
                        return interfaceC47775Ip111.LIZIZ(5002);
                    }
                }
            } else {
                InterfaceC47775Ip1 interfaceC47775Ip112 = tTVideoEngineImpl.LJ;
                if (interfaceC47775Ip112 != null) {
                    int LJIIJJI = interfaceC47775Ip112.LJIIJJI(139, -1);
                    if (LJIIJJI != 0) {
                        if (LJIIJJI == 1) {
                            return "nativewindow";
                        }
                    } else {
                        return "opengl";
                    }
                }
            }
        } else {
            InterfaceC47775Ip1 interfaceC47775Ip113 = tTVideoEngineImpl.LJ;
            if (interfaceC47775Ip113 != null) {
                String LIZIZ2 = interfaceC47775Ip113.LIZIZ(478);
                int LJIIJJI2 = tTVideoEngineImpl.LJ.LJIIJJI(141, -1);
                if (LJIIJJI2 == 1) {
                    LIZIZ2 = "bytevc1";
                } else if (LJIIJJI2 == 33) {
                    LIZIZ2 = "bytevc2";
                }
                if (!tTVideoEngineImpl.LJI() && LJIIJJI2 == 0) {
                    LIZIZ2 = "h264";
                }
                if (!TextUtils.isEmpty(LIZIZ2)) {
                    str3 = LIZIZ2;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("video codec: ");
                LIZ3.append(str3);
                C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ3));
                return str3;
            }
        }
        return "";
    }

    public final void LJI(int i, java.util.Map map) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        switch (i) {
            case 0:
                if (tTVideoEngineImpl == null || tTVideoEngineImpl.LLZLLLL == null) {
                    return;
                }
                C47620ImW c47620ImW = new C47620ImW();
                c47620ImW.LIZ = "bufferStartInfos";
                c47620ImW.LIZJ = map;
                tTVideoEngineImpl.LLLFFI(c47620ImW, false);
                return;
            case 1:
                if (tTVideoEngineImpl == null || tTVideoEngineImpl.LLZLLLL == null) {
                    return;
                }
                C47620ImW c47620ImW2 = new C47620ImW();
                c47620ImW2.LIZ = "bufferEndInfos";
                c47620ImW2.LIZJ = map;
                tTVideoEngineImpl.LLLFFI(c47620ImW2, false);
                return;
            case 2:
                if (tTVideoEngineImpl == null || tTVideoEngineImpl.LLZLLLL == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(map);
                C47620ImW c47620ImW3 = new C47620ImW();
                c47620ImW3.LIZ = "firstframe_split";
                c47620ImW3.LIZJ = jSONObject;
                c47620ImW3.LJFF = tTVideoEngineImpl.T;
                tTVideoEngineImpl.LLLFFI(c47620ImW3, true);
                return;
            case 3:
                if (tTVideoEngineImpl == null || tTVideoEngineImpl.LLZLLLL == null) {
                    return;
                }
                C47620ImW c47620ImW4 = new C47620ImW();
                c47620ImW4.LIZ = "outsyncStartInfos";
                c47620ImW4.LIZJ = map;
                tTVideoEngineImpl.LLLFFI(c47620ImW4, false);
                return;
            case 4:
                if (tTVideoEngineImpl == null || tTVideoEngineImpl.LLZLLLL == null) {
                    return;
                }
                C47620ImW c47620ImW5 = new C47620ImW();
                c47620ImW5.LIZ = "outsyncEndInfos";
                c47620ImW5.LIZJ = map;
                tTVideoEngineImpl.LLLFFI(c47620ImW5, false);
                return;
            case 5:
                if (tTVideoEngineImpl == null || tTVideoEngineImpl.LLZLLLL == null) {
                    return;
                }
                C47620ImW c47620ImW6 = new C47620ImW();
                c47620ImW6.LIZ = "noRenderStartInfos";
                c47620ImW6.LIZJ = map;
                tTVideoEngineImpl.LLLFFI(c47620ImW6, false);
                return;
            case 6:
                if (tTVideoEngineImpl == null || tTVideoEngineImpl.LLZLLLL == null) {
                    return;
                }
                C47620ImW c47620ImW7 = new C47620ImW();
                c47620ImW7.LIZ = "noRenderEndInfos";
                c47620ImW7.LIZJ = map;
                tTVideoEngineImpl.LLLFFI(c47620ImW7, false);
                return;
            default:
                return;
        }
    }
}
