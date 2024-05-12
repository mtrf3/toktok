package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BHA {
    public static DataChannel LIZ(ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(viewModelProvider, "viewModelProvider");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        DataChannel dataChannel = (DataChannel) viewModelProvider.get(DataChannel.class);
        dataChannel.LJLJJI = lifecycleOwner;
        return dataChannel;
    }
}
