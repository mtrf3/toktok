package X;

import Y.ARunnableS9S0110000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7gV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C192197gV extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C192197gV(Object obj) {
        super(3, obj, C192187gU.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String p0, Object obj, EnumC84576XHg p2) {
        Boolean bool;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        C192187gU c192187gU = (C192187gU) this.receiver;
        c192187gU.getClass();
        if (obj != null && p2 == EnumC84576XHg.Optimistic && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            C1DH.LJJIJIIJI(new ARunnableS9S0110000_3(c192187gU, bool.booleanValue(), 7));
        }
        return C76800UCe.LIZ;
    }
}
