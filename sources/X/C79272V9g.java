package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V9g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79272V9g implements InterfaceC72403SbH {
    public final /* synthetic */ List<C79277V9l> LIZ;
    public final /* synthetic */ C31699CcJ LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ InterfaceC31694CcE LJ;
    public final /* synthetic */ InterfaceC71651SAd LJFF;

    @Override // X.InterfaceC72403SbH
    public final void LJIL() {
    }

    @Override // X.InterfaceC72403SbH
    public final void LIZ(List<Bitmap> list) {
        if (list.size() != this.LIZ.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            C79277V9l c79277V9l = (C79277V9l) ListProtector.get(this.LIZ, i);
            arrayList.add(new C79275V9j(new BitmapDrawable((Bitmap) ListProtector.get(list, i)), c79277V9l.LIZIZ, c79277V9l.LIZJ, c79277V9l.LIZLLL, c79277V9l.LJFF, c79277V9l.LJI));
        }
        ImageView imageView = this.LIZIZ.LJLLI;
        if (imageView != null) {
            String str = this.LIZJ;
            long j = this.LIZLLL;
            InterfaceC31694CcE interfaceC31694CcE = this.LJ;
            InterfaceC71651SAd interfaceC71651SAd = this.LJFF;
            C79274V9i c79274V9i = new C79274V9i(imageView);
            c79274V9i.LJIJJLI = arrayList;
            c79274V9i.LJIILLIIL = str;
            c79274V9i.LJIIL = new C79278V9m(interfaceC31694CcE);
            c79274V9i.LJIILIIL = new C79279V9n(interfaceC71651SAd);
            c79274V9i.LJI = j;
            c79274V9i.LJII = true;
            C30770C5u.LIZLLL(new U4J(c79274V9i), C09.BOTTOM_LEFT_ICON_CLICK_GUIDE);
        }
    }

    public C79272V9g(List<C79277V9l> list, C31699CcJ c31699CcJ, String str, long j, InterfaceC31694CcE interfaceC31694CcE, InterfaceC71651SAd interfaceC71651SAd) {
        this.LIZ = list;
        this.LIZIZ = c31699CcJ;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = interfaceC31694CcE;
        this.LJFF = interfaceC71651SAd;
    }
}
