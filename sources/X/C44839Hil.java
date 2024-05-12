package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.vesdk.VEConfigCenter;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hil, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44839Hil {
    public final C62822Ol8 LIZ;
    public final C44840Him LIZIZ;

    public static java.util.Map LIZIZ() {
        HashMap hashMap = new HashMap();
        java.util.Map<String, VEConfigCenter.ValuePkt> configs = VEConfigCenter.getInstance().getConfigs();
        o.LJIIIIZZ(configs, "getInstance().configs");
        for (Map.Entry<String, VEConfigCenter.ValuePkt> entry : configs.entrySet()) {
            if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey())) {
                String key = entry.getKey();
                o.LJIIIIZZ(key, "it.key");
                String key2 = entry.getKey();
                o.LJIIIIZZ(key2, "it.key");
                VEConfigCenter.ValuePkt value = entry.getValue();
                o.LJIIIIZZ(value, "it.value");
                hashMap.put(key, new C44841Hin(key2, value));
            }
        }
        return hashMap;
    }

    public final C44840Him LIZJ() {
        return (C44840Him) this.LIZ.getValue();
    }

    public C44839Hil(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = C221108m2.LIZIZ(new AqS157S0100000_7(context, 156));
        this.LIZIZ = new C44840Him(F9J.LIZIZ(context, 0, "av_ab_vesdk.xml"));
    }

    public final OSZ<Object, Integer> LIZ(InterfaceC44844Hiq property) {
        boolean z;
        boolean booleanValue;
        Object valueOf;
        o.LJIIIZ(property, "property");
        GXW.LIZJ();
        C44840Him c44840Him = this.LIZIZ;
        EnumC44843Hip type = property.type();
        if (type != null) {
            int i = C44842Hio.LIZ[type.ordinal()];
            int i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                valueOf = c44840Him.LJ(property);
                            }
                        } else {
                            valueOf = Float.valueOf(c44840Him.LIZIZ(property));
                        }
                    } else {
                        valueOf = Long.valueOf(c44840Him.LIZLLL(property));
                    }
                } else {
                    valueOf = Integer.valueOf(c44840Him.LIZJ(property));
                }
            } else {
                synchronized (c44840Him) {
                    if (property.type() == EnumC44843Hip.Boolean) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C76917UGr.LJ(z);
                    Boolean bool = (Boolean) c44840Him.LIZIZ.getOrDefault(property.key(), null);
                    if (bool == null) {
                        property.LIZIZ();
                        bool = Boolean.valueOf(c44840Him.LIZ.getBoolean(property.key(), ((Boolean) property.LIZ()).booleanValue()));
                        c44840Him.LIZIZ.put(property.key(), bool);
                    }
                    booleanValue = bool.booleanValue();
                }
                valueOf = Boolean.valueOf(booleanValue);
            }
            o.LJIIIIZZ(valueOf, "when (property.type()) {…perty(property)\n        }");
            if (this.LIZIZ.LIZ(property)) {
                i2 = 1;
            }
            return new OSZ<>(valueOf, Integer.valueOf(i2));
        }
        throw new C162476Zf();
    }
}
