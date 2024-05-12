package X;

import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.ss.android.ugc.aweme.relation.usercard.spi.RelationUserCardInternalService;
import kotlin.jvm.internal.o;

/* renamed from: X.MoQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57930MoQ {
    public static final /* synthetic */ C57930MoQ LIZ = new C57930MoQ();

    public static IRelationUserCardInternalService LIZ() {
        IRelationUserCardInternalService iRelationUserCardInternalService;
        Object LIZ2 = C58096Mr6.LIZ(IRelationUserCardInternalService.class, false);
        if (LIZ2 != null) {
            iRelationUserCardInternalService = (IRelationUserCardInternalService) LIZ2;
        } else {
            if (C58096Mr6.z4 == null) {
                synchronized (IRelationUserCardInternalService.class) {
                    if (C58096Mr6.z4 == null) {
                        C58096Mr6.z4 = new RelationUserCardInternalService();
                    }
                }
            }
            iRelationUserCardInternalService = C58096Mr6.z4;
        }
        o.LJIIIIZZ(iRelationUserCardInternalService, "get().getService(IRelati…ernalService::class.java)");
        return iRelationUserCardInternalService;
    }
}
