package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.inbox.vm.InboxActivityNoticeVM;
import kotlin.jvm.internal.o;

/* renamed from: X.MMs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56690MMs {
    public static InboxActivityNoticeVM LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return (InboxActivityNoticeVM) ViewModelProviders.of(fragment).get(InboxActivityNoticeVM.class);
    }
}
