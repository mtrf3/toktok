package X;

import android.graphics.BitmapFactory;
import kotlin.jvm.internal.o;

/* renamed from: X.Cbp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31669Cbp<T, R> implements InterfaceC48038ItG {
    public static final C31669Cbp<T, R> LJLIL = new C31669Cbp<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        InterfaceC81378Vwk t = (InterfaceC81378Vwk) obj;
        o.LJIIIZ(t, "t");
        return BitmapFactory.decodeStream(new C81377Vwj(t));
    }
}
