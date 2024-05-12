package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BpS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29966BpS extends CSR<InterfaceC29964BpQ, C29965BpR> {
    @Override // X.CSR
    public final String LJIIIIZZ() {
        return "capsule";
    }

    @Override // X.CSR
    public final int LJI() {
        Boolean bool;
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCW.class)) == null || bool.booleanValue()) {
            return R.layout.d6u;
        }
        return R.layout.d72;
    }

    @Override // X.CSR
    public final C29965BpR LJIIJJI(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        return new C29965BpR(itemView);
    }
}
