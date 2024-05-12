package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class KNU implements LNI {
    public final /* synthetic */ DetailPageComponent LJLIL;

    public KNU(DetailPageComponent detailPageComponent) {
        this.LJLIL = detailPageComponent;
    }

    @Override // X.LNI
    public final void LJJLIIIJ(Aweme aweme) {
        DetailPageComponent detailPageComponent = this.LJLIL;
        detailPageComponent.LLFZ = aweme;
        if (!TextUtils.isEmpty(detailPageComponent.F3())) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("creation_id", detailPageComponent.LJZ.getCreationId());
            c188727au.LJIIIZ("duet_mode_type", detailPageComponent.F3());
            Aweme aweme2 = detailPageComponent.LLFZ;
            if (aweme2 != null) {
                c188727au.LJI("group_id", aweme2.getGroupId());
            }
            FMX.LJIIL("duet_mode_shoot_button_show", c188727au.LIZ);
        }
    }
}
