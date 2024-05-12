package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHM extends F9E {
    public final /* synthetic */ int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
            default:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
        }
    }

    public HHM(String audioRecordWorkSpace, String originSoundDir, int i) {
        this.LJLIL = i;
        if (i != 1) {
            this.LJLILLLLZI = audioRecordWorkSpace;
            this.LJLJI = originSoundDir;
        } else {
            o.LJIIIZ(audioRecordWorkSpace, "audioRecordWorkSpace");
            o.LJIIIZ(originSoundDir, "originSoundDir");
            this.LJLILLLLZI = audioRecordWorkSpace;
            this.LJLJI = originSoundDir;
        }
    }
}
