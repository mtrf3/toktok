package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HKI implements InterfaceC68662mk {
    public final /* synthetic */ HKJ LIZ;
    public final /* synthetic */ HKO LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ int LJ;

    @Override // X.InterfaceC68662mk
    public final void onFailure() {
        this.LIZ.LJLJJL(null, null, null, null, null);
        HKO hko = this.LIZIZ;
        if (hko != null) {
            hko.LJFF(1001, null, false);
        }
        this.LIZ.LJJZZIII();
    }

    @Override // X.InterfaceC68662mk
    public final void onSuccess(List compressedMediaList) {
        final EnumC123874tb enumC123874tb;
        o.LJIIIZ(compressedMediaList, "compressedMediaList");
        this.LIZ.LJLL.LJLJJI = 100.0f;
        ArrayList arrayList = new ArrayList(C32I.LJJL(compressedMediaList, 10));
        Iterator it = compressedMediaList.iterator();
        while (it.hasNext()) {
            HJU hju = (HJU) it.next();
            final String str = hju.LIZIZ;
            if (hju.LIZJ) {
                enumC123874tb = EnumC123874tb.VIDEO;
            } else {
                enumC123874tb = EnumC123874tb.IMAGE;
            }
            final long j = hju.LIZLLL;
            final float f = hju.LJI;
            final long j2 = hju.LJ;
            final long j3 = hju.LJFF;
            arrayList.add(new F9E(str, enumC123874tb, j, f, j2, j3) { // from class: X.4rw
                public final String LJLIL;
                public final EnumC123874tb LJLILLLLZI;
                public final long LJLJI;
                public final float LJLJJI;
                public final long LJLJJL;
                public final long LJLJJLL;

                @Override // X.F9E
                public final Object[] getObjects() {
                    return new Object[]{this.LJLIL, this.LJLILLLLZI, Long.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL), Long.valueOf(this.LJLJJLL)};
                }

                {
                    o.LJIIIZ(str, "path");
                    o.LJIIIZ(enumC123874tb, "type");
                    this.LJLIL = str;
                    this.LJLILLLLZI = enumC123874tb;
                    this.LJLJI = j;
                    this.LJLJJI = f;
                    this.LJLJJL = j2;
                    this.LJLJJLL = j3;
                }
            });
        }
        HKO hko = this.LIZIZ;
        if (hko != null) {
            hko.LJ(compressedMediaList);
        }
        this.LIZ.LJJZZI().LIZ(this.LIZJ, this.LIZLLL, new HKH(this.LIZ, compressedMediaList, this.LJ, this.LIZIZ));
    }

    public HKI(HKJ hkj, HKO hko, String str, String str2, int i) {
        this.LIZ = hkj;
        this.LIZIZ = hko;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i;
    }
}
