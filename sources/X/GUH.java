package X;

import Y.ARunnableS26S0200000_7;
import Y.ARunnableS43S0100000_7;
import Y.ARunnableS8S1100000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.scheduler.ParallelPublishCallback;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUH {
    public static final GUH LIZ = new GUH();
    public static final GUJ LIZIZ = new GUJ();
    public static final GUI LIZJ;
    public static final ExecutorService LIZLLL;
    public static final ParallelPublishCallback LJ;
    public static InterfaceC41597GUf LJFF;
    public static volatile GUQ LJI;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ParallelPublishCallback parallelPublishCallback;
        GUI gui = new GUI();
        LIZJ = gui;
        C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
        c38027EwB.LIZIZ = "PublishScheduler";
        LIZLLL = C37191Eih.LIZ(c38027EwB);
        if (GUW.LIZIZ() || C41637GVt.LIZ()) {
            parallelPublishCallback = new ParallelPublishCallback(gui, C41593GUb.LJLIL);
        } else {
            parallelPublishCallback = new ParallelPublishCallback(gui, null, 2, 0 == true ? 1 : 0);
        }
        LJ = parallelPublishCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIIL() {
        /*
            X.GUI r3 = X.GUH.LIZJ
            monitor-enter(r3)
            java.util.List<X.GUU> r1 = r3.LIZ     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "mPublishRecordList"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L30
        Le:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L2c
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L30
            r0 = r1
            X.GUU r0 = (X.GUU) r0     // Catch: java.lang.Throwable -> L30
            X.GOb r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0 instanceof X.C41442GOg     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto Le
        L21:
            X.GUU r1 = (X.GUU) r1     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L29
            java.lang.String r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L2e
        L29:
            java.lang.String r0 = ""
            goto L2e
        L2c:
            r1 = 0
            goto L21
        L2e:
            monitor-exit(r3)
            return r0
        L30:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GUH.LJIIL():java.lang.String");
    }

    public static final List<PublishModel> LJIILIIL() {
        List<PublishModel> LIZLLL2 = LIZJ.LIZLLL();
        ArrayList arrayList = new ArrayList();
        for (PublishModel publishModel : LIZLLL2) {
            if (LJIJ(publishModel)) {
                arrayList.add(publishModel);
            }
        }
        return arrayList;
    }

    public static final int LJIIZILJ() {
        return LIZJ.LJFF();
    }

    public static final synchronized void LJJIFFI() {
        synchronized (GUH.class) {
            GUI gui = LIZJ;
            if (gui.LJFF() <= 0) {
                H78.LJI("PublishSchedule startCacheTask PublishTaskList size zero, skip");
                return;
            }
            if (gui.LJIIIZ()) {
                H78.LJI("PublishSchedule startCacheTask taskIsRunning skip");
                return;
            }
            if (GUW.LIZIZ()) {
                List<GUU> mPublishRecordList = gui.LIZ;
                o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
                Iterator<GUU> it = mPublishRecordList.iterator();
                while (it.hasNext()) {
                    if (it.next().LIZLLL instanceof C41438GOc) {
                        H78.LJI("PublishSchedule startCacheTask taskPaused, so taskResume");
                        LIZJ.LJIIJ();
                        return;
                    }
                }
            }
            GUI gui2 = LIZJ;
            GUU LJII = gui2.LJII();
            if (LJII == null) {
                H78.LJI("PublishSchedule startCacheTask not found PublishRecord, skip");
                return;
            }
            AbstractC41437GOb abstractC41437GOb = LJII.LIZLLL;
            if (GUW.LIZIZ()) {
                if (!o.LJ(abstractC41437GOb, GOT.LIZ)) {
                    if (abstractC41437GOb.LIZIZ() || abstractC41437GOb.LIZ()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Pause type, PublishRecord state incorrect ");
                        LIZ2.append(abstractC41437GOb);
                        LIZ2.append(", task = ");
                        LIZ2.append(LJII);
                        LIZ2.append(".task, PublishTaskList size = ");
                        LIZ2.append(gui2.LJFF());
                        C77123UOp.LJJJIL(new GUP(X1D.LIZIZ(LIZ2)));
                        gui2.LJIIIIZZ(LJII);
                        LJJIFFI();
                        return;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Pause type, PublishRecord state incorrect ");
                    LIZ3.append(abstractC41437GOb);
                    LIZ3.append(", task = ");
                    LIZ3.append(LJII);
                    LIZ3.append(".task, PublishTaskList size = ");
                    LIZ3.append(gui2.LJFF());
                    throw new GUP(X1D.LIZIZ(LIZ3));
                }
            } else if (GUW.LIZ()) {
                if (!o.LJ(abstractC41437GOb, GOT.LIZ) && !abstractC41437GOb.LIZ()) {
                    if (abstractC41437GOb.LIZIZ()) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("Cancel type, PublishRecord state incorrect ");
                        LIZ4.append(abstractC41437GOb);
                        LIZ4.append(", task = ");
                        LIZ4.append(LJII);
                        LIZ4.append(".task, PublishTaskList size = ");
                        LIZ4.append(gui2.LJFF());
                        C77123UOp.LJJJIL(new GUP(X1D.LIZIZ(LIZ4)));
                        gui2.LJIIIIZZ(LJII);
                        LJJIFFI();
                        return;
                    }
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("Cancel type, PublishRecord state incorrect ");
                    LIZ5.append(abstractC41437GOb);
                    LIZ5.append(", task = ");
                    LIZ5.append(LJII);
                    LIZ5.append(".task, PublishTaskList size = ");
                    LIZ5.append(gui2.LJFF());
                    throw new GUP(X1D.LIZIZ(LIZ5));
                }
            } else if (C41637GVt.LIZ()) {
                if (!o.LJ(abstractC41437GOb, GOT.LIZ)) {
                    if (abstractC41437GOb.LIZIZ() || abstractC41437GOb.LIZ()) {
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("Continue type, PublishRecord state incorrect ");
                        LIZ6.append(abstractC41437GOb);
                        LIZ6.append(", task = ");
                        LIZ6.append(LJII);
                        LIZ6.append(".task, PublishTaskList size = ");
                        LIZ6.append(gui2.LJFF());
                        C77123UOp.LJJJIL(new GUP(X1D.LIZIZ(LIZ6)));
                        gui2.LJIIIIZZ(LJII);
                        LJJIFFI();
                        return;
                    }
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("Continue type, PublishRecord state incorrect ");
                    LIZ7.append(abstractC41437GOb);
                    LIZ7.append(", task = ");
                    LIZ7.append(LJII);
                    LIZ7.append(".task, PublishTaskList size = ");
                    LIZ7.append(gui2.LJFF());
                    throw new GUP(X1D.LIZIZ(LIZ7));
                }
            } else {
                throw new GUP("PublishParallel is not enabled");
            }
            String str = LJII.LIZIZ;
            GUQ guq = LJII.LJI;
            if (guq != null) {
                if (guq.LJLLLL) {
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("PublishParallel startCacheTask skip execute already scheduled task id=");
                    LIZ8.append(str);
                    H78.LJI(X1D.LIZIZ(LIZ8));
                    return;
                }
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("PublishParallel startCacheTask reuse task id=");
                LIZ9.append(str);
                H78.LJI(X1D.LIZIZ(LIZ9));
            } else {
                GUQ guq2 = new GUQ(new C41750Ga2(), LIZIZ, LJII, gui2, LIZLLL);
                LJII.LJI = guq2;
                StringBuilder LIZ10 = X1D.LIZ();
                LIZ10.append("PublishParallel startCacheTask create new task  id=");
                LIZ10.append(str);
                H78.LJI(X1D.LIZIZ(LIZ10));
                List LLJI = ORZ.LLJI(LJII.LIZJ);
                LJII.LIZJ.clear();
                StringBuilder LIZ11 = X1D.LIZ();
                LIZ11.append("cancelTaskCallbackList size=");
                LIZ11.append(LLJI.size());
                H7B.LIZ(X1D.LIZIZ(LIZ11));
                Iterator it2 = LLJI.iterator();
                while (it2.hasNext()) {
                    guq2.LIZ((GUX) it2.next());
                }
            }
            H78.LJI("PublishParallel startCacheTask execute task id=" + str);
            GUQ guq3 = LJII.LJI;
            if (guq3 != null) {
                guq3.LJLLLL = true;
            }
            LIZLLL.execute(LJII.LJI);
        }
    }

    public static final List<PublishModel> LJIIJ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getAllPublishModel size=");
        GUI gui = LIZJ;
        LIZ2.append(gui.LJFF());
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        return gui.LIZLLL();
    }

    public static final int LJIILJJIL() {
        return ((ArrayList) LJIILIIL()).size();
    }

    public static final String LIZJ(Bundle bundle) {
        String LIZLLL2;
        o.LJIIIZ(bundle, "bundle");
        synchronized (GUH.class) {
            LIZLLL2 = LIZLLL(C43001GuD.LJFF(bundle), false);
        }
        return LIZLLL2;
    }

    public static void LJI(C41359GLb c41359GLb) {
        GUI gui = LIZJ;
        ExecutorService executor = LIZLLL;
        synchronized (gui) {
            o.LJIIIZ(executor, "executor");
            executor.execute(new ARunnableS26S0200000_7(c41359GLb, gui, 17));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r3.LJLLJ == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJII(java.lang.String r7) {
        /*
            java.lang.String r0 = "publishId"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.GUI r0 = X.GUH.LIZJ
            X.GUQ r3 = r0.LJI(r7)
            r7 = 0
            if (r3 == 0) goto La5
            X.GUc r0 = r3.LJLLJ
            if (r0 == 0) goto La5
            boolean r6 = r0.LIZ()
        L16:
            r5 = 1
            r4 = 0
            if (r6 == 0) goto L73
            if (r3 == 0) goto L26
            X.GUU r0 = r3.LJLJJL
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r0.LIZ
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r4 = r0.editModel
        L26:
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel
            if (r0 == 0) goto L32
            if (r4 == 0) goto L32
            java.lang.String r2 = r4.getCreationId()
            if (r2 != 0) goto L34
        L32:
            java.lang.String r2 = ""
        L34:
            if (r3 == 0) goto L48
            r3.LJLLILLLL = r5
            X.GTi r1 = new X.GTi
            r1.<init>()
            java.lang.String r0 = "cancel_by_click_cover"
            r1.LIZ = r0
            X.GLb r0 = r1.LIZ()
            r3.LIZIZ(r0)
        L48:
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r0 = r0.getPublishService()
            r0.LJIILIIL()
            X.C41958GdO.LJIILJJIL(r2)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r0 = r0.getPublishService()
            r0.LJIILIIL()
            X.C41958GdO.LJIILIIL(r2)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r0 = r0.getPublishService()
            r0.LJIILIIL()
            X.C41958GdO.LJII()
        L72:
            return r6
        L73:
            if (r3 != 0) goto L9f
        L75:
            r7 = 1
        L76:
            if (r3 == 0) goto L84
            X.GUc r0 = r3.LJLLJ
            if (r0 == 0) goto L84
            boolean r0 = r0.LIZ()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L84:
            X.Gbn r3 = X.C1I0.LIZIZ()
            java.lang.String r2 = "task is null: "
            java.lang.String r1 = "task?.getPublishCancellableFlag is null: "
            java.lang.String r0 = "task?.getPublishCancellableFlag()?.getStatusAndSetCanceled(): "
            java.lang.StringBuilder r0 = X.C00F.LIZLLL(r2, r5, r1, r7, r0)
            r0.append(r4)
            java.lang.String r1 = X.X1D.LIZIZ(r0)
            java.lang.String r0 = "report_cancel_failure_reason_scheduler"
            r3.LIZJ(r0, r1)
            goto L72
        L9f:
            r5 = 0
            X.GUc r0 = r3.LJLLJ
            if (r0 != 0) goto L76
            goto L75
        La5:
            r6 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GUH.LJII(java.lang.String):boolean");
    }

    public static GUQ LJIIIIZZ(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        return new GUQ(C43001GuD.LJFF(bundle), new C41750Ga2(), LIZIZ, LIZJ, LIZLLL);
    }

    public static GUQ LJIIIZ(PublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        return new GUQ(publishModel, new C41750Ga2(), LIZIZ, LIZJ, LIZLLL);
    }

    public static final Bitmap LJIIJJI(PublishModel publishModel) {
        Bitmap bitmap;
        String videoPath;
        o.LJIIIZ(publishModel, "publishModel");
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            if (H7R.LJJJJL(videoPublishEditModel) && !H7R.LJJIJLIJ(videoPublishEditModel)) {
                bitmap = C152915zL.LIZ(videoPublishEditModel);
            } else {
                if (videoPublishEditModel.isMvThemeVideoType()) {
                    String str = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
                    if (C39579Fg7.LIZIZ(str)) {
                        bitmap = BitmapFactory.decodeFile(str, GUM.LIZ(str));
                    }
                }
                if (videoPublishEditModel.isMultiVideoEdit()) {
                    String str2 = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
                    if (C39579Fg7.LIZIZ(str2)) {
                        bitmap = BitmapFactory.decodeFile(str2, GUM.LIZ(str2));
                    }
                }
                String validVideoCoverPath = videoPublishEditModel.getValidVideoCoverPath();
                if (validVideoCoverPath != null) {
                    bitmap = BitmapFactory.decodeFile(validVideoCoverPath, GUM.LIZ(validVideoCoverPath));
                } else if (C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData)) {
                    String str3 = (String) ListProtector.get(videoPublishEditModel.canvasVideoData.getSourceInfo(), 0);
                    if (GWL.LIZ()) {
                        bitmap = C44694HgQ.LIZLLL(str3, GUM.LIZ(str3));
                    } else {
                        bitmap = BitmapFactory.decodeFile(str3, GUM.LIZ(str3));
                    }
                } else {
                    if (videoPublishEditModel.getPreviewInfo() == null) {
                        videoPath = "";
                    } else {
                        videoPath = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoPath();
                    }
                    if (C42618Go2.LIZIZ == null) {
                        C42618Go2.LIZIZ = new C42618Go2();
                    }
                    C42618Go2.LIZIZ.getClass();
                    String LJI2 = C44694HgQ.LJI(C60903NvH.LJ, videoPath);
                    if (C44687HgJ.LIZIZ(LJI2)) {
                        bitmap = ThumbnailUtils.extractThumbnail(ThumbnailUtils.createVideoThumbnail(LJI2, 1), 90, 110, 2);
                    }
                }
            }
            C60903NvH.LJIIJJI().LJJIIJ();
            return bitmap;
        }
        bitmap = null;
        C60903NvH.LJIIJJI().LJJIIJ();
        return bitmap;
    }

    public static final String LJIILL(PublishModel model) {
        o.LJIIIZ(model, "model");
        GUI gui = LIZJ;
        gui.getClass();
        List<GUU> mPublishRecordList = gui.LIZ;
        o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
        for (GUU guu : mPublishRecordList) {
            if (o.LJ(guu.LIZ, model)) {
                return guu.LIZIZ;
            }
        }
        return "";
    }

    public static final PublishModel LJIILLIIL(String str) {
        return LIZJ.LJ(str);
    }

    public static final boolean LJIJ(PublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        if (!publishModel.LIZ && !OQN.LJIIIZ(publishModel) && (!publishModel.isStoryPublish || (!L7K.LIZ && !C2304092m.LIZ()))) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJI(String str) {
        if (str != null) {
            if (LIZJ.LJ(str) == null) {
                return false;
            }
            return true;
        }
        if (!LIZJ.LJIIIZ() && LJI == null) {
            return false;
        }
        return true;
    }

    public static void LJIJJ(String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishScheduler | ");
        LIZ2.append(msg);
        H7B.LJ(X1D.LIZIZ(LIZ2));
    }

    public static void LJJ(InterfaceC41605GUn callback) {
        o.LJIIIZ(callback, "callback");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishScheduler | removeCallback call ");
        LIZ2.append((String) null);
        H7B.LJ(X1D.LIZIZ(LIZ2));
        LIZLLL.execute(new ARunnableS8S1100000_7(callback, (String) null, 7));
    }

    public static final void LJJI(String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishScheduler | ");
        LIZ2.append(msg);
        H7B.LIZJ(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("PublishScheduler|");
        LIZ3.append(msg);
        C142955jH.LIZ(X1D.LIZIZ(LIZ3));
    }

    public static final String LJJIII(Bundle bundle) {
        String str;
        GUU guu;
        GUU guu2;
        o.LJIIIZ(bundle, "bundle");
        if (LJIIZILJ() != 0) {
            return null;
        }
        LJI = LJIIIIZZ(bundle);
        GUQ guq = LJI;
        o.LJI(guq);
        guq.LIZ(LJ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishParallel PublishScheduler PrePublishTask id=");
        GUQ guq2 = LJI;
        if (guq2 != null && (guu2 = guq2.LJLJJL) != null) {
            str = guu2.LIZIZ;
        } else {
            str = null;
        }
        LIZ2.append(str);
        H78.LJI(X1D.LIZIZ(LIZ2));
        LIZLLL.execute(LJI);
        GUQ guq3 = LJI;
        if (guq3 == null || (guu = guq3.LJLJJL) == null) {
            return null;
        }
        return guu.LIZIZ;
    }

    public static final void LIZ(String str, GUX callback) {
        o.LJIIIZ(callback, "callback");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishScheduler | addCallback call ");
        LIZ2.append(str);
        H7B.LJ(X1D.LIZIZ(LIZ2));
        LIZLLL.execute(new ARunnableS8S1100000_7(str, callback, 5));
    }

    public static void LIZIZ(String str, GUX callback) {
        String str2;
        GUQ guq;
        GUU guu;
        o.LJIIIZ(callback, "callback");
        if (str != null) {
            GUQ guq2 = LJI;
            if (guq2 != null && (guu = guq2.LJLJJL) != null) {
                str2 = guu.LIZIZ;
            } else {
                str2 = null;
            }
            if (o.LJ(str2, str)) {
                LIZLLL.execute(new ARunnableS43S0100000_7(callback, 110));
            }
            GUI gui = LIZJ;
            synchronized (gui) {
                List<GUU> mPublishRecordList = gui.LIZ;
                o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
                for (GUU guu2 : mPublishRecordList) {
                    if (o.LJ(guu2.LIZIZ, str) && (guq = guu2.LJI) != null) {
                        guq.LIZ(callback);
                    }
                }
            }
        }
    }

    public static final synchronized String LIZLLL(PublishModel publishModel, boolean z) {
        String LJ2;
        synchronized (GUH.class) {
            o.LJIIIZ(publishModel, "publishModel");
            H7B.LIZ("PublishScheduler addPublishTask");
            LJ2 = LJ(LJIIIZ(publishModel), z);
        }
        return LJ2;
    }

    public static final synchronized String LJ(GUQ task, boolean z) {
        String str;
        synchronized (GUH.class) {
            o.LJIIIZ(task, "task");
            if (task.LJLJJL.LIZ.editModel instanceof VideoPublishEditModel) {
                C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
                C41958GdO.LJFF(task.LJLJJL.LIZ.editModel.getDraftPrimaryKey());
            }
            task.LIZ(LJ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ParallelPublish  PublishScheduler  addPublishTask id=");
            LIZ2.append(task.LJLJJL.LIZIZ);
            H7B.LIZ(X1D.LIZIZ(LIZ2));
            if (z) {
                LIZJ.LIZIZ(task.LJLJJL);
            } else {
                LIZJ.LIZ(task.LJLJJL);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("PublishSchedule addPublishTask task id = ");
            LIZ3.append(task.LJLJJL.LIZIZ);
            H78.LJI(X1D.LIZIZ(LIZ3));
            if (GUO.LIZ()) {
                C42524GmW.LIZ.LIZ();
            }
            str = task.LJLJJL.LIZIZ;
        }
        return str;
    }

    public static void LJFF(C41359GLb c41359GLb, String publishId) {
        String str;
        o.LJIIIZ(publishId, "publishId");
        GUQ LJI2 = LIZJ.LJI(publishId);
        if (LJI2 == null) {
            return;
        }
        BaseShortVideoContext baseShortVideoContext = LJI2.LJLJJL.LIZ.editModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || baseShortVideoContext == null || (str = baseShortVideoContext.getCreationId()) == null) {
            str = "";
        }
        LJI2.LIZIZ(c41359GLb);
        C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
        C41958GdO.LJIILJJIL(str);
        C41958GdO.LJIILIIL(str);
        C41958GdO.LJII();
    }

    public static void LJIJJLI(String str, String str2) {
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZIZ()) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, "enter_publish_page");
        c188727au.LJIIIZ("status", str);
        c188727au.LJIIIZ("msg", str2);
        FMX.LJIIL("tool_performance_edit_pre_publish", c188727au.LIZ);
    }

    public static final void LJIL(String str, GUX callback) {
        o.LJIIIZ(callback, "callback");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishScheduler | removeCallback call ");
        LIZ2.append(str);
        H7B.LJ(X1D.LIZIZ(LIZ2));
        if (str == null) {
            return;
        }
        LIZLLL.execute(new ARunnableS8S1100000_7(str, callback, 6));
    }

    public static String LJJII(PublishModel publishModel, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr interfaceC88471Ynr2) {
        GUQ LJIIIZ = LJIIIZ(publishModel);
        if (interfaceC88471Ynr != null) {
            LJIIIZ.LIZ(new GAC(interfaceC88471Ynr2, interfaceC88471Ynr));
        }
        LIZIZ.LIZ(LJIIIZ.LJLJJL);
        LIZLLL.execute(LJIIIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishScheduler | startNewPublish creationId:");
        LIZ2.append(publishModel.creationId);
        LIZ2.append(" publishId:");
        LIZ2.append(LJIIIZ.LJLJJL.LIZIZ);
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        return LJIIIZ.LJLJJL.LIZIZ;
    }

    public static void LJJIIJ(VideoPublishEditModel model, Bundle bundle, Context context) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(context, "context");
        if (C41571GTf.LJ(model)) {
            model.creativeModel.transientPostPageModel.LJIILIIL = model.getEditPagePrePublishId();
            LJIJJLI("success", "success");
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ab is");
        LIZ2.append(IJM.LIZ());
        LJIJJLI("fail", X1D.LIZIZ(LIZ2));
        G5D g5d = model.creativeModel.transientPostPageModel;
        g5d.LJJII = true;
        if (g5d.LJIILL == -1) {
            C60903NvH.LJIIJJI().getPublishService().LJIJI();
            g5d.LJIILL = GSL.LIZJ(context, model);
        }
        int i = model.creativeModel.transientPostPageModel.LJIILL;
        if (i != 0) {
            bundle.putInt("pre_publish_type", i);
            if (LJIIZILJ() == 0) {
                H78.LJI("PublishParallel start pre publish task");
                C41574GTi c41574GTi = new C41574GTi();
                c41574GTi.LIZ = "pre_publish_reset_task_state";
                C41359GLb LIZ3 = c41574GTi.LIZ();
                GUQ guq = LJI;
                LJI = null;
                LIZLLL.execute(new ARunnableS26S0200000_7(LIZ3, guq, 18));
                LJJIII(bundle);
                return;
            }
            if (GUW.LIZIZ()) {
                H78.LJI("PublishParallel resume previous paused task, wait for finish");
                LJJIFFI();
                LJFF = new C41569GTd(bundle);
                return;
            } else {
                if (!C41637GVt.LIZ()) {
                    return;
                }
                H78.LJI("PublishParallel wait previous paused task");
                LJJIFFI();
                LJFF = new C41570GTe(bundle);
                return;
            }
        }
        if (!GUW.LIZIZ() || LJIIZILJ() == 0) {
            return;
        }
        H78.LJI("PublishParallel resume previous paused task");
        LJJIFFI();
    }
}
