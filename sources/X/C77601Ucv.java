package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77601Ucv implements InterfaceC32356Cmu {
    public final /* synthetic */ Diamond LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ long LIZLLL;

    @Override // X.InterfaceC32356Cmu
    public final void LIZ(long j) {
        HashMap hashMap = new HashMap();
        long j2 = this.LIZ.count * this.LIZIZ;
        long j3 = this.LIZJ;
        boolean z = true;
        if (j2 + j3 == j) {
            C78609UtB.LJJJJZI("ttlive_update_wallet_info_order", hashMap);
            C77624UdI.LJII(true, SystemClock.uptimeMillis() - this.LIZLLL, Boolean.TRUE, null);
            return;
        }
        hashMap.put("originCoins", Long.valueOf(j3));
        hashMap.put("preCoins", Integer.valueOf(this.LIZ.count));
        hashMap.put("error_msg", "UPDATE_WALLET_INFO_NOT_MATCH_CODE");
        C78609UtB.LJJJLL(62, -1, "ttlive_update_wallet_info_order", "update wallet info fail", hashMap);
        long uptimeMillis = SystemClock.uptimeMillis() - this.LIZLLL;
        if (this.LIZJ == j) {
            z = false;
        }
        C77624UdI.LJII(false, uptimeMillis, Boolean.valueOf(z), null);
    }

    @Override // X.InterfaceC32356Cmu
    public final void LIZIZ(Throwable e) {
        int i;
        o.LJIIIZ(e, "e");
        if (e instanceof C276516r) {
            i = ((C276516r) e).getErrorCode();
        } else {
            i = 61;
        }
        C78609UtB.LJJJLIIL(i, -1, "ttlive_update_wallet_info_order", "update wallet info fail");
        C77624UdI.LJII(false, SystemClock.uptimeMillis() - this.LIZLLL, null, e.toString());
    }

    public C77601Ucv(int i, long j, long j2, Diamond diamond) {
        this.LIZ = diamond;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
