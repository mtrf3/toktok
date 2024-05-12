package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes16.dex */
public enum YPL {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC87134YHq.class, AbstractC87134YHq.zzb),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class LJLIL;
    public final Object LJLILLLLZI;

    public final Class zza() {
        return this.LJLIL;
    }

    YPL(Class cls, Object obj) {
        this.LJLIL = cls;
        this.LJLILLLLZI = obj;
    }
}
