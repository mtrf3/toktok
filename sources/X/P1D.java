package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStatusStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class P1D extends AbstractC65781Prl implements InterfaceC88472Yns<AutoReplyStatusStruct, C9Z3> {
    public static final P1D LJLIL = new P1D();

    public P1D() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C9Z3 invoke(AutoReplyStatusStruct autoReplyStatusStruct) {
        AutoReplyStatusStruct it = autoReplyStatusStruct;
        o.LJIIIZ(it, "it");
        long j = it.replyId;
        int i = it.reviewStatus;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return null;
                    }
                }
            }
        }
        return new C9Z3(i2, it.keyword, it.content, j, it.reviewReason);
    }
}
