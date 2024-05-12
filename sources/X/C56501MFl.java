package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.MFl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56501MFl implements InterfaceC74183T9n {
    @Override // X.InterfaceC74183T9n
    public final void LIZ(Effect targetEffect, String creationId) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(targetEffect, "targetEffect");
        HT5.LIZ = true;
        HT5.LIZJ(true);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("shoot_way", "collection_prop");
        c188727au.LJIIIZ("prop_id", targetEffect.getEffectId());
        c188727au.LJIIIZ("enter_from", "prop_collection");
        c188727au.LIZLLL(HT5.LIZ(), "favorite_scene");
        FMX.LJIIL("shoot", c188727au.LIZ);
    }
}
