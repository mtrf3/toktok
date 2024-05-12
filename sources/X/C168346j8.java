package X;

import Y.ARunnableS38S0100000_2;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6j8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168346j8 extends AbstractC29891Fh<C5TG> implements C5TG, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final Runnable LJLJJL;
    public DialogC25756A8y LJLJJLL;

    static {
        TBT tbt = new TBT(C168346j8.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C168346j8.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    public static void LJJLIIIJILLIZJL(DialogC25756A8y dialogC25756A8y) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "499817328173481115")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    public C5TG LJJLIIIJJIZ() {
        return this;
    }

    public final void LJJLIIIJJI() {
        DialogC25756A8y dialogC25756A8y;
        DialogC25756A8y dialogC25756A8y2 = this.LJLJJLL;
        if (dialogC25756A8y2 != null && dialogC25756A8y2.isShowing() && (dialogC25756A8y = this.LJLJJLL) != null) {
            dialogC25756A8y.dismiss();
        }
    }

    public final InterfaceC143655kP LJJLIIJ() {
        return (InterfaceC143655kP) this.LJLJJI.LIZ(this, LJLJL[1]);
    }

    public final VideoPublishEditModel LJJLJ() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJL[0]);
    }

    public final void LJJLJLI() {
        DialogC25756A8y dialogC25756A8y;
        DialogC25756A8y dialogC25756A8y2 = this.LJLJJLL;
        if (dialogC25756A8y2 == null) {
            DialogC25756A8y dialogC25756A8y3 = new DialogC25756A8y(C78688UuS.LJIJJ(this));
            dialogC25756A8y3.LIZJ(C86V.LJFF(R.string.bng));
            dialogC25756A8y3.LIZLLL(true);
            this.LJLJJLL = dialogC25756A8y3;
            V1B.LJLJJL(dialogC25756A8y3);
            return;
        }
        if (dialogC25756A8y2.isShowing() || (dialogC25756A8y = this.LJLJJLL) == null) {
            return;
        }
        LJJLIIIJILLIZJL(dialogC25756A8y);
    }

    private final void LJJLL() {
        AVChallenge aVChallenge;
        List<AVChallenge> challenges;
        AudioEffectParam audioEffectParam = LJJLJ().veAudioEffectParam;
        if (audioEffectParam != null) {
            aVChallenge = audioEffectParam.getChallenge();
        } else {
            aVChallenge = null;
        }
        LJJLJ().removeAudioEffectChallengeFromTitleAndStruct(aVChallenge);
        AudioEffectParam audioEffectParam2 = LJJLJ().veAudioEffectParam;
        if (audioEffectParam2 != null && (challenges = audioEffectParam2.getChallenges()) != null) {
            Iterator<AVChallenge> it = challenges.iterator();
            while (it.hasNext()) {
                LJJLJ().removeAudioEffectChallengeFromTitleAndStruct(it.next());
            }
        }
        C149905uU.LIZLLL(LJJLJ());
    }

    @Override // X.C5TG
    public void bO() {
        Stack<Point> mStack;
        VideoPublishEditModel editModel = LJJLJ();
        o.LJIIIZ(editModel, "editModel");
        if (!C168626ja.LIZLLL() || C168626ja.LIZIZ() || !C1B8.LIZJ()) {
            return;
        }
        C169636lD.LIZ("checkAndDetectDUBAudioMetrics");
        AudioRecorderParam audioRecorderParam = editModel.veAudioRecorderParam;
        if (audioRecorderParam == null || (mStack = audioRecorderParam.getMStack()) == null || !(!mStack.isEmpty())) {
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C168606jY(editModel, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d7, code lost:
    
        if (r10 > 0.0f) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a8, code lost:
    
        if (r8 > 0.0f) goto L55;
     */
    @Override // X.AbstractC29891Fh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168346j8.onCreate():void");
    }

    @Override // X.AbstractC29891Fh
    public void onStop() {
        C122034qd LJJI;
        int i;
        String str;
        VecNLETrackSPtr tracks;
        super.onStop();
        InterfaceC153045zY value = LJJLIIJ().Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null) {
            VideoPublishEditModel editModel = LJJLJ();
            o.LJIIIZ(editModel, "editModel");
            if (C168406jE.LIZ()) {
                String LJFF = LJJI.LJIIJJI.Z8().LJFF();
                long currentTimeMillis = System.currentTimeMillis();
                C168396jD c168396jD = new C168396jD();
                c168396jD.LIZ = 0;
                try {
                    JSONObject jSONObject = new JSONObject(LJFF);
                    c168396jD.LIZIZ = jSONObject.optInt("samplerate");
                    c168396jD.LIZJ = jSONObject.optInt("channelcount");
                    c168396jD.LIZ = jSONObject.optInt("glitchcount");
                    c168396jD.LIZLLL = jSONObject.optLong("duration");
                } catch (Exception unused) {
                }
                String creationId = editModel.getCreationId();
                o.LJIIIIZZ(creationId, "editModel.creationId");
                C168396jD c168396jD2 = new C168396jD();
                c168396jD2.LIZ = 0;
                CreativeModel creativeModel = editModel.creativeModel;
                o.LJIIIIZZ(creativeModel, "editModel.creativeModel");
                NLEModel LJ = LJJI.LJIIJ.LJ();
                if (LJ != null && (tracks = LJ.getTracks()) != null) {
                    i = tracks.size();
                } else {
                    i = -1;
                }
                MvCreateVideoData mvCreateVideoData = editModel.mvCreateVideoData;
                if (mvCreateVideoData != null) {
                    str = mvCreateVideoData.mvId;
                } else {
                    str = null;
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = editModel.mStickerID;
                if (str3 != null) {
                    str2 = str3;
                }
                C168586jW.LIZIZ(4, currentTimeMillis, creationId, c168396jD, c168396jD2, creativeModel, i, "", str, str2);
            }
            C168586jW.LIZ(LJJI.LJIIJJI, LJJLJ(), false);
            C168586jW.LIZLLL();
        }
        LJJLJ().creativeModel.audioAlgorithmModel.editVolumeEnd = (float) C47636Imm.LJII(2);
        VideoPublishEditModel editModel2 = LJJLJ();
        o.LJIIIZ(editModel2, "editModel");
        C168556jT.LIZ(editModel2, "audio_data_edit");
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C5TG getApiComponent() {
        LJJLIIIJJIZ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
    }

    private final List<String> LJJLIIIJLLLLLLLZ(Effect effect) {
        List<String> challenge;
        ArrayList arrayList = new ArrayList();
        if (effect != null && (challenge = effect.getChallenge()) != null) {
            Iterator<String> it = challenge.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final void LJJLI(NLEModel nLEModel) {
        NLESegmentVideo LJJ;
        NLETrackSlot LJIILIIL = nLEModel.getMainTrack().LJIILIIL(0);
        if (LJIILIIL != null && (LJJ = NLESegmentVideo.LJJ(LJIILIIL.LJI())) != null && LJJ.LJJI() == null) {
            NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
            nLEStyCanvas.setExtra("extra_canvas_style_from", "svc_prop");
            LJJ.LJJIII(nLEStyCanvas);
        }
    }

    public C168346j8(WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJL = new ARunnableS38S0100000_2(this, 89);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIIJ(LifecycleOwner lifecycleOwner, Effect effect) {
        if (LJJLJ().veAudioEffectParam == null) {
            int i = 0;
            LJJLJ().veAudioEffectParam = new AudioEffectParam(null, i, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
        }
        Iterator<String> it = LJJLIIIJLLLLLLLZ(effect).iterator();
        while (it.hasNext()) {
            new C41386GMc(lifecycleOwner, it.next()).LIZ(new BOC() { // from class: X.6j4
                @Override // X.BOC
                public final void LIZ(AVChallenge challenge) {
                    List<AVChallenge> challenges;
                    AudioEffectParam audioEffectParam = C168346j8.this.LJJLJ().veAudioEffectParam;
                    if (audioEffectParam != null) {
                        audioEffectParam.setChallenge(challenge);
                    }
                    AudioEffectParam audioEffectParam2 = C168346j8.this.LJJLJ().veAudioEffectParam;
                    if (audioEffectParam2 != null && (challenges = audioEffectParam2.getChallenges()) != null) {
                        o.LJIIIIZZ(challenge, "challenge");
                        challenges.add(challenge);
                    }
                }
            });
        }
    }
}
