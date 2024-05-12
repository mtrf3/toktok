package X;

import Y.ARunnableS0S1110000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C193067hu extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C193067hu(Object obj) {
        super(3, obj, C193077hv.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, Object obj, EnumC84576XHg p2) {
        Boolean bool;
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        C193077hv c193077hv = (C193077hv) this.receiver;
        c193077hv.getClass();
        if (obj != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            C1DH.LJJIJIIJI(new ARunnableS0S1110000_3(c193077hv, p0, bool.booleanValue(), 0));
        }
        return C76800UCe.LIZ;
    }
}
