package X;

import android.view.View;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.MediaSafetyModel;

/* renamed from: X.Lml, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55279Lml implements LNI {
    public final /* synthetic */ DetailPageComponent LJLIL;

    public C55279Lml(DetailPageComponent detailPageComponent) {
        this.LJLIL = detailPageComponent;
    }

    @Override // X.LNI
    public final void LJJLIIIJ(Aweme aweme) {
        MediaSafetyModel dMMediaSafetyModel;
        if (aweme != null && (dMMediaSafetyModel = aweme.getDMMediaSafetyModel()) != null && dMMediaSafetyModel.isSafeMode()) {
            this.LJLIL.C3();
            return;
        }
        View view = this.LJLIL.LJLLJ;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }
}
