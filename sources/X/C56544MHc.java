package X;

import defpackage.PasskeyFrequencySettingsModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MHc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56544MHc {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void LIZ(List<T> originList, List<? extends T> addList, InterfaceC88471Ynr<? super T, ? super T, Boolean> isEquals) {
        o.LJIIIZ(originList, "originList");
        o.LJIIIZ(addList, "addList");
        o.LJIIIZ(isEquals, "isEquals");
        if (C79004UzY.LJJIFFI(addList)) {
            return;
        }
        for (T t : addList) {
            if (t != 0) {
                Iterator<T> it = originList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PasskeyFrequencySettingsModel.a aVar = (Object) it.next();
                    if (isEquals.invoke(aVar, t).booleanValue()) {
                        if (aVar == null) {
                        }
                    }
                }
                originList.add(t);
            }
        }
    }
}
