package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;

/* renamed from: X.3R4, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3R4 extends TAZ implements InterfaceC88471Ynr<C3RY<IMContact>, InterfaceC67352kd<? super Boolean>, Object> {
    public C3R4(Object obj) {
        super(2, obj, C3R3.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/data/core/core/CombinedLoader$InterceptPayload;)Z", 4);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3RY<IMContact> c3ry, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        boolean z;
        C3RY<IMContact> c3ry2 = c3ry;
        C3R3 c3r3 = (C3R3) this.receiver;
        c3r3.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("intercept begin list: ");
        DIL.LIZIZ(c3ry2.LIZIZ, LIZ, " map: ");
        LIZ.append(c3ry2.LIZ.size());
        C34B.LJI("ActiveRelationModel", X1D.LIZIZ(LIZ));
        c3ry2.LIZ.put(c3ry2.LIZJ, c3ry2.LIZIZ);
        if (c3ry2.LIZJ == c3r3.LJLJL) {
            c3r3.LJLL = AbstractC82553Lv.LJII(c3ry2.LIZIZ);
        }
        C34B.LJI("ActiveRelationModel", "intercept finish");
        if (UC0.LJJJLIIL(c3ry2.LIZ) > c3r3.LJLLI) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
