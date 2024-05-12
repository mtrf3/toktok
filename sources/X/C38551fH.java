package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1fH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38551fH implements InterfaceC24100x4 {
    public long LIZ;
    public long LIZIZ;

    @Override // X.InterfaceC24100x4
    public final void LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = 0L;
        this.LIZIZ = 0L;
    }

    @Override // X.InterfaceC24100x4
    public final void y3(Fragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        if (dataChannel != null) {
            dataChannel.lv0(fragment, BattleTimeLeftChannel.class, new IDqS416S0100000(this, 363));
        }
    }
}
