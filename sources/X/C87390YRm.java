package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.YRm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87390YRm extends F9E {
    public final IMessage LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public /* synthetic */ C87390YRm(IMessage iMessage, boolean z, int i) {
        this(iMessage, (i & 2) != 0 ? false : z, false, false);
    }

    public C87390YRm(IMessage message, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(message, "message");
        this.LJLIL = message;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
    }
}
