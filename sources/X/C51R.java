package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.51R, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C51R extends AbstractC65781Prl implements InterfaceC88472Yns<ArrayList<Float>, Float> {
    public static final C51R LJLIL = new C51R();

    public C51R() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Float invoke(ArrayList<Float> arrayList) {
        ArrayList<Float> sameTimeWaveList = arrayList;
        o.LJIIIZ(sameTimeWaveList, "sameTimeWaveList");
        return Float.valueOf(ORZ.LLILL(sameTimeWaveList));
    }
}
