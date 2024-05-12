package X;

import Y.ARunnableS48S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.8Td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C211858Td extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C211858Td(Object obj) {
        super(3, obj, C71417S1d.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String p0, Object obj, EnumC84576XHg p2) {
        Boolean bool;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        C71417S1d c71417S1d = (C71417S1d) this.receiver;
        c71417S1d.getClass();
        if (obj != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue() && p2 == EnumC84576XHg.Mutation) {
            C1DH.LJJIJIIJI(new ARunnableS48S0100000_12(c71417S1d, 98));
        }
        return C76800UCe.LIZ;
    }
}
