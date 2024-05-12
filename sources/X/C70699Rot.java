package X;

import Y.IDhS105S0100000_12;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rot */
/* loaded from: classes13.dex */
public final class C70699Rot extends AbstractC73313Spx {
    public static final java.util.Map<String, C70699Rot> LJLLLL = new LinkedHashMap();
    public final C70702Row LJLILLLLZI;
    public final C70703Rox LJLJI;
    public final C70704Roy LJLJJI;
    public final C70705Roz LJLJJL;
    public boolean LJLJJLL;
    public AqS143S0200000_12 LJLJL;
    public IDqS436S0100000_12 LJLJLJ;
    public AbstractC65781Prl LJLJLLL;
    public AqS194S0100000_12 LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public final int LJLLL;

    public C70699Rot() {
        C70702Row c70702Row = new C70702Row();
        this.LJLILLLLZI = c70702Row;
        C70703Rox c70703Rox = new C70703Rox();
        this.LJLJI = c70703Rox;
        C70704Roy c70704Roy = new C70704Roy();
        this.LJLJJI = c70704Roy;
        C70705Roz c70705Roz = new C70705Roz();
        this.LJLJJL = c70705Roz;
        this.LJLJJLL = true;
        this.LJLLL = -1;
        QXX.LLJLILLLLZIIL(this, c70702Row, c70704Roy);
        QXX.LLJLILLLLZIIL(this, c70703Rox, c70705Roz);
    }

    public final C73805Sxt LLLLZLLIL(ReviewApi.ReviewRequest reviewRequest) {
        C73985T1x LJJIIJZLJL;
        LJJIIJZLJL = C77117UOj.LJJIIJZLJL(this.LJLILLLLZI, this.LJLJJI, C77118UOk.LJLIL);
        return LJJIIJZLJL.LIZ(C73328SqC.LJLIL).LIZ(reviewRequest).LJJIJL(new IDhS105S0100000_12(this, 26));
    }

    public final C73805Sxt LLLZI(ReviewApi.ListShopReviewRequest listShopReviewRequest) {
        C73985T1x LJJIIJZLJL;
        LJJIIJZLJL = C77117UOj.LJJIIJZLJL(this.LJLJI, this.LJLJJL, C77118UOk.LJLIL);
        return LJJIIJZLJL.LIZ(C73328SqC.LJLIL).LIZ(listShopReviewRequest).LJJIJL(new IDhS105S0100000_12(this, 27));
    }

    public final void LLLLZ(int i, String str, boolean z) {
        String str2;
        List<ReviewItemStruct> list;
        Object remove;
        String str3;
        List<ShopReviewItemStruct> list2;
        Object remove2;
        ReviewItemStruct.MainReview mainReview;
        if (i == 2) {
            C70705Roz c70705Roz = this.LJLJJL;
            AqS16S0010000_12 aqS16S0010000_12 = new AqS16S0010000_12(z, 24);
            c70705Roz.getClass();
            Iterator LJ = C06540Nm.LJ(c70705Roz.LIZJ, "cache.values");
            while (LJ.hasNext()) {
                ListShopReviewData listShopReviewData = (ListShopReviewData) LJ.next();
                List<ShopReviewItemStruct> list3 = listShopReviewData.reviewItems;
                if (list3 != null) {
                    Iterator<ShopReviewItemStruct> it = list3.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ReviewItemStruct reviewItemStruct = it.next().reviewItemStruct;
                        if (reviewItemStruct != null && (mainReview = reviewItemStruct.review) != null) {
                            str3 = mainReview.reviewId;
                        } else {
                            str3 = null;
                        }
                        if (o.LJ(str3, str)) {
                            if (i2 != -1 && (list2 = listShopReviewData.reviewItems) != null && (remove2 = ListProtector.remove(list2, i2)) != null) {
                                ListProtector.add(listShopReviewData.reviewItems, i2, aqS16S0010000_12.invoke(remove2));
                            }
                        } else {
                            i2++;
                        }
                    }
                }
            }
        } else {
            C70704Roy c70704Roy = this.LJLJJI;
            AqS16S0010000_12 aqS16S0010000_122 = new AqS16S0010000_12(z, 23);
            c70704Roy.getClass();
            Iterator LJ2 = C06540Nm.LJ(c70704Roy.LIZJ, "cache.values");
            while (LJ2.hasNext()) {
                ListReviewData listReviewData = (ListReviewData) LJ2.next();
                List<ReviewItemStruct> list4 = listReviewData.reviewItems;
                if (list4 != null) {
                    Iterator<ReviewItemStruct> it2 = list4.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ReviewItemStruct.MainReview mainReview2 = it2.next().review;
                        if (mainReview2 != null) {
                            str2 = mainReview2.reviewId;
                        } else {
                            str2 = null;
                        }
                        if (o.LJ(str2, str)) {
                            if (i3 != -1 && (list = listReviewData.reviewItems) != null && (remove = ListProtector.remove(list, i3)) != null) {
                                ListProtector.add(listReviewData.reviewItems, i3, aqS16S0010000_122.invoke(remove));
                            }
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        ReviewApi.LIZ.getClass();
        if (z) {
            ((ReviewApi) C70708Rp2.LIZIZ.create(ReviewApi.class)).dig(new ReviewApi.ReviewDiggRequest(str)).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Ea
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                }
            }, new InterfaceC64592gB() { // from class: X.9Eb
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        } else {
            ((ReviewApi) C70708Rp2.LIZIZ.create(ReviewApi.class)).unDig(new ReviewApi.ReviewDiggRequest(str)).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Ec
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                }
            }, new InterfaceC64592gB() { // from class: X.9Ed
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [X.Yns, X.Prl] */
    public final void LLLZIL(ReviewItemStruct reviewItemStruct, List<C70717RpB> list, String str, Integer num) {
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        boolean z2;
        Boolean bool;
        String str6;
        String str7;
        String str8;
        List<ReviewMedia> list2;
        List<ReviewAspectItem> list3;
        ReviewAspectItem reviewAspectItem;
        ReviewAspectOption reviewAspectOption;
        ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
        if (mainReview != null) {
            str2 = mainReview.reviewId;
            str3 = mainReview.rating;
        } else {
            str2 = null;
            str3 = null;
        }
        String str9 = reviewItemStruct.specification;
        Integer num2 = reviewItemStruct.diggCount;
        Boolean bool2 = reviewItemStruct.isDigged;
        ReviewItemStruct.User user = reviewItemStruct.user;
        if (mainReview != null) {
            str4 = mainReview.text;
        } else {
            str4 = null;
        }
        String str10 = reviewItemStruct.skuId;
        Boolean bool3 = reviewItemStruct.isOwner;
        if (bool3 != null) {
            z = bool3.booleanValue();
        } else {
            z = false;
        }
        if (mainReview != null) {
            str5 = mainReview.reviewTimeStamp;
        } else {
            str5 = null;
        }
        Boolean bool4 = reviewItemStruct.isAnonymous;
        if (bool4 != null) {
            z2 = bool4.booleanValue();
        } else {
            z2 = false;
        }
        if (mainReview != null) {
            bool = mainReview.hasOriginText;
            str6 = mainReview.reviewTimestampFmt;
        } else {
            bool = null;
            str6 = null;
        }
        String str11 = reviewItemStruct.reviewSourceName;
        Integer num3 = reviewItemStruct.reviewSourceType;
        String str12 = reviewItemStruct.reviewLink;
        ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
        if (mainReview2 != null && (list3 = mainReview2.reviewAspectItems) != null && (reviewAspectItem = (ReviewAspectItem) ORZ.LJLLLL(list3)) != null && (reviewAspectOption = reviewAspectItem.answer) != null) {
            str7 = reviewAspectOption.optionText;
        } else {
            str7 = null;
        }
        C69698RXa c69698RXa = new C69698RXa(str2, str3, str9, num2, bool2, user, str4, str10, z, str5, z2, bool, str6, str11, num3, str12, str7);
        ArrayList arrayList = new ArrayList();
        if (mainReview != null) {
            List<ReviewMedia> list4 = mainReview.media;
            if (list4 != null) {
                arrayList.addAll(list4);
            }
            ReviewItemStruct.AppendReview appendReview = mainReview.appendReview;
            if (appendReview != null && (list2 = appendReview.media) != null) {
                arrayList.addAll(list2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C70717RpB c70717RpB = new C70717RpB((ReviewMedia) it.next(), c69698RXa);
            if (!this.LJLLI && str != null && num != null) {
                if (mainReview != null) {
                    str8 = mainReview.reviewId;
                } else {
                    str8 = null;
                }
                if (!o.LJ(str8, str)) {
                    this.LJLLJ++;
                } else {
                    this.LJLLI = true;
                    int intValue = num.intValue() + this.LJLLJ;
                    this.LJLLJ = intValue;
                    ?? r1 = this.LJLJLLL;
                    if (r1 != 0) {
                        r1.invoke(Integer.valueOf(intValue));
                    }
                    this.LJLLJ = 0;
                }
            }
            ((ArrayList) list).add(c70717RpB);
        }
    }

    public final AbstractC73672Svk<OSZ<List<C70717RpB>, C70839Rr9>> LLLLZIL(ReviewApi.ReviewRequest reviewRequest, String str, Integer num, String str2, int i, boolean z) {
        C73985T1x LJJIIJZLJL;
        if (C78685UuP.LJJJZ(str2) && !this.LJLLILLLL) {
            this.LJLLILLLL = true;
            ArrayList arrayList = new ArrayList();
            C70677RoX[] c70677RoXArr = null;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C71284RyK.LIZ("product_review_gallery", str2), C65330PkU.LIZJ(C65352Pkq.LJII(C70677RoX[].class, C65340Pke.LIZ(C65352Pkq.LJI(C70677RoX.class)))));
                if (!(fromJson instanceof C70677RoX[])) {
                    fromJson = null;
                }
                c70677RoXArr = (C70677RoX[]) fromJson;
            } catch (s unused) {
            }
            if (c70677RoXArr != null) {
                for (C70677RoX c70677RoX : c70677RoXArr) {
                    LLLZIL(c70677RoX.LIZ, arrayList, str, num);
                }
            }
            if (!arrayList.isEmpty()) {
                return AbstractC73672Svk.LJJIJIL(new OSZ(arrayList, new C70839Rr9(z, i)));
            }
        }
        LJJIIJZLJL = C77117UOj.LJJIIJZLJL(this.LJLILLLLZI, this.LJLJJI, C77118UOk.LJLIL);
        return LJJIIJZLJL.LIZ(C73328SqC.LJLIL).LIZ(reviewRequest).LJJIJL(new C70701Rov(this, str, num));
    }

    public final AbstractC73672Svk<OSZ<List<C70717RpB>, C70839Rr9>> LLLLZLLLI(ReviewApi.ListShopReviewRequest listShopReviewRequest, String str, Integer num, String str2, int i, boolean z, Integer num2) {
        C73985T1x LJJIIJZLJL;
        if (C78685UuP.LJJJZ(str2) && !this.LJLLILLLL) {
            this.LJLLILLLL = true;
            ArrayList arrayList = new ArrayList();
            String LIZ = C71284RyK.LIZ("product_review_gallery", str2);
            int type = EnumC70719RpD.SHOP_TAB_REVIEW_GALLERY.getType();
            ShopReviewItemStruct[] shopReviewItemStructArr = null;
            C70677RoX[] c70677RoXArr = null;
            int i2 = 0;
            if (num2 != null && num2.intValue() == type) {
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), LIZ, C65330PkU.LIZJ(C65352Pkq.LJII(ShopReviewItemStruct[].class, C65340Pke.LIZ(C65352Pkq.LJI(ShopReviewItemStruct.class)))));
                    if (!(fromJson instanceof ShopReviewItemStruct[])) {
                        fromJson = null;
                    }
                    shopReviewItemStructArr = (ShopReviewItemStruct[]) fromJson;
                } catch (s unused) {
                }
                if (shopReviewItemStructArr != null) {
                    int length = shopReviewItemStructArr.length;
                    while (i2 < length) {
                        ReviewItemStruct reviewItemStruct = shopReviewItemStructArr[i2].reviewItemStruct;
                        if (reviewItemStruct != null) {
                            LLLZIL(reviewItemStruct, arrayList, str, num);
                        }
                        i2++;
                    }
                }
            } else {
                try {
                    Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), LIZ, C65330PkU.LIZJ(C65352Pkq.LJII(C70677RoX[].class, C65340Pke.LIZ(C65352Pkq.LJI(C70677RoX.class)))));
                    if (!(fromJson2 instanceof C70677RoX[])) {
                        fromJson2 = null;
                    }
                    c70677RoXArr = (C70677RoX[]) fromJson2;
                } catch (s unused2) {
                }
                if (c70677RoXArr != null) {
                    int length2 = c70677RoXArr.length;
                    while (i2 < length2) {
                        LLLZIL(c70677RoXArr[i2].LIZ, arrayList, str, num);
                        i2++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return AbstractC73672Svk.LJJIJIL(new OSZ(arrayList, new C70839Rr9(z, i)));
            }
        }
        LJJIIJZLJL = C77117UOj.LJJIIJZLJL(this.LJLJI, this.LJLJJL, C77118UOk.LJLIL);
        return LJJIIJZLJL.LIZ(C73328SqC.LJLIL).LIZ(listShopReviewRequest).LJJIJL(new C70700Rou(this, str, num));
    }

    public static /* synthetic */ AbstractC73672Svk LLLZ(C70699Rot c70699Rot, ReviewApi.ListShopReviewRequest listShopReviewRequest, String str, Integer num, String str2, int i, boolean z, Integer num2, int i2) {
        Integer num3 = num;
        String str3 = str;
        String str4 = str2;
        int i3 = i;
        boolean z2 = z;
        Integer num4 = null;
        if ((i2 & 2) != 0) {
            str3 = null;
        }
        if ((i2 & 4) != 0) {
            num3 = null;
        }
        if ((i2 & 8) != 0) {
            str4 = null;
        }
        if ((i2 & 16) != 0) {
            i3 = 0;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        if ((i2 & 64) == 0) {
            num4 = num2;
        }
        return c70699Rot.LLLLZLLLI(listShopReviewRequest, str3, num3, str4, i3, z2, num4);
    }
}
