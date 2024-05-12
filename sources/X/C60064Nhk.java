package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nhk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60064Nhk {
    public static EnumC60063Nhj LIZ(String str) {
        for (EnumC60063Nhj enumC60063Nhj : EnumC60063Nhj.values()) {
            if (o.LJ(str, enumC60063Nhj.getVALUE())) {
                return enumC60063Nhj;
            }
        }
        return EnumC60063Nhj.AUTO;
    }
}
