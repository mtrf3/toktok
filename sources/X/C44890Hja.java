package X;

import Y.AfS50S0200000_1;
import Y.IDhS100S0100000_7;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Hja, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44890Hja {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static Aweme LIZLLL;
    public static final C73318Sq2 LIZJ = new C73318Sq2();
    public static String LJ = "";
    public static String LJFF = "";
    public static String LJI = "";
    public static String LJII = "";
    public static String LJIIIIZZ = "";
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C44893Hjd.LJLIL);
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C44895Hjf.LJLIL);
    public static final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(C44892Hjc.LJLIL);
    public static final C62822Ol8 LJIIL = C221108m2.LIZIZ(C44894Hje.LJLIL);
    public static final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(C44891Hjb.LJLIL);

    public static Context LIZ() {
        return (Context) LJIIIZ.getValue();
    }

    public static void LIZIZ(Aweme aweme, InterfaceC88472Yns saveNextAction) {
        String str;
        VideoUrlModel playAddrH264;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(saveNextAction, "saveNextAction");
        C44938HkM.LJFF = aweme;
        LIZLLL = aweme;
        LIZ = false;
        LIZIZ = true;
        C57082Lw.LIZ.LIZJ("video_download_status").postValue(C45382HrW.LIZJ(1, aweme, 0, null, null, 28));
        StringBuilder LIZ2 = X1D.LIZ();
        Video video = aweme.getVideo();
        if (video != null && (playAddrH264 = video.getPlayAddrH264()) != null) {
            str = playAddrH264.getUri();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(AV1.LIZLLL(aweme.getAuthor()));
        String LIZJ2 = C38352F3k.LIZJ(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(LIZJ2, "md5Hex(aweme.video?.play….getHandle(aweme.author))");
        LJ = LIZJ2;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append((String) LJIIJ.getValue());
        LJFF = JBR.LJFF(LIZ3, LJ, ".mp4", LIZ3);
        C78999UzT.LJFF(AbstractC73638SvC.LJJIIZ(AbstractC73638SvC.LJI(new C41820GbA(aweme)), AbstractC73638SvC.LJI(new C41824GbE(aweme)), C79012Uzg.LJLJJL).LJJIIJ(T16.LIZ()).LJIILL(new IDhS100S0100000_7(aweme, 3)).LJIILL(new IDhS100S0100000_7(aweme, 4)).LJIILL(C44885HjV.LJLIL).LJIJI(C78540Us4.LJLILLLLZI).LJIJJ(C73969T1h.LIZIZ()).LJJIFFI(new AfS50S0200000_1(aweme, saveNextAction, 6)), LIZJ);
    }
}
