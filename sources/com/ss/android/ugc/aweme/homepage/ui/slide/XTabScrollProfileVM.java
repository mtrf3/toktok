package com.ss.android.ugc.aweme.homepage.ui.slide;

import X.ActivityC45651qj;
import X.C32I;
import X.C3SZ;
import X.C52323KgB;
import X.C54171LNv;
import X.C54838Lfe;
import X.C55230Lly;
import X.C62814Ol0;
import X.InterfaceC54080LKi;
import X.LPP;
import X.ORZ;
import android.view.MotionEvent;
import androidx.lifecycle.ViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class XTabScrollProfileVM extends ViewModel implements LPP {
    public static final /* synthetic */ int LJLJJL = 0;
    public final ActivityC45651qj LJLIL;
    public final HomePageDataViewModel LJLILLLLZI;
    public final List<String> LJLJI;
    public IXTabScrollProfileStrategy LJLJJI;

    @Override // X.LPP
    public final IXTabScrollProfileStrategy Uj() {
        List LJIJ = C62814Ol0.LJIJ(C55230Lly.LIZLLL(this.LJLIL, null), InterceptHomeViewPagerProtocol.class);
        if (LJIJ != null) {
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (it.hasNext()) {
                AbsTabScrollProfileStrategy i0 = ((InterceptHomeViewPagerProtocol) it.next()).i0();
                if (o.LJ(i0.LJLIL, "Following")) {
                    return i0;
                }
            }
        }
        return null;
    }

    public final IXTabScrollProfileStrategy gv0() {
        List LJIJ = C62814Ol0.LJIJ(C55230Lly.LIZLLL(this.LJLIL, null), InterceptHomeViewPagerProtocol.class);
        if (LJIJ != null) {
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (it.hasNext()) {
                InterceptHomeViewPagerProtocol interceptHomeViewPagerProtocol = (InterceptHomeViewPagerProtocol) it.next();
                if (interceptHomeViewPagerProtocol.enable()) {
                    return interceptHomeViewPagerProtocol.i0();
                }
            }
        }
        return null;
    }

    public XTabScrollProfileVM(ActivityC45651qj context) {
        Hox.LJLLI.LIZ(context);
        HomeTabViewModel homeTabViewModel = HomeTabViewModel.LJLJLLL.LIZ(context);
        HomePageDataViewModel homeDataViewModel = C3SZ.LIZ(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(homeTabViewModel, "homeTabViewModel");
        o.LJIIIZ(homeDataViewModel, "homeDataViewModel");
        this.LJLIL = context;
        this.LJLILLLLZI = homeDataViewModel;
        List LLJI = ORZ.LLJI(homeTabViewModel.pU());
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJI, 10));
        Iterator it = LLJI.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC54080LKi) it.next()).tag());
        }
        this.LJLJI = ORZ.LLJILJILJ(arrayList);
        C54171LNv.LIZ(this.LJLIL);
    }

    @Override // X.LPP
    public final boolean cU(MotionEvent event, float f, float f2) {
        IXTabScrollProfileStrategy gv0;
        o.LJIIIZ(event, "event");
        if (((Boolean) C52323KgB.LIZ.getValue()).booleanValue()) {
            if (event.getAction() == 0) {
                this.LJLJJI = gv0();
            }
            gv0 = this.LJLJJI;
            if (gv0 == null) {
                return false;
            }
        } else {
            gv0 = gv0();
            if (gv0 == null) {
                return false;
            }
        }
        Aweme aweme = this.LJLILLLLZI.LJLJLLL;
        if (aweme != null && !C54838Lfe.LJJI(aweme)) {
            aweme.isPhotoMode();
        }
        return gv0.LJJLJ(f, f2);
    }
}
