package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULA extends C1O4 {
    public final int LJIILL;

    @Override // X.C1O4
    public final boolean LIZ() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ULA(Context context, ViewGroup container, DataChannel dataChannel, BaseLayeredElementManager layeredElementManager) {
        super(context, container, dataChannel, layeredElementManager);
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(layeredElementManager, "layeredElementManager");
        ViewGroup.LayoutParams layoutParams = container.findViewById(R.id.apg).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i2 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = container.findViewById(R.id.aq0).getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams2.bottomMargin;
        }
        this.LJIILL = i + i2;
    }
}
