package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.effectcreatormobile.ckeapi.api.CameraApi;
import com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import com.bytedance.effectcreatormobile.objectselect.EffectSelectFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.effectcreator.swig.Error;
import com.bytedance.ies.effectcreator.swig.ErrorType;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import com.bytedance.ies.effectcreator.swig.Model;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS191S0200000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.abQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94092abQ extends AbstractC029409q<C94091abP> {
    public List<? extends OSZ<C94031aaR, ? extends List<C94033aaT>>> LJLIL = C61878OQg.INSTANCE;
    public String LJLILLLLZI = "";
    public final /* synthetic */ EffectSelectFragment LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C94092abQ(EffectSelectFragment effectSelectFragment) {
        this.LJLJI = effectSelectFragment;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0073. Please report as an issue. */
    public final synchronized void LJLLLLLL(C94033aaT c94033aaT, String path) {
        FragmentManager fragmentManager;
        ErrorType errorType;
        FeatureManager featureManager;
        Error canCreateFeature;
        CameraApi cameraApi;
        if (o.LJ(this.LJLILLLLZI, c94033aaT.LJ)) {
            EffectSelectFragment effectSelectFragment = this.LJLJI;
            if (!effectSelectFragment.LJLJL) {
                effectSelectFragment.LJLJL = true;
                C93750aVu.LIZ.removeCallbacksAndMessages(null);
                C93750aVu.LIZIZ.set(true);
                C93750aVu.LIZJ.clear();
                if (c94033aaT.LIZ == EnumC94032aaS.Template) {
                    EffectSelectFragment effectSelectFragment2 = this.LJLJI;
                    String str = c94033aaT.LJ;
                    String str2 = c94033aaT.LJIIJJI;
                    ActivityC45651qj mo49getActivity = effectSelectFragment2.mo49getActivity();
                    if (mo49getActivity != null && (cameraApi = effectSelectFragment2.LJLJLJ) != null) {
                        cameraApi.requestCameraPermissionOrShowSetting(mo49getActivity, new C94726ale(effectSelectFragment2, path, str, str2), C94538aic.LJLIL);
                    }
                } else {
                    C93829aXB LJI = CKEffectEditorContext.LJI();
                    if (LJI != null) {
                        o.LJIIIZ(path, "path");
                        Model workingModel = LJI.LIZJ.getWorkingModel();
                        if (workingModel != null && (featureManager = workingModel.featureManager()) != null && (canCreateFeature = featureManager.canCreateFeature(path)) != null) {
                            errorType = canCreateFeature.getType();
                        } else {
                            errorType = null;
                        }
                        if (errorType == ErrorType.ErrorType_TargetResourceUnsupported) {
                            Context context = this.LJLJI.getContext();
                            if (context != null) {
                                String string = this.LJLJI.getString(R.string.hn);
                                o.LJIIIIZZ(string, "getString(com.ugc.effect…rsionincompatible_header)");
                                ToastService.INSTANCE.showToast(context, string);
                            }
                            return;
                        }
                    }
                    String str3 = c94033aaT.LJIIIIZZ;
                    switch (str3.hashCode()) {
                        case -903003172:
                            if (str3.equals("prefab_select_panel")) {
                                PrefabData prefabData = new PrefabData(c94033aaT.LJIIIZ, c94033aaT.LJII, c94033aaT.LIZLLL, path, c94033aaT.LJ, c94033aaT.LJIIJ, c94033aaT.LJIIL);
                                InterfaceC93955aZD interfaceC93955aZD = this.LJLJI.LJLIL;
                                if (interfaceC93955aZD != null) {
                                    interfaceC93955aZD.dismiss();
                                }
                                IMain LIZ = C93723aVT.LIZ();
                                if (LIZ != null) {
                                    Fragment parentFragment = this.LJLJI.getParentFragment();
                                    o.LJI(parentFragment);
                                    Fragment parentFragment2 = parentFragment.getParentFragment();
                                    o.LJI(parentFragment2);
                                    FragmentManager fragmentManager2 = parentFragment2.getFragmentManager();
                                    o.LJI(fragmentManager2);
                                    C93487aRf.LIZ(LIZ, fragmentManager2, prefabData, null, 4);
                                    break;
                                }
                            }
                            ToastService toastService = ToastService.INSTANCE;
                            Context requireContext = this.LJLJI.requireContext();
                            o.LJIIIIZZ(requireContext, "requireContext()");
                            String string2 = this.LJLJI.getString(R.string.fyd);
                            o.LJIIIIZZ(string2, "getString(com.ugc.effect…effect_tool_update_toast)");
                            toastService.showToast(requireContext, string2);
                            this.LJLJI.LJLJL = false;
                            break;
                        case -630917003:
                            if (str3.equals("face_liquify_edit_panel")) {
                                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLJI), null, null, new C94759amB(path, c94033aaT, null), 3);
                                break;
                            }
                            ToastService toastService2 = ToastService.INSTANCE;
                            Context requireContext2 = this.LJLJI.requireContext();
                            o.LJIIIIZZ(requireContext2, "requireContext()");
                            String string22 = this.LJLJI.getString(R.string.fyd);
                            o.LJIIIIZZ(string22, "getString(com.ugc.effect…effect_tool_update_toast)");
                            toastService2.showToast(requireContext2, string22);
                            this.LJLJI.LJLJL = false;
                            break;
                        case 323415461:
                            if (str3.equals("texture_select_panel")) {
                                EffectSelectFragment effectSelectFragment3 = this.LJLJI;
                                Bundle LIZ2 = C93500aRs.LIZ(c94033aaT.LJIIIZ, c94033aaT.LIZLLL, c94033aaT.LJII, c94033aaT.LJ, effectSelectFragment3.LJLJJLL, path, c94033aaT.LJIIL);
                                InterfaceC93955aZD interfaceC93955aZD2 = effectSelectFragment3.LJLIL;
                                if (interfaceC93955aZD2 != null) {
                                    interfaceC93955aZD2.LIZ(LIZ2);
                                    break;
                                }
                            }
                            ToastService toastService22 = ToastService.INSTANCE;
                            Context requireContext22 = this.LJLJI.requireContext();
                            o.LJIIIIZZ(requireContext22, "requireContext()");
                            String string222 = this.LJLJI.getString(R.string.fyd);
                            o.LJIIIIZZ(string222, "getString(com.ugc.effect…effect_tool_update_toast)");
                            toastService22.showToast(requireContext22, string222);
                            this.LJLJI.LJLJL = false;
                            break;
                        case 1539081771:
                            if (str3.equals("face_stretch_edit_panel")) {
                                IEditorContext LIZ3 = C93940aYy.LIZ();
                                if (LIZ3 != null && (fragmentManager = LIZ3.getFragmentManager()) != null) {
                                    ICameraRender LIZ4 = C93939aYx.LIZ();
                                    String str4 = c94033aaT.LJ;
                                    String str5 = c94033aaT.LIZLLL;
                                    LIZ4.createFaceDistortion(fragmentManager, path, str4, str5, str5, c94033aaT.LJIIL);
                                    break;
                                } else {
                                    this.LJLJI.LJLJL = false;
                                    return;
                                }
                            }
                            ToastService toastService222 = ToastService.INSTANCE;
                            Context requireContext222 = this.LJLJI.requireContext();
                            o.LJIIIIZZ(requireContext222, "requireContext()");
                            String string2222 = this.LJLJI.getString(R.string.fyd);
                            o.LJIIIIZZ(string2222, "getString(com.ugc.effect…effect_tool_update_toast)");
                            toastService222.showToast(requireContext222, string2222);
                            this.LJLJI.LJLJL = false;
                            break;
                        default:
                            ToastService toastService2222 = ToastService.INSTANCE;
                            Context requireContext2222 = this.LJLJI.requireContext();
                            o.LJIIIIZZ(requireContext2222, "requireContext()");
                            String string22222 = this.LJLJI.getString(R.string.fyd);
                            o.LJIIIIZZ(string22222, "getString(com.ugc.effect…effect_tool_update_toast)");
                            toastService2222.showToast(requireContext2222, string22222);
                            this.LJLJI.LJLJL = false;
                            break;
                    }
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C94091abP holder, int i) {
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        if (view != null) {
            C93672aUe c93672aUe = (C93672aUe) view;
            c93672aUe.setTitle(((C94031aaR) ((OSZ) ListProtector.get(this.LJLIL, i)).getFirst()).LIZIZ);
            if (o.LJ(((C94031aaR) ((OSZ) ListProtector.get(this.LJLIL, i)).getFirst()).LIZ, "template")) {
                C94620ajw c94620ajw = new C94620ajw(new IDqS191S0200000_42(c93672aUe, this, 2));
                c94620ajw.setData((List) ((OSZ) ListProtector.get(this.LJLIL, i)).getSecond());
                c93672aUe.setAdapter(c94620ajw);
                return;
            } else {
                C94618aju c94618aju = new C94618aju(new IDqS191S0200000_42(c93672aUe, this, 3));
                c94618aju.setData((List) ((OSZ) ListProtector.get(this.LJLIL, i)).getSecond());
                c93672aUe.setAdapter(c94618aju);
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.effectcreatormobile.objectselect.view.EffectKindView");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C94091abP com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        C94091abP c94091abP = new C94091abP(new C93672aUe(context));
        c94091abP.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c94091abP.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94091abP.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C94091abP.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94091abP.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94091abP.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C94091abP.class.getName();
        return c94091abP;
    }
}
