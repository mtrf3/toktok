package X;

import android.content.Context;
import com.bytedance.ies.effectcreator.swig.ActionExtraDataType;
import com.bytedance.ies.effectcreator.swig.EffectCreatorJniJNI;
import com.bytedance.ies.effectcreator.swig.EventAction;
import kotlin.jvm.internal.o;

/* renamed from: X.ake, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94664ake extends AbstractC94511aiB {
    public final EventAction LIZ;

    @Override // X.AbstractC93990aZm
    public final int LIZIZ() {
        return C16880lQ.LLJIJIL(this.LIZ.id().objectId());
    }

    @Override // X.AbstractC94371afv
    public final String LIZJ() {
        String key = this.LIZ.getKey();
        o.LJIIIIZZ(key, "action.key");
        return key;
    }

    @Override // X.AbstractC94371afv
    public final String LIZLLL() {
        Context context;
        if (o.LJ(this.LIZ.getKey(), EffectCreatorJniJNI.kEventAnimationNone()) || (context = C93901aYL.LIZ) == null) {
            return "";
        }
        String key = this.LIZ.getKey();
        o.LJIIIIZZ(key, "action.key");
        return C93848aXU.LIZIZ(context, key);
    }

    public final double LJ() {
        return this.LIZ.getExtraDataTimeInterval();
    }

    public final EnumC93988aZk LJFF() {
        ActionExtraDataType extraDataType = this.LIZ.getExtraDataType();
        if (extraDataType == null || C93855aXb.LIZ[extraDataType.ordinal()] != 1) {
            return EnumC93988aZk.Normal;
        }
        return EnumC93988aZk.FPS;
    }

    public final String LJI() {
        String key = this.LIZ.getKey();
        o.LJIIIIZZ(key, "action.key");
        return key;
    }

    public final boolean LJII() {
        String key = this.LIZ.getKey();
        o.LJIIIIZZ(key, "action.key");
        if (key.length() == 0 || o.LJ(this.LIZ.getKey(), EffectCreatorJniJNI.kEventAnimationNone())) {
            return true;
        }
        return false;
    }

    public C94664ake(EventAction eventAction) {
        this.LIZ = eventAction;
    }

    @Override // X.AbstractC93990aZm
    public final boolean LIZ(Object other) {
        o.LJIIIZ(other, "other");
        boolean z = true;
        if (!o.LJ(other.getClass(), C94664ake.class)) {
            return false;
        }
        C94664ake c94664ake = (C94664ake) other;
        if (this.LIZ.id().objectId() != c94664ake.LIZ.id().objectId() || LJ() != c94664ake.LJ() || LJFF() != c94664ake.LJFF() || !o.LJ(LIZJ(), c94664ake.LIZJ()) || !o.LJ(LIZLLL(), c94664ake.LIZLLL()) || !o.LJ(LJI(), c94664ake.LJI())) {
            z = false;
        }
        return z;
    }

    public final void LJIIIIZZ(double d) {
        this.LIZ.setExtraDataTimeInterval(d);
    }
}
