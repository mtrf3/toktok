package Y;

import X.AbstractC73638SvC;
import X.C47261Igj;
import X.C57745MlR;
import X.C73433Srt;
import X.C76732zl;
import X.C86192XsC;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.T16;
import X.XLY;
import X.XW1;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDuS325S0100000_15 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    public static final void subscribe$1(IDuS325S0100000_15 iDuS325S0100000_15, InterfaceC73573Su9 interfaceC73573Su9) {
        ((I18nSettingNewVersionFragment) iDuS325S0100000_15.l0).lambda$initStorageData$12((C73433Srt) interfaceC73573Su9);
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Bitmap> interfaceC73573Su9) {
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

    public IDuS325S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(IDuS325S0100000_15 iDuS325S0100000_15, InterfaceC73573Su9 interfaceC73573Su9) {
        int LJI = ((C86192XsC) iDuS325S0100000_15.l0).LJI();
        C86192XsC c86192XsC = (C86192XsC) iDuS325S0100000_15.l0;
        ArrayList arrayList = new ArrayList(LJI);
        for (int i = 0; i < LJI; i++) {
            Object defaultAvatar = c86192XsC.LJJI.getValue();
            o.LJIIIIZZ(defaultAvatar, "defaultAvatar");
            arrayList.add(defaultAvatar);
        }
        C76732zl c76732zl = new C76732zl();
        C76732zl c76732zl2 = new C76732zl();
        Object obj = new Object();
        List list = (List) ((C86192XsC) iDuS325S0100000_15.l0).LJIILJJIL.getValue();
        C86192XsC c86192XsC2 = (C86192XsC) iDuS325S0100000_15.l0;
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (obj2 instanceof Bitmap) {
                    synchronized (obj) {
                        c76732zl.element++;
                        arrayList.set(i2, obj2);
                        Bitmap LJFF = c86192XsC2.LJFF(arrayList);
                        interfaceC73573Su9.onNext(LJFF);
                        int i4 = c76732zl2.element + 1;
                        c76732zl2.element = i4;
                        if (i4 == c86192XsC2.LJI()) {
                            if (c76732zl.element == c86192XsC2.LJI() && c86192XsC2.LJIIL) {
                                XLY.LIZ.LIZIZ(LJFF, c86192XsC2.LJIIJ());
                            }
                            c86192XsC2.LJJIIZI = "incomplete";
                            interfaceC73573Su9.onComplete();
                        }
                    }
                } else if (obj2 instanceof UrlModel) {
                    c86192XsC2.getClass();
                    AbstractC73638SvC.LJI(new C57745MlR((UrlModel) obj2, c86192XsC2, System.currentTimeMillis())).LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZIZ).LJJIFFI(new XW1(obj, c76732zl, arrayList, i2, c86192XsC2, (C73433Srt) interfaceC73573Su9, c76732zl2));
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
