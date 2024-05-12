package X;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.io.IOException;
import kotlin.jvm.internal.AqS168S0100000_2;

/* renamed from: X.WNf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82183WNf implements C56D {
    public volatile boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C82186WNi.LJLIL);
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJ = C56I.LJLIL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJFF = C56H.LJLIL;

    public final MediaPlayer LJ() {
        return (MediaPlayer) this.LIZ.getValue();
    }

    @Override // X.C56D
    public final void pause() {
        if (this.LIZIZ) {
            if (LJ().isPlaying() || this.LIZJ) {
                LJ().pause();
                this.LIZLLL = LJ().getCurrentPosition();
                this.LJFF.invoke(Boolean.TRUE);
            }
        }
    }

    @Override // X.C56D
    public final void start() {
        if (this.LIZIZ) {
            LJ().seekTo(this.LIZLLL);
            LJ().start();
            this.LJ.invoke(Boolean.TRUE);
            this.LIZJ = false;
        }
    }

    @Override // X.C56D
    public final int LJZL() {
        return LJ().getCurrentPosition();
    }

    @Override // X.C56D
    public final void release() {
        if (LJ().isPlaying()) {
            LJ().stop();
            this.LJFF.invoke(Boolean.TRUE);
        }
        this.LIZIZ = false;
        LJ().release();
    }

    @Override // X.C56D
    public final void LIZ(int i) {
        this.LIZLLL = i;
    }

    @Override // X.C56D
    public final void LIZIZ(AqS168S0100000_2 aqS168S0100000_2) {
        this.LJFF = aqS168S0100000_2;
    }

    @Override // X.C56D
    public final void LIZJ(NLETrackSlot nLETrackSlot) {
        NLEResourceNode LIZIZ;
        String LIZJ;
        if (!C124574uj.LJJIJL(nLETrackSlot)) {
            return;
        }
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
        if (LIZLLL != null) {
            long LJIILIIL = LIZLLL.LJIILIIL();
            this.LIZLLL = C78926UyI.LJJIZ(LJIILIIL);
            C78926UyI.LJJIZ(LJIILIIL);
            C78926UyI.LJJIZ(LIZLLL.LJIIL());
        }
        try {
            System.currentTimeMillis();
            NLESegment LJI = nLETrackSlot.LJI();
            if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null && (LIZJ = LIZIZ.LIZJ()) != null) {
                MediaPlayer LJ = LJ();
                LJ.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
                LJ.setDataSource(LIZJ);
                LJ.prepareAsync();
                LJ.setOnPreparedListener(new C82184WNg(this));
                LJ.setOnCompletionListener(new C82185WNh(this));
            }
        } catch (IOException e) {
            H7C.LIZLLL(C5HV.LIZIZ, null, "MediaPlayer prepare fail", e, 2);
        } catch (IllegalArgumentException e2) {
            H7C.LIZLLL(C5HV.LIZIZ, null, "MediaPlayer prepare fail", e2, 2);
        }
    }

    @Override // X.C56D
    public final void LIZLLL(AqS168S0100000_2 aqS168S0100000_2) {
        this.LJ = aqS168S0100000_2;
    }
}
