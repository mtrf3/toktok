package com.bytedance.effectcreatormobile.assetEditor.liquefy;

import X.C02Z;
import X.C16880lQ;
import X.C65352Pkq;
import X.C93405aQL;
import X.C93408aQO;
import X.C93472aRQ;
import X.C93618aTm;
import X.C93622aTq;
import X.C93916aYa;
import X.C93977aZZ;
import X.C94380ag4;
import X.C94407agV;
import X.C94408agW;
import X.C94518aiI;
import X.C94746aly;
import X.C94747alz;
import X.C94983apn;
import X.InterfaceC06750Oh;
import X.InterfaceC65784Pro;
import X.InterfaceC93966aZO;
import X.KL2;
import X.XKX;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.effectcreatormobile.assetEditor.base.AssetNameViewModel;
import com.bytedance.effectcreatormobile.assetEditor.base.BindingBaseFragment;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class LiquefyFragment extends BindingBaseFragment<C94380ag4> implements InterfaceC93966aZO {
    public final ViewModelLazy LJLJI = C93408aQO.LIZ(this, C65352Pkq.LIZ(LiquefyViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) new IDqS423S0100000_42((Fragment) this, 2), 3), null);
    public final ViewModelLazy LJLJJI = C93408aQO.LIZ(this, C65352Pkq.LIZ(AssetNameViewModel.class), new IDqS423S0100000_42((Fragment) this, 1), null);
    public ValueAnimator LJLJJL;

    public final LiquefyViewModel Gl() {
        return (LiquefyViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.effectcreatormobile.assetEditor.base.BindingBaseFragment, com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment
    public final void _$_clearFindViewByIdCache() {
    }

    @Override // com.bytedance.effectcreatormobile.assetEditor.base.BindingBaseFragment, com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void Hl() {
        Feature feature;
        LiquefyViewModel Gl = Gl();
        if (Gl.LJLL) {
            C94518aiI c94518aiI = Gl.LJLIL;
            if (c94518aiI != null && (feature = c94518aiI.LIZJ) != null) {
                CKEffectEditorContext.LJIILIIL(feature);
                CKEffectEditorContext.LJIILJJIL(null);
            }
        } else {
            if (Gl.LJLIL != null) {
                C94518aiI.LJIILIIL("cancel");
            }
            LiquefyFeatureData liquefyFeatureData = Gl.LJLLLL;
            if (liquefyFeatureData != null) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(Gl), null, null, new C94983apn(Gl, liquefyFeatureData, null), 3);
            }
        }
        C94518aiI c94518aiI2 = Gl.LJLIL;
        if (c94518aiI2 != null) {
            c94518aiI2.LIZLLL = false;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            C93977aZZ.LIZIZ().restoreMainPageState(arguments);
        }
        Dl(false);
    }

    @Override // X.InterfaceC93966aZO
    public final boolean LJIIJ() {
        LiquefyViewModel Gl = Gl();
        if (!o.LJ(Gl.iv0(), Gl.LJLLLL)) {
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean("cke_liquefy_new_feature")) {
                Context requireContext = requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                IDialog LIZ = C93405aQL.LIZ();
                String string = requireContext.getString(R.string.hp);
                o.LJIIIIZZ(string, "context.getString(Langua…E_exitEffect_popup_title)");
                String string2 = requireContext.getString(R.string.ho);
                o.LJIIIIZZ(string2, "context.getString(Langua…ME_exitEffect_popup_body)");
                String string3 = requireContext.getString(R.string.fw3);
                o.LJIIIIZZ(string3, "context.getString(LanguageR.effect_tool_exit)");
                C93472aRQ.LIZ(LIZ, requireContext, string, string2, string3, requireContext.getString(R.string.fvg), new C94408agW(this), null, null, null, null, 1984);
            } else {
                Context requireContext2 = requireContext();
                o.LJIIIIZZ(requireContext2, "requireContext()");
                IDialog LIZ2 = C93405aQL.LIZ();
                String string4 = requireContext2.getString(R.string.fv7);
                o.LJIIIIZZ(string4, "context.getString(Langua…_alert_discardedit_title)");
                String string5 = requireContext2.getString(R.string.fv6);
                o.LJIIIIZZ(string5, "context.getString(Langua…lert_discardedit_content)");
                String string6 = requireContext2.getString(R.string.fvl);
                o.LJIIIIZZ(string6, "context.getString(LanguageR.effect_tool_clear)");
                C93472aRQ.LIZ(LIZ2, requireContext2, string4, string5, string6, requireContext2.getString(R.string.fvg), new C94407agV(this), null, null, null, null, 1984);
            }
        } else {
            Hl();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        CKEffectEditorContext.LIZJ(viewLifecycleOwner, new IDqS423S0100000_42(this, 5));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        CKEffectEditorContext.LIZJ(viewLifecycleOwner, new IDqS423S0100000_42(this, 6));
    }

    public final void Dl(boolean z) {
        C94380ag4 xl;
        C93618aTm c93618aTm;
        if (this.LJLJJL == null && (xl = xl()) != null && (c93618aTm = xl.LJLILLLLZI) != null) {
            this.LJLJJL = new C93916aYa().LIZIZ(c93618aTm, new IDqS423S0100000_42(this, 4));
            if (z) {
                FragmentManager fragmentManager = getFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.LJJLIIIJJIZ(1, null);
                    return;
                }
                return;
            }
            FragmentManager fragmentManager2 = getFragmentManager();
            if (fragmentManager2 == null) {
                return;
            }
            fragmentManager2.LJJLIIIJJI();
        }
    }

    @Override // com.bytedance.effectcreatormobile.assetEditor.base.BindingBaseFragment
    public final InterfaceC06750Oh Al(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dvu, null, false);
        int i = R.id.ard;
        C93618aTm c93618aTm = (C93618aTm) LLLLIILL.findViewById(R.id.ard);
        if (c93618aTm != null) {
            i = R.id.nls;
            View findViewById = LLLLIILL.findViewById(R.id.nls);
            if (findViewById != null) {
                i = R.id.av8;
                ImageView imageView = (ImageView) LLLLIILL.findViewById(R.id.av8);
                if (imageView != null) {
                    i = R.id.avn;
                    ImageView imageView2 = (ImageView) LLLLIILL.findViewById(R.id.avn);
                    if (imageView2 != null) {
                        i = R.id.cd9;
                        View findViewById2 = LLLLIILL.findViewById(R.id.cd9);
                        if (findViewById2 != null) {
                            i = R.id.noy;
                            C02Z c02z = (C02Z) LLLLIILL.findViewById(R.id.noy);
                            if (c02z != null) {
                                i = R.id.noz;
                                C02Z c02z2 = (C02Z) LLLLIILL.findViewById(R.id.noz);
                                if (c02z2 != null) {
                                    i = R.id.np_;
                                    C93622aTq c93622aTq = (C93622aTq) LLLLIILL.findViewById(R.id.np_);
                                    if (c93622aTq != null) {
                                        i = R.id.npa;
                                        C93622aTq c93622aTq2 = (C93622aTq) LLLLIILL.findViewById(R.id.npa);
                                        if (c93622aTq2 != null) {
                                            i = R.id.mo6;
                                            TextView textView = (TextView) LLLLIILL.findViewById(R.id.mo6);
                                            if (textView != null) {
                                                return new C94380ag4((FrameLayout) LLLLIILL, c93618aTm, findViewById, imageView, imageView2, findViewById2, c02z, c02z2, c93622aTq, c93622aTq2, textView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }

    @Override // com.bytedance.effectcreatormobile.assetEditor.base.BindingBaseFragment, com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FrameLayout frameLayout;
        Bundle arguments;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle == null && (arguments = getArguments()) != null) {
            C93977aZZ.LIZIZ().recordMainPageState(arguments);
        }
        C93977aZZ.LIZIZ().hideAllPanel();
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C94747alz(bundle, null), 3);
        C94380ag4 xl = xl();
        if (xl != null && (frameLayout = xl.LJLIL) != null) {
            frameLayout.setPadding(0, KL2.LJIIL(getContext()), 0, 0);
        }
    }

    @Override // com.bytedance.effectcreatormobile.assetEditor.base.BindingBaseFragment
    public final void wl(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C94746aly(this, bundle, null), 3);
    }
}
