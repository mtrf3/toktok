package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J80 implements InterfaceC59264NNs {
    public final Aweme LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public final C32791Ql LJ;
    public final C32791Ql LJFF;

    @Override // X.InterfaceC59264NNs
    public final void LJ() {
    }

    @Override // X.InterfaceC59264NNs
    public final void LJFF() {
    }

    @Override // X.InterfaceC59264NNs
    public final void LIZIZ() {
        this.LIZLLL++;
        this.LIZJ = System.currentTimeMillis();
        if (((AtomicBoolean) this.LJFF.LJLIL).compareAndSet(false, true)) {
            C59127NIl LIZ = C59128NIm.LIZ();
            LIZ.LJ(this.LIZ);
            LIZ.LIZ = "draw_ad";
            LIZ.LIZIZ = "query_wrapper";
            LIZ.LIZ(C51029K0z.LJJIIZI(new OSZ("duration", Long.valueOf(System.currentTimeMillis() - this.LIZIZ))));
            LIZ.LJIIIZ(null);
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "query_wrapper", this.LIZ.getAwemeRawAd());
            LIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LIZJ), "duration");
            LIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC59264NNs
    public final void LIZJ() {
        if (((AtomicBoolean) this.LJ.LJLIL).compareAndSet(false, true)) {
            C59127NIl LIZ = C59128NIm.LIZ();
            LIZ.LJ(this.LIZ);
            LIZ.LIZ = "draw_ad";
            LIZ.LIZIZ = "show_fail";
            LIZ.LIZ(C51029K0z.LJJIIZI(new OSZ("error_message", "vast_wrapper_count_unmatch")));
            LIZ.LJIIIZ(null);
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "show_fail", this.LIZ.getAwemeRawAd());
            LIZLLL.LIZIZ("vast_wrapper_count_unmatch", "error_message");
            LIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC59264NNs
    public final void LJII() {
        this.LIZLLL++;
        this.LIZJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC59264NNs
    public final void LJJJLL() {
        this.LIZLLL--;
    }

    @Override // X.InterfaceC59264NNs
    public final void LIZ() {
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LJ(this.LIZ);
        LIZ.LIZ = "draw_ad";
        LIZ.LIZIZ = "get_inline";
        LIZ.LIZ(C113554cx.LJJL(new OSZ("duration", Long.valueOf(System.currentTimeMillis() - this.LIZJ)), new OSZ("wrapper_count", Integer.valueOf(this.LIZLLL - 1))));
        LIZ.LJIIIZ(null);
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "get_inline", this.LIZ.getAwemeRawAd());
        LIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LIZJ), "duration");
        LIZLLL.LIZIZ(Integer.valueOf(this.LIZLLL - 1), "wrapper_count");
        LIZLLL.LJII();
    }

    public J80(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZ = aweme;
        this.LIZIZ = System.currentTimeMillis();
        this.LJ = new C32791Ql(1);
        this.LJFF = new C32791Ql(1);
    }

    @Override // X.InterfaceC59264NNs
    public final void LIZLLL(J82 j82) {
        String str;
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LJ(this.LIZ);
        LIZ.LIZ = "draw_ad";
        LIZ.LIZIZ = "show_fail";
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("error_message", "vast_xml_format_error");
        Throwable cause = j82.getCause();
        String str2 = null;
        if (cause != null) {
            str = cause.getMessage();
        } else {
            str = null;
        }
        oszArr[1] = new OSZ("error_detail", str);
        LIZ.LIZ(C113554cx.LJJL(oszArr));
        LIZ.LJIIIZ(null);
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "show_fail", this.LIZ.getAwemeRawAd());
        LIZLLL.LIZIZ("vast_xml_format_error", "error_message");
        Throwable cause2 = j82.getCause();
        if (cause2 != null) {
            str2 = cause2.getMessage();
        }
        LIZLLL.LIZIZ(str2, "error_detail");
        LIZLLL.LJII();
    }

    @Override // X.InterfaceC59264NNs
    public final void LJI(J81 j81) {
        String str;
        String str2;
        String str3 = null;
        if (j81.getCause() instanceof C64923Pdv) {
            C59127NIl LIZ = C59128NIm.LIZ();
            LIZ.LJ(this.LIZ);
            LIZ.LIZ = "draw_ad";
            LIZ.LIZIZ = "show_fail";
            OSZ[] oszArr = new OSZ[2];
            oszArr[0] = new OSZ("error_message", "vast_mediafile_bad_response");
            Throwable cause = j81.getCause();
            if (cause != null) {
                str2 = cause.getMessage();
            } else {
                str2 = null;
            }
            oszArr[1] = new OSZ("error_detail", str2);
            LIZ.LIZ(C113554cx.LJJL(oszArr));
            LIZ.LJIIIZ(null);
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "show_fail", this.LIZ.getAwemeRawAd());
            LIZLLL.LIZIZ("vast_mediafile_bad_response", "error_message");
            Throwable cause2 = j81.getCause();
            if (cause2 != null) {
                str3 = cause2.getMessage();
            }
            LIZLLL.LIZIZ(str3, "error_detail");
            LIZLLL.LJII();
            return;
        }
        C59127NIl LIZ2 = C59128NIm.LIZ();
        LIZ2.LJ(this.LIZ);
        LIZ2.LIZ = "draw_ad";
        LIZ2.LIZIZ = "show_fail";
        OSZ[] oszArr2 = new OSZ[2];
        oszArr2[0] = new OSZ("error_message", "vast_filtered_others");
        Throwable cause3 = j81.getCause();
        if (cause3 != null) {
            str = cause3.getMessage();
        } else {
            str = null;
        }
        oszArr2[1] = new OSZ("error_detail", str);
        LIZ2.LIZ(C113554cx.LJJL(oszArr2));
        LIZ2.LJIIIZ(null);
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "show_fail", this.LIZ.getAwemeRawAd());
        LIZLLL2.LIZIZ("vast_filtered_others", "error_message");
        Throwable cause4 = j81.getCause();
        if (cause4 != null) {
            str3 = cause4.getMessage();
        }
        LIZLLL2.LIZIZ(str3, "error_detail");
        LIZLLL2.LJII();
    }
}
