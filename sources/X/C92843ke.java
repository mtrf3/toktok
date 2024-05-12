package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.3ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92843ke {
    public static ChatViewModel LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return (ChatViewModel) ViewModelProviders.of(fragment).get(ChatViewModel.class);
    }
}
