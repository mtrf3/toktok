package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Bja, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29602Bja {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final EnumC29596BjU LIZLLL;
    public final EnumC29601BjZ LJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29602Bja(boolean z, int i, int i2, EnumC29596BjU dialogBizFirstlyEffectPanel) {
        this(z, i, i2, dialogBizFirstlyEffectPanel, EnumC29601BjZ.DIALOG_BIZ_OTHERS);
        o.LJIIIZ(dialogBizFirstlyEffectPanel, "dialogBizFirstlyEffectPanel");
    }

    public C29602Bja(boolean z, int i, int i2, EnumC29596BjU bizType, EnumC29601BjZ effectBizType) {
        o.LJIIIZ(bizType, "bizType");
        o.LJIIIZ(effectBizType, "effectBizType");
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = bizType;
        this.LJ = effectBizType;
    }
}
