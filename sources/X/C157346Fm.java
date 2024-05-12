package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.6Fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157346Fm {
    public static final InterfaceC170656mr LIZ = C60903NvH.LJIIJJI().LJJIIZI();

    public static void LIZ(Effect effect, boolean z, long j, ExceptionResult exceptionResult) {
        UrlModel urlModel;
        String str;
        String name;
        C6BK c6bk = new C6BK();
        Gson LIZ2 = C60903NvH.LJIIJJI().LIZ();
        Integer num = null;
        if (effect != null) {
            urlModel = effect.getFileUrl();
        } else {
            urlModel = null;
        }
        String json = GsonProtectorUtils.toJson(LIZ2, urlModel);
        String str2 = "";
        if (json == null) {
            json = "";
        }
        c6bk.LIZ.put("url", json);
        if (effect == null || (str = effect.getEffectId()) == null) {
            str = "";
        }
        c6bk.LIZ.put("effect_id", str);
        if (effect != null && (name = effect.getName()) != null) {
            str2 = name;
        }
        c6bk.LIZ.put("effect_name", str2);
        if (effect != null) {
            num = Integer.valueOf(effect.getEffectType());
        }
        c6bk.LIZ.put("effect_type", num);
        c6bk.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - j));
        if (!z && exceptionResult != null) {
            c6bk.LIZ.put("exception", android.util.Log.getStackTraceString(exceptionResult.getException()));
            c6bk.LIZ.put("errorCode", Integer.valueOf(exceptionResult.getErrorCode()));
            c6bk.LIZLLL("errorMsg", exceptionResult.getMsg());
        }
        LIZ.LJIIL(!z ? 1 : 0, "edit_effect_download_error_rate", c6bk.LJ());
    }
}
