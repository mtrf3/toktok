package X;

import Y.ARunnableS9S0110000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7gJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C192077gJ extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C192077gJ(Object obj) {
        super(3, obj, C192057gH.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String p0, Object obj, EnumC84576XHg p2) {
        Boolean bool;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        C192057gH c192057gH = (C192057gH) this.receiver;
        c192057gH.getClass();
        if (obj != null && p2 == EnumC84576XHg.Optimistic && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            C1DH.LJJIJIIJI(new ARunnableS9S0110000_3(c192057gH, bool.booleanValue(), 1));
        }
        return C76800UCe.LIZ;
    }
}
