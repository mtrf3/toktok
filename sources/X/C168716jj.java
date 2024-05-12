package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import kotlin.jvm.internal.o;

/* renamed from: X.6jj */
/* loaded from: classes3.dex */
public final class C168716jj {
    public static DraftFileRestoreResult LIZ(InterfaceC168706ji interfaceC168706ji, Integer num, boolean z, DraftFileRestoreException restoreException) {
        o.LJIIIZ(restoreException, "restoreException");
        return new DraftFileRestoreResult(interfaceC168706ji.LIZ(), interfaceC168706ji.getPriority(), num, z, restoreException);
    }

    public static /* synthetic */ DraftFileRestoreResult LIZIZ(InterfaceC168706ji interfaceC168706ji, Integer num, DraftFileRestoreException draftFileRestoreException, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            draftFileRestoreException = new DraftFileRestoreException(0, null, 3, null);
        }
        return interfaceC168706ji.LIZJ(num, false, draftFileRestoreException);
    }
}
