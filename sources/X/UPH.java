package X;

import Y.AfS62S0200000_13;
import com.ss.android.ugc.aweme.friends.api.FriendApi;

/* loaded from: classes14.dex */
public final class UPH<T> implements InterfaceC86003Zc {
    public final /* synthetic */ UPG LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public UPH(UPG upg, boolean z) {
        this.LJLIL = upg;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C77150UPq> interfaceC73573Su9) {
        String str;
        UPG upg = this.LJLIL;
        FriendApi.LIZ.getClass();
        FriendApi LIZ = C57126MbS.LIZ();
        Long l = null;
        if (this.LJLILLLLZI) {
            str = C77134UPa.LIZ.LJI(this.LJLIL.LJFF());
        } else {
            str = null;
        }
        if (this.LJLILLLLZI) {
            l = Long.valueOf(C77134UPa.LIZ.LJIIJ(this.LJLIL.LJFF()));
        }
        C73454SsE LJJJ = LIZ.socialFriends("facebook", str, null, l, true).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        UPG upg2 = this.LJLIL;
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        upg.LJLLJ = (C73411SrX) LJJJ.LJJJLIIL(new AfS62S0200000_13(upg2, c73433Srt, 57), new AfS62S0200000_13(upg2, c73433Srt, 58));
    }
}
