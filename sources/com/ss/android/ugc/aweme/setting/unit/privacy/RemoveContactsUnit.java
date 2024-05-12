package com.ss.android.ugc.aweme.setting.unit.privacy;

import X.AET;
import X.C10K;
import X.C1DH;
import X.C221108m2;
import X.C25859ACx;
import X.C25860ACy;
import X.C26227ARb;
import X.C5S1;
import X.C62822Ol8;
import X.C73411SrX;
import X.C85904XnY;
import X.EF7;
import X.InterfaceC85903XnX;
import X.UC0;
import X.UUF;
import X.UUS;
import X.UUT;
import Y.ARunnableS17S0101000_13;
import Y.AgS129S0100000_13;
import android.content.Context;
import android.view.View;
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
public final class RemoveContactsUnit extends C25860ACy implements InterfaceC85903XnX, View.OnClickListener {
    public final BasePage LJLJJL;
    public boolean LJLJJLL;
    public C85904XnY LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public int LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public C73411SrX LJLLJ;

    public final void LJIILJJIL() {
        UUF.LJFF(false);
        this.LJLJJLL = true;
        LJIIJ(UUT.LJLIL);
        C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(0, this, 20));
        C5S1 c5s1 = new C5S1((Context) this.LJLLI.getValue());
        c5s1.LIZJ(R.string.g5r);
        c5s1.LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        AET aet = AET.DESTRUCTIVE;
        String string = EF7.LIZIZ().getString(R.string.r21);
        String string2 = EF7.LIZIZ().getString(R.string.r22);
        o.LJIIIIZZ(string, "getString(R.string.setti…e_remove_synced_contacts)");
        boolean z = false;
        return new C25859ACx(string, null, this, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, aet, string2, z, z, this, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8342266);
    }

    @Override // X.InterfaceC85903XnX
    public final void LLJJ() {
        C5S1 c5s1 = new C5S1((Context) this.LJLLI.getValue());
        c5s1.LIZJ(R.string.q14);
        c5s1.LJ();
        UUF.LJFF(true);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.AEC, X.ACx] */
    @Override // X.AG6
    public final C25859ACx LJI() {
        ?? LJI = super.LJI();
        C85904XnY c85904XnY = new C85904XnY();
        c85904XnY.LJLILLLLZI = this;
        this.LJLJL = c85904XnY;
        this.LJLJJLL = false;
        LJIIJ(UUS.LJLIL);
        PushSettingsApiManager.LIZIZ(1).LJ(new AgS129S0100000_13(this, 4), C10K.LJI, null);
        return LJI;
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
    public RemoveContactsUnit(BasePage page) {
        super(null);
        o.LJIIIZ(page, "page");
        this.LJLJJL = page;
        this.LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 261));
        page.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.setting.unit.privacy.RemoveContactsUnit.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C85904XnY c85904XnY = RemoveContactsUnit.this.LJLJL;
                    if (c85904XnY != null) {
                        c85904XnY.LIZIZ();
                    }
                    C73411SrX c73411SrX = RemoveContactsUnit.this.LJLLJ;
                    if (c73411SrX != null) {
                        c73411SrX.dispose();
                    }
                }
            }
        });
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 262));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        UUF.LIZ(1);
        if (this.LJLJJLL) {
            UUF.LJ(1);
            Context context = (Context) this.LJLLI.getValue();
            if (context == null) {
                return;
            }
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJ(R.string.q16);
            c26227ARb.LIZ(R.string.q12);
            UC0.LIZJ(c26227ARb, new AqS179S0100000_13(this, 577));
            c26227ARb.LJI().LIZLLL();
            return;
        }
        C5S1 c5s1 = new C5S1(v.getContext());
        c5s1.LIZJ(R.string.seh);
        c5s1.LJ();
    }
}
