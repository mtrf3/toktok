package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveMLBBFriendsUnit;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UUG extends TAT {
    public final /* synthetic */ RemoveMLBBFriendsUnit LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UUG(RemoveMLBBFriendsUnit removeMLBBFriendsUnit) {
        super(2000L);
        this.LJLJJI = removeMLBBFriendsUnit;
    }

    @Override // X.TAT
    public final void LIZ(View view) {
        UUF.LIZ(6);
        RemoveMLBBFriendsUnit removeMLBBFriendsUnit = this.LJLJJI;
        if (removeMLBBFriendsUnit.LJLJLJ) {
            UUF.LJ(6);
            Context requireContext = removeMLBBFriendsUnit.LJLJJL.requireContext();
            o.LJIIIIZZ(requireContext, "page.requireContext()");
            C26227ARb c26227ARb = new C26227ARb(requireContext);
            c26227ARb.LJ(R.string.i72);
            c26227ARb.LIZ(R.string.i71);
            UC0.LIZJ(c26227ARb, new AqS179S0100000_13(removeMLBBFriendsUnit, 576));
            c26227ARb.LJI().LIZLLL();
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(removeMLBBFriendsUnit.LJLJJL);
        c26045AKb.LJIIIIZZ(R.string.i6t);
        c26045AKb.LJIIJ();
    }
}
