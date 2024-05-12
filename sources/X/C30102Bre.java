package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.toolbar.TBViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bre, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30102Bre {
    public static final /* synthetic */ int LIZ = 0;

    public static TBViewModel LIZ(EnumC30241Btt button, Fragment fragment) {
        o.LJIIIZ(button, "button");
        o.LJIIIZ(fragment, "fragment");
        return (TBViewModel) ViewModelProviders.of(fragment).get(button.name(), TBViewModel.class);
    }
}
