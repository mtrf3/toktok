package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Eus, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37946Eus {
    public final Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ C37946Eus(C37904EuC context) {
        o.LJIIJ(context, "context");
        this.LIZ = "bridge";
        this.LIZIZ = context;
    }

    public /* synthetic */ C37946Eus(Context context, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = context;
        this.LIZIZ = dataChannel;
    }
}
