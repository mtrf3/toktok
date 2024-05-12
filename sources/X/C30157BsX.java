package X;

import Y.AfS57S0100000_5;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BsX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30157BsX {
    public final BaseFragment LIZ;
    public final DataChannel LIZIZ;

    public final void onEvent(B4Q b4q) {
        if (!this.LIZ.isViewValid()) {
            return;
        }
        if (b4q.LIZIZ) {
            this.LIZIZ.rv0(KeyboardStatusChannel.class, Boolean.TRUE);
        } else {
            this.LIZIZ.rv0(KeyboardStatusChannel.class, Boolean.FALSE);
        }
    }

    public C30157BsX(BaseFragment mFragment, DataChannel mDataChannel) {
        o.LJIIIZ(mFragment, "mFragment");
        o.LJIIIZ(mDataChannel, "mDataChannel");
        this.LIZ = mFragment;
        this.LIZIZ = mDataChannel;
        C73943T0h LIZ = C73943T0h.LIZ();
        LIZ.getClass();
        LIZ.LIZLLL(mFragment, B4Q.class, new C19U()).LIZIZ(new AfS57S0100000_5(this, 296));
    }
}
