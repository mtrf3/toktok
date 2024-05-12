package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.dialogoeventbserver.LiveDialogStatusEventObserverManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.0KY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0KY {
    public static LiveDialogStatusEventObserverManager LIZ(final Fragment fragment, final DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(fragment, "fragment");
        if (fragment.mo49getActivity() != null) {
            return (LiveDialogStatusEventObserverManager) ViewModelProviders.of(fragment, new ViewModelProvider.Factory() { // from class: X.1Gq
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
                    return C09L.LIZIZ(this, cls, c0vk);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> modelClass) {
                    o.LJIIIZ(modelClass, "modelClass");
                    return new LiveDialogStatusEventObserverManager(fragment, dataChannel);
                }
            }).get(LiveDialogStatusEventObserverManager.class);
        }
        return null;
    }
}
