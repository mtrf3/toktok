package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.1s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46441s0 extends AbstractC65781Prl implements InterfaceC88472Yns<java.util.Set<? extends LiveEffect>, C76800UCe> {
    public static final C46441s0 LJLIL = new C46441s0();

    public C46441s0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Set<? extends LiveEffect> set) {
        java.util.Set<? extends LiveEffect> it = set;
        o.LJIIIZ(it, "it");
        java.util.Set<LiveEffect> set2 = C40641ie.LJLJJL;
        set2.clear();
        set2.addAll(it);
        return C76800UCe.LIZ;
    }
}
