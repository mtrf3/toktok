package X;

import Y.IDFactoryS408S0100000_1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.3Rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84113Rv {
    public static FakeMessageViewModel LIZ(Fragment fragment, C99033ud sessionInfo) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        if (!C90673h9.LIZ()) {
            return null;
        }
        return (FakeMessageViewModel) ViewModelProviders.of(fragment, new IDFactoryS408S0100000_1(sessionInfo, 4)).get(FakeMessageViewModel.class);
    }
}
