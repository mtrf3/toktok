package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TL2 extends TL1<Effect> {
    @Override // X.TL1
    public final void LJJZZIII(Effect effect) {
        List<String> urlList;
        String str;
        Effect stickerData = effect;
        o.LJIIIZ(stickerData, "stickerData");
        UrlModel iconUrl = stickerData.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) ORZ.LJLLLLLL(0, urlList)) != null) {
            C78764Uvg.LJIIIZ(this.LJLJJI.getImageView(), str, -1, -1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TL2(View itemView, TDE view, IDqS436S0100000_12 clickListener) {
        super(itemView, view, clickListener);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(clickListener, "clickListener");
    }
}
