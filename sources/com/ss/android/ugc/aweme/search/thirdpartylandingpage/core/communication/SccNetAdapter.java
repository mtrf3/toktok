package com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.communication;

import X.C16880lQ;
import X.C36609EYj;
import X.C36610EYk;
import X.C65777Prh;
import X.E8L;
import X.EJ6;
import X.InterfaceC195727mC;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC36326ENm;
import X.InterfaceC36331ENr;
import X.InterfaceC36611EYl;
import X.InterfaceC37276Ek4;
import Y.ARunnableS5S0310000_6;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SccNetAdapter implements InterfaceC36611EYl {
    public ExecutorService LIZ;

    /* loaded from: classes7.dex */
    public interface TTNetAdapterApi {
        @E8L
        InterfaceC37276Ek4<TypedInput> doGet(@InterfaceC195747mE String str, @InterfaceC30951CCt boolean z, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195737mD Object obj, @InterfaceC195767mG List<EJ6> list);

        @InterfaceC36326ENm(method = "{CUSTOM}")
        InterfaceC37276Ek4<TypedInput> send(@InterfaceC36331ENr("CUSTOM") String str, @InterfaceC195747mE String str2, @InterfaceC30951CCt boolean z, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195737mD Object obj, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list);
    }

    public final Map<String, List<String>> LIZIZ(List<EJ6> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (EJ6 ej6 : list) {
            if (ej6 != null) {
                if (hashMap.get(ej6.LIZ) == null) {
                    String str = ej6.LIZ;
                    o.LJIIIIZZ(str, "it.name");
                    hashMap.put(str, new ArrayList());
                }
                List list2 = (List) hashMap.get(ej6.LIZ);
                if (C65777Prh.LJI(list2)) {
                    String str2 = ej6.LIZIZ;
                    o.LJIIIIZZ(str2, "it.value");
                    list2.add(str2);
                }
            }
        }
        return hashMap;
    }

    @Override // X.InterfaceC36611EYl
    public final void LIZ(C36610EYk c36610EYk, C36609EYj c36609EYj, boolean z) {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    this.LIZ = C16880lQ.LLLLZ(3);
                }
            }
        }
        ExecutorService executorService = this.LIZ;
        if (executorService != null) {
            executorService.execute(new ARunnableS5S0310000_6(this, c36610EYk, c36609EYj, z, 1));
        }
    }
}
