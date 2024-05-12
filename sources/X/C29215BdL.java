package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BdL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29215BdL {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public int LJ;
    public int LJFF;

    public C29215BdL(Context context, DataChannel dataChannel, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, int i, int i2) {
        i = (i2 & 16) != 0 ? 0 : i;
        int i3 = (i2 & 32) != 0 ? 100 : 0;
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = interfaceC65784Pro;
        this.LJ = i;
        this.LJFF = i3;
    }
}
