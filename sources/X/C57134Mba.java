package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.relation.fragment.ShareInviteContentFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Mba, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57134Mba implements InterfaceC108804Ou {
    public final FragmentManager LIZ;
    public final TuxSheet LIZIZ;

    @Override // X.InterfaceC108804Ou
    public final void show() {
        C221018lt.LJFF("ShareInviteSheet", "show invite friends sheet!");
        FragmentManager fragmentManager = this.LIZ;
        if (fragmentManager != null) {
            this.LIZIZ.show(fragmentManager, "ShareInviteSheet");
        }
    }

    public C57134Mba(Context context, Bundle bundle) {
        FragmentManager fragmentManager;
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            fragmentManager = LJJIFFI.getSupportFragmentManager();
        } else {
            fragmentManager = null;
        }
        this.LIZ = fragmentManager;
        Fragment instantiate = Fragment.instantiate(context, ShareInviteContentFragment.class.getName(), bundle);
        o.LJIIIIZZ(instantiate, "instantiate(\n        con…ame,\n        bundle\n    )");
        ASL asl = new ASL();
        asl.LIZIZ(instantiate);
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = false;
        this.LIZIZ = tuxSheet;
    }
}
