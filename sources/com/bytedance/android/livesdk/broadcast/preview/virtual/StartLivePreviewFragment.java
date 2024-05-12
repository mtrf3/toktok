package com.bytedance.android.livesdk.broadcast.preview.virtual;

import X.AbstractC30473Bxd;
import X.AbstractC30707C3j;
import X.ActivityC45651qj;
import X.BM1;
import X.BUT;
import X.C10A;
import X.C14080gu;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C1B3;
import X.C1EW;
import X.C1MZ;
import X.C1QB;
import X.C28467BFf;
import X.C29052Bai;
import X.C29053Baj;
import X.C29165BcX;
import X.C29180Bcm;
import X.C29S;
import X.C30355Bvj;
import X.C30514ByI;
import X.C30703C3f;
import X.C30704C3g;
import X.C30708C3k;
import X.C30709C3l;
import X.C30730C4g;
import X.C30868C9o;
import X.C30875C9v;
import X.C30901Je;
import X.C30911Jf;
import X.C32537Cpp;
import X.C38354F3m;
import X.C3C5;
import X.C48690J9a;
import X.C51029K0z;
import X.C5ML;
import X.C63078OpG;
import X.C65814PsI;
import X.C76800UCe;
import X.C78857UxB;
import X.C7N;
import X.C90903hW;
import X.CKO;
import X.EnumC31814CeA;
import X.InterfaceC21020s6;
import X.InterfaceC29176Bci;
import X.InterfaceC30046Bqk;
import X.InterfaceC30359Bvn;
import X.InterfaceC30442Bx8;
import X.InterfaceC31971Nh;
import X.InterfaceC92693kP;
import Y.AfS36S0101000_5;
import Y.IDAListenerS232S0100000_5;
import Y.IDTListenerS115S0100000_5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.broadcast.preview.virtual.LiveSettingApi;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class StartLivePreviewFragment extends BaseFragment implements InterfaceC29176Bci {
    public static int PREVIEW_HEIGHT = 1280;
    public static int PREVIEW_WIDTH = 720;
    public IFilterManager filterManager;
    public AnimationSet l2RAnimationSet;
    public AbstractC30473Bxd mCameraCapture;
    public View mFilterLayout;
    public TextView mFilterText;
    public C30875C9v mGestureDetectLayout;
    public GestureDetector mGestureDetector;
    public boolean mInitializedEffect;
    public AbstractC30707C3j mLiveBeautyHelper;
    public C1MZ mLiveFilterHelper;
    public InterfaceC21020s6 mLiveStream;
    public View mLoadingView;
    public int mScreenWidth;
    public boolean mShowStartLiveFragment;
    public InterfaceC30046Bqk mStartLiveFragment;
    public InterfaceC92693kP mSubscribe;
    public SurfaceView mSurfaceView;
    public AnimationSet r2LAnimationSet;
    public int mCameraType = 1;
    public InterfaceC30359Bvn listener = new C30703C3f(this);
    public View.OnTouchListener mGestureTouchListener = new IDTListenerS115S0100000_5(this, 4);

    public static /* synthetic */ void vl(StartLivePreviewFragment startLivePreviewFragment, C28467BFf c28467BFf) {
        startLivePreviewFragment.lambda$initView$0(c28467BFf);
    }

    public static /* synthetic */ void wl(StartLivePreviewFragment startLivePreviewFragment, Throwable th) {
        startLivePreviewFragment.lambda$initView$1(th);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public /* bridge */ /* synthetic */ int getThemeOverlay(Context context) {
        return C48690J9a.LIZIZ(context);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public /* bridge */ /* synthetic */ boolean isLight(Context context) {
        return C48690J9a.LIZJ(this, context);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    private void initCameraCapture() {
        int i;
        String modelFilePath;
        if (InterfaceC30442Bx8.LJIIIZ.LIZIZ().intValue() == 0) {
            i = 2;
        } else {
            i = 1;
        }
        this.mCameraType = i;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            Intent intent = mo49getActivity.getIntent();
            if (intent != null && C38354F3m.LIZJ(C16880lQ.LLJJIJIIJIL(intent, "orientation"), "landscape")) {
                PREVIEW_WIDTH = 1280;
                PREVIEW_HEIGHT = 720;
            } else {
                PREVIEW_WIDTH = 720;
                PREVIEW_HEIGHT = 1280;
            }
        }
        C14080gu c14080gu = new C14080gu(getContext());
        c14080gu.LJJ = C7N.LJIJ().v70();
        c14080gu.LJJIJ = new C30730C4g();
        c14080gu.LJIJJLI = new C63078OpG();
        c14080gu.LJJIJIIJI = new C5ML();
        c14080gu.LJIJ = i;
        TestEnableEffectSetting testEnableEffectSetting = TestEnableEffectSetting.INSTANCE;
        Object obj = null;
        if (testEnableEffectSetting.disable()) {
            modelFilePath = null;
        } else {
            modelFilePath = EnumC31814CeA.INST.getModelFilePath();
        }
        c14080gu.LJJIJIL = modelFilePath;
        if (!testEnableEffectSetting.disable()) {
            obj = EnumC31814CeA.INST.getResourceFinder(getContext());
        }
        c14080gu.LJJIJL = obj;
        int i2 = PREVIEW_WIDTH;
        int i3 = PREVIEW_HEIGHT;
        c14080gu.LJJIL = i2;
        c14080gu.LJJIZ = i3;
        c14080gu.LJIJI = 5;
        CKO cko = new CKO(c14080gu.LIZ());
        this.mLiveStream = cko;
        this.filterManager = cko.getVideoFilterMgr();
        C30514ByI c30514ByI = new C30514ByI(this.mSurfaceView, this.mLiveStream, true, true);
        this.mCameraCapture = c30514ByI;
        c30514ByI.LJIIL(new C30708C3k(this));
    }

    private void initGestureDetector() {
        this.mGestureDetector = new GestureDetector(mo49getActivity(), new C30709C3l(this));
        this.mGestureDetectLayout.LJJJLL(this.mGestureTouchListener);
    }

    public static StartLivePreviewFragment newInstance() {
        return new StartLivePreviewFragment();
    }

    public void initEffect() {
        if (this.mInitializedEffect) {
            return;
        }
        this.mInitializedEffect = true;
        C1QB c1qb = new C1QB();
        this.mCameraCapture.LIZIZ(c1qb);
        C1MZ LJII = C30355Bvj.LJII();
        this.mLiveFilterHelper = LJII;
        C51029K0z.LJIILIIL(this);
        LJII.LJFF(c1qb);
        InterfaceC31971Nh composerManager = C7N.LJII().composerManager();
        o.LJIIIIZZ(composerManager, "effectService.composerManager()");
        this.mLiveBeautyHelper = new C30704C3g(composerManager);
        this.filterManager.composerSetMode(1, 0);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        AbstractC30473Bxd abstractC30473Bxd = this.mCameraCapture;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJ(C78857UxB.LJJIIJ(1476788483, "bpea-432"));
            this.mCameraCapture = null;
        }
        InterfaceC92693kP interfaceC92693kP = this.mSubscribe;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            this.mSubscribe.dispose();
        }
        InterfaceC21020s6 interfaceC21020s6 = this.mLiveStream;
        if (interfaceC21020s6 != null) {
            interfaceC21020s6.LJIJJLI(C78857UxB.LJJIIJ(1476788483, "bpea-489"));
            this.mLiveStream = null;
        }
        ((CopyOnWriteArrayList) ((C29165BcX) C7N.LJ().startLiveManager()).LJLIL).remove(this);
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        InterfaceC30046Bqk interfaceC30046Bqk = this.mStartLiveFragment;
        if (interfaceC30046Bqk != null) {
            ((LiveBroadcastPreviewFragment) interfaceC30046Bqk).Jl();
        }
        AbstractC30473Bxd abstractC30473Bxd = this.mCameraCapture;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJFF();
        }
        InterfaceC21020s6 interfaceC21020s6 = this.mLiveStream;
        if (interfaceC21020s6 != null) {
            interfaceC21020s6.LIZJ(C78857UxB.LJJIIJ(1476788483, "bpea-389"));
        }
        super.onPause();
    }

    @Override // X.InterfaceC29176Bci
    public void onStartLive() {
        AbstractC30473Bxd abstractC30473Bxd = this.mCameraCapture;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJFF();
            this.mCameraCapture.LJ(C78857UxB.LJJIIJ(1476788483, "bpea-431"));
            this.mCameraCapture = null;
        }
        C1MZ c1mz = this.mLiveFilterHelper;
        if (c1mz != null) {
            c1mz.release();
        }
        InterfaceC21020s6 interfaceC21020s6 = this.mLiveStream;
        if (interfaceC21020s6 != null) {
            interfaceC21020s6.LIZJ(C78857UxB.LJJIIJ(1476788483, "bpea-390"));
            this.mLiveStream.LJIJJLI(C78857UxB.LJJIIJ(1476788483, "bpea-490"));
            this.mLiveStream = null;
        }
        mo49getActivity().finish();
    }

    private void initLiveFragment() {
        InterfaceC30046Bqk createStartLiveFragment = C7N.LJ().createStartLiveFragment(null);
        this.mStartLiveFragment = createStartLiveFragment;
        ((LiveBroadcastPreviewFragment) createStartLiveFragment).Ol(this.listener);
        FragmentManager supportFragmentManager = mo49getActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        Fragment fragment = (Fragment) this.mStartLiveFragment;
        fragment.getClass();
        c1b3.LJIIJ(fragment, null, R.id.btg);
        c1b3.LJII();
        C29165BcX c29165BcX = (C29165BcX) C7N.LJ().startLiveManager();
        if (!((CopyOnWriteArrayList) c29165BcX.LJLIL).contains(this)) {
            ((CopyOnWriteArrayList) c29165BcX.LJLIL).add(this);
        }
        if (this.mShowStartLiveFragment) {
            ((LiveBroadcastPreviewFragment) this.mStartLiveFragment).Kl();
        }
    }

    private void initView() {
        this.mScreenWidth = C15380j0.LJIIL();
        this.mFilterLayout = getView().findViewById(R.id.d_b);
        this.mGestureDetectLayout = (C30875C9v) getView().findViewById(R.id.hif);
        this.mSurfaceView = (SurfaceView) getView().findViewById(R.id.kuq);
        this.mFilterText = (TextView) getView().findViewById(R.id.d_d);
        View findViewById = getView().findViewById(R.id.g7r);
        this.mLoadingView = findViewById;
        findViewById.setVisibility(0);
        C65814PsI.LIZ().getClass();
        C1EW.LIZ(((LiveSettingApi.WebcastAPI) C65814PsI.LIZJ(LiveSettingApi.WebcastAPI.class)).getLivePodCast()).LJJJLIIL(new AfS36S0101000_5(0, this, 36), new AfS36S0101000_5(0, this, 37));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC30473Bxd abstractC30473Bxd = this.mCameraCapture;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJI();
        }
        InterfaceC21020s6 interfaceC21020s6 = this.mLiveStream;
        if (interfaceC21020s6 != null) {
            interfaceC21020s6.LJIIJJI(C78857UxB.LJJIIJ(1476788233, "bpea-368"));
        }
        InterfaceC30046Bqk interfaceC30046Bqk = this.mStartLiveFragment;
        if (interfaceC30046Bqk == null) {
            this.mShowStartLiveFragment = true;
        } else {
            ((LiveBroadcastPreviewFragment) interfaceC30046Bqk).Kl();
        }
    }

    private AnimationSet generateAnimationSet(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int width = (this.mScreenWidth - this.mFilterText.getWidth()) / 2;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new C30911Jf());
        alphaAnimation.setDuration(300L);
        if (z) {
            f = -width;
        } else {
            f = width;
        }
        float f6 = -50.0f;
        if (z) {
            f2 = -50.0f;
        } else {
            f2 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new C30911Jf());
        translateAnimation.setDuration(300L);
        if (z) {
            f3 = -50.0f;
            f4 = 50.0f;
        } else {
            f3 = 50.0f;
            f4 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f3, f4, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300L);
        translateAnimation2.setDuration(200L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500L);
        alphaAnimation2.setInterpolator(new C30901Je());
        alphaAnimation2.setDuration(300L);
        if (z) {
            f6 = 50.0f;
            f5 = width;
        } else {
            f5 = -width;
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, f5, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500L);
        translateAnimation3.setInterpolator(new C30901Je());
        translateAnimation3.setDuration(300L);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new IDAListenerS232S0100000_5(this, 5));
        return animationSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.BUT, O] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Bcm, O] */
    public void lambda$initView$0(C28467BFf c28467BFf) {
        LiveSettingApi.LiveSettingResponse liveSettingResponse = (LiveSettingApi.LiveSettingResponse) c28467BFf.data;
        LiveScenario liveScenario = liveSettingResponse.liveScenario;
        if (liveScenario != null) {
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29053Baj.class)).LIZ = new C29180Bcm(liveScenario.enableLiveVideo, liveScenario.enableLiveScreenshot, liveScenario.enableLiveThirdParty, liveScenario.enableLiveStudio, liveSettingResponse.canShowLiveStudio, liveScenario.enableLiveVoice);
        }
        LivePermissionApply livePermissionApply = ((LiveSettingApi.LiveSettingResponse) c28467BFf.data).livePermissionApply;
        if (livePermissionApply != null) {
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29052Bai.class)).LIZ = new BUT(livePermissionApply.enableLiveVideo, livePermissionApply.enableLiveScreenshot, livePermissionApply.enableLiveThirdParty);
        }
        initLiveFragment();
        this.mLoadingView.setVisibility(8);
    }

    public /* synthetic */ void lambda$initView$1(Throwable th) {
        C30868C9o.LJI("fetch live permission fail, please retry");
        this.mLoadingView.setVisibility(8);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BM1.LJIILIIL = true;
    }

    public void showFilterName(boolean z) {
        String str;
        C1MZ c1mz = this.mLiveFilterHelper;
        if (c1mz != null) {
            str = c1mz.LIZJ();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mFilterText.setText(str);
        if (z) {
            if (this.l2RAnimationSet == null) {
                this.l2RAnimationSet = generateAnimationSet(true);
            } else {
                this.mFilterLayout.clearAnimation();
            }
            this.mFilterLayout.startAnimation(this.l2RAnimationSet);
            return;
        }
        if (this.r2LAnimationSet == null) {
            this.r2LAnimationSet = generateAnimationSet(false);
        } else {
            this.mFilterLayout.clearAnimation();
        }
        this.mFilterLayout.startAnimation(this.r2LAnimationSet);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null && C38354F3m.LIZJ(C16880lQ.LLJJIJIIJIL(intent, "orientation"), "landscape")) {
            mo49getActivity.setRequestedOrientation(0);
        }
        initView();
        initCameraCapture();
        initGestureDetector();
    }

    public View com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment__onCreateView$___twin___(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C16880lQ.LLLLIILL(layoutInflater, R.layout.cu9, viewGroup, false);
    }

    public static View com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(StartLivePreviewFragment startLivePreviewFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment__onCreateView$___twin___ = startLivePreviewFragment.com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment__onCreateView$___twin___ instanceof View)) {
            com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment__onCreateView$___twin___ = null;
        }
        if (com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment__onCreateView$___twin___, startLivePreviewFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment__onCreateView$___twin___, startLivePreviewFragment);
                C10A.LIZIZ(com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment__onCreateView$___twin___, startLivePreviewFragment);
                ActivityC45651qj mo49getActivity = startLivePreviewFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_bytedance_android_livesdk_broadcast_preview_virtual_StartLivePreviewFragment__onCreateView$___twin___;
    }
}
