package X;

import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CT9<T> implements InterfaceC31400CUa {
    public static final CT9<T> LIZ = new CT9<>();

    @Override // X.InterfaceC31400CUa
    public final int LIZ(Object obj) {
        CQO it = (CQO) obj;
        o.LJIIIZ(it, "it");
        if (((GiftCollectionUpdateMessage) it.LJIJJLI).giftCollection.messageType == 2) {
            return 0;
        }
        return 1;
    }
}
