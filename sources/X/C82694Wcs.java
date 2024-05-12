package X;

import Y.ARunnableS50S0100000_14;
import android.os.Handler;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleSettings;
import com.bytedance.poplayer.core.PopupManager;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Wcs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82694Wcs implements InterfaceC54197LOv {
    public ActivityC45651qj LIZ;
    public Handler LIZIZ;
    public C82693Wcr LJ;
    public View LJFF;
    public C82691Wcp LJII;
    public boolean LJIIIIZZ;
    public String LIZJ = "For You";
    public String LIZLLL = "HOME";
    public boolean LJI = true;

    public static boolean LJIIIZ() {
        int expGroup = FollowLiveBubbleSettings.INSTANCE.getExpGroup();
        if (2 <= expGroup && expGroup < 4) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54197LOv
    public final boolean LJ() {
        if (o.LJ(this.LIZJ, "For You") && o.LJ(this.LIZLLL, "HOME")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54197LOv
    public final boolean LJFF() {
        C82691Wcp c82691Wcp = this.LJII;
        if (c82691Wcp != null) {
            return c82691Wcp.isShowing();
        }
        return false;
    }

    public final void LJIIJ() {
        ActivityC45651qj activityC45651qj = this.LIZ;
        if (activityC45651qj != null) {
            try {
                C82691Wcp c82691Wcp = new C82691Wcp(activityC45651qj);
                this.LJII = c82691Wcp;
                View view = this.LJFF;
                boolean z = this.LJI;
                c82691Wcp.LIZJ = view;
                c82691Wcp.LJ = z;
                C82693Wcr c82693Wcr = this.LJ;
                if (c82693Wcr != null) {
                    c82691Wcp.LJFF.add(c82693Wcr);
                }
                C82699Wcx.LIZJ(activityC45651qj, c82691Wcp, this);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC54197LOv
    public final void LIZIZ() {
        if (LJIIIZ()) {
            if (LJFF()) {
                LJIIIIZZ();
            }
            if (C82699Wcx.LJI) {
                PopupManager.LJI(C85754Xl8.class);
                C82699Wcx.LJI = false;
            }
            C82699Wcx.LIZIZ = true;
        }
    }

    public final void LJIIIIZZ() {
        C82691Wcp c82691Wcp;
        if (LJIIIZ() && (c82691Wcp = this.LJII) != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            C54193LOr c54193LOr = C82699Wcx.LJ;
            c54193LOr.LIZ = -1;
            c54193LOr.LIZIZ = 0;
            c54193LOr.LIZJ = arrayList;
            c82691Wcp.LIZ();
        }
    }

    @Override // X.InterfaceC54197LOv
    public final void dispose() {
        if (LJIIIZ()) {
            this.LIZ = null;
            this.LIZIZ = null;
            this.LJFF = null;
            this.LJ = null;
        }
    }

    @Override // X.InterfaceC54197LOv
    public final void LIZ(View view) {
        if (LJIIIZ()) {
            this.LJFF = view;
            this.LJI = false;
        }
    }

    @Override // X.InterfaceC54197LOv
    public final void LIZJ(C54192LOq c54192LOq) {
        if (LJIIIZ()) {
            this.LJ = new C82693Wcr(c54192LOq, this);
        }
    }

    @Override // X.InterfaceC54197LOv
    public final void LIZLLL(String str) {
        if (LJIIIZ()) {
            if (str != null) {
                this.LIZLLL = str;
            }
            if (LJFF()) {
                LJIIIIZZ();
            }
            if (C82699Wcx.LJI) {
                PopupManager.LJI(C85754Xl8.class);
                C82699Wcx.LJI = false;
            }
        }
    }

    @Override // X.InterfaceC54197LOv
    public final void LJI(String str) {
        if (LJIIIZ()) {
            if (str != null) {
                this.LIZJ = str;
            }
            if (LJFF()) {
                LJIIIIZZ();
            }
            if (C82699Wcx.LJI) {
                PopupManager.LJI(C85754Xl8.class);
                C82699Wcx.LJI = false;
            }
        }
    }

    @Override // X.InterfaceC54197LOv
    public final void LJII(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        if (LJIIIZ()) {
            this.LJIIIIZZ = false;
            this.LIZ = activity;
            this.LIZIZ = new Handler(C16880lQ.LLJJJJ());
        }
    }

    @Override // X.InterfaceC54197LOv
    public final void show(boolean z) {
        if (!LJIIIZ() || this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        if (z) {
            Handler handler = this.LIZIZ;
            if (handler != null) {
                handler.postDelayed(new ARunnableS50S0100000_14(this, 0), 10000L);
                return;
            }
            return;
        }
        LJIIJ();
    }
}
