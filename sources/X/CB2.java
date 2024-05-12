package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CB2 extends CSR<CBD, CBC> {
    @Override // X.CSR
    public final String LJIIIIZZ() {
        return "subscription_guide";
    }

    @Override // X.CSR
    public final int LJI() {
        Boolean bool;
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCW.class)) == null || bool.booleanValue()) {
            return R.layout.d9r;
        }
        return R.layout.d9s;
    }

    @Override // X.CSR
    public final CBC LJIIJJI(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        return new CBC(itemView);
    }
}
