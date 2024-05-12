package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.CrJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32629CrJ {
    public final EnumC32626CrG LIZ;
    public final ImageModel LIZIZ;
    public final long LIZJ;
    public final Integer LIZLLL;
    public final Long LJ;

    public /* synthetic */ C32629CrJ(EnumC32626CrG enumC32626CrG, ImageModel imageModel, long j) {
        this(enumC32626CrG, imageModel, j, 0, 0L);
    }

    public C32629CrJ(EnumC32626CrG reason, ImageModel imageModel, long j, Integer num, Long l) {
        o.LJIIIZ(reason, "reason");
        this.LIZ = reason;
        this.LIZIZ = imageModel;
        this.LIZJ = j;
        this.LIZLLL = num;
        this.LJ = l;
    }
}
