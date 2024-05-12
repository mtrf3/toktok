package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BIK {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final LifecycleOwner LIZJ;

    public BIK(Context context, Fragment lifecycleOwner, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = lifecycleOwner;
    }
}
