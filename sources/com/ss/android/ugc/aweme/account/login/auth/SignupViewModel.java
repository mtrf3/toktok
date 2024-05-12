package com.ss.android.ugc.aweme.account.login.auth;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C62822Ol8;
import X.C68517Qun;
import X.C84700XMa;
import X.C84701XMb;
import X.C84702XMc;
import X.C84703XMd;
import X.C84704XMe;
import X.C84705XMf;
import X.C84706XMg;
import X.C84707XMh;
import X.C84708XMi;
import X.C84709XMj;
import X.C84712XMm;
import X.C85542Xhi;
import X.C85573XiD;
import X.XJ1;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SignupViewModel extends ViewModel {
    public static final /* synthetic */ int LLIIZ = 0;
    public WeakReference<ActivityC45651qj> LJLIL;
    public Intent LJLILLLLZI;
    public List<? extends C85542Xhi> LJLJI;
    public List<? extends C85542Xhi> LJLJJI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 61));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 69));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 64));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 62));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 63));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 57));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 65));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 55));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 52));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 68));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 70));
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final String LLF;
    public final IPrevLoginPlatformService LLFF;
    public final String LLFFF;
    public final int LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public C85573XiD LLIILZL;

    public final String getEnterFrom() {
        return (String) this.LJLJJL.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LJLJLJ.getValue();
    }

    public final boolean gv0() {
        return ((Boolean) this.LJZI.getValue()).booleanValue();
    }

    public final List<C85542Xhi> hv0() {
        List list = this.LJLJI;
        if (list != null) {
            return list;
        }
        o.LJIJI("allLoginItems");
        throw null;
    }

    public final String iv0() {
        return (String) this.LJLJL.getValue();
    }

    public final String jv0() {
        return (String) this.LJLLI.getValue();
    }

    public final Bundle kv0() {
        return (Bundle) this.LLFZ.getValue();
    }

    public final String lv0() {
        return (String) this.LJLJJLL.getValue();
    }

    public final Bundle mv0() {
        return (Bundle) this.LJLLLL.getValue();
    }

    public final Bundle nv0() {
        return (Bundle) this.LLI.getValue();
    }

    public final C85573XiD ov0() {
        C85573XiD c85573XiD = this.LLIILZL;
        if (c85573XiD != null) {
            return c85573XiD;
        }
        o.LJIJI("signupTopBarViewHolder");
        throw null;
    }

    public final boolean pv0() {
        return ((Boolean) this.LLIIIL.getValue()).booleanValue();
    }

    public final boolean qv0() {
        return ((Boolean) this.LLIILII.getValue()).booleanValue();
    }

    public final boolean rv0() {
        return ((Boolean) this.LLIIII.getValue()).booleanValue();
    }

    public final boolean sv0() {
        return ((Boolean) this.LLIIJI.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SignupViewModel() {
        String name;
        C221108m2.LIZIZ(new AqS165S0100000_15(this, 53));
        this.LJLLLLLL = C221108m2.LIZIZ(new C84703XMd(this));
        this.LJLZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 51));
        this.LJZ = C221108m2.LIZIZ(new C84702XMc(this));
        this.LJZI = C221108m2.LIZIZ(new C84700XMa(this));
        this.LJZL = C221108m2.LIZIZ(new C84701XMb(this));
        this.LL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 59));
        this.LLD = C221108m2.LIZIZ(new AqS165S0100000_15(this, 60));
        BaseLoginMethod LJIIJJI = C68517Qun.LIZ.LJIIJJI();
        if (LJIIJJI instanceof TPLoginMethod) {
            name = ((TPLoginMethod) LJIIJJI).getPlatform();
        } else {
            name = LJIIJJI.getLoginMethodName().name();
        }
        this.LLF = name;
        IPrevLoginPlatformService LJIIL = PrevLoginPlatformService.LJIIL();
        this.LLFF = LJIIL;
        String str = (String) LJIIL.getPlatform().getValue();
        this.LLFFF = str == null ? "" : str;
        this.LLFII = LJIIL.LJIIIZ();
        this.LLFZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 67));
        this.LLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 58));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 54));
        this.LLII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 56));
        this.LLIIII = C221108m2.LIZIZ(new C84709XMj(this));
        this.LLIIIILZ = C221108m2.LIZIZ(XJ1.LJLIL);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 66));
        this.LLIIIL = C221108m2.LIZIZ(new C84712XMm(this));
        this.LLIIIZ = C221108m2.LIZIZ(new C84707XMh(this));
        this.LLIIJI = C221108m2.LIZIZ(new C84704XMe(this));
        this.LLIIJLIL = C221108m2.LIZIZ(new C84708XMi(this));
        this.LLIIL = C221108m2.LIZIZ(new C84705XMf(this));
        this.LLIILII = C221108m2.LIZIZ(new C84706XMg(this));
    }
}
