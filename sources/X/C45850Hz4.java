package X;

import com.ss.android.ugc.aweme.services.external.IRecordEnv;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Hz4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45850Hz4 implements IRecordEnv {
    public final I37 LIZ;
    public IRecordingOperationPanel LIZIZ;
    public ActivityC45651qj LIZJ;
    public ShortVideoContext LIZLLL;
    public InterfaceC83865Wvl LJ;
    public InterfaceC82086WJm LJFF;
    public I3X LJI;
    public C5H3<? extends I0N> LJII;
    public WRP LJIIIIZZ;
    public C83576Wr6 LJIIIZ;
    public String LJIIJ;

    public final ActivityC45651qj LIZ() {
        ActivityC45651qj activityC45651qj = this.LIZJ;
        if (activityC45651qj != null) {
            return activityC45651qj;
        }
        o.LJIJI("activity");
        throw null;
    }

    public final InterfaceC82086WJm LIZIZ() {
        InterfaceC82086WJm interfaceC82086WJm = this.LJFF;
        if (interfaceC82086WJm != null) {
            return interfaceC82086WJm;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }

    public final InterfaceC83865Wvl LIZJ() {
        InterfaceC83865Wvl interfaceC83865Wvl = this.LJ;
        if (interfaceC83865Wvl != null) {
            return interfaceC83865Wvl;
        }
        o.LJIJI("mediaController");
        throw null;
    }

    public final ShortVideoContext LIZLLL() {
        ShortVideoContext shortVideoContext = this.LIZLLL;
        if (shortVideoContext != null) {
            return shortVideoContext;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public final C5H3<I0N> LJ() {
        C5H3 c5h3 = this.LJII;
        if (c5h3 != null) {
            return c5h3;
        }
        o.LJIJI("stickerModule");
        throw null;
    }

    public C45850Hz4(I37 i37) {
        this.LIZ = i37;
    }
}
