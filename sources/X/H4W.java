package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H4W extends AbstractC41873Gc1 {
    public VideoPublishEditModel LJ;
    public C43397H1l LJFF;
    public PublishModel LJI;
    public InterfaceC43387H1b LJII;

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
    }

    public H4W() {
        super(H1U.COVER_TEXT_UPLOAD, 2);
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    this.LJ = ((C43403H1r) next).LIZ;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43404H1s) {
                            if (next2 != null) {
                                this.LJI = ((C43404H1s) next2).LIZ;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43458H3u) {
                                        if (next3 != null) {
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it4.next();
                                                if (next4 instanceof C43397H1l) {
                                                    if (next4 != null) {
                                                        this.LJFF = (C43397H1l) next4;
                                                        Iterator<Object> it5 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it5.next();
                                                            if (next5 instanceof InterfaceC43387H1b) {
                                                                if (next5 != null) {
                                                                    this.LJII = (InterfaceC43387H1b) next5;
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public static H4V LJI(VideoPublishEditModel videoPublishEditModel, String publishId, boolean z) {
        H4V h4v = new H4V(new C6BK());
        o.LJIIIZ(publishId, "publishId");
        h4v.LIZIZ = publishId;
        h4v.LIZJ = videoPublishEditModel;
        h4v.LJII(H1T.COVER_TEXT_UPLOAD);
        h4v.LJIIIIZZ(EnumC42379GkB.VIDEO);
        h4v.LIZ();
        h4v.LIZIZ();
        h4v.LIZLLL(z);
        return h4v;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        H0H h0h;
        OSZ osz;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        Throwable cause = error.getCause();
        if (!(cause instanceof H0H) || (h0h = (H0H) cause) == null) {
            return;
        }
        C43397H1l c43397H1l = this.LJFF;
        if (c43397H1l != null) {
            String str = c43397H1l.LJLIL;
            PublishModel publishModel = this.LJI;
            if (publishModel != null) {
                boolean LIZIZ = publishModel.LIZIZ();
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel != null) {
                    String coverPath = h0h.getCoverPath();
                    if (coverPath == null || coverPath.length() == 0) {
                        osz = new OSZ(Boolean.FALSE, -1L);
                    } else {
                        File file = new File(coverPath);
                        osz = new OSZ(Boolean.valueOf(file.exists()), Long.valueOf(file.length()));
                    }
                    boolean booleanValue = ((Boolean) osz.getFirst()).booleanValue();
                    long longValue = ((Number) osz.getSecond()).longValue();
                    H4V LJI = LJI(videoPublishEditModel, str, LIZIZ);
                    LJI.LIZJ(new C43447H3j(h0h, coverPath));
                    C6BK LJFF = LJI.LJFF(EnumC42980Gts.FAILED);
                    LJFF.LIZ.put("file_exist", Boolean.valueOf(booleanValue));
                    LJFF.LIZ.put("file_size", Long.valueOf(longValue));
                    LJFF.LIZ.put("file_path", coverPath);
                    JSONObject metrics = LJFF.LJ();
                    InterfaceC43387H1b interfaceC43387H1b = this.LJII;
                    if (interfaceC43387H1b != null) {
                        C77413UZt LJ = interfaceC43387H1b.LJ();
                        o.LJIIIIZZ(metrics, "metrics");
                        LJ.getClass();
                        C43882HKc.LIZLLL(1, "aweme_movie_publish_error_rate_parallel", metrics, true);
                        return;
                    }
                    o.LJIJI("dependency");
                    throw null;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("publishModel");
            throw null;
        }
        o.LJIJI("publishId");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        C43397H1l c43397H1l = this.LJFF;
        if (c43397H1l != null) {
            String str = c43397H1l.LJLIL;
            PublishModel publishModel = this.LJI;
            if (publishModel != null) {
                boolean LIZIZ = publishModel.LIZIZ();
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel != null) {
                    JSONObject metrics = LJI(videoPublishEditModel, str, LIZIZ).LJFF(EnumC42980Gts.SUCCESS).LJ();
                    InterfaceC43387H1b interfaceC43387H1b = this.LJII;
                    if (interfaceC43387H1b != null) {
                        C77413UZt LJ = interfaceC43387H1b.LJ();
                        o.LJIIIIZZ(metrics, "metrics");
                        LJ.getClass();
                        C43882HKc.LIZLLL(0, "aweme_movie_publish_error_rate_parallel", metrics, true);
                        return;
                    }
                    o.LJIJI("dependency");
                    throw null;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("publishModel");
            throw null;
        }
        o.LJIJI("publishId");
        throw null;
    }
}
