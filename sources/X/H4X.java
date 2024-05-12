package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H4X extends AbstractC41873Gc1 {
    public VideoPublishEditModel LJ;
    public C43458H3u LJFF;
    public C43397H1l LJI;
    public PublishModel LJII;
    public InterfaceC43387H1b LJIIIIZZ;

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
    }

    public H4X() {
        super(H1U.AUTH_KEY, 2);
    }

    public final H4V LJI(C6BK c6bk) {
        H4V h4v = new H4V(c6bk);
        C43397H1l c43397H1l = this.LJI;
        if (c43397H1l != null) {
            h4v.LJI(c43397H1l.LJLIL);
            VideoPublishEditModel videoPublishEditModel = this.LJ;
            if (videoPublishEditModel != null) {
                h4v.LIZJ = videoPublishEditModel;
                h4v.LJII(H1T.AUTH_KEY);
                h4v.LJIIIIZZ(EnumC42379GkB.VIDEO);
                h4v.LIZ();
                h4v.LIZIZ();
                PublishModel publishModel = this.LJII;
                if (publishModel != null) {
                    h4v.LIZLLL(publishModel.LIZIZ());
                    return h4v;
                }
                o.LJIJI("publishModel");
                throw null;
            }
            o.LJIJI("editModel");
            throw null;
        }
        o.LJIJI("publishId");
        throw null;
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
                                this.LJII = ((C43404H1s) next2).LIZ;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43458H3u) {
                                        if (next3 != null) {
                                            this.LJFF = (C43458H3u) next3;
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it4.next();
                                                if (next4 instanceof C43397H1l) {
                                                    if (next4 != null) {
                                                        this.LJI = (C43397H1l) next4;
                                                        Iterator<Object> it5 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it5.next();
                                                            if (next5 instanceof InterfaceC43387H1b) {
                                                                if (next5 != null) {
                                                                    this.LJIIIIZZ = (InterfaceC43387H1b) next5;
                                                                    C6BK c6bk = new C6BK();
                                                                    InterfaceC43387H1b interfaceC43387H1b = this.LJIIIIZZ;
                                                                    if (interfaceC43387H1b != null) {
                                                                        C77413UZt LJ = interfaceC43387H1b.LJ();
                                                                        H4V LJI = LJI(c6bk);
                                                                        LJI.LJ();
                                                                        C6BK LJFF = LJI.LJFF(EnumC42980Gts.START);
                                                                        VideoPublishEditModel videoPublishEditModel = this.LJ;
                                                                        if (videoPublishEditModel != null) {
                                                                            LJFF.LIZ.put("is_hd_video", Integer.valueOf(C44546He2.LIZLLL(videoPublishEditModel) ? 1 : 0));
                                                                            JSONObject LJ2 = LJFF.LJ();
                                                                            o.LJIIIIZZ(LJ2, "resolveMonitorMetricsBui…\n                .build()");
                                                                            LJ.getClass();
                                                                            C43882HKc.LIZLLL(-1, "aweme_movie_publish_error_rate_parallel", LJ2, true);
                                                                            return;
                                                                        }
                                                                        o.LJIJI("editModel");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("dependency");
                                                                    throw null;
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

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        String str;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        int LJI = C42991Gu3.LJI(11, error);
        H4V LJI2 = LJI(new C6BK());
        LJI2.LJ();
        LJI2.LIZJ(new C43449H3l(error));
        C6BK LJFF = LJI2.LJFF(EnumC42980Gts.FAILED);
        InterfaceC43387H1b interfaceC43387H1b = this.LJIIIIZZ;
        if (interfaceC43387H1b != null) {
            C77413UZt LJ = interfaceC43387H1b.LJ();
            C43458H3u c43458H3u = this.LJFF;
            if (c43458H3u != null) {
                if (c43458H3u.LIZIZ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                LJFF.LIZ.put("click_publish", str);
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel != null) {
                    LJFF.LIZ.put("is_hd_video", Integer.valueOf(C44546He2.LIZLLL(videoPublishEditModel) ? 1 : 0));
                    JSONObject LJ2 = LJFF.LJ();
                    o.LJIIIIZZ(LJ2, "metricsBuilder.addValueP…\n                .build()");
                    LJ.getClass();
                    C43882HKc.LIZLLL(LJI, "aweme_movie_publish_error_rate_parallel", LJ2, true);
                    return;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("clickPublishWaiter");
            throw null;
        }
        o.LJIJI("dependency");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        H4V LJI = LJI(new C6BK());
        LJI.LJ();
        JSONObject metrics = LJI.LJFF(EnumC42980Gts.SUCCESS).LJ();
        InterfaceC43387H1b interfaceC43387H1b = this.LJIIIIZZ;
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
}
