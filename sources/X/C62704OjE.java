package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkRequestSync;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkRequestV2;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkSyncBlockList;

/* renamed from: X.OjE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62704OjE<T> implements InterfaceC73692Sw4<T> {
    public final String LIZ;

    public C62704OjE(String str) {
        this.LIZ = str;
    }

    public static boolean LIZLLL(String str) {
        if (LiveNetworkRequestV2.INSTANCE.getValue() && LiveNetworkRequestSync.INSTANCE.enable() && LiveNetworkSyncBlockList.INSTANCE.enable(str)) {
            return true;
        }
        return false;
    }

    @Override // X.C3EO
    public final InterfaceC115714gR<T> LIZ(AbstractC73672Svk<T> abstractC73672Svk) {
        if (LIZLLL(this.LIZ)) {
            return abstractC73672Svk.LJJL(T16.LIZ());
        }
        return abstractC73672Svk;
    }

    @Override // X.InterfaceC73821Sy9
    public final InterfaceC73650SvO<T> LIZIZ(AbstractC73745Swv<T> abstractC73745Swv) {
        if (LIZLLL(this.LIZ)) {
            return abstractC73745Swv.LJIILJJIL(T16.LIZ());
        }
        return abstractC73745Swv;
    }

    @Override // X.InterfaceC73822SyA
    public final InterfaceC73471SsV<T> LIZJ(AbstractC73638SvC<T> abstractC73638SvC) {
        if (LIZLLL(this.LIZ)) {
            return abstractC73638SvC.LJJIIJ(T16.LIZ());
        }
        return abstractC73638SvC;
    }
}
