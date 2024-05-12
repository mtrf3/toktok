package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4vT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125034vT extends F9E {
    public final NLETrackSlot LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final EnumC124724uy LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C125034vT(NLETrackSlot slot, long j, long j2, EnumC124724uy commitLevel) {
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(commitLevel, "commitLevel");
        this.LJLIL = slot;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = commitLevel;
    }
}
