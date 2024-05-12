package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.CmB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32311CmB implements Runnable {
    public static final RunnableC32311CmB LJLIL = new RunnableC32311CmB();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        int i;
        long j;
        try {
            if (C32257ClJ.LJI()) {
                i = 14;
            } else {
                i = 2;
            }
            C32366Cn4 c32366Cn4 = C32366Cn4.LIZ;
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            C32368Cn6.LIZ = c32366Cn4.LJIIIZ(i, Long.valueOf(j), true, null, new C32310CmA(i));
        } finally {
            if (LIZ) {
            }
        }
    }
}
