package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.interaction.PinResponse;
import webcast.data.InteractionConflict;
import webcast.data.InteractionConflictItem;

/* loaded from: classes6.dex */
public final class CSM<T> implements InterfaceC006400u {
    public final /* synthetic */ PinResponse LJLIL;

    public CSM(PinResponse pinResponse) {
        this.LJLIL = pinResponse;
    }

    @Override // X.InterfaceC006400u
    public final boolean LIZJ(InterfaceC31355CSh interceptor) {
        InteractionConflict interactionConflict;
        List<InteractionConflictItem> list;
        o.LJIIIZ(interceptor, "interceptor");
        PinResponse.ResponseData responseData = this.LJLIL.data;
        if (responseData != null && (interactionConflict = responseData.interactionConflict) != null && (list = interactionConflict.conflictlist) != null) {
            Iterator<InteractionConflictItem> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InteractionConflictItem next = it.next();
                int i = next.itemtype;
                interceptor.LIZLLL();
                if (i == 15) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
