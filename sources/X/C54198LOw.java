package X;

import com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.LOw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54198LOw implements LDY {
    public final /* synthetic */ FollowTabViewLifecycleObserver LJLIL;

    public C54198LOw(FollowTabViewLifecycleObserver followTabViewLifecycleObserver) {
        this.LJLIL = followTabViewLifecycleObserver;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        o.LJIIIZ(to, "to");
        InterfaceC54197LOv interfaceC54197LOv = this.LJLIL.LJZI;
        if (interfaceC54197LOv != null) {
            interfaceC54197LOv.LIZLLL(to);
        }
    }
}
