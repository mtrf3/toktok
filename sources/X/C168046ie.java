package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import kotlin.jvm.internal.o;

/* renamed from: X.6ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168046ie extends F9E {
    public final C08630Vn<Boolean> LJLIL;
    public final C08630Vn<Boolean> LJLILLLLZI;
    public final C08630Vn<AudioRecorderParam> LJLJI;
    public final C08630Vn<AudioRecorderParam> LJLJJI;
    public final C08630Vn<Boolean> LJLJJL;

    public C168046ie() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C168046ie(int r8) {
        /*
            r7 = this;
            X.0Vn r2 = new X.0Vn
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2.<init>(r1)
            X.0Vn r3 = new X.0Vn
            r3.<init>(r1)
            X.0Vn r4 = new X.0Vn
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = new com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam
            r0.<init>()
            r4.<init>(r0)
            X.0Vn r5 = new X.0Vn
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = new com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam
            r0.<init>()
            r5.<init>(r0)
            X.0Vn r6 = new X.0Vn
            r6.<init>(r1)
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168046ie.<init>(int):void");
    }

    public C168046ie(C08630Vn<Boolean> play, C08630Vn<Boolean> cancelChanged, C08630Vn<AudioRecorderParam> updateRecord, C08630Vn<AudioRecorderParam> initRecord, C08630Vn<Boolean> clickToShow) {
        o.LJIIIZ(play, "play");
        o.LJIIIZ(cancelChanged, "cancelChanged");
        o.LJIIIZ(updateRecord, "updateRecord");
        o.LJIIIZ(initRecord, "initRecord");
        o.LJIIIZ(clickToShow, "clickToShow");
        this.LJLIL = play;
        this.LJLILLLLZI = cancelChanged;
        this.LJLJI = updateRecord;
        this.LJLJJI = initRecord;
        this.LJLJJL = clickToShow;
    }

    public static C168046ie L(C168046ie c168046ie, C08630Vn c08630Vn, C08630Vn c08630Vn2, C08630Vn c08630Vn3, C08630Vn c08630Vn4, int i) {
        C08630Vn<Boolean> cancelChanged;
        C08630Vn clickToShow = c08630Vn4;
        C08630Vn initRecord = c08630Vn3;
        C08630Vn play = c08630Vn;
        C08630Vn updateRecord = c08630Vn2;
        if ((i & 1) != 0) {
            play = c168046ie.LJLIL;
        }
        if ((i & 2) != 0) {
            cancelChanged = c168046ie.LJLILLLLZI;
        } else {
            cancelChanged = null;
        }
        if ((i & 4) != 0) {
            updateRecord = c168046ie.LJLJI;
        }
        if ((i & 8) != 0) {
            initRecord = c168046ie.LJLJJI;
        }
        if ((i & 16) != 0) {
            clickToShow = c168046ie.LJLJJL;
        }
        c168046ie.getClass();
        o.LJIIIZ(play, "play");
        o.LJIIIZ(cancelChanged, "cancelChanged");
        o.LJIIIZ(updateRecord, "updateRecord");
        o.LJIIIZ(initRecord, "initRecord");
        o.LJIIIZ(clickToShow, "clickToShow");
        return new C168046ie(play, cancelChanged, updateRecord, initRecord, clickToShow);
    }
}
