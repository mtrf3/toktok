package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5XZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XZ extends AbstractC42021ks<C5VE> implements C5VE {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLF;
    public final LiveEvent<C76800UCe> LJLLI;
    public final LiveEvent<C76800UCe> LJLLILLLL;
    public final LiveData<Boolean> LJLLJ;
    public C136425Xa LJLLL;
    public final List<InterfaceC88472Yns<Boolean, C76800UCe>> LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public InterfaceC65784Pro<C76800UCe> LL;
    public final List<InterfaceC136445Xc> LLD;

    static {
        TBT tbt = new TBT(C5XZ.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C5XZ.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C5XZ.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp), C61845OOz.LIZJ(C5XZ.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C5XZ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC146665pG
    public void G4(float f, float f2) {
    }

    @Override // X.AbstractC42021ks
    public int LJJLJLI() {
        return R.layout.cbz;
    }

    @Override // X.InterfaceC146665pG
    public void mJ(boolean z) {
    }

    private final InterfaceC143655kP LJLIIL() {
        return (InterfaceC143655kP) this.LJZL.LIZ(this, LLF[4]);
    }

    private final AbstractC42651GoZ LJLJJL() {
        return (AbstractC42651GoZ) this.LJZ.LIZ(this, LLF[2]);
    }

    private final InterfaceC135455Th LJLJJLL() {
        return (InterfaceC135455Th) this.LJZI.LIZ(this, LLF[3]);
    }

    private final InterfaceC166716gV LJLJLJ() {
        return (InterfaceC166716gV) this.LJLZ.LIZ(this, LLF[1]);
    }

    private final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLLLLLL.LIZ(this, LLF[0]);
    }

    @Override // X.InterfaceC145605nY, X.InterfaceC146665pG
    public void LLLLIILLL() {
        C136425Xa c136425Xa = this.LJLLL;
        if (c136425Xa != null) {
            c136425Xa.LIZIZ.clear();
            c136425Xa.LIZ.unRegisterActivityOnKeyDownListener(c136425Xa.LIZJ);
        }
        this.LJLLL = null;
        hide();
        Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = this.LJLLLL.iterator();
        while (it.hasNext()) {
            it.next().invoke(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC145605nY
    public void UJ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LJJZZIII() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LLLLIL()
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            if (r0 == 0) goto Lef
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LLLLIL()
            boolean r0 = r0.hasRecord()
            if (r0 == 0) goto Lef
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LLLLIL()
            boolean r0 = X.H7R.LJJJI(r0)
            if (r0 == 0) goto Lef
            X.5kP r0 = r6.LJLIIL()
            androidx.lifecycle.LiveData r0 = r0.Kh()
            java.lang.Object r0 = r0.getValue()
            X.5zY r0 = (X.InterfaceC153045zY) r0
            r4 = 1
            if (r0 == 0) goto Lb0
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C17N.LJJ(r0)
            if (r0 == 0) goto Lb0
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r0 = r0.getTracks()
            if (r0 == 0) goto Lb0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r0.iterator()
        L42:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.bytedance.ies.nle.editor_jni.NLENode r1 = (com.bytedance.ies.nle.editor_jni.NLENode) r1
            java.lang.String r0 = "AudioTrackType"
            java.lang.String r1 = r1.getExtra(r0)
            X.4qz r0 = X.EnumC122254qz.DUB
            java.lang.String r0 = r0.name()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L42
            r5.add(r2)
            goto L42
        L65:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r5.iterator()
        L6e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.LJIILL()
            X.ORS.LJJLIIIJILLIZJL(r0, r2)
            goto L6e
        L82:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L8b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.LJI()
            com.bytedance.ies.nle.editor_jni.NLESegmentAudio r0 = com.bytedance.ies.nle.editor_jni.NLESegmentAudio.LIZLLL(r0)
            if (r0 == 0) goto L8b
            r3.add(r1)
            goto L8b
        La6:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto Lb1
            r0 = 1
            goto Lb2
        Lb0:
            r3 = 0
        Lb1:
            r0 = 0
        Lb2:
            r2 = 0
            if (r0 == 0) goto Ld8
            java.util.Iterator r1 = r3.iterator()
        Lb9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld8
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.LJI()
            com.bytedance.ies.nle.editor_jni.NLESegmentAudio r0 = com.bytedance.ies.nle.editor_jni.NLESegmentAudio.LIZLLL(r0)
            if (r0 == 0) goto Lb9
            float r0 = r0.LJIILJJIL()
            float r2 = java.lang.Math.max(r2, r0)
            goto Lb9
        Ld8:
            r0 = 100
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            float r1 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LLLLIL()
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            float r0 = r0.getRecordVolume()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf0
        Lef:
            return
        Lf0:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LLLLIL()
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            r0.setRecordVolume(r1)
            goto Lef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5XZ.LJJZZIII():void");
    }

    @Override // X.InterfaceC145605nY, X.InterfaceC146665pG
    public void LJJJJLI() {
        LJLJJLL().LJJJJLI();
    }

    @Override // X.InterfaceC145605nY, X.InterfaceC146665pG
    public void LLD() {
        if (LJLJJL() instanceof InterfaceC45540Hu4) {
            InterfaceC36571c5 LJLJJL = LJLJJL();
            o.LJII(LJLJJL, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            this.LJLLL = new C136425Xa((InterfaceC45540Hu4) LJLJJL);
        }
        show();
        Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = this.LJLLLL.iterator();
        while (it.hasNext()) {
            it.next().invoke(Boolean.TRUE);
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_source", H8F.LJI(LLLLIL()));
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", LLLLIL().mShootWay);
        c145995oB.LJI("creation_id", LLLLIL().getCreationId());
        c145995oB.LJI("content_type", H7R.LJIIIZ(LLLLIL()));
        c145995oB.LJI("enter_dm", LLLLIL().creativeModel.initialModel.dmCameraModel.enterDM);
        FMX.LJIIL("click_audio_editing", c145995oB.LIZ);
    }

    @Override // X.AbstractC42021ks, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJZZIII();
    }

    @Override // X.AbstractC42021ks, X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLLLL.clear();
    }

    @Override // X.InterfaceC145605nY, X.InterfaceC146665pG
    public LiveData<Boolean> LLIIIZ() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC145875nz
    public LiveEvent<C76800UCe> j50() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC146665pG
    public LiveEvent<C76800UCe> uy() {
        return this.LJLLILLLL;
    }

    @Override // X.C5VE
    public void B60(InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        this.LL = block;
    }

    @Override // X.C5VE
    public void CI(String childIdentify) {
        o.LJIIIZ(childIdentify, "childIdentify");
        Iterator<InterfaceC136445Xc> it = this.LLD.iterator();
        while (it.hasNext()) {
            it.next().LJJIL(childIdentify);
        }
    }

    @Override // X.AbstractC42021ks
    public void LJJLIIIIJ(WMH childComponentsContainer) {
        o.LJIIIZ(childComponentsContainer, "childComponentsContainer");
        LJJLI(new AqS168S0100000_2(childComponentsContainer, 95));
    }

    @Override // X.C5VE
    public void Nr0(String childIdentify) {
        o.LJIIIZ(childIdentify, "childIdentify");
        Iterator<InterfaceC136445Xc> it = this.LLD.iterator();
        while (it.hasNext()) {
            it.next().LJJJJLL(childIdentify);
        }
    }

    @Override // X.C5VE
    public void XY(InterfaceC88472Yns<? super Boolean, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        if (!this.LJLLLL.contains(block)) {
            this.LJLLLL.add(block);
        }
    }

    @Override // X.C5VE
    public void Yc(InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        C136425Xa c136425Xa = this.LJLLL;
        if (c136425Xa != null && !c136425Xa.LIZIZ.contains(block)) {
            c136425Xa.LIZIZ.push(block);
        }
    }

    @Override // X.C5VE
    public void tV(InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        C136425Xa c136425Xa = this.LJLLL;
        if (c136425Xa != null && c136425Xa.LIZIZ.contains(block)) {
            c136425Xa.LIZIZ.remove(block);
        }
    }

    @Override // X.C5VE
    public void xj0(InterfaceC136445Xc listener) {
        o.LJIIIZ(listener, "listener");
        this.LLD.add(listener);
    }

    @Override // X.C5VE
    public void zc(InterfaceC136445Xc listener) {
        o.LJIIIZ(listener, "listener");
        this.LLD.remove(listener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5XZ(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene, diContainer);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLLI = new LiveEvent<>();
        this.LJLLILLLL = new LiveEvent<>();
        this.LJLLJ = new MutableLiveData();
        this.LJLLLL = new ArrayList();
        this.LJLLLLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), InterfaceC166716gV.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), InterfaceC135455Th.class, null);
        this.LJZL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LLD = new ArrayList();
    }

    @Override // X.InterfaceC145605nY, X.InterfaceC145875nz
    public void LLIIL(InterfaceC143655kP editPreviewApi, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        LJLJLJ().Hy();
    }
}
