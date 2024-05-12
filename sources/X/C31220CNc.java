package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.browser.IBrowserService;
import kotlin.jvm.internal.o;

/* renamed from: X.CNc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31220CNc implements InterfaceC30642C0w {
    public final AbstractC31219CNb LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC30642C0w
    public final void F1() {
    }

    @Override // X.InterfaceC30642C0w
    public final String LIZ() {
        return this.LIZ.getCardContainerId();
    }

    @Override // X.InterfaceC30642C0w
    public final void LIZIZ() {
        if (this.LIZIZ) {
            this.LIZ.LIZ();
        }
    }

    @Override // X.InterfaceC30642C0w
    public final View LIZJ() {
        AbstractC31219CNb cardView = this.LIZ;
        o.LJIIIIZZ(cardView, "cardView");
        return cardView;
    }

    @Override // X.InterfaceC30642C0w
    public final void LIZLLL() {
        if (!this.LIZIZ) {
            this.LIZ.LIZ();
        }
    }

    @Override // X.InterfaceC30642C0w
    public final String LJFF() {
        return this.LIZ.getName();
    }

    @Override // X.InterfaceC30642C0w
    public final void LLLLZLL() {
        this.LIZ.LIZIZ();
    }

    public C31220CNc(Context context, android.net.Uri uri, String str, boolean z) {
        this.LIZIZ = z;
        this.LIZ = ((IBrowserService) CN1.LIZ(IBrowserService.class)).nb(uri, str, context);
    }
}
