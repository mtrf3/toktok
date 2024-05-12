package X;

import com.bytedance.android.livesdk.broadcast.obs.ObsBroadcastFragment;

/* renamed from: X.BtD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30199BtD implements InterfaceC10990bv {
    public final /* synthetic */ ObsBroadcastFragment LJLIL;

    public C30199BtD(ObsBroadcastFragment obsBroadcastFragment) {
        this.LJLIL = obsBroadcastFragment;
    }

    @Override // X.InterfaceC10990bv
    public final void p8(int i) {
        if (i != 30001 && i != 30003 && i != 50002 && i != 30003001) {
            return;
        }
        ObsBroadcastFragment obsBroadcastFragment = this.LJLIL;
        obsBroadcastFragment.Sl();
        obsBroadcastFragment.Tl(1, i);
    }
}
