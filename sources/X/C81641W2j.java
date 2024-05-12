package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.W2j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81641W2j implements IFetchEffectListener {
    public final /* synthetic */ InterfaceC84498XEg LIZ;
    public final /* synthetic */ Effect LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        if (effect != null) {
            str = effect.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" start downloading");
        C15280iq.LIZIZ("OptionSceneViewModel", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Boolean bool;
        EffectManager LJLJJLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download successful: ");
        InterfaceC84498XEg interfaceC84498XEg = this.LIZ;
        if (interfaceC84498XEg != null && (LJLJJLL = interfaceC84498XEg.LJLJJLL()) != null) {
            bool = Boolean.valueOf(LJLJJLL.isEffectDownloaded(this.LIZIZ));
        } else {
            bool = null;
        }
        LIZ.append(bool);
        C15280iq.LIZIZ("OptionSceneViewModel", X1D.LIZIZ(LIZ));
    }

    public C81641W2j(InterfaceC84498XEg interfaceC84498XEg, Effect effect) {
        this.LIZ = interfaceC84498XEg;
        this.LIZIZ = effect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fail to download: ");
        LIZ.append(e.getMsg());
        C15280iq.LIZIZ("OptionSceneViewModel", X1D.LIZIZ(LIZ));
    }
}
