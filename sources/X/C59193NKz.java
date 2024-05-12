package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.NKz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59193NKz {
    public final FrameLayout LIZ;
    public Aweme LIZIZ;
    public AdProductTile LIZJ;
    public boolean LIZLLL;
    public int LJ = -1;
    public AbstractC59184NKq LJFF;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJI;
    public final C59189NKv LJII;
    public final NL0 LJIIIIZZ;

    public final void LIZIZ() {
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LJFF = null;
        this.LIZLLL = false;
        this.LJ = -1;
        this.LIZ.setVisibility(8);
        this.LJIIIIZZ.LJLIL = false;
        this.LIZ.removeAllViews();
    }

    public C59193NKz(FrameLayout frameLayout) {
        String str;
        this.LIZ = frameLayout;
        Context context = frameLayout.getContext();
        o.LJIIIIZZ(context, "container.context");
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            str = LJJI.LJIIL("lynx_feed");
        } else {
            str = null;
        }
        this.LJII = new C59189NKv(context, str);
        this.LJIIIIZZ = new NL0();
    }

    public final void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        ViewParent viewParent;
        ViewGroup viewGroup = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            InterfaceC60761Nsz kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
            if (kitView != null) {
                kitView.LJIIIZ("event_card_show", null);
            }
            viewParent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewParent;
        }
        if (viewGroup == this.LIZ) {
            return;
        }
        if (viewGroup != null) {
            C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, viewGroup);
        }
        this.LIZ.removeAllViews();
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        this.LIZ.addView(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(F9N event) {
        int i;
        o.LJIIIZ(event, "event");
        int i2 = event.LJLILLLLZI;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode();
        } else {
            i = 0;
        }
        if (i2 != i) {
            return;
        }
        int i3 = event.LJLIL;
        this.LJ = i3;
        if (i3 == 1) {
            this.LIZLLL = true;
        }
    }
}
