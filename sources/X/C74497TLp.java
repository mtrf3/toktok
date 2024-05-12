package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TLp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74497TLp extends TL1<ProviderEffect> {
    @Override // X.TL1
    public final void LJJZZIII(ProviderEffect providerEffect) {
        String url;
        ProviderEffect stickerData = providerEffect;
        o.LJIIIZ(stickerData, "stickerData");
        ProviderEffect.StickerBean sticker_info = stickerData.getSticker_info();
        if (sticker_info != null && (url = sticker_info.getUrl()) != null && url.length() > 0) {
            V92 hierarchy = this.LJLJJI.getImageView().getHierarchy();
            o.LJIIIIZZ(hierarchy, "view.getImageView().hierarchy");
            hierarchy.LJIILJJIL(InterfaceC78716Uuu.LJJL);
            C170676mt.LIZIZ(this.LJLJJI.getImageView(), url, Bitmap.Config.ARGB_8888);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74497TLp(View itemView, TDE view, IDqS436S0100000_12 clickListener) {
        super(itemView, view, clickListener);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(clickListener, "clickListener");
    }
}
