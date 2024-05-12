package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Waf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82557Waf implements IEffectDownloadProgressListener {
    public final /* synthetic */ C82547WaV LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ MvThemeData LIZJ;
    public final /* synthetic */ C82553Wab LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZLLL.LIZ(false);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        C82553Wab c82553Wab = this.LIZLLL;
        int i = this.LIZIZ;
        C82547WaV c82547WaV = this.LIZ;
        if (i == c82553Wab.LJLLILLLL) {
            c82553Wab.LIZ(true);
            InterfaceC82571Wat interfaceC82571Wat = c82553Wab.LJZ;
            if (interfaceC82571Wat != null) {
                ((C82552Waa) interfaceC82571Wat).LIZIZ(c82553Wab.LJZL.LJJIIZ(c82553Wab.LJLLILLLL), 1, c82553Wab.LJLLILLLL);
            }
        }
        if (c82547WaV != null) {
            c82547WaV.LLJJI(false);
        }
        HAQ.LIZ(this.LIZJ, null, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MVRes: Download Success:");
        LIZ.append(effect2.getUnzipPath());
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        C82553Wab c82553Wab = this.LIZLLL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(R.string.q_m);
        C78915Uy7.LJJIJ(c82553Wab, 3001, creativeToastBuilder);
        C82553Wab c82553Wab2 = this.LIZLLL;
        int i = this.LIZIZ;
        C82547WaV c82547WaV = this.LIZ;
        if (i == c82553Wab2.LJLLILLLL) {
            c82553Wab2.LIZ(true);
        }
        if (c82547WaV != null) {
            c82547WaV.LLJJI(false);
        }
        HAQ.LIZ(this.LIZJ, exceptionResult, false);
        if (effect != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MVRes: Download Failed:");
            LIZ.append(effect.getName());
            LIZ.append(", failedEffect != null, e: ");
            LIZ.append(exceptionResult);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("MVRes: Download Failed:");
        LIZ2.append(this.LIZJ.LJIIIIZZ());
        LIZ2.append(", failedEffect == null, e: ");
        LIZ2.append(exceptionResult);
        H7B.LIZ(X1D.LIZIZ(LIZ2));
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        C82547WaV c82547WaV = this.LIZ;
        if (c82547WaV != null) {
            c82547WaV.LLJJI(true);
            c82547WaV.LLJILJIL();
            C74063T4x c74063T4x = c82547WaV.LJLJI;
            if (c74063T4x != null) {
                c74063T4x.setProgress(i);
            }
            TextView textView = c82547WaV.LJLJJI;
            if (textView != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append("%");
                textView.setText(X1D.LIZIZ(LIZ));
            }
        }
    }

    public C82557Waf(C82553Wab c82553Wab, C82547WaV c82547WaV, int i, MvThemeData mvThemeData) {
        this.LIZLLL = c82553Wab;
        this.LIZ = c82547WaV;
        this.LIZIZ = i;
        this.LIZJ = mvThemeData;
    }
}
