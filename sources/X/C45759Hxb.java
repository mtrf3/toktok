package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.IFetchModelListener;
import kotlin.jvm.internal.o;

/* renamed from: X.Hxb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45759Hxb implements IFetchModelListener {
    public final /* synthetic */ IAVEffectService.IAVEffectReadyCallback<String[]> LJLIL;

    public C45759Hxb(IAVEffectService.IAVEffectReadyCallback<String[]> iAVEffectReadyCallback) {
        this.LJLIL = iAVEffectReadyCallback;
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        IAVEffectService.IAVEffectReadyCallback<String[]> iAVEffectReadyCallback = this.LJLIL;
        if (iAVEffectReadyCallback != null) {
            iAVEffectReadyCallback.finish(null);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
    public final void onSuccess(String[] requirements) {
        o.LJIIIZ(requirements, "requirements");
        IAVEffectService.IAVEffectReadyCallback<String[]> iAVEffectReadyCallback = this.LJLIL;
        if (iAVEffectReadyCallback != null) {
            iAVEffectReadyCallback.finish(requirements);
        }
    }
}
