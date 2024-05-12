package com.ss.android.ugc.aweme.music.artist.ui;

import X.AbstractC234519Ih;
import X.C109824Ss;
import X.C214298b3;
import X.C221108m2;
import X.C234509Ig;
import X.C235119Kp;
import X.C252709vu;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.C9BJ;
import X.C9BL;
import X.C9BV;
import X.C9GQ;
import X.C9GR;
import X.C9GW;
import X.C9KF;
import X.EnumC252729vw;
import X.InterfaceC198557ql;
import X.InterfaceC234359Hr;
import X.TBT;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicAwemeListNavBarViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ArtistMusicAwemeListNavBarAssem extends UIContentAssem implements InterfaceC234359Hr {
    public final C5H3 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 396));
    public final C214298b3 LJLILLLLZI;

    public ArtistMusicAwemeListNavBarAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ArtistMusicAwemeListNavBarViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 397), C9BV.INSTANCE, null);
    }

    private final void E3() {
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9C8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9C5) obj).LJLIL;
            }
        }, null, C9BJ.LJLIL, 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9C7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9C5) obj).LJLILLLLZI);
            }
        }, null, new AqS186S0100000_4(this, 108), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9C6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9C5) obj).LJLJI;
            }
        }, null, C9BL.LJLIL, 6);
    }

    @Override // X.InterfaceC234359Hr, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final C252709vu x3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-navBar>(...)");
        return (C252709vu) value;
    }

    public final ArtistMusicAwemeListNavBarViewModel A3() {
        return (ArtistMusicAwemeListNavBarViewModel) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9GW] */
    @Override // X.C8VB
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public C9GW defaultObservableData() {
        return new InterfaceC198557ql() { // from class: X.9GW
        };
    }

    private final void C3() {
        String str;
        String str2;
        Resources resources;
        String string;
        Resources resources2;
        Resources resources3;
        C252709vu x3 = x3();
        x3.LJIILJJIL(true);
        C235119Kp c235119Kp = new C235119Kp();
        AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
        C234509Ig c234509Ig = new C234509Ig();
        Context context = x3.getContext();
        String str3 = "";
        if (context == null || (resources3 = context.getResources()) == null || (str = resources3.getString(R.string.gcu)) == null) {
            str = "";
        }
        c234509Ig.LIZJ = str;
        c234509Ig.LJ = true;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        c234509Ig.LIZ = new C109824Ss(new AqS154S0100000_4(this, 394));
        abstractC234519IhArr[0] = c234509Ig;
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, abstractC234519IhArr);
        Context context2 = x3.getContext();
        if (context2 == null || (resources2 = context2.getResources()) == null || (str2 = resources2.getString(R.string.gd0)) == null) {
            str2 = "";
        }
        LIZLLL.LIZJ = str2;
        c235119Kp.LIZJ = LIZLLL;
        AbstractC234519Ih[] abstractC234519IhArr2 = new AbstractC234519Ih[1];
        C234509Ig c234509Ig2 = new C234509Ig();
        c234509Ig2.LIZIZ = "save";
        Context context3 = x3.getContext();
        if (context3 != null && (resources = context3.getResources()) != null && (string = resources.getString(R.string.gcy)) != null) {
            str3 = string;
        }
        c234509Ig2.LIZJ = str3;
        c234509Ig2.LJ = false;
        c234509Ig2.LIZ(EnumC252729vw.PRIMARY);
        c234509Ig2.LIZ = new C109824Ss(new AqS154S0100000_4(this, 395));
        abstractC234519IhArr2[0] = c234509Ig2;
        c235119Kp.LIZIZ(abstractC234519IhArr2);
        c235119Kp.LIZLLL = true;
        x3.setNavActions(c235119Kp);
    }

    @Override // X.InterfaceC234359Hr
    public void LJJIIJZLJL() {
        x3().LJIJ("save", C9GR.LJLIL);
    }

    @Override // X.InterfaceC234359Hr
    public void LJJJI() {
        x3().LJIJ("save", C9GQ.LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C3();
        E3();
    }
}
