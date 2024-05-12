package X;

import android.app.Dialog;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.XUx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84931XUx implements IFetchEffectListListener {
    public final /* synthetic */ C84942XVi LIZ;

    public C84931XUx(C84942XVi c84942XVi) {
        this.LIZ = c84942XVi;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.LJJJJLI.onFail(null, exceptionResult);
        Dialog dialog = this.LIZ.LJII;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        java.util.Map<String, String> LJ = this.LIZ.LJ();
        C34821Yg LJFF = this.LIZ.LJFF();
        C84942XVi c84942XVi = this.LIZ;
        C84930XUw c84930XUw = c84942XVi.LJJJJL;
        String str = (String) ListProtector.get(c84942XVi.LIZLLL, c84942XVi.LJI);
        LJFF.getClass();
        LJFF.LJIIIZ(LJ, c84930XUw, false, str, false);
    }
}
