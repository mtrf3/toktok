package X;

import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C23 extends F9E {
    public final CohostTopic LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    public C23() {
        this(new CohostTopic(), false, 1);
    }

    public C23(CohostTopic cohostTopic, boolean z, int i) {
        o.LJIIIZ(cohostTopic, "cohostTopic");
        this.LJLIL = cohostTopic;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }
}
