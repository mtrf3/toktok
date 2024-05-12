package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.jvm.internal.o;

/* renamed from: X.MJj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56603MJj extends AbstractC03160Am<NewFaceStickerBean> {
    @Override // X.AbstractC03160Am
    public final boolean LIZ(NewFaceStickerBean newFaceStickerBean, NewFaceStickerBean newFaceStickerBean2) {
        return o.LJ(newFaceStickerBean, newFaceStickerBean2);
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(NewFaceStickerBean newFaceStickerBean, NewFaceStickerBean newFaceStickerBean2) {
        NewFaceStickerBean newFaceStickerBean3 = newFaceStickerBean;
        NewFaceStickerBean newFaceStickerBean4 = newFaceStickerBean2;
        if (o.LJ(newFaceStickerBean3.id, newFaceStickerBean4.id) && o.LJ(newFaceStickerBean3.name, newFaceStickerBean4.name) && o.LJ(newFaceStickerBean3.iconUrl, newFaceStickerBean4.iconUrl) && o.LJ(newFaceStickerBean3.relatedAweme, newFaceStickerBean4.relatedAweme) && newFaceStickerBean3.featureVideoSource == newFaceStickerBean4.featureVideoSource) {
            return true;
        }
        return false;
    }
}
