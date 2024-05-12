package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C26363AWh;
import X.C2K0;
import X.C3EJ;
import X.C47261Igj;
import X.C55096Ljo;
import X.C61878OQg;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C68252m5;
import X.HG3;
import X.InterfaceC54152LNc;
import X.InterfaceC55102Lju;
import X.J9P;
import X.LMJ;
import X.LML;
import X.LMO;
import X.LMP;
import X.LMQ;
import X.LMS;
import X.LMU;
import X.LND;
import X.QD3;
import X.RBX;
import Y.ARunnableS20S0300000_9;
import Y.IDgS138S0200000_9;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel;
import com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.IMFIconsProtocol;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class MFSocialAssem extends UIContentAssem implements IMFSocialAbility, IMFIconsProtocol, InterfaceC54152LNc, InterfaceC55102Lju {
    public String LJLIL;
    public LMU LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public LND LJLJLJ;

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility
    public final void SJ() {
        this.LJLJI = false;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1534603512) {
            return null;
        }
        return this;
    }

    public MFSocialAssem() {
        new LinkedHashMap();
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 307));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 306));
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 308));
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.IMFIconsProtocol
    public final List<LML> F2() {
        return C47261Igj.LJJIJ(new LMJ(this));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility
    public final String F80() {
        String str = this.LJLIL;
        this.LJLIL = "";
        return str;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IMFIconsProtocol.class, C47261Igj.LJJIJIL(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        LMQ lmq = (LMQ) this.LJLJJLL.getValue();
        if (lmq != null) {
            lmq.onDestroyView();
        }
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        LMQ lmq = (LMQ) this.LJLJJLL.getValue();
        if (lmq != null) {
            lmq.onResume();
        }
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.IMFIconsProtocol
    public final List<LML> X() {
        return C61878OQg.INSTANCE;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility
    public final boolean Zw() {
        return this.LJLJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility
    public final LMU uu0() {
        return this.LJLILLLLZI;
    }

    @QD3
    public final void onFollowBubbleShowEvent(LMP event) {
        o.LJIIIZ(event, "event");
        this.LJLIL = event.LJLIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ((HomeViewPagerAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), HomeViewPagerAbility.class)).addOnPageChangeListener(new LMO(this));
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            view.post(new ARunnableS20S0300000_9(view, this, LIZLLL, 11));
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && ((Boolean) C3EJ.LIZIZ.getValue()).booleanValue()) {
            new ViewModelProvider(LIZ, new C26363AWh(LIZ)).get(ForceBackFYPViewModel.class);
        }
        C68252m5.LIZ(this, new LMS(this, null));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility
    public final boolean vt(String str) {
        IMFAbility iMFAbility;
        String str2;
        if (str == null || (iMFAbility = (IMFAbility) this.LJLJL.getValue()) == null || ((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        if (iMFAbility.getCurrentItemCompat() == 0) {
            str2 = "homepage_hot";
        } else {
            str2 = "";
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null) {
            return false;
        }
        J9P.LIZJ(LIZLLL, str2, str, null, new IDgS138S0200000_9(this, iMFAbility, 1));
        return true;
    }

    @Override // X.InterfaceC54152LNc
    public final void LJJJJI(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
    }
}
