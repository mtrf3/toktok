package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.4v9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124834v9 extends C124704uw implements InterfaceC125484wC {
    @Override // X.InterfaceC125484wC
    public final boolean LJIILIIL() {
        NLESegmentAudio LIZLLL;
        NLETrackSlot LJJLIIIJ = LJJLIIIJ();
        if (LJJLIIIJ != null && (LIZLLL = NLESegmentAudio.LIZLLL(LJJLIIIJ.LJI())) != null) {
            return LIZLLL.LJIIIZ();
        }
        return false;
    }

    @Override // X.InterfaceC125484wC
    public final float LJJIJIL() {
        NLESegmentAudio LIZLLL;
        NLETrackSlot LJJLIIIJ = LJJLIIIJ();
        if (LJJLIIIJ != null && (LIZLLL = NLESegmentAudio.LIZLLL(LJJLIIIJ.LJI())) != null) {
            return LIZLLL.getAbsSpeed();
        }
        return 1.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C124834v9(InterfaceC124924vI editorContext) {
        super(editorContext);
        o.LJIIIZ(editorContext, "editorContext");
    }

    @Override // X.InterfaceC125484wC
    public final NLETrackSlot LJJII(C124844vA param) {
        EnumC123874tb enumC123874tb;
        o.LJIIIZ(param, "param");
        C124854vB LIZ = C152205yC.LIZ(param.LIZIZ);
        if (LIZ == null) {
            C131935Ft.LJFF("Invalid audio file path");
            return null;
        }
        Number number = param.LJIIL;
        if (number == null) {
            number = Integer.valueOf(LIZ.LIZ);
        }
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.LJIIJJI(param.LIZ);
        if (param.LJI) {
            nLETrackSlot.setExtra("audio_record_order", String.valueOf(C124614un.LJII(C79057V0z.LJJI(this.LJLIL)) + 1));
            enumC123874tb = EnumC123874tb.RECORD;
        } else if (param.LJII) {
            enumC123874tb = EnumC123874tb.SOUND;
        } else {
            enumC123874tb = EnumC123874tb.AUDIO;
        }
        nLEResourceAV.LJIILIIL(enumC123874tb);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nLEResourceAV.setDuration(timeUnit.toMicros(number.longValue()));
        nLEResourceAV.LJIIIZ(param.LIZIZ);
        nLESegmentAudio.LJIILL(nLEResourceAV);
        C124574uj.LJJLIIIIJ(nLESegmentAudio);
        nLESegmentAudio.LJIJJLI(param.LJIIIIZZ);
        long j = param.LJIIIZ;
        if (j == 0) {
            j = timeUnit.toMicros(number.longValue());
        }
        nLESegmentAudio.LJIJJ(j);
        nLESegmentAudio.LJIJI(false);
        nLETrackSlot.LJIIL(nLESegmentAudio);
        nLETrackSlot.setStartTime(param.LIZLLL);
        long j2 = param.LJ;
        if (j2 != 0) {
            nLETrackSlot.setEndTime(j2);
        } else if (param.LJIIIZ - param.LJIIIIZZ > timeUnit.toMicros(number.longValue())) {
            nLETrackSlot.setEndTime(timeUnit.toMicros(number.longValue()) + param.LIZLLL);
        }
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue() || param.LJIIJJI) {
            long LIZLLL = C124574uj.LIZLLL(C79057V0z.LJJI(this.LJLIL));
            long endTime = nLETrackSlot.getEndTime();
            long j3 = endTime - LIZLLL;
            if (endTime > LIZLLL) {
                nLETrackSlot.setEndTime(LIZLLL);
                NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
                if (LIZLLL2 != null) {
                    LIZLLL2.LJIJJ(LIZLLL2.LJIIL() - j3);
                }
            }
        }
        String str = param.LIZJ;
        if (str != null) {
            nLETrackSlot.setExtra("slot_extra_music_id", str);
        }
        return nLETrackSlot;
    }

    @Override // X.InterfaceC125484wC
    public final OSZ<NLETrack, NLETrackSlot> LJJIZ(NLETrackSlot nLETrackSlot, EnumC124724uy enumC124724uy) {
        NLETrack trackBySlot;
        EnumC123864ta enumC123864ta;
        if (nLETrackSlot == null) {
            nLETrackSlot = LJJLIIIJ();
            trackBySlot = LJJLIIIIJ();
        } else {
            trackBySlot = C79057V0z.LJJI(this.LJLIL).getTrackBySlot(nLETrackSlot);
        }
        if (trackBySlot != null) {
            enumC123864ta = C79057V0z.LJJIJIL(trackBySlot);
        } else {
            enumC123864ta = null;
        }
        if (enumC123864ta != EnumC123864ta.AUDIO) {
            C131935Ft.LJFF("selectedNleTrack is not audio track");
            return new OSZ<>(null, null);
        }
        if (trackBySlot != null) {
            trackBySlot.LJIJJLI(nLETrackSlot);
            if (o.LJ(trackBySlot.getExtra("AudioTrackType"), "BGM")) {
                trackBySlot.setExtra("AudioTrackType", "EDITOR_MUSIC");
            }
            if (!r9().hasExtra("model_extra_is_audio_deleted")) {
                r9().setExtra("model_extra_is_audio_deleted", "true");
            }
            LJJJZ(enumC124724uy, null);
            return new OSZ<>(trackBySlot, nLETrackSlot);
        }
        return new OSZ<>(null, null);
    }

    @Override // X.InterfaceC125484wC
    public final void LJJJ(C124824v8 c124824v8, EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        NLESegmentAudio LIZLLL;
        float absSpeed;
        boolean z;
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null && (LJJLIIIJ = LJJLIIIJ()) != null && (LIZLLL = NLESegmentAudio.LIZLLL(LJJLIIIJ.LJI())) != null) {
            long LJIIJJI = r9().getMainTrack().LJIIJJI();
            Float f = c124824v8.LIZ;
            if (f != null) {
                absSpeed = f.floatValue();
            } else {
                absSpeed = LIZLLL.getAbsSpeed();
            }
            if (C124574uj.LJJIL(LJJLIIIIJ)) {
                LJJLIIIJ.setEndTime((LJJLIIIJ.getMeasuredEndTime() + LJJLIIIJ.getStartTime()) - LJJLIIIJ.getMeasuredStartTime());
                LIZLLL.LJIJJ(LIZLLL.LJIILIIL() + (LIZLLL.getAbsSpeed() * ((float) (LJJLIIIJ.getMeasuredEndTime() - LJJLIIIJ.getMeasuredStartTime()))));
            }
            Boolean bool = c124824v8.LIZIZ;
            if (bool != null) {
                z = bool.booleanValue();
            } else if (!LIZLLL.LJIIIZ()) {
                z = true;
            } else {
                z = false;
            }
            if (!c124824v8.LIZJ) {
                this.LJLJJL.pause();
                LIZLLL.setAbsSpeed(0.001f + absSpeed);
                LJJLIIIJ.setEndTime(LJJLIIIJ.getStartTime() + (((float) (LIZLLL.LJIIL() - LIZLLL.LJIILIIL())) / LIZLLL.getAbsSpeed()));
                if (LJJLIIIJ.getEndTime() > LJIIJJI) {
                    long endTime = ((float) (LJJLIIIJ.getEndTime() - LJIIJJI)) * absSpeed;
                    if (LIZLLL.LJIIL() > endTime) {
                        LIZLLL.LJIJJ(LIZLLL.LJIIL() - endTime);
                    }
                    LJJLIIIJ.setEndTime(LJIIJJI);
                }
                LIZLLL.LJIJI(!z);
                this.LJLIL.getKeyframeEditor().LJJJJLL(LJJLIIIJ);
                LJJJZ(enumC124724uy, null);
            }
            InterfaceC124814v7 interfaceC124814v7 = c124824v8.LIZLLL;
            if (interfaceC124814v7 != null) {
                interfaceC124814v7.LIZ(absSpeed, z);
            }
        }
    }

    @Override // X.InterfaceC125484wC
    public final NLETrackSlot LJJJJLI(C124844vA c124844vA, EnumC124724uy enumC124724uy) {
        String str = null;
        if (C152205yC.LIZ(c124844vA.LIZIZ) == null) {
            C131935Ft.LJFF("Invalid audio file path");
            return null;
        }
        NLETrack nLETrack = new NLETrack();
        nLETrack.LJJ(false);
        nLETrack.setLayer(c124844vA.LJIIJ);
        C124574uj.LJJLIIIJILLIZJL(nLETrack, "audio");
        nLETrack.LJIL(EnumC123864ta.AUDIO);
        nLETrack.setExtra("music_name", c124844vA.LIZ);
        NLETrackSlot LJJII = LJJII(c124844vA);
        if (LJJII == null) {
            return null;
        }
        nLETrack.LIZIZ(LJJII);
        List<NLETrack> LJII = C124574uj.LJII(r9());
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJII).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((NLETimeSpaceNode) next).getLayer() >= c124844vA.LJIIJ) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) it2.next();
                nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() + 1);
            }
        }
        String str2 = c124844vA.LJIILIIL;
        if (str2 != null) {
            nLETrack.setExtra("AudioTrackType", str2);
        }
        r9().addTrack(nLETrack);
        this.LJLIL.getMainTrack().LJJIFFI();
        if (o.LJ(c124844vA.LJIILIIL, "AUDIO_RECORD")) {
            str = C6YK.LIZ(new C139795eB(EnumC126814yL.ADD_RECORDED_AUDIO.getNameId(), null, null, null, null, 30));
        }
        LJJJZ(enumC124724uy, str);
        return LJJII;
    }

    @Override // X.InterfaceC125484wC
    public final NLETrackSlot LJJJLIIL(NLETrackSlot nLETrackSlot, C124844vA c124844vA, int i, EnumC124724uy enumC124724uy) {
        NLETrack trackBySlot;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        if (nLETrackSlot2 == null) {
            nLETrackSlot2 = LJJLIIIJ();
            trackBySlot = LJJLIIIIJ();
        } else {
            trackBySlot = C79057V0z.LJJI(this.LJLIL).getTrackBySlot(nLETrackSlot2);
        }
        if (trackBySlot == null || nLETrackSlot2 == null) {
            return null;
        }
        C124854vB LIZ = C152205yC.LIZ(c124844vA.LIZIZ);
        if (LIZ == null) {
            C131935Ft.LJFF("Invalid audio file path");
            return null;
        }
        VecNLETrackSlotSPtr LJIILLIIL = trackBySlot.LJIILLIIL();
        int i2 = LIZ.LIZ;
        int LJIILJJIL = trackBySlot.LJIILJJIL(nLETrackSlot2);
        if (LJIILLIIL.isEmpty() || LJIILJJIL < 0 || LJIILJJIL >= LJIILLIIL.size()) {
            return null;
        }
        NLETrackSlot nLETrackSlot3 = new NLETrackSlot();
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.LJIIJJI(c124844vA.LIZ);
        nLEResourceAV.LJIILIIL(EnumC123874tb.AUDIO);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = i2;
        nLEResourceAV.setDuration(timeUnit.toMicros(j));
        nLEResourceAV.LJIIIZ(c124844vA.LIZIZ);
        nLESegmentAudio.LJIILL(nLEResourceAV);
        C124574uj.LJJLIIIIJ(nLESegmentAudio);
        nLESegmentAudio.LJIJJLI(c124844vA.LJIIIIZZ);
        long j2 = c124844vA.LJIIIZ;
        if (j2 == 0) {
            j2 = timeUnit.toMicros(j);
        }
        nLESegmentAudio.LJIJJ(j2);
        nLESegmentAudio.LJIJI(false);
        nLETrackSlot3.LJIIL(nLESegmentAudio);
        nLETrackSlot3.setStartTime(c124844vA.LIZLLL);
        long j3 = c124844vA.LJ;
        if (j3 != 0) {
            nLETrackSlot3.setEndTime(j3);
        } else if (c124844vA.LJIIIZ - c124844vA.LJIIIIZZ > timeUnit.toMicros(j)) {
            nLETrackSlot3.setEndTime(timeUnit.toMicros(j) + c124844vA.LIZLLL);
        }
        String str = c124844vA.LIZJ;
        if (str != null) {
            nLETrackSlot3.setExtra("slot_extra_music_id", str);
        }
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue() || c124844vA.LJIIJJI) {
            long LIZLLL = C124574uj.LIZLLL(C79057V0z.LJJI(this.LJLIL));
            long endTime = nLETrackSlot3.getEndTime();
            long j4 = endTime - LIZLLL;
            if (endTime > LIZLLL) {
                nLETrackSlot3.setEndTime(LIZLLL);
                NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLETrackSlot3.LJI());
                if (LIZLLL2 != null) {
                    LIZLLL2.LJIJJ(LIZLLL2.LJIIL() - j4);
                }
            }
        }
        if (LJIILLIIL.size() == 1) {
            trackBySlot.LJIJJLI(nLETrackSlot2);
            trackBySlot.LIZIZ(nLETrackSlot3);
        } else if (LJIILJJIL == 0) {
            trackBySlot.LJIJJLI(nLETrackSlot2);
            trackBySlot.LIZIZ(nLETrackSlot3);
        } else {
            NLETrackSlot nLETrackSlot4 = LJIILLIIL.get(LJIILJJIL - 1);
            trackBySlot.LJIJJLI(nLETrackSlot2);
            trackBySlot.LIZJ(nLETrackSlot3, nLETrackSlot4);
        }
        trackBySlot.LJJIFFI();
        LJJJZ(enumC124724uy, null);
        return nLETrackSlot3;
    }
}
