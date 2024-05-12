package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C54029LIj;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C8W0;
import X.InterfaceC54049LJd;
import X.InterfaceC54151LNb;
import X.InterfaceC55102Lju;
import X.O5Y;
import Y.IDiS271S0100000_9;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.SeriesVideoUploadObserver;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MFPubAssem extends C8W0 implements IMFPubAbility, InterfaceC54151LNb, InterfaceC55102Lju {
    public int LJLIL = 1;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 305));

    @Override // X.InterfaceC54151LNb
    public final void LLJJJJJIL(int i, Fragment fragment) {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1047333186) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC54151LNb
    public final void y(int i, boolean z) {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility
    public final boolean jo0() {
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LJLILLLLZI.getValue();
        if (homeViewPagerAbility == null || !homeViewPagerAbility.hs0()) {
            return false;
        }
        int Eh = homeViewPagerAbility.Eh();
        if (Eh == 0) {
            if (this.LJLIL != 0) {
                return false;
            }
        } else if (Eh == 1) {
            if (this.LJLIL != 1) {
                return false;
            }
        } else if (Eh == 31) {
            if (this.LJLIL != 31) {
                return false;
            }
        } else if (Eh == 7) {
            if (this.LJLIL != 7) {
                return false;
            }
        } else if (Eh != 35 || this.LJLIL != 35) {
            return false;
        }
        return true;
    }

    @Override // X.C8W0
    public final void onCreate() {
        super.onCreate();
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LJLILLLLZI.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.addOnPageChangeListener(new IDiS271S0100000_9(this, 6));
        }
        getLifecycle().addObserver(new SeriesVideoUploadObserver(C212428Vi.LIZ(this)));
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility
    public final int Kz() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC54151LNb
    public final void LLLLILI(Bundle bundle) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        String string = bundle.getString("fromStart", "");
        String sv0 = Hox.LJLLI.LIZ(LIZ).sv0("HOME");
        if (o.LJ(string, "MainPage") || bundle.getBoolean(sv0)) {
            AVExternalServiceImpl.LIZ().publishService().uploadRecoverPopViewSetVisibility(false);
        }
    }

    @Override // X.InterfaceC54151LNb
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        String string = args.getString("fromStart", "");
        String sv0 = Hox.LJLLI.LIZ(LIZ).sv0("HOME");
        if ((o.LJ(string, "MainPage") || args.getBoolean(sv0)) && args.getInt("switchType", -1) == 1) {
            AVExternalServiceImpl.LIZ().publishService().uploadRecoverPopViewSetVisibility(true);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility
    public final void iv(int i) {
        ActivityC45651qj LIZ;
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LJLILLLLZI.getValue();
        if (homeViewPagerAbility != null && (LIZ = C212428Vi.LIZ(this)) != null && homeViewPagerAbility.hs0() && (LIZ instanceof MainActivity) && !LIZ.isDestroyed()) {
            int pageType = homeViewPagerAbility.getPageType(i);
            int i2 = this.LJLIL;
            if (pageType != i2) {
                O5Y.LJJIZ(LIZ);
                return;
            }
            if (i2 != 1) {
                if (i2 != 7) {
                    if (i2 != 31) {
                        if (i2 != 35) {
                            return;
                        }
                        O5Y.LJJLIIIJ(LIZ);
                        return;
                    }
                    C54029LIj c54029LIj = C54029LIj.LIZIZ;
                    if (c54029LIj.LJJIJL()) {
                        O5Y.LJJLIIIJ(LIZ);
                        return;
                    } else {
                        if (c54029LIj.LIZ()) {
                            return;
                        }
                        O5Y.LJJLIIIJ(LIZ);
                        return;
                    }
                }
                InterfaceC54049LJd LJIJ = NearbyFeedServiceImpl.LJJI().LJIJ();
                if (LJIJ == null || !LJIJ.LIZ()) {
                    return;
                }
                O5Y.LJJLIIIJ(LIZ);
                return;
            }
            O5Y.LJJLIIIJ(LIZ);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility
    public final void vv(int i) {
        this.LJLIL = i;
    }
}
