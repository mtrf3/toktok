package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CAE extends AbstractC60811Ntn {
    public TopRightBannerWidget LJLILLLLZI;

    public CAE() {
        this(null);
    }

    public CAE(TopRightBannerWidget topRightBannerWidget) {
        this.LJLILLLLZI = topRightBannerWidget;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        BannerInRoomCollection.BannerInfo bannerInfo;
        o.LJIIIZ(view, "view");
        TopRightBannerWidget topRightBannerWidget = this.LJLILLLLZI;
        if (topRightBannerWidget != null) {
            View LIZJ = view.LIZJ();
            TopRightBannerWidget topRightBannerWidget2 = this.LJLILLLLZI;
            if (topRightBannerWidget2 != null) {
                bannerInfo = topRightBannerWidget2.LJLJLLL;
            } else {
                bannerInfo = null;
            }
            topRightBannerWidget.LL(LIZJ, bannerInfo);
        }
        TopRightBannerWidget topRightBannerWidget3 = this.LJLILLLLZI;
        if (topRightBannerWidget3 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = topRightBannerWidget3.LJLILLLLZI) != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getOptimization();
        } else {
            i = -1;
        }
        CA3.LJ(1, i, 8);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        CA3.LJ = SystemClock.elapsedRealtime();
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        TopRightBannerWidget topRightBannerWidget = this.LJLILLLLZI;
        if (topRightBannerWidget != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = topRightBannerWidget.LJLILLLLZI) != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getOptimization();
        } else {
            i = -1;
        }
        CA3.LIZLLL(1, str, i, 16);
    }
}
