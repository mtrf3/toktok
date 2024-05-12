package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.live.LiveContainerActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.T1v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73983T1v extends C08Z {
    public final /* synthetic */ LiveContainerActivity LIZ;

    public C73983T1v(LiveContainerActivity liveContainerActivity) {
        this.LIZ = liveContainerActivity;
    }

    @Override // X.C08Z
    public final void onFragmentStopped(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentStopped(fm, f);
        if (o.LJ(this.LIZ.LJLILLLLZI, "subscribe_info_list")) {
            this.LIZ.finish();
        }
    }
}
