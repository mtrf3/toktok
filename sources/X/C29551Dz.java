package X;

import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import java.util.List;

/* renamed from: X.1Dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29551Dz extends C0EZ<C279917z> {
    public C0ET LJFF;

    public final C279917z LIZJ() {
        return (C279917z) ORZ.LJLLLL(this.LIZ);
    }

    public final C0ET LIZLLL() {
        C0ET c0et = this.LJFF;
        if (c0et != null) {
            return c0et;
        }
        C0ET c0et2 = new C0ET();
        c0et2.LIZ = LIZ();
        this.LJFF = c0et2;
        return c0et2;
    }

    public final void LJ() {
        IAudioFilterManager iAudioFilterManager;
        C0NB.LIZIZ("KaraokeSongListManager", "onPause");
        if (this.LIZIZ && (iAudioFilterManager = LIZLLL().LIZ) != null) {
            iAudioFilterManager.pause();
        }
        this.LIZJ = true;
        LIZIZ(false);
    }

    public C29551Dz(List<C279917z> list) {
        super(list);
    }

    public final boolean LJFF(int i, boolean z) {
        AnonymousClass011 anonymousClass011;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isPlaying: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isPaused: ");
        C19U.LIZJ(LIZ, this.LIZJ, LIZ, "KaraokeSongListManager");
        if (this.LIZ.size() <= i || (anonymousClass011 = (AnonymousClass011) ORZ.LJLLLLLL(i, this.LIZ)) == null) {
            return false;
        }
        if (this.LIZIZ && !z) {
            return false;
        }
        if (!this.LIZJ || z) {
            C0ET LIZLLL = LIZLLL();
            if (anonymousClass011 instanceof C279917z) {
                C279917z c279917z = (C279917z) anonymousClass011;
                IAudioFilterManager iAudioFilterManager = LIZLLL.LIZ;
                if (iAudioFilterManager != null) {
                    if (!iAudioFilterManager.isEnable()) {
                        iAudioFilterManager.setEnable(true);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("ori: ");
                    LIZ2.append(AnonymousClass011.LIZ(c279917z.LIZIZ.LIZIZ()));
                    C0NB.LIZIZ("KaraokePlayer", X1D.LIZIZ(LIZ2));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("inst: ");
                    LIZ3.append(AnonymousClass011.LIZ(c279917z.LJIIIIZZ.LIZIZ()));
                    C0NB.LIZIZ("KaraokePlayer", X1D.LIZIZ(LIZ3));
                    iAudioFilterManager.setBGMMusic(AnonymousClass011.LIZ(c279917z.LJIIIIZZ.LIZIZ()), AnonymousClass011.LIZ(c279917z.LIZIZ.LIZIZ()));
                    iAudioFilterManager.resume();
                }
            } else {
                IAudioFilterManager iAudioFilterManager2 = LIZLLL.LIZ;
                if (iAudioFilterManager2 != null) {
                    iAudioFilterManager2.setBGMMusic(AnonymousClass011.LIZ(anonymousClass011.LIZIZ.LIZIZ()));
                    iAudioFilterManager2.resume();
                }
            }
        } else {
            IAudioFilterManager iAudioFilterManager3 = LIZLLL().LIZ;
            if (iAudioFilterManager3 != null) {
                iAudioFilterManager3.resume();
            }
        }
        this.LIZJ = false;
        LIZIZ(true);
        return true;
    }
}
