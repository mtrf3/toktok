package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NhI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60036NhI {
    public final Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ C60036NhI() {
        C60033NhF c60033NhF = new C60033NhF();
        this.LIZ = c60033NhF;
        this.LIZIZ = new C60032NhE(c60033NhF);
    }

    public C60036NhI(List list) {
        ArrayList arrayList = (ArrayList) list;
        C83742Wtm[] c83742WtmArr = new C83742Wtm[arrayList.size()];
        this.LIZ = c83742WtmArr;
        this.LIZIZ = new C83742Wtm[arrayList.size()];
        arrayList.toArray(c83742WtmArr);
    }
}
