package Y;

import X.C147295qH;
import X.C68322mC;
import X.C76732zl;
import X.H7R;
import X.InterfaceC48038ItG;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDhS66S0200000_2 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS66S0200000_2 iDhS66S0200000_2, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o.LJIIIZ(bitmap, "bitmap");
        InterfaceC48038ItG interfaceC48038ItG = (InterfaceC48038ItG) iDhS66S0200000_2.l0;
        VideoPublishEditModel videoPublishEditModel = ((C147295qH) iDhS66S0200000_2.l1).LJLLJ;
        if (videoPublishEditModel != null) {
            if (H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
                bitmap = ((C147295qH) iDhS66S0200000_2.l1).LLLLIIIILLL(bitmap);
            }
            return Bitmap.createScaledBitmap((Bitmap) interfaceC48038ItG.apply(bitmap), 270, 480, true);
        }
        o.LJIJI("mModel");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object, java.lang.String] */
    public static final Object apply$1(IDhS66S0200000_2 iDhS66S0200000_2, Object obj) {
        Object[] response = (Object[]) obj;
        o.LJIIIZ(response, "response");
        ArrayList arrayList = new ArrayList();
        C76732zl c76732zl = (C76732zl) iDhS66S0200000_2.l0;
        C68322mC c68322mC = (C68322mC) iDhS66S0200000_2.l1;
        for (Object obj2 : response) {
            if (obj2 instanceof BaseNetResponse) {
                BaseNetResponse baseNetResponse = (BaseNetResponse) obj2;
                if (baseNetResponse.status_code == 0) {
                    arrayList.add(obj2);
                } else {
                    c76732zl.element++;
                    String str = baseNetResponse.message;
                    if (str != null && str.length() > 0) {
                        ?? r0 = baseNetResponse.message;
                        o.LJI(r0);
                        c68322mC.element = r0;
                    }
                }
            }
        }
        return arrayList;
    }

    public IDhS66S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
