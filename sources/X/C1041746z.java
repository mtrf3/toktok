package X;

import kotlin.jvm.internal.o;

/* renamed from: X.46z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1041746z {
    public final C109544Rq LIZ;

    public final EnumC1041646y LIZ() {
        String localExtValue = this.LIZ.getLocalExtValue("nudge_state_key");
        EnumC1041646y enumC1041646y = EnumC1041646y.NOT_INTERACT;
        if (o.LJ(localExtValue, enumC1041646y.getValue())) {
            return enumC1041646y;
        }
        EnumC1041646y enumC1041646y2 = EnumC1041646y.READY_TO_INTERACT;
        if (!o.LJ(localExtValue, enumC1041646y2.getValue())) {
            enumC1041646y2 = EnumC1041646y.INTERACTED;
            if (!o.LJ(localExtValue, enumC1041646y2.getValue())) {
                enumC1041646y2 = EnumC1041646y.NOT_AVAILABLE;
                if (!o.LJ(localExtValue, enumC1041646y2.getValue())) {
                    return enumC1041646y;
                }
            }
        }
        return enumC1041646y2;
    }

    public C1041746z(C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        this.LIZ = msg;
    }
}
