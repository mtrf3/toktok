package X;

import android.content.Context;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS56S0110000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WlD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83211WlD extends AbstractC65781Prl implements InterfaceC88473Ynt<String, Boolean, String, C76800UCe> {
    public final /* synthetic */ C83222WlO LJLIL;
    public final /* synthetic */ C83210WlC LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83211WlD(C83222WlO c83222WlO, C83210WlC c83210WlC) {
        super(3);
        this.LJLIL = c83222WlO;
        this.LJLILLLLZI = c83210WlC;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, Boolean bool, String str2) {
        ArrayList arrayList;
        InterfaceC83246Wlm interfaceC83246Wlm;
        String categoryId = str;
        boolean booleanValue = bool.booleanValue();
        String enableBy = str2;
        o.LJIIIZ(categoryId, "categoryId");
        o.LJIIIZ(enableBy, "enableBy");
        C83216WlI c83216WlI = this.LJLILLLLZI.LJIJI;
        c83216WlI.getClass();
        c83216WlI.LIZ.LJ(categoryId, booleanValue);
        if (!booleanValue) {
            Iterator<ComposerBeauty> it = this.LJLIL.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                it.next().setSelected(false);
            }
            this.LJLILLLLZI.LJIJI.LIZJ(false);
            InterfaceC88471Ynr<? super Context, ? super String, C76800UCe> interfaceC88471Ynr = C82516Wa0.LIZJ;
            if (interfaceC88471Ynr != null) {
                Context context = this.LJLILLLLZI.LJIILLIIL;
                String string = context.getString(0);
                o.LJIIIIZZ(string, "context.getString(beauty_switch_off_tips)");
                interfaceC88471Ynr.invoke(context, string);
            }
        }
        InterfaceC83256Wlw interfaceC83256Wlw = (InterfaceC83256Wlw) this.LJLILLLLZI.LJIJI.LJ.LIZJ(InterfaceC83256Wlw.class);
        if (interfaceC83256Wlw != null) {
            interfaceC83256Wlw.LIZIZ();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSwitchStatus categoryId = ");
        LIZ.append(categoryId);
        LIZ.append(",value = ");
        LIZ.append(booleanValue);
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ));
        C83210WlC c83210WlC = this.LJLILLLLZI;
        c83210WlC.getClass();
        C83105WjV c83105WjV = C83105WjV.LJLIL;
        java.util.Map<BeautyCategory, List<ComposerBeauty>> map = c83210WlC.LJIILIIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (o.LJ(((BeautyCategory) entry.getKey()).getCategoryResponse().getId(), categoryId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List list = (List) ORZ.LJLLL(linkedHashMap.values());
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((ComposerBeauty) obj).getExtra().isNone()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        c83105WjV.LIZ(new AqS56S0110000_14(booleanValue, linkedHashMap2, 3), arrayList);
        C83216WlI c83216WlI2 = c83210WlC.LJIJI;
        c83216WlI2.getClass();
        InterfaceC83256Wlw interfaceC83256Wlw2 = (InterfaceC83256Wlw) c83216WlI2.LJ.LIZJ(InterfaceC83256Wlw.class);
        if (interfaceC83256Wlw2 != null) {
            interfaceC83256Wlw2.LIZ(linkedHashMap2);
        }
        C83216WlI c83216WlI3 = this.LJLILLLLZI.LJIJI;
        c83216WlI3.getClass();
        C68249QqT c68249QqT = c83216WlI3.LIZLLL;
        if (c68249QqT != null && (interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT.LIZ) != null) {
            interfaceC83246Wlm.LIZIZ(enableBy);
        }
        return C76800UCe.LIZ;
    }
}
