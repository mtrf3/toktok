package Y;

import X.C32262ClO;
import X.C38354F3m;
import X.C43331mz;
import X.C73433Srt;
import X.C75428Tiy;
import X.C81257Vun;
import X.C81687W4d;
import X.C81697W4n;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.W50;
import X.W5I;
import X.W5O;
import X.W5P;
import X.W6J;
import X.X1D;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes14.dex */
public class IDuS82S0200000_13 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<List<LinkListUser>> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS82S0200000_13 iDuS82S0200000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        try {
            C75428Tiy c75428Tiy = (C75428Tiy) iDuS82S0200000_13.l0;
            List list = (List) iDuS82S0200000_13.l1;
            c75428Tiy.getClass();
            interfaceC73573Su9.onNext(C75428Tiy.LIZIZ(list));
        } catch (Throwable th) {
            interfaceC73573Su9.tryOnError(th);
        }
    }

    public static final void subscribe$1(IDuS82S0200000_13 iDuS82S0200000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        String str;
        W5O[] w5oArr;
        ImageModel imageModel = (ImageModel) iDuS82S0200000_13.l0;
        Executor executor = (Executor) iDuS82S0200000_13.l1;
        if (imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            ArrayList arrayList = new ArrayList();
            C43331mz c43331mz = new C43331mz();
            for (String str2 : imageModel.getUrls()) {
                if (!C38354F3m.LJ(str2)) {
                    W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str2));
                    c43331mz.LIZIZ++;
                    LIZLLL.LJIILJJIL = c43331mz;
                    arrayList.add(LIZLLL.LIZ());
                }
            }
            if (arrayList.size() != 0 && (w5oArr = (W5O[]) arrayList.toArray(new W5O[arrayList.size()])) != null && w5oArr.length != 0) {
                ArrayList arrayList2 = new ArrayList();
                for (W5O w5o : w5oArr) {
                    if (w5o != null) {
                        W6J LIZ = W5I.LIZ();
                        W50 w50 = W50.FULL_FETCH;
                        LIZ.getClass();
                        arrayList2.add(new C81257Vun(LIZ, w5o, w50));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    new C81697W4n(new C81687W4d(arrayList2)).LJ(new C32262ClO((C73433Srt) interfaceC73573Su9, imageModel), executor);
                    return;
                }
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Cannot build requests from imageModel: ");
        if (imageModel != null) {
            str = imageModel.toString();
        } else {
            str = "";
        }
        LIZ2.append(str);
        interfaceC73573Su9.onError(new IllegalArgumentException(X1D.LIZIZ(LIZ2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDuS82S0200000_13(Object obj, C75428Tiy c75428Tiy, List<LinkListUser> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = c75428Tiy;
    }
}
