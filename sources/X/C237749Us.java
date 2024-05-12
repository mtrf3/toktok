package X;

import com.ss.android.ugc.aweme.feed.prompt.api.Instruction;
import kotlin.jvm.internal.o;

/* renamed from: X.9Us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237749Us extends F9E {
    public final Instruction LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C237749Us(Instruction instruction) {
        o.LJIIIZ(instruction, "instruction");
        this.LJLIL = instruction;
        this.LJLILLLLZI = false;
    }
}
