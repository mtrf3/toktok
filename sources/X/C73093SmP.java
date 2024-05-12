package X;

import Y.ACListenerS46S0200000_12;
import Y.IDComparatorS40S0000000_12;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SmP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73093SmP implements IBR {
    public static final /* synthetic */ int LJLIL = 0;

    /* JADX WARN: Type inference failed for: r5v0, types: [X.TFg, T, java.lang.Object] */
    @Override // X.IBR
    public final T4C LIZLLL(C29S mActivity, TEZ stickerDataManager, InterfaceC46204IBk clickController, InterfaceC84497XEf interfaceC84497XEf, ShortVideoContext shortVideoContext, I9W i9w, InterfaceC45540Hu4 interfaceC45540Hu4) {
        o.LJIIIZ(mActivity, "mActivity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(clickController, "clickController");
        C68322mC c68322mC = new C68322mC();
        C73094SmQ c73094SmQ = new C73094SmQ(c68322mC);
        C60903NvH.LJIIJJI().getUiService().getClass();
        ?? viewOnClickListenerC74332TFg = new ViewOnClickListenerC74332TFg(C73096SmS.LJLIL, new AqS162S0100000_12(mActivity, 967), stickerDataManager, clickController, new IAS(shortVideoContext), mActivity, new C44192HWa(shortVideoContext, interfaceC45540Hu4, mActivity, c73094SmQ, i9w), C2311895m.LIZIZ());
        viewOnClickListenerC74332TFg.LLIIIJ = new ACListenerS46S0200000_12((Object) viewOnClickListenerC74332TFg, new C74347TFv(), 22);
        c68322mC.element = viewOnClickListenerC74332TFg;
        T4C t4c = new T4C();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c68322mC.element);
        arrayList.add(new C72859Sid(!C2311895m.LIZIZ()));
        arrayList.add(CommerceToolsStickerServiceImpl.LJIIL().LJII(shortVideoContext, new C43284Gym(shortVideoContext), arrayList));
        C72861Sif c72861Sif = new C72861Sif();
        c72861Sif.LJLILLLLZI = new ACListenerS46S0200000_12(c72861Sif, new TIN(mActivity, stickerDataManager, i9w), 21);
        arrayList.add(c72861Sif);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object handler = it.next();
            o.LJIIIZ(handler, "handler");
            if (!((ArrayList) t4c.LJLILLLLZI).contains(handler)) {
                ((ArrayList) t4c.LJLILLLLZI).add(handler);
            }
            ArrayList arrayList2 = (ArrayList) t4c.LJLILLLLZI;
            if (arrayList2.size() > 1) {
                C40675Fxn.LJJLIIIJ(arrayList2, new IDComparatorS40S0000000_12(4));
            }
        }
        return t4c;
    }
}
