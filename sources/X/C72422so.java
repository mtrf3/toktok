package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSet;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerUrlStruct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2so, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72422so extends C72462ss {
    public StickerSetInfo LIZIZ;

    @Override // X.InterfaceC105334Bl
    public final int LJ() {
        return 9;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final String LJIIIIZZ() {
        StickerUrlStruct iconUrl;
        UrlModel midResolutionUrl;
        List<String> urlList;
        StickerSetInfo stickerSetInfo = this.LIZIZ;
        if (stickerSetInfo != null && (iconUrl = stickerSetInfo.getIconUrl()) != null && (midResolutionUrl = iconUrl.getMidResolutionUrl()) != null && (urlList = midResolutionUrl.getUrlList()) != null) {
            return (String) ORZ.LJLLLLLL(0, urlList);
        }
        return null;
    }

    @Override // X.C72462ss, X.InterfaceC105334Bl
    public final List<C105454Bx> LJIIJJI() {
        Long setId;
        List<SetSticker> stickers;
        StickerSetInfo stickerSetInfo = this.LIZIZ;
        if (stickerSetInfo != null && (setId = stickerSetInfo.getSetId()) != null) {
            StickerSet stickerSet = C71442rE.LJII.LJIIL(Long.valueOf(setId.longValue())).LIZ;
            if (stickerSet != null && (stickers = stickerSet.getStickers()) != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(stickers, 10));
                for (SetSticker setSticker : stickers) {
                    C105454Bx c105454Bx = new C105454Bx();
                    c105454Bx.LJ = setSticker;
                    arrayList.add(c105454Bx);
                }
                return arrayList;
            }
        }
        return C61878OQg.INSTANCE;
    }
}
