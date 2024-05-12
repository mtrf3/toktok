package com.bytedance.android.live.effect.karaoke.view.playlist;

import X.ActivityC45651qj;
import X.C0CM;
import X.C0KT;
import X.C0KV;
import X.C0KW;
import X.C0KX;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1EZ;
import X.C21210sP;
import X.C29306Beo;
import X.C29S;
import X.C2BH;
import X.C3C5;
import X.C51029K0z;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC32901Qw;
import X.V10;
import X.XKX;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class KaraokePlayListFragment extends BaseFragment implements InterfaceC32901Qw {
    public View LJLIL;
    public C0KV LJLILLLLZI;
    public C0CM LJLJI;
    public KaraokeViewModel LJLJJI;
    public int LJLJJL;
    public C0KT LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJI = C21210sP.LIZJ(C51029K0z.LJIILIIL(this));
        View findViewById = view.findViewById(R.id.kyt);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tab_layout)");
        this.LJLILLLLZI = (C0KV) findViewById;
        View findViewById2 = view.findViewById(R.id.ncx);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.viewpager)");
        this.LJLJI = (C0CM) findViewById2;
        View findViewById3 = view.findViewById(R.id.aej);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.back_btn)");
        this.LJLIL = findViewById3;
        C29306Beo.LJJJLL(findViewById3, 500L, new IDqS416S0100000(this, 129));
        C0CM c0cm = this.LJLJI;
        if (c0cm != null) {
            c0cm.setOffscreenPageLimit(2);
            C0CM c0cm2 = this.LJLJI;
            if (c0cm2 != null) {
                c0cm2.setAdapter(new FragmentStateAdapter(this) { // from class: X.1jq
                    @Override // X.AbstractC029409q
                    public final int getItemCount() {
                        return 2;
                    }

                    {
                        super(this);
                    }

                    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                    public final Fragment LJZ(int i) {
                        if (i != 0) {
                            if (i != 1) {
                                return new Fragment();
                            }
                            return C24250xJ.LIZ(-998L);
                        }
                        return C24250xJ.LIZ(-999L);
                    }
                });
                C0CM c0cm3 = this.LJLJI;
                if (c0cm3 != null) {
                    c0cm3.LIZLLL(this.LJLJJL, false);
                    C0KV c0kv = this.LJLILLLLZI;
                    if (c0kv != null) {
                        c0kv.LIZ(new C1EZ(C51029K0z.LJIILIIL(this), false, this.LJLJJI));
                        C0KV c0kv2 = this.LJLILLLLZI;
                        if (c0kv2 != null) {
                            C0CM c0cm4 = this.LJLJI;
                            if (c0cm4 != null) {
                                new C0KX(c0kv2, c0cm4, true, new C0KW() { // from class: X.1Ig
                                    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
                                    
                                        if (r7 != 1) goto L7;
                                     */
                                    @Override // X.C0KW
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void LIZ(X.C0KT r6, int r7) {
                                        /*
                                            r5 = this;
                                            com.bytedance.android.live.effect.karaoke.view.playlist.KaraokePlayListFragment r4 = com.bytedance.android.live.effect.karaoke.view.playlist.KaraokePlayListFragment.this
                                            r4.getClass()
                                            java.lang.String r0 = ""
                                            r3 = 1
                                            if (r7 == 0) goto L27
                                            if (r7 == r3) goto L19
                                            r2 = r0
                                            if (r7 == r3) goto L20
                                        Lf:
                                            r6.LIZIZ(r2)
                                            r6.LIZ = r0
                                            if (r7 != r3) goto L18
                                            r4.LJLJJLL = r6
                                        L18:
                                            return
                                        L19:
                                            r0 = 2131835086(0x7f1138ce, float:1.93033E38)
                                            java.lang.String r2 = X.C15380j0.LJIILJJIL(r0)
                                        L20:
                                            r0 = -998(0xfffffffffffffc1a, double:NaN)
                                            java.lang.Long r0 = java.lang.Long.valueOf(r0)
                                            goto Lf
                                        L27:
                                            r0 = 2131835084(0x7f1138cc, float:1.9303297E38)
                                            java.lang.String r2 = X.C15380j0.LJIILJJIL(r0)
                                            r0 = -999(0xfffffffffffffc19, double:NaN)
                                            java.lang.Long r0 = java.lang.Long.valueOf(r0)
                                            goto Lf
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C30661Ig.LIZ(X.0KT, int):void");
                                    }
                                }).LIZ();
                                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2BH(this, null), 3);
                                return;
                            } else {
                                o.LJIJI("viewPager");
                                throw null;
                            }
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
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d_5, viewGroup, false);
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
