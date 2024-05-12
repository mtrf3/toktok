package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V9h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79273V9h implements InterfaceC72403SbH {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ InterfaceC31694CcE LIZJ;
    public final /* synthetic */ InterfaceC71651SAd LIZLLL;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ BottomLeftSlotWidget LJFF;

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
        C79274V9i c79274V9i = new C79274V9i(this.LJFF.LJLILLLLZI);
        c79274V9i.LJIJJLI = arrayList;
        c79274V9i.LJIILLIIL = this.LIZIZ;
        final InterfaceC31694CcE interfaceC31694CcE = this.LIZJ;
        c79274V9i.LJIIL = new InterfaceC19890qH() { // from class: X.V9o
            @Override // X.InterfaceC19890qH
            public final void onShow() {
                InterfaceC31694CcE interfaceC31694CcE2 = InterfaceC31694CcE.this;
                if (interfaceC31694CcE2 != null) {
                    interfaceC31694CcE2.LIZ();
                }
            }
        };
        final InterfaceC71651SAd interfaceC71651SAd = this.LIZLLL;
        c79274V9i.LJIILIIL = new InterfaceC19880qG() { // from class: X.V9p
            @Override // X.InterfaceC19880qG
            public final void LIZ(int i2) {
                InterfaceC71651SAd interfaceC71651SAd2 = InterfaceC71651SAd.this;
                if (interfaceC71651SAd2 != null) {
                    interfaceC71651SAd2.LIZ(i2);
                }
            }
        };
        c79274V9i.LJI = this.LJ;
        c79274V9i.LJII = true;
        C30770C5u.LIZLLL(new U4J(c79274V9i), C09.BOTTOM_LEFT_ICON_CLICK_GUIDE);
    }

    public C79273V9h(BottomLeftSlotWidget bottomLeftSlotWidget, List list, String str, InterfaceC31694CcE interfaceC31694CcE, InterfaceC71651SAd interfaceC71651SAd, long j) {
        this.LJFF = bottomLeftSlotWidget;
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = interfaceC31694CcE;
        this.LIZLLL = interfaceC71651SAd;
        this.LJ = j;
    }
}
