package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.cart.CartCache;
import com.ss.android.ugc.aweme.ecommerce.base.cart.Image;
import com.ss.android.ugc.aweme.ecommerce.base.cart.Item;
import com.ss.android.ugc.aweme.ecommerce.base.cart.Seller;
import com.ss.android.ugc.aweme.ecommerce.base.cart.ShopCard;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2gR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64752gR {
    public static final CopyOnWriteArrayList<String> LIZ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<String> LIZIZ = new CopyOnWriteArrayList<>();

    public static String LIZ() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cart_cache_");
        LIZ2.append(createIUserServicebyMonsterPlugin.getCurrentUserID());
        return C71284RyK.LIZ("cart_cache", X1D.LIZIZ(LIZ2));
    }

    public static void LIZIZ(String str) {
        List<ShopCard> shopCards;
        Image avatar;
        List<String> urlList;
        Object LJLLLL;
        List<String> urlList2;
        Object LJLLLL2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (str != null) {
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(CartCache.class)));
                if (!(fromJson instanceof CartCache)) {
                    fromJson = null;
                }
                CartCache cartCache = (CartCache) fromJson;
                if (cartCache != null && (shopCards = cartCache.getShopCards()) != null) {
                    for (ShopCard shopCard : shopCards) {
                        List<Item> items = shopCard.getItems();
                        if (items != null) {
                            Iterator<Item> it = items.iterator();
                            while (it.hasNext()) {
                                Image image = it.next().getImage();
                                if (image != null && (urlList2 = image.getUrlList()) != null && (LJLLLL2 = ORZ.LJLLLL(urlList2)) != null) {
                                    arrayList.add(LJLLLL2);
                                }
                            }
                        }
                        Seller seller = shopCard.getSeller();
                        if (seller != null && (avatar = seller.getAvatar()) != null && (urlList = avatar.getUrlList()) != null && (LJLLLL = ORZ.LJLLLL(urlList)) != null) {
                            arrayList2.add(LJLLLL);
                        }
                    }
                }
            } catch (s unused) {
            }
        }
        C64762gS.LIZ.getClass();
        if (C64762gS.LIZIZ) {
            if (!arrayList.isEmpty()) {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = LIZ;
                copyOnWriteArrayList.clear();
                ORS.LJJLIIIJILLIZJL(arrayList.subList(0, Math.min(arrayList.size(), C64762gS.LIZJ)), copyOnWriteArrayList);
            }
            if (!arrayList2.isEmpty()) {
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = LIZIZ;
                copyOnWriteArrayList2.clear();
                ORS.LJJLIIIJILLIZJL(arrayList2.subList(0, Math.min(arrayList2.size(), C64762gS.LIZLLL)), copyOnWriteArrayList2);
            }
        }
    }
}
