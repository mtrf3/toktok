package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.impl.OptimizerHelperServiceImpl;
import com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.ss.android.ugc.aweme.kids.common.response.KidsSettings;
import com.ss.android.ugc.aweme.kids.setting.SettingServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.api.ISettingService;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import defpackage.i0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes9.dex */
public final class J7I implements J7S, InterfaceC13370fl, InterfaceC48038ItG, J7O {
    public static boolean LJLIL;
    public static MLModel LJLILLLLZI;
    public static final J7I LJLJI = new J7I();

    @Override // X.J7S
    public void onError() {
    }

    public static MLModel LJI() {
        if (!LJLIL) {
            try {
                FFL.LJIIIZ().getClass();
                LJLILLLLZI = (MLModel) FFL.LJIILLIIL(MLModel.class, "speed_ml", false);
            } catch (Throwable unused) {
                LJLILLLLZI = null;
            }
            LJLIL = true;
        }
        return LJLILLLLZI;
    }

    public static String LJII(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void LJIIL(Throwable th) {
        if (!Error.class.isInstance(th)) {
            if (!RuntimeException.class.isInstance(th)) {
                throw new RuntimeException(th);
            }
            throw ((Throwable) RuntimeException.class.cast(th));
        }
        throw ((Throwable) Error.class.cast(th));
    }

    @Override // X.J7S
    public void LIZIZ(KidsSettings setting) {
        ISettingService iSettingService;
        o.LJIIIZ(setting, "setting");
        if (setting.getAbTestParamStruct() instanceof m) {
            j abTestParamStruct = setting.getAbTestParamStruct();
            o.LJII(abTestParamStruct, "null cannot be cast to non-null type com.google.gson.JsonObject");
            m LJIIZILJ = abTestParamStruct.LJIIZILJ();
            j LJJIJ = LJIIZILJ.LJJIJ("tiktok");
            LJJIJ.getClass();
            if (LJJIJ instanceof m) {
                j LJJIJ2 = LJIIZILJ.LJJIJ("tiktok");
                o.LJII(LJJIJ2, "null cannot be cast to non-null type com.google.gson.JsonObject");
                LJIIZILJ = (m) LJJIJ2;
            }
            for (Map.Entry<String, j> entry : LJIIZILJ.entrySet()) {
                o.LJIIIIZZ(entry, "jsonObject.entrySet()");
                String key = entry.getKey();
                j value = entry.getValue();
                m mVar = new m();
                mVar.LJJII("val", value);
                mVar.LJJIIJ("vid", 1);
                mVar.LJJIIJ("type", 2);
                LJIIZILJ.LJJII(key, mVar);
            }
            C36186EIc c36186EIc = new C36186EIc();
            c36186EIc.LIZIZ = LJIIZILJ;
            c36186EIc.LIZJ = LJIIZILJ;
            c36186EIc.LIZLLL = LJIIZILJ;
            c36186EIc.LJ = null;
            C36187EId c36187EId = new C36187EId(c36186EIc);
            OptimizerHelperServiceImpl.LJIIIZ().LJI(true);
            FH5.LIZIZ().LJI(c36187EId);
            OptimizerHelperServiceImpl.LJIIIZ().LJI(false);
        }
        KidsComplianceSettings complianceSettings = setting.getComplianceSettings();
        if (complianceSettings != null) {
            J7K j7k = J7M.LIZ;
            j7k.LIZJ = complianceSettings;
            a.LJIIJJI().LIZ();
            j7k.LIZ = complianceSettings;
            j7k.LIZIZ.storeString("cached_setting", GsonProtectorUtils.toJson(new Gson(), complianceSettings));
            Object LIZ = C58096Mr6.LIZ(ISettingService.class, false);
            if (LIZ != null) {
                iSettingService = (ISettingService) LIZ;
            } else {
                if (C58096Mr6.Q1 == null) {
                    synchronized (ISettingService.class) {
                        if (C58096Mr6.Q1 == null) {
                            C58096Mr6.Q1 = new SettingServiceImpl();
                        }
                    }
                }
                iSettingService = C58096Mr6.Q1;
            }
            iSettingService.LIZ(complianceSettings);
        }
        Iterator<J7J> it = J7M.LIZJ.iterator();
        while (it.hasNext()) {
            J7J next = it.next();
            if (next != null) {
                next.onChanged();
            }
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        AbstractC73672Svk it = (AbstractC73672Svk) obj;
        o.LJIIJ(it, "it");
        return it.LJJJJLI(100L, TimeUnit.MILLISECONDS);
    }

    @Override // X.J7O
    public InterfaceC80053VbN LIZ(Context context, C80048VbI c80048VbI) {
        o.LJIIJ(context, "context");
        return new J7W(context, c80048VbI);
    }

    @Override // X.InterfaceC13370fl
    public Typeface LIZJ(C13640gC fontWeight, int i) {
        o.LJIIIZ(fontWeight, "fontWeight");
        return LJFF(null, fontWeight, i);
    }

    public static Typeface LJFF(String str, C13640gC c13640gC, int i) {
        if (i == 0 && o.LJ(c13640gC, C13640gC.LJLJJLL) && (str == null || str.length() == 0)) {
            Typeface DEFAULT = Typeface.DEFAULT;
            o.LJIIIIZZ(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        int LJIIL = C78886Uxe.LJIIL(c13640gC, i);
        if (str == null || str.length() == 0) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(LJIIL);
            o.LJIIIIZZ(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, LJIIL);
        o.LJIIIIZZ(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    @Override // X.InterfaceC13370fl
    public Typeface LIZLLL(C42881mG name, C13640gC fontWeight, int i) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(fontWeight, "fontWeight");
        String name2 = name.LJLILLLLZI;
        o.LJIIIZ(name2, "name");
        int i2 = fontWeight.LJLIL / 100;
        if (i2 >= 0) {
            if (i2 < 2) {
                name2 = i0.LJFF(name2, "-thin");
            } else if (2 <= i2) {
                if (i2 < 4) {
                    name2 = i0.LJFF(name2, "-light");
                } else if (i2 != 4) {
                    if (i2 == 5) {
                        name2 = i0.LJFF(name2, "-medium");
                    } else if (6 <= i2 && i2 >= 8 && i2 < 11) {
                        name2 = i0.LJFF(name2, "-black");
                    }
                }
            }
        }
        if (name2.length() != 0 && 0 == 0) {
            Typeface LJFF = LJFF(name2, fontWeight, i);
            if (!o.LJ(LJFF, Typeface.create(Typeface.DEFAULT, C78886Uxe.LJIIL(fontWeight, i))) && !o.LJ(LJFF, LJFF(null, fontWeight, i)) && LJFF != null) {
                return LJFF;
            }
        }
        return LJFF(name.LJLILLLLZI, fontWeight, i);
    }

    public static String LJ(List list, java.util.Map map, IYO iyo, IYO iyo2) {
        boolean z;
        String str;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        if ((iyo != null && iyo2 != null && iyo.getBitRate() != iyo2.getBitRate()) || ((iyo == null && iyo2 != null) || (iyo != null && iyo2 == null))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "same";
        }
        StringBuilder sb = new StringBuilder("bitrate=[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((IYN) it.next()).getBitRate());
            sb.append(",");
        }
        sb.append("]");
        if (C1DG.LIZ().getConfig().getCommonConfig().isUseLastNetworkSpeed()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) map.get("sim_video_url_model");
        if (C46862IaI.LIZJ == null) {
            C46862IaI.LIZJ = new Integer(C1DG.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed());
        }
        sb.append("&config_quality=1&use_last_network_speed=");
        sb.append(str);
        sb.append("&curve_adjust_mode=");
        sb.append(IZ8.LIZLLL());
        sb.append("&curve_adjust_factor=");
        float f = 1.0f;
        if (simVideoUrlModel != null && !TextUtils.isEmpty(simVideoUrlModel.getMeta())) {
            try {
                JSONObject json = IZG.from(simVideoUrlModel.getMeta()).getJson();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(1.0f);
                String optString = json.optString("qprf", X1D.LIZIZ(LIZ));
                if (!TextUtils.isEmpty(optString)) {
                    f = CastFloatProtector.parseFloat(optString);
                }
            } catch (Exception unused) {
            }
        }
        sb.append(f);
        sb.append("&initial_speed=");
        sb.append(C46862IaI.LIZJ);
        sb.append("&internet_speed=");
        sb.append(map.get("internet_speed"));
        IY3 iy3 = (IY3) map.get("bitrate_curve");
        if (iy3 != null) {
            sb.append("&param_a=");
            sb.append(iy3.LIZ());
            sb.append("&param_b=");
            sb.append(iy3.LJ());
            sb.append("&param_c=");
            sb.append(iy3.LIZIZ());
            sb.append("&param_d=");
            sb.append(iy3.LIZLLL());
            sb.append("&min_bitrate=");
            sb.append(iy3.LIZJ());
        }
        sb.append("&origin_res=");
        Object obj = "NA";
        if (iyo == null) {
            valueOf = "NA";
        } else {
            valueOf = Integer.valueOf(iyo.getBitRate());
        }
        sb.append(valueOf);
        sb.append("&native_res=");
        if (iyo2 == null) {
            valueOf2 = "NA";
        } else {
            valueOf2 = Integer.valueOf(iyo2.getBitRate());
        }
        sb.append(valueOf2);
        sb.append("&origin_cal=");
        if (iyo == null) {
            valueOf3 = "NA";
        } else {
            valueOf3 = Double.valueOf(iyo.LJLJI);
        }
        sb.append(valueOf3);
        sb.append("&native_cal=");
        if (iyo2 != null) {
            obj = Double.valueOf(iyo2.LJLJI);
        }
        sb.append(obj);
        return sb.toString();
    }

    public static /* synthetic */ void LJIIIZ(U7W u7w, U6D u6d, String str, long j, String str2, int i, OSZ osz, boolean z, String str3, int i2) {
        boolean z2 = z;
        OSZ osz2 = osz;
        String str4 = null;
        if ((i2 & 32) != 0) {
            osz2 = null;
        }
        if ((i2 & 64) != 0) {
            z2 = false;
        }
        if ((i2 & 128) == 0) {
            str4 = str3;
        }
        u7w.LJIIIZ(u6d, str, j, str2, i, osz2, z2, str4);
    }

    public static /* synthetic */ void LJIIJ(U7W u7w, String str, U66 u66, LinkLayerMessage linkLayerMessage, String str2, String str3, OSZ osz, boolean z, String str4, int i) {
        boolean z2 = z;
        OSZ osz2 = osz;
        String str5 = null;
        if ((i & 32) != 0) {
            osz2 = null;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        if ((i & 128) == 0) {
            str5 = str4;
        }
        U7W.LJIIL(str, u66, linkLayerMessage, str2, str3, osz2, z2, str5);
    }

    public static final HashMap LJIIIIZZ(int i, long j, C28837BTl c28837BTl, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        String str8;
        String str9;
        OSZ[] oszArr = new OSZ[12];
        oszArr[0] = new OSZ("content", str);
        oszArr[1] = new OSZ("starling_key", str2);
        oszArr[2] = new OSZ("room_id", String.valueOf(j));
        oszArr[3] = new OSZ("request_id", str3);
        oszArr[4] = new OSZ("common_label_list", str4);
        oszArr[5] = new OSZ("enter_source", str5);
        if (z) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[6] = new OSZ("post_anyway", str8);
        oszArr[7] = new OSZ("input_type", String.valueOf(i));
        oszArr[8] = new OSZ("sec_at_uid", str6);
        oszArr[9] = new OSZ("emotes_with_index", str7);
        if (z2) {
            str9 = "3";
        } else {
            str9 = null;
        }
        oszArr[10] = new OSZ("quick_chat_scene", str9);
        oszArr[11] = new OSZ("client_start_timestamp_millisecond", String.valueOf(C31012CFc.LIZIZ()));
        java.util.Map LJJL = C113554cx.LJJL(oszArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : LJJL.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        HashMap hashMap = new HashMap(linkedHashMap);
        hashMap.putAll(C28835BTj.LJI(c28837BTl));
        return hashMap;
    }
}
