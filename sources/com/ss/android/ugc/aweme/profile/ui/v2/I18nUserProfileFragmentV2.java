package com.ss.android.ugc.aweme.profile.ui.v2;

import X.AW1;
import X.AW2;
import X.AWU;
import X.AWX;
import X.AWY;
import X.AX6;
import X.ActivityC45651qj;
import X.C0M6;
import X.C10120aW;
import X.C107794Kx;
import X.C119324mG;
import X.C173376rF;
import X.C175046tw;
import X.C1B3;
import X.C1E4;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C225318sp;
import X.C235079Kl;
import X.C235099Kn;
import X.C237259Sv;
import X.C25620zW;
import X.C26045AKb;
import X.C26175APb;
import X.C26335AVf;
import X.C26338AVi;
import X.C26374AWs;
import X.C28155B3f;
import X.C2U8;
import X.C30746C4w;
import X.C32151Nz;
import X.C34504DgS;
import X.C36922EeM;
import X.C37179EiV;
import X.C38350F3i;
import X.C38354F3m;
import X.C38995FSd;
import X.C3SZ;
import X.C4LD;
import X.C53299Kvv;
import X.C53487Kyx;
import X.C54081LKj;
import X.C54082LKk;
import X.C54502LaE;
import X.C54960Lhc;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56319M8l;
import X.C56483MEt;
import X.C56507MFr;
import X.C57022Lq;
import X.C57364MfI;
import X.C57368MfM;
import X.C58397Mvx;
import X.C61102aY;
import X.C62825OlB;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73353Sqb;
import X.C77357UXp;
import X.C78685UuP;
import X.C78926UyI;
import X.C7MY;
import X.C7YQ;
import X.C84193Sd;
import X.C8VC;
import X.C8VV;
import X.C8Z7;
import X.C9BD;
import X.C9BE;
import X.C9H6;
import X.C9IJ;
import X.C9PN;
import X.EnumC235129Kq;
import X.EnumC57365MfJ;
import X.EnumC87060YEu;
import X.FOH;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC55643Lsd;
import X.InterfaceC56322M8o;
import X.InterfaceC57508Mhc;
import X.InterfaceC87065YEz;
import X.L12;
import X.MF2;
import X.MFE;
import X.O6R;
import X.QD3;
import X.QX2;
import X.U26;
import X.X1D;
import X.YF0;
import Y.AObserverS83S0100000_15;
import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.UserPostApiPreloadApi;
import com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM;
import com.ss.android.ugc.aweme.relation.experiment.Config;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes16.dex */
public final class I18nUserProfileFragmentV2 extends Hilt_I18nUserProfileFragmentV2 implements InterfaceC235089Km, AW2, InterfaceC56322M8o, ProfileBaseAbility {
    public static final YF0 LLJJIJIIJIL = new YF0();
    public boolean LLFFF;
    public String LLFII;
    public String LLIFFJFJJ;
    public MutualStruct LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public boolean LLIIIL;
    public Aweme LLIIIZ;
    public int[] LLIL;
    public boolean LLILIL;
    public boolean LLILL;
    public String LLILLIZIL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public Integer LLILZLL;
    public int LLJIJIL;
    public C62825OlB LLJILJILJ;
    public final C214298b3 LLJJI;
    public AWU LLJJIII;
    public Map<Integer, View> LLJJIJI = new LinkedHashMap();
    public String LLFZ = "";
    public String LLI = "";
    public String LLII = "";
    public String LLIIJI = "";
    public String LLIIJLIL = "";
    public String LLIIL = "";
    public String LLIILII = "";
    public String LLIILZL = "";
    public String LLIIZ = "";
    public String LLILII = "";
    public boolean LLIZ = true;
    public EnumC87060YEu LLIZLLLIL = EnumC87060YEu.LOAD_IDLE;
    public String LLJ = "";
    public String LLJI = "";
    public String LLJILJIL = "";
    public final boolean LLJILLL = C235099Kn.LIZ();
    public I18nUserProfileFragmentV3 LLJJ = new I18nUserProfileFragmentV3();

    @Override // com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility
    public boolean L7() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public boolean Nl() {
        return false;
    }

    public void _$_clearFindViewByIdCache() {
        this.LLJJIJI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLJJIJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* bridge */ /* synthetic */ void em() {
    }

    @Override // X.InterfaceC55643Lsd
    public String getSceneId() {
        return "user_profile";
    }

    @Override // X.InterfaceC56322M8o
    public boolean needConflictWithParent() {
        return true;
    }

    @Override // X.InterfaceC235089Km, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public I18nUserProfileFragmentV2() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 813);
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileInfoVM.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ, 812);
        AW1 aw1 = AW1.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), aqS153S0100000_3, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), aw1, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), aqS153S0100000_3, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), aw1, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJJI = c214298b3;
    }

    private final void Dm() {
        User user;
        FragmentManager childFragmentManager;
        if (!C34504DgS.LIZ || (user = this.LJLL) == null || user.getUid() == null || this.LJLL.getSecUid() == null) {
            return;
        }
        String LIZ = C10120aW.LIZ("android:switcher:", R.id.jd2, ':');
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        Fragment fragment = null;
        if (LIZLLL != null && (childFragmentManager = LIZLLL.getChildFragmentManager()) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ);
            LIZ2.append('1');
            fragment = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ2));
        }
        C8Z7 c8z7 = (AwemeListFragmentImpl) fragment;
        Bundle bundle = new Bundle();
        int[] iArr = this.LLIL;
        if (iArr != null && iArr.length != 0) {
            bundle.putIntArray("traffic_source_list", iArr);
        }
        String str = this.LLJI;
        if (str != null && str.length() > 0) {
            bundle.putString("profile_enter_method", str);
        }
        String str2 = this.LLJ;
        if (str2 != null && str2.length() > 0) {
            bundle.putString("enter_from", str2);
        }
        String str3 = this.LLII;
        if (str3 != null && str3.length() > 0) {
            bundle.putString("rfevent_previous_page", str3);
        }
        if (c8z7 == null) {
            c8z7 = MTAwemeListFragment.Vm(-1, 0, om(), this.LJLILLLLZI, false, true, false, bundle);
        }
        c8z7.LJJJJ();
    }

    private final UserProfileInfoVM pm() {
        return (UserProfileInfoVM) this.LLJJI.getValue();
    }

    private final void qm() {
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LJLLL;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.LJLJJI = new C56507MFr(this);
        }
    }

    private final void ym() {
        try {
            cm("onViewCreated verify assem");
            ((InterfaceC235069Kk) C8VC.LIZJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class))).hh(this.LLJIJIL, EnumC235129Kq.CHANGE_TAB);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ProfileInfoService can't be find: ");
            LIZ.append(e);
            C36922EeM.LIZLLL(2, "I18nUserProfileFragmentV2", X1D.LIZIZ(LIZ));
            pm().kv0(this.LLJIJIL, EnumC235129Kq.CHANGE_TAB);
        }
    }

    @Override // X.AW2
    public void D4() {
        InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
        if (interfaceC235069Kk != null) {
            C235079Kl.LIZIZ(interfaceC235069Kk, null, null, false, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public int Jl() {
        if (this.LLJILLL) {
            return R.layout.c7z;
        }
        return R.layout.c4y;
    }

    @Override // X.InterfaceC235089Km
    public void LJI() {
        if (this.LLJILLL) {
            this.LLJJ.LJI();
            return;
        }
        InterfaceC87065YEz interfaceC87065YEz = (InterfaceC87065YEz) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC87065YEz.class));
        if (interfaceC87065YEz != null) {
            interfaceC87065YEz.LJIIJ();
        }
        if (TextUtils.equals(this.LLIIIJ, "feed_detail") || TextUtils.equals(this.LLIIIJ, "post_mode")) {
            AWU awu = this.LLJJIII;
            if (awu != null) {
                awu.LJI();
                return;
            }
            return;
        }
        AX6.LIZ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.AW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJJ() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.LJJJJ():void");
    }

    @Override // X.InterfaceC235089Km
    public void LLJLLIL() {
        if (this.LLJILLL) {
            this.LLJJ.LLJLLIL();
            return;
        }
        C235079Kl.LIZ((InterfaceC235069Kk) C8VC.LIZJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class)), null, 3);
        InterfaceC87065YEz interfaceC87065YEz = (InterfaceC87065YEz) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC87065YEz.class));
        if (interfaceC87065YEz != null) {
            interfaceC87065YEz.LLJLLIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public boolean Zl() {
        boolean z = false;
        if (this.LLJILLL) {
            Bundle arguments = this.LLJJ.getArguments();
            if (arguments != null) {
                z = TextUtils.equals(arguments.getString("profile_from", ""), "feed_detail");
            }
            return !z;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = TextUtils.equals(arguments2.getString("profile_from", ""), "feed_detail");
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, X.AW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void clearData() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.clearData():void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public Analysis getAnalysis() {
        if (this.LLJILLL) {
            return this.LLJJ.getAnalysis();
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("others_homepage");
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(Mob.Label.OTHER_HOMEPAGE)");
        return analysis;
    }

    @Override // X.InterfaceC55643Lsd
    public C54082LKk getPopupContext() {
        if (this.LLJILLL) {
            return this.LLJJ.getPopupContext();
        }
        Context context = getContext();
        o.LJI(context);
        return C54081LKj.LIZ(context, this);
    }

    @Override // X.C8VB
    /* renamed from: hm, reason: merged with bridge method [inline-methods] */
    public C9PN defaultObservableData() {
        return new C9PN(0);
    }

    @Override // X.InterfaceC55643Lsd
    public boolean isSceneActive() {
        if (this.LLJILLL) {
            return this.LLJJ.isSceneActive();
        }
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[Catch: Exception -> 0x0089, TRY_LEAVE, TryCatch #0 {Exception -> 0x0089, blocks: (B:100:0x003d, B:102:0x0041, B:105:0x0049, B:107:0x004d, B:109:0x0051, B:111:0x0059, B:112:0x0061, B:22:0x006e, B:24:0x0073), top: B:99:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void km() {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.km():void");
    }

    @Override // X.InterfaceC235089Km
    public void l5() {
        if (this.LLJILLL) {
            return;
        }
        this.LLIZLLLIL = EnumC87060YEu.LOAD_IDLE;
        Em(this.LJLL);
    }

    public List<InterfaceC55643Lsd> lm() {
        return new ArrayList();
    }

    public String om() {
        if (this.LLJILLL) {
            return this.LLJJ.LJLIL;
        }
        return this.LJLIL;
    }

    public boolean vm() {
        if (this.LLJILLL) {
            User user = this.LLJJ.LJLL;
            if (user != null && TextUtils.isEmpty(user.getNickname())) {
                return true;
            }
            return false;
        }
        User user2 = this.LJLL;
        if (user2 != null && TextUtils.isEmpty(user2.getNickname())) {
            return true;
        }
        return false;
    }

    public boolean xm() {
        if (this.LLJILLL) {
            this.LLJJ.getClass();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x011f, code lost:
    
        if (r10.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void an() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.an():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void dm() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.dm():void");
    }

    private final void zm() {
        if (C30746C4w.LIZ()) {
            C38995FSd.LIZLLL().execute(new ARunnableS51S0100000_15(this, 38));
        } else {
            km();
        }
    }

    public final String nm() {
        Serializable serializable;
        C57364MfI c57364MfI;
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("uid")) == null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                serializable = arguments2.getSerializable("recommend_enter_profile_params");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof C57364MfI) || (c57364MfI = (C57364MfI) serializable) == null) {
                return null;
            }
            return c57364MfI.getToUserId();
        }
        return string;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.LLJILLL) {
            return;
        }
        String str = this.LJLIL;
        if (C53299Kvv.LIZIZ() && str != null) {
            ((C0M6) C58397Mvx.LIZIZ.getValue()).LIZLLL(str);
        }
        String str2 = this.LJLIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = this.LLIIJI;
        if (str4 != null) {
            str3 = str4;
        }
        C9IJ.LIZ(str2, str3, false);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C62825OlB c62825OlB;
        super.onDestroyView();
        if (this.LLJILLL) {
            _$_clearFindViewByIdCache();
            return;
        }
        UserProfilePreloadHelper.LJIIIIZZ().LJI();
        if (C4LD.LIZIZ.LJIILIIL() && (c62825OlB = this.LLJILJILJ) != null) {
            c62825OlB.LIZJ();
        }
        this.LLFFF = false;
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.LLJILLL) {
            return;
        }
        this.LLILIL = false;
        if (this.LLIIIL) {
            Xl();
        }
        C62825OlB.LJLLILLLL = false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.LLJILLL) {
            return;
        }
        User user = this.LJLL;
        if (user != null && user.isLive()) {
            Zm(false);
        }
        C62825OlB.LJLLILLLL = true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.LLJILLL) {
            return;
        }
        C54960Lhc.LIZ.LIZLLL();
    }

    public InterfaceC55643Lsd Cm() {
        return C56319M8l.LJLIL;
    }

    private final void Am(View view) {
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        int LIZIZ = C7MY.LIZIZ(4);
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        View findViewById = view.findViewById(R.id.g5l);
        View findViewById2 = view.findViewById(R.id.d2i);
        C119324mG c119324mG = (C119324mG) view.findViewById(R.id.mz2);
        View findViewById3 = view.findViewById(R.id.y1);
        if (findViewById != null) {
            C26338AVi.LJI(findViewById, null, Integer.valueOf(LJJIIZ), null, null, false, 29);
        }
        if (findViewById2 != null) {
            C26338AVi.LJI(findViewById2, null, Integer.valueOf(LJJIIZ), null, null, false, 29);
        }
        if (c119324mG != null) {
            C26338AVi.LJIIIZ(c119324mG, null, Integer.valueOf(LIZIZ), null, null, 29);
            c119324mG.setExpectedEmptyHeightPx(LJJIIZ);
        }
        if (findViewById3 != null) {
            C26338AVi.LJIIIZ(findViewById3, Integer.valueOf(LJJIIZ2), null, Integer.valueOf(LJJIIZ2), null, 26);
        }
    }

    private final void Em(User user) {
        if (this.LLILIL) {
            if (this.LLILL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("hasReportedAfterResume: ");
                LIZ.append(this.LLILIL);
                LIZ.append(", hasReportedAfterVisible: ");
                U26.LIZLLL(LIZ, this.LLILL, LIZ, "I18nUserProfileFragmentV2");
                return;
            }
            if (!this.LLILL) {
                this.LLILL = true;
            }
        } else {
            this.LLILIL = true;
        }
        C26335AVf.LJJIIJ(user, this.LLJ, this.LLJI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Pm(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Pm(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Sm(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Sm(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Xm(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Xm(java.lang.String):void");
    }

    private final void cm(String str) {
        ActivityC45651qj mo49getActivity;
        Aweme aweme;
        String str2;
        String str3;
        String str4;
        if (C61102aY.LIZ && this.LLIZ && (mo49getActivity = mo49getActivity()) != null && (aweme = C3SZ.LIZ(mo49getActivity).LJLJLLL) != null) {
            String aid = aweme.getAid();
            Aweme aweme2 = this.LLIIIZ;
            String str5 = null;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(aid, str2)) {
                String secAuthorUid = aweme.getSecAuthorUid();
                Aweme aweme3 = this.LLIIIZ;
                if (aweme3 != null) {
                    str4 = aweme3.getSecAuthorUid();
                } else {
                    str4 = null;
                }
                if (TextUtils.equals(secAuthorUid, str4)) {
                    return;
                }
            }
            StringBuilder LIZIZ = C25620zW.LIZIZ("I18nUserProfileFragmentV2 ", str, " invalid aweme, aid: ");
            Aweme aweme4 = this.LLIIIZ;
            if (aweme4 != null) {
                str3 = aweme4.getAid();
            } else {
                str3 = null;
            }
            LIZIZ.append(str3);
            LIZIZ.append(", aweme_secUid: ");
            Aweme aweme5 = this.LLIIIZ;
            if (aweme5 != null) {
                str5 = aweme5.getSecAuthorUid();
            }
            LIZIZ.append(str5);
            LIZIZ.append(", secUid: ");
            LIZIZ.append(this.LJLILLLLZI);
            LIZIZ.append("; homepage_aid: ");
            LIZIZ.append(aweme.getAid());
            LIZIZ.append(", homepage_secUid: ");
            LIZIZ.append(aweme.getSecAuthorUid());
            C36922EeM.LIZLLL(4, "feed2profile", X1D.LIZIZ(LIZIZ));
        }
    }

    private final IMUser fm(User user) {
        if (user == null) {
            return null;
        }
        return IMUser.fromUser(user);
    }

    private final int mm(User user) {
        if (user != null) {
            int followStatus = user.getFollowStatus();
            if (followStatus != 0 && followStatus != 1 && followStatus != 2) {
                if (user.getFollowerStatus() == 0) {
                    return 0;
                }
                return 3;
            }
            return followStatus;
        }
        return -1;
    }

    private final boolean sm(User user) {
        if (user == null) {
            return false;
        }
        if ((!user.isAccuratePrivateAccount() || user.getFollowStatus() >= 1) && !user.isBlocked() && !user.isBlock) {
            return false;
        }
        return true;
    }

    @Override // X.AW2
    public void Hi(AWU onUserProfileBackListener) {
        o.LJIIIZ(onUserProfileBackListener, "onUserProfileBackListener");
        if (this.LLJILLL) {
            I18nUserProfileFragmentV3 i18nUserProfileFragmentV3 = this.LLJJ;
            i18nUserProfileFragmentV3.getClass();
            i18nUserProfileFragmentV3.LLJJIJI = onUserProfileBackListener;
            return;
        }
        this.LLJJIII = onUserProfileBackListener;
    }

    public final void Im(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLII = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Jm(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Jm(java.lang.String):void");
    }

    public final void Km(EnumC87060YEu enumC87060YEu) {
        o.LJIIIZ(enumC87060YEu, "<set-?>");
        this.LLIZLLLIL = enumC87060YEu;
    }

    @Override // X.AW2
    public void LJJIJ(String str) {
        if (this.LLJILLL) {
            this.LLJJ.LJJIJ(str);
            return;
        }
        InterfaceC87065YEz interfaceC87065YEz = (InterfaceC87065YEz) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC87065YEz.class));
        if (interfaceC87065YEz != null) {
            interfaceC87065YEz.LJJIJ(str);
        }
    }

    @Override // X.InterfaceC235089Km
    public void LJJLJLI(User user) {
        if (this.LLJILLL) {
            this.LLJJ.LJJLJLI(user);
            return;
        }
        String str = this.LLFII;
        if (str != null && user != null) {
            user.setRequestId(str);
        }
        this.LJLL = user;
    }

    @Override // X.AW2
    public void LJJLL(String str) {
        if (this.LLJILLL) {
            I18nUserProfileFragmentV3 i18nUserProfileFragmentV3 = this.LLJJ;
            i18nUserProfileFragmentV3.LLJILJILJ = i18nUserProfileFragmentV3.LLJILJIL;
        } else {
            this.LLJI = this.LLJ;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.AW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLII(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.LLII(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.InterfaceC235089Km
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLILZIL(com.ss.android.ugc.aweme.profile.model.User r13) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.LLILZIL(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.AW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLJI(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.LLJI(java.lang.String):void");
    }

    @Override // X.InterfaceC235089Km
    public void M4(int i) {
        User user;
        boolean z;
        int i2;
        if (this.LLJILLL || (user = this.LJLL) == null) {
            return;
        }
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        user.setBlock(z);
        C26045AKb c26045AKb = new C26045AKb(this);
        Resources resources = getResources();
        if (i == 1) {
            i2 = R.string.bnl;
        } else {
            i2 = R.string.tci;
        }
        c26045AKb.LJIIIZ(resources.getString(i2));
        c26045AKb.LJIIJ();
        if (i == 1) {
            this.LJLL.setFollowStatus(0);
            dm();
            C175046tw c175046tw = new C175046tw();
            c175046tw.LJLIL = this.LJLL;
            C2U8.LIZ(c175046tw);
            User user2 = this.LJLL;
            if (user2 != null) {
                String uid = user2.getUid();
                o.LJIIIIZZ(uid, "it.uid");
                C2U8.LIZ(new C28155B3f(uid));
            }
        } else {
            C7YQ c7yq = new C7YQ();
            c7yq.LJLIL = this.LJLL;
            C2U8.LIZ(c7yq);
            LLJLLIL();
        }
        IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIIZILJ(fm(this.LJLL));
        InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
        if (interfaceC235069Kk != null) {
            C235079Kl.LIZIZ(interfaceC235069Kk, this.LJLL, null, false, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public void Ml(View view) {
        C26175APb c26175APb;
        C57364MfI c57364MfI;
        HashMap hashMap;
        String str;
        String string;
        o.LJIIIZ(view, "view");
        if (this.LLJILLL) {
            return;
        }
        super.Ml(view);
        Bundle arguments = getArguments();
        int i = 1;
        if (arguments != null) {
            String str2 = null;
            if (arguments.getSerializable("recommend_enter_profile_params") instanceof C57364MfI) {
                Serializable serializable = arguments.getSerializable("recommend_enter_profile_params");
                o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.recommend.RecommendEnterProfileParams");
                c57364MfI = (C57364MfI) serializable;
            } else {
                c57364MfI = null;
            }
            String str3 = "";
            C57368MfM c57368MfM = new C57368MfM(arguments.getString("request_id", ""), arguments.getString("room_id", ""), arguments.getString("room_owner_id", ""), arguments.getString("user_type", ""), arguments.getString("enter_from", ""), c57364MfI, arguments.getString("position", ""));
            Bundle bundle = arguments.getBundle("bundle");
            int i2 = arguments.getInt("general_search_card_type", 0);
            boolean z = arguments.getBoolean("extra_from_mutual", false);
            boolean z2 = arguments.getBoolean("isFromFeed", true);
            String string2 = arguments.getString("event_keys");
            if (string2 == null) {
                string2 = "";
            }
            boolean z3 = arguments.getBoolean("sticky_content", false);
            String string3 = arguments.getString("notice_type");
            Serializable serializable2 = arguments.getSerializable("inbox_log_extra");
            if (serializable2 instanceof HashMap) {
                hashMap = (HashMap) serializable2;
            } else {
                hashMap = null;
            }
            String string4 = arguments.getString("extra_previous_page");
            if (string4 == null) {
                string4 = "";
            }
            if (bundle != null && (string = bundle.getString("conversation_id")) != null) {
                str3 = string;
            }
            if (!C38354F3m.LJ(this.LLIIL) && C38354F3m.LIZJ("live", this.LLJ) && C38354F3m.LIZJ(this.LLIILZL, "1")) {
                str = this.LLIIL;
            } else {
                str = null;
            }
            if (!C38354F3m.LJ(this.LLIILII) && C38354F3m.LIZJ("live", this.LLJ) && C38354F3m.LIZJ(this.LLIILZL, "1")) {
                str2 = this.LLIILII;
            }
            c26175APb = new C26175APb(this.LJLJJLL, z2, this.LLJ, this.LLJI, this.LLII, this.LLIIIJ, z, c57368MfM, i2, string2, z3, string3, hashMap, str, str2, str3, string4);
        } else {
            c26175APb = new C26175APb(this.LJLJJLL, this.LLJ, this.LLII, this.LLIIIJ, 131018);
        }
        C8VV.LIZ(this, false, new AqS108S0300000_4(this, c26175APb, view, 19));
        Am(view);
        if (C26374AWs.LIZ() != null) {
            Config LIZ = C26374AWs.LIZ();
            if (LIZ == null || LIZ.recommendFriendsInOthersProfilePage != 1) {
                i = 0;
            }
            C26335AVf.LJIJI(i);
        }
        view.post(new Runnable() { // from class: X.9T6
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                C176946x0 c176946x0;
                try {
                    C176956x1 c176956x1 = MF2.LIZ;
                    if (c176956x1 != null && (c176946x0 = c176956x1.LIZ) != null) {
                        c176946x0.LJIIIIZZ = System.currentTimeMillis();
                    }
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Mm(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Mm(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Nm(int r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Nm(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Om(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Om(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Qm(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Qm(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Rm(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Rm(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Tm(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Tm(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Vm(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Vm(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.AW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W0(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.W0(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ym(int[] r13) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Ym(int[]):void");
    }

    @Override // X.AW2
    public void Z5(String str) {
        if (this.LLJILLL) {
            this.LLJJ.getClass();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0186, code lost:
    
        if (r10.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Zm(boolean r14) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.Zm(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d7, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v89, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView(android.view.View r13) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.initView(android.view.View):void");
    }

    @Override // X.AW2
    public void ok(int i) {
        if (this.LLJILLL) {
            this.LLJJ.LLJILLL = i;
        } else {
            this.LLJIJIL = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        if (r10.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.8VA, T] */
    @Override // X.AW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ol(com.ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.ol(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 qx2) {
        String str;
        if (qx2 != null && (str = qx2.LJLIL) != null) {
            if (s.LJJJLZIJ(str, "/aweme/v1/user/profile/other/?", false) || s.LJJJLZIJ(str, "/aweme/v1/aweme/post/?", false) || s.LJJJLZIJ(str, "/aweme/v1/aweme/favorite/?", false)) {
                EventBus.LIZJ().LIZIZ(qx2);
                LLJLLIL();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.Hilt_I18nUserProfileFragmentV2, com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        if (this.LLJILLL) {
            return;
        }
        if (C78685UuP.LJJJZ(this.LLI)) {
            setPreviousPage(this.LLI);
        }
        if (C78685UuP.LJJJZ(this.LLIFFJFJJ)) {
            W0(this.LLIFFJFJJ);
        }
        if (C78685UuP.LJJJZ(this.LLILLJJLI)) {
            Vm(this.LLILLJJLI);
        }
        if (C78685UuP.LJJJZ(this.LLILLL)) {
            Mm(this.LLILLL);
        }
        if (C78685UuP.LJJJZ(this.LLILZ)) {
            Jm(this.LLILZ);
        }
        if (C78685UuP.LJJJZ(this.LLILZIL)) {
            Om(this.LLILZIL);
        }
        Integer num = this.LLILZLL;
        if (num != null) {
            Nm(num.intValue());
        }
        if (C78685UuP.LJJJZ(this.LLIIJLIL)) {
            LLII(this.LLIIJLIL);
        }
        if (C78685UuP.LJJJZ(this.LLIIJI)) {
            LLJI(this.LLIIJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        String str;
        MFE.LIZ = "new_user_profile";
        MFE.LIZIZ = true;
        C54502LaE.LIZ(MFE.LIZ);
        super.onCreate(bundle);
        if (this.LLJILLL) {
            this.LLJJ.setArguments(getArguments());
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            I18nUserProfileFragmentV3 i18nUserProfileFragmentV3 = this.LLJJ;
            o.LJII(i18nUserProfileFragmentV3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV3");
            c1b3.LJIIIIZZ(R.id.i9j, 1, i18nUserProfileFragmentV3, "platform_fragment_other");
            c1b3.LJIILJJIL();
            return;
        }
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, ProfileBaseAbility.class, null);
        String str2 = "";
        if (TextUtils.isEmpty(this.LJLIL)) {
            if (bundle == null || (str = bundle.getString("uid")) == null) {
                str = "";
            }
            this.LJLIL = str;
        }
        if (TextUtils.isEmpty(this.LJLILLLLZI)) {
            if (bundle != null && (string = bundle.getString("sec_user_id")) != null) {
                str2 = string;
            }
            this.LJLILLLLZI = str2;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLIZ = arguments.getBoolean("is_response_home_feed_scroll");
        }
        C53487Kyx.LIZIZ(AWY.PERSONAL_DETAIL);
        ((Number) FOH.LIZ.getValue()).intValue();
        C237259Sv.LIZIZ(System.currentTimeMillis(), "page_on_create_complete_time");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        if (this.LLJILLL) {
            return;
        }
        outState.putString("uid", this.LJLIL);
        outState.putString("sec_user_id", this.LJLILLLLZI);
        super.onSaveInstanceState(outState);
    }

    @QD3
    public final void onShareCompleteEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLJJL, "others_homepage") && !C62825OlB.LJLLJ && !o.LJ(event.LJLJJI, "video_sticker")) {
            if (mo49getActivity() != null && this.LJLLILLLL != null) {
                C62825OlB.LJLLJ = true;
                IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(mo49getActivity(), this.LJLLILLLL, event);
                return;
            }
            return;
        }
        if (!o.LJ(event.LJLJJL, "others_homepage") || !o.LJ(event.LJLJJI, "video_sticker") || mo49getActivity() == null || this.LJLLILLLL == null) {
            return;
        }
        IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(mo49getActivity(), this.LJLLILLLL, event);
    }

    @QD3
    public final void onUpdateUserEvent(AWX awx) {
        if (awx != null && awx.LJLIL != null && TextUtils.equals(awx.LJLIL.getUid(), this.LJLIL)) {
            LJJLJLI(awx.LJLIL);
            InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
            if (interfaceC235069Kk != null) {
                C235079Kl.LIZIZ(interfaceC235069Kk, awx.LJLIL, null, false, 6);
            }
        }
    }

    @Override // X.AW2
    public void q5(Aweme aweme) {
        if (this.LLJILLL) {
            this.LLJJ.q5(aweme);
            return;
        }
        if (aweme != null && !TextUtils.equals(this.LJLIL, aweme.getAuthorUid())) {
            clearData();
            ye(aweme.getAuthorUid(), aweme.getAuthor().getSecUid());
            ol(aweme);
            bg(aweme.getAuthor(), 2);
            Zm(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.AW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPreviousPage(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.setPreviousPage(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0138, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.AW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVisible(boolean r13) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.setVisible(boolean):void");
    }

    @Override // X.AW2
    public /* bridge */ /* synthetic */ void sf(Boolean bool) {
        Zm(bool.booleanValue());
    }

    @Override // X.AW2
    public void x6(boolean z) {
        if (this.LLJILLL) {
            this.LLJJ.x6(z);
        } else {
            Z(z, false);
        }
    }

    private final void Z(boolean z, boolean z2) {
        InterfaceC87065YEz interfaceC87065YEz = (InterfaceC87065YEz) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC87065YEz.class));
        if (interfaceC87065YEz != null) {
            interfaceC87065YEz.Z(z, z2);
        }
    }

    public final void Hm(Runnable runnable, boolean z) {
        if (z) {
            C57022Lq.LIZ.LJLIL.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // X.AW2
    public void bg(User user, int i) {
        String str;
        UserPostApiPreloadApi userPostApiPreloadApi;
        if (this.LLJILLL) {
            if (!isViewValid() || this.LJLLLL == null) {
                this.LLJJ.bg(user, i);
                return;
            }
            return;
        }
        if ((!isViewValid() || this.LJLLLL == null) && user != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putString("uid", user.getUid());
            }
            UserProfilePreloadHelper.LJIIIIZZ().LIZJ(user);
        }
        if (!isViewValid()) {
            return;
        }
        if (user != null && this.LJLLLL != null) {
            User LJ = UserProfilePreloadHelper.LJIIIIZZ().LJ(user.getUid());
            if (LJ == null) {
                LJ = user;
            }
            this.LJLLLL.Kv0(LJ);
            LJJLJLI(LJ);
            InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
            if (interfaceC235069Kk != null) {
                C235079Kl.LIZIZ(interfaceC235069Kk, LJ, null, true, 2);
            }
            if (!sm(LJ) && (userPostApiPreloadApi = (UserPostApiPreloadApi) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), UserPostApiPreloadApi.class, null)) != null) {
                userPostApiPreloadApi.xC();
            }
        }
        if (C77357UXp.LJJIIJZLJL()) {
            InterfaceC57508Mhc interfaceC57508Mhc = (InterfaceC57508Mhc) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC57508Mhc.class));
            if (interfaceC57508Mhc != null) {
                interfaceC57508Mhc.Se();
            }
        } else {
            C37179EiV.LIZ().post(new ARunnableS51S0100000_15(this, 39));
        }
        if (user == null || (str = user.getUid()) == null) {
            str = "";
        }
        C26335AVf.LJIJ(str, "simple");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        ActivityC45651qj mo49getActivity;
        Boolean valueOf;
        String string;
        Integer LJJIL;
        o.LJIIIZ(view, "view");
        if (this.LLJILLL) {
            return;
        }
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("extra_previous_page")) == null) {
            str = "";
        }
        this.LLI = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("profile_from_scene")) != null && (LJJIL = C38350F3i.LJJIL(string)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        this.LLJIJIL = i;
        super.onViewCreated(view, bundle);
        MF2.LIZ(new C1E4(), this.LLI);
        C173376rF c173376rF = new C173376rF();
        String str3 = this.LLI;
        if (str3 == null) {
            str3 = this.LLJ;
        }
        C56483MEt.LIZ(c173376rF, str3, true, "homepage_other_profile");
        C73353Sqb.LIZJ().LJII();
        C73353Sqb.LIZJ().LJIIIZ(0L);
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (valueOf = Boolean.valueOf(arguments3.getBoolean("delay_profile_loading"))) == null || !valueOf.booleanValue()) {
            ym();
        }
        if (C9H6.LIZJ() || L12.LIZLLL()) {
            _$_findCachedViewById(R.id.alg).setVisibility(8);
        }
        try {
            String optString = new JSONObject(this.LLILII).optString("rfevent_previous_page");
            o.LJIIIIZZ(optString, "{\n                JSONOb…VIOUS_PAGE)\n            }");
            str2 = optString;
        } catch (JSONException unused) {
        }
        this.LLII = str2;
        if (this.LLIZ && (mo49getActivity = mo49getActivity()) != null) {
            C84193Sd.LIZ(mo49getActivity).qv0(this, new AObserverS83S0100000_15(this, 73));
        }
        an();
        C225318sp.LJ(this.LJLL, EnumC57365MfJ.ENTER_PROFILE.getType(), this.LLJ, this.LLII, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.AW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ye(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.ye(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2.onActivityResult(int, int, android.content.Intent):void");
    }
}
