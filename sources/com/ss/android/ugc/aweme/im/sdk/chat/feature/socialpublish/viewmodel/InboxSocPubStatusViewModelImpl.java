package com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel;

import X.AbstractC73946T0k;
import X.C09G;
import X.C100363wm;
import X.C30I;
import X.C3L2;
import X.C3L3;
import X.C3L4;
import X.C53708L6a;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73582SuI;
import X.C73893SzJ;
import X.C78999UzT;
import X.EnumC53695L5n;
import X.HG3;
import X.InterfaceC100393wp;
import X.L61;
import X.T16;
import Y.IDhS94S0100000_1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.model.DMSocPubStatus;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.model.DmNowQueryConfigSettings;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InboxSocPubStatusViewModelImpl extends ViewModel implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public static final Set<String> LJLJL = new CopyOnWriteArraySet();
    public final C30I LJLIL;
    public final C73893SzJ<String> LJLILLLLZI;
    public final Set<String> LJLJI;
    public final Map<String, EnumC53695L5n> LJLJJI;
    public final Set<String> LJLJJL;
    public final C73318Sq2 LJLJJLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    public InboxSocPubStatusViewModelImpl() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        DmNowQueryConfigSettings.DmNowQueryConfigModel config = DmNowQueryConfigSettings.LIZ;
        DmNowQueryConfigSettings.DmNowQueryConfigModel dmNowQueryConfigModel = (DmNowQueryConfigSettings.DmNowQueryConfigModel) LIZLLL.LJIIIIZZ("dm_now_query_config", DmNowQueryConfigSettings.DmNowQueryConfigModel.class, config);
        config = dmNowQueryConfigModel != null ? dmNowQueryConfigModel : config;
        C30I c30i = new C30I() { // from class: X.30H
            @Override // X.C30I
            public final C73579SuF LIZ(final List userIDs) {
                o.LJIIIZ(userIDs, "userIDs");
                return AbstractC73638SvC.LJI(new InterfaceC66992k3() { // from class: X.2k2
                    @Override // X.InterfaceC66992k3
                    public final void subscribe(InterfaceC65052gv<List<DMSocPubStatus>> interfaceC65052gv) {
                        C30H c30h = C30H.this;
                        List<String> list = userIDs;
                        c30h.getClass();
                        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
                            C78983UzD.LJIILL("DMNowStatusRepositoryImpl: send request in main thread");
                        }
                        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C65042gu(interfaceC65052gv, list, null), 3);
                    }
                });
            }
        };
        C73893SzJ<String> c73893SzJ = new C73893SzJ<>();
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        o.LJIIIIZZ(abstractC73946T0k, "computation()");
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        o.LJIIIZ(config, "config");
        this.LJLIL = c30i;
        this.LJLILLLLZI = c73893SzJ;
        this.LJLJI = copyOnWriteArraySet;
        this.LJLJJI = new LinkedHashMap();
        this.LJLJJL = new LinkedHashSet();
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLJJLL = c73318Sq2;
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(new C73582SuI(c73893SzJ.LJFF(config.nowQueryCheckInterval, TimeUnit.MILLISECONDS, abstractC73946T0k, config.nowQueryOnceMaxSize).LJJIFFI(HG3.LJLJJLL), new IDhS94S0100000_1(this, 11)), C100363wm.LJLIL, null, new AqS167S0100000_1(this, 410), 2), c73318Sq2);
    }

    public final void hv0(List<? extends C3L4> list) {
        String str;
        o.LJIIIZ(list, "list");
        this.LJLJI.clear();
        for (C3L4 c3l4 : list) {
            if ((c3l4 instanceof C3L3) && !(c3l4 instanceof C3L2)) {
                C3L3 c3l3 = (C3L3) c3l4;
                if (c3l3.LJIJI() != null) {
                    String[] strArr = new String[1];
                    IMUser LJIJI = c3l3.LJIJI();
                    if (LJIJI == null || (str = LJIJI.getUid()) == null) {
                        str = "";
                    }
                    strArr[0] = str;
                    gv0(strArr, true);
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        this.LJLJJLL.LIZLLL();
        this.LJLJJL.clear();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    public static void jv0(InterfaceC100393wp interfaceC100393wp, IMUser iMUser) {
        if (iMUser == null || interfaceC100393wp == null) {
            return;
        }
        User user = IMUser.toUser(iMUser);
        user.setStoryStatus(C53708L6a.LIZIZ.LIZ(L61.STORY, user.getUid()));
        interfaceC100393wp.LJI(user);
    }

    public final void gv0(String[] queryList, boolean z) {
        o.LJIIIZ(queryList, "queryList");
        for (String str : queryList) {
            this.LJLILLLLZI.onNext(str);
            if (z) {
                this.LJLJI.add(str);
            }
            ((CopyOnWriteArraySet) LJLJL).add(str);
        }
    }

    public final void iv0(String str, boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) LJLJL;
        if (copyOnWriteArraySet.contains(str)) {
            return;
        }
        this.LJLILLLLZI.onNext(str);
        if (z) {
            this.LJLJI.add(str);
        }
        copyOnWriteArraySet.add(str);
    }
}
