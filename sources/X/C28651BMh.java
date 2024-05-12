package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BMh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28651BMh implements BU3<C28649BMf> {
    @Override // X.BU3
    public final void LIZ(Object obj, java.util.Map map) {
        C28649BMf data = (C28649BMf) obj;
        o.LJIIIZ(data, "data");
        String valueOf = String.valueOf(data.LIZ);
        if (valueOf != null) {
            map.put("is_between_guide_time", valueOf);
        }
    }
}
