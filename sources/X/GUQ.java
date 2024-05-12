package X;

import Y.ARunnableS18S0300000_7;
import Y.ARunnableS26S0200000_7;
import Y.ARunnableS43S0100000_7;
import android.os.Build;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import defpackage.b1;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUQ implements Runnable {
    public final InterfaceC41592GUa LJLIL;
    public final GUJ LJLILLLLZI;
    public final GUI LJLJI;
    public final Executor LJLJJI;
    public final GUU LJLJJL;
    public final C07950Sx LJLJJLL;
    public GUG LJLJL;
    public final List<GUX> LJLJLJ;
    public final ExecutorC142245i8 LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final C41594GUc LJLLJ;
    public final C41603GUl LJLLL;
    public volatile boolean LJLLLL;
    public final ARunnableS43S0100000_7 LJLLLLLL;

    public final void LJFF() {
        if (this.LJLLI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PublishParallel PublishTask(");
            H78.LJI(JBR.LJFF(LIZ, this.LJLJJL.LIZIZ, ") invoke resume", LIZ));
            GUG gug = this.LJLJL;
            if (gug != null) {
                gug.resume();
            }
            this.LJLLI = false;
        }
    }

    public final void LIZJ() {
        String str;
        String str2;
        String str3;
        String str4;
        if (GUW.LIZIZ()) {
            if (!o.LJ(this.LJLJJL.LIZLLL, GOT.LIZ)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("record state incorrect, state = ");
                LIZ.append(this.LJLJJL.LIZLLL);
                C77123UOp.LJJJIL(new GUP(X1D.LIZIZ(LIZ)));
            }
        } else if (GUW.LIZ()) {
            if (!o.LJ(this.LJLJJL.LIZLLL, GOT.LIZ) && !this.LJLJJL.LIZLLL.LIZ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("record state incorrect, state = ");
                LIZ2.append(this.LJLJJL.LIZLLL);
                C77123UOp.LJJJIL(new GUP(X1D.LIZIZ(LIZ2)));
            }
        } else if (!C41637GVt.LIZ()) {
            throw new GUP("impossible");
        }
        AbstractC41437GOb abstractC41437GOb = this.LJLJJL.LIZLLL;
        abstractC41437GOb.getClass();
        if ((abstractC41437GOb instanceof GOS) && (((GOS) abstractC41437GOb).LIZ instanceof GUZ)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("the PublishTask[taskId:");
            H78.LJI(JBR.LJFF(LIZ3, this.LJLJJL.LIZIZ, "] is cancelled when starting to schedule", LIZ3));
            return;
        }
        if (!this.LJLJJL.LIZ.isEditSave) {
            BaseShortVideoContext baseShortVideoContext = this.LJLJJL.LIZ.editModel;
            o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            String flowId = ((VideoPublishEditModel) baseShortVideoContext).creativeModel.editSaveLocalModel.flowId;
            o.LJIIIZ(flowId, "flowId");
            GU9 gu9 = GU7.LIZLLL;
            if (gu9 != null) {
                str = gu9.LIZJ;
            } else {
                str = null;
            }
            if (!o.LJ(flowId, str)) {
                GU9 gu92 = GU7.LIZLLL;
                if (gu92 != null) {
                    str4 = gu92.LIZJ;
                } else {
                    str4 = null;
                }
                if (C78685UuP.LJJJZ(str4) && o.LJ(GU7.LJ.getValue(), Boolean.TRUE)) {
                    GU7.LIZ(false);
                }
            }
            if (o.LJ(GU7.LJ.getValue(), Boolean.TRUE)) {
                GU9 gu93 = GU7.LIZLLL;
                if (gu93 != null) {
                    str2 = gu93.LIZJ;
                } else {
                    str2 = null;
                }
                if (o.LJ(flowId, str2)) {
                    GU9 gu94 = GU7.LIZLLL;
                    if (gu94 != null) {
                        str3 = gu94.LIZJ;
                    } else {
                        str3 = null;
                    }
                    if (C78685UuP.LJJJZ(str3)) {
                        GU7.LIZ(true);
                    }
                }
            }
        }
        this.LJLJJL.LIZ(new C41442GOg(0, null));
        InterfaceC41592GUa interfaceC41592GUa = this.LJLIL;
        GUU guu = this.LJLJJL;
        GUG LIZ4 = interfaceC41592GUa.LIZ(guu, guu.LIZIZ, this.LJLLJ);
        this.LJLJL = LIZ4;
        if (LIZ4 != null) {
            this.LJLJJLL.LIZJ("start");
            GUG gug = this.LJLJL;
            if (gug != null) {
                gug.LIZIZ(new GUS(this));
            }
            BaseShortVideoContext baseShortVideoContext2 = this.LJLJJL.LIZ.editModel;
            if (baseShortVideoContext2 instanceof VideoPublishEditModel) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext2;
                videoPublishEditModel.isOpenForegroundPublish = false;
                videoPublishEditModel.isBackgroundPublish = false;
            }
            GUV guv = new GUV(this);
            if (!guv.LIZ.LJLJJL.LIZ.LIZ && C19N.LJ("enable_foreground_publish", true) && !GTN.LIZ()) {
                if (GTN.LIZ() || Build.VERSION.SDK_INT >= 31) {
                    guv.LIZ.LIZ(new GV0(guv));
                } else {
                    guv.LIZ.LIZ(new GV1(guv));
                }
            }
            if (!C19N.LJ("enable_foreground_publish", true)) {
                LIZ(new GV2(this));
            }
            this.LJLJLLL.execute(new ARunnableS43S0100000_7(this, 107));
            return;
        }
        throw new NullPointerException("publisher is null");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void LIZ(GUX callback) {
        o.LJIIIZ(callback, "callback");
        if (((ArrayList) this.LJLJLJ).contains(callback)) {
            return;
        }
        ((ArrayList) this.LJLJLJ).add(callback);
        AbstractC41437GOb abstractC41437GOb = this.LJLJJL.LIZLLL;
        if ((abstractC41437GOb instanceof C41442GOg) && ((C41442GOg) abstractC41437GOb).LIZ > 0) {
            this.LJLJLLL.execute(new ARunnableS26S0200000_7(abstractC41437GOb, callback, 13));
        }
    }

    public final void LIZIZ(C41359GLb cancelCause) {
        AbstractC41479GPr result;
        o.LJIIIZ(cancelCause, "cancelCause");
        if (this.LJLL) {
            return;
        }
        this.LJLL = true;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("invoke_type", "realStopPublish");
        FMX.LJIIL("publish_service_cancel", c145995oB.LIZ);
        GUG gug = this.LJLJL;
        if (gug != null) {
            gug.LJ(cancelCause);
        }
        if (this.LJLLILLLL) {
            result = new C41477GPp(new C41601GUj(new Throwable("cancel_by_click_cover")));
        } else if (o.LJ(cancelCause.LIZ, "discard")) {
            C41759GaB c41759GaB = new C41759GaB(new Throwable("discard by user"));
            c41759GaB.setDiscard(true);
            result = new C41480GPs(c41759GaB);
        } else if (o.LJ(cancelCause.LIZ, "cancel_by_group")) {
            result = new GUZ(cancelCause);
        } else {
            result = GAI.LIZ;
        }
        GUU guu = this.LJLJJL;
        guu.getClass();
        o.LJIIIZ(result, "result");
        guu.LIZ(new GOS(result, null));
        guu.LJFF = SystemClock.uptimeMillis();
        guu.LJI = null;
        if (this.LJLLILLLL || cancelCause.LIZIZ || o.LJ(cancelCause.LIZ, "cancel_by_group")) {
            this.LJLJI.LJIIIIZZ(this.LJLJJL);
            LIZLLL(new AqS138S0200000_7(result, this, 64));
            ((ArrayList) this.LJLJLJ).clear();
        } else {
            LIZLLL(new AqS138S0200000_7(result, this, 65));
        }
        GUJ guj = this.LJLILLLLZI;
        String id = this.LJLJJL.LIZIZ;
        synchronized (guj) {
            o.LJIIIZ(id, "id");
            guj.LIZIZ.remove(id);
        }
    }

    public final void LIZLLL(InterfaceC88472Yns<? super GUX, C76800UCe> interfaceC88472Yns) {
        if (((ArrayList) this.LJLJLJ).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LJLJLJ);
        this.LJLJLLL.execute(new ARunnableS18S0300000_7(arrayList, interfaceC88472Yns, this, 7));
    }

    public final void LJ(InterfaceC41605GUn<CreateBaseAwemeResponse> callback) {
        o.LJIIIZ(callback, "callback");
        List<GUX> list = this.LJLJLJ;
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(callback, (InterfaceC41605GUn<CreateBaseAwemeResponse>) 287);
        ListIterator<GUX> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (((Boolean) aqS173S0100000_7.invoke(listIterator.next())).booleanValue()) {
                listIterator.remove();
            }
        }
    }

    public GUQ(PublishModel publishModel, C41750Ga2 c41750Ga2, GUJ records, GUI publishTaskList, Executor executor) {
        o.LJIIIZ(publishModel, "publishModel");
        o.LJIIIZ(records, "records");
        o.LJIIIZ(publishTaskList, "publishTaskList");
        o.LJIIIZ(executor, "executor");
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = C150985wE.LIZJ;
        this.LJLLJ = new C41594GUc();
        this.LJLLLLLL = new ARunnableS43S0100000_7(this, 108);
        this.LJLIL = c41750Ga2;
        this.LJLILLLLZI = records;
        this.LJLJI = publishTaskList;
        GUU guu = new GUU(this, publishModel);
        this.LJLJJL = guu;
        this.LJLJJI = executor;
        StringBuilder LIZJ = b1.LIZJ("PublishScheduler", "-PublishTask-");
        LIZJ.append(guu.LIZIZ);
        this.LJLJJLL = new C07950Sx(X1D.LIZIZ(LIZJ));
        this.LJLLL = new C41603GUl(guu.LIZ);
    }

    public GUQ(C41750Ga2 c41750Ga2, GUJ records, GUU guu, GUI publishTaskList, Executor executor) {
        o.LJIIIZ(records, "records");
        o.LJIIIZ(publishTaskList, "publishTaskList");
        o.LJIIIZ(executor, "executor");
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = C150985wE.LIZJ;
        this.LJLLJ = new C41594GUc();
        this.LJLLLLLL = new ARunnableS43S0100000_7(this, 108);
        this.LJLIL = c41750Ga2;
        this.LJLILLLLZI = records;
        this.LJLJI = publishTaskList;
        this.LJLJJL = guu;
        this.LJLJJI = executor;
        StringBuilder LIZJ = b1.LIZJ("PublishScheduler", "-PublishTask-");
        LIZJ.append(guu.LIZIZ);
        this.LJLJJLL = new C07950Sx(X1D.LIZIZ(LIZJ));
        this.LJLLL = new C41603GUl(guu.LIZ);
    }
}
