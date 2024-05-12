package X;

import com.ss.android.ugc.aweme.ab.PullStreamSyncConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.X9e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84366X9e extends AbstractC65781Prl implements InterfaceC65784Pro<PullStreamSyncConfig> {
    public static final C84366X9e LJLIL = new C84366X9e();

    public C84366X9e() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final PullStreamSyncConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PullStreamSyncConfig pullStreamSyncConfig = C84365X9d.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "live_preview_pull_stream_sync", 31744, PullStreamSyncConfig.class, pullStreamSyncConfig);
        if (LJIJ != 0) {
            pullStreamSyncConfig = LJIJ;
        }
        o.LJIIIIZZ(pullStreamSyncConfig, "ABManager.getInstance().…         ?: DEFAULT_VALUE");
        return pullStreamSyncConfig;
    }
}
