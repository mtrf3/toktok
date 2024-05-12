package X;

import Y.AObjectS89S0100000_14;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.LiveEvent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Vxb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81431Vxb extends WMH implements InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final C29901Fi<WS0> LJLILLLLZI;
    public final C40871j1<Integer> LJLJI;
    public final C0IB<Boolean> LJLJJI;
    public final C0IB<C76800UCe> LJLJJL;
    public final LiveEvent<C35511Dwh> LJLJJLL;
    public final String LJLJL;
    public final C46611sH<Integer> LJLJLJ;
    public ViewOnTouchListenerC81419VxP LJLJLLL;
    public C119344mI LJLL;
    public View LJLLI;
    public final int LJLLILLLL;
    public final java.util.Set<String> LJLLJ;
    public final C81435Vxf LJLLL;
    public final java.util.Map<Integer, View> LJLLLL;
    public final int LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public int LJZI;

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LLJILJIL(int i, String str, String str2) {
        C119344mI c119344mI = this.LJLL;
        if (c119344mI != null) {
            C81366VwY c81366VwY = new C81366VwY(c119344mI.getContext(), 0);
            c81366VwY.LJJLL(6, 6);
            c81366VwY.setText(str);
            c81366VwY.setTag(str2);
            c81366VwY.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            C119344mI c119344mI2 = this.LJLL;
            if (c119344mI2 != null) {
                c119344mI2.addView(c81366VwY, i);
                this.LJLLJ.add(str2);
                return;
            } else {
                o.LJIJI("tabContainer");
                throw null;
            }
        }
        o.LJIJI("tabContainer");
        throw null;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.bmy, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = viewGroup2.findViewById(R.id.ka_);
        o.LJIIIIZZ(findViewById, "viewGroup.findViewById(R.id.split_top_tab_host)");
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = (ViewOnTouchListenerC81419VxP) findViewById;
        this.LJLJLLL = viewOnTouchListenerC81419VxP;
        View findViewById2 = viewOnTouchListenerC81419VxP.findViewById(R.id.bs8);
        o.LJIIIIZZ(findViewById2, "tabHost.findViewById(R.id.container)");
        this.LJLL = (C119344mI) findViewById2;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJLJLLL;
        if (viewOnTouchListenerC81419VxP2 != null) {
            View findViewById3 = viewOnTouchListenerC81419VxP2.findViewById(R.id.ka8);
            o.LJIIIIZZ(findViewById3, "tabHost.findViewById(R.id.split_tab_selected_bg)");
            this.LJLLI = findViewById3;
            int i2 = this.LJLLLLLL;
            if (i2 >= 0) {
                String string = C60903NvH.LJ.getString(R.string.s7s);
                o.LJIIIIZZ(string, "getApplication().getString(R.string.three_min)");
                LLJILJIL(i2, string, C44269HYz.LIZJ);
            }
            int i3 = this.LJLZ;
            String string2 = C60903NvH.LJ.getString(R.string.pvl);
            o.LJIIIIZZ(string2, "getApplication().getStri…g.record_60_seconds_mode)");
            String str = C44269HYz.LIZIZ;
            LLJILJIL(i3, string2, str);
            int i4 = this.LJZ;
            String string3 = C60903NvH.LJ.getString(R.string.pvk);
            o.LJIIIIZZ(string3, "getApplication().getStri…g.record_15_seconds_mode)");
            LLJILJIL(i4, string3, C44269HYz.LIZ);
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP3 = this.LJLJLLL;
            if (viewOnTouchListenerC81419VxP3 != null) {
                viewOnTouchListenerC81419VxP3.setOnIndexChangedListener(new C81415VxL(this));
                String str2 = this.LJLJL;
                if (o.LJ(str2, C44269HYz.LIZJ)) {
                    i = this.LJLLLLLL;
                    if (i < 0) {
                        i = this.LJZ;
                    }
                } else if (o.LJ(str2, str)) {
                    i = this.LJLZ;
                } else {
                    i = this.LJZ;
                }
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP4 = this.LJLJLLL;
                if (viewOnTouchListenerC81419VxP4 != null) {
                    viewOnTouchListenerC81419VxP4.LJIIIIZZ(i, true, true);
                    this.LJLJI.LIZIZ(this, new AObjectS89S0100000_14(this, 182));
                    C0IB<Boolean> c0ib = this.LJLJJI;
                    if (c0ib != null) {
                        c0ib.LIZIZ(this, new AObjectS89S0100000_14(this, 183));
                    }
                    C0IB<C76800UCe> c0ib2 = this.LJLJJL;
                    if (c0ib2 != null) {
                        c0ib2.LIZIZ(this, new AObjectS89S0100000_14(this, 184));
                    }
                    LiveEvent<C35511Dwh> liveEvent = this.LJLJJLL;
                    if (liveEvent != null) {
                        liveEvent.LIZLLL(this, new AObjectS89S0100000_14(this, 185));
                    }
                    this.LJLJLJ.LIZIZ(this, new AObjectS89S0100000_14(this, 186));
                    return viewGroup2;
                }
                o.LJIJI("tabHost");
                throw null;
            }
            o.LJIJI("tabHost");
            throw null;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    public C81431Vxb(C82622Wbi diContainer, C29901Fi tabIndexChangeEvent, C40871j1 splitTabVisibility, C0IB c0ib, C40871j1 c40871j1, C29901Fi c29901Fi, String defaultSelectTabTag, boolean z, C46611sH translationY) {
        int i;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(tabIndexChangeEvent, "tabIndexChangeEvent");
        o.LJIIIZ(splitTabVisibility, "splitTabVisibility");
        o.LJIIIZ(defaultSelectTabTag, "defaultSelectTabTag");
        o.LJIIIZ(translationY, "translationY");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = tabIndexChangeEvent;
        this.LJLJI = splitTabVisibility;
        this.LJLJJI = c0ib;
        this.LJLJJL = c40871j1;
        this.LJLJJLL = c29901Fi;
        this.LJLJL = defaultSelectTabTag;
        this.LJLJLJ = translationY;
        this.LJLLILLLL = SFS.LJI(40.0d);
        this.LJLLJ = new LinkedHashSet();
        this.LJLLL = new C81435Vxf();
        this.LJLLLL = new LinkedHashMap();
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        this.LJLLLLLL = i;
        this.LJLZ = i + 1;
        this.LJZ = i + 2;
    }
}
