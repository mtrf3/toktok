package X;

import Y.IDHandlerS20S0100000_7;
import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.I6k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46074I6k {
    public InterfaceC153045zY LIZ;
    public int LIZIZ;
    public VideoSegment LIZJ;
    public int LIZLLL;
    public List<? extends VideoSegment> LJ;
    public I7U LJFF;
    public AlertDialogC46073I6j LJI;
    public Activity LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public final HashSet<String> LJIIJJI = new HashSet<>();
    public final IDHandlerS20S0100000_7 LJIIL = new IDHandlerS20S0100000_7(this, C16880lQ.LLJJJJ(), 0);

    public final void LIZ(boolean z, boolean z2, boolean z3) {
        AlertDialogC46073I6j alertDialogC46073I6j = this.LJI;
        if (alertDialogC46073I6j != null && alertDialogC46073I6j.isShowing()) {
            AlertDialogC46073I6j alertDialogC46073I6j2 = this.LJI;
            o.LJI(alertDialogC46073I6j2);
            alertDialogC46073I6j2.dismiss();
            C42303Gix.LIZ(1012, GGO.DISMISS, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_VISIBLE, null);
        }
        I7U i7u = this.LJFF;
        if (i7u != null) {
            if (this.LJIIJ) {
                i7u.LIZ(false, z2);
            } else {
                i7u.LIZ(z, z2);
            }
        }
    }
}
