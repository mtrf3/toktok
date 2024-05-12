package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0FS;
import X.C122034qd;
import X.C124574uj;
import X.C124614un;
import X.C145995oB;
import X.C166866gk;
import X.C166926gq;
import X.C17N;
import X.C52M;
import X.C56J;
import X.C5QW;
import X.C5T6;
import X.C76800UCe;
import X.EnumC122254qz;
import X.EnumC123864ta;
import X.FMX;
import X.InterfaceC153045zY;
import X.InterfaceC65784Pro;
import X.ORZ;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener;
import com.ss.android.ugc.aweme.services.audio.StsError;
import com.ss.android.ugc.aweme.services.audio.StsResponseModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class AqS36S1300000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS36S1300000_2 aqS36S1300000_2) {
        C122034qd LJJI;
        Object obj;
        NLESegmentAudio nLESegmentAudio;
        InterfaceC153045zY value = ((C5T6) aqS36S1300000_2.l1).Ll0().Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null) {
            AudioRecorderParam oldParam = (AudioRecorderParam) aqS36S1300000_2.l2;
            AudioRecorderParam newParam = (AudioRecorderParam) aqS36S1300000_2.l3;
            o.LJIIIZ(oldParam, "oldParam");
            o.LJIIIZ(newParam, "newParam");
            NLEModel LJ = LJJI.LJIIJ.LJ();
            o.LJIIIIZZ(LJ, "editorPro.editor.model");
            if (C52M.LIZ(LJ)) {
                List LLJI = ORZ.LLJI(newParam.getMStack());
                List LLJI2 = ORZ.LLJI(oldParam.getMStack());
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int size = LLJI.size() - 1;
                while (true) {
                    if (-1 >= size) {
                        break;
                    }
                    Point point = (Point) ORZ.LJLLLLLL(size, LLJI2);
                    if (point != null) {
                        Object obj2 = ListProtector.get(LLJI, size);
                        o.LJIIIIZZ(obj2, "newList[i]");
                        if (point.isEqual((Point) obj2)) {
                            Integer valueOf = Integer.valueOf(size);
                            if (valueOf != null) {
                                int size2 = LLJI2.size();
                                for (int intValue = valueOf.intValue(); intValue < size2; intValue++) {
                                    if (intValue != valueOf.intValue()) {
                                        Object obj3 = ListProtector.get(LLJI2, intValue);
                                        o.LJIIIIZZ(obj3, "oldList[i]");
                                        arrayList.add(obj3);
                                    }
                                }
                                int size3 = LLJI.size();
                                for (int intValue2 = valueOf.intValue(); intValue2 < size3; intValue2++) {
                                    if (intValue2 != valueOf.intValue()) {
                                        Object obj4 = ListProtector.get(LLJI, intValue2);
                                        o.LJIIIIZZ(obj4, "newList[i]");
                                        arrayList2.add(obj4);
                                    }
                                }
                            }
                        }
                    }
                    size--;
                }
                arrayList.addAll(LLJI2);
                arrayList2.addAll(LLJI);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                if (!arrayList.isEmpty()) {
                    VecNLETrackSPtr tracks = LJJI.LJIIJ.LJ().getTracks();
                    o.LJIIIIZZ(tracks, "editorPro.editor.model.tracks");
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<NLETrack> it3 = tracks.iterator();
                    while (it3.hasNext()) {
                        NLETrack next = it3.next();
                        NLETrack it4 = next;
                        o.LJIIIIZZ(it4, "it");
                        if (C124574uj.LJJIJIL(it4)) {
                            arrayList3.add(next);
                        }
                    }
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        NLETrack nLETrack = (NLETrack) it5.next();
                        Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            Point point2 = (Point) it6.next();
                            Iterator<NLETrackSlot> it7 = nLETrack.LJIILL().iterator();
                            while (it7.hasNext()) {
                                NLETrackSlot next2 = it7.next();
                                long j = 1000;
                                long startTime = next2.getStartTime() / j;
                                long endTime = next2.getEndTime() / j;
                                if (startTime >= point2.getX() && endTime <= point2.getY()) {
                                    nLETrack.LJIJJLI(next2);
                                }
                            }
                        }
                    }
                    NLEModel LJ2 = LJJI.LJIIJ.LJ();
                    o.LJIIIIZZ(LJ2, "editorPro.editor.model");
                    C124614un.LIZLLL(LJ2, EnumC123864ta.AUDIO);
                }
                if (!arrayList2.isEmpty()) {
                    NLEModel LJ3 = LJJI.LJIIJ.LJ();
                    o.LJIIIIZZ(LJ3, "editorPro.editor.model");
                    NLETrack LIZIZ = C56J.LIZIZ(LJ3);
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        Point point3 = (Point) it8.next();
                        Iterator LIZ = C0FS.LIZ(LJJI.LJIIJ, "editorPro.editor.model", "nleModel.tracks");
                        while (true) {
                            if (LIZ.hasNext()) {
                                obj = LIZ.next();
                                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        NLETrack nLETrack2 = (NLETrack) obj;
                        if (nLETrack2 != null) {
                            Iterator<NLETrackSlot> it9 = nLETrack2.LJIILL().iterator();
                            NLETrackSlot nLETrackSlot = null;
                            while (it9.hasNext()) {
                                NLETrackSlot next3 = it9.next();
                                if (next3.getStartTime() == point3.getX() * 1000) {
                                    nLETrackSlot = next3;
                                }
                            }
                            if (nLETrackSlot != null) {
                                NLEModel LJ4 = LJJI.LJIIJ.LJ();
                                o.LJIIIIZZ(LJ4, "editorPro.editor.model");
                                int LJII = C124614un.LJII(LJ4) + 1;
                                nLETrackSlot.LJI().LIZIZ().LJIIJJI("Record");
                                NLESegment LJI = nLETrackSlot.LJI();
                                if (LJI instanceof NLESegmentAudio) {
                                    nLESegmentAudio = (NLESegmentAudio) LJI;
                                } else {
                                    nLESegmentAudio = null;
                                }
                                if (nLESegmentAudio != null) {
                                    nLESegmentAudio.LJIJI(true);
                                }
                                nLETrackSlot.setExtra("audio_record_order", String.valueOf(LJII));
                                LIZIZ.LIZIZ(NLETrackSlot.LIZ(nLETrackSlot.deepClone(true)));
                            }
                        }
                    }
                }
            }
            LJJI.LJIIJ.LIZIZ();
        }
        ((C5T6) aqS36S1300000_2.l1).LJJLIIIJILLIZJL();
        C5T6 c5t6 = (C5T6) aqS36S1300000_2.l1;
        String str = aqS36S1300000_2.s0;
        if (str == null) {
            str = "";
        }
        c5t6.LJLLL(str);
        ((C5T6) aqS36S1300000_2.l1).LJJZZIII().s3(true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS36S1300000_2 aqS36S1300000_2) {
        C145995oB LJFF = C5QW.LJFF((VideoPublishEditModel) aqS36S1300000_2.l1, (EditorProContext) aqS36S1300000_2.l2);
        LJFF.LJI("crop_type", aqS36S1300000_2.s0);
        LJFF.LIZJ((List) aqS36S1300000_2.l3, "action_type");
        FMX.LJIIL("crop_video_size", LJFF.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS36S1300000_2 aqS36S1300000_2) {
        ((C166866gk) aqS36S1300000_2.l1).LIZIZ();
        StsResponseModel stsResponseModel = ((C166926gq) aqS36S1300000_2.l2).LIZLLL;
        if (stsResponseModel == null) {
            OnSpeechToSongPrepareListener.DefaultImpls.onFailed$default((OnSpeechToSongPrepareListener) aqS36S1300000_2.l3, aqS36S1300000_2.s0, new StsError(-100, "responseModel is null", null, 4, null), false, 4, null);
        } else {
            OnSpeechToSongPrepareListener.DefaultImpls.onSuccess$default((OnSpeechToSongPrepareListener) aqS36S1300000_2.l3, aqS36S1300000_2.s0, stsResponseModel, false, 4, null);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS36S1300000_2(C5T6 c5t6, String str, AudioRecorderParam audioRecorderParam, AudioRecorderParam audioRecorderParam2, int i) {
        super(0);
        this.$t = i;
        this.l1 = c5t6;
        this.s0 = str;
        this.l2 = audioRecorderParam;
        this.l3 = audioRecorderParam2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS36S1300000_2(C166866gk c166866gk, C166926gq c166926gq, OnSpeechToSongPrepareListener onSpeechToSongPrepareListener, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c166866gk;
        this.l2 = c166926gq;
        this.l3 = onSpeechToSongPrepareListener;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS36S1300000_2(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2, EditorProContext editorProContext, String str, List<String> list) {
        super(0);
        this.$t = list;
        this.l1 = videoPublishEditModel;
        this.l2 = videoPublishEditModel2;
        this.s0 = editorProContext;
        this.l3 = str;
    }
}
