package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6jx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC168856jx implements InterfaceC168706ji {
    public boolean LJ() {
        return true;
    }

    public abstract Object LJFF(InterfaceC67352kd<? super List<DraftFileRestoreResult>> interfaceC67352kd);

    @Override // X.InterfaceC168706ji
    public final Object LIZIZ(InterfaceC67352kd<? super List<DraftFileRestoreResult>> interfaceC67352kd) {
        boolean z;
        if (LJ()) {
            getParams();
            try {
                z = C2NU.LIZ.LIZIZ();
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                final String str = "";
                return C47261Igj.LJII(C168716jj.LIZ(this, new Integer(R.string.eza), true, new DraftFileRestoreException(-3004, new RuntimeException(str) { // from class: X.6jy
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(str);
                        o.LJIIIZ(str, "msg");
                    }
                })));
            }
        }
        return LJFF(interfaceC67352kd);
    }

    @Override // X.InterfaceC168706ji
    public DraftFileRestoreResult LIZJ(Integer num, boolean z, DraftFileRestoreException draftFileRestoreException) {
        return C168716jj.LIZ(this, num, z, draftFileRestoreException);
    }
}
