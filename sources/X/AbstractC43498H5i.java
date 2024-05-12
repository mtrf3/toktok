package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.H5i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43498H5i extends AbstractC43455H3r {
    public String LJFF;
    public C67996QmO LJI;
    public VideoPublishEditModel LJII;
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public long LJIIJJI = -1;
    public long LJIIL = -1;
    public C43859HJf LJIILIIL;

    public abstract String LJIIJJI(VideoPublishEditModel videoPublishEditModel);

    public abstract boolean LJIIL();

    public abstract String LJIILJJIL(CreateAwemeResponse createAwemeResponse, VideoPublishEditModel videoPublishEditModel);

    public abstract InterfaceC43506H5q LJIILL();

    public void LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
    }

    public abstract String LJIJ(VideoPublishEditModel videoPublishEditModel);

    public abstract String LJIJI();

    public final VideoPublishEditModel LJIILIIL() {
        VideoPublishEditModel videoPublishEditModel = this.LJII;
        if (videoPublishEditModel != null) {
            return videoPublishEditModel;
        }
        o.LJIJI("editModel");
        throw null;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        String str;
        Aweme aweme;
        o.LJIIIZ(args, "args");
        this.LJI = c67996QmO;
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    VideoPublishEditModel videoPublishEditModel = ((C43403H1r) next).LIZ;
                    o.LJIIIZ(videoPublishEditModel, "<set-?>");
                    this.LJII = videoPublishEditModel;
                    LJIILLIIL(LJIILIIL());
                    this.LJFF = LJIILIIL().getCreationId();
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
                    if (createAwemeResponse == null || (aweme = createAwemeResponse.aweme) == null || (str = aweme.getAid()) == null) {
                        str = "";
                    }
                    this.LJIIIIZZ = str;
                    this.LJIIJ = LJIILJJIL(createAwemeResponse, LJIILIIL());
                    if (LJIIL()) {
                        LJIIZILJ(createAwemeResponse, true);
                        return;
                    }
                    String LJIJ = LJIJ(LJIILIIL());
                    if (((LJIJ == null || LJIJ.length() == 0) && (LJIJ = LJIIJJI(LJIILIIL())) == null) || LJIJ.length() == 0) {
                        LJIIZILJ(createAwemeResponse, true);
                        InterfaceC43506H5q LJIILL = LJIILL();
                        if (LJIILL == null) {
                            return;
                        }
                        LJIILL.LIZ(EnumC43505H5p.STAGE_PRE_UPLOAD, 3, this.LJIIIIZZ, this.LJIIIZ, null, 10005, "no_zip_path_msg", 0L);
                        return;
                    }
                    InterfaceC43506H5q LJIILL2 = LJIILL();
                    if (LJIILL2 != null) {
                        LJIILL2.LIZ(EnumC43505H5p.STAGE_PRE_UPLOAD, 0, this.LJIIIIZZ, this.LJIIIZ, null, null, null, 0L);
                    }
                    if (o.LJ("zip_url_invalid", LJIJ)) {
                        LJIIZILJ(createAwemeResponse, true);
                        InterfaceC43506H5q LJIILL3 = LJIILL();
                        if (LJIILL3 == null) {
                            return;
                        }
                        LJIILL3.LIZ(EnumC43505H5p.STAGE_PRE_UPLOAD, 2, this.LJIIIIZZ, this.LJIIIZ, null, 10001, "zip_url_invalid_error", 0L);
                        return;
                    }
                    LJIIZILJ(createAwemeResponse, true);
                    String creationId = LJIILIIL().getCreationId();
                    o.LJIIIIZZ(creationId, "editModel.creationId");
                    this.LJIIJJI = System.currentTimeMillis();
                    LJII().LIZIZ();
                    C76L<UploadAuthKeyConfig> ugcTemplateUploadAuthKeyConfig = ((UploaderRetrofitService) V0N.LJIILIIL(UploaderRetrofitService.class)).getUgcTemplateUploadAuthKeyConfig(creationId, LJIJI());
                    ugcTemplateUploadAuthKeyConfig.LJFF(new RunnableC65751PrH(ugcTemplateUploadAuthKeyConfig, new C43499H5j(this, LJIJ)), EnumC169566l6.LJLIL);
                    InterfaceC43506H5q LJIILL4 = LJIILL();
                    if (LJIILL4 != null) {
                        LJIILL4.LIZJ(LJIJ);
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIIZILJ(Object obj, boolean z) {
        C67996QmO c67996QmO = this.LJI;
        if (c67996QmO != null) {
            c67996QmO.LJ(obj, true);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }
}
