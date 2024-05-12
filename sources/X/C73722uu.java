package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.BagData;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.PreviewData;
import com.ss.android.ugc.aweme.ecommercelive.common.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.data.Product;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.shopbag.ShopBagPreview$fetchShoppingBagPreview$result$1", f = "ShopBagPreview.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73722uu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73722uu(Object obj, String str, InterfaceC67352kd<? super C73722uu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = obj;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73722uu(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        PreviewData previewData;
        BagData bagData;
        List<Product> list;
        boolean z;
        String str;
        String str2;
        C68322mC LIZ = C793239k.LIZ(obj);
        try {
            LIZ.element = C27739Aud.LJI(this.LJLIL);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        String str3 = (String) LIZ.element;
        if (str3 == null) {
            return null;
        }
        String roomId = this.LJLILLLLZI;
        o.LJIIIZ(roomId, "roomId");
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str3, C65330PkU.LIZJ(C65352Pkq.LJI(PreviewData.class)));
            if (!(fromJson instanceof PreviewData)) {
                fromJson = null;
            }
            previewData = (PreviewData) fromJson;
        } catch (s unused) {
            previewData = null;
        }
        if (previewData == null || (bagData = previewData.bagData) == null || (list = bagData.products) == null) {
            return str3;
        }
        OSZ[] oszArr = new OSZ[1];
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<Product> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().productId);
        }
        oszArr[0] = new OSZ("product_id_list", arrayList);
        C36033ECf.LIZLLL("live_view_action", roomId, C113554cx.LJJLIIIIJ(oszArr));
        C62822Ol8 c62822Ol8 = C73782v0.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str3;
        }
        final String str4 = C73712ut.LIZ;
        if (!C73732uv.LIZ(str4)) {
            AbstractC73692ur abstractC73692ur = new AbstractC73692ur(str4) { // from class: X.2uq
                @Override // X.AbstractC73692ur
                public final List<C78727Uv5> LIZ() {
                    CopyOnWriteArrayList<String> copyOnWriteArrayList = C73712ut.LIZIZ;
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(copyOnWriteArrayList, 10));
                    Iterator<String> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        String it3 = it2.next();
                        String str5 = this.LIZ;
                        o.LJIIIIZZ(it3, "it");
                        arrayList2.add(new C78727Uv5(str5, it3, 0, 0, 16380));
                    }
                    return arrayList2;
                }
            };
            C73732uv.LIZIZ.put(abstractC73692ur.LIZ, abstractC73692ur);
        }
        List<Product> subList = list.subList(0, Math.min(list.size(), ((Number) c62822Ol8.getValue()).intValue()));
        ArrayList arrayList2 = new ArrayList();
        Iterator<Product> it2 = subList.iterator();
        while (it2.hasNext()) {
            ECImage eCImage = it2.next().cover;
            if (eCImage != null && (str2 = eCImage.url) != null) {
                str = ujb.o.LJJJJZ(str2, "800", "216", false);
            } else {
                str = null;
            }
            if (str != null) {
                arrayList2.add(str);
            }
        }
        if (!(!arrayList2.isEmpty())) {
            return str3;
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = C73712ut.LIZIZ;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(arrayList2);
        return str3;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
