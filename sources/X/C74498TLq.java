package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.UrlModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TLq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74498TLq extends TL1<InfoStickerEffect> {
    @Override // X.TL1
    public final void LJJZZIII(InfoStickerEffect infoStickerEffect) {
        ProviderEffect.StickerBean sticker_info;
        String url;
        UrlModel icon_url;
        List<String> url_list;
        InfoStickerEffect stickerData = infoStickerEffect;
        o.LJIIIZ(stickerData, "stickerData");
        Integer source = stickerData.getSource();
        if (source == null) {
            return;
        }
        if (source.intValue() == 1) {
            Effect loki_effect = stickerData.getLoki_effect();
            if (loki_effect == null || (icon_url = loki_effect.getIcon_url()) == null || (url_list = icon_url.getUrl_list()) == null || !(!url_list.isEmpty())) {
                return;
            }
            V92 hierarchy = this.LJLJJI.getImageView().getHierarchy();
            o.LJIIIIZZ(hierarchy, "view.getImageView().hierarchy");
            hierarchy.LJIILJJIL(InterfaceC78716Uuu.LJJL);
            C72790ShW imageView = this.LJLJJI.getImageView();
            com.ss.android.ugc.aweme.base.model.UrlModel urlModel = new com.ss.android.ugc.aweme.base.model.UrlModel();
            urlModel.setUrlList(url_list);
            C170676mt.LIZ(imageView, C78764Uvg.LJIIJJI(urlModel, null, W92.MEDIUM, null, Bitmap.Config.ARGB_8888), null, true);
            return;
        }
        if (source.intValue() != 2 || (sticker_info = stickerData.getSticker().getSticker_info()) == null || (url = sticker_info.getUrl()) == null || url.length() <= 0) {
            return;
        }
        V92 hierarchy2 = this.LJLJJI.getImageView().getHierarchy();
        o.LJIIIIZZ(hierarchy2, "view.getImageView().hierarchy");
        hierarchy2.LJIILJJIL(InterfaceC78716Uuu.LJJL);
        C170676mt.LIZIZ(this.LJLJJI.getImageView(), url, Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74498TLq(View itemView, TDE view, IDqS436S0100000_12 clickListener) {
        super(itemView, view, clickListener);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(clickListener, "clickListener");
    }
}
