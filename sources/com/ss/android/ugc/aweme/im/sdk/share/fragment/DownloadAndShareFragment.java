package com.ss.android.ugc.aweme.im.sdk.share.fragment;

import X.ASL;
import X.AbstractC62515OgB;
import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.AnonymousClass636;
import X.C107114Ih;
import X.C107124Ii;
import X.C109034Pr;
import X.C10A;
import X.C113914dX;
import X.C141335gf;
import X.C16880lQ;
import X.C214738bl;
import X.C235119Kp;
import X.C29S;
import X.C2IP;
import X.C2U8;
import X.C3C5;
import X.C62387Oe7;
import X.C65352Pkq;
import X.C71745SDt;
import X.C76800UCe;
import X.C7MY;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.InterfaceC59622Vq;
import X.InterfaceC65784Pro;
import X.LRD;
import Y.AObserverS69S0100000_1;
import Y.IDDListenerS99S0200000_1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.im.sdk.share.fragment.DownloadAndShareFragment;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.DownloadAndShareViewModel;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS47S0400000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DownloadAndShareFragment extends BaseFragment implements InterfaceC219588ja {
    public volatile boolean LJLILLLLZI;
    public TuxSheet LJLJI;
    public SharePackage LJLJJI;
    public C62387Oe7 LJLJJL;
    public RecyclerView LJLJJLL;
    public C113914dX LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public ConstraintLayout LJLL;
    public C109034Pr LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C214738bl LJLIL = C71745SDt.LIZ(this, C65352Pkq.LIZ(DownloadAndShareViewModel.class), new AqS151S0100000_1((InterfaceC65784Pro) new AqS151S0100000_1((Fragment) this, 666), 667), new AqS151S0100000_1(this, 668));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final DownloadAndShareViewModel vl() {
        return (DownloadAndShareViewModel) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        String string = getResources().getString(R.string.r5i);
        o.LJIIIIZZ(string, "resources.getString(R.string.share_to)");
        C62387Oe7 value = vl().LJLIL.getValue();
        if (value != null && value.LJ) {
            return null;
        }
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        return c235119Kp;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        SharePackage sharePackage;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (sharePackage = (SharePackage) arguments.getParcelable("SharePackage")) != null) {
            this.LJLJJI = sharePackage;
        }
    }

    public final void wl(C62387Oe7 c62387Oe7) {
        if (!this.LJLILLLLZI) {
            return;
        }
        C113914dX c113914dX = this.LJLJL;
        if (c113914dX != null) {
            final Context requireContext = requireContext();
            final SharePackage sharePackage = this.LJLJJI;
            if (sharePackage != null) {
                c113914dX.LJLJJL = new AbstractC62515OgB(requireContext, sharePackage) { // from class: X.4Wk
                    @Override // X.AbstractC62515OgB
                    public final void LIZ(InterfaceC62225ObV channel, View view) {
                        boolean LIZLLL;
                        o.LJIIIZ(channel, "channel");
                        DownloadAndShareViewModel vl = DownloadAndShareFragment.this.vl();
                        Context requireContext2 = DownloadAndShareFragment.this.requireContext();
                        o.LJIIIIZZ(requireContext2, "requireContext()");
                        C62387Oe7 value = vl.LJLIL.getValue();
                        if (value != null) {
                            if (!channel.LJIILJJIL()) {
                                value.LJIIJ.getClass();
                                if (!(r0 instanceof HybridImageSharePackage)) {
                                    vl.LJLILLLLZI.setValue(Boolean.TRUE);
                                }
                            }
                            LIZLLL = value.LJIIJ.LIZLLL(channel, requireContext2, view, null, new AqS47S0400000_1(requireContext2, vl, channel, value, 3));
                            if (!LIZLLL) {
                                value.LJIIJ.LJIILIIL(channel, new AqS47S0400000_1(requireContext2, vl, channel, value, 2));
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(requireContext, sharePackage);
                        o.LJIIIIZZ(requireContext, "requireContext()");
                    }
                };
            } else {
                o.LJIJI("sharePackage");
                throw null;
            }
        }
        if (!c62387Oe7.LJIIJJI) {
            RecyclerView recyclerView = this.LJLJJLL;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            View view = this.LJLJLJ;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.LJLJLLL;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        ConstraintLayout constraintLayout = this.LJLL;
        if (constraintLayout != null) {
            anonymousClass064.LJII(constraintLayout);
            anonymousClass064.LJIIIIZZ(R.id.cdn, 3, R.id.jsw, 4);
            ConstraintLayout constraintLayout2 = this.LJLL;
            if (constraintLayout2 != null) {
                anonymousClass064.LIZIZ(constraintLayout2);
                if (!c62387Oe7.LJ) {
                    C113914dX c113914dX2 = this.LJLJL;
                    if (c113914dX2 != null) {
                        c113914dX2.setVisibility(0);
                    }
                } else {
                    C113914dX c113914dX3 = this.LJLJL;
                    if (c113914dX3 != null) {
                        c113914dX3.setVisibility(8);
                    }
                    View view3 = this.LJLJLJ;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                C113914dX c113914dX4 = this.LJLJL;
                if (c113914dX4 != null) {
                    c113914dX4.LJIIJ(c62387Oe7.LIZ, false);
                    return;
                }
                return;
            }
            o.LJIJI("parentLayout");
            throw null;
        }
        o.LJIJI("parentLayout");
        throw null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        C107124Ii LJIIJ;
        View findViewById;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        this.LJLL = constraintLayout;
        if (this.LJLJJI == null) {
            return;
        }
        this.LJLJJLL = (RecyclerView) constraintLayout.findViewById(R.id.bs6);
        ConstraintLayout constraintLayout2 = this.LJLL;
        if (constraintLayout2 != null) {
            this.LJLJL = (C113914dX) constraintLayout2.findViewById(R.id.jsw);
            ConstraintLayout constraintLayout3 = this.LJLL;
            if (constraintLayout3 != null) {
                this.LJLJLJ = constraintLayout3.findViewById(R.id.cdn);
                ConstraintLayout constraintLayout4 = this.LJLL;
                if (constraintLayout4 != null) {
                    this.LJLJLLL = constraintLayout4.findViewById(R.id.joj);
                    C113914dX c113914dX = this.LJLJL;
                    if (c113914dX != null) {
                        c113914dX.setVisibility(8);
                    }
                    C113914dX c113914dX2 = this.LJLJL;
                    if (c113914dX2 != null && (findViewById = c113914dX2.findViewById(R.id.b9k)) != null) {
                        findViewById.setPaddingRelative(findViewById.getPaddingStart(), C7MY.LIZIZ(4), findViewById.getPaddingEnd(), findViewById.getPaddingBottom());
                    }
                    SharePackage sharePackage = this.LJLJJI;
                    if (sharePackage != null) {
                        if (sharePackage.extras != null && (LJIIJ = vl().LJLJLJ.LJIIJ()) != null) {
                            vl().LJLJLJ.getClass();
                            if (!SharePanelViewModel.LIZJ(LJIIJ)) {
                                ConstraintLayout constraintLayout5 = this.LJLL;
                                if (constraintLayout5 != null) {
                                    C107114Ih c107114Ih = (C107114Ih) constraintLayout5.findViewById(R.id.l8r);
                                    c107114Ih.LIZLLL(true);
                                    c107114Ih.LIZJ(LJIIJ);
                                } else {
                                    o.LJIJI("parentLayout");
                                    throw null;
                                }
                            }
                        }
                        DownloadAndShareViewModel vl = vl();
                        vl.LJLILLLLZI.observe(getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 133));
                        vl.LJLIL.observe(getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 134));
                        vl.LJLJI.observe(getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 135));
                        vl.LJLJJI.observe(getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 136));
                        vl.LJLJJLL.observe(getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 137));
                        View view2 = this.LJLJLJ;
                        if (view2 != null) {
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            if (layoutParams != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.topMargin = 0;
                                marginLayoutParams.height = C7MY.LIZIZ(8);
                                view2.setLayoutParams(marginLayoutParams);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                        }
                        View view3 = this.LJLJLJ;
                        if (view3 != null) {
                            Context context2 = constraintLayout.getContext();
                            o.LJIIIIZZ(context2, "view.context");
                            view3.setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.ds, context2)));
                        }
                        C109034Pr c109034Pr = new C109034Pr(vl().LJLJLJ);
                        this.LJLLI = c109034Pr;
                        RecyclerView recyclerView = this.LJLJJLL;
                        if (recyclerView != null) {
                            recyclerView.setAdapter(c109034Pr);
                        }
                        RecyclerView recyclerView2 = this.LJLJJLL;
                        if (recyclerView2 != null) {
                            getContext();
                            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
                        }
                        C109034Pr c109034Pr2 = this.LJLLI;
                        if (c109034Pr2 != null) {
                            c109034Pr2.setData(null);
                            vl().LJLJLJ.LJIILIIL();
                            if (this.LJLJJL != null && (context = getContext()) != null) {
                                DownloadAndShareViewModel vl2 = vl();
                                C62387Oe7 c62387Oe7 = this.LJLJJL;
                                o.LJI(c62387Oe7);
                                vl2.gv0(c62387Oe7, context);
                            }
                            if (vl().LJLIL.getValue() != null) {
                                C62387Oe7 value = vl().LJLIL.getValue();
                                o.LJI(value);
                                wl(value);
                                return;
                            }
                            return;
                        }
                        o.LJIJI("contactListAdapter");
                        throw null;
                    }
                    o.LJIJI("sharePackage");
                    throw null;
                }
                o.LJIJI("parentLayout");
                throw null;
            }
            o.LJIJI("parentLayout");
            throw null;
        }
        o.LJIJI("parentLayout");
        throw null;
    }

    public final void xl(C62387Oe7 c62387Oe7, ActivityC45651qj activityC45651qj) {
        Resources resources;
        DisplayMetrics displayMetrics;
        this.LJLJJL = c62387Oe7;
        if (!this.LJLILLLLZI) {
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            if (supportFragmentManager == null || (resources = activityC45651qj.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                return;
            }
            float f = displayMetrics.heightPixels;
            ASL asl = new ASL();
            asl.LIZ.LJLLJ = false;
            asl.LJI(2);
            asl.LIZJ((int) (0.5f * f), (int) (f * 0.7f));
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJZL = true;
            tuxSheet.LJZI = true;
            tuxSheet.LJLILLLLZI = new IDDListenerS99S0200000_1(this, activityC45651qj, 0);
            tuxSheet.LJLLILLLL = this;
            this.LJLJI = tuxSheet;
            tuxSheet.show(supportFragmentManager, "DownloadAndShareFragment");
            C2U8.LIZ(new C2IP(true, true));
            this.LJLILLLLZI = true;
            LRD.LIZ(activityC45651qj).LJIIJ("downloaded_video_share_dialog", true, new InterfaceC59622Vq() { // from class: X.4L9
                @Override // X.InterfaceC59622Vq
                public final void LIZ() {
                    TuxSheet tuxSheet2 = DownloadAndShareFragment.this.LJLJI;
                    if (tuxSheet2 != null) {
                        tuxSheet2.dismiss();
                    } else {
                        o.LJIJI("sheet");
                        throw null;
                    }
                }
            });
            FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
            if (LJIIZILJ == null) {
                return;
            }
            LJIIZILJ.LJIILLIIL(true);
            return;
        }
        DownloadAndShareViewModel vl = vl();
        C62387Oe7 c62387Oe72 = this.LJLJJL;
        o.LJI(c62387Oe72);
        vl.gv0(c62387Oe72, activityC45651qj);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b1t, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
