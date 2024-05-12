package X;

import com.bytedance.ies.nle.editor_jni.NLEAlgorithmPath;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS40S1000000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5I9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5I9 {
    public final ActivityC45651qj LIZ;
    public final C5I4 LIZIZ;
    public AVMusic LIZJ;
    public final C45779Hxv LIZLLL;
    public final ArrayList<AVMusic> LJ;
    public final List<C10H> LJFF;
    public final C62822Ol8 LJI;

    public final EditorProContext LIZ() {
        return (EditorProContext) this.LJI.getValue();
    }

    public C5I9(C29S activity, C5I4 musicController) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(musicController, "musicController");
        this.LIZ = activity;
        this.LIZIZ = musicController;
        C45779Hxv c45779Hxv = new C45779Hxv();
        this.LIZLLL = c45779Hxv;
        this.LJ = new ArrayList<>();
        this.LJFF = new ArrayList();
        this.LJI = C221108m2.LIZIZ(C123494sz.LJLIL);
        c45779Hxv.LIZ = new C5IN() { // from class: X.5IU
            @Override // X.C5IN
            public final int LIZ(String audioPath, int i, int i2, VEAlgorithmPath veAlgorithmPath) {
                String str;
                o.LJIIIZ(audioPath, "audioPath");
                o.LJIIIZ(veAlgorithmPath, "veAlgorithmPath");
                C133795Mx Y8 = C5I9.this.LIZ().getNleSession().Y8();
                NLEAlgorithmPath nLEAlgorithmPath = new NLEAlgorithmPath();
                String veBeatsPath = veAlgorithmPath.getVeBeatsPath();
                String str2 = "";
                if (veBeatsPath == null) {
                    veBeatsPath = "";
                }
                NLEMediaJniJNI.NLEAlgorithmPath_beatsPath_set(nLEAlgorithmPath.LIZ, nLEAlgorithmPath, veBeatsPath);
                String downBeatsPath = veAlgorithmPath.getDownBeatsPath();
                if (downBeatsPath == null) {
                    downBeatsPath = "";
                }
                NLEMediaJniJNI.NLEAlgorithmPath_downBeatsPath_set(nLEAlgorithmPath.LIZ, nLEAlgorithmPath, downBeatsPath);
                String noStrengthBeatsPath = veAlgorithmPath.getNoStrengthBeatsPath();
                if (noStrengthBeatsPath == null) {
                    noStrengthBeatsPath = "";
                }
                NLEMediaJniJNI.NLEAlgorithmPath_noStrengthBeatsPath_set(nLEAlgorithmPath.LIZ, nLEAlgorithmPath, noStrengthBeatsPath);
                String onlineBeatsPath = veAlgorithmPath.getOnlineBeatsPath();
                if (onlineBeatsPath == null) {
                    onlineBeatsPath = "";
                }
                NLEMediaJniJNI.NLEAlgorithmPath_onlineBeatsPath_set(nLEAlgorithmPath.LIZ, nLEAlgorithmPath, onlineBeatsPath);
                String manMadePath = veAlgorithmPath.getManMadePath();
                if (manMadePath != null) {
                    str2 = manMadePath;
                }
                NLEMediaJniJNI.NLEAlgorithmPath_manMadePath_set(nLEAlgorithmPath.LIZ, nLEAlgorithmPath, str2);
                NLEMediaJniJNI.NLEAlgorithmPath_mode_set(nLEAlgorithmPath.LIZ, nLEAlgorithmPath, veAlgorithmPath.getMode());
                NLEMediaJniJNI.NLEAlgorithmPath_type_set(nLEAlgorithmPath.LIZ, nLEAlgorithmPath, veAlgorithmPath.getType());
                int LJIIZILJ = Y8.LJIIZILJ(audioPath, i, i2, nLEAlgorithmPath);
                NLETrack LJIJI = C32151Nz.LJIJI(C5I9.this.LIZ());
                if (LJIJI != null) {
                    C5I9 c5i9 = C5I9.this;
                    LJIJI.setExtra("AudioTrackType", "BGM");
                    Iterator<NLETrackSlot> it = LJIJI.LJIILLIIL().iterator();
                    while (it.hasNext()) {
                        NLETrackSlot next = it.next();
                        NLESegment LJI = next.LJI();
                        o.LJIIIIZZ(LJI, "it.mainSegment");
                        C124574uj.LJJLIIIIJ(LJI);
                        NLEResourceNode LIZIZ = NLESegmentAudio.LIZLLL(next.LJI()).LIZIZ();
                        AVMusic aVMusic = c5i9.LIZJ;
                        if (aVMusic != null) {
                            str = aVMusic.musicName;
                        } else {
                            str = null;
                        }
                        LIZIZ.LJIIJJI(str);
                        NLEResourceNode LIZIZ2 = NLESegmentAudio.LIZLLL(next.LJI()).LIZIZ();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        AqS40S1000000_2 aqS40S1000000_2 = new AqS40S1000000_2(audioPath, 3);
                        C130855Bp c130855Bp = C152205yC.LIZJ.get(audioPath);
                        if (c130855Bp == null) {
                            c130855Bp = (C130855Bp) aqS40S1000000_2.invoke();
                        }
                        LIZIZ2.setDuration(timeUnit.toMicros(c130855Bp.LJLIL));
                    }
                }
                C79057V0z.LJIIL(C5I9.this.LIZ());
                return LJIIZILJ;
            }
        };
    }
}
