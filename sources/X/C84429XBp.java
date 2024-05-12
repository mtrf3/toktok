package X;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.common.task.SyncTask;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import kotlin.jvm.internal.o;

/* renamed from: X.XBp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84429XBp implements EffectFetcher {
    public final EffectFetcher LIZ = DownloadableModelSupport.getInstance().getEffectFetcher();

    @Override // com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher
    public final SyncTask<EffectTaskResult> fetchEffect(EffectFetcherArguments arguments) {
        o.LJIIIZ(arguments, "arguments");
        TENativeLibsLoader.loadLibrary();
        SyncTask<EffectTaskResult> fetchEffect = this.LIZ.fetchEffect(arguments);
        o.LJIIIIZZ(fetchEffect, "delegate.fetchEffect(arguments)");
        return fetchEffect;
    }
}
