package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import defpackage.g0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.H4q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43480H4q extends AbstractC41873Gc1 {
    public final String LJ;
    public VideoPublishEditModel LJFF;
    public C43458H3u LJI;
    public C43397H1l LJII;
    public PublishModel LJIIIIZZ;
    public InterfaceC43387H1b LJIIIZ;
    public C41875Gc3 LJIIJ;
    public C41875Gc3 LJIIJJI;
    public C41875Gc3 LJIIL;
    public boolean LJIILIIL;
    public C41875Gc3 LJIILJJIL;
    public C41875Gc3 LJIILL;

    public C43480H4q() {
        super("DefaultWavePublisher", (List<? extends Object>) C47261Igj.LJJIJIIJI(H1U.COMPILE, H1U.UPLOAD, H1U.CREATE_AWEME));
        this.LJ = "DefaultWavePublisher";
    }

    public final C145995oB LJII() {
        C43397H1l c43397H1l = this.LJII;
        if (c43397H1l != null) {
            C60016Ngy c60016Ngy = new C60016Ngy(c43397H1l.LJLIL);
            VideoPublishEditModel videoPublishEditModel = this.LJFF;
            if (videoPublishEditModel != null) {
                C145995oB c145995oB = new C145995oB();
                c60016Ngy.LIZ(videoPublishEditModel, c145995oB);
                return c145995oB;
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
        Object obj = event.LIZ;
        if (obj == H1U.UPLOAD) {
            if (event instanceof C41870Gby) {
                this.LJIIJ = event.LIZIZ;
                return;
            } else {
                if (!(event instanceof C41852Gbg)) {
                    return;
                }
                this.LJIIJJI = event.LIZIZ;
                return;
            }
        }
        if (obj == H1U.CREATE_AWEME) {
            if (!(event instanceof C41852Gbg)) {
                return;
            }
            this.LJIIL = event.LIZIZ;
        } else {
            if (obj != H1U.COMPILE) {
                return;
            }
            if (event instanceof C41870Gby) {
                this.LJIILJJIL = event.LIZIZ;
            } else {
                if (!(event instanceof C41852Gbg)) {
                    return;
                }
                o.LJII(((C41852Gbg) event).LIZLLL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.SynthetiseResult");
                this.LJIILL = event.LIZIZ;
            }
        }
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, C145995oB c145995oB) {
        String str;
        if (H7R.LJJLIIIJL(videoPublishEditModel) || videoPublishEditModel.isFromAutoCutAnchor()) {
            String str2 = "";
            c145995oB.LIZLLL("followed_item_id", H7R.LJIIZILJ(videoPublishEditModel, ""));
            if (H7R.LJJLIIIJL(videoPublishEditModel)) {
                String str3 = videoPublishEditModel.creativeModel.ugcTemplateData.ugcTemplateId;
                if (str3 == null) {
                    str3 = "";
                }
                c145995oB.LIZLLL("followed_template_id", str3);
                if (H7R.LJJJLIIL(videoPublishEditModel)) {
                    str = "pugc";
                } else {
                    str = "ugc";
                }
                c145995oB.LIZLLL("followed_template_type", str);
            }
            if (videoPublishEditModel.isFromAutoCutAnchor()) {
                String str4 = videoPublishEditModel.creativeModel.autoCutAnchorModel.templateId;
                if (str4 != null) {
                    str2 = str4;
                }
                c145995oB.LIZLLL("followed_template_id", str2);
                c145995oB.LIZLLL("followed_template_type", "autocut");
            }
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
                    this.LJFF = ((C43403H1r) next).LIZ;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43404H1s) {
                            if (next2 != null) {
                                this.LJIIIIZZ = ((C43404H1s) next2).LIZ;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43458H3u) {
                                        if (next3 != null) {
                                            this.LJI = (C43458H3u) next3;
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it4.next();
                                                if (next4 instanceof C43397H1l) {
                                                    if (next4 != null) {
                                                        this.LJII = (C43397H1l) next4;
                                                        Iterator<Object> it5 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it5.next();
                                                            if (next5 instanceof InterfaceC43387H1b) {
                                                                if (next5 != null) {
                                                                    this.LJIIIZ = (InterfaceC43387H1b) next5;
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

    public final void LJIIIIZZ(String str, java.util.Map<String, String> map) {
        InterfaceC43387H1b interfaceC43387H1b = this.LJIIIZ;
        if (interfaceC43387H1b != null) {
            interfaceC43387H1b.LIZJ().getClass();
            FMX.LJIIL(str, map);
        } else {
            o.LJIJI("dependency");
            throw null;
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        int i3;
        String str;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        C145995oB LJII = LJII();
        VideoPublishEditModel videoPublishEditModel = this.LJFF;
        String str2 = null;
        if (videoPublishEditModel != null) {
            LJII.LJI("shoot_way", videoPublishEditModel.mShootWay);
            VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
            if (videoPublishEditModel2 != null) {
                LJII.LIZ(videoPublishEditModel2.isOpenForegroundPublish ? 1 : 0, "is_open_foreground");
                VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
                if (videoPublishEditModel3 != null) {
                    LJII.LIZ(videoPublishEditModel3.isBackgroundPublish ? 1 : 0, "is_background_publish");
                    VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
                    if (videoPublishEditModel4 != null) {
                        if (videoPublishEditModel4.ttStoryUploadModel != null) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        LJII.LIZ(i3, "is_story");
                        C43458H3u c43458H3u = this.LJI;
                        if (c43458H3u != null) {
                            if (c43458H3u.LIZIZ) {
                                str = "1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            LJII.LJI("is_click_publish", str);
                            VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
                            if (videoPublishEditModel5 != null) {
                                LJII.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel5));
                                VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
                                if (videoPublishEditModel6 != null) {
                                    OSZ LJJIIJ = g0.LJJIIJ(videoPublishEditModel6);
                                    int intValue = ((Number) LJJIIJ.getFirst()).intValue();
                                    int intValue2 = ((Number) LJJIIJ.getSecond()).intValue();
                                    LJII.LIZ(intValue2, "pic_cnt");
                                    LJII.LIZLLL("mix_type", C78977Uz7.LJJJJJ(intValue, intValue2));
                                    if (cause instanceof C42985Gtx) {
                                        Object obj = ((C42985Gtx) cause).LIZ;
                                        if (obj != null) {
                                            str2 = obj.toString();
                                        }
                                        LJII.LIZLLL("cancel_reason", str2);
                                    } else if (cause instanceof C42984Gtw) {
                                        LJII.LIZ(((C42984Gtw) cause).LIZ.getCode(), "error_code");
                                    }
                                    java.util.Map<String, String> map = LJII.LIZ;
                                    o.LJIIIIZZ(map, "uploadParam.builder()");
                                    LJIIIIZZ("publish_cancel", map);
                                    return;
                                }
                                o.LJIJI("editModel");
                                throw null;
                            }
                            o.LJIJI("editModel");
                            throw null;
                        }
                        o.LJIJI("clickPublishWaiter");
                        throw null;
                    }
                    o.LJIJI("editModel");
                    throw null;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("editModel");
            throw null;
        }
        o.LJIJI("editModel");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        int i3;
        String str;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        C145995oB LJII = LJII();
        VideoPublishEditModel videoPublishEditModel = this.LJFF;
        if (videoPublishEditModel != null) {
            LJII.LJI("shoot_way", videoPublishEditModel.mShootWay);
            VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
            if (videoPublishEditModel2 != null) {
                LJII.LIZ(videoPublishEditModel2.isOpenForegroundPublish ? 1 : 0, "is_open_foreground");
                VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
                if (videoPublishEditModel3 != null) {
                    LJII.LIZ(videoPublishEditModel3.isBackgroundPublish ? 1 : 0, "is_background_publish");
                    VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
                    if (videoPublishEditModel4 != null) {
                        if (videoPublishEditModel4.ttStoryUploadModel != null) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        LJII.LIZ(i3, "is_story");
                        LJII.LIZ(error.getCode(), "error_code");
                        C43458H3u c43458H3u = this.LJI;
                        if (c43458H3u != null) {
                            if (c43458H3u.LIZIZ) {
                                str = "1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            LJII.LJI("is_click_publish", str);
                            VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
                            if (videoPublishEditModel5 != null) {
                                LJII.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel5));
                                VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
                                if (videoPublishEditModel6 != null) {
                                    OSZ LJJIIJ = g0.LJJIIJ(videoPublishEditModel6);
                                    int intValue = ((Number) LJJIIJ.getFirst()).intValue();
                                    int intValue2 = ((Number) LJJIIJ.getSecond()).intValue();
                                    LJII.LIZ(intValue2, "pic_cnt");
                                    LJII.LIZLLL("mix_type", C78977Uz7.LJJJJJ(intValue, intValue2));
                                    java.util.Map<String, String> map = LJII.LIZ;
                                    o.LJIIIIZZ(map, "uploadParam.builder()");
                                    LJIIIIZZ("publish_fail", map);
                                    return;
                                }
                                o.LJIJI("editModel");
                                throw null;
                            }
                            o.LJIJI("editModel");
                            throw null;
                        }
                        o.LJIJI("clickPublishWaiter");
                        throw null;
                    }
                    o.LJIJI("editModel");
                    throw null;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("editModel");
            throw null;
        }
        o.LJIJI("editModel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0382, code lost:
    
        if (r2 > 0) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0a09  */
    @Override // X.AbstractC41873Gc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.Object r29, java.lang.Object r30, boolean r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 2645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43480H4q.LJFF(java.lang.Object, java.lang.Object, boolean, int, int):void");
    }
}
