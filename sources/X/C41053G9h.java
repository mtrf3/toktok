package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.G9h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41053G9h implements InterfaceC35868E5w {
    public final /* synthetic */ C41051G9f LIZ;

    public C41053G9h(C41051G9f c41051G9f) {
        this.LIZ = c41051G9f;
    }

    @Override // X.InterfaceC35868E5w
    public final void LIZ(EnumC41264GHk networkStatus) {
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        o.LJIIIZ(networkStatus, "networkStatus");
        int i = C41065G9t.LIZ[networkStatus.ordinal()];
        if (i != 1 && i != 2) {
            return;
        }
        C41051G9f c41051G9f = this.LIZ;
        if (c41051G9f.LLFF || c41051G9f.LJZL) {
            return;
        }
        C164096cH c164096cH = c41051G9f.LJLJLJ;
        UrlModel urlModel = null;
        if (c164096cH != null) {
            VideoPublishEditModel videoPublishEditModel = c41051G9f.LJZ;
            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null) {
                urlModel = editPostModel.getVideoCoverAddr();
            }
            c41051G9f.LLJILJIL(c164096cH, urlModel);
            return;
        }
        o.LJIJI("videoThumbImageView");
        throw null;
    }
}
