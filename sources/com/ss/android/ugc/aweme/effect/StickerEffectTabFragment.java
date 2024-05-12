package com.ss.android.ugc.aweme.effect;

import X.C03150Al;
import X.C165706es;
import X.C171256np;
import X.C171506oE;
import X.ORZ;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StickerEffectTabFragment extends EditEffectTabFragment {
    public EditEffectVideoModel LJLLL;
    public C171256np LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    @Override // X.InterfaceC170126m0
    public final void P6() {
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
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

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC84510XEs
    public final void LLJJLIIIJLLLLLLLZ(Effect rawEffect) {
        o.LJIIIZ(rawEffect, "rawEffect");
        int indexOf = wl().indexOf(rawEffect);
        if (indexOf >= 0) {
            C171256np c171256np = this.LJLLLL;
            if (c171256np != null) {
                c171256np.LJLLLLLL(indexOf, 8);
            } else {
                o.LJIJI("mEffectAdapter");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC84510XEs
    public final void P3(Effect effect) {
        int indexOf;
        if (effect != null && (indexOf = wl().indexOf(effect)) >= 0) {
            C171256np c171256np = this.LJLLLL;
            if (c171256np != null) {
                c171256np.LJLLLLLL(indexOf, 32);
            } else {
                o.LJIJI("mEffectAdapter");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.LJLLLL != null) {
            if ((!((ArrayList) r0.LJLILLLLZI).isEmpty()) && (!this.LJLLILLLL.isEmpty())) {
                C171256np c171256np = this.LJLLLL;
                if (c171256np != null) {
                    c171256np.LJZ((EffectPointModel) ListProtector.get(this.LJLLILLLL, 0));
                } else {
                    o.LJIJI("mEffectAdapter");
                    throw null;
                }
            }
            if (mo49getActivity() != null) {
                EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) C165706es.LJII(getView(), null, 6).get(EditEffectVideoModel.class);
                this.LJLLL = editEffectVideoModel;
                if (editEffectVideoModel != null) {
                    editEffectVideoModel.hv0().LJI().observe(this, new AObserverS70S0100000_2(this, 24));
                    EditEffectVideoModel editEffectVideoModel2 = this.LJLLL;
                    if (editEffectVideoModel2 != null) {
                        ((LiveData) editEffectVideoModel2.LJLL.getValue()).observe(this, new AObserverS70S0100000_2(this, 25));
                        return;
                    } else {
                        o.LJIJI("mViewModel");
                        throw null;
                    }
                }
                o.LJIJI("mViewModel");
                throw null;
            }
            return;
        }
        o.LJIJI("mEffectAdapter");
        throw null;
    }

    @Override // X.InterfaceC84510XEs
    public final void pl(Effect rawEffect) {
        o.LJIIIZ(rawEffect, "rawEffect");
        int indexOf = wl().indexOf(rawEffect);
        if (indexOf >= 0) {
            C171256np c171256np = this.LJLLLL;
            if (c171256np != null) {
                c171256np.LJLLLLLL(indexOf, 16);
            } else {
                o.LJIJI("mEffectAdapter");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) _$_findCachedViewById(R.id.lwl)).setText(getString(R.string.byq));
        _$_findCachedViewById(R.id.isv);
        C171256np c171256np = new C171256np(this.LJLJLJ);
        this.LJLLLL = c171256np;
        c171256np.LJLZ(this.LJLJJL);
        C171256np c171256np2 = this.LJLLLL;
        if (c171256np2 != null) {
            c171256np2.LJLJJI = new C171506oE(this);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isv);
            C171256np c171256np3 = this.LJLLLL;
            if (c171256np3 != null) {
                recyclerView.setAdapter(c171256np3);
                _$_findCachedViewById(R.id.lw5).setVisibility(8);
                vl();
                return;
            }
            o.LJIJI("mEffectAdapter");
            throw null;
        }
        o.LJIJI("mEffectAdapter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment
    public final void xl(C03150Al c03150Al, List<? extends EffectModel> list) {
        C171256np c171256np = this.LJLLLL;
        if (c171256np != null) {
            c03150Al.LIZJ(c171256np);
            this.LJLJJL = list;
            C171256np c171256np2 = this.LJLLLL;
            if (c171256np2 != null) {
                c171256np2.LJLZ(list);
                if (this.LJLLLL != null) {
                    if ((!((ArrayList) r0.LJLILLLLZI).isEmpty()) && (!this.LJLLILLLL.isEmpty())) {
                        C171256np c171256np3 = this.LJLLLL;
                        if (c171256np3 != null) {
                            c171256np3.LJZ((EffectPointModel) ListProtector.get(this.LJLLILLLL, 0));
                            return;
                        } else {
                            o.LJIJI("mEffectAdapter");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("mEffectAdapter");
                throw null;
            }
            o.LJIJI("mEffectAdapter");
            throw null;
        }
        o.LJIJI("mEffectAdapter");
        throw null;
    }

    public static final StickerEffectTabFragment Gl(String category, List effects, boolean z) {
        o.LJIIIZ(effects, "effects");
        o.LJIIIZ(category, "category");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("effect_list", (ArrayList) ORZ.LLJILJILJ(effects));
        bundle.putString("effect_category", category);
        bundle.putBoolean("show_goto_capcut_effect", z);
        StickerEffectTabFragment stickerEffectTabFragment = new StickerEffectTabFragment();
        stickerEffectTabFragment.setArguments(bundle);
        return stickerEffectTabFragment;
    }
}
