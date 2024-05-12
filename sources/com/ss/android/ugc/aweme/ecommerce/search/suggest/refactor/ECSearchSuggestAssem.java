package com.ss.android.ugc.aweme.ecommerce.search.suggest.refactor;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C50863Jxj;
import X.C51253K9p;
import X.C51256K9s;
import X.C51291KBb;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC60761Nsz;
import X.InterfaceC65350Pko;
import X.KA7;
import X.KAO;
import X.KAU;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECSearchSuggestAssem extends UISlotAssem implements ISearchSuggestSubPageAbility {
    public ISearchSuggestContextAbilityNew LJLJLLL;
    public C50863Jxj LJLL;
    public final C214298b3 LJLLI;
    public C51256K9s LJLLILLLL;
    public KA7 LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void DV(SearchResultParam searchResultParam) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
    }

    @Override // X.KCT
    public final void I1(KAU kau, KAU curPageState) {
        o.LJIIIZ(curPageState, "curPageState");
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.apc;
    }

    public ECSearchSuggestAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(SuggestAssemViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, C9BE.LIZ, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 73), C51291KBb.INSTANCE, null);
    }

    public final SuggestAssemViewModel K3() {
        return (SuggestAssemViewModel) this.LJLLI.getValue();
    }

    public final void H3() {
        long currentTimeMillis;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz interfaceC60761Nsz;
        Long valueOf;
        K3().getClass();
        HashMap hashMap = new HashMap();
        KAO kao = C51253K9p.LIZIZ;
        if (kao != null && (valueOf = Long.valueOf(kao.LIZ)) != null) {
            currentTimeMillis = valueOf.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        hashMap.put("_ec_start_time", String.valueOf(currentTimeMillis));
        C50863Jxj c50863Jxj = this.LJLL;
        if (c50863Jxj != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50863Jxj.LJIIJ) != null && (interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLIL) != null) {
            interfaceC60761Nsz.LIZ(hashMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I3() {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.refactor.ECSearchSuggestAssem.I3():void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void hide() {
        _$_findCachedViewById(R.id.jhs).setVisibility(8);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, ISearchSuggestSubPageAbility.class, null);
        }
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = (ISearchSuggestContextAbilityNew) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchSuggestContextAbilityNew.class, null);
        if (iSearchSuggestContextAbilityNew != null) {
            this.LJLJLLL = iSearchSuggestContextAbilityNew;
            K3().LJLJJI = iSearchSuggestContextAbilityNew;
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        KAU kau;
        super.onResume();
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LJLJLLL;
        if (iSearchSuggestContextAbilityNew != null) {
            kau = iSearchSuggestContextAbilityNew.getPageState();
        } else {
            kau = null;
        }
        if (kau == KAU.SUGGEST) {
            I3();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final KAU Jc0() {
        return KAU.SUGGEST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x028d, code lost:
    
        if (r8.LJJJJJ(r9.getEcSearchEntranceData()) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x037a, code lost:
    
        if (r9 == null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x037c, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x042b, code lost:
    
        if (r9 != null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x043c, code lost:
    
        if (r9 == null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0471, code lost:
    
        if (r8.LJIIJJI() != false) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a0 A[LOOP:0: B:92:0x019a->B:94:0x01a0, LOOP_END] */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ff(X.EnumC51268KAe r15) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.refactor.ECSearchSuggestAssem.Ff(X.KAe):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        KA7 ka7;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LJLJLLL;
        if (iSearchSuggestContextAbilityNew != null) {
            ka7 = iSearchSuggestContextAbilityNew.u9();
        } else {
            ka7 = null;
        }
        this.LJLLJ = ka7;
        getContext();
        KA7 ka72 = this.LJLLJ;
        this.LJLLILLLL = new C51256K9s(ka72);
        if (ka72 != null) {
            SuggestAssemViewModel K3 = K3();
            C51256K9s c51256K9s = this.LJLLILLLL;
            K3.getClass();
            K3.LJLILLLLZI = ka72;
            K3.LJLJJLL = c51256K9s;
        }
        C8YN.LJII(this, K3(), new TBT() { // from class: X.KCD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((KBW) obj).LJLILLLLZI;
            }
        }, null, new AqS190S0100000_8(this, 63), 6);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.KCE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((KBW) obj).LJLIL;
            }
        }, null, new AqS190S0100000_8(this, 64), 6);
    }
}
