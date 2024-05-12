package Y;

import X.AbstractC36786EcA;
import X.C73433Srt;
import X.C73969T1h;
import X.E9N;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.OXY;
import X.T16;
import android.app.Activity;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.share.improve.pkg.NowPostIncentiveSharePackage;
import com.ss.android.ugc.aweme.tools.music.music.recent.apis.RecentMusicListRequest;
import com.ss.android.ugc.aweme.tools.music.music.recent.apis.RecentMusicNetworkAPI;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDuS77S0200000_6 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
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

    public static final void subscribe$0(IDuS77S0200000_6 iDuS77S0200000_6, InterfaceC73573Su9 interfaceC73573Su9) {
        AbstractC36786EcA abstractC36786EcA = (AbstractC36786EcA) iDuS77S0200000_6.l0;
        IESSettingsProxy iESSettingsProxy = (IESSettingsProxy) iDuS77S0200000_6.l1;
        abstractC36786EcA.LIZIZ(iESSettingsProxy);
        interfaceC73573Su9.onNext(iESSettingsProxy);
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$1(IDuS77S0200000_6 iDuS77S0200000_6, InterfaceC73573Su9 interfaceC73573Su9) {
        interfaceC73573Su9.onNext(new NowPostIncentiveSharePackage((Activity) iDuS77S0200000_6.l1, (OXY) iDuS77S0200000_6.l0));
    }

    public static final void subscribe$2(IDuS77S0200000_6 iDuS77S0200000_6, InterfaceC73573Su9 interfaceC73573Su9) {
        RecentMusicNetworkAPI recentMusicNetworkAPI = E9N.LJLJJL;
        List musicIds = (List) iDuS77S0200000_6.l0;
        o.LJIIIZ(musicIds, "musicIds");
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        recentMusicNetworkAPI.getMusicDetailByIdList(new RecentMusicListRequest((String[]) musicIds.toArray(new String[0]))).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0200000_6((List) iDuS77S0200000_6.l1, c73433Srt, 10), new AfS58S0100000_6(c73433Srt, 45));
    }

    public IDuS77S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
