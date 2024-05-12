package X;

import Y.ACallableS2S1112000_2;
import Y.AObserverS70S0100000_2;
import Y.AgS0S1112000_2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5pZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146855pZ extends C6F2 implements InterfaceC143795kd, InterfaceC145445nI, InterfaceC137115Zr, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public final C82622Wbi LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public InterfaceC147145q2 LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public InterfaceC146725pM LJLJL;
    public InterfaceC146715pL LJLJLJ;
    public InterfaceC146775pR LJLJLLL;
    public InterfaceC146785pS LJLL;
    public final C82632Wbs LJLLI;
    public InterfaceC146235oZ LJLLILLLL;
    public InterfaceC146805pU LJLLJ;
    public final C82632Wbs LJLLL;
    public final C82632Wbs LJLLLL;
    public InterfaceC140305f0 LJLLLLLL;
    public InterfaceC146795pT LJLZ;
    public InterfaceC146745pO LJZ;
    public InterfaceC145415nF LJZI;
    public InterfaceC146755pP LJZL;
    public C6VC LL;
    public C137965bE LLD;
    public final C82632Wbs LLF;
    public ProgressDialogC164766dM LLFF;
    public boolean LLFFF;
    public final C146915pf LLFII;

    static {
        TBT tbt = new TBT(C146855pZ.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C146855pZ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C146855pZ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C146855pZ.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp), C61845OOz.LIZJ(C146855pZ.class, "sizeProvider", "getSizeProvider()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC145445nI
    public final void LJJJZ() {
    }

    @Override // X.C6F2
    public final void LLJJL(Effect effect, CustomStickerInfo info) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(info, "info");
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

    @Override // X.InterfaceC137115Zr
    public final InterfaceC147355qN LJLLL() {
        return (InterfaceC147355qN) this.LLF.LIZ(this, LLFZ[4]);
    }

    @Override // X.C6F2
    public final boolean LLJLL() {
        if (findSceneByTag("FTCEditStickerScene") != null) {
            return true;
        }
        return false;
    }

    public final InterfaceC142545ic LLJZIJLIL() {
        return (InterfaceC142545ic) this.LJLLL.LIZ(this, LLFZ[2]);
    }

    public final VideoPublishEditModel LLLF() {
        return (VideoPublishEditModel) this.LJLLI.LIZ(this, LLFZ[1]);
    }

    @Override // X.C6F2
    /* renamed from: LLLFF, reason: merged with bridge method [inline-methods] */
    public final C146945pi LLJJIII() {
        return (C146945pi) this.LJLJJLL.getValue();
    }

    public final void LLLFZ() {
        if (this.LLFF == null) {
            ProgressDialogC164766dM LIZLLL = ProgressDialogC164766dM.LIZLLL(this.mActivity, getResources().getString(R.string.pc7));
            if (LIZLLL != null) {
                LIZLLL.setIndeterminate(true);
            } else {
                LIZLLL = null;
            }
            this.LLFF = LIZLLL;
        }
    }

    @Override // X.InterfaceC145445nI
    public final void LJLJLJ() {
        LLJJIII().getClass();
        InterfaceC146725pM interfaceC146725pM = this.LJLJL;
        if (interfaceC146725pM != null) {
            interfaceC146725pM.r3();
            LLJZIJLIL().DM().setValue(C5MM.LIZJ());
            LLJJ().r3();
            return;
        }
        o.LJIJI("editToolbarApi");
        throw null;
    }

    @Override // X.C6F2
    public final C82622Wbi LLJJI() {
        AlsLogicContainer LJJJIL = C44384HbQ.LJJJIL(this);
        if (LJJJIL != null) {
            return LJJJIL.LJLLL;
        }
        return null;
    }

    public final InterfaceC153045zY LLL() {
        return LLJZIJLIL().Kh().getValue();
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        HTP.LJLJL.LIZ();
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        H78.LIZ("VEVideoPublishEditActivity onResume EditRootScene");
        this.LLFFF = false;
        HTP.LJLJL.LIZJ(this.mActivity, (ViewGroup) this.mView);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public C146855pZ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLILLLLZI = diContainer;
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 847));
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC142515iZ.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 848));
        this.LJLLI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLL = UCI.LJI(diContainer, InterfaceC142545ic.class, null);
        this.LJLLLL = UCI.LJI(diContainer, AbstractC42651GoZ.class, null);
        this.LLF = UCI.LJI(diContainer, InterfaceC147355qN.class, null);
        this.LLFII = C146915pf.LIZ;
        C6YM.LIZ();
        C69B.LIZ();
        if (!C42000Ge4.LJIILIIL(LLLF())) {
            C69B.LJ(new C44384HbQ());
        }
    }

    @Override // X.InterfaceC137115Zr
    public final void LJII(StickerItemModel stickerItemModel) {
        int i;
        if (C39579Fg7.LIZIZ(stickerItemModel.path)) {
            if (!LLLF().hasInfoStickers()) {
                LLLF().infoStickerModel = new InfoStickerModel(C5YW.LIZIZ().LJJLIIIJJI(LLLF()));
            }
            int i2 = 1;
            if (LLLF().infoStickerModel.stickers.size() > 0) {
                for (StickerItemModel item : LLLF().infoStickerModel.stickers) {
                    o.LJIIIIZZ(item, "item");
                    if (C1535160t.LIZIZ(item) && (i = item.layerWeight) > i2) {
                        i2 = i;
                    }
                }
            }
            stickerItemModel.layerWeight += i2;
            LLLF().infoStickerModel.stickers.add(stickerItemModel);
        }
    }

    @Override // X.C6F2
    public final void LLJLILLLLZIIL(C137965bE stickerChallengeManager) {
        o.LJIIIZ(stickerChallengeManager, "stickerChallengeManager");
        this.LLD = stickerChallengeManager;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C6VC c6vc = this.LL;
        if (c6vc != null) {
            C146865pa c146865pa = new C146865pa(c6vc, new AqS152S0100000_2(this, 849), LLLF(), new AqS152S0100000_2(this, 850));
            C78688UuS.LJIIIZ(this, false, new AqS133S0200000_2(c146865pa, this, 87));
            C44384HbQ.LJIIIZ(this, new AqS133S0200000_2(c146865pa, this, 88));
            C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI != null) {
                this.LJLJJI = (InterfaceC147145q2) LJJLIIIJJI.LJ(InterfaceC147145q2.class, null);
                this.LJLJL = (InterfaceC146725pM) LJJLIIIJJI.LJ(InterfaceC146725pM.class, null);
                this.LJLJLJ = (InterfaceC146715pL) LJJLIIIJJI.LJIIIIZZ(null, InterfaceC146715pL.class);
                this.LJLJLLL = (InterfaceC146775pR) LJJLIIIJJI.LJIIIIZZ(null, InterfaceC146775pR.class);
                this.LJLL = (InterfaceC146785pS) LJJLIIIJJI.LJ(InterfaceC146785pS.class, null);
                this.LJLLILLLL = (InterfaceC146235oZ) LJJLIIIJJI.LJ(InterfaceC146235oZ.class, null);
                this.LJLLJ = (InterfaceC146805pU) LJJLIIIJJI.LJ(InterfaceC146805pU.class, null);
                this.LJLLLLLL = (InterfaceC140305f0) LJJLIIIJJI.LJ(InterfaceC140305f0.class, null);
                this.LJLZ = (InterfaceC146795pT) LJJLIIIJJI.LJ(InterfaceC146795pT.class, null);
                this.LJZ = (InterfaceC146745pO) LJJLIIIJJI.LJ(InterfaceC146745pO.class, null);
                this.LJZI = (InterfaceC145415nF) LJJLIIIJJI.LJ(InterfaceC145415nF.class, null);
                this.LJZL = (InterfaceC146755pP) LJJLIIIJJI.LJIIIIZZ(null, InterfaceC146755pP.class);
                Activity activity = this.mActivity;
                o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                C82622Wbi LJJLIIIJJI2 = C44384HbQ.LJJLIIIJJI(this);
                o.LJI(LJJLIIIJJI2);
                this.LJLIL = new C145335n7((ActivityC45651qj) activity, this, LJJLIIIJJI2);
                InterfaceC146805pU interfaceC146805pU = this.LJLLJ;
                if (interfaceC146805pU != null) {
                    interfaceC146805pU.show();
                    InterfaceC146745pO interfaceC146745pO = this.LJZ;
                    if (interfaceC146745pO != null) {
                        interfaceC146745pO.JV();
                        LLJZIJLIL().wf0().observe(this, new AObserverS70S0100000_2(this, 270));
                        return;
                    } else {
                        o.LJIJI("editCornerApi");
                        throw null;
                    }
                }
                o.LJIJI("editStickerApi");
                throw null;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        o.LJIJI("gestureService");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C6VC c6vc = this.LL;
        if (c6vc != null) {
            c6vc.LIZIZ(new C6V4(0, new WXC() { // from class: X.5pb
                @Override // X.C6P6, X.C6V2
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    InterfaceC146845pY interfaceC146845pY = C146855pZ.this.LLJJIII().LJLLL;
                    if (interfaceC146845pY != null) {
                        return interfaceC146845pY.LIZLLL();
                    }
                    return false;
                }
            }));
        } else {
            o.LJIJI("gestureService");
            throw null;
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.C6F2
    public final void LLJJIJIIJIL(Runnable successCallback, boolean z, boolean z2) {
        o.LJIIIZ(successCallback, "successCallback");
        LLJJIJIL(successCallback, null, z, z2, false);
    }

    public final void LLLFFI(Intent intent, boolean z, boolean z2) {
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C41384GMa.LJII(new GL2(requireActivity, intent, z, z2));
    }

    @Override // X.C6F2, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cd6, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.cor);
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "container.context");
        this.LL = C78897Uxp.LJIILIIL(context, viewGroup3);
        C5L7.LIZIZ();
        return viewGroup2;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public final void LLJLLL(final boolean z, final boolean z2, final Runnable successCallback, final Runnable runnable) {
        InterfaceC147435qV interfaceC147435qV;
        TextFontStyleData LJIIIIZZ;
        String effectId;
        o.LJIIIZ(successCallback, "successCallback");
        H78.LIZ("VEVideoPublishEditActivity compileStickers");
        InterfaceC146845pY interfaceC146845pY = LLJJIII().LJLLL;
        if (interfaceC146845pY != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            List<C67P> LJZL = interfaceC146845pY.LJZL();
            int size = LJZL.size();
            for (int i = 0; i < size; i++) {
                TextStickerData data = ((C67P) ListProtector.get(LJZL, i)).getData();
                if (data != null && (LJIIIIZZ = C68M.LJIIJ().LJIIIIZZ(data.getFontType())) != null) {
                    String str = LJIIIIZZ.title;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    Effect effect = LJIIIIZZ.LIZJ;
                    if (effect == null) {
                        effectId = "";
                    } else {
                        effectId = effect.getEffectId();
                    }
                    sb2.append(effectId);
                    if (i != LJZL.size() - 1) {
                        sb.append(",");
                        sb2.append(",");
                    }
                }
            }
            LLLF().textTypes = sb.toString();
            LLLF().textEffectIds = sb2.toString();
        } else {
            LLLF().textTypes = "";
            LLLF().textEffectIds = "";
        }
        InterfaceC153045zY LLL = LLL();
        if (LLL != null) {
            C82632Wbs c82632Wbs = this.LLF;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLFZ;
            InterfaceC147355qN sizeProvider = (InterfaceC147355qN) c82632Wbs.LIZ(this, interfaceC74236TBoArr[4]);
            InterfaceC147435qV[] interfaceC147435qVArr = new InterfaceC147435qV[2];
            interfaceC147435qVArr[0] = LLJJIII().LLJILJIL().LIZ();
            if (interfaceC146845pY != null) {
                interfaceC147435qV = interfaceC146845pY.LIZ();
            } else {
                interfaceC147435qV = null;
            }
            interfaceC147435qVArr[1] = interfaceC147435qV;
            o.LJIIIZ(sizeProvider, "sizeProvider");
            ((InterfaceC147355qN) this.LLF.LIZ(this, interfaceC74236TBoArr[4])).LIZJ(C147315qJ.LIZ(LLL, sizeProvider, ORY.LJJZZIII(interfaceC147435qVArr)), false);
            long currentTimeMillis = System.currentTimeMillis();
            C146945pi LLJJIII = LLJJIII();
            InterfaceC153045zY LLL2 = LLL();
            o.LJI(LLL2);
            C10K<Void> LJIJJ = C10K.LJIJJ(C47261Igj.LJJIJ(LLJJIII.LLJJI(LLL2, this, null)));
            if (!LJIJJ.LJIILIIL()) {
                LLLFZ();
                C10K<Void> LJII = C10K.LJII(Math.max(0L, LiveMaxRetainAlogMessageSizeSetting.DEFAULT - (System.currentTimeMillis() - currentTimeMillis)));
                o.LJIIIIZZ(LJII, "delay(max(0, 500 - (Syst…meMillis() - startTime)))");
                LJIJJ = C10K.LJIJJ(C47261Igj.LJJIJIIJI(LJIJJ, LJII));
            }
            LJIJJ.LJ(new C10I() { // from class: X.5qI
                public final /* synthetic */ boolean LIZJ = false;

                @Override // X.C10I
                public final Object then(C10K c10k) {
                    final boolean z3;
                    AVChallenge aVChallenge;
                    String str2;
                    VideoEditContainerScene videoEditContainerScene;
                    C146855pZ c146855pZ = C146855pZ.this;
                    ProgressDialogC164766dM progressDialogC164766dM = c146855pZ.LLFF;
                    if (progressDialogC164766dM != null) {
                        progressDialogC164766dM.dismiss();
                    }
                    AVChallenge aVChallenge2 = null;
                    c146855pZ.LLFF = null;
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    } else if (this.LIZJ) {
                        VideoPublishEditModel LLLF = C146855pZ.this.LLLF();
                        new C43542H7a("VEVideoPublishEditActivity");
                        AwemeDraft LIZLLL = C43542H7a.LIZLLL(LLLF);
                        LIZLLL.lastEditTime = System.currentTimeMillis();
                        C60903NvH.LJIIJJI().LJJJI().LJFF().LIZ(new NDG(LIZLLL, new GLI("VEVideoPublishEditActivity", 3)));
                        WM7 wm7 = C146855pZ.this.mParentScene;
                        if ((wm7 instanceof VideoEditContainerScene) && (videoEditContainerScene = (VideoEditContainerScene) wm7) != null) {
                            videoEditContainerScene.LLLII();
                        }
                    } else {
                        final C146855pZ c146855pZ2 = C146855pZ.this;
                        boolean z4 = z;
                        final boolean z5 = z2;
                        Runnable runnable3 = successCallback;
                        if (c146855pZ2.LLFFF) {
                            C5L7.LIZIZ();
                            H78.LIZJ("DoubleGoPublishActivity VEVideoPublishEditActivity");
                            C78983UzD.LJIILL("DoubleGoPublishActivity VEVideoPublishEditActivity");
                            H78.LIZJ("BlockErrorGoPublish");
                        } else {
                            c146855pZ2.LLFFF = true;
                            final Intent intent = new Intent();
                            Bundle bundle = ((WM7) c146855pZ2.LJLLLL.LIZ(c146855pZ2, C146855pZ.LLFZ[3])).mArguments;
                            if (bundle != null) {
                                intent.putExtras(bundle);
                            }
                            c146855pZ2.LLLF().setMultiEditStickIds();
                            c146855pZ2.LLLF().setMultiEditBeautyMetadatas();
                            c146855pZ2.LLLF().setMultiEditCameraLensInfo();
                            ArrayList arrayList = new ArrayList();
                            if (c146855pZ2.LLLF().challenges == null) {
                                C137965bE c137965bE = c146855pZ2.LLD;
                                if (c137965bE != null) {
                                    if (!c137965bE.LIZIZ().getRecordStickerChallengeList().isEmpty()) {
                                        C137965bE c137965bE2 = c146855pZ2.LLD;
                                        if (c137965bE2 != null) {
                                            arrayList.addAll(c137965bE2.LIZIZ().getRecordStickerChallengeList());
                                        } else {
                                            o.LJIJI("stickerChallengeManager");
                                            throw null;
                                        }
                                    }
                                } else {
                                    o.LJIJI("stickerChallengeManager");
                                    throw null;
                                }
                            }
                            AudioEffectParam audioEffectParam = c146855pZ2.LLLF().veAudioEffectParam;
                            if (audioEffectParam != null && (aVChallenge2 = audioEffectParam.getChallenge()) != null) {
                                if (C44384HbQ.LJIILIIL(c146855pZ2.LLLF()) && c146855pZ2.LLLF().hasNotAudioRecord()) {
                                    C149905uU.LIZLLL(c146855pZ2.LLLF());
                                } else {
                                    arrayList.add(aVChallenge2);
                                }
                            }
                            if (c146855pZ2.LLLF().challenges != null) {
                                arrayList.addAll(c146855pZ2.LLLF().challenges);
                                C137965bE c137965bE3 = c146855pZ2.LLD;
                                if (c137965bE3 != null) {
                                    List<AVChallenge> list = c146855pZ2.LLLF().challenges;
                                    ArrayList LIZIZ = s1.LIZIZ(list, "model.challenges");
                                    for (AVChallenge aVChallenge3 : list) {
                                        String str3 = aVChallenge3.challengeName;
                                        if (aVChallenge2 == null || (str2 = aVChallenge2.challengeName) == null) {
                                            str2 = "";
                                        }
                                        if (!o.LJ(str3, str2)) {
                                            LIZIZ.add(aVChallenge3);
                                        }
                                    }
                                    c137965bE3.LIZLLL(LIZIZ);
                                } else {
                                    o.LJIJI("stickerChallengeManager");
                                    throw null;
                                }
                            }
                            VideoPublishEditModel LLLF2 = c146855pZ2.LLLF();
                            C137965bE c137965bE4 = c146855pZ2.LLD;
                            if (c137965bE4 != null) {
                                LLLF2.stickerChallenge = c137965bE4.LIZIZ();
                                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(c146855pZ2.LLLF().creativeModel.musicBuzModel);
                                if (extractAVMusic != null && (aVChallenge = extractAVMusic.challenge) != null && !arrayList.contains(aVChallenge)) {
                                    arrayList.add(aVChallenge);
                                }
                                InterfaceC153045zY LLL3 = c146855pZ2.LLL();
                                if (LLL3 != null) {
                                    C122034qd LJJI = C17N.LJJI(LLL3);
                                    if (LJJI != null) {
                                        LJJI.LJIIJ.LIZJ();
                                        c146855pZ2.LLLF().nleData = LJJI.LJIIJ.LJIIIIZZ();
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                VideoPublishEditModel newOne = VideoPublishEditModel.makeCopy(c146855pZ2.LLLF());
                                C43587H8t.LIZJ(H83.LIZ(newOne), new C44224HXg(newOne), EnumC43590H8w.EDIT, EnumC43590H8w.PUBLISH);
                                o.LJIIIIZZ(newOne, "newOne");
                                H7R.LJJLIIJ(intent, newOne);
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("GoPublishActivity from new edit page  newOne = ");
                                LIZ.append(newOne);
                                C170666ms.LIZIZ(X1D.LIZIZ(LIZ));
                                intent.putExtra("is_from_sys_share", z4);
                                intent.putExtra("challenge", arrayList);
                                intent.putExtra("enter_record_from_other_platform", z5);
                                C82632Wbs c82632Wbs2 = c146855pZ2.LJLLLL;
                                InterfaceC74236TBo<?>[] interfaceC74236TBoArr2 = C146855pZ.LLFZ;
                                Bundle bundle2 = ((WM7) c82632Wbs2.LIZ(c146855pZ2, interfaceC74236TBoArr2[3])).mArguments;
                                boolean z6 = false;
                                if (bundle2 != null) {
                                    z3 = bundle2.getBoolean("extra_enter_from_live", false);
                                } else {
                                    z3 = false;
                                }
                                intent.putExtra("extra_enter_from_live", z3);
                                Bundle bundle3 = ((WM7) c146855pZ2.LJLLLL.LIZ(c146855pZ2, interfaceC74236TBoArr2[3])).mArguments;
                                if (bundle3 != null) {
                                    z6 = bundle3.getBoolean("edit_publish_session_end_together", false);
                                }
                                intent.putExtra("edit_publish_session_end_together", z6);
                                int y3 = c146855pZ2.LLJJ().y3();
                                if (y3 > -1) {
                                    intent.putExtra("music_rec_type", y3);
                                }
                                runnable3.run();
                                if (C138395bv.LIZ() && c146855pZ2.LLL() != null) {
                                    InterfaceC153045zY LLL4 = c146855pZ2.LLL();
                                    if (LLL4 != null) {
                                        LLL4.LLLIL(new InterfaceC133845Nc() { // from class: X.5pz
                                            @Override // X.InterfaceC133845Nc
                                            public final void LIZ() {
                                                C146855pZ.this.LLLFFI(intent, z5, z3);
                                            }

                                            @Override // X.InterfaceC133845Nc
                                            public final void LIZIZ() {
                                                C146855pZ.this.LLLFFI(intent, z5, z3);
                                            }
                                        });
                                    }
                                } else {
                                    c146855pZ2.LLLFFI(intent, z5, z3);
                                }
                            } else {
                                o.LJIJI("stickerChallengeManager");
                                throw null;
                            }
                        }
                    }
                    return C76800UCe.LIZ;
                }
            }, C10K.LJIIIIZZ, null);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
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

    @Override // X.InterfaceC145445nI
    public final void LLIIIZ(int i, int i2, boolean z, String path, int i3) {
        o.LJIIIZ(path, "path");
        LLLFZ();
        ACallableS2S1112000_2 aCallableS2S1112000_2 = new ACallableS2S1112000_2(i, i2, this, path, z, 1);
        C10C c10c = C10K.LJIIIIZZ;
        C10K.LIZIZ(aCallableS2S1112000_2, c10c, null).LJ(new AgS0S1112000_2(i3, i, this, path, z, 1), c10c, null);
    }

    @Override // X.C6F2
    public final void LLJJIJIL(final Runnable successCallback, final Runnable runnable, final boolean z, final boolean z2, boolean z3) {
        o.LJIIIZ(successCallback, "successCallback");
        if (LLLF().isMvThemeVideoType()) {
            if (TextUtils.isEmpty(LLLF().mvCreateVideoData.videoCoverImgPath)) {
                MvCreateVideoData mvCreateVideoData = LLLF().mvCreateVideoData;
                HHF LIZ = C78934UyQ.LJLIL.LJI().LIZ();
                CreativeInfo creativeInfo = LLLF().creativeInfo;
                o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
                mvCreateVideoData.videoCoverImgPath = LIZ.LJII(creativeInfo);
            }
            new C6YX(LLL(), LLLF().mvCreateVideoData.videoCoverImgPath, LLLF().mvCreateVideoData.videoCoverStartTime, (InterfaceC162186Yc) C79081V1x.LJLJI, new InterfaceC171226nm() { // from class: X.5pc
                @Override // X.InterfaceC171226nm
                public final void LIZ() {
                    C146855pZ.this.LLJLLL(z, z2, successCallback, runnable);
                }
            }, false);
        } else {
            LLJLLL(z, z2, successCallback, runnable);
        }
        C146915pf c146915pf = this.LLFII;
        VideoPublishEditModel model = LLLF();
        c146915pf.getClass();
        o.LJIIIZ(model, "model");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", model.getCreationId());
        c145995oB.LJI("shoot_way", model.mShootWay);
        c145995oB.LJI("enter_from", "video_edit_page");
        int i = model.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        FMX.LJIIL("next", c145995oB.LIZ);
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
