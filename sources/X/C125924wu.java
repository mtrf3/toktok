package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125924wu extends F9E {
    public final NLETrackSlot LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;
    public final boolean LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL), Long.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL)};
    }

    public C125924wu(int i, int i2, NLETrackSlot nleTrackSlot, long j, long j2, long j3, boolean z) {
        o.LJIIIZ(nleTrackSlot, "nleTrackSlot");
        this.LJLIL = nleTrackSlot;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = j3;
        this.LJLJL = z;
    }
}
