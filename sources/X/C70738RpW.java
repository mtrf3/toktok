package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.RpW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70738RpW implements InterfaceC73050Sli {
    public final /* synthetic */ C70756Rpo LIZ;

    @Override // X.InterfaceC73050Sli
    public final void LIZ() {
        Video video;
        Aweme LIZIZ;
        com.ss.android.ugc.aweme.feed.model.Video video2;
        PdpViewModel pdpViewModel;
        C70414RkI c70414RkI;
        C70756Rpo c70756Rpo = this.LIZ;
        MediaItem mediaItem = (MediaItem) ORZ.LJLLLLLL(c70756Rpo.LJJIJIIJI(), c70756Rpo.LJZ);
        if (mediaItem == null || (video = mediaItem.video) == null || (video2 = (LIZIZ = video.LIZIZ()).getVideo()) == null || (pdpViewModel = this.LIZ.LJLJLJ) == null || (c70414RkI = pdpViewModel.LLFII) == null) {
            return;
        }
        c70414RkI.LJJJJZ(video2.getVideoLength() * 1000, LIZIZ.getAid(), "head_pic");
    }

    public C70738RpW(C70756Rpo c70756Rpo) {
        this.LIZ = c70756Rpo;
    }
}
