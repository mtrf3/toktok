package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Tdt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC75113Tdt implements View.OnClickListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C75095Tdb LJLJI;
    public final /* synthetic */ LinkPlayerInfo LJLJJI;

    public ViewOnClickListenerC75113Tdt(boolean z, boolean z2, C75095Tdb c75095Tdb, LinkPlayerInfo linkPlayerInfo) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = c75095Tdb;
        this.LJLJJI = linkPlayerInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Boolean bool;
        if (!this.LJLIL && !this.LJLILLLLZI) {
            DataChannel dataChannel = this.LJLJI.LJLIL;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.kv0(MuteMicChannel.class);
            } else {
                bool = null;
            }
            boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
            DataChannel dataChannel2 = this.LJLJI.LJLIL;
            if (dataChannel2 != null) {
                dataChannel2.rv0(MuteMicChannel.class, Boolean.valueOf(!LJJIFFI));
            }
            this.LJLJI.i0(this.LJLJJI);
        }
    }
}
