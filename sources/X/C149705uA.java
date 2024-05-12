package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.audio.SongInfo;
import com.ss.android.ugc.aweme.music.model.SeparateStatus;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS56S1100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5uA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149705uA extends AbstractC29891Fh<InterfaceC149715uB> implements InterfaceC149715uB, InterfaceC135635Tz {
    public static final C149755uF LJLJLJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final ConcurrentHashMap<String, Boolean> LJLJJL;
    public final ConcurrentHashMap<String, Boolean> LJLJJLL;
    public final C5H3 LJLJL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.5uF] */
    static {
        TBT tbt = new TBT(C149705uA.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, new TBT(C149705uA.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0)};
        LJLJLJ = new Object() { // from class: X.5uF
        };
    }

    public InterfaceC149715uB LJJLI() {
        return this;
    }

    private final InterfaceC143655kP LJJLIIIIJ() {
        return (InterfaceC143655kP) this.LJLJI.getValue();
    }

    private final InterfaceC145405nE LJJLIIIJILLIZJL() {
        return (InterfaceC145405nE) this.LJLJJI.LIZ(this, LJLJLLL[1]);
    }

    private final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LJLJLLL[0]);
    }

    public final C161846Wu LJJLIIIJJI() {
        return (C161846Wu) this.LJLJL.getValue();
    }

    @Override // X.InterfaceC149715uB
    public void N9() {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        Object obj;
        NLETrackSlot nLETrackSlot;
        InterfaceC153045zY value = LJJLIIIIJ().Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
            Iterator<NLETrackSlot> it = nLEEditor.LJ().getMainTrack().LJIILL().iterator();
            while (true) {
                if (it.hasNext()) {
                    NLETrackSlot next = it.next();
                    String associatedId = next.getExtra("extra_associated_vc_slot_id");
                    o.LJIIIIZZ(associatedId, "associatedId");
                    if (associatedId.length() == 0) {
                        break;
                    }
                    Iterator LIZJ = C141415gn.LIZJ(nLEEditor, "nleEditor.model.tracks");
                    while (true) {
                        if (LIZJ.hasNext()) {
                            obj = LIZJ.next();
                            if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.ORIGIN_VOICE_CONVERSION.name())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    NLETrack nLETrack = (NLETrack) obj;
                    if (nLETrack == null) {
                        break;
                    }
                    Iterator<NLETrackSlot> it2 = nLETrack.LJIILL().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            nLETrackSlot = it2.next();
                            if (o.LJ(nLETrackSlot.getUUID(), associatedId)) {
                                break;
                            }
                        } else {
                            nLETrackSlot = null;
                            break;
                        }
                    }
                    NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                    if (nLETrackSlot2 == null) {
                        break;
                    }
                    NLESegment LJI = nLETrackSlot2.LJI();
                    o.LJIIIIZZ(LJI, "mrSlot.mainSegment");
                    float LJJIIZI = C124574uj.LJJIIZI(LJI);
                    next.removeExtraWithKey("extra_associated_vc_slot_id");
                    next.removeExtraWithKey("extra_voice_change_effect_name");
                    next.removeExtraWithKey("extra_voice_chang_effect_id");
                    next.removeExtraWithKey("extra_voice_chang_effect_anchor_name");
                    next.removeExtraWithKey("extra_voice_chang_effect_icon_url");
                    next.removeExtraWithKey("extra_voice_chang_effect_resource_id");
                    next.removeExtraWithKey("extra_voice_change_creator_id");
                    next.removeExtraWithKey("extra_voice_change_creator_username");
                    nLETrack.LJIJJLI(nLETrackSlot2);
                    if (nLETrack.LJIILL().isEmpty()) {
                        nLEEditor.LJ().removeTrack(nLETrack);
                    }
                    NLESegmentVideo.LJJ(next.LJI()).LJJIIJZLJL(true);
                    NLESegment LJI2 = next.LJI();
                    if (LJI2 != null) {
                        C124574uj.LJJLIIIJJI(LJI2, LJJIIZI);
                    }
                } else {
                    nLEEditor.LIZIZ();
                    break;
                }
            }
            LLLLIL().creativeModel.audioCopyrightDetectModel.setMusicReplaceStatus(SeparateStatus.UNKNOWN);
            InterfaceC145405nE LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL != null) {
                LJJLIIIJILLIZJL.I30(null);
            }
            LLLLIL().creativeModel.audioCopyrightDetectModel.setHasMusicReplaced(false);
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC149715uB getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C149705uA(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJJI = UCI.LJII(getDiContainer(), InterfaceC145405nE.class, null);
        this.LJLJJL = new ConcurrentHashMap<>();
        this.LJLJJLL = new ConcurrentHashMap<>();
        this.LJLJL = C221108m2.LIZIZ(C149735uD.LJLIL);
    }

    @Override // X.InterfaceC149715uB
    public void Zz(String taskId) {
        o.LJIIIZ(taskId, "taskId");
        if (taskId.length() != 0 && o.LJ(this.LJLJJL.get(taskId), Boolean.TRUE)) {
            this.LJLJJL.remove(taskId);
            LLLLIL().creativeModel.audioCopyrightDetectModel.setMusicReplaceStatus(SeparateStatus.UNKNOWN);
            InterfaceC145405nE LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL != null) {
                LJJLIIIJILLIZJL.I30(null);
            }
            LLLLIL().creativeModel.audioCopyrightDetectModel.setHasMusicReplaced(false);
        }
    }

    @Override // X.InterfaceC149715uB
    public void kn(NLEEditor nleEditor) {
        o.LJIIIZ(nleEditor, "nleEditor");
        C158886Lk c158886Lk = LJJLIIIJJI().LIZIZ;
        if (c158886Lk != null) {
            C122374rB.LIZ(C158886Lk.LIZ(c158886Lk), nleEditor);
        } else {
            o.LJIJI("dataContext");
            throw null;
        }
    }

    public final void LJJLIIJ(int i, C166866gk c166866gk, InterfaceC149745uE interfaceC149745uE, String str) {
        long j;
        OSZ osz = (OSZ) ((LinkedHashMap) C67682lA.LIZ).get(Integer.valueOf(i));
        if (osz != null) {
            LLLLIL().creativeModel.audioCopyrightDetectModel.setMusicReplaceStatus(SeparateStatus.PROCESSING);
            InterfaceC145405nE LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL != null) {
                LJJLIIIJILLIZJL.I30(null);
            }
            int intValue = ((Number) osz.getFirst()).intValue();
            int intValue2 = ((Number) osz.getSecond()).intValue();
            Long l = (Long) ((LinkedHashMap) C67682lA.LIZIZ).get(Integer.valueOf(i));
            if (l != null) {
                j = l.longValue();
            } else {
                j = 5000;
            }
            c166866gk.LIZ(intValue, intValue2, j, new AqS56S1100000_2(interfaceC149745uE, str, 1));
        }
    }

    @Override // X.InterfaceC149715uB
    public String Sh(PreCheckResult preCheckResult, String enterFrom, int i, InterfaceC149745uE interfaceC149745uE) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        o.LJIIIZ(preCheckResult, "preCheckResult");
        o.LJIIIZ(enterFrom, "enterFrom");
        InterfaceC153045zY value = LJJLIIIIJ().Kh().getValue();
        if (value == null || (LJJI = C17N.LJJI(value)) == null || (nLEEditor = LJJI.LJIIJ) == null) {
            return "";
        }
        NLEModel nleModel = nLEEditor.LJ();
        String valueOf = String.valueOf(System.nanoTime());
        this.LJLJJL.put(valueOf, Boolean.TRUE);
        if (interfaceC149745uE != null) {
            interfaceC149745uE.LIZIZ(valueOf);
        }
        C166866gk c166866gk = new C166866gk();
        C161846Wu LJJLIIIJJI = LJJLIIIJJI();
        Context LLLLJ = C16880lQ.LLLLJ(C78688UuS.LJIJJ(this));
        o.LJIIIIZZ(LLLLJ, "activity.applicationContext");
        VideoPublishEditModel model = LLLLIL();
        o.LJIIIIZZ(nleModel, "nleModel");
        LJJLIIIJJI.getClass();
        o.LJIIIZ(model, "model");
        long currentTimeMillis = System.currentTimeMillis();
        model.creativeModel.audioCopyrightDetectModel.setReplaceStart(currentTimeMillis);
        LJJLIIIJJI.LIZIZ = new C158886Lk(LLLLJ, model, preCheckResult, nleModel, currentTimeMillis);
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C149765uG(this, valueOf, c166866gk, interfaceC149745uE, enterFrom, i, nLEEditor, null), 3);
        return valueOf;
    }

    private final void LJJLIIIJJIZ(boolean z, String str, String enterFrom, int i, long j) {
        Boolean bool = this.LJLJJLL.get(str);
        Boolean bool2 = Boolean.TRUE;
        if (!o.LJ(bool, bool2)) {
            String creationId = LLLLIL().getCreationId();
            o.LJIIIIZZ(creationId, "publishEditModel.creationId");
            String str2 = LLLLIL().mShootWay;
            o.LJIIIIZZ(str2, "publishEditModel.mShootWay");
            String contentType = H7R.LJIIIZ(LLLLIL());
            String contentSource = H7R.LJIIIIZZ(LLLLIL());
            int videoLength = LLLLIL().getVideoLength();
            boolean LJJJJJL = C78983UzD.LJJJJJL(LLLLIL());
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(contentType, "contentType");
            o.LJIIIZ(contentSource, "contentSource");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("creation_id", creationId);
            c188727au.LJIIIZ("shoot_way", str2);
            c188727au.LJIIIZ("enter_from", enterFrom);
            c188727au.LJIIIZ("content_type", contentType);
            c188727au.LJIIIZ("content_source", contentSource);
            c188727au.LIZLLL(videoLength, "creation_duration");
            c188727au.LJ(j, "duration");
            c188727au.LJFF(Boolean.valueOf(z), "result");
            C6ES.LIZ(i, LJJJJJL ? 1 : 0, c188727au);
            FMX.LJIIL("copyright_sound_remove_end", c188727au.LIZ);
        }
        this.LJLJJLL.put(str, bool2);
    }

    public final void LJJLIIIJLLLLLLLZ(C166866gk c166866gk, InterfaceC149745uE interfaceC149745uE, String str, String str2, int i) {
        LLLLIL().creativeModel.audioCopyrightDetectModel.setMusicReplaceStatus(SeparateStatus.FAIL);
        InterfaceC145405nE LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.I30(null);
        }
        LLLLIL().creativeModel.audioCopyrightDetectModel.setHasMusicReplaced(false);
        c166866gk.LIZIZ();
        if (interfaceC149745uE != null) {
            interfaceC149745uE.onFailed(str);
        }
        LJJLIIIJJIZ(false, str, str2, i, System.currentTimeMillis() - LLLLIL().creativeModel.audioCopyrightDetectModel.getReplaceStart());
    }

    public final void LJJLJ(C158886Lk c158886Lk, NLEEditor nLEEditor, C166866gk c166866gk, InterfaceC149745uE interfaceC149745uE, String str, String str2, int i) {
        Collection<PreCheckResultModel> values;
        ArrayList<MatchDetailsV1> arrayList;
        MatchDetailsV1 matchDetailsV1;
        SongInfo songInfo;
        String str3 = c158886Lk.LJIIJJI;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        C122374rB.LIZ(str3, nLEEditor);
        LLLLIL().creativeModel.audioCopyrightDetectModel.setMusicReplaceStatus(SeparateStatus.SUCCESS);
        LLLLIL().creativeModel.audioCopyrightDetectModel.setOperation(1);
        InterfaceC145405nE LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.I30(null);
        }
        LLLLIL().creativeModel.audioCopyrightDetectModel.setHasMusicReplaced(true);
        AudioCopyrightDetectModel audioCopyrightDetectModel = LLLLIL().creativeModel.audioCopyrightDetectModel;
        VideoPublishEditModel model = LLLLIL();
        o.LJIIIZ(model, "model");
        HashMap<Integer, PreCheckResultModel> detectResults = model.creativeModel.audioCopyrightDetectModel.getDetectResults();
        if (detectResults != null && (values = detectResults.values()) != null) {
            Iterator<PreCheckResultModel> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PreCheckResultModel next = it.next();
                if (next != null && (arrayList = next.matchDetailsV1) != null && (matchDetailsV1 = (MatchDetailsV1) ORZ.LJLLJ(arrayList)) != null && (songInfo = matchDetailsV1.matchSongInfo) != null) {
                    str4 = String.valueOf(songInfo.musicId);
                    break;
                }
            }
        }
        audioCopyrightDetectModel.setReplaceRecommendID(str4);
        c166866gk.LIZIZ();
        if (interfaceC149745uE != null) {
            interfaceC149745uE.LIZ(100, str);
            interfaceC149745uE.onSuccess(str);
        }
        LJJLIIIJJIZ(true, str, str2, i, System.currentTimeMillis() - LLLLIL().creativeModel.audioCopyrightDetectModel.getReplaceStart());
    }
}
