package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.services.audio.IStsPrepareHelper;
import com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener;
import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.aweme.services.audio.StsError;
import com.ss.android.ugc.aweme.services.audio.StsRequestModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5uK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149805uK extends AbstractC29891Fh<InterfaceC162426Za> implements InterfaceC162426Za, InterfaceC135635Tz {
    public static final C149855uP LJLJL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final C5H3 LJLJJLL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.5uP] */
    static {
        TBT tbt = new TBT(C149805uK.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, new TBT(C149805uK.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C149805uK.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new TBT(C149805uK.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0)};
        LJLJL = new Object() { // from class: X.5uP
        };
    }

    public InterfaceC162426Za LJJLIIIIJ() {
        return this;
    }

    private final InterfaceC143655kP LJJLIIIJILLIZJL() {
        return (InterfaceC143655kP) this.LJLILLLLZI.LIZ(this, LJLJLJ[0]);
    }

    private final C5XM LJJLIIIJJI() {
        return (C5XM) this.LJLJJL.LIZ(this, LJLJLJ[3]);
    }

    private final List<Effect> LJJLIIIJJIZ() {
        return (List) this.LJLJJLL.getValue();
    }

    private final InterfaceC145495nN LJJLIIIJLLLLLLLZ() {
        return (InterfaceC145495nN) this.LJLJJI.LIZ(this, LJLJLJ[2]);
    }

    private final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJLJ[1]);
    }

    @Override // X.InterfaceC162426Za
    public Effect zT() {
        Effect effect = new Effect(null, 1, null);
        effect.setEffectId("reggae");
        String string = C5L7.LIZ().getString(R.string.rhp);
        o.LJIIIIZZ(string, "AppContextManager.getApp…dReggaeBottomSheet_title)");
        effect.setName(string);
        return effect;
    }

    @Override // X.InterfaceC162426Za
    public boolean A8() {
        AudioRecorderParam audioRecorderParam = LLLLIL().veAudioRecorderParam;
        if (audioRecorderParam != null) {
            return audioRecorderParam.hasRecord();
        }
        return false;
    }

    @Override // X.InterfaceC162426Za
    public List<Effect> Dm0() {
        return LJJLIIIJJIZ();
    }

    @Override // X.InterfaceC162426Za
    public boolean P9() {
        NLEModel nLEModel;
        InterfaceC153045zY value = LJJLIIIJILLIZJL().Kh().getValue();
        if (value != null) {
            nLEModel = C17N.LJJ(value);
        } else {
            nLEModel = null;
        }
        if (nLEModel == null) {
            return false;
        }
        C62A.LIZ.getClass();
        if (!C62A.LIZLLL() || !C62A.LIZJ() || !C1B8.LIZJ()) {
            return false;
        }
        VideoPublishEditModel LLLLIL = LLLLIL();
        if (C44384HbQ.LJLLLL(LLLLIL) || LLLLIL.isDuet() || C44384HbQ.LJZL(LLLLIL) || LLLLIL.getTimeEffect() != null || LLLLIL.getPreviewInfo().getVideoList().size() > 1 || LLLLIL.isCurrentAutoCutMode() || CommerceToolsMusicService.LIZIZ(false).U40() || LJJLI(nLEModel)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC162426Za getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C149805uK(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC145495nN.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), C5XM.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(C149815uL.LJLIL);
    }

    private final boolean LJJLI(NLEModel nLEModel) {
        NLETrackSlot nLETrackSlot;
        NLETrackSlot LJIIIIZZ;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        String LIZJ;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(mainTrack.LJIILL());
        } else {
            nLETrackSlot = null;
        }
        if (nLETrackSlot == null || (LJIIIIZZ = nLETrackSlot.LJIIIIZZ()) == null || (LJI = LJIIIIZZ.LJI()) == null || (LIZIZ = LJI.LIZIZ()) == null || (LIZJ = LIZIZ.LIZJ()) == null || LIZJ.length() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC162426Za
    public Effect YK(String str) {
        int i = 0;
        if (str == null || str.length() == 0) {
            return zT();
        }
        int i2 = 0;
        for (Effect effect : LJJLIIIJJIZ()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (o.LJ(effect.getEffectId(), str)) {
                    i = i2;
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        int i4 = i + 1;
        if (!LJJLIIIJJIZ().isEmpty()) {
            i4 %= LJJLIIIJJIZ().size();
        }
        if (i4 < LJJLIIIJJIZ().size()) {
            return (Effect) ListProtector.get(LJJLIIIJJIZ(), i4);
        }
        return new Effect(null, 1, null);
    }

    @Override // X.InterfaceC162426Za
    public void d30(MusicBuzModel musicBuzModel) {
        C145355n9 LIZ;
        o.LJIIIZ(musicBuzModel, "musicBuzModel");
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        I9T.LJI(extractAVMusic, false, musicBuzModel);
        if (C44384HbQ.LJJIFFI()) {
            C145505nO.LIZ(LJJLIIIJLLLLLLLZ(), musicBuzModel.musicPath, extractAVMusic, true, false, false, false, 0L, 0L, false, 1016);
            return;
        }
        String str = musicBuzModel.musicPath;
        if (str == null || str.length() == 0) {
            LIZ = C145385nC.LIZ(Boolean.TRUE, null, null, null, null, 0L, 0L, 112);
        } else {
            LIZ = C145385nC.LIZ(Boolean.FALSE, "edit_page_list", extractAVMusic, musicBuzModel.musicPath, null, 0L, 0L, 112);
        }
        LJJLIIIJLLLLLLLZ().q3(LIZ);
    }

    @Override // X.InterfaceC162426Za
    public void xj(boolean z) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo LJJ;
        C5MG WS = LJJLIIIJILLIZJL().WS();
        if (WS == null || (LJJI = C17N.LJJI(WS.LJIJ())) == null || (nLEEditor = LJJI.LJIIJ) == null) {
            return;
        }
        if (C44384HbQ.LJLJL(LLLLIL())) {
            LLLLIL().creativeModel.musicBuzModel.stsEffectName = null;
            LLLLIL().creativeModel.musicBuzModel.stsTemplateId = null;
            LLLLIL().creativeModel.musicBuzModel.stsWarp = null;
            LLLLIL().creativeModel.musicBuzModel.stsPath = null;
            NLEModel LJ = nLEEditor.LJ();
            o.LJIIIIZZ(LJ, "nleEditor.model");
            NLETrack mainTrack = LJ.getMainTrack();
            if (mainTrack != null) {
                Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
                while (it.hasNext()) {
                    NLETrackSlot it2 = it.next();
                    o.LJIIIIZZ(it2, "it");
                    if (it2.hasExtra("extra_sts_original_volume")) {
                        it2.removeExtraWithKey("extra_sts_original_volume");
                    }
                }
            }
            NLETrack LIZIZ = C141335gf.LIZIZ(LJ);
            if (LIZIZ != null) {
                Iterator<NLETrackSlot> it3 = LIZIZ.LJIILL().iterator();
                while (it3.hasNext()) {
                    NLETrackSlot it4 = it3.next();
                    o.LJIIIIZZ(it4, "it");
                    if (it4.hasExtra("extra_sts_original_volume")) {
                        it4.removeExtraWithKey("extra_sts_original_volume");
                    }
                }
            }
            NLETrack LIZJ = C122794rr.LIZJ(LJ);
            if (LIZJ != null) {
                Iterator<NLETrackSlot> it5 = LIZJ.LJIILL().iterator();
                while (it5.hasNext()) {
                    NLETrackSlot it6 = it5.next();
                    o.LJIIIIZZ(it6, "it");
                    if (it6.hasExtra("extra_sts_original_volume")) {
                        it6.removeExtraWithKey("extra_sts_original_volume");
                    }
                }
            }
            NLETrack LIZIZ2 = C122794rr.LIZIZ(LJ);
            if (LIZIZ2 != null) {
                Iterator<NLETrackSlot> it7 = LIZIZ2.LJIILL().iterator();
                while (it7.hasNext()) {
                    NLETrackSlot it8 = it7.next();
                    o.LJIIIIZZ(it8, "it");
                    if (it8.hasExtra("extra_sts_original_volume")) {
                        it8.removeExtraWithKey("extra_sts_original_volume");
                    }
                }
            }
            LJJLJ(LJJLIIIJJI(), LLLLIL());
            C141425go.LJ(LJJLIIIJILLIZJL(), null);
            LLLLIL().veAudioEffectParam = null;
            if (!z) {
                I9T.LJI(null, false, LLLLIL().creativeModel.musicBuzModel);
                LJJLIIIJLLLLLLLZ().clearMusic();
            }
            if (nLEEditor.LJ().getMainTrack() != null && !nLEEditor.LJ().getMainTrack().LJIILL().isEmpty() && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLEEditor.LJ().getMainTrack().LJIILL())) != null && (LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI())) != null) {
                NLEEditorJniJNI.NLESegmentAudio_clearCurveSpeedPoint(LJJ.LIZJ, LJJ);
                if (LJJ.getAbsSpeed() != 1.0f) {
                    LJJ.setAbsSpeed(1.0f);
                }
                nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + ((long) ((LJJ.LJIIL() - LJJ.LJIILIIL()) / LJJ.LJFF())));
            }
            C122794rr.LIZ(nLEEditor);
            nLEEditor.LIZIZ();
        }
        InterfaceC153045zY value = LJJLIIIJILLIZJL().Kh().getValue();
        if (value == null) {
            return;
        }
        LLLLIL().getPreviewInfo().setPreviewVideoLength(value.getDuration());
    }

    private final void LJJLIIJ(C5XM c5xm, VideoPublishEditModel videoPublishEditModel) {
        if (c5xm.F10()) {
            o.LJIIIZ(videoPublishEditModel, "<this>");
            MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
            if (!musicBuzModel.isStsMuteOriginalSound) {
                musicBuzModel.isStsMuteOriginalSound = true;
                c5xm.RU(false);
            }
        }
        c5xm.og(false);
    }

    private final void LJJLJ(C5XM c5xm, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
        if (musicBuzModel.isStsMuteOriginalSound) {
            musicBuzModel.isStsMuteOriginalSound = false;
            c5xm.RU(true);
        }
        c5xm.og(true);
    }

    @Override // X.InterfaceC162426Za
    public void E5(IStsPrepareHelper iStsPrepareHelper, String taskId) {
        InterfaceC149845uO interfaceC149845uO;
        o.LJIIIZ(taskId, "taskId");
        if ((iStsPrepareHelper instanceof InterfaceC149845uO) && (interfaceC149845uO = (InterfaceC149845uO) iStsPrepareHelper) != null) {
            interfaceC149845uO.LIZ(taskId);
        }
    }

    @Override // X.InterfaceC162426Za
    public IStsPrepareHelper Oq(Context context, String bizType) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bizType, "bizType");
        return new C166736gX(bizType, context, LLLLIL());
    }

    private final void LJJLJLI(String str, String str2, MusicBuzModel musicBuzModel) {
        C145355n9 LIZ;
        IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
        MusicModel LJJIIZI = LJJLIIIJJI.LJJIIZI(str);
        LJJIIZI.setLocalPath(str);
        LJJIIZI.setName(LJJLIIIJJI.LJJJJZI(str2));
        LJJIIZI.setMusicType(MusicModel.MusicType.SPEECH2SONG);
        LJJIIZI.setPicPremium(AccountService.LJIJ().LJFF().getAvatarUrl());
        LJJIIZI.setMusicStatus(10);
        new I9Q();
        AVMusic LIZ2 = I9Q.LIZ(LJJIIZI);
        I9T.LJI(LIZ2, false, musicBuzModel);
        if (C44384HbQ.LJJIFFI()) {
            C145505nO.LIZ(LJJLIIIJLLLLLLLZ(), str, LIZ2, true, false, false, false, 0L, 0L, false, 1016);
            return;
        }
        if (str == null || str.length() == 0) {
            LIZ = C145385nC.LIZ(Boolean.TRUE, null, null, null, null, 0L, 0L, 112);
        } else {
            LIZ = C145385nC.LIZ(Boolean.FALSE, "edit_page_list", LIZ2, str, null, 0L, 0L, 112);
        }
        LJJLIIIJLLLLLLLZ().q3(LIZ);
    }

    @Override // X.InterfaceC162426Za
    public void em(Context context, Integer num, int i) {
        o.LJIIIZ(context, "context");
        int i2 = R.string.rhr;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 50000) {
                if (intValue != 60000) {
                    if (intValue == 70000) {
                        i2 = R.string.rhq;
                    }
                } else {
                    i2 = R.string.ri5;
                }
            } else {
                i2 = R.string.ri1;
            }
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            String string = context.getResources().getString(i2);
            o.LJIIIIZZ(string, "context.resources.getString(toastResId)");
            creativeToastBuilder.message(string);
            C78915Uy7.LJJIIZI(LJIJJ, i, creativeToastBuilder);
        }
    }

    @Override // X.InterfaceC162426Za
    public String iY(IStsPrepareHelper iStsPrepareHelper, StsRequestModel model, OnSpeechToSongPrepareListener listener) {
        NLEModel LJJ;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(listener, "listener");
        if (iStsPrepareHelper == null || !(iStsPrepareHelper instanceof InterfaceC149845uO)) {
            String valueOf = String.valueOf(System.nanoTime());
            listener.onStart(valueOf, false);
            listener.onFailed(valueOf, new StsError(-2, "error! helper cast error", null, 4, null), false);
            return valueOf;
        }
        InterfaceC153045zY value = LJJLIIIJILLIZJL().Kh().getValue();
        if (value == null || (LJJ = C17N.LJJ(value)) == null) {
            String valueOf2 = String.valueOf(System.nanoTime());
            listener.onStart(valueOf2, false);
            listener.onFailed(valueOf2, new StsError(-3, "error! no nleModel", null, 4, null), false);
            return valueOf2;
        }
        return ((InterfaceC149845uO) iStsPrepareHelper).LIZIZ(new C166926gq(LJJ, model), listener);
    }

    @Override // X.InterfaceC162426Za
    public boolean t50(StsAssetModel assetModel, boolean z, Long l) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        Object obj;
        int layer;
        o.LJIIIZ(assetModel, "assetModel");
        C5MG WS = LJJLIIIJILLIZJL().WS();
        if (WS == null || (LJJI = C17N.LJJI(WS.LJIJ())) == null || (nLEEditor = LJJI.LJIIJ) == null) {
            return false;
        }
        C141425go.LIZJ(LJJLIIIJILLIZJL(), LLLLIL());
        if (!z) {
            LJJLJLI(assetModel.getSongPath(), assetModel.getEffect().getName(), LLLLIL().creativeModel.musicBuzModel);
        }
        NLEModel LJ = nLEEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        NLETrack mainTrack = LJ.getMainTrack();
        if (mainTrack != null) {
            Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
            while (it.hasNext()) {
                NLETrackSlot it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                C122794rr.LJII(it2);
            }
        }
        NLETrack LIZIZ = C141335gf.LIZIZ(LJ);
        if (LIZIZ != null) {
            Iterator<NLETrackSlot> it3 = LIZIZ.LJIILL().iterator();
            while (it3.hasNext()) {
                NLETrackSlot it4 = it3.next();
                o.LJIIIIZZ(it4, "it");
                C122794rr.LJII(it4);
            }
        }
        NLETrack LIZJ = C122794rr.LIZJ(LJ);
        if (LIZJ != null) {
            Iterator<NLETrackSlot> it5 = LIZJ.LJIILL().iterator();
            while (it5.hasNext()) {
                NLETrackSlot it6 = it5.next();
                o.LJIIIIZZ(it6, "it");
                C122794rr.LJII(it6);
            }
        }
        LJJLIIJ(LJJLIIIJJI(), LLLLIL());
        NLEModel LJ2 = nLEEditor.LJ();
        o.LJIIIIZZ(LJ2, "this.model");
        NLETrack LIZIZ2 = C122794rr.LIZIZ(LJ2);
        if (C122794rr.LIZJ(LJ2) != null) {
            Iterator LIZJ2 = t1.LIZJ(LJ2, "tracks");
            while (true) {
                if (LIZJ2.hasNext()) {
                    obj = LIZJ2.next();
                    if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
            if (nLETimeSpaceNode != null && LIZIZ2 == null && (layer = nLETimeSpaceNode.getLayer()) > 0) {
                nLETimeSpaceNode.setLayer(layer - 1);
            }
        }
        if (z && l != null && l.longValue() > 0) {
            C122434rH.LIZ(assetModel.getWarp(), nLEEditor, l);
        } else {
            C122434rH.LIZ(assetModel.getWarp(), nLEEditor, null);
        }
        C122794rr.LIZ(nLEEditor);
        nLEEditor.LIZIZ();
        C141425go.LJ(LJJLIIIJILLIZJL(), null);
        LLLLIL().veAudioEffectParam = null;
        LLLLIL().creativeModel.musicBuzModel.stsEffectName = assetModel.getEffect().getName();
        LLLLIL().creativeModel.musicBuzModel.stsTemplateId = assetModel.getEffect().getEffectId();
        LLLLIL().creativeModel.musicBuzModel.stsWarp = assetModel.getWarp();
        LLLLIL().creativeModel.musicBuzModel.stsPath = assetModel.getSongPath();
        InterfaceC153045zY value = LJJLIIIJILLIZJL().Kh().getValue();
        if (value != null) {
            LLLLIL().getPreviewInfo().setPreviewVideoLength(value.getDuration());
            return true;
        }
        return true;
    }
}
