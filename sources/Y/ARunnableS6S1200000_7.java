package Y;

import X.AbstractC41437GOb;
import X.AbstractC41479GPr;
import X.ActivityC45651qj;
import X.C025908h;
import X.C164096cH;
import X.C1M5;
import X.C22690un;
import X.C38352F3k;
import X.C38891fp;
import X.C39579Fg7;
import X.C41051G9f;
import X.C41442GOg;
import X.C41478GPq;
import X.C41505GQr;
import X.C41823GbD;
import X.C42393GkP;
import X.C42395GkR;
import X.C42403GkZ;
import X.C42404Gka;
import X.C47261Igj;
import X.GAI;
import X.GOS;
import X.GOT;
import X.GUG;
import X.GUH;
import X.GUQ;
import X.GUU;
import X.H78;
import X.H7B;
import X.JBR;
import X.X1D;
import X.YE1;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ARunnableS6S1200000_7 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int width = ((C164096cH) this.l1).getWidth();
        float f = width;
        if (((C41051G9f) this.l2).LJZ != null) {
            float videoWidth = r0.videoWidth() * 1.0f;
            if (((C41051G9f) this.l2).LJZ != null) {
                Bitmap LJIILIIL = C38891fp.LJIILIIL(width, (int) (f / (videoWidth / r0.videoHeight())), this.s0);
                if (LJIILIIL != null) {
                    ((C164096cH) this.l1).setImageDrawable(new C1M5(((C41051G9f) this.l2).requireActivity().getResources(), LJIILIIL));
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LIZ$1() {
        GUQ guq;
        GUU guu = (GUU) this.l1;
        PublishModel publishModel = (PublishModel) this.l2;
        guu.getClass();
        o.LJIIIZ(publishModel, "<set-?>");
        guu.LIZ = publishModel;
        AbstractC41437GOb abstractC41437GOb = ((GUU) this.l1).LIZLLL;
        if (abstractC41437GOb instanceof GOT) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ReStartNewPublish ");
            LIZ.append(this.s0);
            GUH.LJJI(X1D.LIZIZ(LIZ));
            return;
        }
        if (abstractC41437GOb instanceof GOS) {
            AbstractC41479GPr abstractC41479GPr = ((GOS) abstractC41437GOb).LIZ;
            if (abstractC41479GPr instanceof C41505GQr) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ReStartAlreadySuccessPublish ");
                LIZ2.append(this.s0);
                GUH.LJJI(X1D.LIZIZ(LIZ2));
                return;
            }
            if (abstractC41479GPr instanceof GAI) {
                String LJJII = GUH.LJJII((PublishModel) this.l2, null, null);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("PublishScheduler | reStart Cancel Publish, reStart new. old:");
                LIZ3.append(this.s0);
                LIZ3.append(" new:");
                LIZ3.append(LJJII);
                H7B.LIZ(X1D.LIZIZ(LIZ3));
                return;
            }
            if (!(abstractC41479GPr instanceof C41478GPq)) {
                return;
            }
            String LJJII2 = GUH.LJJII((PublishModel) this.l2, null, null);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("PublishScheduler | reStart Failed Publish, reStart new. old:");
            LIZ4.append(this.s0);
            LIZ4.append(" new:");
            LIZ4.append(LJJII2);
            H7B.LIZ(X1D.LIZIZ(LIZ4));
            return;
        }
        if (!(abstractC41437GOb instanceof C41442GOg) || (guq = ((GUU) this.l1).LJI) == null) {
            return;
        }
        guq.LJLJJLL.LIZJ("reStart");
        GUG gug = guq.LJLJL;
        if (gug == null) {
            return;
        }
        gug.LIZJ();
    }

    public final void LIZ$2() {
        String LJFF;
        if (((C42393GkP) this.l1).LIZ != null) {
            Aweme aweme = (Aweme) this.l2;
            if (aweme == null) {
                H78.LJI("dismiss dialog as context/aweme is null");
                ((C42393GkP) this.l1).LIZ(true);
                return;
            }
            if (aweme.getAuthor() == null) {
                H78.LJI("dismiss dialog as author is null");
                ((C42393GkP) this.l1).LIZ(true);
                return;
            }
            if (((Aweme) this.l2).getStatus() != null && ((Aweme) this.l2).getStatus().isPrivate() && !TextUtils.equals(this.s0, "from_promote")) {
                H78.LJI("dismiss dialog as it's not from promote");
                ((C42393GkP) this.l1).LIZ(true);
                return;
            }
            if (((Aweme) this.l2).getStatus() != null && ((Aweme) this.l2).getStatus().isDelete()) {
                ((C42393GkP) this.l1).LIZ(true);
                H78.LJI("dismiss dialog as status is delete");
                return;
            }
            H78.LJI("moving to updateAwemeSuccessAndNext");
            C42393GkP c42393GkP = (C42393GkP) this.l1;
            Aweme aweme2 = (Aweme) this.l2;
            o.LJIIIIZZ(aweme2, "aweme");
            c42393GkP.getClass();
            VideoUrlModel playAddrH264 = aweme2.getVideo().getPlayAddrH264();
            if (playAddrH264 == null || playAddrH264.getUrlList().isEmpty()) {
                c42393GkP.LIZ(true);
                return;
            }
            List<String> list = c42393GkP.LJFF;
            List LJJIJ = C47261Igj.LJJIJ(ListProtector.get(playAddrH264.getUrlList(), 0));
            ArrayList arrayList = new ArrayList();
            Iterator it = LJJIJ.iterator();
            while (it.hasNext()) {
                String LIZ = C41823GbD.LIZ(aweme2, (String) it.next());
                if (LIZ != null) {
                    arrayList.add(LIZ);
                }
            }
            ((ArrayList) list).addAll(arrayList);
            String LIZJ = C38352F3k.LIZJ(playAddrH264.getBitRatedRatioUri());
            StringBuilder LIZ2 = X1D.LIZ();
            c42393GkP.LJI = C025908h.LIZIZ(LIZ2, c42393GkP.LJIIJ, LIZJ, ".mp4", LIZ2);
            StringBuilder LIZ3 = X1D.LIZ();
            YE1.LIZLLL(LIZ3, c42393GkP.LJIIJ, "temp_", LIZJ, ".mp4");
            c42393GkP.LJII = X1D.LIZIZ(LIZ3);
            StringBuilder LIZ4 = X1D.LIZ();
            YE1.LIZLLL(LIZ4, c42393GkP.LJIIJ, "temp_", LIZJ, ".wav");
            c42393GkP.LJIIIIZZ = X1D.LIZIZ(LIZ4);
            String str = c42393GkP.LJI;
            if (str != null) {
                if (!C39579Fg7.LIZIZ(str)) {
                    C39579Fg7.LJ(c42393GkP.LJIIJ, false);
                    c42393GkP.LJ = 0;
                    String str2 = c42393GkP.LJIIJ;
                    String LJFF2 = i0.LJFF(LIZJ, ".mp4");
                    String aid = aweme2.getAid();
                    List<String> urls = c42393GkP.LJFF;
                    C42395GkR c42395GkR = new C42395GkR(aweme2, c42393GkP, urls);
                    o.LJIIIZ(urls, "urls");
                    if (str2 != null && ujb.o.LJJJJ(str2, "/", false)) {
                        LJFF = i0.LJFF(str2, LJFF2);
                    } else {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append(str2);
                        LJFF = JBR.LJFF(LIZ5, File.separator, LJFF2, LIZ5);
                    }
                    if (!LocalVideoPlayerManager.LIZLLL().LJIIIIZZ(aid, LJFF, new C42404Gka(c42395GkR, LJFF, str2, LJFF2, urls))) {
                        C22690un.LIZ("duet");
                        C42403GkZ.LIZ(urls, str2, LJFF2, c42395GkR);
                    }
                } else {
                    c42393GkP.LJIIL = 99;
                    c42393GkP.LIZIZ(aweme2);
                }
                c42393GkP.LJIIJJI.postDelayed(new ARunnableS43S0100000_7(c42393GkP, 132), 60000L);
                return;
            }
            o.LJIJI("mOutPath");
            throw null;
        }
        o.LJIJI("mContext");
        throw null;
    }

    public static final void run$0(ARunnableS6S1200000_7 aRunnableS6S1200000_7) {
        boolean LIZ;
        try {
            aRunnableS6S1200000_7.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S1200000_7 aRunnableS6S1200000_7) {
        boolean LIZ;
        try {
            AVExternalServiceImpl.LIZ().publishService().showPublishRecoverViewForCCPublish((ActivityC45651qj) aRunnableS6S1200000_7.l1, aRunnableS6S1200000_7.s0, (PublishFailMsg) aRunnableS6S1200000_7.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS6S1200000_7 aRunnableS6S1200000_7) {
        boolean LIZ;
        try {
            aRunnableS6S1200000_7.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS6S1200000_7 aRunnableS6S1200000_7) {
        boolean LIZ;
        try {
            aRunnableS6S1200000_7.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS6S1200000_7(GUU guu, PublishModel publishModel, int i) {
        this.$t = i;
        this.l1 = guu;
        this.l2 = publishModel;
        this.s0 = null;
    }

    public ARunnableS6S1200000_7(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
