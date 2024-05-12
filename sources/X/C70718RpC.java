package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RpC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70718RpC extends AbstractC03160Am<C70717RpB> {
    public boolean LIZ = true;

    @Override // X.AbstractC03160Am
    public final boolean LIZ(C70717RpB c70717RpB, C70717RpB c70717RpB2) {
        if (this.LIZ && o.LJ(c70717RpB, c70717RpB2)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(C70717RpB c70717RpB, C70717RpB c70717RpB2) {
        String str;
        String str2;
        String str3;
        Video video;
        Video video2;
        Image image;
        Image image2;
        C70717RpB c70717RpB3 = c70717RpB;
        C70717RpB c70717RpB4 = c70717RpB2;
        if (this.LIZ) {
            ReviewMedia reviewMedia = c70717RpB3.LIZ;
            String str4 = null;
            if (reviewMedia != null && (image2 = reviewMedia.image) != null) {
                str = image2.getUri();
            } else {
                str = null;
            }
            ReviewMedia reviewMedia2 = c70717RpB4.LIZ;
            if (reviewMedia2 != null && (image = reviewMedia2.image) != null) {
                str2 = image.getUri();
            } else {
                str2 = null;
            }
            if (o.LJ(str, str2)) {
                ReviewMedia reviewMedia3 = c70717RpB3.LIZ;
                if (reviewMedia3 != null && (video2 = reviewMedia3.video) != null) {
                    str3 = video2.id;
                } else {
                    str3 = null;
                }
                ReviewMedia reviewMedia4 = c70717RpB4.LIZ;
                if (reviewMedia4 != null && (video = reviewMedia4.video) != null) {
                    str4 = video.id;
                }
                if (o.LJ(str3, str4)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC03160Am
    public final Object LIZJ(C70717RpB c70717RpB, C70717RpB c70717RpB2) {
        return c70717RpB2;
    }
}
