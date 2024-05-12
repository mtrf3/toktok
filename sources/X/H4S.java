package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H4S extends AbstractC41873Gc1 {
    public VideoPublishEditModel LJ;
    public C43458H3u LJFF;
    public C43397H1l LJI;
    public PublishModel LJII;
    public InterfaceC43387H1b LJIIIIZZ;
    public C41875Gc3 LJIIIZ;

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H4S() {
        /*
            r2 = this;
            X.H1U r1 = X.H1U.COMPILE
            java.util.List r0 = X.C47261Igj.LJJIJ(r1)
            r2.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4S.<init>():void");
    }

    public final H4V LJI(C6BK c6bk) {
        H4V h4v = new H4V(c6bk);
        C43397H1l c43397H1l = this.LJI;
        if (c43397H1l != null) {
            h4v.LJI(c43397H1l.LJLIL);
            VideoPublishEditModel videoPublishEditModel = this.LJ;
            if (videoPublishEditModel != null) {
                h4v.LIZJ = videoPublishEditModel;
                h4v.LJII(H1T.COMPILE);
                h4v.LJIIIIZZ(EnumC42379GkB.VIDEO);
                h4v.LIZ();
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

    @Override // X.AbstractC41873Gc1, X.InterfaceC36938Eec
    public void onEvent(AbstractC41872Gc0 event) {
        o.LJIIIZ(event, "event");
        super.onEvent(event);
        if (event.LIZ == H1U.COMPILE && (event instanceof C41870Gby)) {
            this.LJIIIZ = event.LIZIZ;
        }
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
                                                                    H4V LJI = LJI(new C6BK());
                                                                    LJI.LIZIZ();
                                                                    LJI.LJ();
                                                                    JSONObject LJ = LJI.LJFF(EnumC42980Gts.START).LJ();
                                                                    o.LJIIIIZZ(LJ, "resolveMonitorMetricsBui…ART)\n            .build()");
                                                                    InterfaceC43387H1b interfaceC43387H1b = this.LJIIIIZZ;
                                                                    if (interfaceC43387H1b != null) {
                                                                        interfaceC43387H1b.LJ().getClass();
                                                                        C43882HKc.LIZLLL(-1, "aweme_movie_publish_error_rate_parallel", LJ, true);
                                                                        return;
                                                                    } else {
                                                                        o.LJIJI("dependency");
                                                                        throw null;
                                                                    }
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
        String str2;
        C42990Gu2 c42990Gu2;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        int LJFF = C42991Gu3.LJFF(error);
        H4V LJI = LJI(new C6BK());
        LJI.LIZIZ();
        LJI.LJ();
        LJI.LIZJ(new H39(error));
        C6BK LJFF2 = LJI.LJFF(EnumC42980Gts.FAILED);
        C43458H3u c43458H3u = this.LJFF;
        if (c43458H3u != null) {
            if (c43458H3u.LIZIZ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LJFF2.LIZ.put("click_publish", str);
            Throwable cause = error.getCause();
            if ((cause instanceof C42990Gu2) && (c42990Gu2 = (C42990Gu2) cause) != null) {
                str2 = c42990Gu2.getVESDKErrorCode();
            } else {
                str2 = null;
            }
            LJFF2.LIZ.put("vesdk_error_code", str2);
            VideoPublishEditModel videoPublishEditModel = this.LJ;
            if (videoPublishEditModel != null) {
                LJFF2.LIZIZ(Integer.valueOf(((Boolean) C43529H6n.LIZ.getValue()).booleanValue() ? 1 : 0), "hit_refactor_expr");
                LJFF2.LIZIZ(Integer.valueOf(videoPublishEditModel.isSyntheticHardEncode ? 1 : 0), "is_hard_code");
                HI4 hi4 = videoPublishEditModel.creativeModel.commonMobModel.vqCompileDataModel;
                String str3 = hi4.LIZ;
                if (str3 == null) {
                    str3 = "unknown";
                }
                LJFF2.LIZLLL("compile_resolution", str3);
                LJFF2.LIZIZ(Integer.valueOf(hi4.LJI), "encode_stand");
                LJFF2.LIZIZ(Integer.valueOf(hi4.LJII ? 1 : 0), "have_watermark");
                JSONObject jsonObject = LJFF2.LJ();
                InterfaceC43387H1b interfaceC43387H1b = this.LJIIIIZZ;
                if (interfaceC43387H1b != null) {
                    C77413UZt LJ = interfaceC43387H1b.LJ();
                    o.LJIIIIZZ(jsonObject, "jsonObject");
                    LJ.getClass();
                    C43882HKc.LIZLLL(LJFF, "aweme_movie_publish_error_rate_parallel", jsonObject, true);
                    return;
                }
                o.LJIJI("dependency");
                throw null;
            }
            o.LJIJI("editModel");
            throw null;
        }
        o.LJIJI("clickPublishWaiter");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        String str;
        o.LJIIIZ(sourceTag, "sourceTag");
        Object obj2 = ((LinkedHashMap) this.LIZIZ).get(H1U.COMPILE);
        o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.SynthetiseResult");
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj2;
        long currentTimeMillis = System.currentTimeMillis();
        C41875Gc3 c41875Gc3 = this.LJIIIZ;
        if (c41875Gc3 != null) {
            long j = currentTimeMillis - c41875Gc3.LJLIL;
            H4V LJI = LJI(new C6BK());
            LJI.LIZIZ();
            LJI.LJ();
            C6BK LJFF = LJI.LJFF(EnumC42980Gts.SUCCESS);
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
                    if (new File(videoPublishEditModel.mParallelUploadOutputFile).exists()) {
                        if (this.LJ != null) {
                            LJFF.LIZ.put("speed", Float.valueOf(r0.getVideoLength() / ((float) j)));
                            LJFF.LIZJ(Long.valueOf(j), "duration");
                        } else {
                            o.LJIJI("editModel");
                            throw null;
                        }
                    }
                    if (synthetiseResult.audioLength - synthetiseResult.videoLength > 3000.0f) {
                        LJFF.LIZ.put("compile_lost_video", Boolean.TRUE);
                        LJFF.LIZLLL("fileInfo", String.valueOf(obj));
                    }
                    List<String> skipFrameLogList = synthetiseResult.getSkipFrameLogList();
                    o.LJIIIIZZ(skipFrameLogList, "compileResult.skipFrameLogList");
                    if (!skipFrameLogList.isEmpty()) {
                        LJFF.LIZ.put("compile_skip_frame", skipFrameLogList.toString());
                        LJFF.LIZIZ(Integer.valueOf(skipFrameLogList.size()), "compile_skip_frame_size");
                    }
                    JSONObject jsonObject = LJFF.LJ();
                    InterfaceC43387H1b interfaceC43387H1b = this.LJIIIIZZ;
                    if (interfaceC43387H1b != null) {
                        C77413UZt LJ = interfaceC43387H1b.LJ();
                        o.LJIIIIZZ(jsonObject, "jsonObject");
                        LJ.getClass();
                        C43882HKc.LIZLLL(0, "aweme_movie_publish_error_rate_parallel", jsonObject, true);
                        return;
                    }
                    o.LJIJI("dependency");
                    throw null;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("clickPublishWaiter");
            throw null;
        }
        o.LJIJI("compileStartTime");
        throw null;
    }
}
