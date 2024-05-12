package X;

import Y.IDfS292S0100000;
import android.os.Handler;
import com.bytedance.android.live.copyrightreview.CountDownApi;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.16x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C277116x {
    public final long LIZ;
    public final long LIZIZ;
    public final DataChannel LIZJ;
    public final long LIZLLL;
    public boolean LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;

    public final void LIZ() {
        if (DataChannelGlobal.LJLJJI.mv0(C29044Baa.class) != null) {
            if (o.LJ(this.LIZJ.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                C29162BcU.LIZIZ(0, null);
            } else {
                if (this.LJIIIIZZ.getValue() == null) {
                    return;
                }
                ((Runnable) this.LJIIIIZZ.getValue()).run();
            }
        }
    }

    public final void LIZIZ(long j) {
        ((Handler) this.LJFF.getValue()).postDelayed((Runnable) this.LJI.getValue(), j);
    }

    public final void LIZJ(int i) {
        this.LJ = true;
        ((CountDownApi) Q7L.LIZIZ(CountDownApi.class)).countDown(this.LIZ, this.LIZIZ, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1gg
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new IDfS292S0100000(this, 51));
    }

    public C277116x(long j, long j2, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = dataChannel;
        this.LIZLLL = 2000L;
        this.LJFF = C221108m2.LIZIZ(AnonymousClass298.INSTANCE);
        this.LJI = C221108m2.LIZIZ(new IDqS420S0100000(this, 191));
        this.LJII = C221108m2.LIZIZ(new IDqS420S0100000(this, 193));
        this.LJIIIIZZ = C221108m2.LIZIZ(new IDqS420S0100000(this, 192));
    }
}
