package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.inbox.InboxShellFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJH extends C08Z {
    public final /* synthetic */ InboxShellFragment LIZ;

    public LJH(InboxShellFragment inboxShellFragment) {
        this.LIZ = inboxShellFragment;
    }

    @Override // X.C08Z
    public final void onFragmentResumed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        this.LIZ.getChildFragmentManager().LJLJJLL(this);
        this.LIZ.wl();
    }
}
