package com.bytedance.effectcreatormobile.camera;

import X.AbstractC93937aYv;
import X.AbstractC94340afQ;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3BJ;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C84133X0f;
import X.C90903hW;
import X.C93408aQO;
import X.C93485aRd;
import X.C93698aV4;
import X.C93722aVS;
import X.C93723aVT;
import X.C93742aVm;
import X.C93745aVp;
import X.C93797aWf;
import X.C93819aX1;
import X.C93829aXB;
import X.C93880aY0;
import X.C93882aY2;
import X.C93883aY3;
import X.C93886aY6;
import X.C93899aYJ;
import X.C93912aYW;
import X.C93913aYX;
import X.C93939aYx;
import X.C93971aZT;
import X.C94010aa6;
import X.C94019aaF;
import X.C94020aaG;
import X.C94026aaM;
import X.C94027aaN;
import X.C94034aaU;
import X.C94308aeu;
import X.C94318af4;
import X.C94339afP;
import X.C94342afS;
import X.C94420agi;
import X.C94503ai3;
import X.C94504ai4;
import X.C94533aiX;
import X.C94534aiY;
import X.C94659akZ;
import X.C94700alE;
import X.C94887aoF;
import X.C94889aoH;
import X.EnumC93724aVU;
import X.EnumC94025aaL;
import X.EnumC94029aaP;
import X.InterfaceC65462ha;
import X.InterfaceC65784Pro;
import X.InterfaceC93966aZO;
import X.P4Q;
import X.P6F;
import X.X1D;
import X.XKX;
import Y.IDObserverS227S0100000_42;
import Y.IDUListenerS265S0100000_42;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.effectcreatormobile.camera.impl.CameraRenderImpl;
import com.bytedance.effectcreatormobile.camera.viewmodel.EffectHintViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.CameraApi;
import com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor;
import com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor;
import com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect;
import com.bytedance.ies.effectcreator.swig.DataEventReceiver;
import com.bytedance.ies.effectcreator.swig.EffectType;
import com.bytedance.ies.effectcreator.swig.ProjectState;
import com.bytedance.news.common.service.manager.IService;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.IDqS191S0200000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class CameraPreview extends Fragment implements InterfaceC93966aZO {
    public static final /* synthetic */ int LJLL = 0;
    public View LJLILLLLZI;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public AbstractC93937aYv LJLJLLL;
    public final CameraApi LJLIL = (CameraApi) ((IService) C93971aZT.LIZ().LIZ(CameraApi.class));
    public final ViewModelLazy LJLJI = C93408aQO.LIZ(this, C65352Pkq.LIZ(RecorderViewModel.class), new IDqS423S0100000_42((Fragment) this, 14), null);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 20));
    public final ViewModelLazy LJLJJL = C93408aQO.LIZ(this, C65352Pkq.LIZ(EffectHintViewModel.class), new IDqS423S0100000_42((Fragment) this, 15), null);

    @Override // X.InterfaceC93966aZO
    public final boolean LJIIJ() {
        AbstractC93937aYv abstractC93937aYv;
        CameraRenderLiveData<AbstractC93937aYv> renderModeData;
        Il(false);
        CameraRenderImpl LIZ = C93899aYJ.LIZ();
        if (LIZ != null && (renderModeData = LIZ.getRenderModeData()) != null) {
            abstractC93937aYv = renderModeData.getValue();
        } else {
            abstractC93937aYv = null;
        }
        if (abstractC93937aYv instanceof C94504ai4) {
            C93819aX1.LIZ().previewTemplateEvent().setValue(null);
        }
        if (abstractC93937aYv == null || C93939aYx.LIZIZ(abstractC93937aYv)) {
            return false;
        }
        AbstractC93937aYv abstractC93937aYv2 = this.LJLJLLL;
        if (o.LJ(abstractC93937aYv2, C94339afP.LIZ)) {
            Jl(true);
        } else if (abstractC93937aYv2 instanceof AbstractC94340afQ) {
            Kl(true, true);
        }
        return true;
    }

    public final C93886aY6 xl() {
        return (C93886aY6) this.LJLJJI.getValue();
    }

    public static void Ll() {
        int i;
        Integer num;
        String enumC94029aaP = EnumC94029aaP.QUALITY_PREVIEW_COUNT.toString();
        ISubmissionProccessor LIZ = C94027aaN.LIZ();
        if (LIZ != null && (num = LIZ.getInt(enumC94029aaP)) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        ISubmissionProccessor LIZ2 = C94027aaN.LIZ();
        if (LIZ2 != null) {
            LIZ2.putInt(enumC94029aaP, i + 1);
        }
        String enumC94025aaL = EnumC94025aaL.CAPABILITY_PREVIEW_CNT.toString();
        ICapabilityProccessor LIZ3 = C94026aaM.LIZ();
        if (LIZ3 != null) {
            LIZ3.putIntInAMEExtraCreation(enumC94025aaL, i + 1);
        }
    }

    public CameraPreview() {
        C93745aVp.LIZJ(this, PreviewViewModel.class);
        this.LJLJJLL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 17));
        this.LJLJL = C221108m2.LIZIZ(C94533aiX.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 16));
    }

    public final void Dl() {
        xl().LJFF(true);
        xl().LJ().LIZIZ.setRenderCacheString("appViewMode", "canvas");
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            LJI.LJIIL(ProjectState.ProjectState_Canvas);
        }
        vl(CKEffectEditorContext.LJFF(EffectType.EffectType_ForPreviewAndEdit));
        CKEffectEditorContext.LIZLLL(new C94659akZ(false));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            DataEventReceiver receiver = (DataEventReceiver) this.LJLJLJ.getValue();
            o.LJIIIZ(receiver, "receiver");
            LJI.LIZJ.removeDataEventReceiver(receiver);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C84133X0f c84133X0f;
        super.onPause();
        VERecorder vERecorder = xl().LIZLLL;
        if (vERecorder != null) {
            P4Q.LJII("VERecorder", "onPause...");
            vERecorder.LIZIZ.onPause();
        }
        C93886aY6 xl = xl();
        if (!xl.LJIIJJI && (c84133X0f = xl.LIZJ) != null) {
            C93886aY6.LIZJ(c84133X0f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        P6F p6f;
        super.onResume();
        C93886aY6 xl = xl();
        if (xl.LJIIJJI) {
            String str = xl.LJIIJ;
            if (str != null && str.length() != 0 && (p6f = xl.LJ) != null) {
                p6f.LJIJJLI(xl.LJIIJ);
            }
        } else {
            ICameraBPEA<C84133X0f> LIZ = C93880aY0.LIZ();
            if (LIZ != null) {
                LIZ.openCameraCapture(xl.LIZJ);
            }
            C84133X0f c84133X0f = xl.LIZJ;
            if (c84133X0f != null) {
                c84133X0f.LJJIJIIJIL();
            }
        }
        VERecorder vERecorder = xl().LIZLLL;
        if (vERecorder != null) {
            P4Q.LJII("VERecorder", "onResume...");
            vERecorder.LIZIZ.onResume();
        }
    }

    public final void Gl(boolean z) {
        String str;
        EffectType effectType;
        ProjectState projectState;
        xl().LJFF(false);
        VERecorder LJ = xl().LJ();
        if (z) {
            str = "canvas";
        } else {
            str = "preview";
        }
        LJ.LIZIZ.setRenderCacheString("appViewMode", str);
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            if (z) {
                projectState = ProjectState.ProjectState_Canvas;
            } else {
                projectState = ProjectState.ProjectState_Preview;
            }
            LJI.LJIIL(projectState);
        }
        if (z) {
            effectType = EffectType.EffectType_ForPreviewAndEdit;
        } else {
            effectType = EffectType.EffectType_ForPreviewOnly;
        }
        vl(CKEffectEditorContext.LJFF(effectType));
        CKEffectEditorContext.LIZLLL(new C94659akZ(!z));
        if (!z) {
            boolean z2 = !((ArrayList) ((EffectHintViewModel) this.LJLJJL.getValue()).jv0()).isEmpty();
            IMain LIZ = C93723aVT.LIZ();
            if (LIZ != null) {
                LIZ.updateEffectHintSelectionShow(z2);
            }
            Il(true);
        }
    }

    public final void Il(boolean z) {
        boolean z2;
        if (z) {
            View hintPreviewView = (View) this.LJLJJLL.getValue();
            o.LJIIIIZZ(hintPreviewView, "hintPreviewView");
            hintPreviewView.setVisibility(0);
            EffectHint value = ((EffectHintViewModel) this.LJLJJL.getValue()).LJLJJL.getValue();
            if (value != null) {
                C93882aY2 c93882aY2 = (C93882aY2) this.LJLJL.getValue();
                FrameLayout hintPreviewView2 = (FrameLayout) this.LJLJJLL.getValue();
                o.LJIIIIZZ(hintPreviewView2, "hintPreviewView");
                c93882aY2.getClass();
                c93882aY2.LJ = value;
                c93882aY2.LIZLLL = hintPreviewView2;
                hintPreviewView2.removeAllViews();
                if (c93882aY2.LJ == null) {
                    return;
                }
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(hintPreviewView2.getContext()), R.layout.dwb, hintPreviewView2, false);
                o.LJIIIIZZ(LLLLIILL, "LayoutInflater.from(layo…t_preview, layout, false)");
                c93882aY2.LIZ = LLLLIILL;
                FrameLayout frameLayout = c93882aY2.LIZLLL;
                if (frameLayout != null) {
                    frameLayout.addView(LLLLIILL, 0);
                    View view = c93882aY2.LIZ;
                    if (view != null) {
                        View findViewById = view.findViewById(R.id.dc7);
                        o.LJIIIIZZ(findViewById, "guideLayout.findViewById(R.id.fl_anim_container)");
                        c93882aY2.LIZIZ = findViewById;
                        View view2 = c93882aY2.LIZ;
                        if (view2 != null) {
                            TextView hintTextView = (TextView) view2.findViewById(R.id.kir);
                            View view3 = c93882aY2.LIZ;
                            if (view3 != null) {
                                ImageView hintIconView = (ImageView) view3.findViewById(R.id.kis);
                                EffectHint effectHint = c93882aY2.LJ;
                                if (effectHint != null) {
                                    o.LJIIIIZZ(hintTextView, "hintTextView");
                                    hintTextView.setText(effectHint.hint);
                                    if (effectHint.hintIcon.length() > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        o.LJIIIIZZ(hintIconView, "hintIconView");
                                        hintIconView.setVisibility(0);
                                        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
                                        Context context = hintPreviewView2.getContext();
                                        o.LJIIIIZZ(context, "layout.context");
                                        String str = effectHint.hintIcon;
                                        C94019aaF c94019aaF = new C94019aaF();
                                        c94019aaF.LIZIZ(ImageView.ScaleType.FIT_CENTER);
                                        c94019aaF.LIZ(R.drawable.dfx);
                                        imageLoaderService.loadBitmap(context, str, hintIconView, new C94020aaG(c94019aaF));
                                    } else {
                                        o.LJIIIIZZ(hintIconView, "hintIconView");
                                        hintIconView.setVisibility(8);
                                    }
                                }
                                View view4 = c93882aY2.LIZIZ;
                                if (view4 != null) {
                                    view4.setAlpha(0.3f);
                                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 5500);
                                    o.LJIIIIZZ(ofInt, "ValueAnimator.ofInt(0, 5500)");
                                    c93882aY2.LIZJ = ofInt;
                                    ofInt.setDuration(5500L);
                                    c93882aY2.LIZJ.setInterpolator(new LinearInterpolator());
                                    c93882aY2.LIZJ.addUpdateListener(new IDUListenerS265S0100000_42(c93882aY2, 10));
                                    c93882aY2.LIZJ.start();
                                    return;
                                }
                                o.LJIJI("flAnimContainer");
                                throw null;
                            }
                            o.LJIJI("guideLayout");
                            throw null;
                        }
                        o.LJIJI("guideLayout");
                        throw null;
                    }
                    o.LJIJI("guideLayout");
                    throw null;
                }
                o.LJIJI("hintLayoutContainer");
                throw null;
            }
            return;
        }
        View hintPreviewView3 = (View) this.LJLJJLL.getValue();
        o.LJIIIIZZ(hintPreviewView3, "hintPreviewView");
        hintPreviewView3.setVisibility(8);
        ((C93882aY2) this.LJLJL.getValue()).LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Jl(boolean z) {
        if (z) {
            Al(C94339afP.LIZ, new IDqS423S0100000_42(this, 19));
            return;
        }
        Dl();
        CameraRenderImpl LIZ = C93899aYJ.LIZ();
        if (LIZ != null) {
            LIZ.updateRenderMode(C94339afP.LIZ);
        }
        Long l = (Long) CKEffectEditorContext.LJIIIIZZ.getValue();
        if (l == null) {
            return;
        }
        long longValue = l.longValue();
        IAutoChangeModel LIZ2 = C93722aVS.LIZ();
        if (LIZ2 == null) {
            return;
        }
        LIZ2.autoChangeModelWithReason(longValue, "switch_to_model", null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IObjectSelect LIZIZ = C93819aX1.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.prefetchFeatureList();
        }
    }

    public final void vl(String str) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("thread name = ");
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
        LIZ.append(LLLLIIIILLL.getName());
        LIZ.append(" applyEffect applyEffect =");
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        LIZ.append(str2);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
        if (str == null || str.length() == 0) {
            return;
        }
        VERecorder LJ = xl().LJ();
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        vEEffectFilterParam.effectPath = "";
        LJ.LIZIZ.switchEffect(vEEffectFilterParam);
        VERecorder LJ2 = xl().LJ();
        VEEffectFilterParam vEEffectFilterParam2 = new VEEffectFilterParam();
        vEEffectFilterParam2.effectPath = str;
        LJ2.LIZIZ.switchEffect(vEEffectFilterParam2);
    }

    public final void Al(AbstractC93937aYv abstractC93937aYv, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Window window = requireActivity.getWindow();
        o.LJIIIIZZ(window, "requireActivity().window");
        View decorView = window.getDecorView();
        if (!(decorView instanceof ViewGroup)) {
            decorView = null;
        }
        ViewGroup viewGroup = (ViewGroup) decorView;
        if (viewGroup == null) {
            interfaceC65784Pro.invoke();
            CameraRenderImpl LIZ = C93899aYJ.LIZ();
            if (LIZ != null) {
                LIZ.updateRenderMode(abstractC93937aYv);
                return;
            }
            return;
        }
        C93913aYX c93913aYX = new C93913aYX(viewGroup);
        C94420agi c94420agi = new C94420agi(abstractC93937aYv, interfaceC65784Pro);
        View view = new View(viewGroup.getContext());
        view.setBackgroundColor(-16777216);
        view.setAlpha(0.0f);
        view.setClickable(true);
        view.setId(R.id.nm9);
        viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
        C93912aYW c93912aYW = c93913aYX.LIZ;
        C94700alE c94700alE = new C94700alE(c93913aYX, c94420agi, view);
        c93912aYW.getClass();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 0.99f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(C94010aa6.LIZ());
        ofFloat.addListener(new C94318af4(c94700alE));
        ofFloat.start();
    }

    public final void Hl(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        CameraApi cameraApi = this.LJLIL;
        if (cameraApi != null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            cameraApi.requestCameraPermissionOrShowSetting(requireActivity, new IDqS191S0200000_42(interfaceC65784Pro, interfaceC65784Pro2, 0), new IDqS423S0100000_42(interfaceC65784Pro2, 18));
        }
    }

    public final void Kl(boolean z, boolean z2) {
        if (z2) {
            Al(new C94503ai3(z), new C94534aiY(this, z));
            return;
        }
        Gl(z);
        CameraRenderImpl LIZ = C93899aYJ.LIZ();
        if (LIZ == null) {
            return;
        }
        LIZ.updateRenderMode(new C94503ai3(z));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC65462ha<C93485aRd> canvasGestureOperateData;
        LiveData<EnumC93724aVU> mainOperation;
        C3BJ<C76800UCe> bindTextureNotifier;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLILLLLZI = view;
        TextureView textureView = (TextureView) view.findViewById(R.id.nm2);
        C93886aY6 xl = xl();
        o.LJIIIIZZ(textureView, "textureView");
        xl.LIZIZ(textureView);
        textureView.setOutlineProvider(new C93883aY3(C93742aVm.LIZJ(10.0f)));
        textureView.setClipToOutline(true);
        xl().LJII.observe(getViewLifecycleOwner(), new C94308aeu(this, new IDqS423S0100000_42(this, 133)));
        CameraRenderImpl LIZ = C93899aYJ.LIZ();
        if (LIZ != null && (bindTextureNotifier = LIZ.getBindTextureNotifier()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94887aoF(bindTextureNotifier, viewLifecycleOwner, Lifecycle.State.STARTED, null, this), 3);
        }
        C93797aWf.LIZ().getModelPathLiveData().observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 25));
        IMain LIZ2 = C93723aVT.LIZ();
        if (LIZ2 != null && (mainOperation = LIZ2.getMainOperation()) != null) {
            mainOperation.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 26));
        }
        ICanvas LIZ3 = C93698aV4.LIZ();
        if (LIZ3 != null && (canvasGestureOperateData = LIZ3.getCanvasGestureOperateData()) != null) {
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner2, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C94889aoH(canvasGestureOperateData, viewLifecycleOwner2, Lifecycle.State.STARTED, null, this), 3);
        }
        C93819aX1.LIZ().previewTemplateEvent().observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 27));
        ((EffectHintViewModel) this.LJLJJL.getValue()).LJLJJL.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 28));
    }

    public final void wl(String str, String str2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        BitmapFactory.decodeFile(str, options);
        LiveData<C94342afS> modelPathChangeData = C93939aYx.LIZ().getModelPathChangeData();
        if ((modelPathChangeData instanceof CameraRenderLiveData) && modelPathChangeData != null) {
            modelPathChangeData.setValue(new C94342afS(str, options.outWidth, options.outHeight, str2));
        }
        VERecorder LJ = xl().LJ();
        LJ.LIZIZ.changeRenderSize(new VESize(options.outWidth, options.outHeight));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dum, viewGroup, false);
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
