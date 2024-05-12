package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioLoudnessBalanceFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioSamiFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioVolumeFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4q1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121654q1 implements InterfaceC123794tT {
    public C121914qR LIZ;
    public C121744qA LIZIZ;
    public java.util.Map<String, C122004qa> LIZJ;
    public final HashMap<String, C121634pz> LIZLLL;
    public final C62822Ol8 LJ;
    public final NLEEditor LJFF;
    public final InterfaceC126684y8 LJI;
    public final InterfaceC88472Yns<AbstractC121974qX, C76800UCe> LJII;

    @Override // X.InterfaceC123794tT
    public final C5IW LIZ() {
        return (C5IW) this.LJ.getValue();
    }

    @Override // X.InterfaceC123794tT
    public final List<C121634pz> LJIILIIL() {
        Collection<C121634pz> values = this.LIZLLL.values();
        o.LJIIIIZZ(values, "audioFilters.values");
        return ORZ.LLJI(values);
    }

    @Override // X.InterfaceC123794tT
    public final C121914qR LJJIII() {
        return this.LIZ;
    }

    @Override // X.InterfaceC123794tT
    public final C121744qA LJJIJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC123794tT
    public final C121744qA LIZJ(final C121744qA c121744qA) {
        this.LJII.invoke(new AbstractC121974qX(c121744qA) { // from class: X.4q8
            public final C121744qA LIZIZ;

            {
                this.LIZIZ = c121744qA;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 0.init ");
                LIZ.append(c121744qA.toString());
                LJFF(X1D.LIZIZ(LIZ));
            }

            /* JADX WARN: Removed duplicated region for block: B:223:0x04b4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:226:0x045f A[SYNTHETIC] */
            @Override // X.AbstractC121974qX
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor r19) {
                /*
                    Method dump skipped, instructions count: 1631
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C121724q8.LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor):void");
            }

            public static final float LJIIIIZZ(NLETrackSlot nLETrackSlot, float f) {
                float f2;
                if (nLETrackSlot.hasExtra("multi_original_voice_rate")) {
                    String extra = nLETrackSlot.getExtra("multi_original_voice_rate");
                    o.LJIIIIZZ(extra, "slot.getExtra(\"multi_original_voice_rate\")");
                    Float LJJIJLIJ = C38350F3i.LJJIJLIJ(extra);
                    if (LJJIJLIJ != null) {
                        f2 = LJJIJLIJ.floatValue();
                    } else {
                        f2 = 1.0f;
                    }
                    return f * f2;
                }
                return f;
            }

            public final void LJII(NLESegmentAudio setDbRangeNLEArbiter, float f) {
                Double d = this.LIZIZ.LIZ;
                if (d != null) {
                    double doubleValue = d.doubleValue();
                    if (doubleValue > 0 && f <= 1) {
                        o.LJIIIZ(setDbRangeNLEArbiter, "$this$setDbRangeNLEArbiter");
                        setDbRangeNLEArbiter.LJIILLIIL(doubleValue);
                    }
                }
            }
        });
        this.LIZIZ = c121744qA;
        return c121744qA;
    }

    @Override // X.InterfaceC123794tT
    public final C122004qa LJ(EnumC122254qz type) {
        C122004qa c122004qa;
        o.LJIIIZ(type, "type");
        Iterator<C122004qa> it = this.LIZJ.values().iterator();
        while (true) {
            if (it.hasNext()) {
                c122004qa = it.next();
                if (o.LJ(c122004qa.LJIILIIL.name(), type.name())) {
                    break;
                }
            } else {
                c122004qa = null;
                break;
            }
        }
        return c122004qa;
    }

    @Override // X.InterfaceC123794tT
    public final void LJFF(final C122004qa c122004qa) {
        this.LJII.invoke(new AbstractC121974qX(c122004qa) { // from class: X.4qE
            public EnumC135185Sg LIZIZ;
            public final C122004qa LIZJ;

            {
                this.LIZJ = c122004qa;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 0.init ");
                LIZ.append(c122004qa.toString());
                LJFF(X1D.LIZIZ(LIZ));
            }

            @Override // X.AbstractC121974qX
            public final void LIZ(InterfaceC126684y8 nleSession) {
                o.LJIIIZ(nleSession, "nleSession");
                nleSession.V8().prepare();
                if (this.LIZIZ == EnumC135185Sg.STARTED) {
                    nleSession.V8().play();
                }
            }

            @Override // X.AbstractC121974qX
            public final void LIZIZ(InterfaceC126684y8 nleSession) {
                o.LJIIIZ(nleSession, "nleSession");
                EnumC135185Sg LJJIL = nleSession.V8().LJJIL();
                this.LIZIZ = LJJIL;
                if (LJJIL == EnumC135185Sg.STARTED) {
                    nleSession.V8().pause();
                }
            }

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                o.LJIIIZ(nleEditor, "nleEditor");
                NLEModel LJ = nleEditor.LJ();
                o.LJIIIIZZ(LJ, "nleEditor.model");
                String str = this.LIZJ.LIZIZ;
                o.LJI(str);
                OSZ LJIILIIL = C1DF.LJIILIIL(LJ, str);
                if (LJIILIIL != null) {
                    ((NLETrack) LJIILIIL.getFirst()).LJIJJLI((NLETrackSlot) LJIILIIL.getSecond());
                    if (((NLETrack) LJIILIIL.getFirst()).LJIILL().isEmpty()) {
                        nleEditor.LJ().removeTrack((NLETrack) LJIILIIL.getFirst());
                    }
                }
            }
        });
        java.util.Map<String, C122004qa> map = this.LIZJ;
        String str = c122004qa.LIZIZ;
        o.LJI(str);
        map.remove(str);
    }

    @Override // X.InterfaceC123794tT
    public final void LJII(final C121634pz audioFilter) {
        o.LJIIIZ(audioFilter, "audioFilter");
        this.LJII.invoke(new AbstractC121974qX(audioFilter) { // from class: X.4pw
            public final C121634pz LIZIZ;

            {
                o.LJIIIZ(audioFilter, "params");
                this.LIZIZ = audioFilter;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 0.init ");
                LIZ.append(audioFilter);
                LJFF(X1D.LIZIZ(LIZ));
            }

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                String str;
                NLETrack nLETrack;
                NLEFilter nLEFilter;
                String str2;
                NLEFilter nLEFilter2;
                o.LJIIIZ(nleEditor, "nleEditor");
                NLEModel LJ = nleEditor.LJ();
                o.LJIIIIZZ(LJ, "nleEditor.model");
                VecNLETrackSPtr tracks = LJ.getTracks();
                o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
                Iterator<NLETrack> it = tracks.iterator();
                while (true) {
                    str = null;
                    if (it.hasNext()) {
                        nLETrack = it.next();
                        NLETrack it2 = nLETrack;
                        o.LJIIIIZZ(it2, "it");
                        if (o.LJ(it2.getUUID(), this.LIZIZ.LIZ)) {
                            break;
                        }
                    } else {
                        nLETrack = null;
                        break;
                    }
                }
                NLETrack nLETrack2 = nLETrack;
                if (nLETrack2 != null) {
                    Iterator<NLEFilter> it3 = nLETrack2.LJIIIZ().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            nLEFilter2 = it3.next();
                            NLEFilter it4 = nLEFilter2;
                            o.LJIIIIZZ(it4, "it");
                            if (o.LJ(it4.getUUID(), this.LIZIZ.LIZIZ)) {
                                break;
                            }
                        } else {
                            nLEFilter2 = null;
                            break;
                        }
                    }
                    nLEFilter = nLEFilter2;
                } else {
                    nLEFilter = null;
                }
                StringBuilder sb = new StringBuilder("1.find theTrack");
                if (nLETrack2 != null) {
                    str2 = nLETrack2.getUUID();
                } else {
                    str2 = null;
                }
                sb.append(str2);
                sb.append(" theFilter ");
                if (nLEFilter != null) {
                    str = nLEFilter.getUUID();
                }
                sb.append(str);
                LJFF(sb.toString());
                if (nLEFilter != null) {
                    LJFF(" 1.remove theFilter " + nLEFilter.getUUID());
                    nLETrack2.LJIJI(nLEFilter);
                }
            }
        });
        String str = audioFilter.LIZIZ;
        if (str != null) {
            this.LIZLLL.remove(str);
        }
    }

    @Override // X.InterfaceC123794tT
    public final void LJIIJJI(final EnumC122254qz type) {
        o.LJIIIZ(type, "type");
        this.LJII.invoke(new AbstractC121974qX(type) { // from class: X.4qG
            public EnumC135185Sg LIZIZ;
            public final EnumC122254qz LIZJ;

            {
                o.LJIIIZ(type, "type");
                this.LIZJ = type;
            }

            @Override // X.AbstractC121974qX
            public final void LIZ(InterfaceC126684y8 nleSession) {
                o.LJIIIZ(nleSession, "nleSession");
                nleSession.V8().prepare();
                if (this.LIZIZ == EnumC135185Sg.STARTED) {
                    nleSession.V8().play();
                }
            }

            @Override // X.AbstractC121974qX
            public final void LIZIZ(InterfaceC126684y8 nleSession) {
                o.LJIIIZ(nleSession, "nleSession");
                EnumC135185Sg LJJIL = nleSession.V8().LJJIL();
                this.LIZIZ = LJJIL;
                if (LJJIL == EnumC135185Sg.STARTED) {
                    nleSession.V8().pause();
                }
            }

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                NLETrack nLETrack;
                o.LJIIIZ(nleEditor, "nleEditor");
                NLEModel LJ = nleEditor.LJ();
                o.LJIIIIZZ(LJ, "nleEditor.model");
                VecNLETrackSPtr tracks = LJ.getTracks();
                o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
                Iterator<NLETrack> it = tracks.iterator();
                while (true) {
                    if (it.hasNext()) {
                        nLETrack = it.next();
                        NLETrack it2 = nLETrack;
                        o.LJIIIIZZ(it2, "it");
                        if (o.LJ(C77357UXp.LJIILIIL(it2), this.LIZJ.name())) {
                            break;
                        }
                    } else {
                        nLETrack = null;
                        break;
                    }
                }
                NLETrack nLETrack2 = nLETrack;
                if (nLETrack2 != null) {
                    nleEditor.LJ().removeTrack(nLETrack2);
                }
            }
        });
        java.util.Map<String, C122004qa> map = this.LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C122004qa> entry : map.entrySet()) {
            if (entry.getValue().LJIILIIL != type) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.LIZJ = C113554cx.LJJLIL(linkedHashMap);
    }

    @Override // X.InterfaceC121774qD
    public final void LJIILLIIL(NLEEditor editor) {
        Object obj;
        C121744qA c121744qA;
        String str;
        String str2;
        String str3;
        Object LIZ;
        String str4;
        Object LIZ2;
        String str5;
        boolean z;
        EnumC121684q4 enumC121684q4;
        o.LJIIIZ(editor, "editor");
        ((LinkedHashMap) this.LIZJ).clear();
        this.LIZ = null;
        AbstractC121964qW<LinkedList<C122004qa>> abstractC121964qW = new AbstractC121964qW<LinkedList<C122004qa>>() { // from class: X.4pY
            public static void LIZIZ(C122004qa c122004qa, NLESegmentAudio nLESegmentAudio, NLETrackSlot nLETrackSlot) {
                String str6;
                NLEPoint nLEPoint;
                c122004qa.LIZIZ = nLETrackSlot.getUUID();
                long j = 1000;
                c122004qa.LIZJ = nLESegmentAudio.LJIILIIL() / j;
                c122004qa.LIZLLL = nLESegmentAudio.LJIIL() / j;
                c122004qa.LJI = nLESegmentAudio.LJIILJJIL();
                NLEResourceAV LJ = nLESegmentAudio.LJ();
                if (LJ != null) {
                    str6 = LJ.LIZJ();
                } else {
                    str6 = null;
                }
                c122004qa.LIZ = str6;
                c122004qa.LJ = nLETrackSlot.getStartTime() / j;
                c122004qa.LJIIIIZZ = nLESegmentAudio.getSpeed();
                c122004qa.LJIIIZ = nLESegmentAudio.LJIIIZ();
                long j2 = -2;
                if (nLETrackSlot.getEndTime() != -2) {
                    j2 = nLETrackSlot.getEndTime() / j;
                }
                c122004qa.LJFF = j2;
                nLESegmentAudio.LJI();
                if (nLESegmentAudio.LJI().size() > 0) {
                    c122004qa.LJIIJ = new ArrayList();
                    int size = nLESegmentAudio.LJI().size();
                    for (int i = 0; i < size; i++) {
                        List<NLEPoint> list = c122004qa.LJIIJ;
                        o.LJI(list);
                        VecNLEPointSPtr LJI = nLESegmentAudio.LJI();
                        long VecNLEPointSPtr_doGet = NLEEditorJniJNI.VecNLEPointSPtr_doGet(LJI.LJLIL, LJI, i);
                        if (VecNLEPointSPtr_doGet == 0) {
                            nLEPoint = null;
                        } else {
                            nLEPoint = new NLEPoint(VecNLEPointSPtr_doGet);
                        }
                        o.LJIIIIZZ(nLEPoint, "segment.curveSpeedPoints[index]");
                        ((ArrayList) list).add(nLEPoint);
                    }
                }
            }
        };
        LinkedList linkedList = new LinkedList();
        NLEModel LJ = editor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (!TextUtils.isEmpty(C77357UXp.LJIILIIL(it2))) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            NLETrack it4 = (NLETrack) it3.next();
            o.LJIIIIZZ(it4, "it");
            if (o.LJ(C77357UXp.LJIILIIL(it4), EnumC122254qz.BGM.name())) {
                Iterator<NLETrackSlot> it5 = it4.LJIILL().iterator();
                while (it5.hasNext()) {
                    NLETrackSlot next2 = it5.next();
                    NLESegmentAudio LIZLLL = C62850Ola.LIZLLL(next2, "slot");
                    if (LIZLLL != null) {
                        C121914qR c121914qR = new C121914qR();
                        if (!next2.hasExtra("d_bgmId")) {
                            str4 = null;
                        } else {
                            try {
                                LIZ = next2.getExtra("d_bgmId");
                                if (LIZ == null) {
                                    LIZ = null;
                                }
                                C3C5.m7constructorimpl(LIZ);
                            } catch (Throwable th) {
                                LIZ = C141335gf.LIZ(th);
                                C3C5.m7constructorimpl(LIZ);
                            }
                            if (C3C5.m12isFailureimpl(LIZ)) {
                                LIZ = null;
                            }
                            str4 = (String) LIZ;
                        }
                        c121914qR.LJIILJJIL = str4;
                        if (!next2.hasExtra("d_bgmName")) {
                            str5 = null;
                        } else {
                            try {
                                LIZ2 = next2.getExtra("d_bgmName");
                                if (LIZ2 == null) {
                                    LIZ2 = null;
                                }
                                C3C5.m7constructorimpl(LIZ2);
                            } catch (Throwable th2) {
                                LIZ2 = C141335gf.LIZ(th2);
                                C3C5.m7constructorimpl(LIZ2);
                            }
                            if (C3C5.m12isFailureimpl(LIZ2)) {
                                LIZ2 = null;
                            }
                            str5 = (String) LIZ2;
                        }
                        c121914qR.LJIILL = str5;
                        if (NLEEditorJniJNI.NLESegmentAudio_getRepeatCount(LIZLLL.LIZJ, LIZLLL) == NLEEditorJniJNI.NLESegmentAudio_REPEAT_INFINITE_get()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c121914qR.LJIILLIIL = z;
                        NLEResourceAV LJ2 = LIZLLL.LJ();
                        o.LJIIIIZZ(LJ2, "segment.avFile");
                        EnumC123874tb LJFF = LJ2.LJFF();
                        if (LJFF != null) {
                            int i = C121714q7.LIZ[LJFF.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        enumC121684q4 = EnumC121684q4.MV_MUSIC;
                                    }
                                } else {
                                    enumC121684q4 = EnumC121684q4.MV_ALGORITHM;
                                }
                            } else {
                                enumC121684q4 = EnumC121684q4.MV_NORMAL;
                            }
                            c121914qR.LJIIZILJ = enumC121684q4;
                            C121364pY.LIZIZ(c121914qR, LIZLLL, next2);
                            linkedList.add(c121914qR);
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("fetchFromNLE: bgm ");
                            LIZ3.append(c121914qR);
                            abstractC121964qW.LIZ(X1D.LIZIZ(LIZ3));
                        }
                        enumC121684q4 = null;
                        c121914qR.LJIIZILJ = enumC121684q4;
                        C121364pY.LIZIZ(c121914qR, LIZLLL, next2);
                        linkedList.add(c121914qR);
                        StringBuilder LIZ32 = X1D.LIZ();
                        LIZ32.append("fetchFromNLE: bgm ");
                        LIZ32.append(c121914qR);
                        abstractC121964qW.LIZ(X1D.LIZIZ(LIZ32));
                    }
                }
            } else {
                Iterator<NLETrackSlot> it6 = it4.LJIILL().iterator();
                while (it6.hasNext()) {
                    NLETrackSlot next3 = it6.next();
                    NLESegmentAudio LIZLLL2 = C62850Ola.LIZLLL(next3, "slot");
                    if (LIZLLL2 != null) {
                        String LJIILIIL = C77357UXp.LJIILIIL(it4);
                        o.LJI(LJIILIIL);
                        C122004qa c122004qa = new C122004qa(EnumC122254qz.valueOf(LJIILIIL));
                        C121364pY.LIZIZ(c122004qa, LIZLLL2, next3);
                        linkedList.add(c122004qa);
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("fetchFromNLE: audioParams ");
                        LIZ4.append(c122004qa);
                        abstractC121964qW.LIZ(X1D.LIZIZ(LIZ4));
                    }
                }
            }
        }
        Iterator it7 = linkedList.iterator();
        while (it7.hasNext()) {
            C122004qa c122004qa2 = (C122004qa) it7.next();
            if (c122004qa2 instanceof C121914qR) {
                this.LIZ = (C121914qR) c122004qa2;
            } else {
                java.util.Map<String, C122004qa> map = this.LIZJ;
                String str6 = c122004qa2.LIZIZ;
                o.LJI(str6);
                map.put(str6, c122004qa2);
            }
        }
        AbstractC121964qW<LinkedList<C121634pz>> abstractC121964qW2 = new AbstractC121964qW<LinkedList<C121634pz>>() { // from class: X.4q2
        };
        LinkedList linkedList2 = new LinkedList();
        Iterator LIZ5 = C0FS.LIZ(editor, "nleEditor.model", "nleEditor.model.tracks");
        while (LIZ5.hasNext()) {
            NLETrack track = (NLETrack) LIZ5.next();
            o.LJIIIIZZ(track, "track");
            Iterator<NLEFilter> it8 = track.LJIIIZ().iterator();
            while (it8.hasNext()) {
                NLEFilter next4 = it8.next();
                if (next4 != null) {
                    NLESegmentFilter LIZIZ = next4.LIZIZ();
                    long NLESegmentAudioLoudnessBalanceFilter_dynamicCast = NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_dynamicCast(NLENode.getCPtr(LIZIZ), LIZIZ);
                    if (NLESegmentAudioLoudnessBalanceFilter_dynamicCast != 0) {
                        NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter = new NLESegmentAudioLoudnessBalanceFilter(NLESegmentAudioLoudnessBalanceFilter_dynamicCast);
                        if (o.LJ(nLESegmentAudioLoudnessBalanceFilter.LJFF(), NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER())) {
                            abstractC121964qW2.LIZ(" 2.found filter AUDIO_LOUDNESS_BALANCE_FILTER ");
                            C121634pz c121634pz = new C121634pz(nLESegmentAudioLoudnessBalanceFilter.LJFF());
                            c121634pz.LIZIZ = next4.getUUID();
                            c121634pz.LIZ = track.getUUID();
                            c121634pz.LJIIIIZZ = Double.valueOf(NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_getAvgLoudness(nLESegmentAudioLoudnessBalanceFilter.LJ, nLESegmentAudioLoudnessBalanceFilter));
                            c121634pz.LJIIIZ = Double.valueOf(NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_getPeakLoudness(nLESegmentAudioLoudnessBalanceFilter.LJ, nLESegmentAudioLoudnessBalanceFilter));
                            c121634pz.LJIIJ = Double.valueOf(NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_getTargetLoudness(nLESegmentAudioLoudnessBalanceFilter.LJ, nLESegmentAudioLoudnessBalanceFilter));
                            linkedList2.add(c121634pz);
                        }
                    }
                    NLESegmentFilter LIZIZ2 = next4.LIZIZ();
                    long NLESegmentAudioSamiFilter_dynamicCast = NLEEditorJniJNI.NLESegmentAudioSamiFilter_dynamicCast(NLENode.getCPtr(LIZIZ2), LIZIZ2);
                    if (NLESegmentAudioSamiFilter_dynamicCast != 0) {
                        NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter = new NLESegmentAudioSamiFilter(NLESegmentAudioSamiFilter_dynamicCast);
                        if (o.LJ(nLESegmentAudioSamiFilter.LJFF(), NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER())) {
                            abstractC121964qW2.LIZ(" 2.found filter AUDIO_SAMI_FILTER ");
                            C121634pz c121634pz2 = new C121634pz(nLESegmentAudioSamiFilter.LJFF());
                            c121634pz2.LIZIZ = next4.getUUID();
                            c121634pz2.LIZ = track.getUUID();
                            c121634pz2.LJIILJJIL = NLEEditorJniJNI.NLESegmentAudioSamiFilter_getSamiParam(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter);
                            c121634pz2.LJIIL = Integer.valueOf(NLEEditorJniJNI.NLESegmentAudioSamiFilter_getSamiType(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter));
                            NLEResourceNode LJ3 = nLESegmentAudioSamiFilter.LJ();
                            if (LJ3 != null) {
                                str = LJ3.LIZJ();
                            } else {
                                str = null;
                            }
                            c121634pz2.LJIILIIL = str;
                            linkedList2.add(c121634pz2);
                        }
                    }
                    NLESegmentFilter LIZLLL3 = NLESegmentFilter.LIZLLL(next4.LIZIZ());
                    if (LIZLLL3 != null) {
                        if (o.LJ(LIZLLL3.LJFF(), NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER())) {
                            abstractC121964qW2.LIZ(" 2.found filter AUDIO_DSP_FILTER ");
                            C121634pz c121634pz3 = new C121634pz(LIZLLL3.LJFF());
                            c121634pz3.LIZIZ = next4.getUUID();
                            c121634pz3.LIZ = track.getUUID();
                            NLEResourceNode LJ4 = LIZLLL3.LJ();
                            if (LJ4 != null) {
                                str3 = LJ4.LIZJ();
                            } else {
                                str3 = null;
                            }
                            c121634pz3.LJIIJJI = str3;
                            linkedList2.add(c121634pz3);
                        }
                        if (o.LJ(LIZLLL3.LJFF(), NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER())) {
                            abstractC121964qW2.LIZ(" 2.found filter AUDIO_DSP_FILTER ");
                            C121634pz c121634pz4 = new C121634pz(LIZLLL3.LJFF());
                            c121634pz4.LIZIZ = next4.getUUID();
                            c121634pz4.LIZ = track.getUUID();
                            NLEResourceNode LJ5 = LIZLLL3.LJ();
                            if (LJ5 != null) {
                                str2 = LJ5.LIZJ();
                            } else {
                                str2 = null;
                            }
                            c121634pz4.LIZJ = str2;
                            linkedList2.add(c121634pz4);
                        }
                    }
                    NLESegmentFilter LIZIZ3 = next4.LIZIZ();
                    long NLESegmentAudioVolumeFilter_dynamicCast = NLEEditorJniJNI.NLESegmentAudioVolumeFilter_dynamicCast(NLENode.getCPtr(LIZIZ3), LIZIZ3);
                    if (NLESegmentAudioVolumeFilter_dynamicCast != 0) {
                        NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter = new NLESegmentAudioVolumeFilter(NLESegmentAudioVolumeFilter_dynamicCast);
                        if (o.LJ(nLESegmentAudioVolumeFilter.LJFF(), NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER())) {
                            abstractC121964qW2.LIZ(" 2.found filter AUDIO_VOLUME_FILTER ");
                            C121634pz c121634pz5 = new C121634pz(nLESegmentAudioVolumeFilter.LJFF());
                            c121634pz5.LIZIZ = next4.getUUID();
                            c121634pz5.LIZ = track.getUUID();
                            c121634pz5.LJII = Float.valueOf(NLEEditorJniJNI.NLESegmentAudioVolumeFilter_getVolume(nLESegmentAudioVolumeFilter.LJ, nLESegmentAudioVolumeFilter));
                            linkedList2.add(c121634pz5);
                        }
                    }
                }
            }
        }
        Iterator it9 = linkedList2.iterator();
        while (it9.hasNext()) {
            C121634pz c121634pz6 = (C121634pz) it9.next();
            HashMap<String, C121634pz> hashMap = this.LIZLLL;
            String str7 = c121634pz6.LIZIZ;
            o.LJI(str7);
            hashMap.put(str7, c121634pz6);
        }
        AbstractC121964qW<C121744qA> abstractC121964qW3 = new AbstractC121964qW<C121744qA>() { // from class: X.4q3
        };
        Iterator LIZ6 = C0FS.LIZ(editor, "nleEditor.model", "nleEditor.model.tracks");
        while (true) {
            if (LIZ6.hasNext()) {
                obj = LIZ6.next();
                if (NLETrackMV.LJJII((NLETrack) obj) != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj;
        if (nLETrack != null) {
            nLETrack.LJIILLIIL();
        }
        HashMap hashMap2 = new HashMap();
        NLEModel LJ6 = editor.LJ();
        o.LJIIIIZZ(LJ6, "nleEditor.model");
        VecNLETrackSPtr tracks2 = LJ6.getTracks();
        o.LJIIIIZZ(tracks2, "nleEditor.model.tracks");
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it10 = tracks2.iterator();
        while (it10.hasNext()) {
            NLETrack next5 = it10.next();
            NLETrack it11 = next5;
            o.LJIIIIZZ(it11, "it");
            if (it11.LJIIJ() || o.LJ(C77357UXp.LJIILIIL(it11), EnumC122254qz.ORIGIN.name()) || o.LJ(C77357UXp.LJIILIIL(it11), EnumC122254qz.KTV_VOICE.name()) || o.LJ(C77357UXp.LJIILL(it11), "cutsame")) {
                arrayList2.add(next5);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it12 = arrayList2.iterator();
        while (it12.hasNext()) {
            NLETrack it13 = (NLETrack) it12.next();
            o.LJIIIIZZ(it13, "it");
            ORS.LJJLIIIJILLIZJL(it13.LJIILL(), arrayList3);
        }
        Iterator it14 = arrayList3.iterator();
        while (it14.hasNext()) {
            NLESegmentAudio LIZLLL4 = C62850Ola.LIZLLL((NLETrackSlot) it14.next(), "it");
            if (LIZLLL4 != null) {
                float LJIILJJIL = LIZLLL4.LJIILJJIL();
                if (!hashMap2.containsKey(Float.valueOf(LJIILJJIL))) {
                    hashMap2.put(Float.valueOf(LJIILJJIL), 1);
                } else {
                    Float valueOf = Float.valueOf(LJIILJJIL);
                    Object obj2 = hashMap2.get(Float.valueOf(LJIILJJIL));
                    o.LJI(obj2);
                    hashMap2.put(valueOf, Integer.valueOf(((Number) obj2).intValue() + 1));
                }
            }
        }
        if (hashMap2.keySet().size() == 0) {
            abstractC121964qW3.LIZ("1.original volume nothing ");
            c121744qA = null;
        } else if (hashMap2.keySet().size() == 1) {
            StringBuilder sb = new StringBuilder("1.find original volume ");
            java.util.Set keySet = hashMap2.keySet();
            o.LJIIIIZZ(keySet, "map.keys");
            sb.append(ORZ.LJLLILLLL(keySet));
            sb.append(' ');
            abstractC121964qW3.LIZ(sb.toString());
            java.util.Set keySet2 = hashMap2.keySet();
            o.LJIIIIZZ(keySet2, "map.keys");
            Object LJLLILLLL = ORZ.LJLLILLLL(keySet2);
            o.LJIIIIZZ(LJLLILLLL, "map.keys.first()");
            c121744qA = new C121744qA(((Number) LJLLILLLL).floatValue());
        } else {
            StringBuilder sb2 = new StringBuilder();
            java.util.Set keySet3 = hashMap2.keySet();
            o.LJIIIIZZ(keySet3, "map.keys");
            for (Object obj3 : keySet3) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("/ ");
                LIZ7.append(obj3);
                LIZ7.append(' ');
                sb2.append(X1D.LIZIZ(LIZ7));
            }
            abstractC121964qW3.LIZ("1.find multi original volume " + ((Object) sb2));
            java.util.Set keySet4 = hashMap2.keySet();
            o.LJIIIIZZ(keySet4, "map.keys");
            Object LJLLILLLL2 = ORZ.LJLLILLLL(keySet4);
            o.LJIIIIZZ(LJLLILLLL2, "map.keys.first()");
            c121744qA = new C121744qA(((Number) LJLLILLLL2).floatValue());
        }
        this.LIZIZ = c121744qA;
    }

    @Override // X.InterfaceC123794tT
    public final C121634pz LJJIJIIJIL(String uuid) {
        o.LJIIIZ(uuid, "uuid");
        return this.LIZLLL.get(uuid);
    }

    @Override // X.InterfaceC123794tT
    public final String LJJIJL(EnumC122254qz type) {
        NLETrack nLETrack;
        o.LJIIIZ(type, "type");
        NLEModel LJ = this.LJFF.LJ();
        o.LJIIIIZZ(LJ, "editor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "editor.model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            if (it.hasNext()) {
                nLETrack = it.next();
                NLETrack it2 = nLETrack;
                o.LJIIIIZZ(it2, "it");
                if (o.LJ(C77357UXp.LJIILIIL(it2), type.name())) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 == null) {
            return null;
        }
        return nLETrack2.getUUID();
    }

    @Override // X.InterfaceC123794tT
    public final void LJJIJLIJ(final C121634pz c121634pz) {
        this.LJII.invoke(new AbstractC121974qX(c121634pz) { // from class: X.4px
            public final C121634pz LIZIZ;

            {
                this.LIZIZ = c121634pz;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 0.init ");
                LIZ.append(c121634pz);
                LJFF(X1D.LIZIZ(LIZ));
            }

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                String str;
                NLETrack nLETrack;
                NLEFilter nLEFilter;
                String str2;
                NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter;
                float f;
                NLEFilter nLEFilter2;
                o.LJIIIZ(nleEditor, "nleEditor");
                NLEModel LJ = nleEditor.LJ();
                o.LJIIIIZZ(LJ, "nleEditor.model");
                VecNLETrackSPtr tracks = LJ.getTracks();
                o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
                Iterator<NLETrack> it = tracks.iterator();
                while (true) {
                    str = null;
                    if (it.hasNext()) {
                        nLETrack = it.next();
                        NLETrack it2 = nLETrack;
                        o.LJIIIIZZ(it2, "it");
                        if (o.LJ(it2.getUUID(), this.LIZIZ.LIZ)) {
                            break;
                        }
                    } else {
                        nLETrack = null;
                        break;
                    }
                }
                NLETrack nLETrack2 = nLETrack;
                if (nLETrack2 != null) {
                    Iterator<NLEFilter> it3 = nLETrack2.LJIIIZ().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            nLEFilter2 = it3.next();
                            NLEFilter it4 = nLEFilter2;
                            o.LJIIIIZZ(it4, "it");
                            if (o.LJ(it4.getUUID(), this.LIZIZ.LIZIZ)) {
                                break;
                            }
                        } else {
                            nLEFilter2 = null;
                            break;
                        }
                    }
                    nLEFilter = nLEFilter2;
                } else {
                    nLEFilter = null;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 1.find theFilter ");
                if (nLEFilter != null) {
                    str = nLEFilter.getUUID();
                }
                LIZ.append(str);
                LJFF(X1D.LIZIZ(LIZ));
                if (nLEFilter == null) {
                    LJFF(" 1.find theFilter null ");
                    return;
                }
                String str3 = this.LIZIZ.LJIILL;
                o.LJI(str3);
                if (o.LJ(str3, NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER())) {
                    NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter = new NLESegmentAudioLoudnessBalanceFilter();
                    nLESegmentAudioLoudnessBalanceFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER());
                    Double d = this.LIZIZ.LJIIIIZZ;
                    o.LJI(d);
                    NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_setAvgLoudness(nLESegmentAudioLoudnessBalanceFilter.LJ, nLESegmentAudioLoudnessBalanceFilter, d.doubleValue());
                    Double d2 = this.LIZIZ.LJIIIZ;
                    o.LJI(d2);
                    NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_setPeakLoudness(nLESegmentAudioLoudnessBalanceFilter.LJ, nLESegmentAudioLoudnessBalanceFilter, d2.doubleValue());
                    Double d3 = this.LIZIZ.LJIIJ;
                    o.LJI(d3);
                    NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_setTargetLoudness(nLESegmentAudioLoudnessBalanceFilter.LJ, nLESegmentAudioLoudnessBalanceFilter, d3.doubleValue());
                    nLEFilter.LIZJ(nLESegmentAudioLoudnessBalanceFilter);
                    return;
                }
                if (o.LJ(str3, NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER())) {
                    NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter = new NLESegmentAudioSamiFilter();
                    nLESegmentAudioSamiFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER());
                    NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiParam(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, this.LIZIZ.LJIILJJIL);
                    Integer num = this.LIZIZ.LJIIL;
                    o.LJI(num);
                    NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiType(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, num.intValue());
                    NLEResourceNode nLEResourceNode = new NLEResourceNode();
                    nLEResourceNode.LJIILIIL(EnumC123874tb.FILTER);
                    nLEResourceNode.LJIIIZ(this.LIZIZ.LJIILIIL);
                    nLESegmentAudioSamiFilter.LJI(nLEResourceNode);
                    nLEFilter.LIZJ(nLESegmentAudioSamiFilter);
                    return;
                }
                if (o.LJ(str3, NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER())) {
                    NLESegmentFilter nLESegmentFilter = new NLESegmentFilter();
                    nLESegmentFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER());
                    NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
                    nLEResourceNode2.LJIILIIL(EnumC123874tb.FILTER);
                    nLEResourceNode2.LJIIIZ(this.LIZIZ.LJIIJJI);
                    nLESegmentFilter.LJI(nLEResourceNode2);
                    nLEFilter.LIZJ(nLESegmentFilter);
                    return;
                }
                long j = 0;
                if (o.LJ(str3, NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER())) {
                    NLESegmentFilter LIZIZ = nLEFilter.LIZIZ();
                    long NLESegmentAudioVolumeFilter_dynamicCast = NLEEditorJniJNI.NLESegmentAudioVolumeFilter_dynamicCast(NLENode.getCPtr(LIZIZ), LIZIZ);
                    if (NLESegmentAudioVolumeFilter_dynamicCast == 0) {
                        nLESegmentAudioVolumeFilter = new NLESegmentAudioVolumeFilter();
                    } else {
                        nLESegmentAudioVolumeFilter = new NLESegmentAudioVolumeFilter(NLESegmentAudioVolumeFilter_dynamicCast);
                    }
                    nLESegmentAudioVolumeFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
                    NLEResourceNode nLEResourceNode3 = new NLEResourceNode();
                    nLEResourceNode3.LJIILIIL(EnumC123874tb.FILTER);
                    nLESegmentAudioVolumeFilter.LJI(nLEResourceNode3);
                    Float f2 = this.LIZIZ.LJII;
                    if (f2 != null) {
                        f = f2.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    nLESegmentAudioVolumeFilter.LJIIIIZZ(f);
                    nLEFilter.LIZJ(nLESegmentAudioVolumeFilter);
                    return;
                }
                Long l = this.LIZIZ.LIZLLL;
                if (l != null) {
                    j = l.longValue();
                }
                nLEFilter.setStartTime(j * 1000);
                Long l2 = this.LIZIZ.LJ;
                long j2 = -2;
                if (l2 != null && l2.longValue() != -2) {
                    Long l3 = this.LIZIZ.LJ;
                    o.LJI(l3);
                    j2 = l3.longValue() * 1000;
                }
                nLEFilter.setEndTime(j2);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" 1.update filter  startTime:");
                LIZ2.append(j);
                LIZ2.append(" endTime:");
                LIZ2.append(j2);
                LIZ2.append(' ');
                LJFF(X1D.LIZIZ(LIZ2));
                if (nLEFilter.LIZIZ() == null) {
                    nLEFilter.LIZJ(new NLESegmentFilter());
                }
                NLESegmentFilter LIZIZ2 = nLEFilter.LIZIZ();
                if (LIZIZ2.LJ() == null) {
                    LIZIZ2.LJI(new NLEResourceNode());
                }
                NLEResourceNode LJ2 = LIZIZ2.LJ();
                LJ2.LJIILIIL(EnumC123874tb.FILTER);
                LJ2.LJIIIZ(this.LIZIZ.LIZJ);
                if (C5MK.LJI) {
                    try {
                        C121634pz c121634pz2 = this.LIZIZ;
                        str2 = C134305Ow.LIZ(c121634pz2.LJFF, c121634pz2.LJI);
                    } catch (Throwable th) {
                        C82891Wg3.LIZLLL().LIZIZ(th);
                        str2 = "";
                    }
                    LJ2.setExtra("biz_res_id", str2);
                }
                LIZIZ2.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER());
            }
        });
    }

    @Override // X.InterfaceC123794tT
    public final void LJJJI(C122004qa c122004qa) {
        this.LJII.invoke(new C121354pX(c122004qa));
    }

    @Override // X.InterfaceC123794tT
    public final C121754qB LJJJIL(final C121754qB c121754qB) {
        this.LJII.invoke(new AbstractC121974qX(c121754qB) { // from class: X.4q9
            public final C121754qB LIZIZ;

            {
                this.LIZIZ = c121754qB;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" 0.init ");
                LIZ.append(c121754qB.toString());
                LJFF(X1D.LIZIZ(LIZ));
            }

            @Override // X.AbstractC121974qX
            public final void LIZJ(NLEEditor nleEditor) {
                o.LJIIIZ(nleEditor, "nleEditor");
                NLEModel LJ = nleEditor.LJ();
                if (LJ != null) {
                    VecNLETrackSPtr tracks = LJ.getTracks();
                    ArrayList LIZ = C07080Po.LIZ(tracks, "nleModel.tracks");
                    Iterator<NLETrack> it = tracks.iterator();
                    while (it.hasNext()) {
                        NLETrack next = it.next();
                        NLETrack it2 = next;
                        o.LJIIIIZZ(it2, "it");
                        if (o.LJ(C77357UXp.LJIILIIL(it2), EnumC122254qz.DUB.name())) {
                            LIZ.add(next);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = LIZ.iterator();
                    while (it3.hasNext()) {
                        NLETrack it4 = (NLETrack) it3.next();
                        o.LJIIIIZZ(it4, "it");
                        ORS.LJJLIIIJILLIZJL(it4.LJIILL(), arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        Object next2 = it5.next();
                        if (C62850Ola.LIZLLL((NLETrackSlot) next2, "it") != null) {
                            arrayList2.add(next2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            NLETrackSlot nLETrackSlot = (NLETrackSlot) it6.next();
                            NLESegmentAudio LIZLLL = C62850Ola.LIZLLL(nLETrackSlot, "slot");
                            if (LIZLLL != null) {
                                LIZLLL.LJIL(LJII(nLETrackSlot, this.LIZIZ.LIZIZ));
                            }
                        }
                    }
                    VecNLETrackSPtr tracks2 = LJ.getTracks();
                    ArrayList LIZ2 = C07080Po.LIZ(tracks2, "nleModel.tracks");
                    Iterator<NLETrack> it7 = tracks2.iterator();
                    while (it7.hasNext()) {
                        NLETrack next3 = it7.next();
                        NLETrack it8 = next3;
                        o.LJIIIIZZ(it8, "it");
                        if (o.LJ(C77357UXp.LJIILIIL(it8), EnumC122254qz.AUDIO_RECORD.name())) {
                            LIZ2.add(next3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it9 = LIZ2.iterator();
                    while (it9.hasNext()) {
                        NLETrack it10 = (NLETrack) it9.next();
                        o.LJIIIIZZ(it10, "it");
                        ORS.LJJLIIIJILLIZJL(it10.LJIILL(), arrayList3);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it11 = arrayList3.iterator();
                    while (it11.hasNext()) {
                        Object next4 = it11.next();
                        if (C62850Ola.LIZLLL((NLETrackSlot) next4, "it") != null) {
                            arrayList4.add(next4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        Iterator it12 = arrayList4.iterator();
                        while (it12.hasNext()) {
                            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) it12.next();
                            NLESegmentAudio LIZLLL2 = C62850Ola.LIZLLL(nLETrackSlot2, "slot");
                            if (LIZLLL2 != null) {
                                LIZLLL2.LJIL(LJII(nLETrackSlot2, this.LIZIZ.LIZIZ));
                            }
                        }
                    }
                }
            }

            public static final float LJII(NLETrackSlot nLETrackSlot, float f) {
                float f2;
                if (nLETrackSlot.hasExtra("multi_record_voice_rate")) {
                    String extra = nLETrackSlot.getExtra("multi_record_voice_rate");
                    o.LJIIIIZZ(extra, "slot.getExtra(\"multi_record_voice_rate\")");
                    Float LJJIJLIJ = C38350F3i.LJJIJLIJ(extra);
                    if (LJJIJLIJ != null) {
                        f2 = LJJIJLIJ.floatValue();
                    } else {
                        f2 = 1.0f;
                    }
                    return f * f2;
                }
                return f;
            }
        });
        return c121754qB;
    }

    @Override // X.InterfaceC123794tT
    public final C121914qR LJJJJJL(C121914qR c121914qR) {
        C121914qR c121914qR2 = this.LIZ;
        if (c121914qR2 != null && c121914qR != null) {
            o.LJI(c121914qR2);
            if (o.LJ(c121914qR2.LIZ, c121914qR.LIZ)) {
                C121914qR c121914qR3 = this.LIZ;
                o.LJI(c121914qR3);
                if (o.LJ(c121914qR3.LJIILJJIL, c121914qR.LJIILJJIL)) {
                    InterfaceC88472Yns<AbstractC121974qX, C76800UCe> interfaceC88472Yns = this.LJII;
                    o.LJI(c121914qR);
                    interfaceC88472Yns.invoke(new C121704q6(c121914qR));
                    this.LIZ = c121914qR;
                    return c121914qR;
                }
            }
        }
        this.LJII.invoke(new C121924qS(c121914qR));
        this.LIZ = c121914qR;
        return c121914qR;
    }

    @Override // X.InterfaceC123794tT
    public final C122004qa get(String uuid) {
        o.LJIIIZ(uuid, "uuid");
        return this.LIZJ.get(uuid);
    }

    @Override // X.InterfaceC123794tT
    public final void LJIILL(String str, String str2) {
        Collection<C121634pz> values = this.LIZLLL.values();
        o.LJIIIIZZ(values, "audioFilters.values");
        List LLJI = ORZ.LLJI(values);
        ArrayList arrayList = new ArrayList();
        for (Object obj : LLJI) {
            if (o.LJ(((C121634pz) obj).LIZ, str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C121634pz c121634pz = (C121634pz) it.next();
            String str3 = c121634pz.LIZIZ;
            LJJJ(str2, c121634pz);
            HashMap<String, C121634pz> hashMap = this.LIZLLL;
            if (hashMap != null) {
                C65777Prh.LIZJ(hashMap).remove(str3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
        }
    }

    @Override // X.InterfaceC123794tT
    public final C122004qa LJJ(C122004qa audioParams, boolean z) {
        o.LJIIIZ(audioParams, "audioParams");
        this.LJII.invoke(new C121794qF(audioParams, z));
        java.util.Map<String, C122004qa> map = this.LIZJ;
        String str = audioParams.LIZIZ;
        o.LJI(str);
        map.put(str, audioParams);
        return audioParams;
    }

    @Override // X.InterfaceC123794tT
    public final String LJJJ(String trackUuid, C121634pz c121634pz) {
        o.LJIIIZ(trackUuid, "trackUuid");
        this.LJII.invoke(new C121624py(trackUuid, c121634pz));
        String str = c121634pz.LIZIZ;
        if (str == null || str.length() == 0) {
            return "";
        }
        HashMap<String, C121634pz> hashMap = this.LIZLLL;
        String str2 = c121634pz.LIZIZ;
        o.LJI(str2);
        hashMap.put(str2, c121634pz);
        String str3 = c121634pz.LIZIZ;
        o.LJI(str3);
        return str3;
    }

    public C121654q1(NLEEditor editor, InterfaceC126684y8 nleSession, AqS168S0100000_2 aqS168S0100000_2) {
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(nleSession, "nleSession");
        this.LJFF = editor;
        this.LJI = nleSession;
        this.LJII = aqS168S0100000_2;
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new HashMap<>();
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 718));
    }
}
