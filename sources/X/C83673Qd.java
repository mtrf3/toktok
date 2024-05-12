package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;

/* renamed from: X.3Qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C83673Qd extends TAZ implements InterfaceC88471Ynr<List<IMContact>, InterfaceC67352kd<? super List<IMContact>>, Object> {
    public C83673Qd(Object obj) {
        super(2, obj, C3R0.class, "interceptFinish", "interceptFinish(Ljava/util/List;)Ljava/util/List;", 4);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(List<IMContact> list, InterfaceC67352kd<? super List<IMContact>> interfaceC67352kd) {
        List<IMContact> list2 = list;
        C3R0 c3r0 = (C3R0) this.receiver;
        c3r0.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("interceptFinish, before list size: ");
        LIZ.append(list2.size());
        C34B.LJI("SharePanelRelationModel", X1D.LIZIZ(LIZ));
        if (c3r0.LJIIIZ()) {
            C3FK.LIZ.getClass();
            list2 = C3FK.LIZJ(null, list2);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("interceptFinish, after list size: ");
        LIZ2.append(list2.size());
        C34B.LJI("SharePanelRelationModel", X1D.LIZIZ(LIZ2));
        return list2;
    }
}
