package com.ss.android.ugc.aweme.assem;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C235779Nd;
import X.C2K0;
import X.C36821Ecj;
import X.C38985FRt;
import X.C38986FRu;
import X.C54293LSn;
import X.C56662Kg;
import X.C62822Ol8;
import X.E1J;
import X.EF7;
import X.FNR;
import X.InterfaceC55102Lju;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.journey.NewUserGuideAbility;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NewUserGuideAssem extends BaseMainContainerAssem implements NewUserGuideAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 26));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 27));

    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(NewUserGuideAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        if (!E1J.LIZ()) {
            v3();
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -935865689) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.journey.NewUserGuideAbility
    public final boolean isNewUser() {
        return ((Boolean) this.LJLILLLLZI.getValue()).booleanValue();
    }

    public final void v3() {
        Activity activity = (Activity) this.LJLIL.getValue();
        if (activity == null) {
            return;
        }
        C56662Kg.LIZ().LIZJ("main_act_user_guide_observe", false);
        C56662Kg.LIZ().LIZJ("method_create_calculate_newuser_value", false);
        C38985FRt c38985FRt = C38985FRt.LIZIZ;
        c38985FRt.LJIIJ((Activity) this.LJLIL.getValue(), activity.getIntent());
        C56662Kg.LIZ().LJFF("method_create_calculate_newuser_value", false);
        C56662Kg.LIZ().LIZJ("method_create_welcome_duration", false);
        int LJFF = (int) EF7.LJFF();
        C54293LSn c54293LSn = C235779Nd.LIZ;
        if (c54293LSn.LIZ == null) {
            c54293LSn.LIZ = new C36821Ecj<>("last_app_version_code", 0);
        }
        Integer lastVersion = c54293LSn.LIZ.LIZ();
        o.LJIIIIZZ(lastVersion, "lastVersion");
        if (LJFF > lastVersion.intValue()) {
            Keva.getRepo("repo_new_version_journey").storeBoolean("key_new_version", true);
            Keva repo = Keva.getRepo("repo_story_cold_start");
            if (repo.getBoolean("key_new_user", false)) {
                repo.storeBoolean("key_new_user", false);
            } else {
                repo.storeBoolean("key_new_version", true);
            }
        }
        C38986FRu.LIZ();
        C38986FRu.LIZIZ(activity.getIntent());
        if (C38986FRu.LIZ().LIZ()) {
            c38985FRt.LIZJ(activity, true, false);
        }
        C56662Kg.LIZ().LJFF("method_create_welcome_duration", false);
        C38986FRu.LIZ();
        C38986FRu.LIZIZ(activity.getIntent());
        C56662Kg.LIZ().LJFF("main_act_user_guide_observe", false);
    }

    @Override // X.C8W0
    public final void onPause() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        super.onPause();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window = LIZ.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(FNR.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        if (E1J.LIZ()) {
            v3();
        }
    }
}
