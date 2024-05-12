package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.Owj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63541Owj {
    public int LIZLLL;
    public int LJ;
    public long LJII;
    public final C63540Owi LIZ = new C63540Owi();
    public int LIZIZ = -1;
    public String LIZJ = "";
    public int LJFF = -1;
    public String LJI = "";

    public final void LIZ(Exception e) {
        o.LJIIIZ(e, "e");
        C63322OtC.LJI("SendMsgTracker", "send message fetch failed", e);
        if (e instanceof C63599Oxf) {
            C63599Oxf c63599Oxf = (C63599Oxf) e;
            this.LIZIZ = c63599Oxf.getErrorCode();
            this.LIZJ = c63599Oxf.getErrorMessage();
            if (c63599Oxf.getErrorResponse() != null) {
                C63540Owi c63540Owi = this.LIZ;
                c63540Owi.LJJIJIIJI = AbstractC63551Owt.LIZ;
                c63540Owi.LJJIJ = c63599Oxf.getErrorCode();
                return;
            } else {
                this.LIZ.LJJIJIIJI = c63599Oxf.getErrorCode();
                return;
            }
        }
        this.LIZIZ = -9999;
        String message = e.getMessage();
        if (message == null) {
            message = "unknown error";
        }
        this.LIZJ = message;
        this.LIZ.LJJIJIIJI = -9999;
    }

    public final void LIZIZ(C63588OxU request) {
        o.LJIIIZ(request, "request");
        this.LIZ.LJJIFFI = request.LJLJLLL;
        C63540Owi c63540Owi = this.LIZ;
        c63540Owi.LJJIJIIJIL = request.LJLJL;
        c63540Owi.LJIIJ = SystemClock.uptimeMillis();
        C63540Owi c63540Owi2 = this.LIZ;
        C63308Osy.LJI().getClass();
        c63540Owi2.LJIIJJI = C63308Osy.LJ();
        C63540Owi c63540Owi3 = this.LIZ;
        c63540Owi3.LJIIL = c63540Owi3.LJIIJ - this.LIZ.LJIIIIZZ;
        if (this.LIZ.LJIILIIL > 0) {
            C63540Owi c63540Owi4 = this.LIZ;
            c63540Owi4.LJIILLIIL = c63540Owi4.LJIILIIL - this.LIZ.LJIIIZ;
        }
        if (this.LIZ.LJIILJJIL > 0) {
            C63540Owi c63540Owi5 = this.LIZ;
            c63540Owi5.LJIIZILJ = c63540Owi5.LJIIJJI - this.LIZ.LJIILJJIL;
        }
        C63540Owi c63540Owi6 = this.LIZ;
        c63540Owi6.LJIILL = (c63540Owi6.LJIIL - (this.LIZ.LJIILJJIL - this.LIZ.LJIILIIL)) / 2;
    }
}
