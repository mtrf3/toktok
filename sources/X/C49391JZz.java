package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JZz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49391JZz implements InterfaceC49469JbF {
    public final InterfaceC65784Pro<User> LIZ;
    public final InterfaceC65784Pro<JQA> LIZIZ;
    public final InterfaceC65784Pro<String> LIZJ;
    public final InterfaceC65784Pro<String> LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C2VK.LJLIL);

    @Override // X.InterfaceC49469JbF
    public final void LIZ(Product product, int i) {
        o.LJIIIZ(product, "product");
        String LIZ = product.LIZ();
        if (LIZ == null || LIZ.length() == 0 || !this.LJ.invoke().booleanValue()) {
            return;
        }
        Object obj = ((java.util.Map) this.LJFF.getValue()).get(LIZ);
        if (obj == null) {
            ((java.util.Map) this.LJFF.getValue()).put(LIZ, Boolean.TRUE);
            obj = Boolean.FALSE;
        }
        if (o.LJ(obj, Boolean.TRUE)) {
            return;
        }
        JQA invoke = this.LIZIZ.invoke();
        java.util.Map LIZIZ = C49365JYz.LIZIZ(this.LIZ.invoke(), product, invoke);
        LIZIZ.put("item_order", String.valueOf(i + 1));
        C49392Ja0 c49392Ja0 = new C49392Ja0();
        c49392Ja0.LJIILLIIL(LIZIZ);
        c49392Ja0.LJIILIIL();
        JN8 LIZIZ2 = JND.LIZIZ(invoke);
        LIZIZ2.LJIJ("search_result_id", invoke.LJIILJJIL);
        LIZIZ2.LJIIZILJ("token_type", this.LIZJ.invoke());
        LIZIZ2.LJJIIJZLJL(this.LIZLLL.invoke());
        LIZIZ2.LJIIZILJ("list_result_type", "mt_goods");
        LIZIZ2.LJIIZILJ("list_item_id", LIZ);
        LIZIZ2.LIZLLL("aladdin_words", product.title);
        LIZIZ2.LJJIII(Integer.valueOf(i));
        LIZIZ2.LJJIIJ(1);
        LIZIZ2.LJIILIIL();
    }

    public C49391JZz(AqS158S0100000_8 aqS158S0100000_8, AqS158S0100000_8 aqS158S0100000_82, AqS158S0100000_8 aqS158S0100000_83, AqS158S0100000_8 aqS158S0100000_84, AqS158S0100000_8 aqS158S0100000_85) {
        this.LIZ = aqS158S0100000_8;
        this.LIZIZ = aqS158S0100000_82;
        this.LIZJ = aqS158S0100000_83;
        this.LIZLLL = aqS158S0100000_84;
        this.LJ = aqS158S0100000_85;
    }
}
