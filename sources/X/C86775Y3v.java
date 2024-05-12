package X;

import Y.IDDListenerS154S0100000_15;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.assem.ability.IPlayerProgressAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Y3v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86775Y3v implements ACF {
    public final InterfaceC55235Lm3 LJLIL;
    public final Aweme LJLILLLLZI;
    public String LJLJI;
    public EnumC86777Y3x LJLJJI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public boolean LJLLILLLL;
    public final FragmentManager LJLLJ;
    public final IDDListenerS154S0100000_15 LJLLL;
    public boolean LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final int LJLZ;

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        return false;
    }

    public final IPlayerComponentAbility LIZ() {
        return (IPlayerComponentAbility) this.LJLJL.getValue();
    }

    public final Y42 LIZIZ() {
        return (Y42) this.LJLLI.getValue();
    }

    @Override // X.ACF
    public final EnumC86689Y0n LLZLL() {
        CLACaptionAbility cLACaptionAbility = (CLACaptionAbility) this.LJLJLLL.getValue();
        if (cLACaptionAbility != null) {
            return cLACaptionAbility.LLZLL();
        }
        return null;
    }

    @Override // X.ACF
    public final void O() {
        CLACaptionAbility cLACaptionAbility = (CLACaptionAbility) this.LJLJLLL.getValue();
        if (cLACaptionAbility != null) {
            cLACaptionAbility.Ai(EnumC86730Y2c.TOGGLE_ENABLE);
        }
    }

    @Override // X.ACF
    public final boolean X7() {
        CLACaptionAbility cLACaptionAbility = (CLACaptionAbility) this.LJLJLLL.getValue();
        if (cLACaptionAbility != null) {
            return cLACaptionAbility.X7();
        }
        return true;
    }

    @Override // X.ACF
    public final void hk() {
        TranslationAbility translationAbility = (TranslationAbility) this.LJLJLJ.getValue();
        if (translationAbility != null) {
            translationAbility.SS(Y2B.COMBINE_ENTRANCE_MASTER_TOGGLE);
        }
    }

    @Override // X.ACF
    public final LiveData<Integer> u() {
        LiveData<Integer> u;
        IPlayerProgressAbility iPlayerProgressAbility = (IPlayerProgressAbility) this.LJLJJLL.getValue();
        if (iPlayerProgressAbility == null || (u = iPlayerProgressAbility.u()) == null) {
            return (LiveData) this.LJLLLLLL.getValue();
        }
        return u;
    }

    @Override // X.ACF
    public final void LJJJJLI() {
        IPlayerComponentAbility LIZ = LIZ();
        if (LIZ != null) {
            LIZ.tryResumePlay();
        }
    }

    @Override // X.ACF
    public final void LJJJLIIL() {
        IPlayerComponentAbility LIZ = LIZ();
        if (LIZ != null) {
            LIZ.LJJJLIIL();
        }
    }

    @Override // X.ACF
    public final int mg() {
        IPlayerComponentAbility LIZ = LIZ();
        if (LIZ != null) {
            return LIZ.gu();
        }
        return 0;
    }

    @Override // X.ACF
    public final void pausePlayer() {
        IPlayerComponentAbility LIZ = LIZ();
        if (LIZ != null) {
            LIZ.pauseCurrentPlayerWithListener();
        }
    }

    @Override // X.ACF
    public final Aweme getAweme() {
        return this.LJLILLLLZI;
    }

    @Override // X.ACF
    public final String getEnterFrom() {
        return this.LJLJI;
    }

    @Override // X.ACF
    public final EnumC86777Y3x getEnterMethod() {
        return this.LJLJJI;
    }

    @Override // X.ACF
    public final InterfaceC55235Lm3 v2() {
        return this.LJLIL;
    }

    @Override // X.ACF
    public final void I6(View view) {
        o.LJIIIZ(view, "view");
        if (!this.LJLLILLLL) {
            if (ACW.LIZIZ()) {
                LIZIZ().e3(view);
            }
            this.LJLLILLLL = true;
        }
    }

    public final void LIZJ(TuxSheet tuxSheet) {
        Y42 LIZIZ;
        this.LJLLLL = true;
        if (ACW.LIZIZ() && (LIZIZ = LIZIZ()) != null) {
            LIZIZ.kl(new Y43(this), new Y41(this));
            LIZIZ.P9(tuxSheet);
            LIZIZ.hd(3);
        }
    }

    @Override // X.ACF
    public final void V4(Y2B requestType) {
        o.LJIIIZ(requestType, "requestType");
        TranslationAbility translationAbility = (TranslationAbility) this.LJLJLJ.getValue();
        if (translationAbility != null) {
            translationAbility.V4(requestType);
        }
    }

    @Override // X.ACF
    public final void ac(boolean z) {
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLJJL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
    }

    @Override // X.ACF
    public final void i5(int i) {
        IPlayerComponentAbility LIZ;
        if (i >= 0 && i <= this.LJLZ && this.LJLZ > 0 && (LIZ = LIZ()) != null) {
            LIZ.seekProgress((i / this.LJLZ) * 100);
        }
    }

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
        if (ACW.LIZIZ()) {
            LIZIZ().I7(sheet, f);
        }
    }

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
        if (ACW.LIZIZ()) {
            LIZIZ().Pg(sheet, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C86775Y3v(ActivityC45651qj activityC45651qj, InterfaceC55235Lm3 captionAssemVScope, Aweme aweme, String str, EnumC86777Y3x enterMethod, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        int i;
        o.LJIIIZ(captionAssemVScope, "captionAssemVScope");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = captionAssemVScope;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
        this.LJLJJI = enterMethod;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 849));
        this.LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 848));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 850));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 847));
        this.LJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 851));
        this.LJLLI = C221108m2.LIZIZ(Y44.LJLIL);
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        this.LJLLJ = supportFragmentManager;
        this.LJLLL = new IDDListenerS154S0100000_15(this, 4);
        this.LJLLLLLL = C221108m2.LIZIZ(C86776Y3w.LJLIL);
        Integer LJIJJ = C86670Xzu.LJIJJ(aweme);
        if (LJIJJ != null) {
            i = LJIJJ.intValue();
        } else {
            i = -1;
        }
        this.LJLZ = i;
    }
}
