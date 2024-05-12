package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.relation.label.AvatarUnionServiceImpl;
import com.ss.android.ugc.aweme.relation.label.IAvatarUnionService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCR implements MCS {
    public static final IAvatarUnionService LIZIZ;
    public static final MCQ LIZJ;
    public final /* synthetic */ MCS LIZ;

    @Override // X.MCS
    public final Bitmap LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.MCS
    public final AbstractC73672Svk<Bitmap> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.MCS
    public final AbstractC73672Svk<Bitmap> LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.MCS
    public final Bitmap LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    static {
        IAvatarUnionService iAvatarUnionService;
        Object LIZ = C58096Mr6.LIZ(IAvatarUnionService.class, false);
        if (LIZ != null) {
            iAvatarUnionService = (IAvatarUnionService) LIZ;
        } else {
            if (C58096Mr6.t4 == null) {
                synchronized (IAvatarUnionService.class) {
                    if (C58096Mr6.t4 == null) {
                        C58096Mr6.t4 = new AvatarUnionServiceImpl();
                    }
                }
            }
            iAvatarUnionService = C58096Mr6.t4;
        }
        o.LJIIIIZZ(iAvatarUnionService, "AvatarUnionService.get()");
        LIZIZ = iAvatarUnionService;
        LIZJ = new MCQ(C7MY.LIZIZ(18), C7MY.LIZIZ(2), (Integer) null, 3, 0.7f, 1.0f, R.attr.ck, R.attr.gu, (Boolean) null, EnumC86195XsF.NO_TAIL, false, true);
    }

    public MCR(Context context, C197267og c197267og, MCQ config) {
        boolean LIZIZ2;
        C197267og c197267og2 = c197267og;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        IAvatarUnionService iAvatarUnionService = LIZIZ;
        c197267og2 = c197267og2 == null ? new C197267og() : c197267og2;
        int i = config.LIZ;
        int i2 = config.LIZIZ;
        Integer num = config.LIZJ;
        int i3 = config.LIZLLL;
        float f = config.LJ;
        float f2 = config.LJFF;
        int i4 = config.LJI;
        int i5 = config.LJII;
        Boolean bool = config.LJIIIIZZ;
        if (bool != null) {
            LIZIZ2 = bool.booleanValue();
        } else {
            LIZIZ2 = C90193gN.LIZIZ(context);
        }
        this.LIZ = iAvatarUnionService.LIZ(context, c197267og2, i, i2, num, i3, f, f2, i4, i5, LIZIZ2, config.LJIIIZ, config.LJIIJ, config.LJIIJJI);
    }
}
