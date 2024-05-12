package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GuQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43014GuQ {
    public static InterfaceC43019GuV LIZLLL;
    public static InterfaceC43019GuV LJ;
    public static List<? extends MusicModel> LJFF;
    public static int LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static volatile C43021GuX LJIIIZ;
    public static C73411SrX LJIIJJI;
    public static final C43014GuQ LIZ = new C43014GuQ();
    public static final List<C60G> LIZIZ = new ArrayList();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C171136nd.LJLIL);
    public static final java.util.Map<String, C43021GuX> LJIIJ = new LinkedHashMap();

    public static C43023GuZ LIZIZ() {
        C43021GuX c43021GuX = LJIIIZ;
        if (c43021GuX != null) {
            return c43021GuX.LJIIIIZZ.LJJZZIII();
        }
        return null;
    }

    public static final MusicModel LJ() {
        List<? extends MusicModel> list = LJFF;
        if (list != null && !C79004UzY.LJJIFFI(list)) {
            return (MusicModel) ListProtector.get(list, LJI % list.size());
        }
        return null;
    }

    public static final void LJFF() {
        LJI++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI() {
        QXX qxx;
        boolean z;
        C43021GuX c43021GuX;
        C43016GuS c43016GuS;
        C43021GuX c43021GuX2 = LJIIIZ;
        if (c43021GuX2 != null && (c43016GuS = c43021GuX2.LIZ) != null) {
            qxx = c43016GuS.LIZ;
        } else {
            qxx = null;
        }
        if ((qxx instanceof C42362Gju) && (c43021GuX = LJIIIZ) != null && c43021GuX.LJIIIIZZ.LJJZZIII() != null) {
            z = true;
        } else {
            z = false;
        }
        for (C43021GuX c43021GuX3 : ((LinkedHashMap) LJIIJ).values()) {
            if (!o.LJ(c43021GuX3, LJIIIZ) || !z) {
                AbstractC41925Gcr abstractC41925Gcr = c43021GuX3.LIZIZ;
                if (abstractC41925Gcr != null) {
                    abstractC41925Gcr.LIZIZ();
                }
                c43021GuX3.LJI.dispose();
                C73411SrX c73411SrX = c43021GuX3.LJII;
                if (c73411SrX != null) {
                    c73411SrX.dispose();
                }
                ((ArrayList) c43021GuX3.LJIIJ).clear();
            }
        }
        java.util.Map<String, C43021GuX> map = LJIIJ;
        ((LinkedHashMap) map).clear();
        if (z) {
            C43021GuX c43021GuX4 = LJIIIZ;
            if (c43021GuX4 != null) {
                map.put(c43021GuX4.LIZJ.getValue(), c43021GuX4);
            }
        } else {
            LJIIIZ = null;
        }
        C44687HgJ.LJIIL(new File((String) LIZJ.getValue()));
    }

    public static final String LIZJ() {
        return C41930Gcw.LIZLLL();
    }

    public static final void LJII(boolean z) {
        if (!z || !LJII || LJIIIIZZ || !C43015GuR.LIZ()) {
            LJFF = null;
            LJI = 0;
            LJI();
        } else {
            LJI();
        }
        C73411SrX c73411SrX = LJIIJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("login", String.valueOf(C60903NvH.LJIIJJI().getAccountService().isLogin()));
        FMX.LJIIL("ai_music_reset", c145995oB.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LJIIJJI(C43016GuS c43016GuS) {
        Object obj;
        QXX qxx;
        C41930Gcw.LIZIZ(c43016GuS.LIZ);
        AbstractC41925Gcr abstractC41925Gcr = C41930Gcw.LIZIZ;
        Iterator it = ((LinkedHashMap) LJIIJ).values().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
            C43021GuX c43021GuX = (C43021GuX) obj;
            c43021GuX.getClass();
            C43016GuS last = c43021GuX.LIZ;
            o.LJIIIZ(last, "last");
            QXX qxx2 = c43016GuS.LIZ;
            if ((qxx2 == null && last.LIZ == null) || ((qxx = last.LIZ) != null && qxx2 != null && qxx2.LLJJJJLIIL(qxx))) {
                break;
            }
        }
        C43021GuX c43021GuX2 = (C43021GuX) obj;
        if (c43021GuX2 != null) {
            c43021GuX2.LIZ = c43016GuS;
            AbstractC41925Gcr abstractC41925Gcr2 = c43021GuX2.LIZIZ;
            if (abstractC41925Gcr2 != null && abstractC41925Gcr2.LJI.LJJZZIII() != null) {
                C43016GuS c43016GuS2 = c43021GuX2.LIZ;
                C43021GuX.LIZJ(c43021GuX2, c43016GuS2.LIZIZ, c43016GuS2.LJII);
            }
        } else {
            c43021GuX2 = new C43021GuX(c43016GuS, abstractC41925Gcr);
            LJIIJ.put(c43021GuX2.LIZJ.getValue(), c43021GuX2);
            H7B.LIZIZ("AI_MUSIC_OPTIMIZE", "startUploadFrame");
            if (abstractC41925Gcr != null) {
                abstractC41925Gcr.LJIIJ();
            }
        }
        InterfaceC43019GuV interfaceC43019GuV = LIZLLL;
        if (interfaceC43019GuV != null) {
            c43021GuX2.LIZ(interfaceC43019GuV);
        }
        InterfaceC43019GuV interfaceC43019GuV2 = LJ;
        if (interfaceC43019GuV2 != null && (c43016GuS.LIZ instanceof C42362Gju)) {
            c43021GuX2.LIZ(interfaceC43019GuV2);
        }
        C73411SrX c73411SrX = LJIIJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73849Syb<Boolean> c73849Syb = c43021GuX2.LJIIIZ;
        LJIIJJI = (C73411SrX) C42193GhB.LIZJ(c73849Syb, c73849Syb).LJJJLIIL(new InterfaceC64592gB() { // from class: X.60H
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj2) {
                Iterator it2 = ((ArrayList) C43014GuQ.LIZIZ).iterator();
                while (it2.hasNext()) {
                    C60G c60g = (C60G) it2.next();
                    if (c60g != null) {
                        c60g.LIZ();
                    }
                }
            }
        }, C73674Svm.LIZLLL);
        LJIIIZ = c43021GuX2;
        return (String) c43021GuX2.LIZJ.getValue();
    }

    public final void LJIIIIZZ(HA1 ha1) {
        C43021GuX c43021GuX = LJIIIZ;
        if (c43021GuX != null) {
            c43021GuX.LIZ(ha1);
        }
        LJ = ha1;
    }

    public final void LJIIIZ(C60E c60e) {
        if (c60e == null) {
            ((ArrayList) LIZIZ).clear();
            return;
        }
        ((ArrayList) LIZIZ).add(c60e);
        if (LIZIZ() != null) {
            c60e.LIZ();
        }
    }

    public final void LJIIJ(C6FV c6fv) {
        C43021GuX c43021GuX;
        if (c6fv == null) {
            InterfaceC43019GuV interfaceC43019GuV = LIZLLL;
            if (interfaceC43019GuV != null && (c43021GuX = LJIIIZ) != null) {
                ((ArrayList) c43021GuX.LJIIJ).remove(interfaceC43019GuV);
            }
        } else {
            C43021GuX c43021GuX2 = LJIIIZ;
            if (c43021GuX2 != null) {
                c43021GuX2.LIZ(c6fv);
            }
        }
        LIZLLL = c6fv;
    }

    public final String LJIILJJIL(String str, String str2, List imgList, boolean z) {
        String str3 = str;
        o.LJIIIZ(imgList, "imgList");
        C42362Gju c42362Gju = new C42362Gju(imgList);
        if (str3 == null) {
            str3 = "";
        }
        return LJIIJJI(new C43016GuS(c42362Gju, 0L, str3, null, z, str2, false, 170));
    }

    public final C73390SrC LIZLLL(String str, boolean z, int i, int i2, String str2) {
        return AbstractC73672Svk.LJIIJ(new C42638GoM(str, z, i, i2, str2));
    }

    public final String LJIILIIL(List<String> imgList, String str, String str2, Boolean bool, Long l) {
        long j;
        boolean z;
        String str3 = str;
        o.LJIIIZ(imgList, "imgList");
        C42362Gju c42362Gju = new C42362Gju(imgList);
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (str2 != null) {
            str4 = str2;
        }
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return LJIIJJI(new C43016GuS(c42362Gju, j, str3, str4, false, null, z, 112));
    }

    public final String LJIILL(ExtractFramesModel extractFramesModel, List<? extends MultiEditVideoSegmentRecordData> list, String str, String str2, long j) {
        String str3 = str;
        C41932Gcy c41932Gcy = new C41932Gcy(extractFramesModel, list);
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (str2 != null) {
            str4 = str2;
        }
        return LJIIJJI(new C43016GuS(c41932Gcy, j, str3, str4, false, null, false, 240));
    }

    public final String LJIIL(String videoPath, Long l, String str, long j, String str2, String str3) {
        long j2;
        String str4 = str;
        o.LJIIIZ(videoPath, "videoPath");
        long j3 = 0;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        C41931Gcx c41931Gcx = new C41931Gcx(videoPath, j2, j);
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (str2 != null) {
            str5 = str2;
        }
        if (l != null) {
            j3 = l.longValue();
        }
        return LJIIJJI(new C43016GuS(c41931Gcx, j - j3, str4, str5, false, str3, false, 176));
    }

    public final C73426Srm LIZ(String str, long j, int i, int i2, int i3, boolean z, int i4, String musicID, int i5, int i6, boolean z2) {
        C43021GuX c43021GuX;
        o.LJIIIZ(musicID, "musicID");
        if (str == null) {
            c43021GuX = LJIIIZ;
        } else {
            c43021GuX = (C43021GuX) ((LinkedHashMap) LJIIJ).get(str);
        }
        C41930Gcw.LIZIZ(null);
        AbstractC41925Gcr abstractC41925Gcr = C41930Gcw.LIZIZ;
        if (c43021GuX == null) {
            c43021GuX = new C43021GuX(new C43016GuS(null, 0L, null, null, false, null, false, 254), abstractC41925Gcr);
        }
        if (z) {
            c43021GuX.LJIIJJI = false;
            c43021GuX.LJIIIIZZ = new C73849Syb<>();
        }
        if (!c43021GuX.LJIIJJI) {
            c43021GuX.LIZLLL(i, j, null, i2, i3, i4, musicID, i5, i6, z2);
        }
        C73849Syb<C43023GuZ> c73849Syb = c43021GuX.LJIIIIZZ;
        return C42193GhB.LIZJ(c73849Syb, c73849Syb);
    }
}
