package X;

import android.content.Context;
import com.ss.android.ugc.aweme.enter.IEnterProfileService;
import com.ss.android.ugc.aweme.utils.EnterProfileServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.4X1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4X1 implements InterfaceC110914Wx {
    public static final IEnterProfileService LIZIZ;
    public final /* synthetic */ InterfaceC110914Wx LIZ;

    @Override // X.InterfaceC110914Wx
    public final InterfaceC110914Wx LIZ(java.util.Map<String, ? extends Object> map) {
        return this.LIZ.LIZ(map);
    }

    @Override // X.InterfaceC110914Wx
    public final InterfaceC110914Wx LIZIZ(java.util.Map<String, ? extends Object> map) {
        return this.LIZ.LIZIZ(map);
    }

    @Override // X.InterfaceC110914Wx
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    static {
        IEnterProfileService iEnterProfileService;
        Object LIZ = C58096Mr6.LIZ(IEnterProfileService.class, false);
        if (LIZ != null) {
            iEnterProfileService = (IEnterProfileService) LIZ;
        } else {
            if (C58096Mr6.S7 == null) {
                synchronized (IEnterProfileService.class) {
                    if (C58096Mr6.S7 == null) {
                        C58096Mr6.S7 = new EnterProfileServiceImpl();
                    }
                }
            }
            iEnterProfileService = C58096Mr6.S7;
        }
        o.LJIIIIZZ(iEnterProfileService, "get().getService(IEnterProfileService::class.java)");
        LIZIZ = iEnterProfileService;
    }

    public C4X1(Context context, String enterFrom, String str, String str2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = LIZIZ.LIZ(context, enterFrom, str, str2);
    }
}
