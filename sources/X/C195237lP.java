package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.nows.feed.event.NowEventRegistry;
import kotlin.jvm.internal.o;

/* renamed from: X.7lP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195237lP {
    public static final <T> void LIZ(LifecycleOwner lifecycleOwner, NowEventRegistry<T> registry, final InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(registry, "registry");
        registry.LIZIZ(lifecycleOwner, new InterfaceC195257lR<T>() { // from class: X.7lO
            @Override // X.InterfaceC195257lR
            public final void LIZ(T t) {
                interfaceC88472Yns.invoke(t);
            }
        });
    }
}
