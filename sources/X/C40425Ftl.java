package X;

import android.app.Activity;
import com.bytedance.poplayer.core.PopupManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Ftl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40425Ftl<TTaskResult, TContinuationResult> implements C10I {
    public static final C40425Ftl<TTaskResult, TContinuationResult> LIZ = new C40425Ftl<>();

    @Override // X.C10I
    public final Object then(C10K c10k) {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            Boolean shouldShow = (Boolean) c10k.LJIIJJI();
            o.LJIIIIZZ(shouldShow, "shouldShow");
            if (shouldShow.booleanValue()) {
                PopupManager.LJIIL(new C40431Ftr(new C40427Ftn(LJIIIIZZ)));
                return null;
            }
            return null;
        }
        return null;
    }
}
