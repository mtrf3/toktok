package X;

import com.bytedance.ext_power_list.AssemReusedDispatcher;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.8XX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XX<T> extends AbstractC65781Prl implements InterfaceC65784Pro<AssemReusedDispatcher<PowerCell<T>, T>> {
    public static final C8XX LJLIL = new C8XX();

    public C8XX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        return new AssemReusedDispatcher();
    }
}
