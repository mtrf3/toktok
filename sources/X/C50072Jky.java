package X;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Jky, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50072Jky implements InterfaceC50075Jl1 {
    @Override // X.InterfaceC50075Jl1
    public final void LIZ(C50073Jkz c50073Jkz) {
        View view;
        C50070Jkw c50070Jkw;
        String str;
        boolean z;
        int i;
        C50160JmO LIZJ;
        C50160JmO LIZJ2;
        View view2 = c50073Jkz.LJ;
        String str2 = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.ck4);
        } else {
            view = null;
        }
        if (!(view instanceof C50070Jkw) || (c50070Jkw = (C50070Jkw) view) == null) {
            return;
        }
        c50070Jkw.setOnVisibleChanged(new AqS174S0100000_8(c50073Jkz, 269));
        InterfaceC50157JmL LIZ = K0M.LIZ();
        if (LIZ != null && (LIZJ2 = LIZ.LIZJ()) != null) {
            str = LIZJ2.LIZ;
        } else {
            str = null;
        }
        String LJFF = C50605JtZ.LJFF(c50073Jkz.LIZLLL);
        InterfaceC50157JmL LIZ2 = K0M.LIZ();
        if (LIZ2 != null && (LIZJ = LIZ2.LIZJ()) != null) {
            str2 = LIZJ.LIZJ;
        }
        OSZ[] oszArr = new OSZ[4];
        String str3 = "";
        if (str == null) {
            str = "";
        }
        oszArr[0] = new OSZ("search_id", str);
        oszArr[1] = new OSZ("search_type", LJFF);
        String str4 = c50073Jkz.LIZJ;
        if (str4 != null) {
            str3 = str4;
        }
        oszArr[2] = new OSZ("use_scenario", str3);
        if (str2 == null) {
            str2 = "else";
        }
        oszArr[3] = new OSZ("tns_ban_type", str2);
        c50070Jkw.LIZIZ(c50073Jkz.LIZIZ, C113554cx.LJJL(oszArr));
        C49730JfS c49730JfS = c50073Jkz.LJII;
        if (c49730JfS != null) {
            if (c50070Jkw.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf != null) {
                valueOf.booleanValue();
                if (o.LJ(valueOf, Boolean.valueOf(c49730JfS.LJLILLLLZI))) {
                    return;
                }
                c49730JfS.LJLILLLLZI = valueOf.booleanValue();
                LiveData liveData = (LiveData) c49730JfS.LJLJI.getValue();
                if (valueOf.booleanValue()) {
                    i = 0;
                } else {
                    i = 1;
                }
                liveData.setValue(i);
            }
        }
    }
}
