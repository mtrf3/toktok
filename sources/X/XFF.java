package X;

import android.app.Application;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApiResBean;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes16.dex */
public final class XFF<TTaskResult, TContinuationResult> implements C10I {
    public static final XFF<TTaskResult, TContinuationResult> LIZ = new XFF<>();

    @Override // X.C10I
    public final Object then(C10K c10k) {
        C10K LJIIIIZZ;
        String[] strArr;
        if (C36480ETk.LIZIZ(c10k)) {
            if (((EffectFetchApiResBean) c10k.LJIIJJI()).status != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Failed: download status code is ");
                LIZ2.append(((EffectFetchApiResBean) c10k.LJIIJJI()).status);
                return C10K.LJIIIIZZ(new Exception(X1D.LIZIZ(LIZ2)));
            }
            if (XAQ.LIZ == null) {
                Application application = C44172HVg.LIZ;
                o.LJIIIIZZ(application, "application");
                C84488XDw.LIZ(application, null);
            }
            try {
                Gson GSON = C44172HVg.LIZIZ;
                o.LJIIIIZZ(GSON, "GSON");
                Effect effect = (Effect) GsonProtectorUtils.fromJson(GSON, ((EffectFetchApiResBean) c10k.LJIIJJI()).data, Effect.class);
                if (effect == null) {
                    return C10K.LJIIIIZZ(new Exception("fail to parse effect, and effect is null"));
                }
                List<String> requirements = effect.getRequirements();
                if (requirements == null || (strArr = (String[]) requirements.toArray(new String[0])) == null) {
                    strArr = new String[0];
                }
                java.util.Map<String, List<String>> LIZ3 = C36480ETk.LIZ(effect.getModel_names());
                n nVar = new n();
                DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(strArr, LIZ3, new XFG(nVar, effect));
                Object obj = nVar.LIZ;
                o.LJIIIIZZ(obj, "result.task");
                return obj;
            } catch (s e) {
                return C10K.LJIIIIZZ(e);
            }
        }
        Exception LJIIJ = c10k.LJIIJ();
        if (LJIIJ != null && (LJIIIIZZ = C10K.LJIIIIZZ(LJIIJ)) != null) {
            return LJIIIIZZ;
        }
        return C10K.LJIIIIZZ(new Exception("fail to fetch effect info with null error"));
    }
}
