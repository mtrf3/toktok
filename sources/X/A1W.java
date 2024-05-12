package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.ss.android.ugc.aweme.paidcontent.manageseries.fragment.SeriesCreationIntroFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class A1W<T> implements InterfaceC04760Gq {
    public final /* synthetic */ C04740Go LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ List<A1R> LIZJ;
    public final /* synthetic */ SeriesCreationIntroFragment LIZLLL;

    public A1W(C04740Go c04740Go, Context context, List<A1R> list, SeriesCreationIntroFragment seriesCreationIntroFragment) {
        this.LIZ = c04740Go;
        this.LIZIZ = context;
        this.LIZJ = list;
        this.LIZLLL = seriesCreationIntroFragment;
    }

    @Override // X.InterfaceC04760Gq
    public final void onResult(Object obj) {
        FragmentManager supportFragmentManager;
        this.LIZ.LJIJI((C0GY) obj);
        C26224AQy c26224AQy = new C26224AQy();
        c26224AQy.LIZJ = new AqS135S0200000_4(this.LIZLLL, this.LIZ, 268);
        c26224AQy.LIZLLL = 0;
        c26224AQy.LJ = C29822Bn8.LIZ(this.LIZIZ, R.string.qjk, "context.resources.getStr…_pushNotifLanding_header)");
        A1Z[] a1zArr = {new A1Z(0, ((A1R) ListProtector.get(this.LIZJ, 0)).LIZ, ((A1R) ListProtector.get(this.LIZJ, 0)).LIZ()), new A1Z(0, ((A1R) ListProtector.get(this.LIZJ, 1)).LIZ, ((A1R) ListProtector.get(this.LIZJ, 1)).LIZ()), new A1Z(0, ((A1R) ListProtector.get(this.LIZJ, 2)).LIZ, ((A1R) ListProtector.get(this.LIZJ, 2)).LIZ())};
        ((ArrayList) c26224AQy.LJI).clear();
        ((ArrayList) c26224AQy.LJI).addAll(ORY.LJJZZIII(a1zArr));
        c26224AQy.LJIILIIL = false;
        String string = this.LIZIZ.getResources().getString(R.string.qjj);
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this.LIZLLL, 1375);
        c26224AQy.LJII = string;
        c26224AQy.LJIIIZ = aqS170S0100000_4;
        c26224AQy.LJIILJJIL = false;
        TuxIntroFragment tuxIntroFragment = new TuxIntroFragment();
        tuxIntroFragment.LJLIL = c26224AQy;
        ActivityC45651qj mo49getActivity = this.LIZLLL.mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJ(tuxIntroFragment, null, R.id.joz);
            c1b3.LJI();
        }
        C73305Spp c73305Spp = this.LIZLLL.LJLJI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        View view = this.LIZLLL.LJLJJI;
        if (view != null) {
            view.setVisibility(0);
        }
        this.LIZ.LJLJI.setRepeatMode(1);
        this.LIZ.LJLJI.setRepeatCount(-1);
        this.LIZ.LJIILLIIL();
        String str = (String) this.LIZLLL.LJLIL.getValue();
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        FMX.LJIIL("show_series_mobile_upload_intro", LIZLLL.LIZ);
    }
}
