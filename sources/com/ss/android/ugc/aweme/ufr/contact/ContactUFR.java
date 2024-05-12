package com.ss.android.ugc.aweme.ufr.contact;

import X.AbstractC73672Svk;
import X.C04330Ez;
import X.C221108m2;
import X.C58741N3p;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73390SrC;
import X.C73411SrX;
import X.C73565Su1;
import X.C77130UOw;
import X.C77150UPq;
import X.EF7;
import X.HG3;
import X.InterfaceC58007Mpf;
import X.RBX;
import X.UP5;
import X.UP6;
import X.UP7;
import X.UP8;
import X.UPA;
import X.UPC;
import X.UPP;
import X.UPZ;
import X.UQ2;
import Y.IDuS323S0100000_13;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ContactUFR extends UPC implements LifecycleEventObserver {
    public C73411SrX LJLJLJ;
    public boolean LJLL;
    public boolean LJLLI;
    public final C73318Sq2 LJLJLLL = new C73318Sq2();
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(UP7.LJLIL);
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 266));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(UP6.LJLIL);

    @Override // X.UPC
    public final C73390SrC LJII() {
        return AbstractC73672Svk.LJIIJ(new IDuS323S0100000_13(this, 2));
    }

    @Override // X.UPC
    public final C73390SrC LJIIIIZZ() {
        return AbstractC73672Svk.LJIIJ(new IDuS323S0100000_13(this, 3));
    }

    @Override // X.UPC
    public final AbstractC73672Svk<C77150UPq> LJIIJ() {
        return AbstractC73672Svk.LJIIJ(new IDuS323S0100000_13(this, 0));
    }

    public final void LJIIL() {
        ((InterfaceC58007Mpf) this.LJLLILLLL.getValue()).LIZJ(new AqS179S0100000_13(this, 337));
    }

    public final void LJIILIIL() {
        Map<String, String> map = this.LJLJJL;
        if (map != null && map.containsKey("is_passive") && o.LJ(map.get("is_passive"), "on")) {
            UQ2.LIZ().LIZ.storeLong("last_click_cancel_time", System.currentTimeMillis());
        }
    }

    @Override // X.UPC
    public final C73565Su1 LIZ() {
        boolean z;
        if (C04330Ez.LIZ(EF7.LIZIZ(), "android.permission.READ_CONTACTS") != -1) {
            z = true;
        } else {
            z = false;
        }
        return AbstractC73672Svk.LJJIJIL(new C77150UPq(z, 0, 0, null, 30));
    }

    @Override // X.UPC
    public final C73565Su1 LIZIZ() {
        List<SocialPlatformSetting> socialPlatformSettings = ((RBX) HG3.LJIILL()).getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    return AbstractC73672Svk.LJJIJIL(new C77150UPq(socialPlatformSetting.getSyncStatus(), 0, 0, null, 30));
                }
            }
        }
        return AbstractC73672Svk.LJJIJIL(new C77150UPq(false, 0, 0, null, 30));
    }

    public final void LJIIJJI(boolean z) {
        if (this.LJLLI) {
            this.LJLLI = false;
        }
        ((InterfaceC58007Mpf) this.LJLLILLLL.getValue()).LIZJ(new UPP(this, z));
    }

    @Override // X.UPC
    public final C73390SrC LJIIIZ(int i, boolean z) {
        UPZ.LIZ.LJFF(z);
        boolean LJ = o.LJ(LIZLLL(), "privacy_setting");
        if (z || i == 3) {
            return AbstractC73672Svk.LJIIJ(new UP5(this, z, LJ, i));
        }
        return AbstractC73672Svk.LJIIJ(new C77130UOw(this, z));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (this.LJLL && event == Lifecycle.Event.ON_RESUME) {
            this.LJLL = false;
            if (UPZ.LIZ.LJ()) {
                if (o.LJ(LIZLLL(), "privacy_setting")) {
                    return;
                }
                ((UP8) this.LJLLL.getValue()).LIZ.onNext(Boolean.TRUE);
                ((UPA) C58741N3p.LIZ(LIZJ(), UPA.class)).LIZ();
                return;
            }
            ((UP8) this.LJLLL.getValue()).LIZ.onNext(Boolean.FALSE);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.LJLJLLL.dispose();
            source.getLifecycle().removeObserver(this);
        }
    }
}
