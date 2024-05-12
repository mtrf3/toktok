package com.ss.android.ugc.aweme.placediscovery2.ui.assem;

import X.ActivityC45651qj;
import X.AnonymousClass370;
import X.AnonymousClass636;
import X.C0F1;
import X.C110614Vt;
import X.C16880lQ;
import X.C191237ex;
import X.C191247ey;
import X.C191707fi;
import X.C1B3;
import X.C208248Fg;
import X.C213688a4;
import X.C214298b3;
import X.C32151Nz;
import X.C45804HyK;
import X.C56164M2m;
import X.C56173M2v;
import X.C56174M2w;
import X.C56179M3b;
import X.C61328O5c;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73312Spw;
import X.C78926UyI;
import X.C8DU;
import X.C8YN;
import X.C9BE;
import X.EnumC191217ev;
import X.InterfaceC191227ew;
import X.M36;
import X.M37;
import X.M3A;
import X.M3D;
import X.M3H;
import X.M3W;
import X.O6R;
import X.SY4;
import X.TBT;
import Y.ACListenerS29S0100000_9;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiscoveryMapAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public C8DU LJLILLLLZI;
    public M36<C191707fi> LJLJI;
    public FrameLayout LJLJJI;
    public C208248Fg LJLJJL;
    public SY4 LJLJJLL;
    public TuxIconView LJLJL;
    public TuxIconView LJLJLJ;
    public C73305Spp LJLJLLL;
    public final C73312Spw LJLL;
    public final M37 LJLLI;
    public long LJLLILLLL;
    public boolean LJLLJ;
    public Integer LJLLL;

    public DiscoveryMapAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DiscoveryLandingMapVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 490), C56164M2m.INSTANCE, null);
        this.LJLL = new C73312Spw();
        this.LJLLI = new M37(this);
        this.LJLLL = 0;
    }

    public final DiscoveryLandingMapVM v3() {
        return (DiscoveryLandingMapVM) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        Context context;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        C208248Fg c208248Fg;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        DiscoveryLandingMapVM v3 = v3();
        v3.setState(M3H.LJLIL);
        v3.LLFF = System.currentTimeMillis();
        if (!LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION")) {
            v3.gv0(new C56174M2w(M3A.FIRST_LOAD, null, null, 6));
        } else {
            TokenCert bpeaCert = M3D.LIZ;
            TokenCert decryptCert = M3D.LJIIIIZZ;
            C56173M2v c56173M2v = new C56173M2v(v3);
            o.LJIIIZ(bpeaCert, "bpeaCert");
            o.LJIIIZ(decryptCert, "decryptCert");
            C56179M3b.LIZ.LJIIIIZZ("poi", "places_discovery", bpeaCert, decryptCert, c56173M2v);
        }
        View findViewById = view.findViewById(R.id.cb3);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.discovery_map_container)");
        this.LJLJJI = (FrameLayout) findViewById;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.cb2);
        this.LJLJL = tuxIconView;
        Integer valueOf = Integer.valueOf(R.attr.cr);
        if (tuxIconView != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
            c110614Vt.LIZIZ = valueOf;
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            tuxIconView.setBackground(c110614Vt.LIZ(context2));
        }
        this.LJLJJL = (C208248Fg) view.findViewById(R.id.cb9);
        if (C0F1.LIZIZ(view, "view.context") && (c208248Fg = this.LJLJJL) != null) {
            c208248Fg.LJLZ = false;
        }
        SY4 sy4 = (SY4) view.findViewById(R.id.cb7);
        this.LJLJJLL = sy4;
        if (sy4 != null) {
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = valueOf;
            c110614Vt2.LIZJ = C61328O5c.LIZJ(32);
            Context context3 = view.getContext();
            o.LJIIIIZZ(context3, "view.context");
            sy4.setBackground(c110614Vt2.LIZ(context3));
        }
        SY4 sy42 = this.LJLJJLL;
        if (sy42 != null) {
            sy42.post(new ARunnableS28S0200000_9(sy42, this, 61));
        }
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.cb1);
        this.LJLJLJ = tuxIconView2;
        if (tuxIconView2 != null) {
            C110614Vt c110614Vt3 = new C110614Vt();
            c110614Vt3.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
            c110614Vt3.LIZIZ = valueOf;
            Context context4 = view.getContext();
            o.LJIIIIZZ(context4, "view.context");
            tuxIconView2.setBackground(c110614Vt3.LIZ(context4));
        }
        TuxIconView tuxIconView3 = this.LJLJLJ;
        if (tuxIconView3 != null) {
            C16880lQ.LJJJ(tuxIconView3, new ACListenerS29S0100000_9(this, 137));
        }
        TuxIconView tuxIconView4 = this.LJLJL;
        if (tuxIconView4 != null) {
            C16880lQ.LJJJ(tuxIconView4, new ACListenerS29S0100000_9(this, 138));
        }
        SY4 sy43 = this.LJLJJLL;
        if (sy43 != null) {
            C16880lQ.LJJIZ(sy43, new ACListenerS29S0100000_9(this, 139));
        }
        C73305Spp c73305Spp = (C73305Spp) view.findViewById(R.id.cb8);
        this.LJLJLLL = c73305Spp;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LJLJLLL;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
        AnonymousClass370 anonymousClass370 = (AnonymousClass370) view.findViewById(R.id.cbc);
        if (anonymousClass370 != null) {
            anonymousClass370.LJLJJI = new AqS185S0100000_3(this, 212);
        }
        this.LJLLILLLL = System.currentTimeMillis();
        M3W.LIZ.getClass();
        IPoiMapService LIZ = M3W.LIZ();
        C191237ex c191237ex = new C191237ex();
        EnumC191217ev enumC191217ev = EnumC191217ev.MAP_TYPE_NORMAL;
        o.LJIIIZ(enumC191217ev, "<set-?>");
        c191237ex.LIZJ = enumC191217ev;
        c191237ex.LIZ = false;
        c191237ex.LIZIZ = false;
        c191237ex.LJ = false;
        Context context5 = view.getContext();
        o.LJIIIIZZ(context5, "view.context");
        if (AnonymousClass636.LJIILJJIL(context5)) {
            i = R.raw.nearby_discovery_map_dark_style;
        } else {
            i = R.raw.nearby_discovery_map_style;
        }
        InputStream openRawResource = context5.getResources().openRawResource(i);
        o.LJIIIIZZ(openRawResource, "context.resources.openRawResource(raw)");
        byte[] bArr = new byte[openRawResource.available()];
        openRawResource.read(bArr);
        Charset defaultCharset = Charset.defaultCharset();
        o.LJIIIIZZ(defaultCharset, "defaultCharset()");
        c191237ex.LIZLLL = new String(bArr, defaultCharset);
        InterfaceC191227ew LIZ2 = LIZ.LIZ(new C191247ey(c191237ex));
        Fragment LIZIZ = LIZ2.LIZIZ();
        if (LIZIZ != null && (context = getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIIIZZ(R.id.cb3, 1, LIZIZ, null);
            c1b3.LJIILJJIL();
        }
        LIZ2.LIZ(new AqS140S0200000_9(this, view, 74));
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.M3L
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((M38) obj).LJLIL;
            }
        }, null, new AqS175S0100000_9(this, 493), new AqS159S0100000_9(this, 925), new AqS175S0100000_9(this, 494), 2, null);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.M3O
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((M38) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 88), 4);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.M3N
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((M38) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 89), 4);
        TuxIconView tuxIconView5 = this.LJLJL;
        if (tuxIconView5 != null) {
            tuxIconView5.post(new ARunnableS45S0100000_9(this, 91));
        }
    }
}
