package X;

import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ASs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26270ASs implements InterfaceC26269ASr {
    public final SharePackage LJLIL;
    public final ATE LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    @Override // X.InterfaceC26269ASr
    public final SharePackage LJ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC26269ASr
    public final C26245ARt LIZ(AS3 as3) {
        return new C26245ARt(this, as3);
    }

    @Override // X.InterfaceC26269ASr
    public final List<AbstractC26277ASz> LIZIZ(AS3 as3) {
        return LJI(as3, true);
    }

    @Override // X.InterfaceC26269ASr
    public final List<AbstractC26277ASz> LIZJ(AS3 as3) {
        return LJI(as3, false);
    }

    @Override // X.InterfaceC26269ASr
    public final List<AS4> LIZLLL(AS3 as3) {
        List<InterfaceC62486Ofi> list = this.LJLILLLLZI.LIZLLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (InterfaceC62486Ofi interfaceC62486Ofi : list) {
            arrayList.add(new AS4(new C26265ASn(as3, this, interfaceC62486Ofi), new AS8(interfaceC62486Ofi.LJJIFFI(), C39849FkT.LIZ().getString(interfaceC62486Ofi.LJJII()))));
        }
        return arrayList;
    }

    public final List<AbstractC26277ASz> LJFF(AS3 as3) {
        List<InterfaceC62486Ofi> list = this.LJLILLLLZI.LIZLLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (InterfaceC62486Ofi interfaceC62486Ofi : list) {
            arrayList.add(new C26274ASw(new AS9(interfaceC62486Ofi.LJFF(), interfaceC62486Ofi.LJJII()), new C26265ASn(as3, this, interfaceC62486Ofi), interfaceC62486Ofi.LJJIFFI()));
        }
        return arrayList;
    }

    public C26270ASs(LiveSharePackage liveSharePackage, ATE ate) {
        this.LJLIL = liveSharePackage;
        this.LJLILLLLZI = ate;
    }

    public final List<AbstractC26277ASz> LJI(AS3 as3, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC62486Ofi interfaceC62486Ofi : this.LJLILLLLZI.LIZJ) {
            int i = C26272ASu.LIZ[interfaceC62486Ofi.LJIILLIIL().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        arrayList.add(new C26276ASy(new AS9(interfaceC62486Ofi.LJFF(), interfaceC62486Ofi.LJJII()), new C26268ASq(interfaceC62486Ofi, as3, this)));
                    } else {
                        arrayList.addAll(LJFF(as3));
                    }
                } else if (z) {
                    arrayList.addAll(LJFF(as3));
                    if (as3 instanceof ATB) {
                        ((ATB) as3).LLFFF = new DialogInterfaceOnDismissListenerC26271ASt(as3, this, interfaceC62486Ofi);
                    }
                } else {
                    arrayList.add(new C26276ASy(new AS9(interfaceC62486Ofi.LJFF(), interfaceC62486Ofi.LJJII()), new C26268ASq(interfaceC62486Ofi, as3, this)));
                }
            } else {
                arrayList.add(new C26275ASx(new AS9(interfaceC62486Ofi.LJFF(), interfaceC62486Ofi.LJJII()), new C26268ASq(interfaceC62486Ofi, as3, this), new AS0(this, as3)));
            }
        }
        return arrayList;
    }
}
