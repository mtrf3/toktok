package com.bytedance.android.live.effect.karaoke.view.library;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C0CM;
import X.C0KV;
import X.C0KW;
import X.C0KX;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1EZ;
import X.C21210sP;
import X.C279917z;
import X.C29306Beo;
import X.C29551Dz;
import X.C29S;
import X.C2AW;
import X.C2B5;
import X.C30331Gz;
import X.C3C5;
import X.C41221ja;
import X.C51029K0z;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.XKX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class KaraokePageFragment extends BaseFragment {
    public C0KV LJLIL;
    public C0CM LJLILLLLZI;
    public C41221ja LJLJI;
    public C30331Gz LJLJJI;
    public View LJLJJL;
    public KaraokeViewModel LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        KaraokeViewModel karaokeViewModel = this.LJLJJLL;
        if (karaokeViewModel != null) {
            C0KV c0kv = this.LJLIL;
            if (c0kv != null) {
                int selectedTabPosition = c0kv.getSelectedTabPosition();
                if (karaokeViewModel.LL) {
                    karaokeViewModel.LJLJLLL = selectedTabPosition;
                }
            } else {
                o.LJIJI("tabLayout");
                throw null;
            }
        }
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        C29551Dz nv0;
        C29551Dz nv02;
        super.onResume();
        C30331Gz c30331Gz = this.LJLJJI;
        C279917z c279917z = null;
        if (c30331Gz != null) {
            KaraokeViewModel karaokeViewModel = this.LJLJJLL;
            if (karaokeViewModel != null && (nv02 = karaokeViewModel.nv0()) != null) {
                c279917z = nv02.LIZJ();
            }
            KaraokeViewModel karaokeViewModel2 = this.LJLJJLL;
            if (karaokeViewModel2 != null && (nv0 = karaokeViewModel2.nv0()) != null) {
                z = nv0.LIZIZ;
            } else {
                z = false;
            }
            c30331Gz.LJJLL(c279917z, z);
            return;
        }
        o.LJIJI("controllerView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "4453550299028110429");
        if (c03880Dg.LIZJ(10501, "com/bytedance/android/live/effect/karaoke/view/library/KaraokePageFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/android/live/effect/karaoke/view/library/KaraokePageFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder("f");
        C0CM c0cm = this.LJLILLLLZI;
        if (c0cm != null) {
            sb.append(c0cm.getCurrentItem());
            Fragment LJJJIL = childFragmentManager.LJJJIL(sb.toString());
            if (LJJJIL != null && LJJJIL.isAdded()) {
                LJJJIL.onHiddenChanged(z);
            }
            c03880Dg.LIZIZ(10501, "com/bytedance/android/live/effect/karaoke/view/library/KaraokePageFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
            return;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJLL = C21210sP.LIZJ(C51029K0z.LJIILIIL(this));
        View findViewById = view.findViewById(R.id.kyt);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tab_layout)");
        C0KV c0kv = (C0KV) findViewById;
        this.LJLIL = c0kv;
        c0kv.setTabIconTintResource(R.color.a60);
        View findViewById2 = view.findViewById(R.id.ncx);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.viewpager)");
        this.LJLILLLLZI = (C0CM) findViewById2;
        View initView$lambda$0 = view.findViewById(R.id.nbg);
        o.LJIIIIZZ(initView$lambda$0, "initView$lambda$0");
        C29306Beo.LJJJLL(initView$lambda$0, 500L, new IDqS416S0100000(this, 100));
        this.LJLJJL = initView$lambda$0;
        View findViewById3 = view.findViewById(R.id.bv1);
        C30331Gz c30331Gz = (C30331Gz) findViewById3;
        IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(this, 101);
        c30331Gz.getClass();
        c30331Gz.LJLJJL = iDqS416S0100000;
        o.LJIIIIZZ(findViewById3, "view.findViewById<Karaok…}\n            }\n        }");
        this.LJLJJI = (C30331Gz) findViewById3;
        C41221ja c41221ja = new C41221ja(this);
        this.LJLJI = c41221ja;
        C0CM c0cm = this.LJLILLLLZI;
        if (c0cm != null) {
            c0cm.setAdapter(c41221ja);
            C0CM c0cm2 = this.LJLILLLLZI;
            if (c0cm2 != null) {
                c0cm2.setOffscreenPageLimit(3);
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                if (LJIILIIL != null) {
                    bool = Boolean.valueOf(C29306Beo.LJIIJ(LJIILIIL));
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool)) {
                    C30331Gz c30331Gz2 = this.LJLJJI;
                    if (c30331Gz2 != null) {
                        C29306Beo.LJJLJLI(c30331Gz2);
                        View view2 = this.LJLJJL;
                        if (view2 != null) {
                            C29306Beo.LJI(view2);
                        } else {
                            o.LJIJI("queueBtn");
                            throw null;
                        }
                    } else {
                        o.LJIJI("controllerView");
                        throw null;
                    }
                } else {
                    C30331Gz c30331Gz3 = this.LJLJJI;
                    if (c30331Gz3 != null) {
                        C29306Beo.LJI(c30331Gz3);
                        View view3 = this.LJLJJL;
                        if (view3 != null) {
                            C29306Beo.LJJLJLI(view3);
                        } else {
                            o.LJIJI("queueBtn");
                            throw null;
                        }
                    } else {
                        o.LJIJI("controllerView");
                        throw null;
                    }
                }
                C0KV c0kv2 = this.LJLIL;
                if (c0kv2 != null) {
                    c0kv2.LIZ(new C1EZ(C51029K0z.LJIILIIL(this), true, this.LJLJJLL));
                    C0KV c0kv3 = this.LJLIL;
                    if (c0kv3 != null) {
                        C0CM c0cm3 = this.LJLILLLLZI;
                        if (c0cm3 != null) {
                            new C0KX(c0kv3, c0cm3, true, new C0KW() { // from class: X.1Hr
                                @Override // X.C0KW
                                public final void LIZ(C0KT c0kt, int i2) {
                                    boolean z;
                                    KaraokePageFragment karaokePageFragment = KaraokePageFragment.this;
                                    C41221ja c41221ja2 = karaokePageFragment.LJLJI;
                                    Boolean bool2 = null;
                                    if (c41221ja2 != null) {
                                        AnonymousClass015 anonymousClass015 = (AnonymousClass015) ListProtector.get(c41221ja2.LJLL, i2);
                                        KaraokeViewModel karaokeViewModel = karaokePageFragment.LJLJJLL;
                                        if (karaokeViewModel != null) {
                                            if (karaokeViewModel.LJLIL.LJIIIZ == anonymousClass015.LIZ) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            bool2 = Boolean.valueOf(z);
                                        }
                                        if (C29306Beo.LJJIFFI(bool2)) {
                                            C0KV c0kv4 = c0kt.LJII;
                                            if (c0kv4 != null) {
                                                c0kt.LIZIZ = C20110qd.LIZ(c0kv4.getContext(), R.drawable.crv);
                                                c0kt.LIZJ();
                                            } else {
                                                throw new IllegalArgumentException("Tab not attached to a TabLayout");
                                            }
                                        } else {
                                            c0kt.LIZIZ(anonymousClass015.LIZIZ);
                                        }
                                        c0kt.LIZ = Long.valueOf(anonymousClass015.LIZ);
                                        return;
                                    }
                                    o.LJIJI("viewPagerAdapter");
                                    throw null;
                                }
                            }).LIZ();
                            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2B5(this, null), 3);
                            C30331Gz c30331Gz4 = this.LJLJJI;
                            if (c30331Gz4 != null) {
                                KaraokeViewModel karaokeViewModel = this.LJLJJLL;
                                if (karaokeViewModel != null) {
                                    i = (int) karaokeViewModel.LJLJLJ.LIZLLL;
                                } else {
                                    i = 0;
                                }
                                c30331Gz4.LJJLJLI(i);
                                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2AW(this, null), 3);
                                return;
                            }
                            o.LJIJI("controllerView");
                            throw null;
                        }
                        o.LJIJI("viewPager");
                        throw null;
                    }
                    o.LJIJI("tabLayout");
                    throw null;
                }
                o.LJIJI("tabLayout");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d_4, viewGroup, false);
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
