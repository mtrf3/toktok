package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;

/* renamed from: X.3R6, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3R6 extends TAZ implements InterfaceC88471Ynr<C3RY<IMContact>, InterfaceC67352kd<? super Boolean>, Object> {
    public C3R6(Object obj) {
        super(2, obj, C3R5.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/data/core/core/CombinedLoader$InterceptPayload;)Z", 4);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3RY<IMContact> c3ry, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        List<IMContact> list;
        C3RY<IMContact> c3ry2 = c3ry;
        C3R5 c3r5 = (C3R5) this.receiver;
        c3r5.getClass();
        boolean z = false;
        if (c3ry2.LIZJ == c3r5.LJLJL && c3ry2.LIZIZ.size() > 15) {
            list = c3ry2.LIZIZ.subList(0, 15);
        } else {
            list = c3ry2.LIZIZ;
        }
        c3ry2.LIZ.put(c3ry2.LIZJ, list);
        if (c3ry2.LIZJ == c3r5.LJLJL && (!list.isEmpty())) {
            ((IMContact) ListProtector.get(list, 0)).setType(2);
            c3r5.LJLL = AbstractC82553Lv.LJII(list);
            z = true;
        } else {
            C3RG<IMContact> c3rg = c3ry2.LIZJ;
            if (c3rg == c3r5.LJLLLL && ((C83753Ql) c3rg).LJIIJ == 1 && (!list.isEmpty())) {
                ((IMContact) ListProtector.get(list, 0)).setType(3);
            }
        }
        return Boolean.valueOf(z);
    }
}
