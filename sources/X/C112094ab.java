package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112094ab extends AbstractC105384Bq implements InterfaceC106614Gj {
    public static int LJLL;
    public final InterfaceC106584Gg LJLJI;
    public final C112114ad LJLJJI;
    public final C59678NbW LJLJJL;
    public boolean LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C64962gm LJLJLLL;

    public final VWD LIZLLL() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-emojiPager>(...)");
        return (VWD) value;
    }

    public final void LJ() {
        int LIZIZ;
        int LJIIJ;
        int i;
        C112114ad c112114ad = this.LJLJJI;
        InterfaceC105334Bl interfaceC105334Bl = (InterfaceC105334Bl) this.LJLJJL.LIZIZ;
        if (interfaceC105334Bl == null) {
            LIZIZ = 0;
        } else {
            LIZIZ = interfaceC105334Bl.LIZIZ();
        }
        InterfaceC105334Bl interfaceC105334Bl2 = (InterfaceC105334Bl) this.LJLJJL.LIZIZ;
        if (interfaceC105334Bl2 == null) {
            LJIIJ = 0;
        } else {
            LJIIJ = interfaceC105334Bl2.LJIIJ();
        }
        InterfaceC105334Bl interfaceC105334Bl3 = (InterfaceC105334Bl) this.LJLJJL.LIZIZ;
        if (interfaceC105334Bl3 != null) {
            i = interfaceC105334Bl3.LJ();
        } else {
            i = 0;
        }
        C112084aa c112084aa = c112114ad.LIZ;
        if (c112084aa.LJLIL != LIZIZ || c112084aa.LJLILLLLZI != LJIIJ || c112084aa.LJLJI != i) {
            c112084aa.LJLIL = LIZIZ;
            c112084aa.LJLJI = i;
            ((ArrayList) c112084aa.LJLJJI).clear();
            for (int i2 = 0; i2 < LIZIZ; i2++) {
                C112124ae c112124ae = new C112124ae();
                c112124ae.LIZIZ = R.drawable.as_;
                ((ArrayList) c112084aa.LJLJJI).add(c112124ae);
                if (i2 == LJIIJ) {
                    c112084aa.LJLILLLLZI = LJIIJ;
                    ((C112124ae) ListProtector.get(c112084aa.LJLJJI, LJIIJ)).LIZ = true;
                }
            }
            c112084aa.notifyDataSetChanged();
        }
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-emojiIndicatorView>(...)");
        ((View) value).setVisibility(0);
    }

    @Override // X.InterfaceC106614Gj
    public final C59678NbW LIZ() {
        return this.LJLJJL;
    }

    public C112094ab(InterfaceC106584Gg interfaceC106584Gg, C105394Br c105394Br, ViewGroup viewGroup) {
        super(viewGroup, R.layout.atq);
        int i;
        this.LJLJI = interfaceC106584Gg;
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 974));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 973));
        this.LJLJLJ = LIZIZ;
        this.LJLJLLL = C48841JEv.LIZ(C78613UtF.LIZ);
        C59678NbW c59678NbW = new C59678NbW(c105394Br);
        this.LJLJJL = c59678NbW;
        LIZLLL().setAdapter(new C106544Gc(interfaceC106584Gg, this, LIZLLL()));
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-emojiIndicatorView>(...)");
        this.LJLJJI = new C112114ad((RecyclerView) value);
        LJ();
        LIZLLL().addOnPageChangeListener(new C1CZ() { // from class: X.4ac
            @Override // X.C1CZ, X.C0C3
            public final void onPageSelected(int i2) {
                C112094ab c112094ab = C112094ab.this;
                int i3 = 0;
                c112094ab.LJLJJLL = false;
                C59678NbW c59678NbW2 = c112094ab.LJLJJL;
                if (i2 < 0) {
                    c59678NbW2.getClass();
                } else {
                    int i4 = 0;
                    while (true) {
                        if (i3 >= ((List) c59678NbW2.LIZLLL).size()) {
                            break;
                        }
                        InterfaceC105334Bl interfaceC105334Bl = (InterfaceC105334Bl) ListProtector.get((List) c59678NbW2.LIZLLL, i3);
                        if (i2 < interfaceC105334Bl.LIZIZ() + i4) {
                            c59678NbW2.LIZ = i3;
                            c59678NbW2.LIZIZ = interfaceC105334Bl;
                            interfaceC105334Bl.LJI(i2 - i4);
                            break;
                        }
                        i4 += interfaceC105334Bl.LIZIZ();
                        i3++;
                    }
                }
                C112094ab c112094ab2 = C112094ab.this;
                C112094ab.LJLL = c112094ab2.LJLJJL.LIZ;
                c112094ab2.LJ();
            }
        });
        this.LJLJJLL = true;
        int i2 = LJLL;
        if (i2 >= 0 && i2 < ((List) c59678NbW.LIZLLL).size()) {
            c59678NbW.LIZ = i2;
            c59678NbW.LIZIZ = ListProtector.get((List) c59678NbW.LIZLLL, i2);
        }
        Iterator it = ((List) c59678NbW.LIZLLL).iterator();
        int i3 = 0;
        while (true) {
            if (it.hasNext()) {
                InterfaceC105334Bl interfaceC105334Bl = (InterfaceC105334Bl) it.next();
                InterfaceC105334Bl interfaceC105334Bl2 = (InterfaceC105334Bl) c59678NbW.LIZIZ;
                if (interfaceC105334Bl == interfaceC105334Bl2) {
                    i = interfaceC105334Bl2.LJIIJ() + i3;
                    break;
                }
                i3 += interfaceC105334Bl.LIZIZ();
            } else {
                i = 0;
                break;
            }
        }
        LIZLLL().setCurrentItem(i, false);
        if (this.LJLJJLL && i == 0) {
            this.LJLJJLL = false;
            LIZLLL().getCurrentItem();
            C59678NbW emojiPanelModel = this.LJLJJL;
            o.LJIIIZ(emojiPanelModel, "emojiPanelModel");
            this.LJLJI.LLLLIIIILLL();
        }
    }
}
