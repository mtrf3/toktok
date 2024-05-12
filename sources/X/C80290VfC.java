package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.material.internal.ParcelableSparseArray;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VfC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80290VfC implements C02O {
    public C72418SbW LJLIL;
    public LinearLayout LJLILLLLZI;
    public C281318n LJLJI;
    public int LJLJJI;
    public C80288VfA LJLJJL;
    public LayoutInflater LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public ColorStateList LJLJLLL;
    public ColorStateList LJLL;
    public Drawable LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public boolean LJLLLLLL = true;
    public int LJZL = -1;
    public final ViewOnClickListenerC80292VfE LL = new ViewOnClickListenerC80292VfE(this);

    @Override // X.C02O
    public final void LIZ(C281318n c281318n, boolean z) {
    }

    @Override // X.C02O
    public final boolean LJ(C281618q c281618q) {
        return false;
    }

    @Override // X.C02O
    public final boolean LJFF(SubMenuC39851hN subMenuC39851hN) {
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
    public final Parcelable LIZIZ() {
        C281618q c281618q;
        View actionView;
        Bundle bundle = new Bundle();
        if (this.LJLIL != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.LJLIL.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C80288VfA c80288VfA = this.LJLJJL;
        if (c80288VfA != null) {
            c80288VfA.getClass();
            Bundle bundle2 = new Bundle();
            C281618q c281618q2 = c80288VfA.LJLILLLLZI;
            if (c281618q2 != null) {
                bundle2.putInt("android:menu:checked", c281618q2.LIZ);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = c80288VfA.LJLIL.size();
            for (int i = 0; i < size; i++) {
                InterfaceC80303VfP interfaceC80303VfP = (InterfaceC80303VfP) ListProtector.get(c80288VfA.LJLIL, i);
                if ((interfaceC80303VfP instanceof C80297VfJ) && (c281618q = ((C80297VfJ) interfaceC80303VfP).LIZ) != null && (actionView = c281618q.getActionView()) != null) {
                    ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                    actionView.saveHierarchyState(parcelableSparseArray);
                    sparseArray2.put(c281618q.LIZ, parcelableSparseArray);
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.LJLILLLLZI != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.LJLILLLLZI.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // X.C02O
    public final int getId() {
        return this.LJLJJI;
    }

    @Override // X.C02O
    public final void LIZJ(boolean z) {
        C80288VfA c80288VfA = this.LJLJJL;
        if (c80288VfA != null) {
            c80288VfA.LJLLLLLL();
            c80288VfA.notifyDataSetChanged();
        }
    }

    @Override // X.C02O
    public final void LJIIJ(Parcelable parcelable) {
        C281618q c281618q;
        View actionView;
        SparseArray<Parcelable> sparseArray;
        C281618q c281618q2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.LJLIL.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C80288VfA c80288VfA = this.LJLJJL;
                c80288VfA.getClass();
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    c80288VfA.LJLJI = true;
                    int size = c80288VfA.LJLIL.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        InterfaceC80303VfP interfaceC80303VfP = (InterfaceC80303VfP) ListProtector.get(c80288VfA.LJLIL, i2);
                        if ((interfaceC80303VfP instanceof C80297VfJ) && (c281618q2 = ((C80297VfJ) interfaceC80303VfP).LIZ) != null && c281618q2.LIZ == i) {
                            c80288VfA.LJLZ(c281618q2);
                            break;
                        }
                        i2++;
                    }
                    c80288VfA.LJLJI = false;
                    c80288VfA.LJLLLLLL();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = c80288VfA.LJLIL.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        InterfaceC80303VfP interfaceC80303VfP2 = (InterfaceC80303VfP) ListProtector.get(c80288VfA.LJLIL, i3);
                        if ((interfaceC80303VfP2 instanceof C80297VfJ) && (c281618q = ((C80297VfJ) interfaceC80303VfP2).LIZ) != null && (actionView = c281618q.getActionView()) != null && (sparseArray = (SparseArray) sparseParcelableArray2.get(c281618q.LIZ)) != null) {
                            actionView.restoreHierarchyState(sparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.LJLILLLLZI.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // X.C02O
    public final void LJIIIIZZ(Context context, C281318n c281318n) {
        this.LJLJJLL = C16880lQ.LLZIL(context);
        this.LJLJI = c281318n;
        this.LJZI = context.getResources().getDimensionPixelOffset(R.dimen.mk);
    }
}
