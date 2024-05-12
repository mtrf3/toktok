package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.model.SearchLandingPageButtonInfo;

/* renamed from: X.Nwb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60985Nwb implements InterfaceC59238NMs {
    public final /* synthetic */ InterfaceC60761Nsz LIZ;
    public final /* synthetic */ C60984Nwa LIZIZ;

    public C60985Nwb(InterfaceC60761Nsz interfaceC60761Nsz, C60984Nwa c60984Nwa) {
        this.LIZ = interfaceC60761Nsz;
        this.LIZIZ = c60984Nwa;
    }

    @Override // X.InterfaceC59238NMs
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        String str;
        ViewGroup viewGroup;
        if (C60986Nwc.LIZIZ < 2 && !C60986Nwc.LIZ && !C60986Nwc.LIZLLL && i2 >= ((View) this.LIZ).getHeight()) {
            try {
                if (!this.LIZIZ.LJLJJLL) {
                    ViewParent parent = ((View) this.LIZ).getParent();
                    if (parent != null && (parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (viewGroup = (ViewGroup) parent) != null) {
                        viewGroup.addView(this.LIZIZ.LJLJJL);
                    }
                    SearchLandingPageButtonInfo searchLandingPageButtonInfo = C60986Nwc.LJI;
                    if (searchLandingPageButtonInfo == null || (str = searchLandingPageButtonInfo.getButtonName()) == null) {
                        str = "";
                    }
                    C60977NwT.LJFF(str);
                    this.LIZIZ.LJLJJLL = true;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
