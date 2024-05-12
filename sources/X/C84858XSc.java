package X;

import android.content.Context;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XSc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84858XSc implements XUI {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public int LJ;
    public final Context LJFF;
    public final C84274X5q LJI;
    public InterfaceC84872XSq LJII;
    public final C51029K0z LJIIIIZZ;

    @Override // X.XUI
    public final void release() {
        this.LJI.LIZJ();
        InterfaceC84872XSq interfaceC84872XSq = this.LJII;
        if (interfaceC84872XSq != null) {
            interfaceC84872XSq.destroy();
        }
    }

    @Override // X.XUI
    public final void LIZ(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        this.LJI.LIZIZ(musicId);
        InterfaceC84872XSq interfaceC84872XSq = this.LJII;
        if (interfaceC84872XSq != null) {
            interfaceC84872XSq.destroy();
        }
    }

    @Override // X.XUI
    public final void LIZIZ(int i) {
        this.LJ = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r25, X.InterfaceC84870XSo r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84858XSc.LIZLLL(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, X.XSo, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.VzH, T, X.XSq] */
    @Override // X.XUI
    public final boolean LIZJ(MusicModel musicModel, InterfaceC84870XSo listener, boolean z, boolean z2) {
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(listener, "listener");
        AVExternalServiceImpl.LIZ().provideAVPerformance().start("av_music_download", "MusicFetcher start");
        if (!z) {
            return LIZLLL(musicModel, listener, z2);
        }
        C68322mC c68322mC = new C68322mC();
        C51029K0z c51029K0z = this.LJIIIIZZ;
        c51029K0z.getClass();
        ?? c81535VzH = new C81535VzH(c51029K0z);
        c68322mC.element = c81535VzH;
        this.LJII = c81535VzH;
        try {
            c81535VzH.LIZJ();
            return LIZLLL(musicModel, new C84863XSh(listener, c68322mC), z2);
        } catch (Throwable th) {
            if (th instanceof C81538VzK) {
                throw th.getRealThrowable();
            }
            throw th;
        }
    }

    public C84858XSc(Context context, String str, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(context, "context");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = str;
        this.LJ = 6;
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        this.LJFF = LLLLL;
        this.LJI = new C84274X5q();
        this.LJIIIIZZ = new C51029K0z();
    }
}
