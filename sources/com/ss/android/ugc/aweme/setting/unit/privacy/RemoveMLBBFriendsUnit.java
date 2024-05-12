package com.ss.android.ugc.aweme.setting.unit.privacy;

import X.AET;
import X.C10K;
import X.C1DH;
import X.C221108m2;
import X.C25859ACx;
import X.C25860ACy;
import X.C26045AKb;
import X.C62822Ol8;
import X.C73411SrX;
import X.C85904XnY;
import X.EF7;
import X.InterfaceC85903XnX;
import X.UUF;
import X.UUG;
import X.UUQ;
import X.UUR;
import Y.ARunnableS17S0101000_13;
import Y.AgS129S0100000_13;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RemoveMLBBFriendsUnit extends C25860ACy implements InterfaceC85903XnX {
    public final BasePage LJLJJL;
    public C73411SrX LJLJJLL;
    public C85904XnY LJLJL;
    public boolean LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public int LJLLI;
    public final C62822Ol8 LJLLILLLL;

    public final void LJIILJJIL() {
        UUF.LJFF(false);
        this.LJLJLJ = true;
        LJIIJ(UUR.LJLIL);
        C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(0, this, 19));
        C26045AKb c26045AKb = new C26045AKb(this.LJLJJL);
        c26045AKb.LJIIIIZZ(R.string.g5r);
        c26045AKb.LJIIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        AET aet = AET.DESTRUCTIVE;
        UUG uug = new UUG(this);
        UUG uug2 = new UUG(this);
        String string = EF7.LIZIZ().getString(R.string.i74);
        String string2 = EF7.LIZIZ().getString(R.string.i73);
        o.LJIIIIZZ(string, "getString(R.string.mlbb_…ngs_remove_section_title)");
        boolean z = false;
        return new C25859ACx(string, null, uug2, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, aet, string2, z, z, uug, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8342266);
    }

    @Override // X.InterfaceC85903XnX
    public final void LLJJ() {
        C26045AKb c26045AKb = new C26045AKb(this.LJLJJL);
        c26045AKb.LJIIIIZZ(R.string.q14);
        c26045AKb.LJIIJ();
        UUF.LJFF(true);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.AEC, X.ACx] */
    @Override // X.AG6
    public final C25859ACx LJI() {
        ?? LJI = super.LJI();
        C85904XnY c85904XnY = new C85904XnY();
        c85904XnY.LJLILLLLZI = this;
        this.LJLJL = c85904XnY;
        this.LJLJLJ = false;
        LJIIJ(UUQ.LJLIL);
        PushSettingsApiManager.LIZIZ(6).LJ(new AgS129S0100000_13(this, 3), C10K.LJI, null);
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
    public RemoveMLBBFriendsUnit(BasePage page) {
        super(null);
        o.LJIIIZ(page, "page");
        this.LJLJJL = page;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 265));
        page.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.setting.unit.privacy.RemoveMLBBFriendsUnit.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C85904XnY c85904XnY = RemoveMLBBFriendsUnit.this.LJLJL;
                    if (c85904XnY != null) {
                        c85904XnY.LIZIZ();
                    }
                    C73411SrX c73411SrX = RemoveMLBBFriendsUnit.this.LJLJJLL;
                    if (c73411SrX != null) {
                        c73411SrX.dispose();
                    }
                }
            }
        });
    }
}
