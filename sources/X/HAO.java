package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAO implements IFetchEffectListener {
    public final /* synthetic */ HAG LIZ;
    public final /* synthetic */ Object LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        HAG hag = this.LIZ;
        Object obj = this.LIZIZ;
        if (effect2 == null) {
            hag.LIZIZ(obj);
            this.LIZ.LIZIZ(this.LIZIZ);
            return;
        }
        hag.getClass();
        ArrayList arrayList = new ArrayList();
        MvThemeData mvThemeData = new MvThemeData();
        mvThemeData.LJIILJJIL(effect2);
        arrayList.add(mvThemeData);
        long LIZ = hag.LIZJ.LIZ("fetch mv panel list", "success");
        HAE hae = hag.LIZ;
        C43619H9z c43619H9z = hae.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LIZ = (int) LIZ;
        }
        hae.LJIIL = false;
        HA5 ha5 = hag.LIZIZ;
        if (ha5 == null) {
            return;
        }
        ha5.LIZ(arrayList);
    }

    public HAO(HAG hag, Object obj) {
        this.LIZ = hag;
        this.LIZIZ = obj;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZ.LIZIZ(this.LIZIZ);
    }
}
