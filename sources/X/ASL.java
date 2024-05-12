package X;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASL {
    public final TuxSheet LIZ = new TuxSheet();

    public final void LIZ(View content) {
        o.LJIIIZ(content, "content");
        this.LIZ.LJLLI = content;
    }

    public final void LIZIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LJLLILLLL = fragment;
    }

    public final void LIZLLL(int i) {
        this.LIZ.LJLJJLL = Integer.valueOf(i);
    }

    public final void LJ(DialogInterface.OnDismissListener onDismissListener) {
        o.LJIIIZ(onDismissListener, "onDismissListener");
        this.LIZ.LJLILLLLZI = onDismissListener;
    }

    public final void LJFF(int i) {
        this.LIZ.LLFII = Integer.valueOf(i);
    }

    public final void LJI(int i) {
        boolean z;
        TuxSheet tuxSheet = this.LIZ;
        tuxSheet.LJLLLL = i;
        if (i == 3 || i == 4) {
            z = true;
        } else {
            z = false;
        }
        tuxSheet.LJLJJI = z;
    }

    public final void LIZJ(int i, int i2) {
        TuxSheet tuxSheet = this.LIZ;
        tuxSheet.LJLZ = i;
        tuxSheet.LJZ = i2;
    }
}
