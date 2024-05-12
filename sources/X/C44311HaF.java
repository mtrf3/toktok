package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HaF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44311HaF implements InterfaceC74183T9n {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC74183T9n
    public final void LIZ(Effect targetEffect, String creationId) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(targetEffect, "targetEffect");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("shoot_way", "profile_prop");
        c188727au.LJIIIZ("shoot_entrance", "profile_prop");
        c188727au.LJIIIZ("enter_from", this.LIZ);
        c188727au.LJIIIZ("prop_id", targetEffect.getEffectId());
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("author_id", this.LIZIZ);
        c188727au.LJIIIZ("group_id", this.LIZJ);
        FMX.LJIIL("shoot", c188727au.LIZ);
    }

    public C44311HaF(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
