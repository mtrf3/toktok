package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.TJe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74434TJe implements IFetchFavoriteList {
    public final /* synthetic */ InterfaceC73573Su9 LIZ;

    public C74434TJe(C73433Srt c73433Srt) {
        this.LIZ = c73433Srt;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList
    public final void onFailed(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC73573Su9 emitter = this.LIZ;
        o.LJIIIIZZ(emitter, "emitter");
        if (emitter.isDisposed()) {
            return;
        }
        this.LIZ.onError(e.getException());
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
        InterfaceC73573Su9 emitter = this.LIZ;
        o.LJIIIIZZ(emitter, "emitter");
        if (emitter.isDisposed()) {
            return;
        }
        if (fetchFavoriteListResponse != null) {
            this.LIZ.onNext(fetchFavoriteListResponse);
            this.LIZ.onComplete();
        } else {
            this.LIZ.onError(new IllegalArgumentException("favorite list fetching failed"));
        }
    }
}
