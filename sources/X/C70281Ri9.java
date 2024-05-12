package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ri9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70281Ri9 implements InterfaceC70389Rjt {
    public final /* synthetic */ C68322mC<String[]> LIZ;
    public final /* synthetic */ C70282RiA LIZIZ;
    public final /* synthetic */ List<SkuItem> LIZJ;

    @Override // X.InterfaceC70389Rjt
    public final void LIZ(int i, C70216Rh6 c70216Rh6) {
        String str;
        boolean z;
        String[] strArr = this.LIZ.element;
        C70282RiA c70282RiA = this.LIZIZ;
        List<SkuItem> skuList = this.LIZJ;
        String[] strArr2 = strArr;
        if (c70216Rh6 == null || (str = c70216Rh6.LIZ) == null) {
            str = "";
        }
        strArr2[i] = str;
        Iterator<C70387Rjr> it = c70282RiA.LJZ.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C70387Rjr next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C70387Rjr c70387Rjr = next;
                if (i2 != i) {
                    c70387Rjr.getClass();
                    o.LJIIIZ(skuList, "skuList");
                    Object[] copyOf = Arrays.copyOf(strArr2, strArr2.length);
                    o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                    String[] strArr3 = (String[]) copyOf;
                    int childCount = c70387Rjr.getChildCount();
                    for (int i4 = c70387Rjr.LJLJLLL; i4 < childCount; i4++) {
                        int i5 = i4 - c70387Rjr.LJLJLLL;
                        List<C70216Rh6> list = c70387Rjr.LJLJL;
                        if (list != null) {
                            if (i5 < list.size()) {
                                List<C70216Rh6> list2 = c70387Rjr.LJLJL;
                                if (list2 != null) {
                                    C70216Rh6 c70216Rh62 = (C70216Rh6) ListProtector.get(list2, i5);
                                    strArr3[c70387Rjr.LJLL] = c70216Rh62.LIZ;
                                    if (RXW.LIZ(skuList, strArr3) > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c70216Rh62.LJ = z;
                                    View specItemView = c70387Rjr.getChildAt(i4);
                                    o.LJIIIIZZ(specItemView, "specItemView");
                                    c70387Rjr.LIZLLL(specItemView, c70216Rh62);
                                } else {
                                    o.LJIJI("itemViewInfoList");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("itemViewInfoList");
                            throw null;
                        }
                    }
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        InterfaceC70280Ri8 interfaceC70280Ri8 = c70282RiA.LJZI;
        if (interfaceC70280Ri8 != null) {
            interfaceC70280Ri8.LIZIZ(strArr2);
        }
    }

    public C70281Ri9(C68322mC<String[]> c68322mC, C70282RiA c70282RiA, List<SkuItem> list) {
        this.LIZ = c68322mC;
        this.LIZIZ = c70282RiA;
        this.LIZJ = list;
    }

    @Override // X.InterfaceC70389Rjt
    public final void LIZIZ(int i, int i2, Image image, boolean z) {
        InterfaceC70280Ri8 interfaceC70280Ri8 = this.LIZIZ.LJZI;
        if (interfaceC70280Ri8 != null) {
            interfaceC70280Ri8.LIZJ(i, i2, image, z);
        }
    }
}
