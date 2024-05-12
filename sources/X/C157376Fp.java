package X;

import Y.AObjectS84S0100000_2;
import Y.ARunnableS6S0101000_2;
import Y.AgS120S0100000_2;
import Y.AgS72S0300000_2;
import Y.IDLListenerS190S0100000_2;
import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157376Fp extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz, InterfaceC1547265k {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final C6G0 LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C82632Wbs LJLL;
    public final C1548866a LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public long LJLLJ;
    public boolean LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    static {
        TBT tbt = new TBT(C157376Fp.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C157376Fp.class, "editQaStickerApi", "getEditQaStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/qa/EditPageQaStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C157376Fp.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C157376Fp.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C157376Fp.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C157376Fp.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp), C61845OOz.LIZJ(C157376Fp.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final C63K LLJILJILJ() {
        return (C63K) this.LJLJJI.LIZ(this, LJLZ[1]);
    }

    public final InterfaceC147865rC LLJJ() {
        return (InterfaceC147865rC) this.LJLJJLL.LIZ(this, LJLZ[3]);
    }

    public final InterfaceC147905rG LLJJI() {
        return (InterfaceC147905rG) this.LJLJJL.LIZ(this, LJLZ[2]);
    }

    public final C157426Fu LLJJIII() {
        return (C157426Fu) this.LJLLILLLL.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LJLJL.LIZ(this, LJLZ[4]);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLL.LIZ(this, LJLZ[6]);
    }

    public final boolean LJIJJLI() {
        return LLJJIII().LJIILLIIL();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        ((InterfaceC152085y0) this.LJLJI.LIZ(this, LJLZ[0])).LIZ((C6V4) this.LJLJLLL.getValue());
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        Handler handler = (Handler) this.LJLLLL.getValue();
        if (handler != null) {
            handler.removeCallbacks((ARunnableS6S0101000_2) this.LJLLLLLL.getValue());
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        Handler handler = (Handler) this.LJLLLL.getValue();
        if (handler != null) {
            handler.postDelayed((ARunnableS6S0101000_2) this.LJLLLLLL.getValue(), 200L);
        }
    }

    @Override // X.WM7
    public final void onStop() {
        long currentTimeMillis = System.currentTimeMillis() - this.LJLLJ;
        C145995oB c145995oB = new C145995oB();
        Object obj = 0;
        if (LLJJIII().LJIILLIIL() || this.LJLLL) {
            LLJJIII().LJJJ();
            HashMap<String, Float> hashMap = LLJJIII().LLIIL;
            Object obj2 = hashMap.get("sticker_size");
            if (obj2 == null) {
                obj2 = obj;
            }
            c145995oB.LIZJ(obj2, "qa_sticker_size");
            Object obj3 = hashMap.get("sticker_X");
            if (obj3 == null) {
                obj3 = obj;
            }
            c145995oB.LIZJ(obj3, "qa_sticker_X");
            Object obj4 = hashMap.get("sticker_Y");
            if (obj4 == null) {
                obj4 = obj;
            }
            c145995oB.LIZJ(obj4, "qa_sticker_Y");
            Float f = hashMap.get("sticker_angle");
            if (f != null) {
                obj = f;
            }
            c145995oB.LIZJ(obj, "qa_sticker_angle");
            c145995oB.LIZ(1, "is_qa_sticker");
            c145995oB.LIZIZ(currentTimeMillis / 1000, "qa_adjust_duration");
        } else {
            c145995oB.LIZ(0, "is_qa_sticker");
            c145995oB.LIZIZ(currentTimeMillis / 1000, "qa_adjust_duration");
        }
        c145995oB.LJFF(new H96().LJFF("is_promote_pa"));
        GXR.LIZ("exit_video_edit_page", c145995oB.LIZ);
        super.onStop();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public final void LLJILJIL(QaStruct qaStruct) {
        Number number;
        o.LJIIIZ(qaStruct, "qaStruct");
        C157426Fu LLJJIII = LLJJIII();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        LLJJIII.getClass();
        C157416Ft c157416Ft = new C157416Ft(requireActivity, null, 6, 0);
        c157416Ft.LJJZZIII(qaStruct);
        c157416Ft.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        T5T t5t = c157416Ft.LJLJI;
        if (t5t != null) {
            t5t.setFocusable(false);
            T5T t5t2 = c157416Ft.LJLJI;
            if (t5t2 != null) {
                t5t2.setFocusableInTouchMode(false);
                LLJJIII.LJJIL(c157416Ft);
                InteractStickerStruct interactStickerStruct = LLJJIII.getInteractStickerStruct();
                NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(interactStickerStruct);
                Number number2 = 0;
                if (LIZIZ != null) {
                    number = Float.valueOf(LIZIZ.getStartTime());
                } else {
                    number = number2;
                }
                int intValue = number.intValue();
                if (LIZIZ != null) {
                    number2 = Float.valueOf(LIZIZ.getEndTime());
                }
                c157416Ft.setQaStickerTimeEditData(new C1558669u(interactStickerStruct, intValue, number2.intValue()));
                return;
            }
            o.LJIJI("questionEditText");
            throw null;
        }
        o.LJIJI("questionEditText");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLJJIII().LJLLILLLL = new C6BO() { // from class: X.6Fo
            @Override // X.C6BO
            public final void LIZ() {
            }

            @Override // X.C6BO
            public final void LIZLLL() {
            }

            @Override // X.C6BO
            public final /* synthetic */ void LJI() {
            }

            @Override // X.C6BO
            public final void LJII() {
            }

            @Override // X.C6BO
            public final void LIZIZ() {
                long j;
                List<StickerItemModel> list;
                Object obj = 0;
                if (C157376Fp.this.LJIJJLI()) {
                    C157376Fp c157376Fp = C157376Fp.this;
                    ((C137965bE) c157376Fp.LJLJLJ.LIZ(c157376Fp, C157376Fp.LJLZ[5])).LIZJ(C157376Fp.this.LLJJIII().LLIIIL);
                    C157376Fp c157376Fp2 = C157376Fp.this;
                    if (H7R.LJJLIIIJJIZ(c157376Fp2.getEditModel()) && c157376Fp2.getEditModel().infoStickerModel != null && (list = c157376Fp2.getEditModel().infoStickerModel.stickers) != null && !list.isEmpty()) {
                        Iterator<StickerItemModel> it = c157376Fp2.getEditModel().infoStickerModel.stickers.iterator();
                        while (it.hasNext()) {
                            if (o.LJ(it.next().stickerId, c157376Fp2.LLJJIII().LLIIIL)) {
                                it.remove();
                            }
                        }
                    }
                }
                C157376Fp.this.getEditModel().hasQaSticker = Boolean.FALSE;
                C157376Fp.this.LLJILJILJ().j00();
                C157376Fp c157376Fp3 = C157376Fp.this;
                if (!c157376Fp3.LJLLL) {
                    String str = c157376Fp3.getEditModel().mShootWay;
                    if (!o.LJ(str, "answer")) {
                        str = "question";
                    }
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("shoot_way", str);
                    c145995oB.LJI("prop_id", C157376Fp.this.LLJJIII().LLIIIL);
                    QaStruct qaStruct = C157376Fp.this.LLJJIII().LLIIIILZ;
                    if (qaStruct != null) {
                        j = qaStruct.getQuestionId();
                    } else {
                        j = 0;
                    }
                    c145995oB.LJI("question_id", String.valueOf(j));
                    HashMap<String, Float> hashMap = C157376Fp.this.LLJJIII().LLIIL;
                    Object obj2 = hashMap.get("sticker_size");
                    if (obj2 == null) {
                        obj2 = obj;
                    }
                    c145995oB.LIZJ(obj2, "sticker_size");
                    Object obj3 = hashMap.get("sticker_X");
                    if (obj3 == null) {
                        obj3 = obj;
                    }
                    c145995oB.LIZJ(obj3, "sticker_X");
                    Object obj4 = hashMap.get("sticker_Y");
                    if (obj4 == null) {
                        obj4 = obj;
                    }
                    c145995oB.LIZJ(obj4, "sticker_Y");
                    Object obj5 = hashMap.get("sticker_angle");
                    if (obj5 != null) {
                        obj = obj5;
                    }
                    c145995oB.LIZJ(obj, "sticker_angle");
                    GXR.LIZ("prop_delete", c145995oB.LIZ);
                }
            }

            @Override // X.C6BO
            public final void LIZJ() {
                C157376Fp.this.getEditPreviewApi().m70(false);
                C157376Fp.this.LLJJIII().LJJIZ();
                C157376Fp.this.LJLLI.LIZJ(17);
            }

            @Override // X.C6BO
            public final void LJIIIZ() {
                LIZJ();
            }

            @Override // X.C6BO
            public final void LJ(boolean z) {
                C157376Fp.this.LLJJI().LIZLLL();
                if (z && !C157376Fp.this.LLJJIII().LJIJJLI()) {
                    C157376Fp.this.getEditPreviewApi().U2(true, true, true);
                } else {
                    C157376Fp.this.getEditPreviewApi().U2(false, true, false);
                    if (!z) {
                        return;
                    }
                }
                if (C157376Fp.this.LJIJJLI()) {
                    C157376Fp.this.LLJJIII().LJJJ();
                    HashMap<String, Float> hashMap = C157376Fp.this.LLJJIII().LLIIL;
                    if (true ^ hashMap.isEmpty()) {
                        C1548866a c1548866a = C157376Fp.this.LJLLI;
                        c1548866a.getClass();
                        C145995oB LIZ = c1548866a.LIZ(17);
                        Object obj = hashMap.get("sticker_size");
                        Object obj2 = 0;
                        if (obj == null) {
                            obj = obj2;
                        }
                        LIZ.LIZJ(obj, "sticker_size");
                        Object obj3 = hashMap.get("sticker_X");
                        if (obj3 == null) {
                            obj3 = obj2;
                        }
                        LIZ.LIZJ(obj3, "sticker_X");
                        Object obj4 = hashMap.get("sticker_Y");
                        if (obj4 == null) {
                            obj4 = obj2;
                        }
                        LIZ.LIZJ(obj4, "sticker_Y");
                        Object obj5 = hashMap.get("sticker_angle");
                        if (obj5 != null) {
                            obj2 = obj5;
                        }
                        LIZ.LIZJ(obj2, "sticker_angle");
                        FMX.LJIIL("prop_adjust", LIZ.LIZ);
                    }
                }
            }

            @Override // X.C6BO
            public final void LJFF(boolean z) {
                if (z) {
                    C157376Fp.this.LLJJ().R10(0);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C6BO
            public final void LJIIIIZZ(View view) {
                InterfaceC1549166d<?> interfaceC1549166d;
                o.LJIIIZ(view, "view");
                C157376Fp.this.LLJILJILJ().LJIILIIL(true);
                if ((view instanceof InterfaceC1549166d) && (interfaceC1549166d = (InterfaceC1549166d) view) != null) {
                    C157376Fp.this.LLJJI().K2(interfaceC1549166d);
                }
                C157376Fp.this.LJLLI.LJFF(17);
            }
        };
        LLJJIII().LLFII = new C6BQ() { // from class: X.6Fq
            @Override // X.C6BQ
            public final void LIZ(C156426By c156426By, C156426By c156426By2) {
                if (C157376Fp.this.LLJJIII().LJIJJLI() && (c156426By2 instanceof C157406Fs)) {
                    InterfaceC147905rG LLJJI = C157376Fp.this.LLJJI();
                    View drawView = c156426By2.getDrawView();
                    o.LJII(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qasticker.view.QaStickerView");
                    LLJJI.I9((C157416Ft) drawView);
                    C157376Fp.this.LLJJI().k();
                }
            }
        };
        LLJJ().Z60().LIZIZ(this, new AObjectS84S0100000_2(this, 204));
        LLJJ().N4().observe(this, new AObjectS84S0100000_2(this, 205));
        LLJILJILJ().LJIIL(LLJJ().N4());
        getEditPreviewApi().Kh().observe(this, new AObjectS84S0100000_2(this, 206));
        IEffectPlatformFactory LIZ = EffectPlatformFactory.LIZ();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(getApplicationContext());
        LIZ.createEffectConfigurationBuilder(effectPlatformBuilder).build();
        LLJJIII().LJLLLL = C5YW.LIZIZ().LJJIJLIJ(getEditModel(), "");
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public C157376Fp(C6G0 c6g0, C82622Wbi diContainer, C157436Fv mobHelper) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(mobHelper, "mobHelper");
        this.LJLIL = c6g0;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = UCI.LJI(diContainer, InterfaceC152085y0.class, null);
        this.LJLJJI = UCI.LJI(diContainer, C63K.class, null);
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC147905rG.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LJLJL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, C137965bE.class, null);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 502));
        this.LJLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLLI = new C1548866a(getEditModel());
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS149S0200000_2(this, mobHelper, 39));
        this.LJLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 504));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 503));
    }

    @Override // X.InterfaceC1547265k
    public final C10K<C76800UCe> LJJIJIL(InterfaceC153045zY editor, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
        String draftDir;
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(compileCallback, "compileCallback");
        if (LJIJJLI()) {
            if (interfaceC88471Ynr == null || (draftDir = interfaceC88471Ynr.invoke("qa_sticker", EnumC43649HBd.QA_STICKER)) == null) {
                draftDir = C5YW.LIZIZ().LJJIJLIJ(getEditModel(), "");
            }
            int LIZLLL = compileCallback.LJLLL().LIZLLL();
            int LJI = compileCallback.LJLLL().LJI();
            int i = editor.LLILZ().width;
            int i2 = editor.LLILZ().height;
            C157426Fu LLJJIII = LLJJIII();
            LLJJIII.getClass();
            o.LJIIIZ(draftDir, "draftDir");
            ArrayList arrayList = new ArrayList();
            C10K LJIILL = LLJJIII.LJI(LIZLLL, LJI, i, i2, draftDir).LJIILL(new AgS120S0100000_2(LLJJIII, 0));
            o.LJIIIIZZ(LJIILL, "fun compileQaSticker(\n  …henAllResult(tasks)\n    }");
            arrayList.add(LJIILL);
            C10K LJIJJLI = C10K.LJIJJLI(arrayList);
            o.LJIIIIZZ(LJIJJLI, "whenAllResult(tasks)");
            C10K<C76800UCe> LJIILLIIL = LJIJJLI.LJIILLIIL(new AgS72S0300000_2(editor, this, compileCallback, 5), C10K.LJIIIIZZ);
            o.LJIIIIZZ(LJIILLIIL, "override fun getInteract…ult(Unit)\n        }\n    }");
            return LJIILLIIL;
        }
        C10K<C76800UCe> LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
        o.LJIIIIZZ(LJIIIZ, "{\n            Task.forResult(Unit)\n        }");
        return LJIIIZ;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        FrameLayout frameLayout = (FrameLayout) container;
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null) {
            VESize size = value.LLILZ();
            o.LJIIIZ(size, "size");
            LLJJIII().LJLLLLLL = size;
            LLJJIII().LJIJJ(this.mActivity, frameLayout);
            ((InterfaceC152085y0) this.LJLJI.LIZ(this, LJLZ[0])).LIZIZ((C6V4) this.LJLJLLL.getValue());
        }
        C157426Fu LLJJIII = LLJJIII();
        Activity activity = this.mActivity;
        o.LJI(activity);
        C6G0 qaStickerEditLayout = this.LJLIL;
        AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 505);
        LLJJIII.getClass();
        o.LJIIIZ(qaStickerEditLayout, "qaStickerEditLayout");
        LLJJIII.LLIIIJ = qaStickerEditLayout;
        LLJJIII.LLIIJI = aqS152S0100000_2;
        View findViewById = activity.findViewById(R.id.content);
        o.LJIIIIZZ(findViewById, "activity.findViewById(android.R.id.content)");
        FrameLayout frameLayout2 = (FrameLayout) findViewById;
        qaStickerEditLayout.LJLJJL = frameLayout2;
        frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(qaStickerEditLayout.LJLJJLL, 2));
        qaStickerEditLayout.setOnCompleteListener(new AqS168S0100000_2(LLJJIII, 0));
        LLJJIII().LJJIJIIJI(getEditPreviewApi().Kh().getValue(), getEditPreviewApi());
        LLJJIII().getClass();
        this.LJLLJ = System.currentTimeMillis();
        return new View(requireSceneContext());
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
