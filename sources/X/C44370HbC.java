package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import kotlin.jvm.internal.o;

/* renamed from: X.HbC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44370HbC implements InterfaceC74566TOg<Effect, C44371HbD> {
    @Override // X.InterfaceC74566TOg
    public final void LIZ(Long l, Object obj, Object obj2) {
        EffectTemplate key = (EffectTemplate) obj;
        o.LJIIIZ(key, "key");
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        C6BK c6bk = new C6BK();
        String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), key.getFileUrl());
        String str = "";
        if (json == null) {
            json = "";
        }
        c6bk.LIZ.put("url", json);
        c6bk.LIZ.put("duration", String.valueOf(l));
        String effectId = key.getEffectId();
        if (effectId == null) {
            effectId = "";
        }
        c6bk.LIZ.put("effect_id", effectId);
        String name = key.getName();
        if (name != null) {
            str = name;
        }
        c6bk.LIZ.put("effect_name", str);
        c6bk.LIZ.put("effect_type", Integer.valueOf(key.getEffectType()));
        LJJIIZI.LJIIL(0, "info_sticker_download_error_rate", c6bk.LJ());
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("resource_type", C45804HyK.LJJJJLL("info_effect"));
        c145995oB.LIZJ(l, "duration");
        c145995oB.LIZ(0, "status");
        c145995oB.LJI("resource_id", key.getEffectId());
        c145995oB.LJ("is_auto_download", false);
        c145995oB.LIZIZ(XBM.LJI(key.getUnzipPath()), "source_file_size");
        GXR.LIZ("tool_performance_resource_download", c145995oB.LIZ);
    }

    @Override // X.InterfaceC74566TOg
    public final void LIZIZ(int i, int i2, Effect key) {
        o.LJIIIZ(key, "key");
    }

    @Override // X.InterfaceC74566TOg
    public final void LIZJ(Effect effect, Long l, Exception exc, C44371HbD c44371HbD) {
        Integer num;
        String str;
        String str2;
        Effect key = effect;
        C44371HbD c44371HbD2 = c44371HbD;
        o.LJIIIZ(key, "key");
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        C6BK c6bk = new C6BK();
        String effectId = key.getEffectId();
        String str3 = "";
        if (effectId == null) {
            effectId = "";
        }
        c6bk.LIZ.put("effect_id", effectId);
        String name = key.getName();
        if (name == null) {
            name = "";
        }
        c6bk.LIZ.put("effect_name", name);
        c6bk.LIZ.put("effect_type", Integer.valueOf(key.getEffectType()));
        String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), key.getFileUrl());
        if (json != null) {
            str3 = json;
        }
        c6bk.LIZ.put("url", str3);
        c6bk.LIZ.put("exception", android.util.Log.getStackTraceString(exc));
        Integer num2 = null;
        if (c44371HbD2 != null) {
            num = c44371HbD2.LJLIL;
        } else {
            num = null;
        }
        c6bk.LIZ.put("errorCode", String.valueOf(num));
        if (c44371HbD2 != null) {
            str = c44371HbD2.LJLILLLLZI;
        } else {
            str = null;
        }
        c6bk.LIZ.put("errorMsg", String.valueOf(str));
        LJJIIZI.LJIIL(1, "info_sticker_download_error_rate", c6bk.LJ());
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("resource_type", C45804HyK.LJJJJLL("info_effect"));
        c145995oB.LIZJ(l, "duration");
        c145995oB.LIZ(1, "status");
        c145995oB.LJI("resource_id", key.getEffectId());
        c145995oB.LIZJ(ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0), "error_domain");
        if (c44371HbD2 != null) {
            num2 = c44371HbD2.LJLIL;
        }
        c145995oB.LJI("error_code", String.valueOf(num2));
        if (c44371HbD2 == null || (str2 = c44371HbD2.LJLILLLLZI) == null) {
            str2 = "empty_error_msg";
        }
        c145995oB.LJI("error_msg", str2);
        c145995oB.LJ("is_auto_download", false);
        GXR.LIZ("tool_performance_resource_download", c145995oB.LIZ);
    }
}
