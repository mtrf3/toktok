package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XW1<T> implements InterfaceC64592gB {
    public final /* synthetic */ Object LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ List<Bitmap> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C86192XsC LJLJJL;
    public final /* synthetic */ InterfaceC73573Su9<Bitmap> LJLJJLL;
    public final /* synthetic */ C76732zl LJLJL;

    public XW1(Object obj, C76732zl c76732zl, List list, int i, C86192XsC c86192XsC, C73433Srt c73433Srt, C76732zl c76732zl2) {
        this.LJLIL = obj;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = list;
        this.LJLJJI = i;
        this.LJLJJL = c86192XsC;
        this.LJLJJLL = c73433Srt;
        this.LJLJL = c76732zl2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Object obj2 = this.LJLIL;
        C76732zl c76732zl = this.LJLILLLLZI;
        List<Bitmap> list = this.LJLJI;
        int i = this.LJLJJI;
        C86192XsC c86192XsC = this.LJLJJL;
        InterfaceC73573Su9<Bitmap> interfaceC73573Su9 = this.LJLJJLL;
        C76732zl c76732zl2 = this.LJLJL;
        synchronized (obj2) {
            if (obj == null) {
                Bitmap defaultAvatar = (Bitmap) c86192XsC.LJJI.getValue();
                o.LJIIIIZZ(defaultAvatar, "defaultAvatar");
                list.set(i, defaultAvatar);
            } else {
                c76732zl.element++;
                list.set(i, obj);
            }
            Bitmap LJFF = c86192XsC.LJFF(list);
            interfaceC73573Su9.onNext(LJFF);
            int i2 = c76732zl2.element + 1;
            c76732zl2.element = i2;
            if (i2 == c86192XsC.LJI()) {
                if (c76732zl.element == c86192XsC.LJI() && c86192XsC.LJIIL) {
                    XLY.LIZ.LIZIZ(LJFF, c86192XsC.LJIIJ());
                }
                c86192XsC.LJJIIZI = "complete";
                interfaceC73573Su9.onComplete();
            }
        }
    }
}
