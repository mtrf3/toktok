package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AyG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27964AyG {
    public static String LIZ(BillInfoData billInfoData) {
        List<PackedSku> list;
        StringBuilder sb = new StringBuilder();
        AddonOrder addonOrder = billInfoData.getAddonOrder();
        if (addonOrder != null) {
            list = addonOrder.getPackedSkus();
        } else {
            list = null;
        }
        LIZIZ(sb, list);
        List<ShopOrderNew> newShopOrders = billInfoData.getNewShopOrders();
        if (newShopOrders != null) {
            Iterator<ShopOrderNew> it = newShopOrders.iterator();
            while (it.hasNext()) {
                List<MainOrderInfo> list2 = it.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        LIZIZ(sb, it2.next().packedSkus);
                    }
                }
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static Integer LIZJ(BillInfoData billInfoData) {
        List<PackedSku> packedSkus;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AddonOrder addonOrder = billInfoData.getAddonOrder();
        if (addonOrder != null && (packedSkus = addonOrder.getPackedSkus()) != null) {
            Iterator<PackedSku> it = packedSkus.iterator();
            while (it.hasNext()) {
                Integer bizType = it.next().getBizType();
                if (bizType != null) {
                    linkedHashSet.add(Integer.valueOf(bizType.intValue()));
                }
            }
        }
        List<ShopOrderNew> newShopOrders = billInfoData.getNewShopOrders();
        if (newShopOrders != null) {
            Iterator<ShopOrderNew> it2 = newShopOrders.iterator();
            while (it2.hasNext()) {
                List<MainOrderInfo> list = it2.next().mainOrderInfos;
                if (list != null) {
                    Iterator<MainOrderInfo> it3 = list.iterator();
                    while (it3.hasNext()) {
                        List<PackedSku> list2 = it3.next().packedSkus;
                        if (list2 != null) {
                            Iterator<PackedSku> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                Integer bizType2 = it4.next().getBizType();
                                if (bizType2 != null) {
                                    linkedHashSet.add(Integer.valueOf(bizType2.intValue()));
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean contains = linkedHashSet.contains(Integer.valueOf(EnumC28000Ayq.TTS.getBizType()));
        boolean contains2 = linkedHashSet.contains(Integer.valueOf(EnumC28000Ayq.TTF.getBizType()));
        if (contains) {
            if (contains2) {
                return EnumC27989Ayf.HYBRID.getType();
            }
            return EnumC27989Ayf.TTS.getType();
        }
        if (contains2) {
            return EnumC27989Ayf.TTF.getType();
        }
        return EnumC27989Ayf.DEFAULT.getType();
    }

    public static void LIZIZ(StringBuilder sb, List list) {
        if (list == null) {
            return;
        }
        int size = list.size();
        int i = 0;
        if (size > 0 && sb.length() > 0) {
            sb.append(",");
        }
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String productId = ((PackedSku) obj).getProductId();
                if (productId != null) {
                    sb.append(productId);
                    if (i < size - 1) {
                        sb.append(",");
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
