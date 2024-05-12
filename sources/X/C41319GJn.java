package X;

import Y.ARunnableS11S0101000_7;
import Y.ARunnableS43S0100000_7;
import Y.ARunnableS8S1100000_7;
import com.bytedance.keva.Keva;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GJn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41319GJn implements GI4 {
    public final String LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 20));
    public final String LIZJ;
    public final ExecutorService LIZLLL;
    public final Stack<String> LJ;
    public final AtomicInteger LJFF;

    @Override // X.GI4
    public final void LIZLLL() {
        this.LIZLLL.submit(new ARunnableS43S0100000_7(this, 4));
    }

    @Override // X.GI4
    public final void LJ() {
        this.LIZLLL.submit(new ARunnableS43S0100000_7(this, 3));
    }

    @Override // X.GI4
    public final void LJII() {
        this.LIZLLL.submit(new ARunnableS43S0100000_7(this, 5));
    }

    public final Keva LJIIIIZZ() {
        return (Keva) this.LIZIZ.getValue();
    }

    @Override // X.GI4
    public final String LIZ() {
        String string = LJIIIIZZ().getString("exit_monitor_key_last_page", "");
        o.LJIIIIZZ(string, "keva.getString(KEY_LAST_PAGE, \"\")");
        return string;
    }

    public C41319GJn(String str) {
        String str2;
        this.LIZ = str;
        if (o.LJ(str, "normal")) {
            str2 = "video_shoot_page";
        } else if (o.LJ(str, "story")) {
            str2 = "story_shoot_page";
        } else {
            str2 = "";
        }
        this.LIZJ = str2;
        this.LIZLLL = C38995FSd.LJFF();
        this.LJ = new Stack<>();
        this.LJFF = new AtomicInteger(0);
    }

    @Override // X.GI4
    public final void LIZIZ(int i) {
        this.LIZLLL.submit(new ARunnableS11S0101000_7(i, this, 2));
    }

    @Override // X.GI4
    public final void LIZJ(String str) {
        this.LIZLLL.submit(new ARunnableS8S1100000_7(this, str, 1));
    }

    @Override // X.GI4
    public final void LJI(int i) {
        this.LIZLLL.submit(new ARunnableS11S0101000_7(i, this, 1));
    }

    @Override // X.GI4
    public final void LJFF(String str, boolean z) {
        this.LIZLLL.submit(new RunnableC41320GJo(z, this, str));
    }
}
