package X;

import android.content.Context;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.BzA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30568BzA implements InterfaceC72822Si2 {
    public final /* synthetic */ PreviewPartnershipWidget LJLIL;

    public C30568BzA(PreviewPartnershipWidget previewPartnershipWidget) {
        this.LJLIL = previewPartnershipWidget;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Context context = this.LJLIL.context;
        o.LJIIIIZZ(context, "context");
        C30574BzG c30574BzG = this.LJLIL.LJLJLJ;
        if (c30574BzG != null) {
            C30577BzJ.LIZLLL(false, c199097rd, context, c30574BzG, null);
        } else {
            o.LJIJI("lifecycleCallback");
            throw null;
        }
    }
}
