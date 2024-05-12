package X;

import Y.IDuS81S0200000_12;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TPK implements IFetchPanelInfoListener {
    public final /* synthetic */ IDuS81S0200000_12 LIZ;
    public final /* synthetic */ InterfaceC73573Su9 LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC73573Su9 emitter = this.LIZIZ;
        o.LJIIIIZZ(emitter, "emitter");
        if (emitter.isDisposed()) {
            return;
        }
        IDuS81S0200000_12 iDuS81S0200000_12 = this.LIZ;
        TJY tjy = (TJY) iDuS81S0200000_12.l0;
        if (tjy.LJ) {
            InterfaceC84497XEf interfaceC84497XEf = tjy.LIZLLL;
            String str = tjy.LIZJ;
            TPM tpm = (TPM) iDuS81S0200000_12.l1;
            interfaceC84497XEf.LJJII(str, tpm.LJLJJLL, tpm.LJLIL, tpm.LJLILLLLZI, tpm.LJLJI, new TPL(this));
        }
        this.LIZIZ.onError(e.getException());
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        InterfaceC73573Su9 emitter = this.LIZIZ;
        o.LJIIIIZZ(emitter, "emitter");
        if (emitter.isDisposed()) {
            return;
        }
        if (panelInfoModel != null) {
            this.LIZIZ.onNext(panelInfoModel);
            this.LIZIZ.onComplete();
        } else {
            this.LIZIZ.onError(new IllegalArgumentException("sticker panel fetching failed"));
        }
    }

    public TPK(IDuS81S0200000_12 iDuS81S0200000_12, C73433Srt c73433Srt) {
        this.LIZ = iDuS81S0200000_12;
        this.LIZIZ = c73433Srt;
    }
}
