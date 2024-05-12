package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BdI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29212BdI {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public int LJ;
    public int LJFF;

    public C29212BdI(Context context, DataChannel dataChannel, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, int i) {
        int i2;
        if ((i & 32) != 0) {
            i2 = 100;
        } else {
            i2 = 0;
        }
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = interfaceC65784Pro;
        this.LJ = 0;
        this.LJFF = i2;
    }
}
