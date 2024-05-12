package X;

import com.ss.android.ugc.aweme.ab.WebSocketInitExperiment;
import kotlin.jvm.internal.o;

/* renamed from: X.Dok, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35018Dok extends AbstractC65781Prl implements InterfaceC65784Pro<WebSocketInitExperiment.MetaData> {
    public static final C35018Dok LJLIL = new C35018Dok();

    public C35018Dok() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final WebSocketInitExperiment.MetaData invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        WebSocketInitExperiment.MetaData metaData = WebSocketInitExperiment.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "web_socket_init_timing", 31744, WebSocketInitExperiment.MetaData.class, metaData);
        if (LJIJ != 0) {
            metaData = LJIJ;
        }
        o.LJIIIIZZ(metaData, "ABManager.getInstance().…a)\n            ?: DEFAULT");
        return metaData;
    }
}
