package com.ss.android.ugc.trill.setting;

import X.ABB;
import X.ABC;
import X.ABD;
import X.ABE;
import X.ABF;
import X.ABG;
import X.ABH;
import X.ABI;
import X.ABK;
import X.ABL;
import X.ABM;
import X.ABO;
import X.ABZ;
import X.AEB;
import X.AEG;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C25848ACm;
import X.C25849ACn;
import X.C25851ACp;
import X.C25859ACx;
import X.C25860ACy;
import X.C34011DWl;
import X.C52263KfD;
import X.C53150KtW;
import X.C53326KwM;
import X.C53379KxD;
import X.C62822Ol8;
import X.C78840Uwu;
import X.C79045V0n;
import X.C85895XnP;
import X.C85999Xp5;
import X.C86034Xpe;
import X.HG3;
import X.InterfaceC61213O0r;
import X.InterfaceC85901XnV;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.translation.service.ITranslationKevaService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class DisplayAndCaptionSettingPage extends BasePage implements InterfaceC85901XnV {
    public String LJLJI;
    public C25860ACy LJLJJLL;
    public C25860ACy LJLJL;
    public AEG LJLJLJ;
    public C25860ACy LJLJLLL;
    public C25860ACy LJLL;
    public C25849ACn LJLLI;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public final String LJLJJI = "settings_page";
    public String LJLJJL = "";
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(ABM.LJLIL);
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 975));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cka;
    }

    public final C25851ACp Al() {
        return (C25851ACp) this.LJLLJ.getValue();
    }

    public final void Dl() {
        C25860ACy c25860ACy = this.LJLJLLL;
        if (c25860ACy != null) {
            c25860ACy.LJIIJ(ABF.LJLIL);
        }
        AEG aeg = this.LJLJLJ;
        if (aeg != null) {
            aeg.LJIIJ(ABK.LJLIL);
        }
        C25860ACy c25860ACy2 = this.LJLJL;
        if (c25860ACy2 != null) {
            c25860ACy2.LJIIJ(ABB.LJLIL);
            C25860ACy c25860ACy3 = this.LJLL;
            if (c25860ACy3 != null) {
                c25860ACy3.LJIIJ(ABD.LJLIL);
            }
            C25849ACn c25849ACn = this.LJLLI;
            if (c25849ACn != null) {
                c25849ACn.LJIIJ(ABC.LJLIL);
            }
            boolean isLogin = HG3.LJIILL().isLogin();
            if (C53150KtW.LIZ() && !isLogin) {
                AEG aeg2 = this.LJLJLJ;
                if (aeg2 != null) {
                    aeg2.LJIIJ(ABL.LJLIL);
                }
                C25860ACy c25860ACy4 = this.LJLJLLL;
                if (c25860ACy4 != null) {
                    c25860ACy4.LJIIJ(ABG.LJLIL);
                }
                C25860ACy c25860ACy5 = this.LJLJL;
                if (c25860ACy5 != null) {
                    c25860ACy5.LJIIJ(ABH.LJLIL);
                    C25860ACy c25860ACy6 = this.LJLL;
                    if (c25860ACy6 != null) {
                        c25860ACy6.LJIIJ(ABI.LJLIL);
                    }
                    C25849ACn c25849ACn2 = this.LJLLI;
                    if (c25849ACn2 != null) {
                        c25849ACn2.LJIIJ(ABE.LJLIL);
                        return;
                    }
                    return;
                }
                o.LJIJI("preferredLanguageUnit");
                throw null;
            }
            return;
        }
        o.LJIJI("preferredLanguageUnit");
        throw null;
    }

    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        C25860ACy c25860ACy;
        List<ContentLanguage> list = pushSettings.translationLanguage;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (C53379KxD.LIZIZ()) {
            C25860ACy c25860ACy2 = this.LJLJL;
            if (c25860ACy2 != null) {
                c25860ACy2.LJIIJ(new AqS135S0200000_4(this, pushSettings, 117));
            } else {
                o.LJIJI("preferredLanguageUnit");
                throw null;
            }
        }
        ContentLanguage contentLanguage = pushSettings.selectedTranslationLanguage;
        if (contentLanguage != null) {
            this.LJLJI = contentLanguage.getLanguageCode();
            C25860ACy c25860ACy3 = this.LJLJLLL;
            if (c25860ACy3 != null) {
                c25860ACy3.LJIIJ(new AqS170S0100000_4(contentLanguage, 855));
            }
            SharePrefCache.inst().getSelectedTranslationLanguage().LIZLLL(contentLanguage.getLanguageCode());
        } else {
            this.LJLJI = "empty";
            C25860ACy c25860ACy4 = this.LJLJLLL;
            if (c25860ACy4 != null) {
                c25860ACy4.LJIIJ(new AqS170S0100000_4(this, 856));
            }
        }
        C25860ACy c25860ACy5 = this.LJLJLLL;
        if (c25860ACy5 != null) {
            c25860ACy5.LJIIJ(new AqS135S0200000_4(this, pushSettings, 118));
        }
        ABO.LIZ(C85999Xp5.LIZIZ(), this.LJLJI);
        if (pushSettings.selectedDoNotTranslate == null || (c25860ACy = this.LJLL) == null) {
            return;
        }
        c25860ACy.LJIIJ(new AqS135S0200000_4(this, pushSettings, 119));
    }

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        ABO.LIZ(C85999Xp5.LIZIZ(), "");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        int i;
        int i2;
        Intent intent;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string3 = getString(R.string.hpn);
        o.LJIIIIZZ(string3, "getString(R.string.language_item)");
        C78840Uwu.LJJIZ(c235119Kp, string3, new AqS154S0100000_4(this, 974));
        c252709vu.setNavActions(c235119Kp);
        C85895XnP c85895XnP = new C85895XnP();
        c85895XnP.LJLILLLLZI = this;
        c85895XnP.LJIILL(new Object[0]);
        C86034Xpe.LIZIZ.providePushSettingFetchPresenter();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "enter_method");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            this.LJLJJL = LLJJIJIIJIL;
        }
        C25851ACp Al = Al();
        String string4 = getString(R.string.r05);
        String LIZIZ = SettingServiceImpl.LIZ().getCurrentI18nItem(getContext()).LIZIZ();
        String string5 = getString(R.string.bre);
        o.LJIIIIZZ(string4, "getString(R.string.settings_app_language)");
        C25860ACy c25860ACy = new C25860ACy(new C25859ACx(string4, null, null, null, false, null, null, LIZIZ, true, false, null, string5, false, false, null, null, null, 8384126));
        this.LJLJJLL = c25860ACy;
        Al.LIZ(c25860ACy);
        C25860ACy c25860ACy2 = this.LJLJJLL;
        if (c25860ACy2 != null) {
            c25860ACy2.LJIIJ(new AqS170S0100000_4(this, 1603));
            C25851ACp Al2 = Al();
            String string6 = getString(R.string.hpt);
            String string7 = getString(R.string.hpv);
            o.LJIIIIZZ(string6, "getString(R.string.langu…etting_onboarding_title3)");
            C25860ACy c25860ACy3 = new C25860ACy(new C25859ACx(string6, null, null, null, false, null, null, null, true, false, null, string7, false, false, null, null, null, 8384254));
            this.LJLJL = c25860ACy3;
            Al2.LIZ(c25860ACy3);
            if (!C34011DWl.LIZ() && !C53326KwM.LIZ()) {
                C25851ACp Al3 = Al();
                String string8 = getString(R.string.hq0);
                o.LJIIIIZZ(string8, "getString(R.string.language_setting_translate_sec)");
                AEG aeg = new AEG(new AEB(string8, true, false, false, false, null, null, null, null, null, null, 16380));
                this.LJLJLJ = aeg;
                Al3.LIZ(aeg);
                if (C53150KtW.LIZ()) {
                    string = getString(R.string.daq);
                } else {
                    string = getString(R.string.qgg);
                }
                o.LJIIIIZZ(string, "if (CLACombineCaptionEnt…refer_lang)\n            }");
                C25851ACp Al4 = Al();
                if (C53379KxD.LIZIZ() || ABZ.LIZ == 2) {
                    string2 = getString(R.string.hq2);
                } else {
                    string2 = getString(R.string.qgh);
                }
                C25860ACy c25860ACy4 = new C25860ACy(new C25859ACx(string, null, null, null, false, null, null, "", true, false, null, string2, false, false, null, null, null, 8384126));
                this.LJLJLLL = c25860ACy4;
                Al4.LIZ(c25860ACy4);
                C25851ACp Al5 = Al();
                String string9 = getString(R.string.dar);
                String string10 = getString(R.string.db0);
                o.LJIIIIZZ(string9, "getString(R.string.claCo…nHideSelectionMenu_title)");
                C25860ACy c25860ACy5 = new C25860ACy(new C25859ACx(string9, null, null, null, false, null, null, "", true, false, null, string10, false, false, null, null, null, 8384126));
                this.LJLL = c25860ACy5;
                Al5.LIZ(c25860ACy5);
                C25851ACp Al6 = Al();
                boolean LIZLLL = ((ITranslationKevaService) this.LJLLILLLL.getValue()).LIZLLL();
                if (C52263KfD.LIZ()) {
                    i = R.string.j_h;
                } else {
                    i = R.string.bo1;
                }
                String string11 = getString(i);
                o.LJIIIIZZ(string11, "getString(\n             …                        )");
                if (C52263KfD.LIZ()) {
                    i2 = R.string.j_g;
                } else {
                    i2 = R.string.bo2;
                }
                C25849ACn c25849ACn = new C25849ACn(new C25848ACm(LIZLLL, string11, null, false, null, null, null, getString(i2), false, false, false, null, 64508));
                this.LJLLI = c25849ACn;
                Al6.LIZ(c25849ACn);
                C25849ACn c25849ACn2 = this.LJLLI;
                if (c25849ACn2 != null) {
                    c25849ACn2.LJIIJ(new AqS170S0100000_4(this, 1604));
                }
            }
            Dl();
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            Integer LJI = C79045V0n.LJI(R.attr.c9, context);
            if (LJI != null) {
                LJI.intValue();
                view.setBackgroundColor(LJI.intValue());
                C252709vu c252709vu2 = (C252709vu) view.findViewById(R.id.la4);
                c252709vu2.LJIILJJIL(false);
                c252709vu2.setNavBackground(LJI.intValue());
            }
            Al().LIZLLL();
            return;
        }
        o.LJIJI("appLanguageUnit");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            super.onActivityResult(r9, r10, r11)
            r2 = 0
            r5 = -1
            if (r10 != r5) goto L8d
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r9 != r0) goto L8f
            com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage.LJLLL = r2
            if (r11 == 0) goto La2
            java.lang.String r0 = "updated_language_name"
            java.lang.String r3 = X.C16880lQ.LLJJIJIIJIL(r11, r0)
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L1f
            int r0 = r3.length()
            if (r0 != 0) goto L30
        L1f:
            if (r11 == 0) goto La2
            java.lang.String r0 = "updated_language_code"
            java.lang.String r1 = X.C16880lQ.LLJJIJIIJIL(r11, r0)
            java.lang.String r0 = "updated_language_is_refreshing_needed"
            boolean r0 = r11.getBooleanExtra(r0, r7)
            if (r0 != 0) goto L3f
            return
        L30:
            X.ACy r2 = r8.LJLJLLL
            if (r2 == 0) goto L1f
            kotlin.jvm.internal.AqS29S1000000_4 r1 = new kotlin.jvm.internal.AqS29S1000000_4
            r0 = 21
            r1.<init>(r3, r0)
            r2.LJIIJ(r1)
            goto L1f
        L3f:
            if (r1 == 0) goto La2
            int r0 = r1.length()
            if (r0 != 0) goto L48
            goto La2
        L48:
            r8.LJLJI = r1
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            X.Ecj r0 = r0.getSelectedTranslationLanguage()
            r0.LIZLLL(r1)
            boolean r0 = X.C41032G8m.LIZ()
            if (r0 == 0) goto L7f
            android.app.Activity[] r4 = com.ss.android.ugc.aweme.utils.ActivityStack.getActivityStack()
            int r3 = r4.length
            int r3 = r3 - r7
        L61:
            if (r5 >= r3) goto La2
            r2 = r4[r3]
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "Main"
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r6)
            if (r0 == 0) goto L7b
            r2.recreate()
        L78:
            int r3 = r3 + (-1)
            goto L61
        L7b:
            r2.finish()
            goto L78
        L7f:
            X.YGb r1 = X.C43286Gyo.LIZ
            android.content.Context r0 = r8.getContext()
            r1.getClass()
            X.C87093YGb.LIZLLL(r0)
            goto La2
        L8d:
            if (r10 != r5) goto La3
        L8f:
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r9 != r0) goto La5
            boolean r0 = X.C53379KxD.LIZIZ()
            if (r0 == 0) goto La2
            X.ACy r1 = r8.LJLJL
            if (r1 == 0) goto Lba
            X.AAj r0 = X.C25793AAj.LJLIL
            r1.LJIIJ(r0)
        La2:
            return
        La3:
            if (r10 != r5) goto La2
        La5:
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r9 != r0) goto La2
            X.AAn r0 = com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage.LJLJLJ
            r0.getClass()
            com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage.LJLJLLL = r2
            X.ACy r1 = r8.LJLL
            if (r1 == 0) goto La2
            X.AAk r0 = X.C25794AAk.LJLIL
            r1.LJIIJ(r0)
            goto La2
        Lba:
            java.lang.String r0 = "preferredLanguageUnit"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage.onActivityResult(int, int, android.content.Intent):void");
    }
}
