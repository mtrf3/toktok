package X;

import android.content.Context;
import com.bytedance.ies.effectcreator.swig.EffectCreatorJniJNI;
import com.bytedance.ies.effectcreator.swig.EventTrigger;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.TriggerExtraDataType;
import kotlin.jvm.internal.o;

/* renamed from: X.akg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94666akg extends AbstractC94513aiD {
    public final EventTrigger LIZ;

    @Override // X.AbstractC93990aZm
    public final int LIZIZ() {
        return C16880lQ.LLJIJIL(this.LIZ.id().objectId());
    }

    @Override // X.AbstractC94371afv
    public final String LIZJ() {
        String key = this.LIZ.getKey();
        o.LJIIIIZZ(key, "trigger.key");
        return key;
    }

    @Override // X.AbstractC94371afv
    public final String LIZLLL() {
        Context context;
        if (o.LJ(this.LIZ.getKey(), EffectCreatorJniJNI.kEventTriggerActionNone()) || (context = C93901aYL.LIZ) == null) {
            return "";
        }
        String key = this.LIZ.getKey();
        o.LJIIIIZZ(key, "trigger.key");
        return C93848aXU.LIZIZ(context, key);
    }

    public final C94665akf LJFF() {
        Feature extraDataFeature = this.LIZ.getExtraDataFeature();
        if (extraDataFeature != null) {
            return new C94665akf(extraDataFeature);
        }
        return null;
    }

    public final Double LJI() {
        return Double.valueOf(this.LIZ.getExtraDataDelayTime());
    }

    public final EnumC93994aZq LJII() {
        TriggerExtraDataType extraDataType = this.LIZ.getExtraDataType();
        if (extraDataType != null) {
            int i = C93856aXc.LIZ[extraDataType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return EnumC93994aZq.TypeTime;
                }
            } else {
                return EnumC93994aZq.TypeFeature;
            }
        }
        return EnumC93994aZq.TypeNormal;
    }

    public final String LJIIIIZZ() {
        String key = this.LIZ.getKey();
        o.LJIIIIZZ(key, "trigger.key");
        return key;
    }

    public final boolean LJIIIZ() {
        String key = this.LIZ.getKey();
        o.LJIIIIZZ(key, "trigger.key");
        if (key.length() == 0 || o.LJ(this.LIZ.getKey(), EffectCreatorJniJNI.kEventTriggerActionNone())) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ() {
        TriggerExtraDataType extraDataType = this.LIZ.getExtraDataType();
        if (extraDataType == null || C93856aXc.LIZIZ[extraDataType.ordinal()] != 1) {
            if (!LJIIIZ()) {
                return true;
            }
        } else if (this.LIZ.getExtraDataFeature() != null) {
            return true;
        }
        return false;
    }

    public C94666akg(EventTrigger eventTrigger) {
        this.LIZ = eventTrigger;
    }

    @Override // X.AbstractC93990aZm
    public final boolean LIZ(Object other) {
        o.LJIIIZ(other, "other");
        boolean z = true;
        if (!o.LJ(other.getClass(), C94666akg.class)) {
            return false;
        }
        C94666akg c94666akg = (C94666akg) other;
        if (this.LIZ.id().objectId() != c94666akg.LIZ.id().objectId() || !o.LJ(LIZJ(), c94666akg.LIZJ()) || !o.LJ(LIZLLL(), c94666akg.LIZLLL()) || !o.LJ(LJFF(), c94666akg.LJFF()) || LJII() != c94666akg.LJII() || LJI().doubleValue() != c94666akg.LJI().doubleValue() || !o.LJ(LJIIIIZZ(), c94666akg.LJIIIIZZ())) {
            z = false;
        }
        return z;
    }

    @Override // X.AbstractC94513aiD
    public final void LJ(AbstractC94512aiC abstractC94512aiC) {
        if (abstractC94512aiC == null) {
            this.LIZ.setExtraDataFeature(null);
        } else {
            this.LIZ.setExtraDataFeature(((C94665akf) abstractC94512aiC).LIZ);
        }
    }

    public final void LJIIJJI(double d) {
        this.LIZ.setExtraDataDelayTime(d);
    }

    public final void LJIIL(String effectKey) {
        o.LJIIIZ(effectKey, "effectKey");
        this.LIZ.setKey(effectKey);
    }
}
