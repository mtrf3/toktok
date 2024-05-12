package X;

import Y.ARunnableS29S0200000_10;
import android.text.TextUtils;
import com.bytedance.im.core.proto.Config;
import com.bytedance.im.core.proto.GetConfigsResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.List;

/* renamed from: X.Ot3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63313Ot3 extends AbstractC63515OwJ<Void> {
    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63313Ot3(C63332OtM c63332OtM) {
        super(EnumC63625Oy5.GET_CONFIGS.getValue(), c63332OtM);
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        ResponseBody responseBody;
        if (c63622Oy2 != null && (response = c63622Oy2.LJLJL) != null && (responseBody = response.body) != null && responseBody.get_configs_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        String str;
        String str2;
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            GetConfigsResponseBody getConfigsResponseBody = c63622Oy2.LJLJL.body.get_configs_body;
            List<Config> list = getConfigsResponseBody.configs;
            if (list != null && !list.isEmpty()) {
                C63314Ot4.LJIIL = C63314Ot4.LIZIZ(list);
                for (Config config : list) {
                    if (config != null && (str = config.conf_name) != null && (str2 = config.conf_value) != null) {
                        switch (str.hashCode()) {
                            case -1702692503:
                                if (str.equals("p2pMinInterval")) {
                                    C63314Ot4.LJIIJ = C63312Ot2.LJ(str2, C63314Ot4.LJIIJ);
                                    break;
                                } else {
                                    break;
                                }
                            case -1312308370:
                                if (str.equals("defaultPollingStrangerMsgInterval")) {
                                    C63314Ot4.LIZLLL = C63312Ot2.LJ(str2, C63314Ot4.LIZLLL);
                                    break;
                                } else {
                                    break;
                                }
                            case -1302860124:
                                if (str.equals("conversationMsgRepairCount")) {
                                    int i = C63314Ot4.LJII;
                                    if (!TextUtils.isEmpty(str2)) {
                                        try {
                                            i = CastIntegerProtector.parseInt(str2);
                                        } catch (Exception e) {
                                            C63322OtC.LJ(C63312Ot2.LIZ, e);
                                        }
                                    }
                                    C63314Ot4.LJII = i;
                                    break;
                                } else {
                                    break;
                                }
                            case -1289425504:
                                if (str.equals("conversationMsgRepairRatio")) {
                                    float f = C63314Ot4.LJIIIIZZ;
                                    if (!TextUtils.isEmpty(str2)) {
                                        try {
                                            f = CastFloatProtector.parseFloat(str2);
                                        } catch (Exception e2) {
                                            C63322OtC.LJ(C63312Ot2.LIZ, e2);
                                        }
                                    }
                                    C63314Ot4.LJIIIIZZ = f;
                                    break;
                                } else {
                                    break;
                                }
                            case -1287953929:
                                if (str.equals("conversationMsgRepairStart")) {
                                    C63314Ot4.LJI = C63312Ot2.LJ(str2, C63314Ot4.LJI);
                                    break;
                                } else {
                                    break;
                                }
                            case -354402478:
                                if (str.equals("dbReportRate")) {
                                    float floatValue = C63314Ot4.LJIIJJI.floatValue();
                                    if (!TextUtils.isEmpty(str2)) {
                                        try {
                                            floatValue = CastFloatProtector.parseFloat(str2);
                                        } catch (Exception e3) {
                                            C63322OtC.LJ(C63312Ot2.LIZ, e3);
                                        }
                                    }
                                    C63314Ot4.LJIIJJI = Float.valueOf(floatValue);
                                    C63291Osh LIZ = C63291Osh.LIZ();
                                    float floatValue2 = C63314Ot4.LJIIJJI.floatValue();
                                    LIZ.getClass();
                                    C63291Osh.LIZLLL.LIZ(Float.valueOf(floatValue2));
                                    break;
                                } else {
                                    break;
                                }
                            case 150002420:
                                if (str.equals("repairEnabled")) {
                                    C63314Ot4.LJ = C63312Ot2.LIZJ(str2, C63314Ot4.LJ);
                                    break;
                                } else {
                                    break;
                                }
                            case 849643188:
                                if (str.equals("autoPollingMsgEnabled")) {
                                    C63314Ot4.LIZ = C63312Ot2.LIZJ(str2, C63314Ot4.LIZ);
                                    break;
                                } else {
                                    break;
                                }
                            case 1056039696:
                                if (str.equals("conversationMsgRepairInterval")) {
                                    C63314Ot4.LJFF = C63312Ot2.LJ(str2, C63314Ot4.LJFF);
                                    break;
                                } else {
                                    break;
                                }
                            case 1217269700:
                                if (str.equals("defaultPollingMsgInterval")) {
                                    C63314Ot4.LIZJ = C63312Ot2.LJ(str2, C63314Ot4.LIZJ);
                                    break;
                                } else {
                                    break;
                                }
                            case 1263202419:
                                if (str.equals("p2pEnabled")) {
                                    C63314Ot4.LJIIIZ = C63312Ot2.LIZJ(str2, C63314Ot4.LJIIIZ);
                                    break;
                                } else {
                                    break;
                                }
                            case 2076115403:
                                if (str.equals("triggerPollingMsgEnabled")) {
                                    C63314Ot4.LIZIZ = C63312Ot2.LIZJ(str2, C63314Ot4.LIZIZ);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
            }
            String json = GsonProtectorUtils.toJson(C63682Oz0.LIZ, getConfigsResponseBody);
            C63291Osh LIZ2 = C63291Osh.LIZ();
            InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
            LIZ2.getClass();
            interfaceC63293Osj.putString(C63291Osh.LJIIIZ("imsdk_cloud_config"), json);
            LIZLLL(null);
            return;
        }
        LIZIZ(c63622Oy2);
    }
}
