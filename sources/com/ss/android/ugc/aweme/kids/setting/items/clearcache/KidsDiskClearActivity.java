package com.ss.android.ugc.aweme.kids.setting.items.clearcache;

import X.AEM;
import X.AI8;
import X.AI9;
import X.AbstractC73672Svk;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C37291EkJ;
import X.C5H3;
import X.C62905OmT;
import X.C62906OmU;
import X.C65803Ps7;
import X.C73969T1h;
import X.C76800UCe;
import X.C8IC;
import X.C9KF;
import X.EnumC221088m0;
import X.GD6;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.SY4;
import X.T16;
import Y.ACListenerS27S0100000_7;
import Y.ACListenerS42S0200000_7;
import Y.AfS17S1200000_7;
import Y.AfS56S0200000_7;
import Y.IDCListenerS160S0100000_7;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class KidsDiskClearActivity extends ActivityC86117Xqz {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final boolean LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public KidsDiskClearActivity() {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLIL = C221108m2.LIZ(enumC221088m0, new AqS157S0100000_7(this, 130));
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS157S0100000_7(this, 132));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS157S0100000_7(this, 131));
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new AqS157S0100000_7(this, 129));
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS157S0100000_7(this, 134));
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, new AqS157S0100000_7(this, 133));
        this.LJLJL = true;
    }

    public final void LJIJ() {
        C8IC c8ic = (C8IC) this.LJLJJLL.getValue();
        if (c8ic == null) {
            return;
        }
        c8ic.setVisibility(8);
    }

    public final AI8 LLFZ() {
        return (AI8) this.LJLIL.getValue();
    }

    public final AI8 LLII() {
        return (AI8) this.LJLJI.getValue();
    }

    public final AI8 LLIIIILZ() {
        return (AI8) this.LJLILLLLZI.getValue();
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        View view = (View) this.LJLJJLL.getValue();
        if (view != null && view.getVisibility() == 0) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r12 = this;
            X.C65803Ps7.LIZLLL(r12)
            java.lang.String r6 = "com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity"
            java.lang.String r5 = "onResume"
            r2 = 1
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r6, r5, r2)
            super.onResume()
            X.AI8 r1 = r12.LLFZ()
            r0 = 2131844852(0x7f115ef4, float:1.9323108E38)
            java.lang.String r0 = r12.getString(r0)
            r1.setTitle(r0)
            X.AI8 r0 = r12.LLFZ()
            java.lang.String r8 = "itemCleanDraft"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r8)
            r0.setLoading(r2)
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            com.ss.android.ugc.aweme.services.external.IAVDraftService r3 = r0.draftService()
            X.GPK r1 = new X.GPK
            r0 = 5
            r4 = 0
            r11 = 0
            r1.<init>(r4, r2, r11, r0)
            X.AVg r0 = r3.queryDraftsInfo(r1)
            int r0 = r0.LIZ
            X.AI8 r1 = r12.LLFZ()
            r10 = 8
            if (r0 > 0) goto L10b
            r0 = 8
        L48:
            r1.setVisibility(r0)
            X.5H3 r0 = r12.LJLJJI
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            X.AI8 r0 = r12.LLFZ()
            int r0 = r0.getVisibility()
            r1.setVisibility(r0)
            X.AI8 r1 = r12.LLIIIILZ()
            r0 = 2131844866(0x7f115f02, float:1.9323137E38)
            java.lang.String r0 = r12.getString(r0)
            r1.setTitle(r0)
            X.AI8 r0 = r12.LLIIIILZ()
            java.lang.String r7 = "itemCleanTemp"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r7)
            r0.setLoading(r2)
            X.AI8 r1 = r12.LLII()
            r0 = 2131844847(0x7f115eef, float:1.9323098E38)
            java.lang.String r0 = r12.getString(r0)
            r1.setTitle(r0)
            X.AI8 r0 = r12.LLII()
            java.lang.String r3 = "itemCleanResource"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            r0.setLoading(r2)
            java.util.List r1 = X.P8H.LJIIJ()
            java.lang.String r2 = "RESOURCE"
            if (r1 == 0) goto La2
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Le7
        La2:
            r9 = 0
        La3:
            X.AI8 r0 = r12.LLII()
            if (r9 > 0) goto Le5
        La9:
            r0.setVisibility(r10)
            X.5H3 r0 = r12.LJLJJL
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            X.AI8 r0 = r12.LLII()
            int r0 = r0.getVisibility()
            r1.setVisibility(r0)
            X.AI8 r1 = r12.LLFZ()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r8)
            java.lang.String r0 = "DRAFT"
            r12.LLIIJLIL(r1, r0)
            X.AI8 r1 = r12.LLIIIILZ()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r7)
            java.lang.String r0 = "CACHE"
            r12.LLIIJLIL(r1, r0)
            X.AI8 r0 = r12.LLII()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            r12.LLIIJLIL(r0, r2)
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r6, r5, r4)
            return
        Le5:
            r10 = 0
            goto La9
        Le7:
            java.util.Iterator r1 = r1.iterator()
            r9 = 0
        Lec:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r1.next()
            X.EkE r0 = (X.InterfaceC37286EkE) r0
            if (r0 == 0) goto L109
            java.lang.String r0 = r0.LJ()
        Lfe:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto Lec
            int r9 = r9 + 1
            if (r9 < 0) goto L10e
            goto Lec
        L109:
            r0 = r11
            goto Lfe
        L10b:
            r0 = 0
            goto L48
        L10e:
            X.C47261Igj.LJJJJIZL()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity.onResume():void");
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

    public static void LLIIIJ(AI8 ai8) {
        AI9 accessory = ai8.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Button");
        ((AEM) accessory).LIZIZ.setButtonVariant(1);
        ai8.setClickable(true);
    }

    public final String LLFII(String str) {
        boolean LJ = o.LJ(str, "DRAFT");
        Float valueOf = Float.valueOf(0.0f);
        if (LJ) {
            String string = getString(R.string.qx9, valueOf);
            o.LJIIIIZZ(string, "getString(R.string.setti…rage_mgmt_drafts_2, 0.0f)");
            return string;
        }
        if (o.LJ(str, "CACHE")) {
            String string2 = getString(R.string.qxn, valueOf);
            o.LJIIIIZZ(string2, "getString(R.string.setti…gmt_storage_temp_2, 0.0f)");
            return string2;
        }
        String string3 = getString(R.string.qx4, valueOf);
        o.LJIIIIZZ(string3, "getString(R.string.setti…e_mgmt_downloads_2, 0.0f)");
        return string3;
    }

    public final void exit(View view) {
        o.LJIIIZ(view, "view");
        finish();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onCreate", true);
        activityConfiguration(GD6.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bf7);
        C252709vu c252709vu = (C252709vu) findViewById(R.id.l_2);
        C9KF c9kf = new C9KF();
        String string = getString(R.string.gmb);
        o.LJIIIIZZ(string, "getString(R.string.free_up_space)");
        c9kf.LIZJ = string;
        c252709vu.LJIILLIIL(c9kf);
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_arrow_left_ltr;
        c234529Ii.LIZIZ(new AqS157S0100000_7(this, 543));
        c252709vu.LIZJ(c234529Ii);
        c252709vu.LJIILJJIL(true);
        AI8 itemCleanTemp = LLIIIILZ();
        o.LJIIIIZZ(itemCleanTemp, "itemCleanTemp");
        LLIIIJ(itemCleanTemp);
        AI8 itemCleanResource = LLII();
        o.LJIIIIZZ(itemCleanResource, "itemCleanResource");
        LLIIIJ(itemCleanResource);
        AI8 itemCleanDraft = LLFZ();
        o.LJIIIIZZ(itemCleanDraft, "itemCleanDraft");
        LLIIIJ(itemCleanDraft);
        AI8 itemCleanTemp2 = LLIIIILZ();
        o.LJIIIIZZ(itemCleanTemp2, "itemCleanTemp");
        LLIIIZ(itemCleanTemp2, new AqS156S0100000_6(this, 111));
        AI8 itemCleanResource2 = LLII();
        o.LJIIIIZZ(itemCleanResource2, "itemCleanResource");
        LLIIIZ(itemCleanResource2, new AqS156S0100000_6(this, 112));
        AI8 itemCleanDraft2 = LLFZ();
        o.LJIIIIZZ(itemCleanDraft2, "itemCleanDraft");
        LLIIIZ(itemCleanDraft2, new AqS157S0100000_7(this, 542));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onCreate", false);
    }

    public final void LLIIIZ(AI8 ai8, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        SY4 sy4;
        View findViewById;
        AI9 accessory = ai8.getAccessory();
        View view = null;
        if (accessory != null) {
            view = accessory.LJ();
        }
        if ((view instanceof SY4) && (sy4 = (SY4) view) != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS42S0200000_7(sy4, interfaceC65784Pro, 4));
            if (this.LJLJL && (findViewById = ai8.findViewById(R.id.b86)) != null) {
                C16880lQ.LJIIJ(new ACListenerS27S0100000_7(sy4, 24), findViewById);
            }
        }
    }

    public final void LLIIJI(int i, InterfaceC88471Ynr<Object, Object, C76800UCe> interfaceC88471Ynr) {
        C62905OmT c62905OmT = new C62905OmT(this);
        c62905OmT.LIZ(i);
        c62905OmT.LJIIJ(R.string.qx0, new IDCListenerS160S0100000_7(interfaceC88471Ynr, 4));
        c62905OmT.LJII(R.string.cg_, null);
        c62905OmT.LJII = true;
        try {
            new C62906OmU(c62905OmT).LIZLLL();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LLIIJLIL(AI8 ai8, String str) {
        AbstractC73672Svk.LJJIJIL(this).LJJL(T16.LIZ()).LJJIJL(new C37291EkJ(this, str)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0200000_7(this, ai8, 10), new AfS17S1200000_7(this, str, ai8, 2));
    }
}
