package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TJc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74432TJc implements IModFavoriteList {
    public final /* synthetic */ InterfaceC73573Su9 LIZ;

    public C74432TJc(C73433Srt c73433Srt) {
        this.LIZ = c73433Srt;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC73573Su9 emitter = this.LIZ;
        o.LJIIIIZZ(emitter, "emitter");
        if (emitter.isDisposed()) {
            return;
        }
        this.LIZ.onError(e.getException());
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<String> list) {
        InterfaceC73573Su9 emitter = this.LIZ;
        o.LJIIIIZZ(emitter, "emitter");
        if (emitter.isDisposed()) {
            return;
        }
        if (list != null) {
            this.LIZ.onNext(list);
            this.LIZ.onComplete();
        } else {
            this.LIZ.onError(new IllegalArgumentException("modify favorite sticker failed"));
        }
    }
}
