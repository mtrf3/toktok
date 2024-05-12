package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import kotlin.jvm.internal.o;

/* renamed from: X.G3h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40897G3h extends C08Z {
    public final /* synthetic */ ActivityC45651qj LIZ;

    public C40897G3h(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
    }

    @Override // X.C08Z
    public final void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentDestroyed(fm, f);
        ISpecActService.LIZ.getClass();
        C40894G3e.LIZ().LJJIIJZLJL();
    }

    @Override // X.C08Z
    public final void onFragmentCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentCreated(fm, f, bundle);
        String tv0 = com.bytedance.hox.Hox.LJLLI.LIZ(this.LIZ).tv0(f);
        ISpecActService.LIZ.getClass();
        C40894G3e.LIZ().LJJJ(new C40896G3g(f, tv0));
    }
}
