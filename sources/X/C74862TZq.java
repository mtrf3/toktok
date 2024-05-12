package X;

import com.bytedance.android.livesdk.model.message.LinkScreenChangeMessage;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import kotlin.jvm.internal.o;

/* renamed from: X.TZq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74862TZq implements InterfaceC74863TZr {
    public final /* synthetic */ C74648TRk LJLIL;

    public C74862TZq(C74648TRk c74648TRk) {
        this.LJLIL = c74648TRk;
    }

    @Override // X.InterfaceC74863TZr
    public final void s1(LinkScreenChangeMessage message) {
        LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent;
        o.LJIIIZ(message, "message");
        if (message.messageType == 2 && (linkerEnlargeStatusSynContent = message.enlargeStatusSyn) != null) {
            this.LJLIL.LIZIZ.LJIIJ(linkerEnlargeStatusSynContent);
        }
    }
}
