package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.SmT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73097SmT<T> implements Observer {
    public static final C73097SmT<T> LJLIL = new C73097SmT<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        Effect effect;
        C44236HXs c44236HXs = (C44236HXs) obj;
        ICommerceToolsStickerService LJIIL = CommerceToolsStickerServiceImpl.LJIIL();
        if (c44236HXs != null && (effect = c44236HXs.LJLIL) != null) {
            str = effect.getAdRawData();
        } else {
            str = null;
        }
        LJIIL.LJFF(str);
    }
}
