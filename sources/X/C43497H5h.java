package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H5h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43497H5h extends AbstractC43498H5i {
    public String LJIILJJIL = "ugc";
    public final C62822Ol8 LJIILL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 454));

    @Override // X.AbstractC43498H5i
    public final String LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        return null;
    }

    @Override // X.AbstractC43498H5i
    public final InterfaceC43506H5q LJIILL() {
        return (InterfaceC43506H5q) this.LJIILL.getValue();
    }

    @Override // X.AbstractC43498H5i
    public final boolean LJIIL() {
        if ((LJIILIIL().creativeModel.ugcTemplateData.enablePublishAsTemplate && LJIILIIL().ttStoryUploadModel != null) || !LJIILIIL().creativeModel.ugcTemplateData.enablePublishAsTemplate) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.UGC_TEMPLATE_UPLOAD;
    }

    @Override // X.AbstractC43498H5i
    public final String LJIJI() {
        return this.LJIILJJIL;
    }

    @Override // X.AbstractC43498H5i
    public final void LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
        if (o.LJ(videoPublishEditModel.creativeModel.ugcTemplateData.ugcTemplateTag, "ugc_template_tag_game") || C19N.LJ("enable_create_new_ugc_template_in_time_for_game", false)) {
            this.LJIILJJIL = "game_ugc";
        }
    }

    @Override // X.AbstractC43498H5i
    public final String LJIJ(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.ugcTemplateData.ugcTemplateZipUrl;
    }

    @Override // X.AbstractC43498H5i
    public final String LJIILJJIL(CreateAwemeResponse createAwemeResponse, VideoPublishEditModel videoPublishEditModel) {
        Long l;
        Aweme aweme;
        Music music;
        if (createAwemeResponse != null && (aweme = createAwemeResponse.aweme) != null && (music = aweme.getMusic()) != null) {
            l = Long.valueOf(music.getId());
        } else {
            l = null;
        }
        return String.valueOf(l);
    }
}
