package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.1lL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42311lL extends C1O4 {
    @Override // X.C1O4
    public final boolean LIZ() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42311lL(Context context, ViewGroup container, DataChannel dataChannel, BaseLayeredElementManager layeredElementManager) {
        super(context, container, dataChannel, layeredElementManager);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(layeredElementManager, "layeredElementManager");
    }
}
