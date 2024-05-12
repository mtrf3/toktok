package X;

import Y.IDDListenerS141S0100000_1;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* renamed from: X.3yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101683yu implements C3WY {
    public final Context LJLIL;
    public final /* synthetic */ C3WQ LJLILLLLZI;
    public TuxSheet LJLJI;

    public final void LIZ() {
        this.LJLILLLLZI.LIZ();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLILLLLZI.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLILLLLZI.LLJILLL(c3wr);
    }

    public C101683yu(ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = new C3WQ();
    }

    public final void LIZIZ(FragmentManager fm) {
        o.LJIIIZ(fm, "fm");
        ASL asl = new ASL();
        C92303jm c92303jm = new C92303jm(this.LJLIL);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLI = c92303jm;
        tuxSheet.LJLILLLLZI = new IDDListenerS141S0100000_1(this, 14);
        tuxSheet.show(fm, "SetFriendsPermissionSheet");
        C101573yj.LJIIJ(C101573yj.LIZ, 2, null, 6);
        this.LJLJI = tuxSheet;
    }
}
