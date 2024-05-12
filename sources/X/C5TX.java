package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5TX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TX extends F9E {
    public final C08630Vn<List<OSZ<Long, Float>>> LJLIL;
    public final C08630Vn<List<Float>> LJLILLLLZI;
    public final int LJLJI;
    public final C08630Vn<Boolean> LJLJJI;
    public final C08630Vn<AudioRecorderParam> LJLJJL;
    public final C08630Vn<Boolean> LJLJJLL;
    public final C08630Vn<Boolean> LJLJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5TX() {
        /*
            r2 = this;
            r1 = 0
            r0 = 127(0x7f, float:1.78E-43)
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5TX.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C5TX(X.C08630Vn r9, X.C08630Vn r10, int r11) {
        /*
            r8 = this;
            r5 = r9
            r6 = r10
            r0 = r11 & 1
            r7 = 0
            if (r0 == 0) goto L5e
            X.0Vn r1 = new X.0Vn
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.<init>(r0)
        L11:
            r0 = r11 & 2
            if (r0 == 0) goto L5c
            X.0Vn r2 = new X.0Vn
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.<init>(r0)
        L1f:
            r0 = r11 & 4
            if (r0 == 0) goto L5a
            r3 = 4
        L24:
            r0 = r11 & 8
            if (r0 == 0) goto L58
            X.0Vn r4 = new X.0Vn
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.<init>(r0)
        L2f:
            r0 = r11 & 16
            if (r0 == 0) goto L3d
            X.0Vn r5 = new X.0Vn
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = new com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam
            r0.<init>()
            r5.<init>(r0)
        L3d:
            r0 = r11 & 32
            if (r0 == 0) goto L48
            X.0Vn r6 = new X.0Vn
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.<init>(r0)
        L48:
            r0 = r11 & 64
            if (r0 == 0) goto L53
            X.0Vn r7 = new X.0Vn
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.<init>(r0)
        L53:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L58:
            r4 = r7
            goto L2f
        L5a:
            r3 = 0
            goto L24
        L5c:
            r2 = r7
            goto L1f
        L5e:
            r1 = r7
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5TX.<init>(X.0Vn, X.0Vn, int):void");
    }

    public C5TX(C08630Vn<List<OSZ<Long, Float>>> originWavePoints, C08630Vn<List<Float>> recordWavePoints, int i, C08630Vn<Boolean> play, C08630Vn<AudioRecorderParam> audioRecorderParam, C08630Vn<Boolean> needOriginalSoundState, C08630Vn<Boolean> updateVideo) {
        o.LJIIIZ(originWavePoints, "originWavePoints");
        o.LJIIIZ(recordWavePoints, "recordWavePoints");
        o.LJIIIZ(play, "play");
        o.LJIIIZ(audioRecorderParam, "audioRecorderParam");
        o.LJIIIZ(needOriginalSoundState, "needOriginalSoundState");
        o.LJIIIZ(updateVideo, "updateVideo");
        this.LJLIL = originWavePoints;
        this.LJLILLLLZI = recordWavePoints;
        this.LJLJI = i;
        this.LJLJJI = play;
        this.LJLJJL = audioRecorderParam;
        this.LJLJJLL = needOriginalSoundState;
        this.LJLJL = updateVideo;
    }

    public static C5TX L(C5TX c5tx, C08630Vn c08630Vn, int i, C08630Vn c08630Vn2, C08630Vn c08630Vn3, C08630Vn c08630Vn4, C08630Vn c08630Vn5, int i2) {
        C08630Vn<List<Float>> recordWavePoints;
        C08630Vn updateVideo = c08630Vn5;
        C08630Vn needOriginalSoundState = c08630Vn4;
        C08630Vn audioRecorderParam = c08630Vn3;
        C08630Vn play = c08630Vn2;
        C08630Vn originWavePoints = c08630Vn;
        int i3 = i;
        if ((i2 & 1) != 0) {
            originWavePoints = c5tx.LJLIL;
        }
        if ((i2 & 2) != 0) {
            recordWavePoints = c5tx.LJLILLLLZI;
        } else {
            recordWavePoints = null;
        }
        if ((i2 & 4) != 0) {
            i3 = c5tx.LJLJI;
        }
        if ((i2 & 8) != 0) {
            play = c5tx.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            audioRecorderParam = c5tx.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            needOriginalSoundState = c5tx.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            updateVideo = c5tx.LJLJL;
        }
        c5tx.getClass();
        o.LJIIIZ(originWavePoints, "originWavePoints");
        o.LJIIIZ(recordWavePoints, "recordWavePoints");
        o.LJIIIZ(play, "play");
        o.LJIIIZ(audioRecorderParam, "audioRecorderParam");
        o.LJIIIZ(needOriginalSoundState, "needOriginalSoundState");
        o.LJIIIZ(updateVideo, "updateVideo");
        return new C5TX(originWavePoints, recordWavePoints, i3, play, audioRecorderParam, needOriginalSoundState, updateVideo);
    }
}
