package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.ZdS, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public enum EnumC90374ZdS {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC90364ZdI.class, AbstractC90364ZdI.zzb),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class<?> LJLIL;
    public final Object LJLILLLLZI;

    public final Class<?> zza() {
        return this.LJLIL;
    }

    EnumC90374ZdS(Class cls, Object obj) {
        this.LJLIL = cls;
        this.LJLILLLLZI = obj;
    }
}
