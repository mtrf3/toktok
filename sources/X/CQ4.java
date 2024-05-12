package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CQ4 extends CSR<CQ1, CQ3> {
    @Override // X.CSR
    public final String LJIIIIZZ() {
        return "gift_collection";
    }

    @Override // X.CSR
    public final int LJI() {
        Boolean bool;
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCW.class)) == null || bool.booleanValue()) {
            return R.layout.d71;
        }
        return R.layout.d72;
    }

    @Override // X.CSR
    public final CQ3 LJIIJJI(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        return new CQ3(itemView);
    }
}
