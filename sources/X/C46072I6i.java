package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I6i */
/* loaded from: classes8.dex */
public final class C46072I6i implements C5UA {
    public final ActivityC45651qj LIZ;
    public final I74 LIZIZ;
    public boolean LIZJ;
    public AVMusic LIZLLL;
    public volatile boolean LJ;
    public long LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public VideoPublishEditModel LJIIIIZZ;
    public final InterfaceC140255ev LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public I7A LJIILJJIL;

    @Override // X.C5UA
    public final void LIZ() {
    }

    @Override // X.C5UA
    public final void LIZIZ() {
    }

    @Override // X.C5UA
    public final List<VideoSegment> LIZLLL() {
        return this.LIZIZ.A2();
    }

    public final int LJ() {
        I7A i7a = new I7A(this.LJIIJJI, this.LJIIL, this.LJIILIIL);
        I7A config = this.LJIILJJIL;
        o.LJIIIZ(config, "config");
        return (int) ((i7a.LJLJI * config.LJLJI) + (i7a.LJLILLLLZI * config.LJLILLLLZI) + (i7a.LJLIL * config.LJLIL));
    }

    public final void LJFF() {
        C5UA c5ua;
        List<VideoSegment> LIZLLL;
        AbstractC46064I6a.LLIILZL.getClass();
        C136195Wd.LIZ("cancelMusicSync");
        this.LIZLLL = null;
        LJIIIZ().LIZJ = null;
        LJIIIZ().LIZIZ();
        C5U8 LJIIIZ = LJIIIZ();
        LJIIIZ.getClass();
        C43117Gw5.LIZ.getClass();
        if (C45771Hxn.LIZIZ && (c5ua = LJIIIZ.LJ) != null && (LIZLLL = c5ua.LIZLLL()) != null) {
            for (VideoSegment videoSegment : LIZLLL) {
                C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
                String LJII = videoSegment.LJII(false);
                c43117Gw5.getClass();
                if (C43117Gw5.LJIIIZ(LJII)) {
                    videoSegment.duration = 3000L;
                }
            }
        }
        this.LIZJ = false;
    }

    public final C5U8 LJIIIZ() {
        return (C5U8) this.LJI.getValue();
    }

    public final C46074I6k LJIIJJI() {
        return (C46074I6k) this.LJII.getValue();
    }

    public final List<VideoSegment> LJIIJ() {
        List<VideoSegment> LIZLLL = LIZLLL();
        if (C77413UZt.LJIILL(LIZLLL)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (VideoSegment videoSegment : LIZLLL) {
            int i2 = i + 1;
            if (i >= 0) {
                VideoSegment videoSegment2 = videoSegment;
                if (!videoSegment2.isDeleted && !videoSegment2.isGetVideoFrame) {
                    HashSet<String> hashSet = LJIIJJI().LJIIJJI;
                    String LJII = videoSegment2.LJII(false);
                    LJII.toString();
                    if (!hashSet.contains(LJII)) {
                        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
                        String LJII2 = videoSegment2.LJII(false);
                        c43117Gw5.getClass();
                        if (!C43117Gw5.LJIIIZ(LJII2)) {
                            arrayList.add(videoSegment2);
                        }
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }

    public static void LJIIIIZZ(InterfaceC88472Yns interfaceC88472Yns) {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C62892dR(20L, interfaceC88472Yns, null), 3);
    }

    @Override // X.C5UA
    public final void LIZJ(int i) {
        LJIIIZ().getClass();
        if (i == 6 || i == 7) {
            return;
        }
        this.LIZIZ.LJJJZ(LIZLLL());
    }

    public final void LJI(int i, int i2) {
        boolean z;
        C136195Wd c136195Wd = AbstractC46064I6a.LLIILZL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeMusicStartAndEnd,isMusicValid:");
        if (this.LIZLLL != null) {
            z = true;
        } else {
            z = false;
        }
        C1FL.LJFF(LIZ, z, ",trimIn:", i, ",trimOut:");
        LIZ.append(i2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c136195Wd.getClass();
        C136195Wd.LIZ(LIZIZ);
        if (this.LIZLLL == null) {
            return;
        }
        if (!((Boolean) this.LJIIJ.getValue()).booleanValue()) {
            this.LIZIZ.LJIIIZ();
        }
        LJIIIZ().LIZJ(this.LIZLLL, i, 2, new I7G(this));
    }

    public C46072I6i(ActivityC45651qj activityC45651qj, C46066I6c musicSyncView, C82622Wbi objectContainer) {
        o.LJIIIZ(musicSyncView, "musicSyncView");
        o.LJIIIZ(objectContainer, "objectContainer");
        this.LIZ = activityC45651qj;
        this.LIZIZ = musicSyncView;
        this.LJI = C221108m2.LIZIZ(C5WC.LJLIL);
        this.LJII = C221108m2.LIZIZ(I7Z.LJLIL);
        this.LJIIIZ = (InterfaceC140255ev) objectContainer.LJ(InterfaceC140255ev.class, null);
        this.LJIIJ = C221108m2.LIZIZ(C5SY.LJLIL);
        this.LJIILJJIL = new I7A(20.0f, 20.0f, 60.0f);
    }

    public static /* synthetic */ void LJIILIIL(C46072I6i c46072I6i, AVMusic aVMusic, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i;
        if ((i2 & 2) != 0) {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        c46072I6i.LJIIL(aVMusic, i3, z, z2, z3, null);
    }

    public final void LJII(AVMusic aVMusic, int i, boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        AbstractC46064I6a.LLIILZL.getClass();
        C136195Wd.LIZ("downloadMusicFile");
        LJIIIIZZ(new AqS173S0100000_7(this, 102));
        C45422HsA.LIZIZ(this.LIZ, aVMusic, new C46082I6s(this, interfaceC65784Pro, i, z, z2));
    }

    public final void LJIIL(AVMusic aVMusic, int i, boolean z, boolean z2, boolean z3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        CreativeModel creativeModel;
        boolean z4;
        int i2;
        VideoPublishEditModel videoPublishEditModel = this.LJIIIIZZ;
        if (videoPublishEditModel != null) {
            creativeModel = videoPublishEditModel.creativeModel;
        } else {
            creativeModel = null;
        }
        if (C44701HgX.LJIIJJI(creativeModel)) {
            return;
        }
        C136195Wd c136195Wd = AbstractC46064I6a.LLIILZL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startMusicSync,isMusicValid:");
        int i3 = 0;
        if (aVMusic != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        C1FL.LJFF(LIZ, z4, ",start:", i, ",updateAlgorithm:");
        LIZ.append(z);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c136195Wd.getClass();
        C136195Wd.LIZ(LIZIZ);
        VideoPublishEditModel videoPublishEditModel2 = this.LJIIIIZZ;
        if (videoPublishEditModel2 != null) {
            boolean z5 = videoPublishEditModel2.soundSyncFromAnchor;
            boolean z6 = videoPublishEditModel2.shouldSkipMusicSync;
            if (z5 && z6) {
                this.LIZLLL = aVMusic;
                LJIIIZ().LIZJ = aVMusic;
                this.LIZIZ.LJJIJLIJ(true, z2, z3);
                LIZJ(2);
                VideoPublishEditModel videoPublishEditModel3 = this.LJIIIIZZ;
                if (videoPublishEditModel3 != null) {
                    videoPublishEditModel3.shouldSkipMusicSync = false;
                }
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                this.LIZIZ.LJJJJZI();
                return;
            }
        }
        if (aVMusic == null) {
            LJFF();
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        if (C45771Hxn.LIZ) {
            i2 = 60;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = (100 - i2) / 2;
        }
        this.LJIILJJIL = new I7A((100 - i2) - i3, i3, i2);
        C46078I6o c46078I6o = new C46078I6o(this, aVMusic, z, i, z2, z3, interfaceC65784Pro);
        if (z2) {
            this.LIZIZ.LJIIIZ();
        }
        if (C45771Hxn.LIZ) {
            c46078I6o.invoke();
        } else {
            LJIIIIZZ(new AqS173S0100000_7(this, 106));
            HZU.LIZ().LJFF(new I72(c46078I6o, this));
        }
    }
}
