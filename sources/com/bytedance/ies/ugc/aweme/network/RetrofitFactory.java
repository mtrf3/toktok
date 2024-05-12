package com.bytedance.ies.ugc.aweme.network;

import X.C03880Dg;
import X.C38891fp;
import X.C39519Ff9;
import X.C58096Mr6;
import X.C65019PfT;
import X.C65023PfX;
import X.C65064PgC;
import X.C65087PgZ;
import X.C65179Pi3;
import X.C65236Piy;
import X.C65237Piz;
import X.C65300Pk0;
import X.InterfaceC789838c;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class RetrofitFactory implements IRetrofitFactory {
    public static C65019PfT LIZJ(C65064PgC c65064PgC) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400200, "com/bytedance/retrofit2/Retrofit$Builder", "build", c65064PgC, new Object[0], "com.bytedance.retrofit2.Retrofit", new C65300Pk0(false, "()Lcom/bytedance/retrofit2/Retrofit;", "7874600381400818406"));
        return LIZJ.LIZ ? (C65019PfT) LIZJ.LIZIZ : c65064PgC.LIZLLL();
    }

    public static List LIZIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C65023PfX());
        arrayList.add(new C65179Pi3(GsonHolder.LIZLLL().LIZ()));
        arrayList.add(new C65237Piz(GsonHolder.LIZLLL().LIZ()));
        arrayList.add(new C65236Piy(GsonHolder.LIZLLL().LIZ()));
        return arrayList;
    }

    public static IRetrofitFactory LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IRetrofitFactory.class, false);
        if (LIZ != null) {
            return (IRetrofitFactory) LIZ;
        }
        if (C58096Mr6.LJJII == null) {
            synchronized (IRetrofitFactory.class) {
                if (C58096Mr6.LJJII == null) {
                    C58096Mr6.LJJII = new RetrofitFactory();
                }
            }
        }
        return C58096Mr6.LJJII;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.IRetrofitFactory
    public final C65087PgZ LIZ(String str) {
        return new C65087PgZ(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.IRetrofitFactory
    public final InterfaceC789838c create(String str) {
        return new C65087PgZ(str).LJFF();
    }

    public static List LJ(Class cls, List list) {
        if (C38891fp.LJJI(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        for (Object obj2 : list) {
            if (cls.isInstance(obj2)) {
                obj = obj2;
            } else if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        if (obj != null) {
            ListProtector.add(arrayList, 0, obj);
        }
        return arrayList;
    }
}
