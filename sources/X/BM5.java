package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BM5 {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public SparkContext LIZJ;

    public BM5(Context context, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = context;
        this.LIZIZ = dataChannel;
    }
}
