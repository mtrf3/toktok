package X;

import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1N extends AbstractC43455H3r {
    public C67996QmO LJFF;
    public VideoPublishEditModel LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ = "";

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.PUGC_TEMPLATE_BINDING;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        String str;
        String str2;
        Aweme aweme;
        Music music;
        Aweme aweme2;
        o.LJIIIZ(args, "args");
        this.LJFF = c67996QmO;
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    this.LJI = ((C43403H1r) next).LIZ;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (obj instanceof CreateAwemeResponse) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (!(obj instanceof CreateAwemeResponse)) {
                        obj = null;
                    }
                    CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) obj;
                    Object obj2 = "";
                    if (createAwemeResponse == null || (aweme2 = createAwemeResponse.aweme) == null || (str = aweme2.getAid()) == null) {
                        str = "";
                    }
                    this.LJII = str;
                    if (createAwemeResponse != null && (aweme = createAwemeResponse.aweme) != null && (music = aweme.getMusic()) != null) {
                        obj2 = Long.valueOf(music.getId());
                    }
                    this.LJIIIZ = obj2.toString();
                    VideoPublishEditModel videoPublishEditModel = this.LJI;
                    if (videoPublishEditModel != null) {
                        PUgcTemplateData pUgcTemplateData = videoPublishEditModel.creativeModel.pugcTemplateData;
                        this.LJIIIIZZ = pUgcTemplateData.uploadVid;
                        if (pUgcTemplateData.canPostTemplate && videoPublishEditModel.ttStoryUploadModel == null) {
                            String str3 = this.LJII;
                            if (str3 == null || str3.length() == 0 || (str2 = this.LJIIIIZZ) == null || str2.length() == 0) {
                                H1P h1p = new H1P("template_bind_item_id_or_vid_null");
                                C67996QmO c67996QmO2 = this.LJFF;
                                if (c67996QmO2 != null) {
                                    c67996QmO2.LIZLLL(10105, h1p);
                                    return;
                                } else {
                                    o.LJIJI("nodeCallback");
                                    throw null;
                                }
                            }
                            LJII().LIZIZ();
                            C76L<String> ugcTemplateVideoBinding = ((UploaderRetrofitService) V0N.LJIILIIL(UploaderRetrofitService.class)).ugcTemplateVideoBinding(this.LJII, this.LJIIIIZZ, this.LJIIIZ, "pugc");
                            ugcTemplateVideoBinding.LJFF(new RunnableC65751PrH(ugcTemplateVideoBinding, new H1O(this)), EnumC169566l6.LJLIL);
                            return;
                        }
                        C2U6 c2u6 = new C2U6(null);
                        C67996QmO c67996QmO3 = this.LJFF;
                        if (c67996QmO3 != null) {
                            c67996QmO3.LJ(c2u6, true);
                            return;
                        } else {
                            o.LJIJI("nodeCallback");
                            throw null;
                        }
                    }
                    o.LJIJI("editModel");
                    throw null;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
