package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V9f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79271V9f implements InterfaceC72403SbH {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ InterfaceC31694CcE LIZJ;
    public final /* synthetic */ InterfaceC71651SAd LIZLLL;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ C31692CcC LJFF;

    @Override // X.InterfaceC72403SbH
    public final void LJIL() {
    }

    @Override // X.InterfaceC72403SbH
    public final void LIZ(List<Bitmap> list) {
        if (list.size() != this.LIZ.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.LIZ.size(); i++) {
            C79277V9l c79277V9l = (C79277V9l) ListProtector.get(this.LIZ, i);
            arrayList.add(new C79275V9j(new BitmapDrawable((Bitmap) ListProtector.get(list, i)), c79277V9l.LIZIZ, c79277V9l.LIZJ, c79277V9l.LIZLLL, c79277V9l.LJFF, c79277V9l.LJI));
        }
        C79270V9e c79270V9e = new C79270V9e(this.LJFF.LJLJJLL);
        c79270V9e.LJIJJLI = arrayList;
        c79270V9e.LJIILLIIL = this.LIZIZ;
        final InterfaceC31694CcE interfaceC31694CcE = this.LIZJ;
        c79270V9e.LJIIL = new InterfaceC19890qH() { // from class: X.V9q
            @Override // X.InterfaceC19890qH
            public final void onShow() {
                InterfaceC31694CcE interfaceC31694CcE2 = InterfaceC31694CcE.this;
                if (interfaceC31694CcE2 != null) {
                    interfaceC31694CcE2.LIZ();
                }
            }
        };
        final InterfaceC71651SAd interfaceC71651SAd = this.LIZLLL;
        c79270V9e.LJIILIIL = new InterfaceC19880qG() { // from class: X.V9r
            @Override // X.InterfaceC19880qG
            public final void LIZ(int i2) {
                InterfaceC71651SAd interfaceC71651SAd2 = InterfaceC71651SAd.this;
                if (interfaceC71651SAd2 != null) {
                    interfaceC71651SAd2.LIZ(i2);
                }
            }
        };
        c79270V9e.LJI = this.LJ;
        c79270V9e.LJII = true;
        C30770C5u.LIZLLL(new U4J(c79270V9e), C09.BOTTOM_LEFT_ICON_CLICK_GUIDE);
    }

    public C79271V9f(C31692CcC c31692CcC, List list, String str, InterfaceC31694CcE interfaceC31694CcE, InterfaceC71651SAd interfaceC71651SAd, long j) {
        this.LJFF = c31692CcC;
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = interfaceC31694CcE;
        this.LIZLLL = interfaceC71651SAd;
        this.LJ = j;
    }
}
