package com.ss.android.ugc.aweme.property;

import X.C44172HVg;
import X.C44839Hil;
import X.C44840Him;
import X.C44842Hio;
import X.EnumC44843Hip;
import X.InterfaceC44844Hiq;
import X.OSZ;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.services.IVEABService;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VEABServiceImpl implements IVEABService {
    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final void clearPanel() {
        C44840Him LIZJ = C44172HVg.LJJII.LIZJ();
        synchronized (LIZJ) {
            LIZJ.LIZIZ.clear();
            LIZJ.LIZ.edit().clear().apply();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final Map<String, InterfaceC44844Hiq> getVESDKABPropertyMap() {
        C44172HVg.LJJII.getClass();
        return C44839Hil.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final OSZ<Object, Integer> getABValue(InterfaceC44844Hiq property) {
        o.LJIIIZ(property, "property");
        return C44172HVg.LJJII.LIZ(property);
    }

    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final void setABPanelValue(InterfaceC44844Hiq property, String str) {
        o.LJIIIZ(property, "property");
        C44839Hil c44839Hil = C44172HVg.LJJII;
        c44839Hil.getClass();
        if (str == null) {
            C44840Him LIZJ = c44839Hil.LIZJ();
            synchronized (LIZJ) {
                LIZJ.LIZIZ.remove(property.key());
                property.LIZIZ();
                LIZJ.LIZ.edit().remove(property.key()).apply();
            }
            return;
        }
        EnumC44843Hip type = property.type();
        if (type != null) {
            int i = C44842Hio.LIZ[type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                c44839Hil.LIZJ().LJIIIZ(property, str);
                                return;
                            }
                            return;
                        }
                        c44839Hil.LIZJ().LJI(property, CastFloatProtector.parseFloat(str));
                        return;
                    }
                    c44839Hil.LIZJ().LJIIIIZZ(property, CastLongProtector.parseLong(str));
                    return;
                }
                c44839Hil.LIZJ().LJII(property, CastIntegerProtector.parseInt(str));
                return;
            }
            try {
                c44839Hil.LIZJ().LJFF(property, Boolean.parseBoolean(str));
            } catch (Exception unused) {
            }
        }
    }
}
