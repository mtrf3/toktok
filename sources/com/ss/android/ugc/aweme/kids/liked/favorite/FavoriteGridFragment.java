package com.ss.android.ugc.aweme.kids.liked.favorite;

import X.C2068389v;
import X.C26045AKb;
import X.C2NU;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.G3Y;
import X.ORZ;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FavoriteGridFragment extends KidsAwemeGridFragment {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final void Al() {
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final boolean Il() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final String wl() {
        return "like";
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final void Dl() {
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_heart;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            String string = getString(R.string.hna);
            o.LJIIIIZZ(string, "getString(R.string.kids_mode_tab_3_title)");
            c73306Spq.LJFF = string;
            String string2 = getString(R.string.hn_);
            o.LJIIIIZZ(string2, "getString(R.string.kids_mode_tab_3_description)");
            c73306Spq.LJI = string2;
            c73305Spp.setStatus(c73306Spq);
        }
        C73305Spp c73305Spp2 = this.LJLJJLL;
        if (c73305Spp2 == null) {
            return;
        }
        c73305Spp2.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final void Gl() {
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIJJI(c73306Spq, new G3Y(this));
            c73305Spp.setStatus(c73306Spq);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        MutableLiveData<List<Aweme>> mutableLiveData;
        List<Aweme> value;
        KidsAwemeGridViewModel kidsAwemeGridViewModel;
        MutableLiveData<List<Aweme>> mutableLiveData2;
        super.onResume();
        KidsAwemeGridViewModel kidsAwemeGridViewModel2 = this.LJLJJI;
        boolean z = false;
        if (kidsAwemeGridViewModel2 != null && (mutableLiveData = kidsAwemeGridViewModel2.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
            List<Aweme> LLJILJILJ = ORZ.LLJILJILJ(value);
            ArrayList arrayList = (ArrayList) LLJILJILJ;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    if (!((Aweme) it.next()).isLike()) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (z2 && (kidsAwemeGridViewModel = this.LJLJJI) != null && (mutableLiveData2 = kidsAwemeGridViewModel.LJLILLLLZI) != null) {
                    mutableLiveData2.postValue(LLJILJILJ);
                }
            }
        }
        getContext();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (!z) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final View vl() {
        Context context = getContext();
        if (context != null) {
            return new View(context);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L11;
     */
    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xl(android.view.View r5, com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r4 = this;
            boolean r0 = X.C6ZT.LIZ(r5)
            if (r0 == 0) goto L7
            return
        L7:
            if (r6 == 0) goto L29
            X.1qj r0 = r4.mo49getActivity()
            if (r0 == 0) goto L29
            r4.getContext()
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L1a
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L1a
            if (r0 != 0) goto L29
        L1a:
            X.AKb r1 = new X.AKb
            r1.<init>(r4)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r1.LJIIIIZZ(r0)
            r1.LJIIJ()
            return
        L29:
            com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel r0 = r4.LJLJJI
            r3 = 0
            if (r0 == 0) goto L38
            androidx.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>> r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L38
            java.lang.Object r1 = r0.getValue()
            if (r1 != 0) goto L3a
        L38:
            X.OQg r1 = X.C61878OQg.INSTANCE
        L3a:
            java.lang.String r0 = "awemes"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            X.C40916G4a.LIZ = r0
            X.1qj r1 = r4.mo49getActivity()
            java.lang.String r0 = "//kids/like/feed"
            com.bytedance.router.SmartRoute r2 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            if (r6 == 0) goto L56
            java.lang.String r3 = r6.getAid()
        L56:
            java.lang.String r0 = "current_id"
            r2.withParam(r0, r3)
            if (r5 == 0) goto L70
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            X.06f r0 = X.C020506f.LIZ(r5, r1, r0)
            android.os.Bundle r0 = r0.LIZLLL()
            r2.withBundleAnimation(r0)
        L70:
            r2.open()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.liked.favorite.FavoriteGridFragment.xl(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
