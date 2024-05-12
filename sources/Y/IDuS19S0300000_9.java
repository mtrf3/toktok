package Y;

import X.C04650Gf;
import X.C0GU;
import X.C0GY;
import X.C29701Eo;
import X.C53684L5c;
import X.C53685L5d;
import X.C53686L5e;
import X.C53687L5f;
import X.C73433Srt;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.LWX;
import X.PO6;
import X.UZP;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes10.dex */
public class IDuS19S0300000_9 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<FriendsFeedResponse> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS19S0300000_9 iDuS19S0300000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        FriendsFeedResponse friendsFeedResponse = ((LWX) iDuS19S0300000_9.l0).LJLJI;
        if (friendsFeedResponse != null) {
            ((Handler) iDuS19S0300000_9.l2).postDelayed(new ARunnableS20S0300000_9((List) iDuS19S0300000_9.l1, (C73433Srt) interfaceC73573Su9, FriendsFeedResponse.LJI(friendsFeedResponse, (List) iDuS19S0300000_9.l1, 251), 4), 400L);
        }
    }

    public static final void subscribe$1(IDuS19S0300000_9 iDuS19S0300000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        C29701Eo c29701Eo = ((UZP) iDuS19S0300000_9.l0).LJLLLL;
        PO6 po6 = (PO6) iDuS19S0300000_9.l1;
        InputStream inputStream = (InputStream) iDuS19S0300000_9.l2;
        c29701Eo.setRepeatCount(-1);
        c29701Eo.setRepeatMode(1);
        c29701Eo.setImageAssetDelegate(po6);
        C0GU<C0GY> LJI = C04650Gf.LJI(inputStream, "bigLottie");
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        LJI.LIZIZ(new C53684L5c(c29701Eo, c73433Srt));
        LJI.LIZ(new C53685L5d(c73433Srt));
    }

    public static final void subscribe$2(IDuS19S0300000_9 iDuS19S0300000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        C29701Eo c29701Eo = ((UZP) iDuS19S0300000_9.l0).LJLLLLLL;
        PO6 po6 = (PO6) iDuS19S0300000_9.l1;
        InputStream inputStream = (InputStream) iDuS19S0300000_9.l2;
        c29701Eo.setRepeatCount(-1);
        c29701Eo.setRepeatMode(1);
        c29701Eo.setImageAssetDelegate(po6);
        C0GU<C0GY> LJI = C04650Gf.LJI(inputStream, "smallLottie");
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        LJI.LIZIZ(new C53686L5e(c29701Eo, c73433Srt));
        LJI.LIZ(new C53687L5f(c73433Srt));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDuS19S0300000_9(Object obj, LWX lwx, List<FriendsFeed> list, Handler handler) {
        this.$t = handler;
        this.l0 = obj;
        this.l1 = lwx;
        this.l2 = list;
    }
}
