package X;

import Y.ARunnableS43S0100000_7;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardPublishLock;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1V extends AbstractC43396H1k {
    public final GUU LIZJ;
    public final String LIZLLL;
    public final C41594GUc LJ;
    public final InterfaceC43387H1b LJFF;
    public volatile C87614Ya2 LJI;
    public final C62822Ol8 LJII;
    public GUX LJIIIIZZ;
    public final C43403H1r LJIIIZ;
    public final C43404H1s LJIIJ;
    public Runnable LJIIJJI;
    public volatile boolean LJIIL;
    public C41604GUm LJIILIIL;
    public C87631YaJ LJIILJJIL;
    public QuickForwardPublishLock LJIILL;

    @Override // X.GUG
    public final void resume() {
        this.LJIIJJI = null;
        C87614Ya2 c87614Ya2 = this.LJI;
        if (c87614Ya2 != null) {
            C87614Ya2.LJ(c87614Ya2);
        } else {
            o.LJIJI("net");
            throw null;
        }
    }

    @Override // X.GUG
    public final void LIZJ() {
        C87614Ya2 c87614Ya2 = this.LJI;
        if (c87614Ya2 != null) {
            if (c87614Ya2.LIZJ() instanceof YZU) {
                LJI(null);
            }
            LJII(null);
            return;
        }
        o.LJIJI("net");
        throw null;
    }

    @Override // X.GUG
    public final boolean LIZLLL() {
        return this.LJIIL;
    }

    @Override // X.GUG
    public final void LIZIZ(GUX gux) {
        this.LJIIIIZZ = gux;
        LJI(null);
        LJII(null);
    }

    @Override // X.GUG
    public final void LJ(C41359GLb cancelCause) {
        o.LJIIIZ(cancelCause, "cancelCause");
        if (this.LJI != null) {
            C87614Ya2 c87614Ya2 = this.LJI;
            if (c87614Ya2 != null) {
                c87614Ya2.LIZIZ(cancelCause);
            } else {
                o.LJIJI("net");
                throw null;
            }
        }
    }

    @Override // X.GUG
    public final boolean LJFF(ARunnableS43S0100000_7 compileSuccessAfterPauseCallback) {
        o.LJIIIZ(compileSuccessAfterPauseCallback, "compileSuccessAfterPauseCallback");
        this.LJFF.LJIIIIZZ();
        C41813Gb3.LIZJ("DefaultWavePublisher", "WavePublish | net pause");
        if (this.LJIIL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PublishParallel taskPause id=");
            H78.LJI(JBR.LJFF(LIZ, this.LIZJ.LIZIZ, " can't pause because compile finished", LIZ));
            return false;
        }
        if (this.LJI != null) {
            synchronized (this) {
                if (this.LJIIL) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("PublishParallel taskPause id=");
                    LIZ2.append(this.LIZJ.LIZIZ);
                    LIZ2.append(" can't pause because compile finished");
                    H78.LJI(X1D.LIZIZ(LIZ2));
                    return false;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("PublishParallel taskPause id=");
                LIZ3.append(this.LIZJ.LIZIZ);
                LIZ3.append(" pause net");
                H78.LJI(X1D.LIZIZ(LIZ3));
                this.LJIIJJI = compileSuccessAfterPauseCallback;
                C87614Ya2 c87614Ya2 = this.LJI;
                if (c87614Ya2 != null) {
                    C87614Ya2.LIZLLL(c87614Ya2);
                    return true;
                }
                o.LJIJI("net");
                throw null;
            }
        }
        C41816Gb6.LIZIZ(-111111, "pause on not init net", null);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:298:0x077a, code lost:
    
        if (r12 != null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x030d, code lost:
    
        if (r0 < r15) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0434  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v29, types: [com.ss.android.ugc.aweme.publish.model.UploadSettingConfig] */
    /* JADX WARN: Type inference failed for: r1v98, types: [com.google.gson.Gson] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C43399H1n r25) {
        /*
            Method dump skipped, instructions count: 2765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1V.LJI(X.H1n):void");
    }

    public final void LJII(GWB gwb) {
        IPublishServiceFactory iPublishServiceFactory;
        if (this.LIZJ.LIZ.publishType == 0) {
            C43403H1r c43403H1r = this.LJIIIZ;
            BaseShortVideoContext baseShortVideoContext = this.LIZJ.LIZ.editModel;
            o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            c43403H1r.getClass();
            c43403H1r.LIZ = (VideoPublishEditModel) baseShortVideoContext;
            C43404H1s c43404H1s = this.LJIIJ;
            PublishModel publishModel = this.LIZJ.LIZ;
            c43404H1s.getClass();
            o.LJIIIZ(publishModel, "<set-?>");
            c43404H1s.LIZ = publishModel;
            if (gwb != null) {
                PublishModel publishModel2 = this.LJIIJ.LIZ;
                publishModel2.getClass();
                publishModel2.retryType = gwb;
            }
            ((C43458H3u) this.LJII.getValue()).LIZLLL();
            if (Z9N.LIZIZ.LJJLIIIJ() || GTO.LIZ()) {
                GVF gvf = C44172HVg.LJIILL;
                PublishModel publishModel3 = this.LJIIJ.LIZ;
                String str = this.LIZJ.LIZIZ;
                gvf.getClass();
                GUH.LIZ(this.LIZJ.LIZIZ, new C41604GUm(new MainActivityCallback(publishModel3, str)));
            }
            if (GTO.LIZ()) {
                C41620GVc.LIZIZ(this.LIZJ.LIZIZ);
            }
            Object LIZ = C58096Mr6.LIZ(IPublishServiceFactory.class, false);
            if (LIZ != null) {
                iPublishServiceFactory = (IPublishServiceFactory) LIZ;
            } else {
                if (C58096Mr6.W6 == null) {
                    synchronized (IPublishServiceFactory.class) {
                        if (C58096Mr6.W6 == null) {
                            C58096Mr6.W6 = new PublishServiceFactoryImpl();
                        }
                    }
                }
                iPublishServiceFactory = C58096Mr6.W6;
            }
            GVW callback = iPublishServiceFactory.LIZ(this.LIZJ.LIZ.videoType, this.LIZJ.LIZ.editModel);
            o.LJIIIIZZ(callback, "callback");
            C41604GUm c41604GUm = new C41604GUm(callback);
            GUH.LIZIZ(this.LIZJ.LIZIZ, c41604GUm);
            if (GVE.LIZ()) {
                C6QQ.LIZ(C41753Ga5.LJLIL);
            }
            this.LJIILIIL = c41604GUm;
            C268713r.LIZ();
            C41958GdO.LJIILL(this.LIZJ.LIZ);
        }
        C87614Ya2 c87614Ya2 = this.LJI;
        if (c87614Ya2 != null) {
            c87614Ya2.LJIIIIZZ();
        } else {
            o.LJIJI("net");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1V(GUU record, String publishId, C41594GUc flag, C43478H4o c43478H4o) {
        super(c43478H4o);
        o.LJIIIZ(record, "record");
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(flag, "flag");
        this.LIZJ = record;
        this.LIZLLL = publishId;
        this.LJ = flag;
        this.LJFF = c43478H4o;
        this.LJII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 452));
        BaseShortVideoContext baseShortVideoContext = record.LIZ.editModel;
        o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        this.LJIIIZ = new C43403H1r((VideoPublishEditModel) baseShortVideoContext);
        this.LJIIJ = new C43404H1s(record.LIZ);
    }
}
