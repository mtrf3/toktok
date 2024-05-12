package com.ss.android.ugc.aweme.main.assems;

import X.ActivityC45651qj;
import X.C10K;
import X.C116694i1;
import X.C16880lQ;
import X.C212428Vi;
import X.C22690un;
import X.C2300291a;
import X.C2K0;
import X.C34710Djm;
import X.C36093EEn;
import X.C38850FMo;
import X.C38995FSd;
import X.C39078FVi;
import X.C3SZ;
import X.C40406FtS;
import X.C46538IOg;
import X.C53295Kvr;
import X.C53976LGi;
import X.C55096Ljo;
import X.C55247LmF;
import X.C55374LoI;
import X.C55511LqV;
import X.C55723Ltv;
import X.C56662Kg;
import X.C56672Kh;
import X.C61200O0e;
import X.C61878OQg;
import X.C62814Ol0;
import X.C84193Sd;
import X.C84763XOl;
import X.C88053Yh7;
import X.C8DO;
import X.C9WK;
import X.EE1;
import X.EEU;
import X.EEZ;
import X.EF7;
import X.EnumC36092EEm;
import X.EnumC54052LJg;
import X.F9J;
import X.FET;
import X.HG3;
import X.IUI;
import X.IUJ;
import X.InterfaceC36571c5;
import X.InterfaceC53971LGd;
import X.InterfaceC55058LjC;
import X.InterfaceC55102Lju;
import X.InterfaceC55251LmJ;
import X.J9P;
import X.LIJ;
import X.LKB;
import X.LKR;
import X.LMU;
import X.LNZ;
import X.LRD;
import X.LUP;
import X.LYD;
import X.OSJ;
import X.RBX;
import X.RunnableC37185Eib;
import X.RunnableC54337LUf;
import X.Z89;
import X.Z8A;
import Y.IDCallableS414S0100000;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl;
import com.bytedance.keva.KevaCacheManager;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.ChangeTabProtocol;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import n59.m0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class MainActivityBusinessAssem extends BaseMainContainerAssem implements MainBusinessAbility, MainActivityGlobalAbility, InterfaceC55102Lju {
    public String LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI = true;
    public boolean LJLJJI;
    public boolean LJLJJL;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b7, code lost:
    
        if (kotlin.jvm.internal.o.LJ("user/homepage", X.X1D.LIZIZ(r0)) != false) goto L25;
     */
    @Override // X.C8W0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            r8 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Class<com.ss.android.ugc.aweme.main.assems.MainActivityBusinessAssem> r0 = com.ss.android.ugc.aweme.main.assems.MainActivityBusinessAssem.class
            java.lang.String r0 = X.C16880lQ.LJLLJ(r0)
            r6 = 0
            r1[r6] = r0
            java.lang.String r0 = "onCreate"
            r7 = 1
            r1[r7] = r0
            java.lang.String r0 = "main_act_assem_lifecycle_%s_%s"
            java.lang.String r5 = X.C16880lQ.LLLZ(r0, r1)
            X.FAM r0 = X.C56662Kg.LIZ()
            r0.LIZJ(r5, r6)
            super.onCreate()
            r8.LJLJJI = r7
            com.bytedance.provider.impl.GScope r3 = com.bytedance.provider.impl.GScope.LJLIL
            java.lang.Class<com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility> r0 = com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility.class
            r4 = 0
            X.C55096Ljo.LJIIJJI(r3, r8, r0, r4)
            X.1qj r0 = X.C212428Vi.LIZ(r8)
            if (r0 == 0) goto Lde
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto Lde
            java.lang.String r0 = "pre_mainactivity_first_enter"
            boolean r0 = r1.getBooleanExtra(r0, r6)
        L3e:
            r8.LJLILLLLZI = r0
            X.LUP r2 = new X.LUP
            r7 = r7 ^ r0
            r2.<init>(r7)
            java.lang.Class<X.LUP> r1 = X.LUP.class
            java.lang.String r0 = "source_default_key"
            X.C55247LmF.LIZIZ(r3, r2, r1, r0)
            X.LNZ r0 = X.LNZ.LIZIZ
            X.LUN r0 = r0.getHomePageBusiness()
            r0.LIZJ()
            X.1qj r0 = X.C212428Vi.LIZ(r8)
            if (r0 == 0) goto L62
            android.content.Intent r3 = r0.getIntent()
            if (r3 != 0) goto L8d
        L62:
            X.Ol8 r0 = X.DNF.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L79
            java.util.concurrent.ExecutorService r1 = X.C38995FSd.LJFF()
            X.LUO r0 = X.LUO.LJLIL
            r1.execute(r0)
        L79:
            X.1qj r0 = X.C212428Vi.LIZ(r8)
            if (r0 == 0) goto L83
            java.lang.Class r4 = r0.getClass()
        L83:
            X.C78855Ux9.LJLJI = r4
            X.FAM r0 = X.C56662Kg.LIZ()
            r0.LJFF(r5, r6)
            return
        L8d:
            android.net.Uri r2 = r3.getData()
            if (r2 == 0) goto L62
            java.lang.String r7 = r2.getHost()
            java.lang.String r1 = r2.getPath()
            java.lang.String r0 = "mine"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)
            if (r0 != 0) goto Lb9
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r7)
            r0.append(r1)
            java.lang.String r1 = X.X1D.LIZIZ(r0)
            java.lang.String r0 = "user/homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L62
        Lb9:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L62
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"
            java.lang.String r0 = "USER"
            r3.putExtra(r1, r0)
            java.lang.String r0 = "from_scene"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r0)
            java.lang.String r0 = "profile_from_scene"
            if (r1 != 0) goto Lda
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r0)
        Lda:
            r3.putExtra(r0, r1)
            goto L62
        Lde:
            r0 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.MainActivityBusinessAssem.onCreate():void");
    }

    @Override // X.C8W0
    public final void onResume() {
        InterfaceC55251LmJ LIZLLL;
        LUP lup;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(MainActivityBusinessAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        this.LJLJI = false;
        if (!this.LJLILLLLZI && (LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, LUP.class, "source_default_key")) != null && (lup = (LUP) LIZLLL.getSource()) != null) {
            lup.LJLIL = true;
        }
        this.LJLILLLLZI = false;
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 391341784) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility
    public final boolean Tl0() {
        LUP lup;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, LUP.class, "source_default_key");
        if (LIZLLL != null && (lup = (LUP) LIZLLL.getSource()) != null) {
            return lup.LJLIL;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final String nH() {
        String str = this.LJLIL;
        if (str == null) {
            return getEnterFrom();
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean CP() {
        return TextUtils.equals("HOME", C116694i1.LIZ(C212428Vi.LIZ(this)).nv0());
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean E2() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return false;
        }
        return LRD.LIZ(LIZ).LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean Gm() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return false;
        }
        TabChangeManager LIZ2 = C116694i1.LIZ(LIZ);
        if (!o.LJ("DISCOVER", LIZ2.nv0()) && !o.LJ("FRIENDS_TAB", LIZ2.nv0()) && (!C53295Kvr.LIZIZ() || !o.LJ("Following", LIZ2.nv0()))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean H40() {
        MainActivity mainActivity;
        AdHomePageDataVM adHomePageDataVM;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ instanceof MainActivity) {
            mainActivity = (MainActivity) LIZ;
        } else {
            mainActivity = null;
        }
        if (mainActivity == null || (adHomePageDataVM = mainActivity.adHomePageDataVM) == null) {
            return false;
        }
        return adHomePageDataVM.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean K0() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return false;
        }
        return LRD.LIZ(LIZ).LJ();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void S5() {
        ActivityC45651qj LIZ;
        ((IPerformanceAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), IPerformanceAbility.class)).uf(new AqS159S0100000_9(this, 283));
        C36093EEn.LIZ.getClass();
        if (EEZ.LIZIZ != EEU.COLD_BOOT_BEGIN) {
            EEZ.LIZIZ = EEU.HOT_BOOT_BEGIN;
        }
        C56672Kh.LIZ().LIZLLL("main_act_create_commit_preload_layout");
        if (!((Boolean) C34710Djm.LJJJJL.getValue()).booleanValue() && (LIZ = C212428Vi.LIZ(this)) != null) {
            LNZ.LIZIZ.getX2CInflateCommitter().LIZ(LIZ);
            C39078FVi.LIZ();
            FET.LIZLLL(LIZ);
        }
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "main_act_create_commit_preload_layout");
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final String XU() {
        String LJJLIIIJJI;
        FeedFragment w2;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return "";
        }
        TabChangeManager LIZ2 = C116694i1.LIZ(LIZ);
        String lv0 = Hox.LJLLI.LIZ(LIZ).lv0();
        if (!TextUtils.isEmpty(lv0)) {
            return lv0;
        }
        if (TextUtils.isEmpty(LIZ2.nv0())) {
            return "homepage_hot";
        }
        String nv0 = LIZ2.nv0();
        if (TextUtils.equals(nv0, "HOME")) {
            Fragment mv0 = LIZ2.mv0();
            if ((mv0 instanceof MainFragment) && (w2 = ((MainFragment) mv0).w2()) != null) {
                if (w2 instanceof FeedFollowFragment) {
                    return "homepage_follow";
                }
                if (w2 instanceof FeedRecommendFragment) {
                    return "homepage_hot";
                }
                if (w2 instanceof FeedPopularFragment) {
                    return "homepage_popular";
                }
                if (w2 instanceof LKB) {
                    String str = w2.LJLJI;
                    o.LJIIIIZZ(str, "f.eventType");
                    return str;
                }
                if (w2 instanceof LIJ) {
                    return "homepage_friends";
                }
                if (w2 instanceof C8DO) {
                    return "homepage_nearby";
                }
                String enterFrom = w2.getEnterFrom();
                if (enterFrom != null && enterFrom.length() != 0) {
                    String enterFrom2 = w2.getEnterFrom();
                    o.LJIIIIZZ(enterFrom2, "f.enterFrom");
                    return enterFrom2;
                }
            }
        } else {
            if (TextUtils.equals(nv0, "DISCOVER")) {
                return "discovery";
            }
            if (TextUtils.equals(nv0, "FRIENDS_TAB")) {
                IFriendsTabLayoutAbility LIZJ = C53976LGi.LIZJ(LIZ);
                if (LIZJ == null || (LJJLIIIJJI = LIZJ.LJJLIIIJJI()) == null) {
                    return "";
                }
                return LJJLIIIJJI;
            }
            if (TextUtils.equals(nv0, "Following")) {
                return "homepage_follow";
            }
            if (TextUtils.equals(nv0, "NOTIFICATION")) {
                return "notification_page";
            }
            if (TextUtils.equals(nv0, "USER")) {
                if (Z8A.LIZIZ.isI18nUserProfileFragmentV2(LIZ2.mv0())) {
                    return "others_homepage";
                }
                if (LIZ2.mv0() instanceof InterfaceC53971LGd) {
                    InterfaceC36571c5 mv02 = LIZ2.mv0();
                    o.LJII(mv02, "null cannot be cast to non-null type com.ss.android.ugc.aweme.metrics.EventParam");
                    String enterFrom3 = ((InterfaceC53971LGd) mv02).getEnterFrom();
                    o.LJIIIIZZ(enterFrom3, "param.enterFrom");
                    return enterFrom3;
                }
                return "personal_homepage";
            }
            if (TextUtils.equals(nv0, "homepage_explore")) {
                return "homepage_explore";
            }
        }
        return "homepage_hot";
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final String fu0() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return null;
        }
        return C3SZ.LIZ(LIZ).LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final Aweme getCurrentAweme() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return null;
        }
        return C3SZ.LIZ(LIZ).LJLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final String getEnterFrom() {
        InterfaceC55058LjC interfaceC55058LjC;
        String enterFrom;
        InterfaceC36571c5 LIZ = C212428Vi.LIZ(this);
        if (LIZ == null || !(LIZ instanceof InterfaceC55058LjC) || (interfaceC55058LjC = (InterfaceC55058LjC) LIZ) == null || (enterFrom = interfaceC55058LjC.getEnterFrom()) == null) {
            return "";
        }
        return enterFrom;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean isADShowing() {
        MainActivity mainActivity;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (!(LIZ instanceof MainActivity) || (mainActivity = (MainActivity) LIZ) == null) {
            return false;
        }
        return mainActivity.isADShowing();
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void n30() {
        this.LJLIL = getEnterFrom();
    }

    @Override // X.C8W0
    public final void onDestroy() {
        ViewModelStore viewModelStore;
        super.onDestroy();
        LNZ.LIZIZ.getX2CInflateCommitter().LIZIZ();
        if (C84763XOl.LJIIJJI) {
            C46538IOg.LIZ = true;
            C46538IOg.LIZIZ = 0L;
        }
        C55723Ltv.LIZIZ.clear();
        LYD.LIZ.getClass();
        LYD.LIZIZ = null;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (viewModelStore = LIZ.getViewModelStore()) != null) {
            viewModelStore.clear();
        }
        if (C88053Yh7.LIZ() != 0) {
            C2300291a.LIZ.LIZ(new RunnableC37185Eib(RunnableC54337LUf.LJLIL));
        }
        ((ArrayList) C38850FMo.LIZ).clear();
        GScope gScope = GScope.LJLIL;
        C55096Ljo.LJIILL(gScope, MainActivityGlobalAbility.class, null);
        C55247LmF.LJ(gScope, LUP.class, "source_default_key");
        Z89.LIZIZ.LJIILLIIL();
    }

    @Override // X.C8W0
    public final void onPause() {
        LUP lup;
        super.onPause();
        this.LJLJI = true;
        C56662Kg.LIZ().LIZLLL = false;
        C46538IOg.LIZ = false;
        if (!IUJ.LIZIZ) {
            IUJ.LIZIZ = true;
            C84763XOl.LJI().LJJJJZI(IUI.LJLIL);
        }
        try {
            if (C9WK.LIZ > 0) {
                C9WK.LIZ(System.currentTimeMillis() - C9WK.LIZ, C9WK.LIZIZ, "background");
            }
        } catch (Throwable unused) {
        }
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, LUP.class, "source_default_key");
        if (LIZLLL == null || (lup = (LUP) LIZLLL.getSource()) == null) {
            return;
        }
        lup.LJLIL = false;
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        C56662Kg.LIZ().LIZLLL = false;
        C46538IOg.LIZ = false;
        C40406FtS.LIZ.LIZIZ = false;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && !C22690un.LIZ) {
            C10K.LIZIZ(new IDCallableS414S0100000(C16880lQ.LLLLL(LIZ), 6), C38995FSd.LIZLLL(), null);
        }
        ((m0) ServiceManager.get().getService(m0.class)).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean qI() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return false;
        }
        ScrollSwitchStateManager LIZ2 = C84193Sd.LIZ(LIZ);
        if (!CP() || !TextUtils.equals("page_feed", LIZ2.hv0())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean s90() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return false;
        }
        return LKR.LIZIZ(LIZ, "NOTIFICATION");
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean c80() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean o60() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final boolean D30(Context context) {
        return context instanceof MainActivity;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intent intent;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(MainActivityBusinessAssem.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            Intent intent2 = LIZ.getIntent();
            try {
                str = C16880lQ.LLJJIJIIJIL(intent2, "id");
            } catch (Throwable unused) {
                str = null;
            }
            try {
                C16880lQ.LLJJIJIIJIL(intent2, "insert_relation");
            } catch (Throwable unused2) {
            }
            try {
                str2 = C16880lQ.LLJJIJIIJIL(intent2, "ids");
            } catch (Throwable unused3) {
                str2 = null;
            }
            try {
                str3 = C16880lQ.LLJJIJIIJIL(intent2, "push_params");
            } catch (Throwable unused4) {
                str3 = null;
            }
            try {
                str4 = C16880lQ.LLJJIJIIJIL(intent2, "push_id");
            } catch (Throwable unused5) {
                str4 = null;
            }
            try {
                str5 = C16880lQ.LLJJIJIIJIL(intent2, "gd_label");
            } catch (Throwable unused6) {
                str5 = null;
            }
            LMU lmu = C3SZ.LIZ(LIZ).LJLIL;
            lmu.LIZIZ = str;
            lmu.LIZJ = str2;
            lmu.LIZLLL = str3;
            lmu.LJ = str4;
            lmu.LJFF = str5;
            lmu.LIZ = intent2.getIntExtra("extra_push_flag", 0);
            String string = F9J.LIZIZ(EF7.LIZIZ(), 0, "applog_stats").getString("app_track", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    C61200O0e.LIZLLL().LJI(LIZ, new JSONObject(string).optString("openurl"));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            if (bundle != null) {
                HomePageDataViewModel LIZ2 = C3SZ.LIZ(LIZ);
                bundle.getBoolean("should_show_slide_setting");
                LIZ2.getClass();
            }
            ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
            if (LIZ3 != null) {
                ActivityC45651qj LIZ4 = C212428Vi.LIZ(this);
                if (LIZ4 != null && (intent = LIZ4.getIntent()) != null) {
                    str6 = C16880lQ.LLJJIJIIJIL(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                } else {
                    str6 = null;
                }
                if (TextUtils.isEmpty(str6)) {
                    str6 = "HOME";
                } else if (str6 == null) {
                    str6 = "HOME";
                }
                if (!o.LJ("HOME", str6)) {
                    C55511LqV.LJIIL(LIZ3, true);
                }
                if (o.LJ("NOTIFICATION", str6) && !((RBX) HG3.LJIILL()).isLogin()) {
                    J9P.LIZIZ(LIZ3, getEnterFrom(), "click_message", null, null);
                } else {
                    if (o.LJ("DISCOVER", str6)) {
                        C84193Sd.LIZ(LIZ3).tv0(false);
                    }
                    if (bundle == null) {
                        Intent intent3 = LIZ3.getIntent();
                        o.LJIIIIZZ(intent3, "activity.intent");
                        v3(intent3, EnumC54052LJg.COLD_BOOT, str6);
                    }
                }
            }
            C56662Kg.LIZ().LJFF(LLLZ, false);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void E50(String str, boolean z) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C84193Sd.LIZ(LIZ).E50("page_feed", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        if (z && z2) {
            C36093EEn c36093EEn = C36093EEn.LIZ;
            C55374LoI c55374LoI = C55374LoI.LIZIZ;
            EE1 LJ = c55374LoI.LJ();
            c36093EEn.getClass();
            C36093EEn.LJ(LJ);
            C36093EEn.LJ(c55374LoI.LIZ());
        }
        C36093EEn c36093EEn2 = C36093EEn.LIZ;
        EnumC36092EEm enumC36092EEm = EnumC36092EEm.ONWINDOWS_FOCUSCHANGE;
        c36093EEn2.getClass();
        C36093EEn.LJIIIIZZ(enumC36092EEm);
        this.LJLJJL = false;
        if (z && z2) {
            this.LJLJJL = true;
            KevaCacheManager.getInstance().startDelayClearCache();
            UserAccountImpl.LIZIZ().LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void Tn(Intent intent, EnumC54052LJg scene, String str) {
        o.LJIIIZ(scene, "scene");
        v3(intent, scene, str);
    }

    @Override // com.ss.android.ugc.aweme.base.MainBusinessAbility
    public final void VU(ActivityC45651qj activityC45651qj, String str, Object data) {
        MainActivity mainActivity;
        DataCenter dataCenter;
        o.LJIIIZ(data, "data");
        if ((activityC45651qj instanceof MainActivity) && (mainActivity = (MainActivity) activityC45651qj) != null && (dataCenter = mainActivity.mDataCenter) != null) {
            dataCenter.jv0(data, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        HomePageDataViewModel LIZ;
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null && (LIZ = C3SZ.LIZ(LIZ2)) != null) {
            ((LiveData) LIZ.LJLLJ.getValue()).setValue(new OSJ(Integer.valueOf(i), Integer.valueOf(i2), intent));
            return false;
        }
        return false;
    }

    public final void v3(Intent intent, EnumC54052LJg enumC54052LJg, String str) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("fromStart", "MainPage");
        if (!o.LJ("HOME", str)) {
            List LJIJ = C62814Ol0.LJIJ(C55096Ljo.LJIIZILJ(this), ChangeTabProtocol.class);
            if (LJIJ == null) {
                LJIJ = C61878OQg.INSTANCE;
            }
            Iterator it = LJIJ.iterator();
            while (it.hasNext()) {
                if (((ChangeTabProtocol) it.next()).m0(LIZ, intent, str, enumC54052LJg)) {
                    return;
                }
            }
        }
        Hox.LJLLI.LIZ(LIZ).Cv0(bundle, str);
    }
}
