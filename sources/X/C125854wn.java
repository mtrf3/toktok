package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125854wn extends F9E {
    public final NLETrackSlot LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI)};
    }

    public C125854wn(NLETrackSlot slot, long j, long j2) {
        o.LJIIIZ(slot, "slot");
        this.LJLIL = slot;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
