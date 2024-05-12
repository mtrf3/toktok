package X;

import com.bytedance.im.core.proto.MessageCheckInfoV2;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OuP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63397OuP extends F9E {
    public final List<MessageCheckInfoV2> LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public C63397OuP(List<MessageCheckInfoV2> msgCheckInfoList, int i, boolean z) {
        o.LJIIIZ(msgCheckInfoList, "msgCheckInfoList");
        this.LJLIL = msgCheckInfoList;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }
}
