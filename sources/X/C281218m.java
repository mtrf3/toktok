package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;

/* renamed from: X.18m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C281218m implements C02O, AdapterView.OnItemClickListener {
    public Context LJLIL;
    public LayoutInflater LJLILLLLZI;
    public C281318n LJLJI;
    public C280918j LJLJJI;
    public C02N LJLJJL;
    public C02H LJLJJLL;

    @Override // X.C02O
    public final boolean LJ(C281618q c281618q) {
        return false;
    }

    @Override // X.C02O
    public final boolean LJI(C281618q c281618q) {
        return false;
    }

    @Override // X.C02O
    public final boolean LJII() {
        return false;
    }

    @Override // X.C02O
    public final int getId() {
        return 0;
    }

    @Override // X.C02O
    public final Parcelable LIZIZ() {
        if (this.LJLJJI == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        C280918j c280918j = this.LJLJJI;
        if (c280918j != null) {
            c280918j.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public C281218m(Context context) {
        this.LJLIL = context;
        this.LJLILLLLZI = C16880lQ.LLZIL(context);
    }

    @Override // X.C02O
    public final void LIZJ(boolean z) {
        C02H c02h = this.LJLJJLL;
        if (c02h != null) {
            c02h.notifyDataSetChanged();
        }
    }

    @Override // X.C02O
    public final boolean LJFF(SubMenuC39851hN subMenuC39851hN) {
        if (!subMenuC39851hN.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC281418o dialogInterfaceOnKeyListenerC281418o = new DialogInterfaceOnKeyListenerC281418o(subMenuC39851hN);
        AnonymousClass025 anonymousClass025 = new AnonymousClass025(subMenuC39851hN.LIZ);
        C281218m c281218m = new C281218m(anonymousClass025.LIZ.LIZ);
        dialogInterfaceOnKeyListenerC281418o.LJLJI = c281218m;
        c281218m.LJLJJL = dialogInterfaceOnKeyListenerC281418o;
        subMenuC39851hN.LIZIZ(c281218m, subMenuC39851hN.LIZ);
        C281218m c281218m2 = dialogInterfaceOnKeyListenerC281418o.LJLJI;
        if (c281218m2.LJLJJLL == null) {
            c281218m2.LJLJJLL = new C02H(c281218m2);
        }
        C02H c02h = c281218m2.LJLJJLL;
        C008901t c008901t = anonymousClass025.LIZ;
        c008901t.LJIILLIIL = c02h;
        c008901t.LJIIZILJ = dialogInterfaceOnKeyListenerC281418o;
        View view = subMenuC39851hN.LJIILJJIL;
        if (view != null) {
            c008901t.LJ = view;
        } else {
            c008901t.LIZJ = subMenuC39851hN.LJIILIIL;
            c008901t.LIZLLL = subMenuC39851hN.LJIIL;
        }
        c008901t.LJIILJJIL = dialogInterfaceOnKeyListenerC281418o;
        DialogInterfaceC39771hF LIZ = anonymousClass025.LIZ();
        dialogInterfaceOnKeyListenerC281418o.LJLILLLLZI = LIZ;
        LIZ.setOnDismissListener(dialogInterfaceOnKeyListenerC281418o);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC281418o.LJLILLLLZI.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        DialogInterfaceC39771hF dialogInterfaceC39771hF = dialogInterfaceOnKeyListenerC281418o.LJLILLLLZI;
        if (!new C03880Dg(2).LIZJ(300000, "androidx/appcompat/app/AlertDialog", "show", dialogInterfaceC39771hF, new Object[0], "void", new C65300Pk0(false, "()V", "-7212549358397002739")).LIZ) {
            dialogInterfaceC39771hF.show();
        }
        C02N c02n = this.LJLJJL;
        if (c02n != null) {
            c02n.LIZIZ(subMenuC39851hN);
            return true;
        }
        return true;
    }

    @Override // X.C02O
    public final void LJIIIZ(C02N c02n) {
        this.LJLJJL = c02n;
    }

    @Override // X.C02O
    public final void LJIIJ(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.LJLJJI.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // X.C02O
    public final void LIZ(C281318n c281318n, boolean z) {
        C02N c02n = this.LJLJJL;
        if (c02n != null) {
            c02n.LIZ(c281318n, z);
        }
    }

    @Override // X.C02O
    public final void LJIIIIZZ(Context context, C281318n c281318n) {
        if (this.LJLIL != null) {
            this.LJLIL = context;
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = C16880lQ.LLZIL(context);
            }
        }
        this.LJLJI = c281318n;
        C02H c02h = this.LJLJJLL;
        if (c02h != null) {
            c02h.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.LJLJI.LJIILLIIL(this.LJLJJLL.getItem(i), this, 0);
    }
}
