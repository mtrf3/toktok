package com.ss.android.ugc.aweme.im.sdk.search.ui;

import X.AbstractC008101l;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C1HQ;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C25620zW;
import X.C29S;
import X.C33A;
import X.C33N;
import X.C3C5;
import X.C40651FxP;
import X.C4ZQ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73411SrX;
import X.C76800UCe;
import X.C772831o;
import X.C776532z;
import X.C776933d;
import X.C785736n;
import X.C78926UyI;
import X.C84763XOl;
import X.C85323Wm;
import X.C86343aA;
import X.C88213dB;
import X.C88223dC;
import X.C8VV;
import X.C90903hW;
import X.C96383qM;
import X.C96393qN;
import X.C96403qO;
import X.C98453th;
import X.C9BD;
import X.C9BE;
import X.GD4;
import X.InterfaceC61213O0r;
import X.InterfaceC65350Pko;
import X.InterfaceC86313a7;
import X.JBR;
import X.JBS;
import X.X1D;
import X.XKX;
import Y.AfS53S0100000_1;
import Y.IDComparatorS29S0000000_1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.im.core.service.IMCoreProxyService;
import com.google.android.play.core.assetpacks.w0;
import com.ss.android.ugc.aweme.im.sdk.search.ui.IMSearchFragment;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchVM;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC61213O0r
/* loaded from: classes2.dex */
public final class IMSearchFragment extends BaseFragment implements JBS {
    public w0 LJLJJI;
    public final C214298b3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public C73411SrX LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C96403qO.LJLIL);
    public int LJLILLLLZI = -1;
    public int LJLJI = -1;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBackPressed_Activity() {
        JBR.LIZIZ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    public IMSearchFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(IMSearchDefaultVM.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 657);
        C96383qM c96383qM = C96383qM.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c96383qM, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c96383qM, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(IMSearchVM.class);
        AqS151S0100000_1 aqS151S0100000_12 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 658);
        C96393qN c96393qN = C96393qN.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(aqS151S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c96393qN, LIZ2);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(aqS151S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c96393qN, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJLL = c214298b32;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            Object LLILL = C16880lQ.LLILL(mo49getActivity, "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) LLILL).hideSoftInputFromWindow(null, 0);
        }
        C73411SrX c73411SrX = this.LJLJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        w0 w0Var = this.LJLJJI;
        if (w0Var != null) {
            w0Var.LIZIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        Window window;
        super.onStop();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(49);
        }
    }

    @Override // X.JBS
    public final void onBeforeActivityCreated(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(52);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(GD4.LJLIL);
        super.onCreate(bundle);
        this.LJLJL = (C73411SrX) C84763XOl.LJI().LJJJJZI(new AfS53S0100000_1(this, 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.3Zd] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("enter_method");
            if (string == null) {
                string = "";
            }
            C40651FxP c40651FxP = new C40651FxP(string);
            this.LJLJJI = new w0(-1, c40651FxP);
            C85323Wm onEventV3 = C772831o.LIZ();
            o.LJIIIZ(onEventV3, "onEventV3");
            C1HQ c1hq = new C1HQ();
            c1hq.put("enter_from", "notification_page");
            c1hq.put("enter_method", string);
            onEventV3.LIZIZ("enter_dm_search_page", c1hq);
            this.LJLILLLLZI = arguments.getInt("search_bar_entrance_raw_x", -1);
            this.LJLJI = arguments.getInt("searchbar_entrance_raw_y", -1);
            C98453th c98453th = (C98453th) this.LJLIL.getValue();
            StringBuilder LIZIZ = C25620zW.LIZIZ("searchEntrance ", string, " searchbarEntranceRawX ");
            LIZIZ.append(this.LJLILLLLZI);
            LIZIZ.append(" searchbarEntranceRawY ");
            LIZIZ.append(this.LJLJI);
            c98453th.LJFF(X1D.LIZIZ(LIZIZ));
            C88223dC c88223dC = new C88223dC(arguments.getLong("search_page_start_timestamp", -1L), arguments.getBoolean("is_animation_enable", false), arguments.getBoolean("is_low_end_device", false), string);
            IMSearchDefaultVM iMSearchDefaultVM = (IMSearchDefaultVM) this.LJLJJL.getValue();
            C88213dB c88213dB = new C88213dB(c88223dC);
            iMSearchDefaultVM.LJLIL = new C33A(iMSearchDefaultVM.getAssemVMScope(), new C776933d(c40651FxP, c88213dB), new C776532z(c40651FxP, c88213dB), c88213dB);
            XKX.LIZLLL(iMSearchDefaultVM.getAssemVMScope(), null, null, new C33N(iMSearchDefaultVM, null), 3);
            IMSearchVM iMSearchVM = (IMSearchVM) this.LJLJJLL.getValue();
            final w0 w0Var = new w0(2, c40651FxP);
            ?? r3 = new InterfaceC86313a7<C785736n>() { // from class: X.3Zd
                @Override // X.InterfaceC86313a7
                public final List<C785736n> LIZ(List<C86033Zf> list) {
                    String nickName;
                    int i;
                    int i2;
                    Object obj;
                    Object obj2;
                    C785736n c785736n;
                    int i3;
                    long j;
                    String str;
                    String str2;
                    int LJJLIIIJL;
                    C86023Ze c86023Ze;
                    C86023Ze c86023Ze2;
                    C63088OpQ coreInfo;
                    o.LJIIIZ(list, "list");
                    w0 w0Var2 = w0.this;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    int i5 = 0;
                    for (C86033Zf c86033Zf : list) {
                        int i6 = c86033Zf.LJLILLLLZI;
                        if (i6 != 0) {
                            if (i6 == 1) {
                                C3Q9.LIZ.getClass();
                                C75782yE.LIZ();
                                C63120Opw LIZ = C4WC.LIZIZ.LIZ(c86033Zf.LJLJI);
                                C3QE c3qe = C3QE.LIZ;
                                if (LIZ != null && (coreInfo = LIZ.getCoreInfo()) != null) {
                                    str = coreInfo.getName();
                                } else {
                                    str = null;
                                }
                                c3qe.getClass();
                                String LIZJ = C3QE.LIZJ(str);
                                if (LIZ != null && LIZ.getCoreInfo() != null && (LJJLIIIJL = s.LJJLIIIJL(LIZJ, (str2 = c86033Zf.LJLJJI), i4, true, 2)) != -1) {
                                    Iterator<C86023Ze> it = c86033Zf.LJLIL.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            c86023Ze = it.next();
                                            if (c86023Ze.LJLJI == 2) {
                                                break;
                                            }
                                        } else {
                                            c86023Ze = null;
                                            break;
                                        }
                                    }
                                    C86023Ze c86023Ze3 = c86023Ze;
                                    if (c86023Ze3 != null) {
                                        c86023Ze2 = C86023Ze.L(c86023Ze3, new OSZ(Integer.valueOf(LJJLIIIJL), Integer.valueOf(str2.length())));
                                    } else {
                                        c86023Ze2 = null;
                                    }
                                    c86033Zf.LJLIL.clear();
                                    if (c86023Ze2 != null) {
                                        c86033Zf.LJLIL.add(c86023Ze2);
                                    }
                                    if (!c86033Zf.LJLIL.isEmpty()) {
                                        i3 = i5 + 1;
                                        c785736n = new C785736n(new C87887YeR(LIZJ, c86033Zf, new C87882YeM(LIZ, LIZJ, i5, EnumC40672Fxk.RESULT, linkedHashSet, w0Var2)), new C85993Zb(c86033Zf, false, LIZ.getUpdatedTime(), 0, true, 10));
                                        i5 = i3;
                                        arrayList.add(c785736n);
                                    }
                                }
                            }
                            i4 = 0;
                        } else {
                            String LIZJ2 = C81273Gx.LIZJ(c86033Zf.LJLJI);
                            C3Q9.LIZ.getClass();
                            C75782yE.LIZ();
                            C63120Opw LJII = C4WC.LIZIZ.LJII(LIZJ2);
                            IMUser LIZLLL = C3GN.LIZIZ.LIZLLL(c86033Zf.LJLJI);
                            if (LIZLLL != null && (nickName = LIZLLL.getNickName()) != null && nickName.length() != 0) {
                                C3ZD.LIZ.getClass();
                                if (!ORZ.LJLJJI(Integer.valueOf(LIZLLL.getFollowStatus()), C3ZD.LIZIZ)) {
                                    C3FW LIZ2 = C785836o.LIZ();
                                    String uid = LIZLLL.getUid();
                                    LIZ2.getClass();
                                    if (!C3FW.LIZJ(uid)) {
                                    }
                                }
                                String str3 = c86033Zf.LJLJJI;
                                String nickName2 = LIZLLL.getNickName();
                                if (nickName2 != null) {
                                    i = s.LJJLIIIJL(nickName2, str3, i4, true, 2);
                                } else {
                                    i = -1;
                                }
                                String uniqueId = LIZLLL.getUniqueId();
                                if (uniqueId != null) {
                                    i2 = s.LJJLIIIJL(uniqueId, str3, i4, true, 2);
                                } else {
                                    i2 = -1;
                                }
                                if (i != -1 || i2 != -1) {
                                    int length = str3.length();
                                    List<C86023Ze> list2 = c86033Zf.LJLIL;
                                    ArrayList arrayList2 = new ArrayList();
                                    ArrayList arrayList3 = new ArrayList();
                                    for (C86023Ze c86023Ze4 : list2) {
                                        if (i != -1) {
                                            arrayList3.add(c86023Ze4);
                                        }
                                    }
                                    Iterator it2 = arrayList3.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj = it2.next();
                                            if (((C86023Ze) obj).LJLJI == 0) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    C86023Ze c86023Ze5 = (C86023Ze) obj;
                                    if (c86023Ze5 != null) {
                                        arrayList2.add(C86023Ze.L(c86023Ze5, new OSZ(Integer.valueOf(i), Integer.valueOf(length))));
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (C86023Ze c86023Ze6 : list2) {
                                        if (i2 != -1) {
                                            arrayList4.add(c86023Ze6);
                                        }
                                    }
                                    Iterator it3 = arrayList4.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj2 = it3.next();
                                            if (((C86023Ze) obj2).LJLJI == 1) {
                                                break;
                                            }
                                        } else {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                    C86023Ze c86023Ze7 = (C86023Ze) obj2;
                                    if (c86023Ze7 != null) {
                                        arrayList2.add(C86023Ze.L(c86023Ze7, new OSZ(Integer.valueOf(i2), Integer.valueOf(length))));
                                    }
                                    list2.clear();
                                    list2.addAll(arrayList2);
                                    if (!list2.isEmpty()) {
                                        C3FW LIZ3 = C785836o.LIZ();
                                        String str4 = c86033Zf.LJLJI;
                                        LIZ3.getClass();
                                        boolean LIZJ3 = C3FW.LIZJ(str4);
                                        i3 = i5 + 1;
                                        linkedHashSet = linkedHashSet;
                                        C87888YeS c87888YeS = new C87888YeS(LIZLLL, c86033Zf, new C87881YeL(LIZLLL, LJII, LIZJ3, i5, EnumC40672Fxk.RESULT, linkedHashSet, w0Var2));
                                        if (LJII != null) {
                                            j = LJII.getUpdatedTime();
                                        } else {
                                            j = 0;
                                        }
                                        c785736n = new C785736n(c87888YeS, new C85993Zb(c86033Zf, LIZJ3, j, LIZLLL.getFollowStatus(), false, 16));
                                        i5 = i3;
                                        arrayList.add(c785736n);
                                    }
                                }
                            }
                            i4 = 0;
                        }
                    }
                    return arrayList;
                }

                @Override // X.InterfaceC86313a7
                public final List<C785736n> LIZIZ(List<? extends C785736n> list) {
                    o.LJIIIZ(list, "list");
                    List<C785736n> LLILII = ORZ.LLILII(new IDComparatorS29S0000000_1(16), list);
                    int i = 0;
                    for (C785736n c785736n : LLILII) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            Y9V y9v = c785736n.LJLIL;
                            if (y9v instanceof C87888YeS) {
                                ((C87888YeS) y9v).LIZJ.LIZLLL = i;
                            } else if (y9v instanceof C87887YeR) {
                                ((C87887YeR) y9v).LIZJ.LIZJ = i;
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    return LLILII;
                }
            };
            IMCoreProxyService.LIZJ().LIZ().getClass();
            iMSearchVM.LJLIL = C4ZQ.LIZIZ.LIZLLL(iMSearchVM.getAssemVMScope(), r3);
            XKX.LIZLLL(iMSearchVM.getAssemVMScope(), null, null, new C86343aA(iMSearchVM, null), 3);
        }
        C8VV.LIZ(this, false, new AqS167S0100000_1(this, 177));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        o.LJIIIZ(inflater, "inflater");
        AbstractC008101l abstractC008101l = new AbstractC008101l() { // from class: X.3qK
            @Override // X.AbstractC008101l
            public final void LIZ() {
                C2U8.LIZ(new C96273qB(true));
                ActivityC45651qj mo49getActivity = IMSearchFragment.this.mo49getActivity();
                if (mo49getActivity != null) {
                    mo49getActivity.finish();
                }
            }

            {
                super(true);
            }
        };
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (onBackPressedDispatcher = mo49getActivity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZIZ(abstractC008101l);
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b25, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
