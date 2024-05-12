package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Hb7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44365Hb7 implements InterfaceC74532TMy {
    @Override // X.InterfaceC74566TOg
    public final void LIZ(Long l, Object obj, Object obj2) {
        boolean z;
        long j;
        C74397THt key = (C74397THt) obj;
        C44368HbA c44368HbA = (C44368HbA) obj2;
        o.LJIIIZ(key, "key");
        Effect effect = key.LJLIL;
        long j2 = 0;
        if (c44368HbA != null) {
            long j3 = c44368HbA.LJLJI;
            if (j3 != 0) {
                C60903NvH.LJJIJL(effect, j3);
            }
        }
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            boolean LIZLLL = ID0.LIZLLL(effect);
            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("type", String.valueOf(LIZLLL ? 1 : 0));
            c6bk.LIZ.put("url", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), effect.getFileUrl()));
            c6bk.LIZ.put("zip_model", 0);
            c6bk.LIZ.put("duration", String.valueOf(l));
            LJJIIZI.LJIIL(0, "sticker_download_error_rate", c6bk.LJ());
            InterfaceC170656mr LJJIIZI2 = C60903NvH.LJIIJJI().LJJIIZI();
            C6BK c6bk2 = new C6BK();
            c6bk2.LIZ.put("duration", l);
            boolean z2 = true;
            if (!LIZLLL) {
                z2 = false;
            }
            c6bk2.LIZ.put("isAr", Boolean.valueOf(z2));
            LJJIIZI2.LJIJ("type_av_sticker_download_time", c6bk2.LJ());
            C6BK c6bk3 = new C6BK();
            c6bk3.LIZ.put("duration", l);
            JSONObject LJ = c6bk3.LJ();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("tag", "ttlive_sdk");
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C60903NvH.LJIIJJI().LJJIIZI().LIZLLL("ttlive_download_sticker_all", 0, LJ, jSONObject);
            if (c44368HbA != null) {
                j = c44368HbA.LJLJI;
            } else {
                j = 0;
            }
            if (l != null) {
                j2 = l.longValue();
            }
            C60903NvH.LJIIJ(effect, j, j2, 0, null);
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("resource_type", "effect");
        c145995oB.LIZJ(l, "duration");
        c145995oB.LIZ(0, "status");
        c145995oB.LJI("resource_id", effect.getEffectId());
        c145995oB.LJ("is_auto_download", key.LJLILLLLZI);
        c145995oB.LIZIZ(XBM.LJI(effect.getUnzipPath()), "source_file_size");
        GXR.LIZ("tool_performance_resource_download", c145995oB.LIZ);
    }

    @Override // X.InterfaceC74566TOg
    public final void LIZIZ(int i, int i2, C74397THt key) {
        o.LJIIIZ(key, "key");
    }

    @Override // X.InterfaceC74566TOg
    public final void LIZJ(C74397THt c74397THt, Long l, Exception exc, C44368HbA c44368HbA) {
        boolean z;
        long j;
        long j2;
        String str;
        String str2;
        Integer num;
        String str3;
        Object obj;
        String str4;
        Integer num2;
        Integer num3;
        Integer num4;
        C74397THt key = c74397THt;
        C44368HbA c44368HbA2 = c44368HbA;
        o.LJIIIZ(key, "key");
        Effect effect = key.LJLIL;
        if (c44368HbA2 != null) {
            long j3 = c44368HbA2.LJLJI;
            if (j3 != 0) {
                C60903NvH.LJJIJL(effect, j3);
            }
        }
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        Integer num5 = null;
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            if (c44368HbA2 != null) {
                str3 = c44368HbA2.LJLILLLLZI;
            } else {
                str3 = null;
            }
            LIZ.append(str3);
            if (c44368HbA2 == null || (num4 = c44368HbA2.LJLIL) == null || num4.intValue() != -1) {
                obj = "";
            } else if (exc != null) {
                obj = exc.getStackTrace();
            } else {
                obj = null;
            }
            LIZ.append(obj);
            String LIZIZ = X1D.LIZIZ(LIZ);
            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("sticker_id", effect.getEffectId());
            if (c44368HbA2 != null && (num3 = c44368HbA2.LJLIL) != null) {
                str4 = num3.toString();
            } else {
                str4 = null;
            }
            c6bk.LIZ.put("errorCode", str4);
            c6bk.LIZ.put("errorMsg", LIZIZ);
            c6bk.LIZ.put("zip_model", 0);
            c6bk.LIZ.put("url", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), effect.getFileUrl()));
            LJJIIZI.LJIIL(1, "sticker_download_error_rate", c6bk.LJ());
            C6BK c6bk2 = new C6BK();
            if (c44368HbA2 != null) {
                num2 = c44368HbA2.LJLIL;
            } else {
                num2 = null;
            }
            c6bk2.LIZ.put("error_code", num2);
            c6bk2.LIZ.put("error_msg", LIZIZ);
            JSONObject LJ = c6bk2.LJ();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("tag", "ttlive_sdk");
                if (LJ != null) {
                    jSONObject.put("extra", LJ);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C60903NvH.LJIIJJI().LJJIIZI().LIZLLL("ttlive_download_sticker_all", 1, null, jSONObject);
            C60903NvH.LJIIJJI().LJJIIZI().LJIIL(1, "ttlive_download_sticker_error", LJ);
        }
        Effect effect2 = key.LJLIL;
        if (c44368HbA2 != null) {
            j = c44368HbA2.LJLJI;
        } else {
            j = 0;
        }
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        ExceptionResult exceptionResult = new ExceptionResult(exc);
        if (c44368HbA2 != null) {
            str = c44368HbA2.LJLILLLLZI;
        } else {
            str = null;
        }
        exceptionResult.setMsg(str);
        if (c44368HbA2 != null && (num = c44368HbA2.LJLIL) != null) {
            exceptionResult.setErrorCode(num.intValue());
        }
        C60903NvH.LJIIJ(effect2, j, j2, -1, exceptionResult);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("resource_type", "effect");
        c145995oB.LIZJ(l, "duration");
        c145995oB.LIZ(1, "status");
        c145995oB.LJI("resource_id", effect.getEffectId());
        c145995oB.LIZJ(ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0), "error_domain");
        if (c44368HbA2 != null) {
            num5 = c44368HbA2.LJLIL;
        }
        c145995oB.LIZJ(num5, "error_code");
        if (c44368HbA2 == null || (str2 = c44368HbA2.LJLILLLLZI) == null) {
            str2 = "empty_error_msg";
        }
        c145995oB.LJI("error_msg", str2);
        c145995oB.LJ("is_auto_download", key.LJLILLLLZI);
        GXR.LIZ("tool_performance_resource_download", c145995oB.LIZ);
    }
}
