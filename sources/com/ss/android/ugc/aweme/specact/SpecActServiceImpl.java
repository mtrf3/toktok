package com.ss.android.ugc.aweme.specact;

import X.AbstractC247499nV;
import X.C03880Dg;
import X.C0JU;
import X.C0MT;
import X.C10K;
import X.C16880lQ;
import X.C19N;
import X.C243649hI;
import X.C243669hK;
import X.C243709hO;
import X.C245559kN;
import X.C247249n6;
import X.C247509nW;
import X.C247609ng;
import X.C247659nl;
import X.C247669nm;
import X.C247679nn;
import X.C247689no;
import X.C247979oH;
import X.C249389qY;
import X.C249479qh;
import X.C249559qp;
import X.C249589qs;
import X.C249609qu;
import X.C249849rI;
import X.C249879rL;
import X.C249979rV;
import X.C250089rg;
import X.C250129rk;
import X.C250139rl;
import X.C250279rz;
import X.C250329s4;
import X.C250349s6;
import X.C250379s9;
import X.C250429sE;
import X.C250549sQ;
import X.C250729si;
import X.C250979t7;
import X.C25570A1u;
import X.C26399AXr;
import X.C2MW;
import X.C37724ErI;
import X.C38778FJu;
import X.C38995FSd;
import X.C39519Ff9;
import X.C40896G3g;
import X.C46323IFz;
import X.C58096Mr6;
import X.C58310MuY;
import X.C60827Nu3;
import X.C60828Nu4;
import X.C61878OQg;
import X.C62198Ob4;
import X.C65300Pk0;
import X.C95I;
import X.C95J;
import X.C95U;
import X.CallableC25935AFv;
import X.EnumC245179jl;
import X.F9J;
import X.IG0;
import X.InterfaceC243719hP;
import X.InterfaceC247459nR;
import X.InterfaceC249899rN;
import X.InterfaceC249909rO;
import X.InterfaceC250059rd;
import X.InterfaceC56322M8o;
import X.InterfaceC92693kP;
import X.JF1;
import X.ORS;
import X.X1D;
import X.YAI;
import Y.ACallableS77S0101000_4;
import Y.ARunnableS40S0100000_4;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.feed.IFeedSpecActService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.specact.model.NowShareModel$NowPostIncentiveSharePanelData;
import com.ss.android.ugc.aweme.specact.touchpoints.popup.DynamicPopupTask;
import com.ss.android.ugc.aweme.ug.settings.SparkPreloadModel;
import com.ss.android.ugc.aweme.ug.settings.SparkReUseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS63S0400000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class SpecActServiceImpl implements ISpecActService, IFeedSpecActService {
    public static final /* synthetic */ int LIZLLL = 0;
    public final ARunnableS40S0100000_4 LIZIZ = new ARunnableS40S0100000_4(this, 75);
    public boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LIZ() {
        InterfaceC249909rO LJJI;
        C250279rz.LIZ = null;
        C249849rI.LIZJ();
        Iterator it = ((ArrayList) C249849rI.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC250059rd) it.next()).LIZ();
        }
        SpecActPendantManager LIZ = C247669nm.LIZ();
        if (LIZ.LJLIL != null && (LJJI = LIZ.LJJI()) != null && LJJI.LJIJJLI() && LJJI.LJJIJ()) {
            C250349s6.LIZJ++;
            if ((!C250349s6.LIZLLL || !C250349s6.LJ) && !LJJI.LJJIJIL()) {
                Iterator<InterfaceC249899rN> it2 = C250349s6.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC249899rN next = it2.next();
                    if (next.LIZJ() == LJJI.LJIJ() && !(next instanceof C250429sE) && !(next instanceof C250379s9)) {
                        if (next.LIZJ()) {
                            if (!C250349s6.LJ && next.LIZ(LJJI, C250349s6.LIZJ)) {
                                C250349s6.LJ = true;
                                break;
                            }
                        } else if (!C250349s6.LIZLLL && next.LIZ(LJJI, C250349s6.LIZJ)) {
                            C250349s6.LIZLLL = true;
                            break;
                        }
                    }
                }
            }
        }
        if (C250139rl.LIZLLL) {
            C250139rl.LIZLLL = false;
            C250139rl.LIZJ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJ() {
        C247679nn.LIZ().getClass();
        if (!C249479qh.LJJIIJ()) {
            C247679nn.LIZ().getClass();
            if (!C249479qh.LJJIIJZLJL()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x012b, code lost:
    
        if (r5 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0127, code lost:
    
        if (r5 != null) goto L66;
     */
    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.SpecActServiceImpl.LJFF():void");
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJIILL() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("need_call_user_agreement_and_ugc_popup", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIFFI() {
    }

    public static ISpecActService LJJJIL() {
        Object LIZ = C58096Mr6.LIZ(ISpecActService.class, false);
        if (LIZ != null) {
            return (ISpecActService) LIZ;
        }
        if (C58096Mr6.h7 == null) {
            synchronized (ISpecActService.class) {
                if (C58096Mr6.h7 == null) {
                    C58096Mr6.h7 = new SpecActServiceImpl();
                }
            }
        }
        return C58096Mr6.h7;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LIZIZ() {
        C26399AXr.LIZIZ.getValue().getClass();
        C247609ng.LIZIZ.getValue().getClass();
        C95I.LIZ().getClass();
        C243669hK.LIZ().LIZJ = 0;
        InterfaceC92693kP interfaceC92693kP = C243669hK.LIZ().LIZIZ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LIZJ = false;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LIZLLL() {
        LJJJJ(EnumC245179jl.TYPE_LOGOUT);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJI() {
        LJJJJ(EnumC245179jl.TYPE_SWITCH);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIIIZ() {
        LJJJJ(EnumC245179jl.TYPE_LOGIN);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIIJJI() {
        String str;
        String str2;
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        C249879rL c249879rL = C249879rL.LIZ;
        c249879rL.getClass();
        SparkPreloadModel LIZ = C249879rL.LIZ();
        if (LIZ == null || (str = LIZ.biz) == null) {
            str = "spark_default_preload_biz";
        }
        c60827Nu3.getClass();
        C60827Nu3.LJIIL(str);
        C60828Nu4 c60828Nu4 = C37724ErI.LIZIZ;
        c249879rL.getClass();
        SparkReUseModel LIZIZ = C249879rL.LIZIZ();
        if (LIZIZ == null || (str2 = LIZIZ.biz) == null) {
            str2 = "spark_default_reuse_biz";
        }
        c60828Nu4.getClass();
        C60828Nu4.LJFF(str2);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJIIL() {
        C249879rL.LIZ.getClass();
        SparkPreloadModel LIZ = C249879rL.LIZ();
        if (LIZ != null) {
            return LIZ.splitWebviewInit;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIILJJIL() {
        C10K.LIZJ(new Callable() { // from class: X.9hR
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                Object obj;
                Object obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("fyp_vv_count", String.valueOf(C249979rV.LIZLLL));
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null) {
                    str = abstractC247499nV.LJIIJ();
                } else {
                    str = null;
                }
                linkedHashMap.put("region", str);
                linkedHashMap.put("cold_start_cnt", String.valueOf(C249979rV.LIZJ));
                String str2 = "1";
                if (C247509nW.LIZIZ()) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_login", obj);
                TouchPoint LIZJ = C2MW.LIZ().LIZJ(4, null);
                TouchPoint LIZJ2 = C2MW.LIZ().LIZJ(8, null);
                if (LIZJ != null) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("has_popup", obj2);
                if (LIZJ2 == null) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("has_feedbanner", str2);
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR == null) {
                    return null;
                }
                interfaceC247459nR.LIZIZ("fyp_vv_count", linkedHashMap);
                return C76800UCe.LIZ;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIJJ() {
        if (C249979rV.LIZIZ) {
            C249979rV.LIZIZ = false;
        } else {
            C249979rV.LIZLLL++;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJI() {
        int i;
        String str;
        int i2;
        List list;
        List<String> list2;
        C60828Nu4 c60828Nu4 = C37724ErI.LIZIZ;
        C25570A1u c25570A1u = new C25570A1u();
        boolean z = false;
        if (C19N.LJ("incentive_preload_flag", false)) {
            C249879rL.LIZ.getClass();
            SparkReUseModel LIZIZ = C249879rL.LIZIZ();
            if (LIZIZ != null && LIZIZ.enable) {
                z = true;
            }
        }
        c25570A1u.LIZ = z;
        C249879rL c249879rL = C249879rL.LIZ;
        c249879rL.getClass();
        SparkReUseModel LIZIZ2 = C249879rL.LIZIZ();
        if (LIZIZ2 != null) {
            i = LIZIZ2.volumn;
        } else {
            i = Integer.MAX_VALUE;
        }
        c25570A1u.LIZJ = i;
        c249879rL.getClass();
        SparkReUseModel LIZIZ3 = C249879rL.LIZIZ();
        if (LIZIZ3 == null || (str = LIZIZ3.biz) == null) {
            str = "spark_default_reuse_biz";
        }
        c25570A1u.LIZLLL = str;
        SparkReUseModel LIZIZ4 = C249879rL.LIZIZ();
        if (LIZIZ4 != null) {
            i2 = LIZIZ4.expiredTimeInSeconds;
        } else {
            i2 = -1;
        }
        c25570A1u.LJ = i2;
        c25570A1u.LJFF = new AqS183S0100000_1(this, 47);
        c249879rL.getClass();
        SparkReUseModel LIZIZ5 = C249879rL.LIZIZ();
        if (LIZIZ5 == null || (list = LIZIZ5.allowSchemaList) == null) {
            list = C61878OQg.INSTANCE;
        }
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        String[] strArr = C250089rg.LIZ;
        String[] strArr2 = (String[]) LIZLLL2.LJIIIIZZ("incentive_reuse_urls", String[].class, strArr);
        if (strArr2 != null) {
            strArr = strArr2;
        }
        o.LJIIIZ(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + strArr.length);
        arrayList.addAll(list);
        ORS.LJJLIIIJJIZ(arrayList, strArr);
        c25570A1u.LJII = arrayList;
        c249879rL.getClass();
        SparkReUseModel LIZIZ6 = C249879rL.LIZIZ();
        if (LIZIZ6 == null || (list2 = LIZIZ6.denySchemaList) == null) {
            list2 = C61878OQg.INSTANCE;
        }
        c25570A1u.LJIIIIZZ = list2;
        c25570A1u.LJI = C250979t7.LJLIL;
        Boolean bool = Boolean.FALSE;
        c60828Nu4.getClass();
        C60828Nu4.LJ(c25570A1u, bool);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final C38778FJu LJJII() {
        return new C38778FJu();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIIJZLJL() {
        List<InterfaceC243719hP> list = C243709hO.LIZ;
        synchronized (list) {
            ((ArrayList) list).clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIIZ() {
        C10K.LIZIZ(CallableC25935AFv.LJLIL, C38995FSd.LIZIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIJIL() {
        boolean z;
        C247609ng.LIZIZ.getValue().getClass();
        if (C95J.LIZ != null) {
            C243649hI LIZ = C95I.LIZ();
            long j = LIZ.LIZ.getLong(LIZ.LIZIZ, 0L);
            if (j == 0) {
                return;
            }
            if (C245559kN.LIZ() == j) {
                z = true;
            } else {
                z = false;
            }
            if (!C249979rV.LJ && !z) {
                LIZ.LIZIZ(2);
            } else {
                if (LIZ.LIZJ) {
                    return;
                }
                LIZ.LIZIZ(9);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIJLIJ() {
        Activity LJII;
        ((C247979oH) C247979oH.LJLJLJ.getValue()).LJJI();
        C250549sQ LIZ = C247689no.LIZ();
        LIZ.getClass();
        try {
            if ((!((ArrayList) LIZ.LJLJJI).isEmpty()) && LIZ.LJJI()) {
                InAppPush inAppPush = (InAppPush) ListProtector.get(LIZ.LJLJJI, 0);
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null && (LJII = abstractC247499nV.LJII()) != null) {
                    LIZ.LJJIII(LJII, inAppPush);
                    ((ArrayList) LIZ.LJLJJI).remove(inAppPush);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJJJI() {
        return ((Keva) YAI.LIZIZ.getValue().LIZ.getValue()).getBoolean("use_local_time", false);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJJZI() {
        if (C249849rI.LIZJ) {
            C249849rI.LIZJ = false;
            C249849rI.LIZIZ.removeCallbacks(C249849rI.LJ);
        }
        Iterator it = ((ArrayList) C249849rI.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC250059rd) it.next()).LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIIIIZZ() {
        if (C250329s4.LIZ() && !this.LIZJ) {
            C26399AXr.LIZIZ.getValue().LIZ(1);
            this.LIZJ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJJIIZI() {
        return C250329s4.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJII() {
        return C247249n6.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final C46323IFz LJJIJ() {
        return IG0.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJJJL() {
        C249849rI.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final ARunnableS40S0100000_4 getAction() {
        return this.LIZIZ;
    }

    public static void LJJJJ(EnumC245179jl enumC245179jl) {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS40S0100000_4(enumC245179jl, 76));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIILIIL(boolean z) {
        C247689no.LIZ().LJLJJL = z;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIILLIIL(String url) {
        o.LJIIIZ(url, "url");
        if (s.LJJJLZIJ(url, "/activity/referral", false) || s.LJJJLZIJ(url, "/ug_activity_referral", false) || s.LJJJLZIJ(url, "/activity/armor", false)) {
            Uri uri = UriProtector.parse(url);
            o.LJIIIIZZ(uri, "uri");
            String lastPathSegment = uri.getLastPathSegment();
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                interfaceC247459nR.LIZIZ("leave_page_click", JF1.LIZIZ("position", lastPathSegment, "button_name", "client"));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIJ(Map<String, String> map) {
        C2MW.LIZ().getClass();
        C10K.LIZJ(new ACallableS77S0101000_4(map, 0, 2));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIJI(boolean z) {
        C247979oH c247979oH = (C247979oH) C247979oH.LJLJLJ.getValue();
        if (z) {
            c247979oH.LJLJI++;
        } else {
            c247979oH.LJLJI--;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIJJLI(Map<String, String> map) {
        C2MW.LIZ().getClass();
        C10K.LIZJ(new ACallableS77S0101000_4(map, 2, 2));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIJIIJI(String str) {
        SpecActPendantManager LIZ = C247669nm.LIZ();
        LIZ.getClass();
        LIZ.LJLLI = str;
        if (LIZ.LJLIL == null || !LIZ.LJJI().LJIJJLI()) {
            return;
        }
        LIZ.LJJI().LJJIFFI(LIZ.LJJJJ(), SpecActPendantManager.LJJIL());
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIJIIJIL(Context context) {
        List<ResolveInfo> queryIntentActivities;
        Context createPackageContext;
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "pref_name");
        if (!LIZIZ.getBoolean("pref_short_cut", false)) {
            String packageName = context.getPackageName();
            o.LJIIIIZZ(packageName, "context.packageName");
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(2097152);
            intent.addFlags(1048576);
            intent.setPackage(packageName);
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 1}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-6662535712112123554"));
            if (LIZJ.LIZ) {
                queryIntentActivities = (List) LIZJ.LIZIZ;
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(intent, 1);
            }
            o.LJIIIIZZ(queryIntentActivities, "pkgMag.queryIntentActivi…geManager.GET_ACTIVITIES)");
            int size = queryIntentActivities.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                ResolveInfo resolveInfo = (ResolveInfo) ListProtector.get(queryIntentActivities, i);
                if (o.LJ(resolveInfo.activityInfo.packageName, packageName)) {
                    String charSequence = resolveInfo.loadLabel(packageManager).toString();
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String str = activityInfo.name;
                    int i2 = activityInfo.applicationInfo.icon;
                    if (str != null) {
                        Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                        intent2.putExtra("android.intent.extra.shortcut.NAME", charSequence);
                        intent2.putExtra("duplicate", false);
                        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent.setComponent(new ComponentName(packageName, str)));
                        if (o.LJ(context.getPackageName(), packageName)) {
                            createPackageContext = context;
                        } else {
                            try {
                                createPackageContext = context.createPackageContext(packageName, 3);
                            } catch (PackageManager.NameNotFoundException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                        if (createPackageContext != null) {
                            intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, i2));
                        }
                        context.sendBroadcast(intent2);
                    }
                } else {
                    i++;
                }
            }
            LIZIZ.edit().putBoolean("pref_short_cut", true).apply();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIJL(Aweme aweme) {
        C250279rz.LIZ = aweme;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJJ(C40896G3g c40896G3g) {
        List<InterfaceC243719hP> list = C243709hO.LIZ;
        synchronized (list) {
            ((ArrayList) list).add(c40896G3g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.view.ViewGroup r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            boolean r0 = X.C250329s4.LIZ()
            r4 = 1
            if (r0 != 0) goto L90
            X.5H3<X.AXr> r0 = X.C26399AXr.LIZIZ
            java.lang.Object r1 = r0.getValue()
            X.AXr r1 = (X.C26399AXr) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.LIZ(r0)
        L16:
            com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager r3 = X.C247669nm.LIZ()
            androidx.lifecycle.LifecycleOwner r1 = r3.LJLJL
            if (r1 == 0) goto L8e
            android.view.ViewGroup r0 = r3.LJLJJLL
            if (r0 == 0) goto L8e
        L23:
            r2 = 0
            if (r4 == 0) goto L7d
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r7)
            if (r0 == 0) goto L69
        L2c:
        L2d:
            com.bytedance.touchpoint.core.redpacketpendant.manager.RedPacketPendantManager r1 = X.C247619nh.LIZ()
            android.view.ViewGroup r0 = r1.LJLIL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r6)
            if (r0 == 0) goto L40
            boolean r0 = r1.LJJIIZ()
            if (r0 == 0) goto L40
        L3f:
            return
        L40:
            androidx.lifecycle.LifecycleOwner r0 = r1.LJLILLLLZI
            if (r0 == 0) goto L4d
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L4d
            r0.removeObserver(r1)
        L4d:
            r1.LJLILLLLZI = r2
            r1.LJJIJIIJI()
            r1.LJLIL = r6
            androidx.lifecycle.Lifecycle r0 = r7.getLifecycle()
            if (r0 == 0) goto L5d
            r0.addObserver(r1)
        L5d:
            r1.LJLILLLLZI = r7
            boolean r0 = r1.LJJI()
            if (r0 == 0) goto L3f
            r1.LJJIIJZLJL()
            goto L3f
        L69:
            androidx.lifecycle.LifecycleOwner r0 = r3.LJLJL
            if (r0 == 0) goto L76
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L76
            r0.removeObserver(r3)
        L76:
            r3.LJLJL = r2
            r3.LJLJJLL = r2
            r3.LJJIJIIJIL()
        L7d:
            r3.LJLJL = r7
            r3.LJLJJLL = r6
            androidx.lifecycle.Lifecycle r0 = r7.getLifecycle()
            if (r0 == 0) goto L8a
            r0.addObserver(r3)
        L8a:
            r3.LJJIJIIJI()
            goto L2c
        L8e:
            r4 = 0
            goto L23
        L90:
            android.os.Handler r1 = X.C37179EiV.LIZ()
            Y.ARunnableS40S0100000_4 r0 = r5.LIZIZ
            r1.post(r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.SpecActServiceImpl.LIZJ(android.view.ViewGroup, androidx.fragment.app.Fragment):void");
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIIZILJ(String str, String str2) {
        boolean z;
        ActivityTask next;
        List<ActivityTask> list;
        C247679nn.LIZ().getClass();
        C249559qp c249559qp = (C249559qp) C249589qs.LJZ.getValue();
        c249559qp.getClass();
        List<ActivityTask> list2 = c249559qp.LJLJJI;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        String str3 = null;
        if (!z) {
            Iterator<ActivityTask> it = list2.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (o.LJ(next.taskKey, "like_comment_tribute")) {
                    break;
                }
            }
        }
        next = null;
        if (next != null) {
            c249559qp.LJLIL.storeBoolean(C247509nW.LIZ("do_like_or_comment_tribute_action"), true);
            if (c249559qp.LJLILLLLZI >= next.time) {
                if (!c249559qp.LJLIL.getBoolean(C247509nW.LIZ("has_report_like_and_comment_tribute"), false)) {
                    c249559qp.LJLJJL = null;
                    c249559qp.LJIILL(next);
                }
            } else {
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR != null) {
                    LinkedHashMap LIZ = C0JU.LIZ("task_name", str);
                    LIZ.put("task_id", next.taskKey);
                    interfaceC247459nR.LIZIZ("interact_task_complete", LIZ);
                }
            }
        }
        C249559qp c249559qp2 = (C249559qp) C249609qu.LJLLLLLL.getValue();
        c249559qp2.getClass();
        if (c249559qp2.LJLJL && (list = c249559qp2.LJLJJI) != null && !list.isEmpty()) {
            Iterator<ActivityTask> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityTask next2 = it2.next();
                if (o.LJ(next2.taskKey, "read_and_like_video")) {
                    c249559qp2.LJLIL.storeBoolean(C247509nW.LIZ("do_like_or_comment_action"), true);
                    C247659nl.LIZ.LIZ("true", C247509nW.LIZ("do_like_or_comment_action"));
                    if (c249559qp2.LJLILLLLZI >= next2.time) {
                        if (!c249559qp2.LJLIL.getBoolean(C247509nW.LIZ("has_report_read_and_like_task"), false)) {
                            c249559qp2.LJIILL(next2);
                        }
                    } else {
                        InterfaceC247459nR interfaceC247459nR2 = C95J.LIZ;
                        if (interfaceC247459nR2 != null) {
                            interfaceC247459nR2.LIZIZ("interact_task_complete", C0JU.LIZ("task_name", str));
                        }
                    }
                }
            }
        }
        C249389qY c249389qY = (C249389qY) C249389qY.LJZ.getValue();
        c249389qY.getClass();
        if (o.LJ(str, "like") && (!c249389qY.LJLJJI.isEmpty()) && c249389qY.LJLJL && !c249389qY.LJI()) {
            if (!((ArrayList) c249389qY.LJLLLLLL).contains(str2)) {
                ((ArrayList) c249389qY.LJLLLLLL).add(str2);
                c249389qY.LJLLLL++;
                if (c249389qY.LJLZ.length() != 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    str2 = C0MT.LIZ(LIZ2, c249389qY.LJLZ, ',', str2, LIZ2);
                }
                c249389qY.LJLZ = str2;
                c249389qY.LJLIL.storeString(C247509nW.LIZ("digg_video_id_list"), c249389qY.LJLZ);
                C247659nl.LIZ.LIZ(String.valueOf(c249389qY.LJLLLL), C247509nW.LIZ("referral_like_video_count"));
                if (c249389qY.LJI()) {
                    c249389qY.LJII();
                    if (c249389qY.LJLJJI.size() > 0) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("task_type", String.valueOf(((ActivityTask) ListProtector.get(c249389qY.LJLJJI, 0)).taskType));
                        linkedHashMap.put("task_key", ((ActivityTask) ListProtector.get(c249389qY.LJLJJI, 0)).taskKey);
                        linkedHashMap.put("activity_name", ((ActivityTask) ListProtector.get(c249389qY.LJLJJI, 0)).taskKey);
                        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                        if (abstractC247499nV != null) {
                            str3 = abstractC247499nV.LJIIJ();
                        }
                        linkedHashMap.put("region", str3);
                        linkedHashMap.put("lottery_cnt", String.valueOf(((ActivityTask) ListProtector.get(c249389qY.LJLJJI, 0)).awardCount));
                        Map<String, String> map = ((C95U) ListProtector.get(c249389qY.LJLJJI, 0)).LJ;
                        if (map != null) {
                            linkedHashMap.putAll(map);
                        }
                        InterfaceC247459nR interfaceC247459nR3 = C95J.LIZ;
                        if (interfaceC247459nR3 != null) {
                            interfaceC247459nR3.LIZIZ("timed_task_time_up", linkedHashMap);
                        }
                    }
                }
            }
            int i = c249389qY.LJLLLL;
            ActivityTask LJIIIIZZ = c249389qY.LJIIIIZZ();
            if (LJIIIIZZ != null && i == LJIIIIZZ.count) {
                C247689no.LIZ().LJJII(6, ((ActivityTask) ListProtector.get(c249389qY.LJLJJI, 0)).taskKey);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0089, code lost:
    
        if (r17.equals("others_homepage") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:20:0x002c, B:22:0x0038, B:23:0x003c, B:25:0x0042, B:27:0x004b, B:29:0x004f, B:31:0x0053, B:34:0x0067, B:36:0x006d, B:38:0x0073, B:43:0x009c, B:45:0x00a4, B:46:0x00a8, B:48:0x00ae, B:51:0x00ba, B:54:0x00c0, B:60:0x00d7, B:64:0x00e4, B:65:0x00e6, B:76:0x00ed, B:80:0x00f8, B:81:0x00fa, B:84:0x00c7, B:94:0x0117, B:100:0x0085, B:104:0x0090, B:105:0x0092, B:109:0x007a, B:113:0x010f, B:114:0x0106), top: B:19:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[LOOP:1: B:23:0x003c->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0103 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.touchpoint.core.model.TextLink LJIL(com.ss.android.ugc.aweme.feed.model.Aweme r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.SpecActServiceImpl.LJIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):com.bytedance.touchpoint.core.model.TextLink");
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final boolean LJJ(Activity activity, String str) {
        return C250129rk.LIZ.getBoolean(str, false);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIII(Context context, AqS63S0400000_3 aqS63S0400000_3) {
        C247249n6.LIZ(context, aqS63S0400000_3, null);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final C62198Ob4 LJJIIJ(Context context, NowShareModel$NowPostIncentiveSharePanelData sharePanelData) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePanelData, "sharePanelData");
        return new C62198Ob4(context, sharePanelData);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJIIJ(InterfaceC56322M8o interfaceC56322M8o, String sceneName, int i, boolean z) {
        o.LJIIIZ(sceneName, "sceneName");
        PopupManager.LJIIL(new DynamicPopupTask(interfaceC56322M8o, sceneName, i, z));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void LJJIZ(Context context, String url, String enterfrom, Map<String, String> map) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(enterfrom, "enterfrom");
        C250729si.LIZ(context, url, enterfrom, map, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c1, code lost:
    
        if (r1 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b5, code lost:
    
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:21:0x0030, B:23:0x0034, B:25:0x0038, B:27:0x0042, B:31:0x0058, B:33:0x0060, B:34:0x0065, B:36:0x006b, B:44:0x007a, B:55:0x00c3, B:58:0x00c8, B:60:0x00dc, B:62:0x00ee, B:66:0x010c, B:68:0x00b7, B:71:0x00bf, B:73:0x00b3, B:78:0x0049, B:79:0x004f), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0126  */
    @Override // com.ss.android.ugc.aweme.feed.IFeedSpecActService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(final android.content.Context r15, final com.bytedance.touchpoint.core.model.TextLink r16, com.ss.android.ugc.aweme.feed.model.Aweme r17, final kotlin.jvm.internal.AqS175S0100000_9 r18, final kotlin.jvm.internal.AqS191S0100000_9 r19) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.SpecActServiceImpl.LJJIL(android.content.Context, com.bytedance.touchpoint.core.model.TextLink, com.ss.android.ugc.aweme.feed.model.Aweme, kotlin.jvm.internal.AqS175S0100000_9, kotlin.jvm.internal.AqS191S0100000_9):void");
    }
}
