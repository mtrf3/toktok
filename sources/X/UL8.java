package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UL8 extends C1O4 {
    public final int LJIILL;
    public final int LJIILLIIL;
    public final List<InterfaceC88472Yns<Boolean, C76800UCe>> LJIIZILJ;
    public final List<InterfaceC88472Yns<Boolean, C76800UCe>> LJIJ;

    @Override // X.C1O4
    public final boolean LIZ() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UL8(Context context, ViewGroup container, DataChannel dataChannel, BaseLayeredElementManager layeredElementManager) {
        super(context, container, dataChannel, layeredElementManager);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(layeredElementManager, "layeredElementManager");
        this.LJIILL = context.getResources().getDimensionPixelSize(R.dimen.adf);
        this.LJIILLIIL = this.LJI + this.LIZLLL;
        this.LJIIZILJ = new ArrayList();
        this.LJIJ = new ArrayList();
    }
}
