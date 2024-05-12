package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import X.C113554cx;
import X.C17J;
import X.C234639It;
import X.C243819hZ;
import X.C243839hb;
import X.C65352Pkq;
import X.C8VC;
import X.C9JT;
import X.C9PN;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.OSZ;
import X.RBX;
import X.TBT;
import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureSocialAssem extends ProfileSingleFeatureAssem {
    public C243839hb LJLJJLL;
    public Map<Integer, C243819hZ> LJLJL;

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final Map<String, Boolean> F3() {
        boolean z;
        boolean z2;
        boolean z3;
        OSZ[] oszArr = new OSZ[4];
        Locale locale = Locale.ROOT;
        String lowerCase = "HAS_TWITTER_FUNCTION".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        boolean z4 = true;
        if (this.LJLJJL && this.LJLJL.containsKey(3)) {
            z = true;
        } else {
            z = false;
        }
        oszArr[0] = new OSZ(lowerCase, Boolean.valueOf(z));
        String lowerCase2 = "HAS_YOUTUBE_FUNCTION".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (this.LJLJJL && this.LJLJL.containsKey(2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        oszArr[1] = new OSZ(lowerCase2, Boolean.valueOf(z2));
        String lowerCase3 = "HAS_INSTAGRAM_FUNCTION".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (this.LJLJJL && this.LJLJL.containsKey(1)) {
            z3 = true;
        } else {
            z3 = false;
        }
        oszArr[2] = new OSZ(lowerCase3, Boolean.valueOf(z3));
        String lowerCase4 = "HAS_SOCIAL_BUTTON".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (!this.LJLJJL || this.LJLJL.size() <= 1) {
            z4 = false;
        }
        oszArr[3] = new OSZ(lowerCase4, Boolean.valueOf(z4));
        return C113554cx.LJJL(oszArr);
    }

    public ProfileAdvancedFeatureSocialAssem() {
        new LinkedHashMap();
        this.LJLJL = C113554cx.LJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final View I3() {
        return v3(R.string.amq, R.raw.icon_instagram, new View.OnClickListener() { // from class: X.9Iw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        String str;
        String str2;
        super.onCreate();
        String str3 = null;
        if (K3()) {
            str = ((RBX) HG3.LJIILL()).getCurUserId();
        } else {
            C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
            if (c9pn != null) {
                str = c9pn.LIZ;
            } else {
                str = null;
            }
        }
        String str4 = "";
        if (K3()) {
            str3 = "";
        } else {
            C9PN c9pn2 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
            if (c9pn2 != null) {
                str3 = c9pn2.LJII;
            }
        }
        String LJJ = C17J.LJJ(this, K3());
        if (str == null) {
            str = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        C9PN c9pn3 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn3 != null && (str2 = c9pn3.LIZLLL) != null) {
            str4 = str2;
        }
        this.LJLJJLL = new C243839hb(LJJ, str, str3, str4);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Iu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new C234639It(this));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Iv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 660));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final C9JT x3() {
        return C9JT.SOCIAL;
    }
}
