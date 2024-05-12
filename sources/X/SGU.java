package X;

import Y.ACListenerS21S0100000_1;
import Y.IDDListenerS151S0100000_12;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGU extends SGX {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        o.LJIIIZ(type, "type");
        List<SGW> items = ((SGV) xBaseParamModel).getItems();
        ArrayList arrayList = new ArrayList(C32I.LJJL(items, 10));
        for (SGW sgw : items) {
            C252659vp c252659vp = new C252659vp();
            c252659vp.LIZIZ(sgw.getTitle());
            c252659vp.LJI = new AqS178S0100000_12(sgw, 389);
            c252659vp.LJ = new ACListenerS21S0100000_1(new AqS143S0200000_12(c37356ElM, sgw, 84), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            arrayList.add(c252659vp);
        }
        C252659vp[] c252659vpArr = (C252659vp[]) arrayList.toArray(new C252659vp[0]);
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            C245319jz c245319jz = new C245319jz();
            c245319jz.LIZ((C252659vp[]) Arrays.copyOf(c252659vpArr, c252659vpArr.length));
            c245319jz.LIZ.LJLILLLLZI = new IDDListenerS151S0100000_12(c37356ElM, 3);
            c245319jz.LIZJ().show(supportFragmentManager, this.LJLILLLLZI);
        }
    }
}
