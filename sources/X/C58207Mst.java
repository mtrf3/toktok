package X;

import com.ss.android.elearning.lingo.lynx.ILynxService;
import com.ss.android.elearning.lingo.lynx.LingoLynxImpl;
import java.util.List;

/* renamed from: X.Mst, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58207Mst implements ILynxService {
    public static final C58207Mst LIZIZ = new C58207Mst();
    public final /* synthetic */ ILynxService LIZ;

    @Override // com.ss.android.elearning.lingo.lynx.ILynxService
    public final List<C40197Fq5> LIZ() {
        return this.LIZ.LIZ();
    }

    public C58207Mst() {
        ILynxService iLynxService;
        Object LIZ = C58096Mr6.LIZ(ILynxService.class, false);
        if (LIZ != null) {
            iLynxService = (ILynxService) LIZ;
        } else {
            if (C58096Mr6.LJJJJI == null) {
                synchronized (ILynxService.class) {
                    if (C58096Mr6.LJJJJI == null) {
                        C58096Mr6.LJJJJI = new LingoLynxImpl();
                    }
                }
            }
            iLynxService = C58096Mr6.LJJJJI;
        }
        this.LIZ = iLynxService;
    }
}
