package X;

import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8Zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C213448Zg extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C213448Zg(Object obj) {
        super(3, obj, C213438Zf.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String p0, Object obj, EnumC84576XHg p2) {
        Boolean bool;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        C213438Zf c213438Zf = (C213438Zf) this.receiver;
        c213438Zf.getClass();
        if (obj != null && p2 == EnumC84576XHg.Optimistic && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            MS5.LJFF(new AqS60S0110000_3(bool.booleanValue(), c213438Zf, 1));
        }
        return C76800UCe.LIZ;
    }
}
