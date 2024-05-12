package com.ss.android.ugc.aweme.share.core.ui;

import X.ASQ;
import X.ASU;
import X.AbstractC62496Ofs;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C10A;
import X.C113554cx;
import X.C113914dX;
import X.C113994df;
import X.C114044dk;
import X.C119364mK;
import X.C141335gf;
import X.C16880lQ;
import X.C203877zL;
import X.C221108m2;
import X.C25600zU;
import X.C26255ASd;
import X.C26338AVi;
import X.C29S;
import X.C2U8;
import X.C32151Nz;
import X.C32I;
import X.C3C5;
import X.C47261Igj;
import X.C4P2;
import X.C4P3;
import X.C4P8;
import X.C53796L9k;
import X.C53955LFn;
import X.C62387Oe7;
import X.C62468OfQ;
import X.C62469OfR;
import X.C62477OfZ;
import X.C62483Off;
import X.C62494Ofq;
import X.C62497Oft;
import X.C62516OgC;
import X.C62546Ogg;
import X.C62590OhO;
import X.C62822Ol8;
import X.C76800UCe;
import X.C79045V0n;
import X.C7MY;
import X.C86793Y4n;
import X.C90903hW;
import X.EnumC110664Vy;
import X.EnumC62492Ofo;
import X.InterfaceC25830ABu;
import X.InterfaceC62474OfW;
import X.InterfaceC62480Ofc;
import X.InterfaceC62484Ofg;
import X.InterfaceC62486Ofi;
import X.InterfaceC62517OgD;
import X.InterfaceC62533OgT;
import X.InterfaceC62545Ogf;
import X.InterfaceC62736Ojk;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.J83;
import X.KNV;
import X.O6R;
import X.ORZ;
import X.OSJ;
import X.OSZ;
import X.OVR;
import X.OVT;
import X.ViewOnLayoutChangeListenerC62482Ofe;
import X.ViewTreeObserverOnGlobalLayoutListenerC61163NzT;
import Y.ARunnableS46S0100000_10;
import Y.IDComparatorS38S0000000_10;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.share.base.experiment.ContainerUIConfig;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SkeletonSharePanelFragment extends Fragment implements InterfaceC25830ABu, C4P8 {
    public TuxSheet LJLILLLLZI;
    public TuxTextView LJLJI;
    public BaseSharePackage LJLJJI;
    public C62387Oe7 LJLJJL;
    public boolean LJLJL;
    public InterfaceC62517OgD LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public float LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public int LJZL;
    public C25600zU LLD;
    public InterfaceC65784Pro<C76800UCe> LLFFF;
    public InterfaceC88472Yns<? super View, C76800UCe> LLFII;
    public View LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public Object LLIIIILZ;
    public HashMap LLIIIJ;
    public List<InterfaceC62480Ofc> LJLIL = new ArrayList();
    public boolean LJLJJLL = true;
    public final SkeletonSharePanelBehavior<View> LJLL = new SkeletonSharePanelBehavior<>();
    public int LJLLI = 1;
    public OSJ<? extends View, ? extends View, ? extends View> LL = new OSJ<>(null, null, null);
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS160S0100000_10(this, 357));
    public final ViewTreeObserverOnGlobalLayoutListenerC61163NzT LLFF = new ViewTreeObserverOnGlobalLayoutListenerC61163NzT(this);

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        return false;
    }

    public final View _$_findCachedViewById(int i) {
        if (this.LLIIIJ == null) {
            this.LLIIIJ = new HashMap();
        }
        View view = (View) this.LLIIIJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LLIIIJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getEnterMethod() {
        return (String) this.LLF.getValue();
    }

    public final void Al() {
        TuxSheet tuxSheet;
        OVT ovt;
        TuxSheet tuxSheet2;
        Dl(this.LJLJJLL);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.g69);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.post(new ARunnableS46S0100000_10(this, 56));
        }
        if (this.LLIFFJFJJ && (tuxSheet = this.LJLILLLLZI) != null && tuxSheet.isVisible() && (ovt = C62494Ofq.LJI) != null && !ovt.LIZIZ(this.LJLJL) && (tuxSheet2 = this.LJLILLLLZI) != null) {
            tuxSheet2.dismissAllowingStateLoss();
        }
    }

    public final void Gl() {
        Dialog dialog;
        Window window;
        TuxSheet tuxSheet = this.LJLILLLLZI;
        if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.clearFlags(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Il() {
        /*
            r7 = this;
            X.Ofg r1 = X.C62494Ofq.LIZ
            r6 = 0
            if (r1 == 0) goto L11
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r0 = r7.LJLJJI
            r5 = 0
            if (r0 == 0) goto L58
            boolean r1 = r1.LJIIJ(r0)
            r0 = 1
            if (r1 == r0) goto L12
        L11:
            return r6
        L12:
            X.Ofo r0 = X.C62483Off.LIZJ()
            X.Ofo r4 = X.EnumC62492Ofo.VERTICAL
            java.lang.String r3 = "sharePanelConfig"
            if (r0 != r4) goto L2a
            X.Oe7 r1 = r7.LJLJJL
            if (r1 == 0) goto L54
            java.util.List<X.Ofi> r0 = r1.LIZJ
            if (r0 == 0) goto L2a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4a
        L2a:
            r2 = 0
        L2b:
            java.lang.String r0 = r7.getEnterMethod()
            X.Ofo r0 = X.C4P2.LIZ(r0)
            if (r0 != r4) goto L48
            X.Oe7 r1 = r7.LJLJJL
            if (r1 == 0) goto L50
            boolean r0 = r1.LJIL
            if (r0 != 0) goto L48
            boolean r0 = r1.LJIIJJI
            if (r0 == 0) goto L48
            r0 = 1
        L42:
            if (r2 != 0) goto L46
            if (r0 == 0) goto L47
        L46:
            r6 = 1
        L47:
            return r6
        L48:
            r0 = 0
            goto L42
        L4a:
            boolean r0 = r1.LJIJI
            if (r0 != 0) goto L2a
            r2 = 1
            goto L2b
        L50:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r5
        L54:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r5
        L58:
            java.lang.String r0 = "sharePackage"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.Il():boolean");
    }

    public final boolean Jl() {
        C62387Oe7 c62387Oe7 = this.LJLJJL;
        if (c62387Oe7 != null) {
            if (c62387Oe7.LJJIIZ && c62387Oe7.LJJIIZI != null) {
                return true;
            }
            return false;
        }
        o.LJIJI("sharePanelConfig");
        throw null;
    }

    public final boolean Kl() {
        ArrayList LJII = C47261Igj.LJII("now_invite", "now_post", "now_video");
        BaseSharePackage baseSharePackage = this.LJLJJI;
        if (baseSharePackage != null) {
            boolean contains = LJII.contains(baseSharePackage.itemType);
            BaseSharePackage baseSharePackage2 = this.LJLJJI;
            if (baseSharePackage2 != null) {
                boolean z = baseSharePackage2.extras.getBoolean("is_match_campaign_condition", false);
                if (!contains && !z) {
                    return false;
                }
                return true;
            }
            o.LJIJI("sharePackage");
            throw null;
        }
        o.LJIJI("sharePackage");
        throw null;
    }

    public final void Ll() {
        ActivityC45651qj mo49getActivity;
        int i;
        OVT ovt = C62494Ofq.LJI;
        if (ovt != null && ovt.LIZIZ(this.LJLJL) && (mo49getActivity = mo49getActivity()) != null) {
            OVT ovt2 = C62494Ofq.LJI;
            if (ovt2 != null) {
                i = ovt2.LIZLLL(mo49getActivity);
            } else {
                i = 0;
            }
            View ll_skeleton_panel_root = _$_findCachedViewById(R.id.g69);
            o.LJIIIIZZ(ll_skeleton_panel_root, "ll_skeleton_panel_root");
            ViewGroup.LayoutParams layoutParams = ll_skeleton_panel_root.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int LJIILIIL = C86793Y4n.LJIILIIL(64.0d) + i;
                if (marginLayoutParams.getMarginEnd() != LJIILIIL) {
                    marginLayoutParams.setMarginEnd(LJIILIIL);
                    View ll_skeleton_panel_root2 = _$_findCachedViewById(R.id.g69);
                    o.LJIIIIZZ(ll_skeleton_panel_root2, "ll_skeleton_panel_root");
                    ll_skeleton_panel_root2.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void Ol() {
        InterfaceC62484Ofg interfaceC62484Ofg;
        C62387Oe7 c62387Oe7 = this.LJLJJL;
        if (c62387Oe7 != null) {
            EnumC62492Ofo enumC62492Ofo = c62387Oe7.LIZIZ;
            EnumC62492Ofo enumC62492Ofo2 = EnumC62492Ofo.COLLAPSE;
            if (enumC62492Ofo != enumC62492Ofo2 && (interfaceC62484Ofg = C62494Ofq.LIZ) != null) {
                BaseSharePackage baseSharePackage = this.LJLJJI;
                if (baseSharePackage != null) {
                    if (interfaceC62484Ofg.LJIIIZ(baseSharePackage) && this.LL.getFirst() != null && this.LL.getSecond() != null) {
                        View line_divider = _$_findCachedViewById(R.id.fs2);
                        o.LJIIIIZZ(line_divider, "line_divider");
                        line_divider.setVisibility(0);
                        this.LJLLLLLL = true;
                        if (C4P2.LIZJ()) {
                            return;
                        }
                        if (C4P2.LIZIZ(getEnterMethod()) == 0) {
                            if (Pl()) {
                                View childAt = ((ViewGroup) _$_findCachedViewById(R.id.g5x)).getChildAt(0);
                                if (childAt != null) {
                                    C26338AVi.LJI(childAt, null, AnonymousClass391.LIZJ(12), null, null, false, 29);
                                }
                                View fl_additional_container = _$_findCachedViewById(R.id.dc0);
                                o.LJIIIIZZ(fl_additional_container, "fl_additional_container");
                                C26338AVi.LJI(fl_additional_container, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), null, null, false, 29);
                                return;
                            }
                            View childAt2 = ((ViewGroup) _$_findCachedViewById(R.id.g5x)).getChildAt(0);
                            if (childAt2 == null) {
                                return;
                            }
                            C26338AVi.LJI(childAt2, null, AnonymousClass391.LIZJ(16), null, null, false, 29);
                            return;
                        }
                        if (Pl()) {
                            C62387Oe7 c62387Oe72 = this.LJLJJL;
                            if (c62387Oe72 != null) {
                                if (c62387Oe72.LIZIZ != enumC62492Ofo2) {
                                    View line_divider2 = _$_findCachedViewById(R.id.fs2);
                                    o.LJIIIIZZ(line_divider2, "line_divider");
                                    C26338AVi.LJI(line_divider2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(0), null, false, 24);
                                    View childAt3 = ((ViewGroup) _$_findCachedViewById(R.id.g5x)).getChildAt(0);
                                    if (childAt3 == null) {
                                        return;
                                    }
                                    C26338AVi.LJI(childAt3, null, KNV.LIZIZ(12.5d), null, null, false, 29);
                                    return;
                                }
                                View line_divider3 = _$_findCachedViewById(R.id.fs2);
                                o.LJIIIIZZ(line_divider3, "line_divider");
                                C26338AVi.LJI(line_divider3, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, AnonymousClass391.LIZJ(0), KNV.LIZIZ(12.5d), false, 18);
                                return;
                            }
                            o.LJIJI("sharePanelConfig");
                            throw null;
                        }
                        View line_divider4 = _$_findCachedViewById(R.id.fs2);
                        o.LJIIIIZZ(line_divider4, "line_divider");
                        C26338AVi.LJI(line_divider4, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(16.5d)))), false, 23);
                        return;
                    }
                } else {
                    o.LJIJI("sharePackage");
                    throw null;
                }
            }
            this.LJLLLLLL = false;
            return;
        }
        o.LJIJI("sharePanelConfig");
        throw null;
    }

    public final boolean Pl() {
        boolean z;
        boolean z2;
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg != null) {
            BaseSharePackage baseSharePackage = this.LJLJJI;
            if (baseSharePackage != null) {
                if (interfaceC62484Ofg.LJIIJ(baseSharePackage)) {
                    EnumC62492Ofo LIZJ = C62483Off.LIZJ();
                    EnumC62492Ofo enumC62492Ofo = EnumC62492Ofo.VERTICAL;
                    if (LIZJ == enumC62492Ofo) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C4P2.LIZ(getEnterMethod()) == enumC62492Ofo) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z && !z2) {
                        return false;
                    }
                    return true;
                }
            } else {
                o.LJIJI("sharePackage");
                throw null;
            }
        }
        return false;
    }

    public final void j6() {
        TuxSheet tuxSheet = this.LJLILLLLZI;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C62387Oe7 c62387Oe7 = this.LJLJJL;
            if (c62387Oe7 != null) {
                InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
                if (interfaceC62474OfW != null) {
                    BaseSharePackage baseSharePackage = this.LJLJJI;
                    if (baseSharePackage != null) {
                        interfaceC62474OfW.LIZLLL(mo49getActivity, baseSharePackage);
                        return;
                    } else {
                        o.LJIJI("sharePackage");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("sharePanelConfig");
            throw null;
        }
    }

    public final void wl() {
        List<InterfaceC62480Ofc> list = this.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            InterfaceC62480Ofc interfaceC62480Ofc = (InterfaceC62480Ofc) it.next();
            C62387Oe7 c62387Oe7 = this.LJLJJL;
            if (c62387Oe7 != null) {
                interfaceC62480Ofc.LIZJ(c62387Oe7);
                arrayList.add(C76800UCe.LIZ);
            } else {
                o.LJIJI("sharePanelConfig");
                throw null;
            }
        }
        List<InterfaceC62480Ofc> list2 = this.LJLIL;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((InterfaceC62480Ofc) next).LIZLLL()) {
                arrayList2.add(next);
            }
        }
        this.LJLIL = ORZ.LLJILJILJ(ORZ.LLILII(new IDComparatorS38S0000000_10(7), arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initView() {
        /*
            Method dump skipped, instructions count: 1949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.initView():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC62545Ogf interfaceC62545Ogf;
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LLFF);
        }
        Object obj = this.LLIIIILZ;
        if (obj != null && (interfaceC62545Ogf = C62494Ofq.LIZLLL) != null) {
            interfaceC62545Ogf.LIZ(obj);
        }
        InterfaceC62736Ojk interfaceC62736Ojk = C62494Ofq.LIZJ;
        if (interfaceC62736Ojk != null) {
            interfaceC62736Ojk.i("SkeletonShareFragment", "onDestroy");
        }
        super.onDestroy();
        this.LJLILLLLZI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.LLIIIJ;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InterfaceC62736Ojk interfaceC62736Ojk = C62494Ofq.LIZJ;
        if (interfaceC62736Ojk != null) {
            interfaceC62736Ojk.i("SkeletonShareFragment", "onPause");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC62736Ojk interfaceC62736Ojk = C62494Ofq.LIZJ;
        if (interfaceC62736Ojk != null) {
            interfaceC62736Ojk.i("SkeletonShareFragment", "onResume");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC62736Ojk interfaceC62736Ojk = C62494Ofq.LIZJ;
        if (interfaceC62736Ojk != null) {
            interfaceC62736Ojk.i("SkeletonShareFragment", "onStart");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        InterfaceC62736Ojk interfaceC62736Ojk = C62494Ofq.LIZJ;
        if (interfaceC62736Ojk != null) {
            interfaceC62736Ojk.i("SkeletonShareFragment", "onStop");
        }
    }

    public final void vl() {
        int i;
        int i2;
        int LIZIZ;
        View fl_additional_container = _$_findCachedViewById(R.id.dc0);
        o.LJIIIIZZ(fl_additional_container, "fl_additional_container");
        ViewGroup.LayoutParams layoutParams = fl_additional_container.getLayoutParams();
        if (this.LJLLI == 2) {
            i = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        } else {
            i = 0;
        }
        if (this.LJZ) {
            i += this.LJLZ;
        }
        int[] iArr = new int[2];
        _$_findCachedViewById(R.id.dfw).getLocationOnScreen(iArr);
        int i3 = this.LJZL;
        if (i3 <= 0) {
            int LIZIZ2 = J83.LIZIZ(mo49getActivity());
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            Resources resources = requireContext.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = resources.getDimensionPixelSize(identifier);
            } else {
                i2 = 0;
            }
            int i4 = (LIZIZ2 - i2) - iArr[1];
            View fl_primary_container = _$_findCachedViewById(R.id.dfw);
            o.LJIIIIZZ(fl_primary_container, "fl_primary_container");
            i3 = (i4 - fl_primary_container.getHeight()) - i;
            this.LJZL = i3;
        }
        if (this.LJZ && i3 < (LIZIZ = C7MY.LIZIZ(188))) {
            i3 = LIZIZ;
        }
        layoutParams.height = i3;
        View fl_additional_container2 = _$_findCachedViewById(R.id.dc0);
        o.LJIIIIZZ(fl_additional_container2, "fl_additional_container");
        fl_additional_container2.setLayoutParams(layoutParams);
        _$_findCachedViewById(R.id.dc0).setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r8 == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dl(boolean r12) {
        /*
            r11 = this;
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r11.LJLILLLLZI
            if (r0 == 0) goto L8e
            android.app.Dialog r4 = r0.getDialog()
            if (r4 == 0) goto L8e
            X.OOa r0 = X.C61822OOc.LIZ
            boolean r5 = r11.LJLJL
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r10 = r11.LJLJJI
            if (r10 == 0) goto L98
            r0.getClass()
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "dialog.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.view.Window r3 = r4.getWindow()
            X.ObG r0 = X.C62209ObF.LIZ(r1)
            r6 = 0
            if (r0 == 0) goto L96
            int r8 = r0.LIZJ
        L2b:
            int r0 = X.C63081OpJ.LJJJJLI(r1)
            int r8 = r8 - r0
            if (r3 == 0) goto L8e
            r7 = -1
            r2 = 1
            if (r12 == 0) goto L91
            android.os.Bundle r0 = r10.extras
            java.lang.String r9 = "enter_method"
            if (r0 == 0) goto L4a
            java.lang.String r1 = r0.getString(r9)
            if (r1 == 0) goto L4a
            java.lang.String r0 = "icon"
            boolean r0 = r1.equals(r0)
            if (r0 == r2) goto L5c
        L4a:
            android.os.Bundle r0 = r10.extras
            if (r0 == 0) goto L8f
            java.lang.String r1 = r0.getString(r9)
            if (r1 == 0) goto L8f
            java.lang.String r0 = "share_panel"
            boolean r0 = r1.equals(r0)
            if (r0 != r2) goto L8f
        L5c:
            X.C61820OOa.LIZIZ(r3, r7, r7)
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L68
            X.O09.LIZ(r0)
        L68:
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L71
            r0.setStatusBarColor(r6)
        L71:
            android.view.Window r1 = r4.getWindow()
            if (r1 == 0) goto L7c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r0)
        L7c:
            X.OVT r0 = X.C62494Ofq.LJI
            if (r0 == 0) goto L8b
            boolean r0 = r0.LIZIZ(r5)
            if (r0 != r2) goto L8b
            r0 = 80
            r3.setGravity(r0)
        L8b:
            r4.setCanceledOnTouchOutside(r2)
        L8e:
            return
        L8f:
            if (r8 != 0) goto L92
        L91:
            r8 = -1
        L92:
            X.C61820OOa.LIZIZ(r3, r7, r8)
            goto L7c
        L96:
            r8 = 0
            goto L2b
        L98:
            java.lang.String r0 = "sharePackage"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.Dl(boolean):void");
    }

    public final Integer Hl(C25600zU c25600zU) {
        int backgroundInShare;
        int i;
        OVT ovt = C62494Ofq.LJI;
        if (ovt != null && ovt.LIZIZ(this.LJLJL)) {
            i = R.attr.g9;
        } else {
            String panelSource = getEnterMethod();
            o.LJIIIZ(panelSource, "panelSource");
            ContainerUIConfig LIZ = C4P3.LIZ();
            if (TextUtils.equals(panelSource, "long_press")) {
                backgroundInShare = LIZ.getBackgroundInLongPress();
            } else {
                backgroundInShare = LIZ.getBackgroundInShare();
            }
            if (backgroundInShare == 0) {
                C62387Oe7 c62387Oe7 = this.LJLJJL;
                if (c62387Oe7 != null) {
                    if (!c62387Oe7.LJJ) {
                        i = R.attr.ep;
                    }
                } else {
                    o.LJIJI("sharePanelConfig");
                    throw null;
                }
            }
            i = R.attr.el;
        }
        return C79045V0n.LJI(i, c25600zU);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ml(int r13) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.Ml(int):void");
    }

    @Override // X.C4P8
    public final void O0(int i) {
        C26255ASd c26255ASd;
        C26255ASd c26255ASd2;
        int i2 = this.LJLLI;
        if (i2 == 2) {
            int peekHeight = this.LJLL.getPeekHeight() + i;
            TuxSheet LJIIIZ = ASQ.LJIIIZ(this);
            if (LJIIIZ == null || (c26255ASd2 = LJIIIZ.LLFFF) == null) {
                return;
            }
            c26255ASd2.setDynamicPeekHeightPx$tux_theme_release(peekHeight);
            return;
        }
        if (i2 != 1) {
            return;
        }
        int peekHeight2 = this.LJLL.getPeekHeight() + i;
        TuxSheet LJIIIZ2 = ASQ.LJIIIZ(this);
        if (LJIIIZ2 == null || (c26255ASd = LJIIIZ2.LLFFF) == null) {
            return;
        }
        c26255ASd.setFixedHeightPx$tux_theme_release(peekHeight2);
    }

    @Override // X.C4P8
    public final void Vd(ASU asu) {
        ASQ.LJ(this, asu);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        C62468OfQ.LIZLLL(true);
        super.onAttach(context);
    }

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
        if (!this.LJLLL && f < -0.02d) {
            this.LJLLL = true;
            this.LJLL.setSkipCollapsed(true);
        }
        if (this.LJLLLL < f) {
            this.LJLLL = false;
            this.LJLL.setSkipCollapsed(false);
        }
        this.LJLLLL = f;
    }

    public final void Nl(Map<String, String> map, boolean z) {
        Context context = getContext();
        if (context != null) {
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                InterfaceC62480Ofc interfaceC62480Ofc = (InterfaceC62480Ofc) it.next();
                if (interfaceC62480Ofc instanceof C62477OfZ) {
                    C62387Oe7 c62387Oe7 = this.LJLJJL;
                    if (c62387Oe7 != null) {
                        C62477OfZ shareActionBar = (C62477OfZ) interfaceC62480Ofc;
                        o.LJIIIZ(shareActionBar, "shareActionBar");
                        shareActionBar.setVisibility(0);
                        shareActionBar.setActionAdapter(shareActionBar.getConfigActionAdapter());
                        List<InterfaceC62486Ofi> actions = c62387Oe7.LIZJ;
                        o.LJIIIZ(actions, "actions");
                        shareActionBar.LJLJI = actions;
                        AbstractC62496Ofs abstractC62496Ofs = shareActionBar.LJLJJLL;
                        if (abstractC62496Ofs != null) {
                            abstractC62496Ofs.setData(actions);
                        }
                        List<Integer> indexes = c62387Oe7.LIZLLL;
                        o.LJIIIZ(indexes, "indexes");
                        shareActionBar.LJLJJI = indexes;
                        AbstractC62496Ofs abstractC62496Ofs2 = shareActionBar.LJLJJLL;
                        if (abstractC62496Ofs2 != null) {
                            abstractC62496Ofs2.LJLLLLLL(indexes);
                        }
                        shareActionBar.LJLJJL = new C62469OfR(c62387Oe7, context, shareActionBar, this, context, c62387Oe7.LJIIJ);
                        InterfaceC65784Pro<Boolean> interfaceC65784Pro = c62387Oe7.LJIILL;
                        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
                            shareActionBar.postDelayed(new ARunnableS46S0100000_10(shareActionBar, 97), 300L);
                        }
                    } else {
                        o.LJIJI("sharePanelConfig");
                        throw null;
                    }
                } else if (interfaceC62480Ofc instanceof C113914dX) {
                    C62387Oe7 c62387Oe72 = this.LJLJJL;
                    if (c62387Oe72 != null) {
                        C114044dk.LIZ(c62387Oe72, (C113914dX) interfaceC62480Ofc, context, this);
                    } else {
                        o.LJIJI("sharePanelConfig");
                        throw null;
                    }
                } else if (interfaceC62480Ofc.getWidgetType() == EnumC110664Vy.IM_HEADER && z) {
                    InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
                    if (interfaceC62484Ofg != null) {
                        C25600zU c25600zU = this.LLD;
                        if (c25600zU == null) {
                            Context context2 = getContext();
                            interfaceC62484Ofg.LJII();
                            c25600zU = new C25600zU(context2, R.style.ul);
                        }
                        interfaceC62480Ofc.LJIIIIZZ(c25600zU, this, this);
                    }
                    interfaceC62480Ofc.setUpAdditionView(this);
                }
                interfaceC62480Ofc.LJI();
            }
        }
    }

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
        if (i == 4 && this.LJLJLLL) {
            vl();
            this.LJLJLLL = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C53955LFn c53955LFn;
        boolean z;
        int i;
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        String string;
        View view2;
        String str2;
        C53955LFn c53955LFn2;
        InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns;
        int i2;
        Window window2;
        View decorView2;
        ViewTreeObserver viewTreeObserver2;
        String string2;
        OVR ovr;
        List<InterfaceC62480Ofc> list;
        Dialog dialog;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        TuxSheet tuxSheet = this.LJLILLLLZI;
        String str3 = null;
        if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null) {
            InterfaceC62517OgD interfaceC62517OgD = this.LJLJLJ;
            if (interfaceC62517OgD != null) {
                interfaceC62517OgD.LIZLLL(dialog);
            } else {
                o.LJIJI("directionProxy");
                throw null;
            }
        }
        String str4 = "";
        if (this.LLIIII) {
            InterfaceC62736Ojk interfaceC62736Ojk = C62494Ofq.LIZJ;
            if (interfaceC62736Ojk != null) {
                interfaceC62736Ojk.i("SkeletonShareFragment", "onViewCreated use optimized version");
            }
            SystemClock.elapsedRealtime();
            this.LJZI = false;
            this.LJLJLLL = false;
            View fl_additional_container = _$_findCachedViewById(R.id.dc0);
            o.LJIIIIZZ(fl_additional_container, "fl_additional_container");
            fl_additional_container.setVisibility(8);
            Ml(8);
            Dl(this.LJLJJLL);
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            SoftReference softReference = (SoftReference) ((LinkedHashMap) C53796L9k.LIZ).get(Integer.valueOf(C53796L9k.LIZ(requireActivity, getEnterMethod(), Boolean.valueOf(Jl()))));
            if (softReference != null && (ovr = (OVR) softReference.get()) != null && (list = ovr.LJLILLLLZI) != null) {
                ((ArrayList) this.LJLIL).clear();
                ((ArrayList) this.LJLIL).addAll(list);
            }
            wl();
            initView();
            OSZ[] oszArr = new OSZ[3];
            Bundle arguments = getArguments();
            if (arguments == null || (str2 = arguments.getString("event_type", "")) == null) {
                str2 = "";
            }
            oszArr[0] = new OSZ("enter_from", str2);
            oszArr[1] = new OSZ("enter_method", getEnterMethod());
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (string2 = arguments2.getString("group_id", "")) != null) {
                str4 = string2;
            }
            oszArr[2] = new OSZ("group_id", str4);
            Nl(C113554cx.LJJL(oszArr), true);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (window2 = mo49getActivity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null && (viewTreeObserver2 = decorView2.getViewTreeObserver()) != null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.LLFF);
            }
            InterfaceC62545Ogf interfaceC62545Ogf = C62494Ofq.LIZLLL;
            if (interfaceC62545Ogf != null) {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null) {
                    i2 = mo49getActivity2.hashCode();
                } else {
                    i2 = 0;
                }
                c53955LFn2 = interfaceC62545Ogf.LIZIZ(i2, new C62516OgC(this));
            } else {
                c53955LFn2 = null;
            }
            this.LLIIIILZ = c53955LFn2;
            InterfaceC62533OgT interfaceC62533OgT = C62494Ofq.LJFF;
            if (interfaceC62533OgT != null) {
                interfaceC62533OgT.LJI();
                interfaceC62533OgT.LIZIZ(null, C62590OhO.LJLIL);
            }
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLFFF;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            View view3 = this.LLFZ;
            if (view3 != null && (interfaceC88472Yns = this.LLFII) != null) {
                interfaceC88472Yns.invoke(view3);
            }
            SystemClock.elapsedRealtime();
            C62468OfQ.LJJIIJ = 0;
        } else {
            InterfaceC62736Ojk interfaceC62736Ojk2 = C62494Ofq.LIZJ;
            if (interfaceC62736Ojk2 != null) {
                interfaceC62736Ojk2.i("SkeletonShareFragment", "onViewCreated use normal version");
            }
            Dl(this.LJLJJLL);
            String enterMethod = getEnterMethod();
            C25600zU c25600zU = this.LLD;
            if (c25600zU != null) {
                ((ArrayList) this.LJLIL).add(new C62477OfZ(c25600zU, null, enterMethod, 2));
                if (o.LJ(enterMethod, "long_press")) {
                    if (C113994df.LIZ().getVisibleInLongPress()) {
                        ((ArrayList) this.LJLIL).add(new C113914dX(c25600zU, null, enterMethod, 2));
                    }
                } else {
                    ((ArrayList) this.LJLIL).add(new C113914dX(c25600zU, null, enterMethod, 2));
                }
            }
            wl();
            initView();
            OSZ[] oszArr2 = new OSZ[3];
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (str = arguments3.getString("event_type", "")) == null) {
                str = "";
            }
            oszArr2[0] = new OSZ("enter_from", str);
            oszArr2[1] = new OSZ("enter_method", getEnterMethod());
            Bundle arguments4 = getArguments();
            if (arguments4 != null && (string = arguments4.getString("group_id", "")) != null) {
                str4 = string;
            }
            oszArr2[2] = new OSZ("group_id", str4);
            Nl(C113554cx.LJJL(oszArr2), false);
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 != null && (window = mo49getActivity3.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.LLFF);
            }
            InterfaceC62545Ogf interfaceC62545Ogf2 = C62494Ofq.LIZLLL;
            if (interfaceC62545Ogf2 != null) {
                ActivityC45651qj mo49getActivity4 = mo49getActivity();
                if (mo49getActivity4 != null) {
                    i = mo49getActivity4.hashCode();
                } else {
                    i = 0;
                }
                c53955LFn = interfaceC62545Ogf2.LIZIZ(i, new C62497Oft(this));
            } else {
                c53955LFn = null;
            }
            this.LLIIIILZ = c53955LFn;
            InterfaceC62533OgT interfaceC62533OgT2 = C62494Ofq.LJFF;
            if (interfaceC62533OgT2 != null) {
                interfaceC62533OgT2.LJI();
                interfaceC62533OgT2.LIZIZ(null, C62546Ogg.LJLIL);
            }
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LLFFF;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
            InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns2 = this.LLFII;
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(view);
            }
            C62387Oe7 c62387Oe7 = this.LJLJJL;
            if (c62387Oe7 != null) {
                Iterator<InterfaceC62486Ofi> it = c62387Oe7.LIZJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC62486Ofi next = it.next();
                    if (o.LJ(next.key(), "favorite")) {
                        if (next != null) {
                            z = true;
                        }
                    }
                }
                z = false;
                Bundle arguments5 = getArguments();
                if (arguments5 != null) {
                    str3 = arguments5.getString("group_id");
                }
                C2U8.LIZ(new C203877zL(str3, z));
            } else {
                o.LJIJI("sharePanelConfig");
                throw null;
            }
        }
        this.LJLJI = (TuxTextView) view.findViewById(R.id.c41);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.deq);
        if (frameLayout != null) {
            frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC62482Ofe(frameLayout, this));
        }
        if (this.LLII && (view2 = this.LLFZ) != null) {
            Map<Integer, SoftReference<OVR>> map = C53796L9k.LIZ;
            ActivityC45651qj requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            Integer valueOf = Integer.valueOf(C53796L9k.LIZ(requireActivity2, getEnterMethod(), Boolean.valueOf(Jl())));
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.LJLIL);
            map.put(valueOf, new SoftReference<>(new OVR(view2, arrayList, OSJ.copy$default(this.LL, null, null, null, 7, null))));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        Dialog dialog;
        int i;
        ViewParent viewParent;
        ViewParent viewParent2;
        o.LJIIIZ(inflater, "inflater");
        this.LLD = C119364mK.LIZ(getContext());
        this.LLIIII = false;
        C29S c29s = null;
        if (this.LLFZ == null || !this.LLII) {
            TuxSheet tuxSheet = this.LJLILLLLZI;
            if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null) {
                InterfaceC62517OgD interfaceC62517OgD = this.LJLJLJ;
                if (interfaceC62517OgD != null) {
                    OVT ovt = C62494Ofq.LJI;
                    if (ovt != null && ovt.LIZIZ(this.LJLJL)) {
                        this.LLIFFJFJJ = true;
                        i = R.layout.bms;
                    } else {
                        i = R.layout.bmr;
                    }
                    view = interfaceC62517OgD.LIZJ(dialog, i, getView(), null, this.LLD);
                } else {
                    o.LJIJI("directionProxy");
                    throw null;
                }
            } else {
                view = null;
            }
            this.LLFZ = view;
            if (view != null) {
                view.setTag("SKELETON_SHARE_FRAGMENT_ROOT_VIEW");
            }
        } else {
            this.LLIIII = true;
        }
        View view2 = this.LLFZ;
        if (view2 != null) {
            viewParent = view2.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent != null && this.LLII) {
            View view3 = this.LLFZ;
            if (view3 != null) {
                viewParent2 = view3.getParent();
            } else {
                viewParent2 = null;
            }
            if (!(viewParent2 instanceof ViewGroup)) {
                viewParent2 = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewParent2;
            if (viewGroup2 != null) {
                C16880lQ.LJLLL(this.LLFZ, viewGroup2);
            }
        }
        View view4 = this.LLFZ;
        if (!(view4 instanceof View)) {
            view4 = null;
        }
        if (view4 != null) {
            try {
                ViewTreeLifecycleOwner.set(view4, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view4, this);
                C10A.LIZIZ(view4, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tux.sheet.sheet.TuxSheet xl(X.C62387Oe7 r10, X.ActivityC45651qj r11, android.view.View r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment.xl(X.Oe7, X.1qj, android.view.View, boolean):com.bytedance.tux.sheet.sheet.TuxSheet");
    }
}
