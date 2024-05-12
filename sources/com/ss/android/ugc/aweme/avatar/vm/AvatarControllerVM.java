package com.ss.android.ugc.aweme.avatar.vm;

import X.AUU;
import X.AbstractC53585L1h;
import X.C221108m2;
import X.C33712DKy;
import X.C37179EiV;
import X.C53656L4a;
import X.C53657L4b;
import X.C53658L4c;
import X.C62822Ol8;
import X.EnumC53663L4h;
import X.InterfaceC53591L1n;
import X.L4L;
import X.L4M;
import X.L4T;
import X.L4W;
import X.L4Y;
import X.L4Z;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.Map;
import kotlin.jvm.internal.AqS62S1100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AvatarControllerVM extends ViewModel {
    public String LJLIL;
    public AUU LJLJI;
    public final MutableLiveData<Map<L4T, L4W>> LJLJLJ;
    public final MutableLiveData LJLJLLL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(L4Y.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C53657L4b.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(L4Z.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C53656L4a.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C53658L4c.LJLIL);

    public final Map<EnumC53663L4h, AbstractC53585L1h<?, ?>> gv0() {
        return (Map) this.LJLJJI.getValue();
    }

    public final Map<EnumC53663L4h, InterfaceC53591L1n<?, ?>> hv0() {
        return (Map) this.LJLJL.getValue();
    }

    public AvatarControllerVM() {
        MutableLiveData<Map<L4T, L4W>> mutableLiveData = new MutableLiveData<>();
        this.LJLJLJ = mutableLiveData;
        this.LJLJLLL = mutableLiveData;
    }

    public final void iv0(EnumC53663L4h enumC53663L4h, Object data, String str, boolean z) {
        if (str == null || !o.LJ(str, this.LJLIL)) {
            return;
        }
        System.currentTimeMillis();
        L4L l4l = (L4L) this.LJLILLLLZI.getValue();
        AqS62S1100000_9 aqS62S1100000_9 = new AqS62S1100000_9(str, this, 2);
        l4l.getClass();
        o.LJIIIZ(data, "data");
        if (((Boolean) C33712DKy.LIZIZ.getValue()).booleanValue()) {
            C37179EiV.LIZJ(false).execute(new L4M(z, l4l, data, enumC53663L4h, aqS62S1100000_9));
            return;
        }
        if (z) {
            l4l.LIZLLL();
        }
        l4l.LIZIZ(data, !z, enumC53663L4h);
        aqS62S1100000_9.invoke(l4l.LJII);
    }
}
