package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BZc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28984BZc extends BZU {
    public final LifecycleOwner LJLIL;
    public DataChannel LJLILLLLZI;
    public View LJLJI;
    public final long LJLJJI;
    public final C30470Bxa LJLJJL;

    public C28984BZc(LifecycleOwner lifecycleOwner) {
        long j;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LJLJJI = j;
        this.LJLJJL = new C30470Bxa(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        BCD.LIZ(this.LJLILLLLZI, C28982BZa.LJLIL, new AqS136S0200000_5(this, view, 43), C28983BZb.LJLIL, C15380j0.LJIILJJIL(R.string.m9k), Boolean.FALSE);
    }

    @Override // X.BZU, X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        super.i(interfaceC30237Btp, dataChannel);
        this.LJLILLLLZI = dataChannel;
        View LIZ = interfaceC30237Btp.LIZ(R.id.ldl);
        this.LJLJI = LIZ;
        C30444BxA.LIZIZ(EnumC30410Bwc.LIVE_BROADCAST_ENHANCE_BACKGROUND, this.LJLIL, LIZ, new AqS171S0100000_5(dataChannel, 733));
    }
}
