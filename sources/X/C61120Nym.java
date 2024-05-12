package X;

import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import kotlin.jvm.internal.o;

/* renamed from: X.Nym, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61120Nym extends AbstractC61103NyV {
    @Override // X.AbstractC61103NyV
    public final void LIZIZ(C61101NyT c61101NyT, C164906da... permissionsStatus) {
        o.LJIIIZ(permissionsStatus, "permissionsStatus");
        try {
            try {
                for (C164906da c164906da : permissionsStatus) {
                    PermissionCache.LJLILLLLZI.remove(c164906da.LIZ);
                }
            } catch (Exception unused) {
                PermissionCache.LJLILLLLZI.clear();
                if (c61101NyT == null) {
                }
            }
        } finally {
            if (c61101NyT != null) {
                c61101NyT.LIZIZ();
            }
        }
    }
}
