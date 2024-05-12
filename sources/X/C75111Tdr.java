package X;

import Y.ACListenerS33S0100000_13;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75111Tdr extends AbstractC76218Tvi<C75033Tcb> {
    public InterfaceC75136TeG LJLIL;
    public final DataChannel LJLILLLLZI;
    public final C47121t6 LJLJI;

    @Override // X.AbstractC76218Tvi
    public final void LJJJJIZL() {
        this.LJLIL = null;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object data) {
        int i2;
        o.LJIIIZ(data, "data");
        C47121t6 c47121t6 = this.LJLJI;
        if (C29232Bdc.LJIIL()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        c47121t6.setVisibility(i2);
        C16880lQ.LJJIIZ(this.LJLJI, new ACListenerS33S0100000_13(this, 162));
    }

    public C75111Tdr(View view, InterfaceC75136TeG interfaceC75136TeG, DataChannel dataChannel) {
        super(view);
        this.LJLIL = interfaceC75136TeG;
        this.LJLILLLLZI = dataChannel;
        View findViewById = view.findViewById(R.id.awu);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.btn_invite)");
        this.LJLJI = (C47121t6) findViewById;
    }
}
