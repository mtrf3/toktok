package X;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ScrollView;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.NYu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59552NYu extends NM4 {
    public final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget LJLIL;

    public C59552NYu(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
        this.LJLIL = adNewFakeUserProfileDetailFragmentWidget;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        OGF helper;
        OGF helper2;
        o.LJIIIZ(view, "view");
        if (!this.LJLIL.LLD) {
            View LIZJ = view.LIZJ();
            if (LIZJ instanceof WebView) {
                C80648Vky LJIJ = this.LJLIL.LJIJ();
                if (LJIJ != null && (helper2 = LJIJ.getHelper()) != null) {
                    helper2.LIZ = LIZJ;
                }
                this.LJLIL.LJLLLL = (WebView) LIZJ;
                return;
            }
            if (!(LIZJ instanceof VNS)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) LIZJ;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (viewGroup.getChildAt(i) instanceof ScrollView) {
                    AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget = this.LJLIL;
                    View childAt = viewGroup.getChildAt(i);
                    o.LJII(childAt, "null cannot be cast to non-null type android.widget.ScrollView");
                    adNewFakeUserProfileDetailFragmentWidget.LJLLL = (ScrollView) childAt;
                    C80648Vky LJIJ2 = this.LJLIL.LJIJ();
                    if (LJIJ2 == null || (helper = LJIJ2.getHelper()) == null) {
                        return;
                    }
                    helper.LIZ = this.LJLIL.LJLLL;
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLIL.LLD = false;
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        this.LJLIL.LLD = true;
    }
}
