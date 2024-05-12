package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sjd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72921Sjd implements IFetchEffectListListener {
    public final /* synthetic */ InterfaceC73573Su9<List<Effect>> LIZ;

    public C72921Sjd(C73433Srt c73433Srt) {
        this.LIZ = c73433Srt;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        if (this.LIZ.isDisposed()) {
            return;
        }
        this.LIZ.onError(e.getException());
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        if (this.LIZ.isDisposed()) {
            return;
        }
        InterfaceC73573Su9<List<Effect>> interfaceC73573Su9 = this.LIZ;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        interfaceC73573Su9.onNext(list);
    }
}
