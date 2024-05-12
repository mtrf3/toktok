package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.AEY;
import X.AI8;
import X.AI9;
import X.AIF;
import X.AV1;
import X.ActivityC86117Xqz;
import X.C188727au;
import X.C221108m2;
import X.C223338pd;
import X.C252709vu;
import X.C41289GIj;
import X.C41290GIk;
import X.C41291GIl;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C68322mC;
import X.FMX;
import X.GJ7;
import Y.ACListenerS27S0100000_7;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class AdPersonalizationActivity extends ActivityC86117Xqz {
    public C252709vu LJLIL;
    public AdFreeSubscription LJLILLLLZI;
    public ConstraintLayout LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public AI8 LJLJLLL;
    public TuxTextView LJLL;
    public AI8 LJLLI;
    public AI8 LJLLILLLL;
    public AI8 LJLLJ;
    public AI8 LJLLL;
    public AI8 LJLLLL;
    public TuxTextView LJLLLLLL;
    public AI8 LJLZ;
    public AI8 LJZ;
    public TuxTextView LJZI;
    public AI8 LJZL;
    public AI8 LL;
    public C223338pd LLD;
    public User LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public ComplianceVM LLII;
    public final Map<Integer, View> LLIIII = new LinkedHashMap();
    public String LLFZ = "";
    public String LLI = "";
    public final C62822Ol8 LLIFFJFJJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 38));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIII).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    public final void LLII() {
        AI8 ai8 = this.LJLLI;
        if (ai8 != null) {
            o.LJII(ai8.getAccessory(), "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            LLFII(!((AEY) r1).LJIIL());
            this.LLFF = true;
            return;
        }
        o.LJIJI("personalizationAdItem");
        throw null;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.LLFII) {
            boolean z = false;
            if (this.LLFF) {
                Intent intent = new Intent();
                intent.putExtra("result", 0);
                setResult(10, intent);
            } else {
                if (C41290GIk.LIZ() == 1) {
                    z = true;
                }
                LLFII(z);
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_to", this.LLI);
            c188727au.LJFF(LLIIIILZ(), "pa_toggle_final_status");
            FMX.LJIIL("exit_personalize_data", c188727au.LIZ);
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_to", "privacy_and_safety_settings");
        c188727au2.LJFF(LLIIIILZ(), "pa_toggle_final_status");
        FMX.LJIIL("exit_personalize_data", c188727au2.LIZ);
        finish();
    }

    public static Integer LLIIIILZ() {
        int LIZJ;
        if (C41290GIk.LJIIIIZZ()) {
            LIZJ = C41290GIk.LIZ();
        } else {
            LIZJ = C41290GIk.LIZJ();
        }
        return Integer.valueOf(LIZJ);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        Boolean enableToggleDecoupling;
        Boolean isFollowSystemConfig;
        int i;
        C65803Ps7.LIZLLL(this);
        super.onResume();
        if (!TextUtils.isEmpty(this.LLFZ)) {
            if (C41290GIk.LJIIIIZZ()) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", this.LLFZ);
                c188727au.LJFF(LLIIIILZ(), "pa_toggle_initial_status");
                FMX.LJIIL("show_personalize_data", c188727au.LIZ);
            } else {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", this.LLI);
                if (this.LLFFF) {
                    i = -1;
                } else if (C41290GIk.LIZJ() == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                c188727au2.LIZLLL(i, "toggle_initial_status");
                FMX.LJIIL("show_personalized_data_revamped", c188727au2.LIZ);
            }
            this.LLFZ = "";
        }
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null && (isFollowSystemConfig = LIZIZ.isFollowSystemConfig()) != null && isFollowSystemConfig.booleanValue()) {
            GJ7.LIZ(this, new C41291GIl(this));
            return;
        }
        AdPersonalitySettings LIZIZ2 = C41290GIk.LIZIZ();
        if (LIZIZ2 != null && (enableToggleDecoupling = LIZIZ2.getEnableToggleDecoupling()) != null && enableToggleDecoupling.booleanValue()) {
            GJ7.LIZ(this, null);
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, java.lang.Object] */
    public final void LLFII(boolean z) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        PersonalizationViewModel personalizationViewModel = (PersonalizationViewModel) this.LLIFFJFJJ.getValue();
        Integer valueOf = Integer.valueOf(z ? 1 : 0);
        personalizationViewModel.getClass();
        if (AV1.LJIILLIIL()) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        C68322mC c68322mC2 = new C68322mC();
        JSONArray jSONArray = new JSONArray();
        if (valueOf != null) {
            String str5 = "on";
            if (C41290GIk.LJIIIIZZ()) {
                jSONArray.put(new JSONObject().put("field", "pers_ad_main_mode").put("value", valueOf.toString()));
                c68322mC.element = personalizationViewModel.hv0().getValue();
                personalizationViewModel.hv0().setValue(valueOf);
                C188727au c188727au = new C188727au();
                if (valueOf.intValue() != 1) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
                c188727au.LJIIIZ("initial_status", str2);
                if (valueOf.intValue() == 1) {
                    str3 = "on";
                } else {
                    str3 = "off";
                }
                c188727au.LJIIIZ("final_status", str3);
                FMX.LJIIL("change_personalization_status", c188727au.LIZ);
                C188727au c188727au2 = new C188727au();
                if (valueOf.intValue() != 1) {
                    str4 = "on";
                } else {
                    str4 = "off";
                }
                c188727au2.LJIIIZ("initial_status", str4);
                if (valueOf.intValue() != 1) {
                    str5 = "off";
                }
                c188727au2.LJIIIZ("final_status", str5);
                FMX.LJIIL("click_pa_settings_toggle", c188727au2.LIZ);
                if (valueOf.intValue() == 1) {
                    C188727au c188727au3 = new C188727au();
                    c188727au3.LJIIIZ("enter_from", "personalization_data");
                    FMX.LJIIL("personalized_ads_on", c188727au3.LIZ);
                } else {
                    C188727au c188727au4 = new C188727au();
                    c188727au4.LJIIIZ("enter_from", "personalization_data");
                    FMX.LJIIL("personalized_ads_off", c188727au4.LIZ);
                }
            } else {
                jSONArray.put(new JSONObject().put("field", "pers_ad_unified_mode").put("value", valueOf.toString()));
                c68322mC2.element = ((LiveData) personalizationViewModel.LJLJI.getValue()).getValue();
                ((LiveData) personalizationViewModel.LJLJI.getValue()).setValue(valueOf);
                C188727au c188727au5 = new C188727au();
                int i2 = 0;
                if (valueOf.intValue() != 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                c188727au5.LIZLLL(i, "initial_status");
                if (valueOf.intValue() == 1) {
                    i2 = 1;
                }
                c188727au5.LIZLLL(i2, "final_status");
                FMX.LJIIL("change_personalized_status_revamped", c188727au5.LIZ);
                C188727au c188727au6 = new C188727au();
                if (valueOf.intValue() != 1) {
                    str = "on";
                } else {
                    str = "off";
                }
                c188727au6.LJIIIZ("initial_status", str);
                if (valueOf.intValue() != 1) {
                    str5 = "off";
                }
                c188727au6.LJIIIZ("final_status", str5);
                FMX.LJIIL("click_pa_settings_toggle", c188727au6.LIZ);
            }
        }
        IComplianceSettingsService gv0 = personalizationViewModel.gv0();
        String jSONArray2 = jSONArray.toString();
        o.LJIIIIZZ(jSONArray2, "json.toString()");
        gv0.LJIILL(jSONArray2, new C41289GIj(valueOf, personalizationViewModel, c68322mC, c68322mC2));
    }

    public final void LLFZ(boolean z) {
        boolean z2;
        AdPersonalitySettings LIZIZ;
        Integer showInterestItemType;
        AdPersonalitySettings LIZIZ2 = C41290GIk.LIZIZ();
        if (LIZIZ2 != null) {
            z2 = o.LJ(LIZIZ2.getShowInterestLabel(), Boolean.FALSE);
        } else {
            z2 = false;
        }
        if (!z2 && z && ((LIZIZ = C41290GIk.LIZIZ()) == null || (showInterestItemType = LIZIZ.getShowInterestItemType()) == null || showInterestItemType.intValue() != 1)) {
            AI8 ai8 = this.LJLLILLLL;
            if (ai8 != null) {
                ai8.setVisibility(0);
                AI8 ai82 = this.LJLLILLLL;
                if (ai82 != null) {
                    AI9 accessory = ai82.getAccessory();
                    o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
                    ((AIF) accessory).LJIILJJIL(new ACListenerS27S0100000_7(this, 7));
                    return;
                }
                o.LJIJI("interestItem");
                throw null;
            }
            o.LJIJI("interestItem");
            throw null;
        }
        AI8 ai83 = this.LJLLILLLL;
        if (ai83 != null) {
            ai83.setVisibility(8);
        } else {
            o.LJIJI("interestItem");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0608  */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 2745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.AdPersonalizationActivity.onCreate(android.os.Bundle):void");
    }
}
