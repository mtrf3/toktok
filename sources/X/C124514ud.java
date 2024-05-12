package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.4ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124514ud extends AbstractC65781Prl implements InterfaceC88472Yns<ArrayList<Float>, Float> {
    public static final C124514ud LJLIL = new C124514ud();

    public C124514ud() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Float invoke(ArrayList<Float> arrayList) {
        ArrayList<Float> waveSameTimeList = arrayList;
        o.LJIIIZ(waveSameTimeList, "waveSameTimeList");
        return Float.valueOf(ORZ.LLILL(waveSameTimeList) / waveSameTimeList.size());
    }
}
