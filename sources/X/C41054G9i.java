package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.G9i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41054G9i extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C41051G9f LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41054G9i(C41051G9f c41051G9f) {
        super(600, 2);
        this.LJLJJLL = c41051G9f;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        UrlModel urlModel;
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        o.LJIIIZ(v, "v");
        C41051G9f c41051G9f = this.LJLJJLL;
        if (!c41051G9f.LLFF && !c41051G9f.LJZL) {
            C164096cH c164096cH = c41051G9f.LJLJLJ;
            if (c164096cH != null) {
                VideoPublishEditModel videoPublishEditModel = c41051G9f.LJZ;
                if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null) {
                    urlModel = editPostModel.getVideoCoverAddr();
                } else {
                    urlModel = null;
                }
                c41051G9f.LLJILJIL(c164096cH, urlModel);
            } else {
                o.LJIJI("videoThumbImageView");
                throw null;
            }
        }
        C41051G9f c41051G9f2 = this.LJLJJLL;
        C164096cH c164096cH2 = c41051G9f2.LJLJLJ;
        if (c164096cH2 != null) {
            c41051G9f2.LLJJLIIIJLLLLLLLZ(0, c164096cH2);
        } else {
            o.LJIJI("videoThumbImageView");
            throw null;
        }
    }
}
