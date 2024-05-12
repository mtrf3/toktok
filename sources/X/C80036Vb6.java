package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Vb6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80036Vb6 implements OV6, InterfaceC80039Vb9 {
    public static boolean LJLIL = true;
    public static InterfaceC64046PBq LJLILLLLZI;

    @Override // X.OV6
    public void LIZ(MusicModel musicModel, String musicFile) {
        o.LJIIIZ(musicFile, "musicFile");
    }

    @Override // X.OV6
    public void LIZJ() {
    }

    @Override // X.OV6
    public void LIZLLL() {
    }

    @Override // X.OV6
    public void LJFF(MusicModel musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
    }

    public static IPlayerExperiment LIZIZ() {
        return IUB.LIZIZ();
    }

    @Override // X.InterfaceC80039Vb9
    public V1L LJ(InterfaceC79968Va0 interfaceC79968Va0) {
        int currentIndex;
        if (interfaceC79968Va0 != null) {
            if (interfaceC79968Va0.getCurrentIndex() + 1 > C47261Igj.LJJI(interfaceC79968Va0.LIZIZ())) {
                currentIndex = 0;
            } else {
                currentIndex = interfaceC79968Va0.getCurrentIndex() + 1;
            }
            return (V1L) ORZ.LJLLLLLL(currentIndex, interfaceC79968Va0.LIZIZ());
        }
        return null;
    }

    @Override // X.InterfaceC80039Vb9
    public V1L LJI(InterfaceC79968Va0 interfaceC79968Va0) {
        int currentIndex;
        if (interfaceC79968Va0 != null) {
            if (interfaceC79968Va0.getCurrentIndex() - 1 < 0) {
                currentIndex = C47261Igj.LJJI(interfaceC79968Va0.LIZIZ());
            } else {
                currentIndex = interfaceC79968Va0.getCurrentIndex() - 1;
            }
            return (V1L) ORZ.LJLLLLLL(currentIndex, interfaceC79968Va0.LIZIZ());
        }
        return null;
    }

    @Override // X.InterfaceC80039Vb9
    public V1L LJII(InterfaceC79968Va0 interfaceC79968Va0) {
        List<V1L> LIZIZ;
        if (interfaceC79968Va0 != null && (LIZIZ = interfaceC79968Va0.LIZIZ()) != null) {
            return (V1L) ORZ.LJLLLLLL(interfaceC79968Va0.getCurrentIndex(), LIZIZ);
        }
        return null;
    }

    public static void LJIIIIZZ(String str, String str2) {
        InterfaceC64046PBq interfaceC64046PBq;
        if (LJLIL && (interfaceC64046PBq = LJLILLLLZI) != null) {
            interfaceC64046PBq.i(str, str2);
        }
    }
}
