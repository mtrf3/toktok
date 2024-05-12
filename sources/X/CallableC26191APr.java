package X;

import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.APr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC26191APr<V> implements Callable {
    public static final CallableC26191APr<V> LJLIL = new CallableC26191APr<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<String> allUidList = HG3.LJIILL().allUidList();
        o.LJIIIIZZ(allUidList, "userService().allUidList()");
        return ORZ.LLIZLLLIL(allUidList);
    }
}
