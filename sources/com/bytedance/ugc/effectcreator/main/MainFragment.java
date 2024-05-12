package com.bytedance.ugc.effectcreator.main;

import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C1AH;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C40675Fxn;
import X.C47261Igj;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C78924UyG;
import X.C79853Bl;
import X.C90903hW;
import X.C93405aQL;
import X.C93407aQN;
import X.C93408aQO;
import X.C93410aQQ;
import X.C93472aRQ;
import X.C93478aRW;
import X.C93481aRZ;
import X.C93482aRa;
import X.C93518aSA;
import X.C93519aSB;
import X.C93522aSE;
import X.C93643aUB;
import X.C93670aUc;
import X.C93677aUj;
import X.C93709aVF;
import X.C93718aVO;
import X.C93723aVT;
import X.C93729aVZ;
import X.C93742aVm;
import X.C93743aVn;
import X.C93747aVr;
import X.C93748aVs;
import X.C93819aX1;
import X.C93825aX7;
import X.C93829aXB;
import X.C93892aYC;
import X.C93926aYk;
import X.C93932aYq;
import X.C93938aYw;
import X.C93939aYx;
import X.C93940aYy;
import X.C93943aZ1;
import X.C93971aZT;
import X.C94010aa6;
import X.C94014aaA;
import X.C94034aaU;
import X.C94081abF;
import X.C94111abj;
import X.C94112abk;
import X.C94113abl;
import X.C94114abm;
import X.C94164aca;
import X.C94272aeK;
import X.C94336afM;
import X.C94341afR;
import X.C94349afZ;
import X.C94502ai2;
import X.C94786amc;
import X.C94919aol;
import X.C94925aor;
import X.EnumC93404aQK;
import X.EnumC93477aRV;
import X.EnumC93724aVU;
import X.EnumC93725aVV;
import X.EnumC93823aX5;
import X.InterfaceC36571c5;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.InterfaceC93411aQR;
import X.InterfaceC93645aUD;
import X.InterfaceC93941aYz;
import X.InterfaceC93966aZO;
import X.InterfaceC94011aa7;
import X.OSZ;
import X.ViewOnClickListenerC93751aVv;
import X.ViewTreeObserverOnGlobalLayoutListenerC93517aS9;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import X.X1D;
import X.XKX;
import X.XLL;
import Y.IDCListenerS262S0100000_42;
import Y.IDCListenerS302S0100000_42;
import Y.IDComparatorS345S0100000_42;
import Y.IDObjectS0S0101000;
import Y.IDRunnableS33S0200000_42;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.effectcreatormobile.camera.viewmodel.EffectHintViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.CameraApi;
import com.bytedance.effectcreatormobile.ckeapi.api.ConfigProvider;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline;
import com.bytedance.effectcreatormobile.ckeapi.api.IRecovery;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IDoubleCheckSheet;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IStepIntroSheet;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService;
import com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect;
import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextModel;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.Project;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.news.common.service.manager.IService;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class MainFragment extends Fragment implements InterfaceC93966aZO {
    public InterfaceC94011aa7 LJLIL;
    public final InterfaceC93411aQR LJLILLLLZI = C93410aQQ.LIZJ().providePageLoadingView();
    public final InterfaceC93645aUD LJLJI;
    public long LJLJJI;
    public final boolean LJLJJL;
    public final C93748aVs LJLJJLL;
    public boolean LJLJL;
    public C94349afZ LJLJLJ;
    public final XLL LJLJLLL;
    public final XLL LJLL;
    public boolean LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final ViewModelLazy LJLLJ;
    public final ViewModelLazy LJLLL;
    public final C94111abj LJLLLL;
    public boolean LJLLLLLL;
    public String LJLZ;
    public final IStore LJZ;
    public final CameraApi LJZI;

    /* loaded from: classes34.dex */
    public static final class EffectCreatePipelineService implements IEffectCreatePipeline {
        public static final EffectCreatePipelineService INSTANCE = new EffectCreatePipelineService();
        public final /* synthetic */ IEffectCreatePipeline $$delegate_0 = (IEffectCreatePipeline) C93892aYC.LIZ(IEffectCreatePipeline.class);

        @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
        public C94341afR getConfig() {
            return this.$$delegate_0.getConfig();
        }

        @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
        public void onExportEffectBefore(Intent intent, CKEDraftInfo cKEDraftInfo) {
            o.LJIIIZ(intent, "intent");
            this.$$delegate_0.onExportEffectBefore(intent, cKEDraftInfo);
        }

        @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
        public void onExportEffectFailed(Intent intent, String exportPath, String errorMsg) {
            o.LJIIIZ(intent, "intent");
            o.LJIIIZ(exportPath, "exportPath");
            o.LJIIIZ(errorMsg, "errorMsg");
            this.$$delegate_0.onExportEffectFailed(intent, exportPath, errorMsg);
        }

        @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
        public void onExportEffectSuccess(Activity activity, CKEDraftInfo cKEDraftInfo, EffectPackageData effectPackageData, InterfaceC88472Yns<? super Integer, C76800UCe> onBackToMainFragment) {
            o.LJIIIZ(activity, "activity");
            o.LJIIIZ(effectPackageData, "effectPackageData");
            o.LJIIIZ(onBackToMainFragment, "onBackToMainFragment");
            this.$$delegate_0.onExportEffectSuccess(activity, cKEDraftInfo, effectPackageData, onBackToMainFragment);
        }

        @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
        public boolean onExportWhenExit(Activity activity, CKEDraftInfo cKEDraftInfo, EffectPackageData packData) {
            o.LJIIIZ(activity, "activity");
            o.LJIIIZ(packData, "packData");
            return this.$$delegate_0.onExportWhenExit(activity, cKEDraftInfo, packData);
        }

        @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
        public boolean onInterceptExport(Intent intent) {
            o.LJIIIZ(intent, "intent");
            return this.$$delegate_0.onInterceptExport(intent);
        }
    }

    public final EffectHintViewModel Ll() {
        return (EffectHintViewModel) this.LJLLL.getValue();
    }

    public final MainViewModel Ol() {
        return (MainViewModel) this.LJLLJ.getValue();
    }

    public final C93926aYk Pl() {
        return (C93926aYk) this.LJLLILLLL.getValue();
    }

    public final void Gl() {
        MainLiveData<Rect> previewLocation;
        C94349afZ c94349afZ = this.LJLJLJ;
        if (c94349afZ != null) {
            FrameLayout frameLayout = c94349afZ.LLIIL;
            int[] iArr = new int[2];
            frameLayout.getLocationInWindow(iArr);
            MainImpl LIZ = C93932aYq.LIZ();
            if (LIZ != null && (previewLocation = LIZ.getPreviewLocation()) != null) {
                int i = iArr[0];
                previewLocation.setValue(new Rect(i, iArr[1], ((int) (frameLayout.getWidth() * frameLayout.getScaleX())) + i, iArr[1] + ((int) (frameLayout.getHeight() * frameLayout.getScaleY()))));
                return;
            }
            return;
        }
        o.LJIJI("binding");
        throw null;
    }

    public final String Jl() {
        Bundle arguments;
        String str = this.LJLZ;
        if (str == null && ((arguments = getArguments()) == null || (str = arguments.getString("EFFECT_DRAFT_PATH", "")) == null)) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC93966aZO
    public final boolean LJIIJ() {
        ArrayList arrayList = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        if (childFragmentManager.LJJJJLI().size() > 0) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager2, "childFragmentManager");
            for (int size = childFragmentManager2.LJJJJLI().size() - 1; size >= 0; size--) {
                FragmentManager childFragmentManager3 = getChildFragmentManager();
                o.LJIIIIZZ(childFragmentManager3, "childFragmentManager");
                Object obj = ListProtector.get(childFragmentManager3.LJJJJLI(), size);
                if (obj instanceof InterfaceC93966aZO) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS345S0100000_42(this, 0));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
            if (interfaceC36571c5 != null) {
                if (((InterfaceC93966aZO) interfaceC36571c5).LJIIJ()) {
                    return true;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.effectcreator.framework.IEffectEditorBackPress");
            }
        }
        Vl();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d2  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData Ml() {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ugc.effectcreator.main.MainFragment.Ml():com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData");
    }

    public final void Rl() {
        C94349afZ c94349afZ = this.LJLJLJ;
        if (c94349afZ != null) {
            ConstraintLayout constraintLayout = c94349afZ.LLILL;
            o.LJIIIIZZ(constraintLayout, "binding.topBar");
            constraintLayout.setVisibility(4);
            return;
        }
        o.LJIJI("binding");
        throw null;
    }

    public MainFragment() {
        InterfaceC93645aUD provideStatusPage;
        boolean z;
        provideStatusPage = C93643aUB.LIZ().provideStatusPage(EnumC93477aRV.Large);
        this.LJLJI = provideStatusPage;
        this.LJLJJI = System.currentTimeMillis();
        InterfaceC93941aYz interfaceC93941aYz = (InterfaceC93941aYz) C93971aZT.LIZ().LIZ(InterfaceC93941aYz.class);
        if (interfaceC93941aYz != null) {
            z = interfaceC93941aYz.LIZ();
        } else {
            z = false;
        }
        this.LJLJJL = z;
        this.LJLJJLL = new C93748aVs();
        this.LJLJLLL = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLL = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLLILLLL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 55));
        this.LJLLJ = C93408aQO.LIZ(this, C65352Pkq.LIZ(MainViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) new IDqS423S0100000_42((Fragment) this, 52), 53), new IDqS423S0100000_42(this, 54));
        this.LJLLL = C93408aQO.LIZ(this, C65352Pkq.LIZ(EffectHintViewModel.class), new IDqS423S0100000_42((Fragment) this, 51), null);
        this.LJLLLL = new C94111abj(this);
        new LinkedHashMap();
        this.LJZ = (IStore) ((IService) C93971aZT.LIZ().LIZ(IStore.class));
        this.LJZI = (CameraApi) ((IService) C93971aZT.LIZ().LIZ(CameraApi.class));
    }

    public static void dm() {
        Project project;
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("preview_action", C51029K0z.LJJIIZI(new OSZ("action_type", "reset")));
        }
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (project = LJI.LIZJ) != null) {
            project.notifyRecordStart();
        }
    }

    public final int Kl() {
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Intent intent = requireActivity.getIntent();
        if (intent != null && intent.getParcelableExtra("Intent_Draft") != null) {
            if (intent.getIntExtra("draft_type", -1) == 16) {
                return 16;
            }
            if (intent.getIntExtra("draft_type", -1) == 17) {
                return 17;
            }
        }
        return -1;
    }

    public final void Vl() {
        boolean z;
        Canvas LJ;
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (LJ = LJI.LJ()) != null) {
            LJ.stopAnimation();
        }
        C93829aXB LJI2 = CKEffectEditorContext.LJI();
        if (LJI2 == null || !LJI2.LJIIIZ()) {
            C94349afZ c94349afZ = this.LJLJLJ;
            if (c94349afZ != null) {
                RelativeLayout relativeLayout = c94349afZ.LLIL;
                o.LJIIIIZZ(relativeLayout, "binding.rlController");
                if (relativeLayout.isClickable()) {
                    ArrayList arrayList = new ArrayList();
                    ActivityC45651qj requireActivity = requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    Intent intent = requireActivity.getIntent();
                    if (intent != null) {
                        z = intent.getBooleanExtra("enableSaveDraft", false);
                    } else {
                        z = false;
                    }
                    this.LJLJL = z;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("enableSaveDraft=");
                    LIZ.append(this.LJLJL);
                    C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
                    if (this.LJLJL) {
                        String string = getString(R.string.fxv);
                        o.LJIIIIZZ(string, "getString(com.ugc.effect…ng.effect_tool_savedraft)");
                        arrayList.add(new C93478aRW(0, string, new IDqS423S0100000_42(this, 145)));
                    }
                    String string2 = getString(R.string.fw4);
                    o.LJIIIIZZ(string2, "getString(com.ugc.effect…effect_tool_exit_discard)");
                    arrayList.add(new C93478aRW(1, string2, new IDqS423S0100000_42(this, 146)));
                    IDoubleCheckSheet iDoubleCheckSheet = (IDoubleCheckSheet) ((IService) C93971aZT.LIZ().LIZ(IDoubleCheckSheet.class));
                    if (iDoubleCheckSheet != null) {
                        FragmentManager childFragmentManager = getChildFragmentManager();
                        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                        iDoubleCheckSheet.show(childFragmentManager, arrayList, null);
                        return;
                    }
                    IDialog LIZ2 = C93405aQL.LIZ();
                    Context requireContext = requireContext();
                    o.LJIIIIZZ(requireContext, "requireContext()");
                    String string3 = getString(R.string.tzf);
                    o.LJIIIIZZ(string3, "getString(com.ugc.effect…ect_tool_exit_save_title)");
                    String string4 = getString(R.string.fxv);
                    o.LJIIIIZZ(string4, "getString(com.ugc.effect…ng.effect_tool_savedraft)");
                    String string5 = getString(R.string.fw4);
                    C94336afM c94336afM = new C94336afM(this);
                    EnumC93404aQK enumC93404aQK = EnumC93404aQK.THREE_BUTTON_DIALOG;
                    String string6 = getString(R.string.fvg);
                    o.LJIIIIZZ(string6, "getString(com.ugc.effect…tring.effect_tool_cancel)");
                    C93472aRQ.LIZ(LIZ2, requireContext, string3, "", string4, string5, c94336afM, string6, null, null, enumC93404aQK, 896);
                    return;
                }
            } else {
                o.LJIJI("binding");
                throw null;
            }
        }
        requireActivity().finish();
    }

    public final String getEnterFrom() {
        Intent intent;
        String LLJJIJIIJIL;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "enter_from")) != null) {
            return LLJJIJIIJIL;
        }
        return "shootpage_create";
    }

    public final void hm() {
        Ol().LJLJJI = false;
        IDialog LIZ = C93405aQL.LIZ();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        String string = requireContext().getString(R.string.hn);
        o.LJIIIIZZ(string, "requireContext().getStri…rsionincompatible_header)");
        String string2 = requireContext().getString(R.string.hm);
        o.LJIIIIZZ(string2, "requireContext().getStri…versionincompatible_body)");
        String string3 = requireContext().getString(R.string.fw5);
        o.LJIIIIZZ(string3, "requireContext().getStri…guageR.effect_tool_gotit)");
        C93472aRQ.LIZ(LIZ, requireContext, string, string2, string3, null, new C94081abF(), null, null, null, null, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        StatisticReporter LIZ;
        super.onDestroy();
        if (C93407aQN.LIZ != null && (LIZ = C93670aUc.LIZ()) != null) {
            LIZ.onEvent("cke_technology_loading_watch", C113554cx.LJJL(new OSZ("stage", C93407aQN.LIZJ), new OSZ("keep_time", String.valueOf(System.currentTimeMillis() - C93407aQN.LIZIZ)), new OSZ("flag", "interrupt")));
        }
        Handler handler = C93407aQN.LIZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C93407aQN.LIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C93677aUj.LJI(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C93677aUj.LJII(0);
    }

    public final Map<String, String> xl() {
        String str;
        Intent intent;
        String LLJJIJIIJIL;
        Intent intent2;
        EffectPackageData Ml = Ml();
        OSZ[] oszArr = new OSZ[10];
        oszArr[0] = new OSZ("project_id", Ml.projectId);
        oszArr[1] = new OSZ("project_source", Ml.projectSource);
        oszArr[2] = new OSZ("template_id", Ml.LJLJI);
        oszArr[3] = new OSZ("object_cnt", String.valueOf(Ml.LJLJLJ));
        oszArr[4] = new OSZ("sequence_cnt", String.valueOf(Ml.LJLJLLL));
        oszArr[5] = new OSZ("interaction_duration", String.valueOf(Ml.interactionDuration));
        oszArr[6] = new OSZ("layer_duration", String.valueOf(Ml.layerDuration));
        oszArr[7] = new OSZ("enter_from", getEnterFrom());
        ActivityC45651qj mo49getActivity = mo49getActivity();
        String str2 = "";
        if (mo49getActivity == null || (intent2 = mo49getActivity.getIntent()) == null || (str = C16880lQ.LLJJIJIIJIL(intent2, "shoot_way")) == null) {
            str = "";
        }
        oszArr[8] = new OSZ("shoot_way", str);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (intent = mo49getActivity2.getIntent()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "creation_id")) != null) {
            str2 = LLJJIJIIJIL;
        }
        oszArr[9] = new OSZ("creation_id", str2);
        return C113554cx.LJJLIIIIJ(oszArr);
    }

    public static void Sl(boolean z) {
        Canvas LJ;
        EnumC93724aVU enumC93724aVU;
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("preview_click", C51029K0z.LJJIIZI(new OSZ("current_page_name", "currentPage")));
        }
        MainImpl LIZ2 = C93932aYq.LIZ();
        if (LIZ2 != null) {
            if (z) {
                enumC93724aVU = EnumC93724aVU.TO_PUBLISH_PREVIEW;
            } else {
                enumC93724aVU = EnumC93724aVU.TO_EDIT_PREVIEW;
            }
            LIZ2.updateOperation(enumC93724aVU);
        }
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (LJ = LJI.LJ()) != null) {
            LJ.stopAnimation();
        }
    }

    public static void Xl(boolean z) {
        int i;
        String str;
        List<Feature> LJI;
        C93829aXB LJI2 = CKEffectEditorContext.LJI();
        if (LJI2 != null && (LJI = LJI2.LJI()) != null) {
            i = LJI.size();
        } else {
            i = 0;
        }
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            OSZ[] oszArr = new OSZ[3];
            if (z) {
                str = "model";
            } else {
                str = "camera";
            }
            oszArr[0] = new OSZ("switch_to", str);
            oszArr[1] = new OSZ("object_num", String.valueOf(i));
            oszArr[2] = new OSZ("is_ame_data", "1");
            LIZ.onEvent("camera_modelphoto_switch", C113554cx.LJJL(oszArr));
        }
    }

    public static final /* synthetic */ C94349afZ vl(MainFragment mainFragment) {
        C94349afZ c94349afZ = mainFragment.LJLJLJ;
        if (c94349afZ != null) {
            return c94349afZ;
        }
        o.LJIJI("binding");
        throw null;
    }

    public final void Al(boolean z) {
        C94349afZ c94349afZ = this.LJLJLJ;
        if (c94349afZ != null) {
            RelativeLayout relativeLayout = c94349afZ.LLIL;
            o.LJIIIIZZ(relativeLayout, "binding.rlController");
            relativeLayout.setClickable(z);
            C94349afZ c94349afZ2 = this.LJLJLJ;
            if (c94349afZ2 != null) {
                RelativeLayout relativeLayout2 = c94349afZ2.LLILII;
                o.LJIIIIZZ(relativeLayout2, "binding.rlLayer");
                relativeLayout2.setClickable(z);
                C94349afZ c94349afZ3 = this.LJLJLJ;
                if (c94349afZ3 != null) {
                    RelativeLayout relativeLayout3 = c94349afZ3.LLF;
                    o.LJIIIIZZ(relativeLayout3, "binding.flAdd");
                    relativeLayout3.setClickable(z);
                    return;
                }
                o.LJIJI("binding");
                throw null;
            }
            o.LJIJI("binding");
            throw null;
        }
        o.LJIJI("binding");
        throw null;
    }

    public final void Il(Feature feature) {
        feature.setVisible(false);
        ILayer LIZ = C93709aVF.LIZ();
        if (LIZ != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            LIZ.hideLayerPage(childFragmentManager);
        }
        CKEffectEditorContext.LJIILJJIL(null);
        Rl();
        C94349afZ c94349afZ = this.LJLJLJ;
        if (c94349afZ != null) {
            ConstraintLayout constraintLayout = c94349afZ.LJZL;
            o.LJIIIIZZ(constraintLayout, "binding.clBottomToolPanel");
            constraintLayout.setVisibility(4);
            C94349afZ c94349afZ2 = this.LJLJLJ;
            if (c94349afZ2 != null) {
                RelativeLayout relativeLayout = c94349afZ2.LLF;
                o.LJIIIIZZ(relativeLayout, "binding.flAdd");
                relativeLayout.setVisibility(4);
                long objectId = feature.id().objectId();
                IObjectSelect iObjectSelect = (IObjectSelect) C93971aZT.LIZ().LIZ(IObjectSelect.class);
                if (iObjectSelect != null) {
                    iObjectSelect.reEdit(this, 1, new C94272aeK(EnumC93823aX5.Text, C93825aX7.LJI(feature)), objectId);
                }
                Bundle arguments = getArguments();
                if (arguments != null) {
                    arguments.putLong("key_text_edit_feature_id", objectId);
                    return;
                }
                return;
            }
            o.LJIJI("binding");
            throw null;
        }
        o.LJIJI("binding");
        throw null;
    }

    public final int Nl(View view) {
        while (view != null) {
            ViewParent parent = view.getParent();
            if (this.LJLJLJ != null) {
                if (!o.LJ(parent, r0.LJLJLJ)) {
                    Object parent2 = view.getParent();
                    if (parent2 != null) {
                        view = (View) parent2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } else {
                    C94349afZ c94349afZ = this.LJLJLJ;
                    if (c94349afZ != null) {
                        return c94349afZ.LJLJLJ.indexOfChild(view);
                    }
                    o.LJIJI("binding");
                    throw null;
                }
            } else {
                o.LJIJI("binding");
                throw null;
            }
        }
        return -1;
    }

    public final void Ql(int i) {
        String str;
        StatisticReporter LIZ;
        String str2;
        Canvas LJ;
        CKEffectEditorContext.LJIILJJIL(null);
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (LJ = LJI.LJ()) != null) {
            LJ.stopAnimation();
        }
        C93829aXB LJI2 = CKEffectEditorContext.LJI();
        if (LJI2 != null && (str = LJI2.LIZ) != null && (LIZ = C93670aUc.LIZ()) != null) {
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ("project_id", str);
            oszArr[1] = new OSZ("ame_enter_from", getEnterFrom());
            if (i == 1) {
                str2 = "preview";
            } else {
                str2 = "canvas";
            }
            oszArr[2] = new OSZ("click_from", str2);
            LIZ.onEvent("submit_effect_click", C113554cx.LJJL(oszArr));
        }
        EffectCreatePipelineService effectCreatePipelineService = EffectCreatePipelineService.INSTANCE;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Intent intent = requireActivity.getIntent();
        o.LJIIIIZZ(intent, "requireActivity().intent");
        if (!effectCreatePipelineService.onInterceptExport(intent)) {
            C93829aXB LJI3 = CKEffectEditorContext.LJI();
            if (LJI3 != null && LJI3.LJIIIZ()) {
                ToastService toastService = ToastService.INSTANCE;
                Context requireContext = requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                String string = getString(R.string.fy_);
                o.LJIIIIZZ(string, "getString(com.ugc.effect…tool_toast_invalideffect)");
                toastService.showToast(requireContext, string);
                return;
            }
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94786amc(this, null), 3);
        }
    }

    public final void Wl(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadingview onEditBtnClickable = ");
        LIZ.append(z);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
        if (z) {
            C94349afZ c94349afZ = this.LJLJLJ;
            if (c94349afZ != null) {
                ConstraintLayout constraintLayout = c94349afZ.LJZL;
                o.LJIIIIZZ(constraintLayout, "binding.clBottomToolPanel");
                constraintLayout.setAlpha(1.0f);
                C94349afZ c94349afZ2 = this.LJLJLJ;
                if (c94349afZ2 != null) {
                    ConstraintLayout constraintLayout2 = c94349afZ2.LLIIIZ;
                    o.LJIIIIZZ(constraintLayout2, "binding.llTopToolPanel");
                    constraintLayout2.setAlpha(1.0f);
                    C94349afZ c94349afZ3 = this.LJLJLJ;
                    if (c94349afZ3 != null) {
                        RelativeLayout relativeLayout = c94349afZ3.LLF;
                        o.LJIIIIZZ(relativeLayout, "binding.flAdd");
                        relativeLayout.setAlpha(1.0f);
                        Al(true);
                        C94349afZ c94349afZ4 = this.LJLJLJ;
                        if (c94349afZ4 != null) {
                            ConstraintLayout constraintLayout3 = c94349afZ4.LLIIIZ;
                            o.LJIIIIZZ(constraintLayout3, "binding.llTopToolPanel");
                            Dl(constraintLayout3, true);
                            return;
                        }
                        o.LJIJI("binding");
                        throw null;
                    }
                    o.LJIJI("binding");
                    throw null;
                }
                o.LJIJI("binding");
                throw null;
            }
            o.LJIJI("binding");
            throw null;
        }
        C94349afZ c94349afZ5 = this.LJLJLJ;
        if (c94349afZ5 != null) {
            ConstraintLayout constraintLayout4 = c94349afZ5.LJZL;
            o.LJIIIIZZ(constraintLayout4, "binding.clBottomToolPanel");
            constraintLayout4.setAlpha(0.5f);
            C94349afZ c94349afZ6 = this.LJLJLJ;
            if (c94349afZ6 != null) {
                RelativeLayout relativeLayout2 = c94349afZ6.LLF;
                o.LJIIIIZZ(relativeLayout2, "binding.flAdd");
                relativeLayout2.setAlpha(0.5f);
                C94349afZ c94349afZ7 = this.LJLJLJ;
                if (c94349afZ7 != null) {
                    ConstraintLayout constraintLayout5 = c94349afZ7.LLIIIZ;
                    o.LJIIIIZZ(constraintLayout5, "binding.llTopToolPanel");
                    constraintLayout5.setAlpha(0.5f);
                    Al(false);
                    C94349afZ c94349afZ8 = this.LJLJLJ;
                    if (c94349afZ8 != null) {
                        ConstraintLayout constraintLayout6 = c94349afZ8.LLIIIZ;
                        o.LJIIIIZZ(constraintLayout6, "binding.llTopToolPanel");
                        Dl(constraintLayout6, false);
                        return;
                    }
                    o.LJIJI("binding");
                    throw null;
                }
                o.LJIJI("binding");
                throw null;
            }
            o.LJIJI("binding");
            throw null;
        }
        o.LJIJI("binding");
        throw null;
    }

    public final void Yl(String str) {
        Canvas LJ;
        C94349afZ c94349afZ = this.LJLJLJ;
        if (c94349afZ != null) {
            RelativeLayout relativeLayout = c94349afZ.LLF;
            o.LJIIIIZZ(relativeLayout, "binding.flAdd");
            C93729aVZ.LJFF(relativeLayout);
            StatisticReporter LIZ = C93670aUc.LIZ();
            if (LIZ != null) {
                LIZ.onEvent("effect_sheet_enter", C113554cx.LJJL(new OSZ("add_enter_from", str), new OSZ("is_ame_data", "1")));
            }
            CKEffectEditorContext.LJIILJJIL(null);
            C93829aXB LJI = CKEffectEditorContext.LJI();
            if (LJI != null && (LJ = LJI.LJ()) != null) {
                LJ.stopAnimation();
            }
            IObjectSelect iObjectSelect = (IObjectSelect) C93971aZT.LIZ().LIZ(IObjectSelect.class);
            if (iObjectSelect != null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                iObjectSelect.add(childFragmentManager, R.id.nod, str);
            }
            MainImpl LIZ2 = C93932aYq.LIZ();
            if (LIZ2 != null) {
                LIZ2.updateOperation(EnumC93724aVU.TO_OBJECT_SELECT);
                return;
            }
            return;
        }
        o.LJIJI("binding");
        throw null;
    }

    public final void cm(long j) {
        IObjectSelect iObjectSelect;
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && LJI.LJFF(j) != null && (iObjectSelect = (IObjectSelect) C93971aZT.LIZ().LIZ(IObjectSelect.class)) != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            iObjectSelect.replace(childFragmentManager, R.id.nod, j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        o.LJIIIZ(activity, "activity");
        super.onAttach(activity);
        if (activity instanceof ActivityC45651qj) {
            ((ComponentActivity) activity).getOnBackPressedDispatcher().LIZIZ(this.LJLLLL);
        }
        if (activity instanceof InterfaceC94011aa7) {
            this.LJLIL = (InterfaceC94011aa7) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IRecovery LIZ;
        super.onCreate(bundle);
        if (bundle != null && (LIZ = C93943aZ1.LIZ()) != null) {
            LIZ.onRestore(bundle);
        }
        ((LinkedHashMap) C93677aUj.LIZ).clear();
        C93677aUj.LIZIZ = "unkown";
        C93677aUj.LIZLLL = "";
    }

    public final void onEventEnter(String str) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("homepage_canvas_enter", C113554cx.LJJL(new OSZ("project_id", str), new OSZ("ame_enter_from", getEnterFrom())));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        IRecovery LIZ = C93943aZ1.LIZ();
        if (LIZ != null) {
            LIZ.onSaveState(outState);
        }
    }

    public final void wl(Map map) {
        EffectHint value = Ll().LJLJJL.getValue();
        if (value == null) {
            map.put("hint_text", "None");
        } else {
            map.put("hint_text", value.hint);
            map.put("hint_id", value.hintKey);
        }
    }

    public static void Dl(ViewGroup viewGroup, boolean z) {
        viewGroup.setEnabled(z);
        Iterator<View> it = C78924UyG.LIZLLL(viewGroup).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                View view = (View) iDObjectS0S0101000.next();
                if (view instanceof ViewGroup) {
                    Dl((ViewGroup) view, z);
                } else {
                    view.setEnabled(z);
                }
            } else {
                return;
            }
        }
    }

    public final void Tl(View view, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        C93747aVr.LIZIZ(view, this.LJLJJLL, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int[] iArr;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        IEditorContext LIZ = C93940aYy.LIZ();
        if (LIZ != null) {
            C94349afZ c94349afZ = this.LJLJLJ;
            if (c94349afZ != null) {
                FrameLayout frameLayout = c94349afZ.LLIIJLIL;
                o.LJIIIIZZ(frameLayout, "binding.opContainer");
                C94349afZ c94349afZ2 = this.LJLJLJ;
                if (c94349afZ2 != null) {
                    FrameLayout frameLayout2 = c94349afZ2.LLIIIL;
                    o.LJIIIIZZ(frameLayout2, "binding.layerContainer");
                    C94349afZ c94349afZ3 = this.LJLJLJ;
                    if (c94349afZ3 != null) {
                        FrameLayout frameLayout3 = c94349afZ3.LL;
                        o.LJIIIIZZ(frameLayout3, "binding.controllerContainer");
                        LIZ.registerGlobalContext(this, frameLayout, frameLayout2, frameLayout3);
                    } else {
                        o.LJIJI("binding");
                        throw null;
                    }
                } else {
                    o.LJIJI("binding");
                    throw null;
                }
            } else {
                o.LJIJI("binding");
                throw null;
            }
        }
        C94034aaU.LIZ("MainFragment", "main enter init view");
        C94349afZ c94349afZ4 = this.LJLJLJ;
        if (c94349afZ4 != null) {
            ImageView imageView = c94349afZ4.LLFZ;
            o.LJIIIIZZ(imageView, "binding.ivClose");
            Tl(imageView, new IDqS419S0100000_42(this, 103));
            C94349afZ c94349afZ5 = this.LJLJLJ;
            if (c94349afZ5 != null) {
                ImageView imageView2 = c94349afZ5.LJLJL;
                o.LJIIIIZZ(imageView2, "binding.ckeBackLl");
                Tl(imageView2, new IDqS419S0100000_42(this, 83));
                C94349afZ c94349afZ6 = this.LJLJLJ;
                if (c94349afZ6 != null) {
                    TextView textView = c94349afZ6.LJLLL;
                    o.LJIIIIZZ(textView, "binding.ckePreviewBack");
                    Tl(textView, new IDqS419S0100000_42(this, 84));
                    C94349afZ c94349afZ7 = this.LJLJLJ;
                    if (c94349afZ7 != null) {
                        ImageView imageView3 = c94349afZ7.LLII;
                        o.LJIIIIZZ(imageView3, "binding.ivModel");
                        Tl(imageView3, new IDqS419S0100000_42(this, 85));
                        C94349afZ c94349afZ8 = this.LJLJLJ;
                        if (c94349afZ8 != null) {
                            ImageView imageView4 = c94349afZ8.LLIIIILZ;
                            o.LJIIIIZZ(imageView4, "binding.ivSelectModel");
                            Tl(imageView4, new IDqS419S0100000_42(this, 86));
                            C94349afZ c94349afZ9 = this.LJLJLJ;
                            if (c94349afZ9 != null) {
                                RelativeLayout relativeLayout = c94349afZ9.LLF;
                                o.LJIIIIZZ(relativeLayout, "binding.flAdd");
                                Tl(relativeLayout, new IDqS419S0100000_42(this, 87));
                                C94349afZ c94349afZ10 = this.LJLJLJ;
                                if (c94349afZ10 != null) {
                                    View addImage = c94349afZ10.LJLIL.findViewById(R.id.nlh);
                                    C93718aVO c93718aVO = new C93718aVO();
                                    C94349afZ c94349afZ11 = this.LJLJLJ;
                                    if (c94349afZ11 != null) {
                                        RelativeLayout relativeLayout2 = c94349afZ11.LLF;
                                        o.LJIIIIZZ(relativeLayout2, "binding.flAdd");
                                        o.LJIIIIZZ(addImage, "addImage");
                                        c93718aVO.LIZ(relativeLayout2, addImage);
                                        C94349afZ c94349afZ12 = this.LJLJLJ;
                                        if (c94349afZ12 != null) {
                                            ImageView imageView5 = c94349afZ12.LLFII;
                                            o.LJIIIIZZ(imageView5, "binding.ivCamera");
                                            Tl(imageView5, new IDqS419S0100000_42(this, 88));
                                            C94349afZ c94349afZ13 = this.LJLJLJ;
                                            if (c94349afZ13 != null) {
                                                ImageView imageView6 = c94349afZ13.LLI;
                                                o.LJIIIIZZ(imageView6, "binding.ivFlipCamera");
                                                Tl(imageView6, new IDqS419S0100000_42(this, 90));
                                                C94349afZ c94349afZ14 = this.LJLJLJ;
                                                if (c94349afZ14 != null) {
                                                    ImageView imageView7 = c94349afZ14.LLIIII;
                                                    o.LJIIIIZZ(imageView7, "binding.ivPreviewForPublish");
                                                    Tl(imageView7, new IDqS419S0100000_42(this, 91));
                                                    C94349afZ c94349afZ15 = this.LJLJLJ;
                                                    if (c94349afZ15 != null) {
                                                        LinearLayout linearLayout = c94349afZ15.LLIILII;
                                                        o.LJIIIIZZ(linearLayout, "binding.previewForBehaviour");
                                                        Tl(linearLayout, new IDqS419S0100000_42(this, 92));
                                                        C94349afZ c94349afZ16 = this.LJLJLJ;
                                                        if (c94349afZ16 != null) {
                                                            RelativeLayout relativeLayout3 = c94349afZ16.LLFF;
                                                            o.LJIIIIZZ(relativeLayout3, "binding.flUpload");
                                                            C93748aVs scope = this.LJLJJLL;
                                                            IDqS419S0100000_42 iDqS419S0100000_42 = new IDqS419S0100000_42(this, 93);
                                                            o.LJIIIZ(scope, "scope");
                                                            C16880lQ.LJIIJ(new ViewOnClickListenerC93751aVv(scope, iDqS419S0100000_42), relativeLayout3);
                                                            ConfigProvider LIZ2 = C93938aYw.LIZ();
                                                            if (LIZ2 != null && LIZ2.shouldDropSubmitPage()) {
                                                                C94349afZ c94349afZ17 = this.LJLJLJ;
                                                                if (c94349afZ17 != null) {
                                                                    TextView textView2 = c94349afZ17.LLILLIZIL;
                                                                    o.LJIIIIZZ(textView2, "binding.tvPreviewSubmit");
                                                                    textView2.setText(view.getContext().getString(R.string.g07));
                                                                } else {
                                                                    o.LJIJI("binding");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C94349afZ c94349afZ18 = this.LJLJLJ;
                                                                if (c94349afZ18 != null) {
                                                                    TextView textView3 = c94349afZ18.LLILLIZIL;
                                                                    o.LJIIIIZZ(textView3, "binding.tvPreviewSubmit");
                                                                    textView3.setText(view.getContext().getString(R.string.tzj));
                                                                } else {
                                                                    o.LJIJI("binding");
                                                                    throw null;
                                                                }
                                                            }
                                                            C94349afZ c94349afZ19 = this.LJLJLJ;
                                                            if (c94349afZ19 != null) {
                                                                LinearLayout linearLayout2 = c94349afZ19.LLIIZ;
                                                                o.LJIIIIZZ(linearLayout2, "binding.previewSubmitContainer");
                                                                C93748aVs scope2 = this.LJLJJLL;
                                                                IDqS419S0100000_42 iDqS419S0100000_422 = new IDqS419S0100000_42(this, 94);
                                                                o.LJIIIZ(scope2, "scope");
                                                                C16880lQ.LJIIJ(new ViewOnClickListenerC93751aVv(scope2, iDqS419S0100000_422), linearLayout2);
                                                                C94349afZ c94349afZ20 = this.LJLJLJ;
                                                                if (c94349afZ20 != null) {
                                                                    c94349afZ20.LLFF.setOnLongClickListener(new IDCListenerS302S0100000_42(this, 1));
                                                                    C94349afZ c94349afZ21 = this.LJLJLJ;
                                                                    if (c94349afZ21 != null) {
                                                                        RelativeLayout relativeLayout4 = c94349afZ21.LLILII;
                                                                        o.LJIIIIZZ(relativeLayout4, "binding.rlLayer");
                                                                        Tl(relativeLayout4, new IDqS419S0100000_42(this, 95));
                                                                        C93718aVO c93718aVO2 = new C93718aVO();
                                                                        C94349afZ c94349afZ22 = this.LJLJLJ;
                                                                        if (c94349afZ22 != null) {
                                                                            RelativeLayout relativeLayout5 = c94349afZ22.LLILII;
                                                                            o.LJIIIIZZ(relativeLayout5, "binding.rlLayer");
                                                                            c93718aVO2.LIZ(relativeLayout5, relativeLayout5);
                                                                            C94349afZ c94349afZ23 = this.LJLJLJ;
                                                                            if (c94349afZ23 != null) {
                                                                                RelativeLayout relativeLayout6 = c94349afZ23.LLIL;
                                                                                o.LJIIIIZZ(relativeLayout6, "binding.rlController");
                                                                                Tl(relativeLayout6, new IDqS419S0100000_42(this, 96));
                                                                                C93718aVO c93718aVO3 = new C93718aVO();
                                                                                C94349afZ c94349afZ24 = this.LJLJLJ;
                                                                                if (c94349afZ24 != null) {
                                                                                    RelativeLayout relativeLayout7 = c94349afZ24.LLIL;
                                                                                    o.LJIIIIZZ(relativeLayout7, "binding.rlController");
                                                                                    c93718aVO3.LIZ(relativeLayout7, relativeLayout7);
                                                                                    C94349afZ c94349afZ25 = this.LJLJLJ;
                                                                                    if (c94349afZ25 != null) {
                                                                                        TextView textView4 = c94349afZ25.LJLZ;
                                                                                        o.LJIIIIZZ(textView4, "binding.ckePreviewReset");
                                                                                        Tl(textView4, new IDqS419S0100000_42(this, 97));
                                                                                        if (this.LJLJJL) {
                                                                                            C94349afZ c94349afZ26 = this.LJLJLJ;
                                                                                            if (c94349afZ26 != null) {
                                                                                                TextView textView5 = c94349afZ26.LLFFF;
                                                                                                o.LJIIIIZZ(textView5, "binding.hintSelection");
                                                                                                Tl(textView5, new IDqS419S0100000_42(this, 99));
                                                                                            } else {
                                                                                                o.LJIJI("binding");
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                        C94349afZ c94349afZ27 = this.LJLJLJ;
                                                                                        if (c94349afZ27 != null) {
                                                                                            TextView textView6 = c94349afZ27.LJLLLL;
                                                                                            o.LJIIIIZZ(textView6, "binding.ckePreviewFlip");
                                                                                            Tl(textView6, new IDqS419S0100000_42(this, 100));
                                                                                            C94349afZ c94349afZ28 = this.LJLJLJ;
                                                                                            if (c94349afZ28 != null) {
                                                                                                TextView textView7 = c94349afZ28.LJLJJI;
                                                                                                o.LJIIIIZZ(textView7, "binding.btnCkeMainTemplateReset");
                                                                                                textView7.setSelected(true);
                                                                                                if (textView7.getText().length() > 16) {
                                                                                                    textView7.setTextSize(11.0f);
                                                                                                }
                                                                                                C94349afZ c94349afZ29 = this.LJLJLJ;
                                                                                                if (c94349afZ29 != null) {
                                                                                                    LinearLayout linearLayout3 = c94349afZ29.LJLLJ;
                                                                                                    o.LJIIIIZZ(linearLayout3, "binding.ckeMainTemplatePreviewReset");
                                                                                                    Tl(linearLayout3, new IDqS419S0100000_42(this, 101));
                                                                                                    C94349afZ c94349afZ30 = this.LJLJLJ;
                                                                                                    if (c94349afZ30 != null) {
                                                                                                        TextView textView8 = c94349afZ30.LJLJI;
                                                                                                        o.LJIIIIZZ(textView8, "binding.btnCkeMainApplyTemplate");
                                                                                                        textView8.setSelected(true);
                                                                                                        if (textView8.getText().length() > 16) {
                                                                                                            textView8.setTextSize(11.0f);
                                                                                                        }
                                                                                                        C94349afZ c94349afZ31 = this.LJLJLJ;
                                                                                                        if (c94349afZ31 != null) {
                                                                                                            LinearLayout linearLayout4 = c94349afZ31.LJLJLLL;
                                                                                                            o.LJIIIIZZ(linearLayout4, "binding.ckeMainApplyTemplate");
                                                                                                            Tl(linearLayout4, new IDqS419S0100000_42(this, 105));
                                                                                                            C94349afZ c94349afZ32 = this.LJLJLJ;
                                                                                                            if (c94349afZ32 != null) {
                                                                                                                c94349afZ32.LLIIIZ.addOnLayoutChangeListener(new IDCListenerS262S0100000_42(this, 4));
                                                                                                                C94349afZ c94349afZ33 = this.LJLJLJ;
                                                                                                                if (c94349afZ33 != null) {
                                                                                                                    C1AH ckeMainNormalPreviewGroup = c94349afZ33.LJLL;
                                                                                                                    o.LJIIIIZZ(ckeMainNormalPreviewGroup, "ckeMainNormalPreviewGroup");
                                                                                                                    if (this.LJLJJL) {
                                                                                                                        C93522aSE ckeMainPreviewDot = c94349afZ33.LJLLI;
                                                                                                                        o.LJIIIIZZ(ckeMainPreviewDot, "ckeMainPreviewDot");
                                                                                                                        TextView ckePreviewReset = c94349afZ33.LJLZ;
                                                                                                                        o.LJIIIIZZ(ckePreviewReset, "ckePreviewReset");
                                                                                                                        TextView ckePreviewTip = c94349afZ33.LJZ;
                                                                                                                        o.LJIIIIZZ(ckePreviewTip, "ckePreviewTip");
                                                                                                                        TextView hintSelection = c94349afZ33.LLFFF;
                                                                                                                        o.LJIIIIZZ(hintSelection, "hintSelection");
                                                                                                                        iArr = new int[]{ckeMainPreviewDot.getId(), ckePreviewReset.getId(), ckePreviewTip.getId(), hintSelection.getId()};
                                                                                                                    } else {
                                                                                                                        C93522aSE ckeMainPreviewDot2 = c94349afZ33.LJLLI;
                                                                                                                        o.LJIIIIZZ(ckeMainPreviewDot2, "ckeMainPreviewDot");
                                                                                                                        TextView ckePreviewReset2 = c94349afZ33.LJLZ;
                                                                                                                        o.LJIIIIZZ(ckePreviewReset2, "ckePreviewReset");
                                                                                                                        TextView ckePreviewTip2 = c94349afZ33.LJZ;
                                                                                                                        o.LJIIIIZZ(ckePreviewTip2, "ckePreviewTip");
                                                                                                                        iArr = new int[]{ckeMainPreviewDot2.getId(), ckePreviewReset2.getId(), ckePreviewTip2.getId()};
                                                                                                                    }
                                                                                                                    ckeMainNormalPreviewGroup.setReferencedIds(iArr);
                                                                                                                    C1AH ckeMainTemplatePreviewGroup = c94349afZ33.LJLLILLLL;
                                                                                                                    o.LJIIIIZZ(ckeMainTemplatePreviewGroup, "ckeMainTemplatePreviewGroup");
                                                                                                                    LinearLayout ckeMainTemplatePreviewReset = c94349afZ33.LJLLJ;
                                                                                                                    o.LJIIIIZZ(ckeMainTemplatePreviewReset, "ckeMainTemplatePreviewReset");
                                                                                                                    LinearLayout ckeMainApplyTemplate = c94349afZ33.LJLJLLL;
                                                                                                                    o.LJIIIIZZ(ckeMainApplyTemplate, "ckeMainApplyTemplate");
                                                                                                                    ckeMainTemplatePreviewGroup.setReferencedIds(new int[]{ckeMainTemplatePreviewReset.getId(), ckeMainApplyTemplate.getId()});
                                                                                                                    C93407aQN.LIZJ = "init";
                                                                                                                    C93407aQN.LIZIZ = System.currentTimeMillis();
                                                                                                                    Handler handler = C93407aQN.LIZ;
                                                                                                                    if (handler != null) {
                                                                                                                        handler.removeCallbacksAndMessages(null);
                                                                                                                    }
                                                                                                                    Handler handler2 = new Handler(C16880lQ.LLJJJJ());
                                                                                                                    C93407aQN.LIZ = handler2;
                                                                                                                    handler2.postDelayed(C93407aQN.LIZLLL, 20000L);
                                                                                                                    Ol().iv0(Jl());
                                                                                                                    ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(view, new IDRunnableS33S0200000_42(view, this, bundle, 0));
                                                                                                                    if (!Ol().LJLJJL) {
                                                                                                                        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                                                                                                                        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
                                                                                                                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94919aol(this, null), 3);
                                                                                                                    }
                                                                                                                    if (!Keva.getRepo("cke_main_action_store_repo").getBoolean("cke_user_has_enter_key", false)) {
                                                                                                                        Keva.getRepo("cke_main_action_store_repo").storeBoolean("cke_user_has_enter_key", true);
                                                                                                                        Context requireContext = requireContext();
                                                                                                                        o.LJIIIIZZ(requireContext, "requireContext()");
                                                                                                                        FragmentManager childFragmentManager = getChildFragmentManager();
                                                                                                                        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                                                                                                                        C94502ai2 c94502ai2 = new C94502ai2(this);
                                                                                                                        IStepIntroSheet iStepIntroSheet = (IStepIntroSheet) ((IService) C93971aZT.LIZ().LIZ(IStepIntroSheet.class));
                                                                                                                        if (iStepIntroSheet != null) {
                                                                                                                            Integer valueOf = Integer.valueOf(R.drawable.dhm);
                                                                                                                            String string = requireContext.getString(R.string.fxl);
                                                                                                                            String string2 = requireContext.getString(R.string.fxf);
                                                                                                                            o.LJIIIIZZ(string2, "context.getString(com.ug…ffect_tool_onboard_step1)");
                                                                                                                            String string3 = requireContext.getString(R.string.fxg);
                                                                                                                            o.LJIIIIZZ(string3, "context.getString(com.ug…ol_onboard_step1_content)");
                                                                                                                            String string4 = requireContext.getString(R.string.fxh);
                                                                                                                            o.LJIIIIZZ(string4, "context.getString(com.ug…ffect_tool_onboard_step2)");
                                                                                                                            String string5 = requireContext.getString(R.string.fxi);
                                                                                                                            o.LJIIIIZZ(string5, "context.getString(com.ug…ol_onboard_step2_content)");
                                                                                                                            String string6 = requireContext.getString(R.string.fxj);
                                                                                                                            o.LJIIIIZZ(string6, "context.getString(com.ug…ffect_tool_onboard_step3)");
                                                                                                                            String string7 = requireContext.getString(R.string.fxk);
                                                                                                                            o.LJIIIIZZ(string7, "context.getString(com.ug…ol_onboard_step3_content)");
                                                                                                                            iStepIntroSheet.show(childFragmentManager, new C93481aRZ(valueOf, string, C47261Igj.LJJIJIIJI(new C93482aRa(string2, string3), new C93482aRa(string4, string5), new C93482aRa(string6, string7)), requireContext.getString(R.string.fxm)), c94502ai2);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
                                                                                                                    o.LJIIIIZZ(viewLifecycleOwner2, "viewLifecycleOwner");
                                                                                                                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C94925aor(this, null), 3);
                                                                                                                    return;
                                                                                                                }
                                                                                                                o.LJIJI("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o.LJIJI("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        o.LJIJI("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    o.LJIJI("binding");
                                                                                                    throw null;
                                                                                                }
                                                                                                o.LJIJI("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("binding");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("binding");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("binding");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("binding");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("binding");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("binding");
                                                                throw null;
                                                            }
                                                            o.LJIJI("binding");
                                                            throw null;
                                                        }
                                                        o.LJIJI("binding");
                                                        throw null;
                                                    }
                                                    o.LJIJI("binding");
                                                    throw null;
                                                }
                                                o.LJIJI("binding");
                                                throw null;
                                            }
                                            o.LJIJI("binding");
                                            throw null;
                                        }
                                        o.LJIJI("binding");
                                        throw null;
                                    }
                                    o.LJIJI("binding");
                                    throw null;
                                }
                                o.LJIJI("binding");
                                throw null;
                            }
                            o.LJIJI("binding");
                            throw null;
                        }
                        o.LJIJI("binding");
                        throw null;
                    }
                    o.LJIJI("binding");
                    throw null;
                }
                o.LJIJI("binding");
                throw null;
            }
            o.LJIJI("binding");
            throw null;
        }
        o.LJIJI("binding");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Hl(com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData r6, java.lang.String r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C94547ail
            if (r0 == 0) goto L6c
            r4 = r8
            X.ail r4 = (X.C94547ail) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L5e
            if (r0 != r2) goto L72
            java.lang.Object r6 = r4.LJLJJI
            com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData r6 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData) r6
            X.C141335gf.LIZJ(r3)
        L24:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData r3 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData) r3
            if (r3 == 0) goto L57
            java.lang.String r1 = r3.LJLJJI
            int r0 = r1.length()
            if (r0 <= 0) goto L5c
            r0 = 1
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L40
            r6.getClass()
            r6.LJLJJI = r1
        L40:
            java.lang.String r1 = r3.LJLJJL
            int r0 = r1.length()
            if (r0 <= 0) goto L5a
        L48:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L57
            r6.getClass()
            r6.LJLJJL = r1
        L57:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5a:
            r2 = 0
            goto L48
        L5c:
            r0 = 0
            goto L31
        L5e:
            X.C141335gf.LIZJ(r3)
            r4.LJLJJI = r6
            r4.LJLILLLLZI = r2
            java.lang.Object r3 = X.C93677aUj.LIZLLL(r7)
            if (r3 != r1) goto L24
            return r1
        L6c:
            X.ail r4 = new X.ail
            r4.<init>(r5, r8)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ugc.effectcreator.main.MainFragment.Hl(com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData, java.lang.String, X.2kd):java.lang.Object");
    }

    public final void Zl(String str, String str2, String str3) {
        C93819aX1.LIZ().previewTemplateEvent().setValue(null);
        LJIIJ();
        C93939aYx.LIZ().getRenderModeData().observe(getViewLifecycleOwner(), new C94112abk(this, str, str2, str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object em(boolean r27, boolean r28, X.InterfaceC67352kd<? super com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo> r29) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ugc.effectcreator.main.MainFragment.em(boolean, boolean, X.2kd):java.lang.Object");
    }

    public final void km(boolean z, ViewGroup viewGroup, InterfaceC88472Yns<? super Animator, C76800UCe> interfaceC88472Yns) {
        LiveData<EnumC93725aVV> mainPageStatus;
        LiveData<EnumC93725aVV> mainPageStatus2;
        if (z) {
            Al(true);
            float scaleX = viewGroup.getScaleX();
            float scaleY = viewGroup.getScaleY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(C94010aa6.LIZ());
            ofFloat.addUpdateListener(new C93518aSA(viewGroup, scaleX, scaleY, interfaceC88472Yns));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new C94113abl(viewGroup, interfaceC88472Yns));
            ofFloat.start();
            IMain LIZ = C93723aVT.LIZ();
            if (LIZ != null && (mainPageStatus2 = LIZ.getMainPageStatus()) != null) {
                mainPageStatus2.setValue(EnumC93725aVV.NORMAL);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ugc.effectcreator.main.MainLiveData<com.bytedance.effectcreatormobile.ckeapi.api.main.MainPageStatus>");
        }
        float width = viewGroup.getWidth() * 0.693f;
        Al(false);
        int width2 = viewGroup.getWidth();
        viewGroup.getHeight();
        float f = width / width2;
        viewGroup.setPivotX(viewGroup.getWidth() * (((viewGroup.getWidth() - width) - C93742aVm.LIZJ(8.0f)) / (viewGroup.getWidth() - width)));
        float height = viewGroup.getHeight() - (viewGroup.getHeight() * f);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        C94349afZ c94349afZ = this.LJLJLJ;
        if (c94349afZ != null) {
            c94349afZ.LLIIIZ.getLocationOnScreen(iArr);
            viewGroup.getLocationOnScreen(iArr2);
            int LIZJ = C93742aVm.LIZJ(34.0f) + (iArr[1] - iArr2[1]);
            C94349afZ c94349afZ2 = this.LJLJLJ;
            if (c94349afZ2 != null) {
                o.LJIIIIZZ(c94349afZ2.LLIIIZ, "binding.llTopToolPanel");
                viewGroup.setPivotY(viewGroup.getHeight() * ((LIZJ + r1.getHeight()) / height));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setInterpolator(C94010aa6.LIZ());
                ofFloat2.addUpdateListener(new C93519aSB(viewGroup, f, interfaceC88472Yns));
                ofFloat2.setDuration(350L);
                ofFloat2.addListener(new C94114abm(viewGroup, interfaceC88472Yns));
                ofFloat2.start();
                IMain LIZ2 = C93723aVT.LIZ();
                if (LIZ2 != null && (mainPageStatus = LIZ2.getMainPageStatus()) != null) {
                    mainPageStatus.setValue(EnumC93725aVV.NARROW);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ugc.effectcreator.main.MainLiveData<com.bytedance.effectcreatormobile.ckeapi.api.main.MainPageStatus>");
            }
            o.LJIJI("binding");
            throw null;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Object obj;
        Feature LJFF;
        TextModel textModel;
        String str;
        if (i != 1) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, "key_text_edit_feature_id");
        } else {
            obj = null;
        }
        if (!(obj instanceof Long)) {
            obj = null;
        }
        Long l = (Long) obj;
        if (i2 == -1) {
            if (intent != null) {
                textModel = (TextModel) intent.getParcelableExtra("key_text_model");
            } else {
                textModel = null;
            }
            if (l != null) {
                l.longValue();
                if (textModel != null && (str = textModel.textSticker) != null) {
                    C94014aaA.LIZ(str, false, new IDqS175S0200000_42(textModel, l, 4));
                }
            }
        }
        C94349afZ c94349afZ = this.LJLJLJ;
        if (c94349afZ != null) {
            ConstraintLayout constraintLayout = c94349afZ.LLILL;
            o.LJIIIIZZ(constraintLayout, "binding.topBar");
            constraintLayout.setVisibility(0);
            C94349afZ c94349afZ2 = this.LJLJLJ;
            if (c94349afZ2 != null) {
                ConstraintLayout constraintLayout2 = c94349afZ2.LJZL;
                o.LJIIIIZZ(constraintLayout2, "binding.clBottomToolPanel");
                constraintLayout2.setVisibility(0);
                C94349afZ c94349afZ3 = this.LJLJLJ;
                if (c94349afZ3 != null) {
                    RelativeLayout relativeLayout = c94349afZ3.LLF;
                    o.LJIIIIZZ(relativeLayout, "binding.flAdd");
                    relativeLayout.setVisibility(0);
                    if (l == null) {
                        return;
                    }
                    l.longValue();
                    C93829aXB c93829aXB = CKEffectEditorContext.LJIILL;
                    if (c93829aXB == null || (LJFF = c93829aXB.LJFF(l.longValue())) == null) {
                        return;
                    }
                    LJFF.setVisible(true);
                    CKEffectEditorContext.LJIILJJIL(l);
                    return;
                }
                o.LJIJI("binding");
                throw null;
            }
            o.LJIJI("binding");
            throw null;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(inflater, "inflater");
        IRecovery LIZ = C93943aZ1.LIZ();
        C29S c29s = null;
        if (LIZ != null) {
            str = LIZ.getCachedDraftPath();
        } else {
            str = null;
        }
        this.LJLZ = str;
        int i = 0;
        if (str != null && !ujb.o.LJJJJJL(str)) {
            StateViewModel.hv0(Ol().LJLILLLLZI, "");
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.fragment_main, viewGroup, false);
        int i2 = R.id.nlj;
        View findViewById = LLLLIILL.findViewById(R.id.nlj);
        if (findViewById != null) {
            i2 = R.id.nlx;
            TextView textView = (TextView) LLLLIILL.findViewById(R.id.nlx);
            if (textView != null) {
                i2 = R.id.nly;
                TextView textView2 = (TextView) LLLLIILL.findViewById(R.id.nly);
                if (textView2 != null) {
                    i2 = R.id.b33;
                    FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.b33);
                    if (frameLayout != null) {
                        i2 = R.id.nm3;
                        FrameLayout frameLayout2 = (FrameLayout) LLLLIILL.findViewById(R.id.nm3);
                        if (frameLayout2 != null) {
                            i2 = R.id.nm7;
                            ImageView imageView = (ImageView) LLLLIILL.findViewById(R.id.nm7);
                            if (imageView != null) {
                                C94164aca c94164aca = (C94164aca) LLLLIILL;
                                i2 = R.id.nmf;
                                LinearLayout linearLayout = (LinearLayout) LLLLIILL.findViewById(R.id.nmf);
                                if (linearLayout != null) {
                                    i2 = R.id.nmg;
                                    C1AH c1ah = (C1AH) LLLLIILL.findViewById(R.id.nmg);
                                    if (c1ah != null) {
                                        i2 = R.id.nmh;
                                        C93522aSE c93522aSE = (C93522aSE) LLLLIILL.findViewById(R.id.nmh);
                                        if (c93522aSE != null) {
                                            i2 = R.id.nmi;
                                            C1AH c1ah2 = (C1AH) LLLLIILL.findViewById(R.id.nmi);
                                            if (c1ah2 != null) {
                                                i2 = R.id.nmj;
                                                LinearLayout linearLayout2 = (LinearLayout) LLLLIILL.findViewById(R.id.nmj);
                                                if (linearLayout2 != null) {
                                                    i2 = R.id.nmk;
                                                    TextView textView3 = (TextView) LLLLIILL.findViewById(R.id.nmk);
                                                    if (textView3 != null) {
                                                        i2 = R.id.nml;
                                                        TextView textView4 = (TextView) LLLLIILL.findViewById(R.id.nml);
                                                        if (textView4 != null) {
                                                            i2 = R.id.nmm;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL.findViewById(R.id.nmm);
                                                            if (constraintLayout != null) {
                                                                i2 = R.id.nmn;
                                                                TextView textView5 = (TextView) LLLLIILL.findViewById(R.id.nmn);
                                                                if (textView5 != null) {
                                                                    i2 = R.id.nmo;
                                                                    TextView textView6 = (TextView) LLLLIILL.findViewById(R.id.nmo);
                                                                    if (textView6 != null) {
                                                                        i2 = R.id.nmp;
                                                                        View findViewById2 = LLLLIILL.findViewById(R.id.nmp);
                                                                        if (findViewById2 != null) {
                                                                            i2 = R.id.nmu;
                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) LLLLIILL.findViewById(R.id.nmu);
                                                                            if (constraintLayout2 != null) {
                                                                                i2 = R.id.nmw;
                                                                                FrameLayout frameLayout3 = (FrameLayout) LLLLIILL.findViewById(R.id.nmw);
                                                                                if (frameLayout3 != null) {
                                                                                    i2 = R.id.d9q;
                                                                                    FrameLayout frameLayout4 = (FrameLayout) LLLLIILL.findViewById(R.id.d9q);
                                                                                    if (frameLayout4 != null) {
                                                                                        i2 = R.id.nn0;
                                                                                        RelativeLayout relativeLayout = (RelativeLayout) LLLLIILL.findViewById(R.id.nn0);
                                                                                        if (relativeLayout != null) {
                                                                                            i2 = R.id.nn4;
                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) LLLLIILL.findViewById(R.id.nn4);
                                                                                            if (relativeLayout2 != null) {
                                                                                                i2 = R.id.nn9;
                                                                                                TextView textView7 = (TextView) LLLLIILL.findViewById(R.id.nn9);
                                                                                                if (textView7 != null) {
                                                                                                    i2 = R.id.ezo;
                                                                                                    ImageView imageView2 = (ImageView) LLLLIILL.findViewById(R.id.ezo);
                                                                                                    if (imageView2 != null) {
                                                                                                        i2 = R.id.f0h;
                                                                                                        ImageView imageView3 = (ImageView) LLLLIILL.findViewById(R.id.f0h);
                                                                                                        if (imageView3 != null) {
                                                                                                            i2 = R.id.nnd;
                                                                                                            if (LLLLIILL.findViewById(R.id.nnd) != null) {
                                                                                                                i2 = R.id.nng;
                                                                                                                ImageView imageView4 = (ImageView) LLLLIILL.findViewById(R.id.nng);
                                                                                                                if (imageView4 != null) {
                                                                                                                    i2 = R.id.nni;
                                                                                                                    ImageView imageView5 = (ImageView) LLLLIILL.findViewById(R.id.nni);
                                                                                                                    if (imageView5 != null) {
                                                                                                                        i2 = R.id.nnj;
                                                                                                                        ImageView imageView6 = (ImageView) LLLLIILL.findViewById(R.id.nnj);
                                                                                                                        if (imageView6 != null) {
                                                                                                                            i2 = R.id.nnq;
                                                                                                                            ImageView imageView7 = (ImageView) LLLLIILL.findViewById(R.id.nnq);
                                                                                                                            if (imageView7 != null) {
                                                                                                                                i2 = R.id.nnr;
                                                                                                                                ImageView imageView8 = (ImageView) LLLLIILL.findViewById(R.id.nnr);
                                                                                                                                if (imageView8 != null) {
                                                                                                                                    i2 = R.id.fc4;
                                                                                                                                    ImageView imageView9 = (ImageView) LLLLIILL.findViewById(R.id.fc4);
                                                                                                                                    if (imageView9 != null) {
                                                                                                                                        i2 = R.id.nnw;
                                                                                                                                        FrameLayout frameLayout5 = (FrameLayout) LLLLIILL.findViewById(R.id.nnw);
                                                                                                                                        if (frameLayout5 != null) {
                                                                                                                                            i2 = R.id.no3;
                                                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) LLLLIILL.findViewById(R.id.no3);
                                                                                                                                            if (constraintLayout3 != null) {
                                                                                                                                                i2 = R.id.g8a;
                                                                                                                                                FrameLayout frameLayout6 = (FrameLayout) LLLLIILL.findViewById(R.id.g8a);
                                                                                                                                                if (frameLayout6 != null) {
                                                                                                                                                    i2 = R.id.nod;
                                                                                                                                                    FrameLayout frameLayout7 = (FrameLayout) LLLLIILL.findViewById(R.id.nod);
                                                                                                                                                    if (frameLayout7 != null) {
                                                                                                                                                        i2 = R.id.i2k;
                                                                                                                                                        FrameLayout frameLayout8 = (FrameLayout) LLLLIILL.findViewById(R.id.i2k);
                                                                                                                                                        if (frameLayout8 != null) {
                                                                                                                                                            i2 = R.id.nog;
                                                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) LLLLIILL.findViewById(R.id.nog);
                                                                                                                                                            if (linearLayout3 != null) {
                                                                                                                                                                i2 = R.id.noi;
                                                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) LLLLIILL.findViewById(R.id.noi);
                                                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                                                    i2 = R.id.noj;
                                                                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) LLLLIILL.findViewById(R.id.noj);
                                                                                                                                                                    if (linearLayout5 != null) {
                                                                                                                                                                        i2 = R.id.nom;
                                                                                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) LLLLIILL.findViewById(R.id.nom);
                                                                                                                                                                        if (relativeLayout3 != null) {
                                                                                                                                                                            i2 = R.id.nor;
                                                                                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) LLLLIILL.findViewById(R.id.nor);
                                                                                                                                                                            if (relativeLayout4 != null) {
                                                                                                                                                                                i2 = R.id.npf;
                                                                                                                                                                                View findViewById3 = LLLLIILL.findViewById(R.id.npf);
                                                                                                                                                                                if (findViewById3 != null) {
                                                                                                                                                                                    i2 = R.id.le7;
                                                                                                                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) LLLLIILL.findViewById(R.id.le7);
                                                                                                                                                                                    if (constraintLayout4 != null) {
                                                                                                                                                                                        i2 = R.id.npt;
                                                                                                                                                                                        if (LLLLIILL.findViewById(R.id.npt) != null) {
                                                                                                                                                                                            i2 = R.id.nq4;
                                                                                                                                                                                            TextView textView8 = (TextView) LLLLIILL.findViewById(R.id.nq4);
                                                                                                                                                                                            if (textView8 != null) {
                                                                                                                                                                                                i2 = R.id.nq9;
                                                                                                                                                                                                if (LLLLIILL.findViewById(R.id.nq9) != null) {
                                                                                                                                                                                                    i2 = R.id.nq_;
                                                                                                                                                                                                    TextView textView9 = (TextView) LLLLIILL.findViewById(R.id.nq_);
                                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                                        i2 = R.id.nqf;
                                                                                                                                                                                                        View findViewById4 = LLLLIILL.findViewById(R.id.nqf);
                                                                                                                                                                                                        if (findViewById4 != null) {
                                                                                                                                                                                                            this.LJLJLJ = new C94349afZ(c94164aca, findViewById, textView, textView2, frameLayout, frameLayout2, imageView, c94164aca, linearLayout, c1ah, c93522aSE, c1ah2, linearLayout2, textView3, textView4, constraintLayout, textView5, textView6, findViewById2, constraintLayout2, frameLayout3, frameLayout4, relativeLayout, relativeLayout2, textView7, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, frameLayout5, constraintLayout3, frameLayout6, frameLayout7, frameLayout8, linearLayout3, linearLayout4, linearLayout5, relativeLayout3, relativeLayout4, findViewById3, constraintLayout4, textView8, textView9, findViewById4);
                                                                                                                                                                                                            Wl(false);
                                                                                                                                                                                                            Context requireContext = requireContext();
                                                                                                                                                                                                            int i3 = C93743aVn.LIZ;
                                                                                                                                                                                                            if (i3 == 0) {
                                                                                                                                                                                                                if (requireContext != null) {
                                                                                                                                                                                                                    Resources resources = requireContext.getResources();
                                                                                                                                                                                                                    o.LJIIIIZZ(resources, "context.resources");
                                                                                                                                                                                                                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                                                                                                                                                                                                                    if (identifier > 0) {
                                                                                                                                                                                                                        i = resources.getDimensionPixelSize(identifier);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                C93743aVn.LIZ = i;
                                                                                                                                                                                                                i3 = i;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            C94349afZ c94349afZ = this.LJLJLJ;
                                                                                                                                                                                                            if (c94349afZ != null) {
                                                                                                                                                                                                                View view = c94349afZ.LJZI;
                                                                                                                                                                                                                if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                                                                                                                                                                                                                    layoutParams.height = i3;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                InterfaceC93411aQR interfaceC93411aQR = this.LJLILLLLZI;
                                                                                                                                                                                                                C94349afZ c94349afZ2 = this.LJLJLJ;
                                                                                                                                                                                                                if (c94349afZ2 != null) {
                                                                                                                                                                                                                    FrameLayout frameLayout9 = c94349afZ2.LLIIJI;
                                                                                                                                                                                                                    o.LJIIIIZZ(frameLayout9, "binding.loadingContainer");
                                                                                                                                                                                                                    interfaceC93411aQR.LIZ(inflater, frameLayout9);
                                                                                                                                                                                                                    InterfaceC93645aUD interfaceC93645aUD = this.LJLJI;
                                                                                                                                                                                                                    C94349afZ c94349afZ3 = this.LJLJLJ;
                                                                                                                                                                                                                    if (c94349afZ3 != null) {
                                                                                                                                                                                                                        FrameLayout frameLayout10 = c94349afZ3.LLIIJI;
                                                                                                                                                                                                                        o.LJIIIIZZ(frameLayout10, "binding.loadingContainer");
                                                                                                                                                                                                                        interfaceC93645aUD.LIZ(inflater, frameLayout10);
                                                                                                                                                                                                                        C94349afZ c94349afZ4 = this.LJLJLJ;
                                                                                                                                                                                                                        if (c94349afZ4 != null) {
                                                                                                                                                                                                                            C94164aca c94164aca2 = c94349afZ4.LJLIL;
                                                                                                                                                                                                                            o.LJIIIIZZ(c94164aca2, "binding.root");
                                                                                                                                                                                                                            c94164aca2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC93517aS9(this));
                                                                                                                                                                                                                            C94349afZ c94349afZ5 = this.LJLJLJ;
                                                                                                                                                                                                                            if (c94349afZ5 != null) {
                                                                                                                                                                                                                                TextView textView10 = c94349afZ5.LJLLLL;
                                                                                                                                                                                                                                o.LJIIIIZZ(textView10, "binding.ckePreviewFlip");
                                                                                                                                                                                                                                textView10.setSelected(true);
                                                                                                                                                                                                                                C94349afZ c94349afZ6 = this.LJLJLJ;
                                                                                                                                                                                                                                if (c94349afZ6 != null) {
                                                                                                                                                                                                                                    TextView textView11 = c94349afZ6.LJLZ;
                                                                                                                                                                                                                                    o.LJIIIIZZ(textView11, "binding.ckePreviewReset");
                                                                                                                                                                                                                                    textView11.setSelected(true);
                                                                                                                                                                                                                                    C94349afZ c94349afZ7 = this.LJLJLJ;
                                                                                                                                                                                                                                    if (c94349afZ7 != null) {
                                                                                                                                                                                                                                        C94164aca c94164aca3 = c94349afZ7.LJLIL;
                                                                                                                                                                                                                                        o.LJIIIIZZ(c94164aca3, "binding.root");
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            ViewTreeLifecycleOwner.set(c94164aca3, getViewLifecycleOwner());
                                                                                                                                                                                                                                            ViewTreeViewModelStoreOwner.set(c94164aca3, this);
                                                                                                                                                                                                                                            C10A.LIZIZ(c94164aca3, this);
                                                                                                                                                                                                                                            ActivityC45651qj mo49getActivity = mo49getActivity();
                                                                                                                                                                                                                                            if (mo49getActivity instanceof C29S) {
                                                                                                                                                                                                                                                c29s = (C29S) mo49getActivity;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            C90903hW.LIZ(c29s);
                                                                                                                                                                                                                                            C3C5.m7constructorimpl(C76800UCe.LIZ);
                                                                                                                                                                                                                                        } catch (Throwable th) {
                                                                                                                                                                                                                                            C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        return c94164aca3;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    o.LJIJI("binding");
                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                o.LJIJI("binding");
                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            o.LJIJI("binding");
                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        o.LJIJI("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    o.LJIJI("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                o.LJIJI("binding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            o.LJIJI("binding");
                                                                                                                                                                                                            throw null;
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i2)));
    }

    public static /* synthetic */ Object fm(MainFragment mainFragment, boolean z, boolean z2, InterfaceC67352kd interfaceC67352kd, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return mainFragment.em(z, z2, interfaceC67352kd);
    }
}
