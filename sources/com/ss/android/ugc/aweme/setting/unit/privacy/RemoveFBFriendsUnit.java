package com.ss.android.ugc.aweme.setting.unit.privacy;

import X.AET;
import X.C10K;
import X.C1DH;
import X.C221108m2;
import X.C25859ACx;
import X.C25860ACy;
import X.C26227ARb;
import X.C32151Nz;
import X.C5S1;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73411SrX;
import X.C85904XnY;
import X.EF7;
import X.InterfaceC85903XnX;
import X.O6R;
import X.UC0;
import X.UUF;
import X.UUN;
import X.UUU;
import X.UUV;
import Y.ARunnableS17S0101000_13;
import Y.AgS129S0100000_13;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RemoveFBFriendsUnit extends C25860ACy implements InterfaceC85903XnX, View.OnClickListener {
    public final BasePage LJLJJL;
    public boolean LJLJJLL;
    public final C73318Sq2 LJLJL;
    public C85904XnY LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public int LJLLI;
    public final String LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public C73411SrX LJLLLLLL;

    public final void LJIILJJIL() {
        UUF.LJFF(false);
        this.LJLJJLL = true;
        LJIIJ(UUV.LJLIL);
        C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(0, this, 21));
        C5S1 c5s1 = new C5S1(LJIILLIIL());
        c5s1.LIZJ(R.string.g5r);
        c5s1.LJ();
    }

    public final void LJIILL() {
        PushSettingsApiManager.LIZIZ(2).LJ(new AgS129S0100000_13(this, 0), C10K.LJI, null).LJ(new AgS129S0100000_13(this, 1), C10K.LJIIIIZZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        AET aet = AET.DESTRUCTIVE;
        String string = EF7.LIZIZ().getString(R.string.r24);
        String string2 = EF7.LIZIZ().getString(R.string.r25);
        View view = new View(LJIILLIIL());
        view.setLayoutParams(new ViewGroup.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))));
        o.LJIIIIZZ(string, "getString(R.string.setti…_toggle_remove_synced_fb)");
        boolean z = false;
        return new C25859ACx(string, null, this, null == true ? 1 : 0, z, view, null == true ? 1 : 0, null == true ? 1 : 0, z, z, aet, string2, z, z, this, null == true ? 1 : 0, null == true ? 1 : 0, 8342234);
    }

    public final Context LJIILLIIL() {
        return (Context) this.LJLLJ.getValue();
    }

    @Override // X.InterfaceC85903XnX
    public final void LLJJ() {
        C5S1 c5s1 = new C5S1(LJIILLIIL());
        c5s1.LIZJ(R.string.q14);
        c5s1.LJ();
        UUF.LJFF(true);
    }

    @Override // X.AG6
    public final C25859ACx LJI() {
        super.LJI();
        C85904XnY c85904XnY = new C85904XnY();
        c85904XnY.LJLILLLLZI = this;
        this.LJLJLJ = c85904XnY;
        this.LJLJJLL = false;
        LJIIJ(UUU.LJLIL);
        LJIILL();
        return LJFF();
    }

    @Override // X.C25860ACy, X.AG6
    public final /* bridge */ /* synthetic */ C25859ACx LJIIIIZZ() {
        return LJIIIIZZ();
    }

    @Override // X.InterfaceC85903XnX
    public final void vx() {
        LJIILJJIL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveFBFriendsUnit(BasePage page) {
        super(null);
        o.LJIIIZ(page, "page");
        this.LJLJJL = page;
        this.LJLJL = new C73318Sq2();
        this.LJLLILLLL = "click";
        this.LJLLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 263));
        this.LJLLL = C221108m2.LIZIZ(UUN.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 264));
        page.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.setting.unit.privacy.RemoveFBFriendsUnit.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C85904XnY c85904XnY = RemoveFBFriendsUnit.this.LJLJLJ;
                    if (c85904XnY != null) {
                        c85904XnY.LIZIZ();
                    }
                    C73411SrX c73411SrX = RemoveFBFriendsUnit.this.LJLLLLLL;
                    if (c73411SrX != null) {
                        c73411SrX.dispose();
                    }
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        UUF.LIZ(2);
        if (this.LJLJJLL) {
            UUF.LJ(2);
            Context LJIILLIIL = LJIILLIIL();
            if (LJIILLIIL == null) {
                return;
            }
            C26227ARb c26227ARb = new C26227ARb(LJIILLIIL);
            c26227ARb.LJ(R.string.ve);
            c26227ARb.LIZ(R.string.q12);
            UC0.LIZJ(c26227ARb, new AqS179S0100000_13(this, 569));
            c26227ARb.LJI().LIZLLL();
            return;
        }
        C5S1 c5s1 = new C5S1(v.getContext());
        c5s1.LIZJ(R.string.v_);
        c5s1.LJ();
    }
}
