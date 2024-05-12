package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.shorttouch.service.ShortTouchService;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UOM implements UOY {
    public final AbstractC31219CNb LIZ;
    public final /* synthetic */ ShortTouchService LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.UOY
    public final void LIZIZ() {
        if (this.LIZJ) {
            this.LIZ.LIZ();
        }
    }

    @Override // X.UOY
    public final View LIZJ() {
        AbstractC31219CNb cardPreview = this.LIZ;
        o.LJIIIIZZ(cardPreview, "cardPreview");
        return cardPreview;
    }

    @Override // X.UOY
    public final void LLLLZLL() {
        this.LIZ.LIZIZ();
    }

    @Override // X.UOY
    public final UOV LIZ(ViewGroup viewGroup) {
        return new UON(this.LIZJ, this, this.LIZIZ.Es0(viewGroup));
    }

    public UOM(Context context, android.net.Uri uri, ShortTouchService shortTouchService, boolean z) {
        this.LIZIZ = shortTouchService;
        this.LIZJ = z;
        AbstractC31219CNb nb = ((IBrowserService) CN1.LIZ(IBrowserService.class)).nb(uri, null, context);
        nb.setLayoutParams(new ViewGroup.LayoutParams(C15380j0.LIZ(70.0f), C15380j0.LIZ(70.0f)));
        this.LIZ = nb;
    }
}
