package com.ss.android.ugc.aweme.ecommerce.base.osp.vm;

import X.ActivityC45651qj;
import X.B0J;
import X.C113554cx;
import X.C16880lQ;
import X.C1A8;
import X.C1GE;
import X.C1XY;
import X.C26560Abc;
import X.C26566Abi;
import X.C26755Ael;
import X.C26802AfW;
import X.C26965Ai9;
import X.C26999Aih;
import X.C27106AkQ;
import X.C27206Am2;
import X.C27590AsE;
import X.C27739Aud;
import X.C27806Avi;
import X.C27807Avj;
import X.C27808Avk;
import X.C27810Avm;
import X.C27811Avn;
import X.C27812Avo;
import X.C27813Avp;
import X.C27816Avs;
import X.C27820Avw;
import X.C27823Avz;
import X.C27855AwV;
import X.C27860Awa;
import X.C27915AxT;
import X.C27920AxY;
import X.C27926Axe;
import X.C27941Axt;
import X.C27944Axw;
import X.C27948Ay0;
import X.C27949Ay1;
import X.C27951Ay3;
import X.C27952Ay4;
import X.C27954Ay6;
import X.C27957Ay9;
import X.C27959AyB;
import X.C27963AyF;
import X.C27964AyG;
import X.C27969AyL;
import X.C27970AyM;
import X.C27985Ayb;
import X.C27994Ayk;
import X.C28006Ayw;
import X.C28025AzF;
import X.C28031AzL;
import X.C28032AzM;
import X.C28034AzO;
import X.C28035AzP;
import X.C28050Aze;
import X.C28059Azn;
import X.C28113B1p;
import X.C32I;
import X.C36636EZk;
import X.C36746EbW;
import X.C38350F3i;
import X.C39468FeK;
import X.C42625Go9;
import X.C45804HyK;
import X.C47261Igj;
import X.C61878OQg;
import X.C65330PkU;
import X.C65340Pke;
import X.C65352Pkq;
import X.C66822jm;
import X.C68322mC;
import X.C70313Rif;
import X.C70355RjL;
import X.C70356RjM;
import X.C73411SrX;
import X.C75792yF;
import X.C76542zS;
import X.C76800UCe;
import X.C77275UUl;
import X.C780334l;
import X.C78565UsT;
import X.C78609UtB;
import X.C78866UxK;
import X.C78948Uye;
import X.C78983UzD;
import X.C79057V0z;
import X.C84657XKj;
import X.EnumC26562Abe;
import X.EnumC27805Avh;
import X.EnumC27984Aya;
import X.EnumC28013Az3;
import X.EnumC28021AzB;
import X.EnumC28022AzC;
import X.EnumC28094B0w;
import X.EnumC58928NAu;
import X.InterfaceC60061Nhh;
import X.InterfaceC67352kd;
import X.InterfaceC71003Rtn;
import X.InterfaceC88472Yns;
import X.M2T;
import X.MBB;
import X.ORY;
import X.ORZ;
import X.QD3;
import X.RXX;
import X.SA4;
import X.SA5;
import X.SAN;
import X.X1D;
import X.XKQ;
import X.XKX;
import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.LocationInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoReqInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardRules;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentCertification;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentGuaranteeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Photos;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonProductInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LogisticData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderAvailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuitReasonData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubmitQuitReason;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OspAsyncInflateSettings;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItem;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import defpackage.e1;
import defpackage.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS0S2200100_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS29S1300000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.IDqS183S0200000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;

/* loaded from: classes5.dex */
public class OrderSubmitViewModel extends JediViewModel<OrderSubmitState> implements InterfaceC60061Nhh {
    public static final /* synthetic */ int LLLII = 0;
    public int LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public List<OrderShopDigest> LJLJLLL;
    public C27941Axt LJLL;
    public AddonOrder LJLLI;
    public ExceptionUX LJLLILLLL;
    public List<Region> LJLLJ;
    public String LJLLL;
    public OrderSubmitRequestParam LJLLLL;
    public ShippingAddress LJLZ;
    public BillInfoData LJZ;
    public ExceptionUX LJZI;
    public PaymentInfo LL;
    public boolean LLD;
    public List<PaymentMethod> LLF;
    public Boolean LLFFF;
    public QuitReasonData LLFII;
    public Boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLIIII;
    public boolean LLIIIJ;
    public long LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public HashMap<String, Object> LLIL;
    public C27954Ay6 LLILL;
    public List<String> LLILLIZIL;
    public List<String> LLILLJJLI;
    public List<String> LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public final List<VoucherInfoNew> LLILZLL;
    public final HashMap<String, List<VoucherInfoNew>> LLIZ;
    public String LLIZLLLIL;
    public PhoneCredit LLJ;
    public Integer LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public List<AddressPromotionSku> LLJILJILJ;
    public List<String> LLJILLL;
    public String LLJJ;
    public C27106AkQ LLJJI;
    public boolean LLJJIII;
    public volatile String LLJJIJI;
    public final AtomicBoolean LLJJIJIIJIL;
    public volatile Map<String, String> LLJJIJIL;
    public volatile List<AddonProductInfo> LLJJJ;
    public List<String> LLJJJIL;
    public C27926Axe LLJJJJ;
    public boolean LLJJJJJIL;
    public Boolean LLJJJJLIIL;
    public String LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public XKQ LLJLL;
    public HashMap<String, String> LLJLLIL;
    public Integer LLJLLL;
    public boolean LLJZ;
    public final C28031AzL LLJZIJLIL;
    public String LLL;
    public int LLLF;
    public final Map<String, List<PackedSku>> LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public final Map<String, BindInfoItem> LLLI;
    public Boolean LJLLLLLL = Boolean.FALSE;
    public String LJZL = "";
    public final CopyOnWriteArrayList<PaymentMethod> LLFF = new CopyOnWriteArrayList<>();
    public String LLII = "";
    public final HashMap<String, String> LLIIIILZ = new HashMap<>();
    public String LLIIIL = "";
    public final HashMap<String, Object> LLILII = new HashMap<>();
    public String LLILIL = "default_repo_id";

    public final List<PaymentMethod> Yv0() {
        List<PaymentMethod> list;
        PaymentMethodsData paymentMethods;
        PaymentMethodsData paymentMethods2;
        List[] listArr = new List[2];
        BillInfoData billInfoData = this.LJZ;
        List<PaymentMethod> list2 = null;
        if (billInfoData != null && (paymentMethods2 = billInfoData.getPaymentMethods()) != null) {
            list = paymentMethods2.paymentMethods;
        } else {
            list = null;
        }
        listArr[0] = list;
        BillInfoData billInfoData2 = this.LJZ;
        if (billInfoData2 != null && (paymentMethods = billInfoData2.getPaymentMethods()) != null) {
            list2 = paymentMethods.storedMethods;
        }
        listArr[1] = list2;
        return C32I.LJJLI(ORY.LJJIJLIJ(listArr));
    }

    public boolean tw0() {
        return false;
    }

    static {
        C16880lQ.LJLLJ(OrderSubmitViewModel.class);
    }

    public static void Ow0() {
        try {
            C79057V0z.LJJJJJ(C66822jm.LIZ, "ecom_last_quit_reason_time_stamp", String.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            C78983UzD.LJIILL("Keva Write Quit Reason Time Fail");
        }
    }

    public void Bw0() {
        setState(C27820Avw.LJLIL);
    }

    public final String Qv0() {
        Map hashMap;
        HashMap<String, Object> hashMap2 = this.LLIL;
        if (hashMap2 != null) {
            hashMap = C113554cx.LJJLIL(hashMap2);
        } else {
            hashMap = new HashMap();
        }
        hashMap.put("previous_page", "order_submit");
        hashMap.putAll(fw0(false));
        return C27739Aud.LJI(hashMap);
    }

    public final HashMap<String, Object> Xv0() {
        List<BillItem> list;
        String str;
        String currency;
        Summary summary;
        BillInfoData billInfoData = this.LJZ;
        BillItem billItem = null;
        if (billInfoData != null && (summary = billInfoData.getSummary()) != null) {
            list = summary.getBillItems();
        } else {
            list = null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (list != null) {
            Iterator<BillItem> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BillItem next = it.next();
                Integer itemType = next.getItemType();
                if (itemType != null && itemType.intValue() == 2) {
                    billItem = next;
                    break;
                }
            }
            BillItem billItem2 = billItem;
            if (billItem2 != null) {
                Price itemPrice = billItem2.getItemPrice();
                String str2 = "";
                if (itemPrice == null || (str = itemPrice.getPriceVal()) == null) {
                    str = "";
                }
                hashMap.put("total_tax", str);
                Price itemPrice2 = billItem2.getItemPrice();
                if (itemPrice2 != null && (currency = itemPrice2.getCurrency()) != null) {
                    str2 = currency;
                }
                hashMap.put("currency", str2);
            }
        }
        return hashMap;
    }

    public final List<VoucherInfoNew> Zv0() {
        ArrayList arrayList = new ArrayList();
        C78609UtB.LJJLI(this.LLIZ, new AqS167S0100000_1(arrayList, (List<VoucherInfoNew>) 38));
        C78609UtB.LJJLI(this.LLILZLL, new AqS167S0100000_1(arrayList, (List<VoucherInfoNew>) 39));
        return arrayList;
    }

    public final String aw0() {
        if (this.LJLJJLL == 0) {
            return "-1";
        }
        ArrayList arrayList = new ArrayList();
        List<OrderShopDigest> list = this.LJLJLLL;
        if (list != null) {
            Iterator<OrderShopDigest> it = list.iterator();
            while (it.hasNext()) {
                List<OrderSKUDTO> orderSKUs = it.next().getOrderSKUs();
                if (orderSKUs != null) {
                    Iterator<OrderSKUDTO> it2 = orderSKUs.iterator();
                    while (it2.hasNext()) {
                        String str = it2.next().cartItemId;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        return ORZ.LLD(arrayList, ",", null, null, null, 62);
    }

    public final String bw0() {
        String str;
        Object obj;
        String obj2;
        BillInfoData billInfoData = this.LJZ;
        if (billInfoData != null) {
            str = billInfoData.getDaInfo();
        } else {
            str = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        if (LJII == null || (obj = LJII.get("promotion_source")) == null || (obj2 = obj.toString()) == null) {
            return "";
        }
        return obj2;
    }

    public int hw0() {
        return EnumC28094B0w.CONTINUE.ordinal();
    }

    public final String iw0() {
        String promotionDaInfo;
        BillInfoData billInfoData = this.LJZ;
        if (billInfoData == null || (promotionDaInfo = billInfoData.getPromotionDaInfo()) == null) {
            return "";
        }
        return promotionDaInfo;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final OrderSubmitState kv0() {
        return new OrderSubmitState(0, null, null, false, null, null, false, false, null, null, null, 0, null, 0, 0, null, null, false, false, false, null, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, false, -1, 67108863, null);
    }

    public final String kw0() {
        List<ShopOrderNew> newShopOrders;
        List<UserRightDetail> list;
        List list2 = C61878OQg.INSTANCE;
        BillInfoData billInfoData = this.LJZ;
        if (billInfoData != null && (newShopOrders = billInfoData.getNewShopOrders()) != null) {
            Iterator<ShopOrderNew> it = newShopOrders.iterator();
            while (it.hasNext()) {
                List<MainOrderInfo> list3 = it.next().mainOrderInfos;
                if (list3 != null) {
                    Iterator<MainOrderInfo> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        List<PackedSku> list4 = it2.next().packedSkus;
                        if (list4 != null) {
                            for (PackedSku packedSku : list4) {
                                UserRight userRight = packedSku.getUserRight();
                                if (userRight != null && (list = userRight.userRightDetails) != null) {
                                    if (list2.size() < list.size()) {
                                        list2 = packedSku.getUserRight().userRightDetails;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            sb.append(((UserRightDetail) it3.next()).nameEn);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(s.LJJLIIIJ(sb));
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "rightContent.toString()");
        return sb2;
    }

    public void lw0() {
        List<ShopOrderNew> list;
        BillInfoData billInfoData = this.LJZ;
        BillInfoData billInfoData2 = null;
        if (billInfoData != null) {
            list = billInfoData.getNewShopOrders();
        } else {
            list = null;
        }
        BillInfoData billInfoData3 = this.LJZ;
        if ((billInfoData3 == null || billInfoData3.getAddonOrder() == null) && list != null && !list.isEmpty()) {
            BillInfoData billInfoData4 = this.LJZ;
            if (billInfoData4 != null) {
                billInfoData2 = BillInfoData.copy$default(billInfoData4, this.LJLLI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 127, null);
            }
            this.LJZ = billInfoData2;
        }
    }

    public final void xw0() {
        int i;
        AddonOrder addonOrder;
        List<PackedSku> packedSkus;
        boolean z = this.LLI;
        String str = this.LLII;
        Boolean valueOf = Boolean.valueOf(this.LLIIL);
        Boolean valueOf2 = Boolean.valueOf(this.LLIILII);
        HashMap<String, Object> fw0 = fw0(true);
        String bw0 = bw0();
        BillInfoData billInfoData = this.LJZ;
        if (billInfoData != null && (addonOrder = billInfoData.getAddonOrder()) != null && (packedSkus = addonOrder.getPackedSkus()) != null) {
            i = packedSkus.size();
        } else {
            i = 0;
        }
        C27949Ay1.LJJIIZ(z, str, valueOf, valueOf2, fw0, null, null, null, null, bw0, Integer.valueOf(i), iw0(), 480);
    }

    public OrderSubmitViewModel() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LLILLIZIL = c61878OQg;
        this.LLILZLL = new ArrayList();
        this.LLIZ = new HashMap<>();
        this.LLJJIJIIJIL = new AtomicBoolean(true);
        this.LLJJIJIL = new HashMap();
        this.LLJJJIL = c61878OQg;
        this.LLJL = "";
        this.LLJLIL = true;
        this.LLJZIJLIL = new C28031AzL();
        this.LLLFF = new LinkedHashMap();
        this.LLLI = new LinkedHashMap();
    }

    public final void Pv0() {
        PaymentMethodInfo paymentMethodInfo;
        String id;
        String str;
        PaymentMethodsData paymentMethods;
        if (!C28034AzO.LIZ()) {
            return;
        }
        PaymentInfo paymentInfo = this.LL;
        m mVar = null;
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null && (id = paymentMethodInfo.getId()) != null && ujb.o.LJJJLIIL(id, "pm_pi_ccdc_", false)) {
            BillInfoData billInfoData = this.LJZ;
            if (billInfoData != null && (paymentMethods = billInfoData.getPaymentMethods()) != null) {
                str = paymentMethods.pipoHost;
            } else {
                str = null;
            }
            BillInfoData billInfoData2 = this.LJZ;
            if (billInfoData2 != null) {
                mVar = billInfoData2.getPreRiskParam();
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, String>> it = this.LLIIIILZ.entrySet().iterator();
            while (it.hasNext()) {
                String value = it.next().getValue();
                if (value != null) {
                    arrayList.add(value);
                }
            }
            if (str != null && mVar != null) {
                this.LLJJL = UUID.randomUUID().toString();
                mVar.LJJIIZ("user_note", C27739Aud.LJI(arrayList));
                String str2 = this.LLJJL;
                if (str2 != null) {
                    SA4.LIZ(str2, str, paymentMethodInfo, mVar);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return;
        }
        C36746EbW.LIZ(4, "CCDC pre risk only");
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        IEventCenter LJ = EventCenter.LJ();
        LJ.LIZIZ("ec_address_change", this);
        LJ.LIZIZ("ec_address_select", this);
        EventCenter.LJ().LIZIZ("ec_voucher_confirm", this);
        EventCenter.LJ().LIZIZ("ec_osp_location_event", this);
        C42625Go9.LIZJ(this);
        if (this.LLILL != null) {
            String key = this.LLILIL;
            o.LJIIIZ(key, "key");
            HashMap<String, C27954Ay6> hashMap = C27954Ay6.LJLJLJ;
            C27954Ay6 c27954Ay6 = hashMap.get(key);
            if (c27954Ay6 != null) {
                C73411SrX c73411SrX = c27954Ay6.LJLJI;
                if (c73411SrX != null) {
                    c73411SrX.dispose();
                }
                c27954Ay6.LJLJI = null;
            }
            hashMap.remove(key);
        }
        this.LLFZ = Boolean.TRUE;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        EventCenter.LJ().LIZJ("ec_voucher_confirm", this);
        EventCenter.LJ().LIZJ("ec_osp_location_event", this);
        C42625Go9.LIZIZ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        if (r4 == null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C28008Ayy dw0(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew r6) {
        /*
            r5 = 0
            if (r6 == 0) goto L5c
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo> r0 = r6.mainOrderInfos
            if (r0 == 0) goto L5c
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo) r0
            if (r0 == 0) goto L5c
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku> r0 = r0.packedSkus
            if (r0 == 0) goto L5c
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku) r0
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice r4 = r0.getPrice()
            if (r4 == 0) goto L5d
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r4.realPrice
            if (r0 == 0) goto L5d
            java.lang.String r3 = r0.getCurrency()
        L29:
            java.lang.String r1 = r4.originalPriceVal
        L2b:
            java.lang.String r0 = ""
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L51
            if (r4 == 0) goto L56
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r4.realPrice
            if (r0 == 0) goto L56
            java.lang.String r2 = r0.getPriceVal()
        L3d:
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r4.realPrice
            if (r0 == 0) goto L5a
            java.lang.String r1 = r0.getPriceVal()
        L45:
            X.Ayy r0 = new X.Ayy
            if (r2 == 0) goto L4d
            java.lang.Double r5 = X.C38350F3i.LJJIJL(r2)
        L4d:
            r0.<init>(r3, r5, r1)
            return r0
        L51:
            if (r4 == 0) goto L56
            java.lang.String r2 = r4.originalPriceVal
            goto L3d
        L56:
            r2 = r5
            if (r4 == 0) goto L5a
            goto L3d
        L5a:
            r1 = r5
            goto L45
        L5c:
            r4 = r5
        L5d:
            r3 = r5
            if (r4 == 0) goto L61
            goto L29
        L61:
            r1 = r5
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel.dw0(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew):X.Ayy");
    }

    public static String pw0(HashMap hashMap) {
        Map LJ = C27739Aud.LJ("entrance_info", hashMap);
        if (LJ == null) {
            LJ = C113554cx.LJJJLIIL();
        }
        List<String> list = C28032AzM.LIZ().orderEntranceInfoKeys;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : LJ.entrySet()) {
            if (list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C27739Aud.LJI(linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r8 == null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (X.C78685UuP.LJJJZ(r4) != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        if (r8 != null) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a0, code lost:
    
        if (r8 == null) goto L279;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.Object> Cw0(X.C27963AyF r20) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel.Cw0(X.AyF):java.util.List");
    }

    public final void Mv0(boolean z) {
        if (this.LLILLIZIL.size() == 1) {
            int LJ = C27206Am2.LJ(C78866UxK.LJJZZIII(this.LLJLLL), "order_submit", null);
            BillInfoData billInfoData = this.LJZ;
            if (billInfoData == null) {
                C27954Ay6 c27954Ay6 = this.LLILL;
                if (c27954Ay6 != null) {
                    if (c27954Ay6.LJLJJI != null) {
                        if (OspAsyncInflateSettings.LIZIZ()) {
                            setState(C27811Avn.LJLIL);
                        }
                        if (!OspAsyncInflateSettings.LIZ()) {
                            Sw0(0);
                        }
                        C78565UsT.LJJIJ(this, MBB.INSTANCE, new C27808Avk(this, LJ, null));
                        return;
                    }
                    if (c27954Ay6 == null || c27954Ay6.LJLJJL == null) {
                        return;
                    }
                    if (OspAsyncInflateSettings.LIZIZ()) {
                        setState(C27812Avo.LJLIL);
                    }
                    if (!OspAsyncInflateSettings.LIZ()) {
                        Sw0(0);
                    }
                    Pw0(true);
                    C78565UsT.LJJIJ(this, MBB.INSTANCE, new C27810Avm(this, LJ, null));
                    return;
                }
                return;
            }
            Lv0(billInfoData, new BillInfoRequest(null, 0, null, false, false, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LJ, this.LLJZ, null, null, 436207615, null), false, false);
            if (!this.LLJLIL) {
                return;
            }
            this.LLJLIL = false;
            BillInfoData billInfoData2 = this.LJZ;
            if (billInfoData2 == null) {
                return;
            }
            ww0(billInfoData2);
            return;
        }
        if (!z && o.LJ(this.LJLLLLLL, Boolean.TRUE)) {
            return;
        }
        setState(C27813Avp.LJLIL);
        Lw0(this, false, null, false, false, null, null, false, null, null, null, 8191);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Mw0(X.InterfaceC67352kd<? super X.C27993Ayj> r18) {
        /*
            r17 = this;
            r4 = r18
            boolean r0 = r4 instanceof X.C27987Ayd
            r5 = r17
            if (r0 == 0) goto L78
            r3 = r4
            X.Ayd r3 = (X.C27987Ayd) r3
            int r2 = r3.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r3.LJLJJI = r2
        L16:
            java.lang.Object r2 = r3.LJLILLLLZI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJI
            r9 = 1
            if (r0 == 0) goto L57
            if (r0 != r9) goto L7e
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r4 = r3.LJLIL
            X.C141335gf.LIZJ(r2)
        L26:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "[gcash] queryBillInfoSuspendForPaymentPage "
            r1.append(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r4.LJZ
            r3 = 0
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r0.getPaymentMethods()
        L38:
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            r0 = 3
            X.C36746EbW.LIZ(r0, r1)
            X.Ayj r2 = new X.Ayj
            java.lang.Integer r1 = r4.LLJLLL
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r4.LJZ
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r3 = r0.getPaymentMethods()
        L4f:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r4.LL
            r2.<init>(r1, r3, r0)
            return r2
        L55:
            r0 = r3
            goto L38
        L57:
            X.C141335gf.LIZJ(r2)
            r6 = 0
            r7 = 0
            r16 = 8127(0x1fbf, float:1.1388E-41)
            r8 = r6
            r10 = r7
            r11 = r7
            r12 = r6
            r13 = r7
            r14 = r7
            r15 = r7
            X.XKj r0 = Lw0(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L76
            r3.LJLIL = r5
            r3.LJLJJI = r9
            java.lang.Object r0 = r0.LJJIJ(r3)
            if (r0 != r1) goto L76
            return r1
        L76:
            r4 = r5
            goto L26
        L78:
            X.Ayd r3 = new X.Ayd
            r3.<init>(r5, r4)
            goto L16
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel.Mw0(X.2kd):java.lang.Object");
    }

    public final boolean Nv0(String str) {
        BillInfoData billInfoData;
        PaymentMethodsData paymentMethods;
        List<PaymentMethod> list;
        if (str != null && str.length() != 0 && (billInfoData = this.LJZ) != null && (paymentMethods = billInfoData.getPaymentMethods()) != null && (list = paymentMethods.storedMethods) != null) {
            Iterator<PaymentMethod> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PaymentMethod next = it.next();
                if (o.LJ(next.id, str)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Ov0(boolean z) {
        setState(new AqS9S0010000_4(z, 8));
    }

    public final void Pw0(boolean z) {
        if (!z) {
            this.LLJJLIIIJLLLLLLLZ = false;
        }
        setState(new AqS9S0010000_4(z, 6));
    }

    public final void Qw0(C26802AfW c26802AfW) {
        setState(new AqS170S0100000_4(c26802AfW, 286));
        this.LLIIIILZ.put(c26802AfW.LIZ, c26802AfW.LIZIZ);
    }

    public final void Rw0(boolean z) {
        setState(new AqS9S0010000_4(z, 7));
        this.LLIFFJFJJ = z;
    }

    public final void Sw0(int i) {
        setState(new AqS29S0001000_4(i, 3));
    }

    public final void Uw0(SubmitQuitReason quitReason) {
        o.LJIIIZ(quitReason, "quitReason");
        C78565UsT.LJJIJ(this, MBB.INSTANCE, new C27915AxT(this, quitReason, null));
    }

    public final void Xw0(CpfElem cpfElem) {
        setState(new AqS170S0100000_4(cpfElem, 292));
    }

    public final Map<String, String> cw0(int i) {
        List<VoucherInfoNew> Zv0;
        String LLD;
        String LLD2;
        String LLD3;
        String LLD4;
        if (i != 0) {
            if (i != 2) {
                Zv0 = new ArrayList<>();
                C78609UtB.LJJLI(this.LLIZ, new AqS167S0100000_1(Zv0, (List<VoucherInfoNew>) 405));
            } else {
                Zv0 = new ArrayList<>();
                C78609UtB.LJJLI(this.LLILZLL, new AqS167S0100000_1(Zv0, (List<VoucherInfoNew>) 404));
            }
        } else {
            Zv0 = Zv0();
        }
        HashMap hashMap = new HashMap();
        String str = "";
        if (Zv0.isEmpty()) {
            LLD = "";
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<VoucherInfoNew> it = Zv0.iterator();
            while (it.hasNext()) {
                String str2 = it.next().voucherId;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            LLD = ORZ.LLD(arrayList, ",", null, null, null, 62);
        }
        hashMap.put("coupon_id", LLD);
        if (Zv0.isEmpty()) {
            LLD2 = "";
        } else {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(Zv0, 10));
            Iterator<VoucherInfoNew> it2 = Zv0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().voucherTypeId);
            }
            LLD2 = ORZ.LLD(arrayList2, ",", null, null, null, 62);
        }
        hashMap.put("coupon_type_id", LLD2);
        ArrayList arrayList3 = new ArrayList();
        Iterator<VoucherInfoNew> it3 = Zv0.iterator();
        while (it3.hasNext()) {
            HashMap<String, Object> LJII = C27739Aud.LJII(it3.next().daInfo);
            if (LJII != null) {
                arrayList3.add(LJII);
            }
        }
        if (Zv0.isEmpty()) {
            LLD3 = "";
        } else {
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object obj = ((HashMap) it4.next()).get("coupon_type");
                if (obj != null) {
                    arrayList4.add(obj);
                }
            }
            LLD3 = ORZ.LLD(arrayList4, ",", null, null, null, 62);
        }
        hashMap.put("coupon_type", LLD3);
        if (Zv0.isEmpty()) {
            LLD4 = "";
        } else {
            ArrayList arrayList5 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Object obj2 = ((HashMap) it5.next()).get("coupon_type_info");
                if (obj2 != null) {
                    arrayList5.add(obj2);
                }
            }
            LLD4 = ORZ.LLD(arrayList5, ",", null, null, null, 62);
        }
        hashMap.put("coupon_type_info", LLD4);
        if (!Zv0.isEmpty()) {
            ArrayList arrayList6 = new ArrayList();
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                Object obj3 = ((HashMap) it6.next()).get("coupon_cost_role");
                if (obj3 != null) {
                    arrayList6.add(obj3);
                }
            }
            str = ORZ.LLD(arrayList6, ",", null, null, null, 62);
        }
        hashMap.put("coupon_cost_role", str);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:? A[LOOP:2: B:80:0x00f1->B:129:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap<java.lang.String, java.lang.Object> fw0(boolean r14) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel.fw0(boolean):java.util.HashMap");
    }

    public String gw0(ShopOrderNew shopOrderNew) {
        String str;
        MainOrderInfo mainOrderInfo;
        HashMap<String, String> hashMap = this.LLIIIILZ;
        List<MainOrderInfo> list = shopOrderNew.mainOrderInfos;
        if (list == null || (mainOrderInfo = (MainOrderInfo) ORZ.LJLLLL(list)) == null || (str = mainOrderInfo.mainOrderId) == null) {
            str = "";
        }
        return hashMap.get(str);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAddCCDCCard(C27985Ayb event) {
        PaymentMethodInfo paymentMethodInfo;
        o.LJIIIZ(event, "event");
        PaymentInfo paymentInfo = event.LJLIL;
        if (paymentInfo != null) {
            boolean z = false;
            if (o.LJ(event.LJLILLLLZI, "EDIT_CCDC_BILLING_ADDRESS")) {
                PaymentMethod paymentMethod = paymentInfo.paymentMethod;
                if (paymentMethod != null && paymentMethod.LIZIZ) {
                    z = true;
                }
                if (!z) {
                    PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
                    if (paymentMethodInfo2 != null) {
                        paymentMethodInfo = PaymentMethodInfo.copy$default(paymentMethodInfo2, null, null, null, Boolean.TRUE, null, null, null, 119, null);
                    } else {
                        paymentMethodInfo = null;
                    }
                    paymentInfo = PaymentInfo.LIZ(paymentInfo, paymentMethodInfo, null, null, 62);
                }
                Iv0(this, paymentInfo, true, null, 12);
            } else {
                Iv0(this, paymentInfo, false, event.LJLJI, 4);
            }
            C27949Ay1.LJJJJ();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSubPaymentSelectedEvent$ecommerce_transaction_release(C27994Ayk event) {
        String str;
        String str2;
        List<PaymentElement> list;
        o.LJIIIZ(event, "event");
        if (!event.LJLILLLLZI) {
            return;
        }
        PaymentMethod paymentMethod = event.LJLIL;
        if (paymentMethod != null) {
            str = paymentMethod.id;
            str2 = paymentMethod.token;
            list = paymentMethod.LJIILLIIL();
        } else {
            str = null;
            str2 = null;
            list = null;
        }
        Iv0(this, new PaymentInfo(new PaymentMethodInfo(str, str2, list, null, null, null, null, 64, null), paymentMethod, Boolean.FALSE, Boolean.TRUE, null, null, 48, null), false, null, 12);
        C27949Ay1.LJJJJ();
    }

    public final boolean uw0(boolean z) {
        if (z) {
            return false;
        }
        int i = this.LJLJJLL;
        if (i != 0 && (i != 1 || !e1.LIZ(31744, "ec_cart_osp_support_modify_quantity", true, false))) {
            return false;
        }
        return true;
    }

    public final void vw0(PaymentMethod paymentMethod) {
        PaymentMethodsData paymentMethods;
        List<PaymentMethod> LJ;
        PaymentMethod paymentMethod2;
        BillInfoData billInfoData = this.LJZ;
        if (billInfoData != null && (paymentMethods = billInfoData.getPaymentMethods()) != null && (LJ = paymentMethods.LJ()) != null) {
            Iterator<PaymentMethod> it = LJ.iterator();
            while (true) {
                if (it.hasNext()) {
                    paymentMethod2 = it.next();
                    if (paymentMethod2.LJIILJJIL(paymentMethod)) {
                        break;
                    }
                } else {
                    paymentMethod2 = null;
                    break;
                }
            }
            PaymentMethod paymentMethod3 = paymentMethod2;
            if (paymentMethod3 != null) {
                zw0(paymentMethod3, null);
                zw0(paymentMethod, paymentMethod3.LJIIL());
                return;
            }
        }
        zw0(paymentMethod, null);
    }

    public final void ww0(BillInfoData billInfoData) {
        SkuPrice skuPrice;
        RXX rxx;
        String str;
        List<PaymentMethod> paymentOptions;
        C70356RjM c70356RjM;
        String str2;
        Integer num;
        Integer num2;
        HashMap<String, Object> LJII;
        String str3;
        String str4;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list;
        MainOrderInfo mainOrderInfo;
        ShopOrderNew shopOrderNew2;
        List<MainOrderInfo> list2;
        MainOrderInfo mainOrderInfo2;
        List<PackedSku> list3;
        PackedSku packedSku;
        if (this.LJLJJLL == 0) {
            List<ShopOrderNew> newShopOrders = billInfoData.getNewShopOrders();
            if (newShopOrders != null && (shopOrderNew2 = (ShopOrderNew) ORZ.LJLLLL(newShopOrders)) != null && (list2 = shopOrderNew2.mainOrderInfos) != null && (mainOrderInfo2 = (MainOrderInfo) ORZ.LJLLLL(list2)) != null && (list3 = mainOrderInfo2.packedSkus) != null && (packedSku = (PackedSku) ORZ.LJLLLL(list3)) != null) {
                skuPrice = packedSku.getPrice();
            } else {
                skuPrice = null;
            }
            List<ShopOrderNew> newShopOrders2 = billInfoData.getNewShopOrders();
            if (newShopOrders2 != null && (shopOrderNew = (ShopOrderNew) ORZ.LJLLLL(newShopOrders2)) != null && (list = shopOrderNew.mainOrderInfos) != null && (mainOrderInfo = (MainOrderInfo) ORZ.LJLLLL(list)) != null) {
                str = g0.LJJIFFI(mainOrderInfo, this.LJLJJLL, mainOrderInfo.selectedLogisticsServiceId);
                rxx = g0.LJJII(mainOrderInfo, this.LJLJJLL);
            } else {
                str = null;
                rxx = null;
            }
        } else {
            skuPrice = null;
            rxx = null;
            str = null;
        }
        HashMap<String, Object> generalParams = fw0(true);
        String aw0 = aw0();
        int i = this.LLLF;
        PaymentMethodsData paymentMethods = billInfoData.getPaymentMethods();
        if (paymentMethods != null) {
            paymentOptions = paymentMethods.LIZIZ();
        } else {
            paymentOptions = C61878OQg.INSTANCE;
        }
        HashMap<String, Object> Xv0 = Xv0();
        String bw0 = bw0();
        Summary summary = billInfoData.getSummary();
        if (summary != null) {
            c70356RjM = g0.LJJJJIZL(summary);
        } else {
            c70356RjM = null;
        }
        String promotionDaInfo = billInfoData.getPromotionDaInfo();
        C27106AkQ c27106AkQ = this.LLJJI;
        if (c27106AkQ != null) {
            str2 = c27106AkQ.LIZJ;
            num = c27106AkQ.LIZLLL;
        } else {
            str2 = null;
            num = null;
        }
        OrderSubmitRequestParam orderSubmitRequestParam = this.LJLLLL;
        if (orderSubmitRequestParam != null) {
            num2 = orderSubmitRequestParam.getOneStepOrderType();
        } else {
            num2 = null;
        }
        HashMap<String, String> hashMap = this.LLJLLIL;
        Boolean bool = Boolean.TRUE;
        Integer valueOf = Integer.valueOf(i);
        Integer num3 = 0;
        o.LJIIIZ(generalParams, "generalParams");
        o.LJIIIZ(paymentOptions, "paymentOptions");
        ConcurrentHashMap<String, Object> concurrentHashMap = C27949Ay1.LIZIZ;
        Object obj = concurrentHashMap.get("click_buynow_start_time");
        if (obj == null) {
            obj = -1L;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (skuPrice != null) {
            Price price = skuPrice.realPrice;
            if (price != null) {
                str3 = price.getPriceVal();
            } else {
                str3 = null;
            }
            concurrentHashMap.put("sale_price_value", String.valueOf(str3));
            concurrentHashMap.put("original_price_value", String.valueOf(skuPrice.originalPriceVal));
            Price price2 = skuPrice.realPrice;
            if (price2 != null) {
                str4 = price2.getCurrency();
            } else {
                str4 = null;
            }
            concurrentHashMap.put("currency", String.valueOf(str4));
        }
        linkedHashMap.putAll(concurrentHashMap);
        linkedHashMap.putAll(generalParams);
        try {
            Long LJJIZ = C38350F3i.LJJIZ(String.valueOf(concurrentHashMap.get("start_click_time")));
            Object obj2 = concurrentHashMap.get("previous_page");
            if (LJJIZ != null && (o.LJ(obj2, "cart") || o.LJ(obj2, "ecommerce_centre_page") || num2 != null)) {
                linkedHashMap.put("start_click_to_now", Long.valueOf(System.currentTimeMillis() - LJJIZ.longValue()));
            }
        } catch (Exception unused) {
            C78983UzD.LJIILL("logOSPEnterPage startClickTime exception");
        }
        if ((obj instanceof Long) && !o.LJ(obj, -1L)) {
            linkedHashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (bool != null) {
            linkedHashMap.put("is_fullscreen", 1);
        }
        linkedHashMap.put("cart_item_id", aw0);
        if (valueOf != null) {
            linkedHashMap.put("osp_reload_tag", valueOf);
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(paymentOptions, 10));
        Iterator<PaymentMethod> it = paymentOptions.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJIIL());
        }
        linkedHashMap.put("payment_option", ORZ.LLD(arrayList, ",", null, null, C28035AzP.LJLIL, 30));
        linkedHashMap.put("payment_option_cnt", Integer.valueOf(paymentOptions.size()));
        linkedHashMap.putAll(Xv0);
        linkedHashMap.put("promotion_source", bw0);
        if (c70356RjM != null) {
            C70355RjL.LIZJ(c70356RjM, linkedHashMap);
        }
        if (str != null) {
            linkedHashMap.put("delivery_info", str);
        }
        if (promotionDaInfo != null && (LJII = C27739Aud.LJII(promotionDaInfo)) != null) {
            linkedHashMap.putAll(LJII);
        }
        if (str2 != null) {
            linkedHashMap.put("purchase_path", str2);
        }
        if (num != null) {
            linkedHashMap.put("is_mobile_number_complete", Integer.valueOf(num.intValue()));
        }
        if (num3 != null) {
            num3.intValue();
            linkedHashMap.put("add_on_product_num", num3);
        }
        linkedHashMap.put("shipping_rights_content", C27949Ay1.LJIILLIIL);
        C27949Ay1.LIZ(linkedHashMap, hashMap, promotionDaInfo, null);
        if (rxx != null) {
            C70355RjL.LIZIZ(rxx, linkedHashMap);
        }
        C76542zS.LIZ("tiktokec_first_refresh_page", linkedHashMap);
    }

    public static void Kv0(OrderSubmitViewModel orderSubmitViewModel, PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            orderSubmitViewModel.getClass();
            return;
        }
        orderSubmitViewModel.LLFF.add(0, paymentMethod);
        HashMap hashMap = new HashMap();
        Iterator<PaymentMethod> it = orderSubmitViewModel.LLFF.iterator();
        while (it.hasNext()) {
            String LJFF = it.next().LJFF();
            Integer num = (Integer) hashMap.get(LJFF);
            if (num == null) {
                num = 0;
            }
            hashMap.put(LJFF, Integer.valueOf(num.intValue() + 1));
        }
        try {
            for (int LJJI = C47261Igj.LJJI(orderSubmitViewModel.LLFF); -1 < LJJI; LJJI--) {
                String LJFF2 = orderSubmitViewModel.LLFF.get(LJJI).LJFF();
                Integer num2 = (Integer) hashMap.get(LJFF2);
                if (num2 == null) {
                    num2 = 0;
                }
                if (num2.intValue() > 1) {
                    orderSubmitViewModel.LLFF.remove(LJJI);
                    Integer num3 = (Integer) hashMap.get(LJFF2);
                    if (num3 == null) {
                        num3 = 0;
                    }
                    hashMap.put(LJFF2, Integer.valueOf(num3.intValue() - 1));
                }
            }
        } catch (IndexOutOfBoundsException unused) {
            C78983UzD.LJIILL("changeRecommendPaymentPos IndexOutOfBoundsException");
        }
    }

    public CreateOrderSku Aw0(CreateOrderSku createOrderSku, C27959AyB c27959AyB) {
        HashMap hashMap = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), createOrderSku.entranceInfo, C65330PkU.LIZJ(C65352Pkq.LJFF(HashMap.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(Object.class)))));
            if (!(fromJson instanceof HashMap)) {
                fromJson = null;
            }
            hashMap = (HashMap) fromJson;
        } catch (com.google.gson.s unused) {
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        Object obj = ((HashMap) this.LLJJIJIL).get(c27959AyB.LIZ);
        if (obj == null) {
            obj = "";
        }
        hashMap.put("add_on_track_id", obj);
        hashMap.put("is_add_on_product", 1);
        hashMap.put("source_page_type", "add_on_order_submit_rec");
        hashMap.put("entrance_form", "append_goods_card");
        Object obj2 = ((HashMap) this.LLJJIJIL).get(c27959AyB.LIZ);
        if (obj2 != null) {
            hashMap.put("track_id", obj2);
        }
        String LIZJ = C75792yF.LIZJ(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("entrance_info", LIZJ);
        return CreateOrderSku.LIZ(createOrderSku, pw0(hashMap2));
    }

    public final void Dw0(View view, Boolean bool) {
        Context context;
        Address address;
        String str;
        Boolean bool2;
        LogisticData logisticData;
        List<LogisticDTO> logistics;
        LogisticDTO logisticDTO;
        DynamicSchema schemaInfo;
        ShippingAddress shippingAddress;
        if (view != null && (context = view.getContext()) != null) {
            this.LLII = "next";
            InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(view);
            if (o.LJ(bool, Boolean.TRUE) && (shippingAddress = this.LJLZ) != null) {
                address = shippingAddress.getShippingAddress();
            } else {
                address = null;
            }
            List<Region> list = this.LJLLJ;
            String Qv0 = Qv0();
            BillInfoData billInfoData = this.LJZ;
            if (billInfoData != null && (schemaInfo = billInfoData.getSchemaInfo()) != null) {
                str = schemaInfo.getAddressEditSchema();
            } else {
                str = null;
            }
            List<AddressPromotionSku> list2 = this.LLJILJILJ;
            List<String> list3 = this.LLJILLL;
            BillInfoData billInfoData2 = this.LJZ;
            if (billInfoData2 != null && (logisticData = billInfoData2.getLogisticData()) != null && (logistics = logisticData.getLogistics()) != null && (logisticDTO = (LogisticDTO) ORZ.LJLLLLLL(0, logistics)) != null) {
                bool2 = logisticDTO.freeShipping;
            } else {
                bool2 = null;
            }
            AddressPageStarter.LIZ(context, LJIILIIL, address, list, "order_submit", false, Qv0, null, null, null, false, 0, str, null, list2, list3, bool2, null, 143264);
            new B0J("top").LIZIZ();
            this.LLIIL = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Kw0(boolean r11, X.InterfaceC67352kd<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel.Kw0(boolean, X.2kd):java.lang.Object");
    }

    public SpannableStringBuilder Rv0(Context ctx, C26566Abi address) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(address, "address");
        return C26560Abc.LIZ(ctx, address, EnumC26562Abe.HAS_ICON);
    }

    public final void Tw0(PaymentInfo paymentInfo, boolean z) {
        this.LL = paymentInfo;
        if (z) {
            setStateImmediate(new AqS170S0100000_4(paymentInfo, 287));
        } else {
            setState(new AqS170S0100000_4(paymentInfo, 288));
        }
        Pv0();
    }

    public final boolean Yw0(C26965Ai9 mainOrderInfoVO, LogisticDTO logistic) {
        ArrayList arrayList;
        o.LJIIIZ(mainOrderInfoVO, "mainOrderInfoVO");
        o.LJIIIZ(logistic, "logistic");
        List<C27959AyB> list = mainOrderInfoVO.LJII;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
        Iterator<C27959AyB> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().LIZ);
        }
        List<OrderShopDigest> list2 = this.LJLJLLL;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (OrderShopDigest orderShopDigest : list2) {
                if (o.LJ(orderShopDigest.getSellerId(), mainOrderInfoVO.LIZ)) {
                    arrayList.add(orderShopDigest);
                }
            }
        } else {
            arrayList = null;
        }
        boolean z = false;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List<OrderSKUDTO> orderSKUs = ((OrderShopDigest) it2.next()).getOrderSKUs();
                if (orderSKUs != null) {
                    for (OrderSKUDTO orderSKUDTO : orderSKUs) {
                        if (arrayList2.contains(orderSKUDTO.skuId) && !o.LJ(orderSKUDTO.logisticsServiceId, logistic.logisticsServiceId)) {
                            orderSKUDTO.logisticsServiceId = logistic.logisticsServiceId;
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    public final void mw0(int i, String str) {
        List<OrderShopDigest> list;
        List<OrderShopDigest> list2;
        OrderSubmitRequestParam orderSubmitRequestParam;
        this.LLIILZL = true;
        this.LJLJLJ = str;
        if (this.LLILLIZIL.size() == 1 && this.LJLJL && ((i == 0 || i == 3) && (((list2 = this.LJLJLLL) == null || list2.isEmpty()) && (orderSubmitRequestParam = this.LJLLLL) != null))) {
            list = orderSubmitRequestParam.getOrderShopDigest();
        } else {
            list = null;
        }
        Lw0(this, false, list, true, false, null, null, false, null, null, new ChangeInfo(EnumC27805Avh.USER_ADDRESS.getValue()), 4049);
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        String buyerAddressId;
        o.LJIIIZ(eventName, "eventName");
        LocationInfo locationInfo = null;
        switch (eventName.hashCode()) {
            case -2019832472:
                if (!eventName.equals("ec_address_select") || o.LJ(C26755Ael.LIZ(str).addressId, this.LJLJLJ)) {
                    return;
                }
                mw0(3, C26755Ael.LIZ(str).addressId);
                return;
            case 412057034:
                if (!eventName.equals("ec_payment_change")) {
                    return;
                }
                PaymentInfo paymentInfo = this.LL;
                if (paymentInfo != null) {
                    paymentInfo.paymentMethod = null;
                }
                Lw0(this, false, null, false, true, null, null, false, null, null, new ChangeInfo(EnumC27805Avh.ADD_NEW_PAYMENT.getValue()), 4031);
                return;
            case 1242205757:
                if (!eventName.equals("ec_osp_resend_order_create")) {
                    return;
                }
                setState(C27807Avj.LJLIL);
                return;
            case 1702717540:
                if (!eventName.equals("ec_osp_location_event")) {
                    return;
                }
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(LocationInfo.class)));
                    if (!(fromJson instanceof LocationInfo)) {
                        fromJson = null;
                    }
                    locationInfo = (LocationInfo) fromJson;
                } catch (com.google.gson.s unused) {
                }
                if (locationInfo == null || !o.LJ(locationInfo.getModuleName(), EnumC27984Aya.SHOP_ORDER_NEW.getModuleName())) {
                    return;
                }
                setState(new AqS29S1000000_4(locationInfo.getModulePositionTag(), 38));
                return;
            case 1819520028:
                if (!eventName.equals("ec_address_change")) {
                    return;
                }
                AddressPageStarter.AddressEvent LIZ = C26755Ael.LIZ(str);
                if (LIZ.type == 0) {
                    BillInfoData billInfoData = this.LJZ;
                    if (billInfoData != null && (buyerAddressId = billInfoData.getBuyerAddressId()) != null && buyerAddressId.length() != 0) {
                        return;
                    }
                    mw0(LIZ.type, C26755Ael.LIZ(str).addressId);
                    return;
                }
                if (!o.LJ(C26755Ael.LIZ(str).addressId, this.LJLJLJ)) {
                    return;
                }
                int i = LIZ.type;
                if (i == 2) {
                    mw0(i, null);
                    return;
                } else {
                    mw0(i, this.LJLJLJ);
                    return;
                }
            case 1943991438:
                if (!eventName.equals("ec_voucher_confirm")) {
                    return;
                }
                try {
                    Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(CouponClaimedEvent.class)));
                    if (!(fromJson2 instanceof CouponClaimedEvent)) {
                        fromJson2 = null;
                    }
                    CouponClaimedEvent couponClaimedEvent = (CouponClaimedEvent) fromJson2;
                    if (couponClaimedEvent != null) {
                        C78565UsT.LJJIJ(this, C36636EZk.LIZ.LJJIJIL(), new C27806Avi(this, couponClaimedEvent, null));
                        return;
                    }
                    return;
                } catch (com.google.gson.s unused2) {
                    return;
                }
            default:
                return;
        }
    }

    public final void sw0(Boolean bool, Boolean bool2) {
        this.LJLLLLLL = bool2;
        BillInfoData billInfoData = this.LJZ;
        if (billInfoData != null) {
            Integer LIZJ = C27964AyG.LIZJ(billInfoData);
            String LIZ = C27964AyG.LIZ(billInfoData);
            HashMap<String, Object> hashMap = this.LLIL;
            if (hashMap != null) {
                if (LIZJ == null || hashMap.put("biz_type", Integer.valueOf(LIZJ.intValue())) == null) {
                    hashMap.remove("biz_type");
                }
                hashMap.put("product_id", LIZ);
            }
            C27949Ay1.LIZIZ(LIZJ, LIZ);
        }
        this.LLILLIZIL = Tv0(this.LJZ, bool, bool2);
        this.LLJLILLLLZIIL = e1.LIZ(31744, "ecom_osp_auto_select_recommend_payment", true, false);
    }

    public final void yw0(BillInfoData billInfoData, C27941Axt c27941Axt) {
        SkuPrice skuPrice;
        String str;
        RXX rxx;
        String LLD;
        int i;
        C70356RjM c70356RjM;
        String str2;
        String str3;
        Integer num;
        Integer num2;
        Summary summary;
        List<C27959AyB> list;
        PaymentMethodsData paymentMethods;
        List<PaymentMethod> LJ;
        List<ShopOrderNew> newShopOrders;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list2;
        MainOrderInfo mainOrderInfo;
        ShopOrderNew shopOrderNew2;
        List<MainOrderInfo> list3;
        MainOrderInfo mainOrderInfo2;
        List<PackedSku> list4;
        PackedSku packedSku;
        PlatformPromotion platformPromotion = null;
        if (this.LJLJJLL == 0) {
            List<ShopOrderNew> newShopOrders2 = billInfoData.getNewShopOrders();
            if (newShopOrders2 != null && (shopOrderNew2 = (ShopOrderNew) ORZ.LJLLLL(newShopOrders2)) != null && (list3 = shopOrderNew2.mainOrderInfos) != null && (mainOrderInfo2 = (MainOrderInfo) ORZ.LJLLLL(list3)) != null && (list4 = mainOrderInfo2.packedSkus) != null && (packedSku = (PackedSku) ORZ.LJLLLL(list4)) != null) {
                skuPrice = packedSku.getPrice();
            } else {
                skuPrice = null;
            }
            BillInfoData billInfoData2 = this.LJZ;
            if (billInfoData2 != null && (newShopOrders = billInfoData2.getNewShopOrders()) != null && (shopOrderNew = (ShopOrderNew) ORZ.LJLLLL(newShopOrders)) != null && (list2 = shopOrderNew.mainOrderInfos) != null && (mainOrderInfo = (MainOrderInfo) ORZ.LJLLLL(list2)) != null) {
                str = g0.LJJIFFI(mainOrderInfo, this.LJLJJLL, mainOrderInfo.selectedLogisticsServiceId);
                rxx = g0.LJJII(mainOrderInfo, this.LJLJJLL);
            } else {
                str = null;
                rxx = null;
            }
        } else {
            skuPrice = null;
            str = null;
            rxx = null;
        }
        HashMap<String, Object> fw0 = fw0(true);
        String aw0 = aw0();
        int i2 = this.LLLF;
        ArrayList arrayList = new ArrayList();
        BillInfoData billInfoData3 = this.LJZ;
        if (billInfoData3 != null && (paymentMethods = billInfoData3.getPaymentMethods()) != null && (LJ = paymentMethods.LJ()) != null) {
            int i3 = 0;
            for (PaymentMethod paymentMethod : LJ) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    PaymentMethod paymentMethod2 = paymentMethod;
                    if (i3 < 3) {
                        arrayList.add(paymentMethod2.LJIIL());
                    }
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        if (arrayList.isEmpty()) {
            LLD = "";
        } else {
            LLD = ORZ.LLD(arrayList, ",", null, null, null, 62);
        }
        HashMap<String, Object> Xv0 = Xv0();
        String bw0 = bw0();
        if (c27941Axt != null && (list = c27941Axt.LIZ) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        BillInfoData billInfoData4 = this.LJZ;
        if (billInfoData4 != null && (summary = billInfoData4.getSummary()) != null) {
            c70356RjM = g0.LJJJJIZL(summary);
        } else {
            c70356RjM = null;
        }
        BillInfoData billInfoData5 = this.LJZ;
        if (billInfoData5 != null) {
            str2 = billInfoData5.getPromotionDaInfo();
        } else {
            str2 = null;
        }
        C27106AkQ c27106AkQ = this.LLJJI;
        if (c27106AkQ != null) {
            str3 = c27106AkQ.LIZJ;
            num = c27106AkQ.LIZLLL;
        } else {
            str3 = null;
            num = null;
        }
        OrderSubmitRequestParam orderSubmitRequestParam = this.LJLLLL;
        if (orderSubmitRequestParam != null) {
            num2 = orderSubmitRequestParam.getOneStepOrderType();
        } else {
            num2 = null;
        }
        HashMap<String, String> hashMap = this.LLJLLIL;
        BillInfoData billInfoData6 = this.LJZ;
        if (billInfoData6 != null) {
            platformPromotion = billInfoData6.getPlatformPromotion();
        }
        C27949Ay1.LJIJJLI(Boolean.TRUE, fw0, null, null, null, aw0, Integer.valueOf(i2), LLD, Xv0, skuPrice, bw0, str2, Integer.valueOf(i), c70356RjM, str, str3, num, num2, hashMap, rxx, C27949Ay1.LJ(platformPromotion), 28);
    }

    public final void zw0(PaymentMethod paymentMethod, String str) {
        boolean z;
        String str2;
        String str3;
        String str4;
        PaymentMethodsData paymentMethods;
        List<PaymentMethod> list;
        BillInfoData billInfoData = this.LJZ;
        String str5 = null;
        if (billInfoData != null && (paymentMethods = billInfoData.getPaymentMethods()) != null && (list = paymentMethods.storedMethods) != null) {
            Iterator<PaymentMethod> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PaymentMethod next = it.next();
                if (o.LJ(next.id, paymentMethod.id)) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
        }
        z = false;
        if (str != null) {
            str2 = "sub_payment_type";
        } else {
            str2 = "payment_type";
        }
        String LJIIL = paymentMethod.LJIIL();
        boolean LJIIL2 = C1GE.LJIIL(paymentMethod.extraInfo);
        boolean LJIIL3 = C1GE.LJIIL(paymentMethod.balance);
        Availability availability = paymentMethod.availability;
        if (availability != null) {
            str3 = availability.unavailableCode;
            str4 = availability.statusCode;
        } else {
            str3 = null;
            str4 = null;
        }
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null) {
            str5 = bindInfo.bindStatus;
        }
        C27949Ay1.LJJIJIL(0, Boolean.valueOf(C1GE.LJIIL(paymentMethod.LJIIIIZZ())), LJIIL, str2, str3, str4, str5, str, LJIIL2, z, LJIIL3, true);
    }

    public static void nw0(List list, List available, boolean z) {
        o.LJIIIZ(available, "available");
        Iterator it = available.iterator();
        while (it.hasNext()) {
            ((ArrayList) list).add(C27948Ay0.LIZIZ((ShopOrderNew) it.next(), z, null, EnumC28022AzC.GEN_TYPE_DEFAULT));
        }
    }

    public final void Ew0(Context context, String str, String str2) {
        String str3;
        List<OrderShopDigest> orderShopDigest;
        OrderShopDigest orderShopDigest2;
        List<OrderSKUDTO> orderSKUs;
        OrderSKUDTO orderSKUDTO;
        LogisticData logisticData;
        List<LogisticDTO> logistics;
        LogisticDTO logisticDTO;
        DynamicSchema schemaInfo;
        List<ShopOrderNew> newShopOrders;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list;
        MainOrderInfo mainOrderInfo;
        List<PackedSku> list2;
        PackedSku packedSku;
        String str4 = str2;
        this.LLII = "next";
        BillInfoData billInfoData = this.LJZ;
        Boolean bool = null;
        if (billInfoData == null || (newShopOrders = billInfoData.getNewShopOrders()) == null || (shopOrderNew = (ShopOrderNew) ORZ.LJLLLLLL(0, newShopOrders)) == null || (list = shopOrderNew.mainOrderInfos) == null || (mainOrderInfo = (MainOrderInfo) ORZ.LJLLLLLL(0, list)) == null || (list2 = mainOrderInfo.packedSkus) == null || (packedSku = (PackedSku) ORZ.LJLLLLLL(0, list2)) == null || (str3 = packedSku.getProductId()) == null) {
            OrderSubmitRequestParam orderSubmitRequestParam = this.LJLLLL;
            if (orderSubmitRequestParam != null && (orderShopDigest = orderSubmitRequestParam.getOrderShopDigest()) != null && (orderShopDigest2 = (OrderShopDigest) ORZ.LJLLLL(orderShopDigest)) != null && (orderSKUs = orderShopDigest2.getOrderSKUs()) != null && (orderSKUDTO = (OrderSKUDTO) ORZ.LJLLLL(orderSKUs)) != null) {
                str3 = orderSKUDTO.productId;
            } else {
                str3 = null;
            }
        }
        if (str != null) {
            C1A8.LJIJI(str, new AqS170S0100000_4(this, 295));
        }
        String Qv0 = Qv0();
        if (str4 == null) {
            BillInfoData billInfoData2 = this.LJZ;
            if (billInfoData2 != null && (schemaInfo = billInfoData2.getSchemaInfo()) != null) {
                str4 = schemaInfo.getAddressListSchema();
            } else {
                str4 = null;
            }
        }
        BillInfoData billInfoData3 = this.LJZ;
        if (billInfoData3 != null && (logisticData = billInfoData3.getLogisticData()) != null && (logistics = logisticData.getLogistics()) != null && (logisticDTO = (LogisticDTO) ORZ.LJLLLLLL(0, logistics)) != null) {
            bool = logisticDTO.freeShipping;
        }
        AddressPageStarter.LIZLLL(context, str, Qv0, str4, str3, bool, 128);
        withState(C27860Awa.LJLIL);
        this.LLIIL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Hw0(Context context, String str, boolean z) {
        PaymentMethodsData paymentMethodsData;
        PaymentMethodsData paymentMethodsData2;
        String str2;
        String str3;
        Address address;
        String str4;
        Summary summary;
        Price total;
        Summary summary2;
        Price total2;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethod paymentMethod;
        List<PaymentMethod> list;
        List<PaymentMethod> list2;
        List<CardRules> list3;
        PaymentMethodPolicy paymentMethodPolicy;
        Integer num;
        String str5;
        String str6;
        String str7;
        Photos photos;
        PaymentCertification paymentCertification;
        PaymentGuaranteeInfo paymentGuaranteeInfo;
        UserTrustItem userTrustItem;
        List<BankCardRule> list4;
        String str8;
        PageNodeMonitorService.LJIIIZ().LJIIIIZZ("payment_method");
        BillInfoData billInfoData = this.LJZ;
        String str9 = null;
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.getPaymentMethods();
        } else {
            paymentMethodsData = null;
        }
        if (z) {
            if (paymentMethodsData != null) {
                list = paymentMethodsData.paymentMethods;
            } else {
                list = null;
            }
            ArrayList arrayList = new ArrayList();
            if (paymentMethodsData != null) {
                list2 = paymentMethodsData.storedMethods;
                list3 = paymentMethodsData.cardRules;
                paymentMethodPolicy = paymentMethodsData.paymentPolicy;
                num = paymentMethodsData.storedMethodShowCount;
                str5 = paymentMethodsData.encodeKey;
                str6 = paymentMethodsData.pipoHost;
                str7 = paymentMethodsData.paymentMethodsText;
                photos = paymentMethodsData.methodsPhotos;
                paymentCertification = paymentMethodsData.certification;
                paymentGuaranteeInfo = paymentMethodsData.guaranteeInfo;
                userTrustItem = paymentMethodsData.securePayment;
                list4 = paymentMethodsData.bankCardRules;
                str8 = paymentMethodsData.consultationId;
            } else {
                list2 = null;
                list3 = null;
                paymentMethodPolicy = null;
                num = null;
                str5 = null;
                str6 = null;
                str7 = null;
                photos = null;
                paymentCertification = null;
                paymentGuaranteeInfo = null;
                userTrustItem = null;
                list4 = null;
                str8 = null;
            }
            str9 = null;
            paymentMethodsData2 = new PaymentMethodsData(list, null, arrayList, list2, list3, paymentMethodPolicy, num, str5, str6, str7, photos, paymentCertification, paymentGuaranteeInfo, userTrustItem, list4, str8);
        } else {
            paymentMethodsData2 = paymentMethodsData;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterParams, paymentInfo: ");
        PaymentInfo paymentInfo = this.LL;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            str2 = paymentMethod.id;
        } else {
            str2 = str9;
        }
        LIZ.append(str2);
        LIZ.append(", ");
        PaymentInfo paymentInfo2 = this.LL;
        if (paymentInfo2 != null && (paymentMethodInfo = paymentInfo2.paymentMethodInfo) != null) {
            str3 = paymentMethodInfo.getId();
        } else {
            str3 = str9;
        }
        LIZ.append(str3);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        Integer valueOf = Integer.valueOf(hw0());
        PaymentInfo paymentInfo3 = this.LL;
        HashMap hashMap = new HashMap();
        HashMap<String, Object> hashMap2 = this.LLIL;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        hashMap.put("previous_page", "order_submit");
        hashMap.putAll(fw0(false));
        ShippingAddress shippingAddress = this.LJLZ;
        if (shippingAddress != null) {
            address = shippingAddress.getShippingAddress();
        } else {
            address = str9;
        }
        BillInfoData billInfoData2 = this.LJZ;
        if (billInfoData2 != null && (summary2 = billInfoData2.getSummary()) != null && (total2 = summary2.getTotal()) != null) {
            str4 = total2.getPriceVal();
        } else {
            str4 = str9;
        }
        BillInfoData billInfoData3 = this.LJZ;
        if (billInfoData3 != null && (summary = billInfoData3.getSummary()) != null && (total = summary.getTotal()) != null) {
            str9 = total.getCurrency();
        }
        EnterParams enterParams = new EnterParams(null, null, valueOf, paymentMethodsData2, null, true, paymentInfo3, hashMap, null, null, address, str4, str9, "ordersubmit", null, null, null, 115456, null);
        this.LLII = "next";
        xw0();
        PaymentHalfFragment paymentHalfFragment = new PaymentHalfFragment();
        paymentHalfFragment.LJLIL = enterParams;
        paymentHalfFragment.LJLJJL = new C28006Ayw(this);
        paymentHalfFragment.LJLILLLLZI = new IDqS183S0200000_4(paymentHalfFragment, this, 8);
        paymentHalfFragment.LJLJJI = str;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJI(LJJIFFI);
        FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "context.fragmentActivity)!!.supportFragmentManager");
        paymentHalfFragment.show(supportFragmentManager, "payment_fragment");
    }

    public final void Jv0(C26965Ai9 c26965Ai9, int i, String skuId) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        OrderShopDigest copy$default;
        ArrayList arrayList3;
        OrderSKUDTO LIZ;
        SkuCardStyleInfo skuCardStyleInfo;
        Integer num;
        o.LJIIIZ(skuId, "skuId");
        List<OrderShopDigest> list = this.LJLJLLL;
        if (list != null) {
            int i2 = 10;
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (OrderShopDigest orderShopDigest : list) {
                if (c26965Ai9 != null) {
                    str = c26965Ai9.LIZ;
                } else {
                    str = null;
                }
                if (o.LJ(str, orderShopDigest.getSellerId())) {
                    List<OrderSKUDTO> orderSKUs = orderShopDigest.getOrderSKUs();
                    if (orderSKUs != null) {
                        arrayList3 = new ArrayList(C32I.LJJL(orderSKUs, i2));
                        for (OrderSKUDTO orderSKUDTO : orderSKUs) {
                            if (o.LJ(orderSKUDTO.skuId, skuId) && ((skuCardStyleInfo = orderSKUDTO.skuCardStyleInfo) == null || (num = skuCardStyleInfo.skuCardStyleType) == null || num.intValue() != 2)) {
                                OrderSubmitState orderSubmitState = (OrderSubmitState) lv0();
                                Integer num2 = orderSKUDTO.quantity;
                                if (num2 == null || num2.intValue() != i || orderSubmitState.getShowDialogState()) {
                                    this.LLJJJJ = new C27926Axe(orderShopDigest.getSellerId(), orderSKUDTO.skuId, orderSKUDTO.quantity, Integer.valueOf(i));
                                    LIZ = OrderSKUDTO.LIZ(orderSKUDTO, Integer.valueOf(i), null, 131067);
                                } else {
                                    return;
                                }
                            } else {
                                LIZ = OrderSKUDTO.LIZ(orderSKUDTO, null, null, 131071);
                            }
                            arrayList3.add(LIZ);
                        }
                    } else {
                        arrayList3 = null;
                    }
                    copy$default = OrderShopDigest.copy$default(orderShopDigest, null, arrayList3, null, 5, null);
                } else {
                    copy$default = OrderShopDigest.copy$default(orderShopDigest, null, null, null, 7, null);
                }
                arrayList.add(copy$default);
                i2 = 10;
            }
        } else {
            arrayList = null;
        }
        C27941Axt c27941Axt = this.LJLL;
        if (c27941Axt != null) {
            arrayList2 = new ArrayList();
            Map<String, Boolean> map = c27941Axt.LIZIZ;
            if (map != null) {
                for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                    if (entry.getValue().booleanValue()) {
                        arrayList2.add(entry.getKey());
                    }
                }
            }
        } else {
            arrayList2 = null;
        }
        List<OrderShopDigest> ew0 = ew0(arrayList, c27941Axt, arrayList2);
        this.LLJJJJJIL = true;
        Lw0(this, false, ew0, false, false, null, null, false, null, null, new ChangeInfo(EnumC27805Avh.SKU_QUANTITY.getValue()), 4085);
        C27949Ay1.LJIJJ("edit_quantity", null, 6);
    }

    public final void Jw0(Context context, PaymentMethod paymentMethod, FragmentManager fragmentManager) {
        PaymentMethodsData paymentMethodsData;
        String str;
        Address address;
        String str2;
        Summary summary;
        Price total;
        Summary summary2;
        Price total2;
        PaymentMethodInfo paymentMethodInfo;
        BillInfoData billInfoData = this.LJZ;
        String str3 = null;
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.getPaymentMethods();
        } else {
            paymentMethodsData = null;
        }
        PaymentInfo paymentInfo = this.LL;
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null) {
            str = paymentMethodInfo.getId();
        } else {
            str = null;
        }
        Integer valueOf = Integer.valueOf(EnumC28094B0w.CONTINUE.ordinal());
        PaymentInfo paymentInfo2 = this.LL;
        HashMap hashMap = new HashMap();
        HashMap<String, Object> hashMap2 = this.LLIL;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        hashMap.put("previous_page", "order_submit");
        hashMap.putAll(fw0(false));
        ShippingAddress shippingAddress = this.LJLZ;
        if (shippingAddress != null) {
            address = shippingAddress.getShippingAddress();
        } else {
            address = null;
        }
        BillInfoData billInfoData2 = this.LJZ;
        if (billInfoData2 != null && (summary2 = billInfoData2.getSummary()) != null && (total2 = summary2.getTotal()) != null) {
            str2 = total2.getPriceVal();
        } else {
            str2 = null;
        }
        BillInfoData billInfoData3 = this.LJZ;
        if (billInfoData3 != null && (summary = billInfoData3.getSummary()) != null && (total = summary.getTotal()) != null) {
            str3 = total.getCurrency();
        }
        EnterParams enterParams = new EnterParams(null, null, valueOf, paymentMethodsData, null, true, paymentInfo2, hashMap, null, null, address, str2, str3, "ordersubmit", null, null, null, 115456, null);
        this.LLII = "next";
        xw0();
        C27590AsE.LIZ(context, str, true, paymentMethod, enterParams, fragmentManager);
    }

    public final void Nw0(PaymentMethod paymentMethod, boolean z, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        CommuteType commuteType;
        BindInfoReqInfo[] bindInfoReqInfoArr = new BindInfoReqInfo[1];
        String str = paymentMethod.id;
        String str2 = paymentMethod.token;
        String uuid = UUID.randomUUID().toString();
        paymentMethod.LIZLLL = uuid;
        CommuteInfo LJ = paymentMethod.LJ();
        if (LJ != null) {
            commuteType = LJ.commuteType;
        } else {
            commuteType = null;
        }
        bindInfoReqInfoArr[0] = new BindInfoReqInfo(str, str2, uuid, commuteType, "snssdk1180://ec/app_bind_result");
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C28059Azn(C47261Igj.LJII(bindInfoReqInfoArr), this, z, paymentMethod, interfaceC88472Yns, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
    
        if (r11 == null) goto L311;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest Sv0(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState r50, java.lang.Boolean r51, java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel.Sv0(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState, java.lang.Boolean, java.lang.String):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest");
    }

    public List<String> Tv0(BillInfoData billInfoData, Boolean bool, Boolean bool2) {
        boolean z;
        boolean z2;
        List<PaymentMethod> list;
        Boolean bool3 = Boolean.TRUE;
        if (o.LJ(bool, bool3) || C27920AxY.LIZ()) {
            return C47261Igj.LJJIJ("order_submit_fragment");
        }
        if (o.LJ(bool2, bool3)) {
            return C47261Igj.LJJIJIIJI("address_edit_fragment", "order_submit_fragment");
        }
        boolean z3 = false;
        if (billInfoData != null) {
            ShippingAddress shippingAddress = billInfoData.getShippingAddress();
            if (shippingAddress != null && shippingAddress.getShippingAddress() != null) {
                z = true;
            } else {
                z = false;
            }
            PaymentMethodsData paymentMethods = billInfoData.getPaymentMethods();
            if (paymentMethods != null && (list = paymentMethods.storedMethods) != null) {
                z2 = !list.isEmpty();
            } else {
                z2 = false;
            }
            if (billInfoData.getExceptionUX() != null) {
                z3 = true;
            }
            boolean LIZ = C27855AwV.LIZ(billInfoData.getNewShopOrders());
            ArrayList arrayList = new ArrayList();
            int LIZ2 = C27823Avz.LIZ();
            if (LIZ2 == 1) {
                arrayList.add("order_submit_fragment");
            } else if (LIZ2 == 2) {
                if (!z && !z3 && !LIZ) {
                    arrayList.add("address_edit_fragment");
                }
                arrayList.add("order_submit_fragment");
            } else if (LIZ2 == 3) {
                if (!z && !z2 && !z3 && !LIZ) {
                    arrayList.add("address_edit_fragment");
                    arrayList.add("payment_fragment");
                }
                arrayList.add("order_submit_fragment");
            } else {
                C78983UzD.LJIILL("Combinepayment VM not match the configuration");
            }
            return arrayList;
        }
        return C47261Igj.LJJIJ("order_submit_fragment");
    }

    public final List<OrderShopDigest> ew0(List<OrderShopDigest> list, C27941Axt c27941Axt, List<String> list2) {
        String str;
        OrderShopDigest orderShopDigest;
        HashMap linkedHashMap;
        String str2;
        String str3;
        if (c27941Axt == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<OrderShopDigest> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(OrderShopDigest.copy$default(it.next(), null, null, null, 7, null));
            }
            arrayList.addAll(arrayList2);
            if (list2 != null) {
                for (String str4 : list2) {
                    for (C27959AyB c27959AyB : c27941Axt.LIZ) {
                        if (c27959AyB != null) {
                            str = c27959AyB.LIZ;
                        } else {
                            str = null;
                        }
                        if (o.LJ(str4, str) && c27959AyB != null && (orderShopDigest = c27959AyB.LJIJJ) != null) {
                            ArrayList arrayList3 = new ArrayList();
                            List<OrderSKUDTO> orderSKUs = orderShopDigest.getOrderSKUs();
                            if (orderSKUs != null) {
                                for (OrderSKUDTO orderSKUDTO : orderSKUs) {
                                    if (orderSKUDTO == null || (str3 = orderSKUDTO.entranceInfo) == null || (linkedHashMap = C27739Aud.LJII(str3)) == null) {
                                        linkedHashMap = new LinkedHashMap();
                                    }
                                    Map<String, String> map = this.LLJJIJIL;
                                    if (orderSKUDTO != null) {
                                        str2 = orderSKUDTO.skuId;
                                    } else {
                                        str2 = null;
                                    }
                                    Object obj = ((HashMap) map).get(str2);
                                    if (obj != null) {
                                        linkedHashMap.put("track_id", obj);
                                    }
                                    linkedHashMap.put("source_page_type", "add_on_order_submit_rec");
                                    linkedHashMap.put("entrance_form", "append_goods_card");
                                    String LIZJ = C75792yF.LIZJ(linkedHashMap);
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("entrance_info", LIZJ);
                                    arrayList3.add(OrderSKUDTO.LIZ(orderSKUDTO, null, pw0(hashMap), 131007));
                                }
                            }
                            arrayList.add(OrderShopDigest.copy$default(orderShopDigest, null, arrayList3, null, 5, null));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final Object qw0(PaymentInfo paymentInfo, boolean z, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ.LJJIJIL(), new C27951Ay3(this, paymentInfo, z, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public static void Hv0(int i, Context context, OrderSubmitViewModel orderSubmitViewModel, Boolean bool) {
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            bool2 = null;
        }
        orderSubmitViewModel.getClass();
        orderSubmitViewModel.withState(new AqS29S1300000_4(context, orderSubmitViewModel, bool2, (String) null, 1));
    }

    public static List jw0(C27941Axt c27941Axt, Boolean bool, C27959AyB c27959AyB, Boolean bool2) {
        Map<String, Boolean> map;
        String str;
        String str2;
        if (c27941Axt == null || (map = c27941Axt.LIZIZ) == null || map.isEmpty()) {
            return null;
        }
        if (o.LJ(bool2, Boolean.FALSE)) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                if (entry.getValue().booleanValue()) {
                    arrayList.add(entry.getKey());
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, Boolean> entry2 : map.entrySet()) {
            if (entry2.getValue().booleanValue()) {
                arrayList2.add(entry2.getKey());
            }
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            if (c27959AyB != null && (str2 = c27959AyB.LIZ) != null && !arrayList2.contains(str2)) {
                arrayList2.add(str2);
            }
        } else if (c27959AyB != null && (str = c27959AyB.LIZ) != null && arrayList2.contains(str)) {
            arrayList2.remove(str);
        }
        return arrayList2;
    }

    public final void Fw0(FragmentManager fragmentManager, PaymentMethod ccdcPaymentMethod, PaymentInfo paymentInfo, String openType) {
        PaymentMethodsData paymentMethodsData;
        Address address;
        String str;
        String str2;
        EnumC28021AzB enumC28021AzB;
        PaymentMethodsData paymentMethods;
        Summary summary;
        Price total;
        Summary summary2;
        Price total2;
        o.LJIIIZ(ccdcPaymentMethod, "ccdcPaymentMethod");
        o.LJIIIZ(openType, "openType");
        BillInfoData billInfoData = this.LJZ;
        PaymentGuaranteeInfo paymentGuaranteeInfo = null;
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.getPaymentMethods();
        } else {
            paymentMethodsData = null;
        }
        Integer valueOf = Integer.valueOf(EnumC28094B0w.CONTINUE.ordinal());
        HashMap hashMap = new HashMap();
        HashMap<String, Object> hashMap2 = this.LLIL;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        hashMap.put("previous_page", "order_submit");
        hashMap.put("page_info", "add");
        hashMap.putAll(fw0(false));
        ShippingAddress shippingAddress = this.LJLZ;
        if (shippingAddress != null) {
            address = shippingAddress.getShippingAddress();
        } else {
            address = null;
        }
        BillInfoData billInfoData2 = this.LJZ;
        if (billInfoData2 != null && (summary2 = billInfoData2.getSummary()) != null && (total2 = summary2.getTotal()) != null) {
            str = total2.getPriceVal();
        } else {
            str = null;
        }
        BillInfoData billInfoData3 = this.LJZ;
        if (billInfoData3 != null && (summary = billInfoData3.getSummary()) != null && (total = summary.getTotal()) != null) {
            str2 = total.getCurrency();
        } else {
            str2 = null;
        }
        BillInfoData billInfoData4 = this.LJZ;
        if (billInfoData4 != null && (paymentMethods = billInfoData4.getPaymentMethods()) != null) {
            paymentGuaranteeInfo = paymentMethods.guaranteeInfo;
        }
        EnterParams enterParams = new EnterParams(null, null, valueOf, paymentMethodsData, null, true, paymentInfo, hashMap, null, null, address, str, str2, "ordersubmit", null, null, paymentGuaranteeInfo, 49920, null);
        this.LLII = "next";
        xw0();
        SAN san = SAN.LIZ;
        String str3 = ccdcPaymentMethod.id;
        san.getClass();
        if (SAN.LJ(str3)) {
            enumC28021AzB = EnumC28021AzB.ADD_ATM;
        } else {
            enumC28021AzB = EnumC28021AzB.ADD_CCDC;
        }
        C28113B1p.LIZ(fragmentManager, ccdcPaymentMethod, enterParams, null, openType, enumC28021AzB);
    }

    public final void Iw0(C26965Ai9 mainOrderInfoVO, List<LogisticDTO> list, Context context, String str) {
        o.LJIIIZ(mainOrderInfoVO, "mainOrderInfoVO");
        xw0();
        C78565UsT.LJJIJ(this, MBB.INSTANCE, new C26999Aih(context, list, mainOrderInfoVO, this, str, null));
        C27949Ay1.LJIJJ("logistics", null, 6);
    }

    public final void Lv0(BillInfoData billInfoData, BillInfoRequest billInfoRequest, boolean z, boolean z2) {
        Boolean bool;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkAndUpdateBillInfoData, infoData:");
        if (billInfoData != null) {
            bool = billInfoData.isFromChunk();
        } else {
            bool = null;
        }
        LIZ.append(bool);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        C78565UsT.LJJIJ(this, MBB.INSTANCE, new C27952Ay4(billInfoData, this, billInfoRequest, z, z2, null));
    }

    public final void Vw0(C27941Axt c27941Axt, boolean z, List<AddonProductInfo> list, C27959AyB skuInfo) {
        o.LJIIIZ(skuInfo, "skuInfo");
        List<String> jw0 = jw0(c27941Axt, Boolean.valueOf(z), skuInfo, Boolean.TRUE);
        List<OrderShopDigest> ew0 = ew0(this.LJLJLLL, c27941Axt, jw0);
        this.LLJJJ = list;
        this.LLJJJIL = jw0;
        Lw0(this, false, ew0, false, false, jw0, null, true, null, null, new ChangeInfo(EnumC27805Avh.ADDON_PRODUCT.getValue()), 3445);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
    
        if (r7 != null) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void rw0(boolean r22, java.util.List r23, boolean r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel.rw0(boolean, java.util.List, boolean, java.util.Map):void");
    }

    public static void Iv0(OrderSubmitViewModel orderSubmitViewModel, PaymentInfo paymentInfo, boolean z, String str, int i) {
        String str2 = str;
        if ((i & 8) != 0) {
            str2 = null;
        }
        orderSubmitViewModel.getClass();
        C78565UsT.LJJIJ(orderSubmitViewModel, MBB.INSTANCE, new C27957Ay9(orderSubmitViewModel, z, paymentInfo, str2, false, null));
    }

    public static /* synthetic */ List Vv0(OrderSubmitViewModel orderSubmitViewModel, BillInfoData billInfoData, boolean z, PaymentMethod paymentMethod, CopyOnWriteArrayList copyOnWriteArrayList) {
        return orderSubmitViewModel.Uv0(billInfoData, z, paymentMethod, copyOnWriteArrayList, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011b, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo Wv0(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r13, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r14, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r15, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r16, int r17) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel.Wv0(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, int):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0160, code lost:
    
        if (r9 == null) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0190, code lost:
    
        r3 = r9.installmentInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0192, code lost:
    
        if (r3 == null) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0194, code lost:
    
        r3 = r3.installmentPlans;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        if (r3 == null) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0198, code lost:
    
        r14 = r3.iterator();
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01a1, code lost:
    
        if (r14.hasNext() == false) goto L809;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01a3, code lost:
    
        r13 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01b1, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13.tenure, r23.LLL) == false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01b3, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01b5, code lost:
    
        if (r3 != null) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c5, code lost:
    
        Tw0(Wv0(r23, r9, r3, null, 4), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b7, code lost:
    
        r3 = r9.installmentInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b9, code lost:
    
        if (r3 == null) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01bb, code lost:
    
        r3 = r3.installmentPlans;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bd, code lost:
    
        if (r3 == null) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01bf, code lost:
    
        r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) X.ORZ.LJLLLL(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01ce, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x018c, code lost:
    
        if (r9 == null) goto L478;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a4  */
    /* JADX WARN: Type inference failed for: r11v16, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, T] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPBottomNotice] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Ww0(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r24, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r25, boolean r26, boolean r27, X.InterfaceC67352kd<? super X.C76800UCe> r28) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel.Ww0(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, boolean, boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ow0(Context context, C28025AzF c28025AzF, Throwable th, long j, String str) {
        String str2;
        ExceptionUX exceptionUX;
        String str3;
        Integer exceptionUXType;
        PlatformPromotion platformPromotion;
        long currentTimeMillis = System.currentTimeMillis() - j;
        String LIZIZ = C27944Axw.LIZIZ(this.LJLL, this.LLJJIJIL);
        BillInfoData billInfoData = this.LJZ;
        ExceptionUX exceptionUX2 = null;
        if (billInfoData != null && (platformPromotion = billInfoData.getPlatformPromotion()) != null) {
            str2 = platformPromotion.daInfo;
        } else {
            str2 = null;
        }
        C27739Aud.LJII(str2);
        if (c28025AzF == null) {
            setState(C27969AyL.LJLIL);
            withState(new AqS170S0100000_4(this, 1244));
            withState(new AqS0S2200100_4(this, th, currentTimeMillis, LIZIZ, str, 0));
            return;
        }
        CreateOrderData createOrderData = (CreateOrderData) c28025AzF.data;
        this.LJZL = String.valueOf(c28025AzF.code);
        if (!c28025AzF.isCodeOK()) {
            setState(C27970AyM.LJLIL);
            if (createOrderData != null) {
                exceptionUX2 = createOrderData.exceptionUX;
            }
            this.LJZI = exceptionUX2;
            if ((exceptionUX2 != null && (exceptionUXType = exceptionUX2.getExceptionUXType()) != null && exceptionUXType.intValue() == 2) || ((exceptionUX = this.LJZI) != null && o.LJ(exceptionUX.getRenderPage(), Boolean.TRUE))) {
                str3 = "query_bill_info";
            } else {
                str3 = "create_order";
            }
            this.LLIIIL = str3;
            setState(new AqS29S0001000_4(1, 16));
            withState(new AqS0S2200100_4(this, c28025AzF, currentTimeMillis, LIZIZ, str, 1));
            return;
        }
        withState(new C28050Aze(context, createOrderData, this, c28025AzF, str, currentTimeMillis, LIZIZ, j));
    }

    public final List<Object> Uv0(BillInfoData billInfoData, boolean z, PaymentMethod paymentMethod, CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        ShippingService shippingService;
        String str;
        int value;
        String str2;
        Integer num;
        if (billInfoData != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<ShopOrderNew> newShopOrders = billInfoData.getNewShopOrders();
            if (newShopOrders != null) {
                for (ShopOrderNew shopOrderNew : newShopOrders) {
                    List<MainOrderInfo> list = shopOrderNew.mainOrderInfos;
                    if (list != null) {
                        for (MainOrderInfo mainOrderInfo : list) {
                            if (!C1XY.LJIJJLI(mainOrderInfo)) {
                                MainOrderAvailableInfo mainOrderAvailableInfo = mainOrderInfo.availableInfo;
                                if (mainOrderAvailableInfo != null && (num = mainOrderAvailableInfo.availableStatus) != null) {
                                    value = num.intValue();
                                } else {
                                    value = EnumC28013Az3.UNKNOWN.getValue();
                                }
                                if (value != EnumC28013Az3.UNAVAILABLE_SHOP_CLOSE.getValue()) {
                                    str2 = String.valueOf(value);
                                } else {
                                    str2 = shopOrderNew.sellerId;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                }
                                if (linkedHashMap.get(str2) == null) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(mainOrderInfo);
                                    linkedHashMap.put(str2, arrayList);
                                } else {
                                    List list2 = (List) linkedHashMap.get(str2);
                                    if (list2 != null) {
                                        list2.add(mainOrderInfo);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            List<ShopOrderNew> newShopOrders2 = billInfoData.getNewShopOrders();
            if (newShopOrders2 != null) {
                for (ShopOrderNew shopOrderNew2 : newShopOrders2) {
                    ArrayList arrayList3 = new ArrayList();
                    List<MainOrderInfo> list3 = shopOrderNew2.mainOrderInfos;
                    if (list3 != null) {
                        for (MainOrderInfo mainOrderInfo2 : list3) {
                            if (C1XY.LJIJJLI(mainOrderInfo2)) {
                                arrayList3.add(mainOrderInfo2);
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        shopOrderNew2.mainOrderInfos = arrayList3;
                        arrayList2.add(shopOrderNew2);
                    }
                }
            }
            C27949Ay1.LJIILLIIL = "";
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                List<MainOrderInfo> list4 = ((ShopOrderNew) it.next()).mainOrderInfos;
                if (list4 != null) {
                    for (MainOrderInfo mainOrderInfo3 : list4) {
                        if (C1XY.LJIJJLI(mainOrderInfo3)) {
                            List<LogisticDTO> list5 = mainOrderInfo3.logistics;
                            LogisticDTO logisticDTO = null;
                            if (list5 != null) {
                                Iterator<LogisticDTO> it2 = list5.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    LogisticDTO next = it2.next();
                                    if (o.LJ(next.logisticsServiceId, mainOrderInfo3.selectedLogisticsServiceId)) {
                                        logisticDTO = next;
                                        break;
                                    }
                                }
                                LogisticDTO logisticDTO2 = logisticDTO;
                                if (logisticDTO2 != null && (shippingService = logisticDTO2.shippingService) != null && (str = shippingService.shippingRightsContent) != null) {
                                    if (o.LJ(C27949Ay1.LJIILLIIL, "")) {
                                        C27949Ay1.LJIILLIIL = str;
                                    }
                                    if (s.LJLJJL(C27949Ay1.LJIILLIIL, new String[]{","}, 0, 6).size() < s.LJLJJL(str, new String[]{","}, 0, 6).size()) {
                                        C27949Ay1.LJIILLIIL = str;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Iterator it3 = linkedHashMap.values().iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                Iterator it4 = ((List) it3.next()).iterator();
                int i5 = 0;
                while (it4.hasNext()) {
                    List<PackedSku> list6 = ((MainOrderInfo) it4.next()).packedSkus;
                    if (list6 != null) {
                        i3 = list6.size();
                    } else {
                        i3 = 0;
                    }
                    i5 += i3;
                }
                i4 += i5;
            }
            this.LLLFFI = i4;
            Iterator it5 = arrayList2.iterator();
            int i6 = 0;
            while (it5.hasNext()) {
                List<MainOrderInfo> list7 = ((ShopOrderNew) it5.next()).mainOrderInfos;
                if (list7 != null) {
                    Iterator<MainOrderInfo> it6 = list7.iterator();
                    i = 0;
                    while (it6.hasNext()) {
                        List<PackedSku> list8 = it6.next().packedSkus;
                        if (list8 != null) {
                            i2 = list8.size();
                        } else {
                            i2 = 0;
                        }
                        i += i2;
                    }
                } else {
                    i = 0;
                }
                i6 += i;
            }
            this.LLLFZ = i6;
            setState(new AqS170S0100000_4(arrayList2, (List<? extends Object>) 289));
            return Cw0(new C27963AyF(billInfoData, z, linkedHashMap, arrayList2, z3, paymentMethod, z2, copyOnWriteArrayList));
        }
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest] */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static C84657XKj Lw0(OrderSubmitViewModel orderSubmitViewModel, boolean z, List list, boolean z2, boolean z3, List list2, List list3, boolean z4, List list4, List list5, ChangeInfo changeInfo, int i) {
        boolean z5;
        boolean z6;
        List list6;
        Integer num;
        Boolean bool;
        String billInfoParams;
        String str;
        C27954Ay6 c27954Ay6;
        ?? r1;
        ChangeInfo changeInfo2 = changeInfo;
        List list7 = list4;
        List list8 = list;
        boolean z7 = z;
        boolean z8 = z2;
        boolean z9 = z3;
        List list9 = list5;
        List list10 = list2;
        List list11 = list3;
        if ((i & 1) != 0) {
            z7 = true;
        }
        if ((i & 2) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((i & 4) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((i & 8) != 0) {
            list8 = null;
        }
        if ((i & 32) != 0) {
            z8 = false;
        }
        if ((i & 64) != 0) {
            z9 = false;
        }
        if ((i & 128) != 0) {
            list10 = C61878OQg.INSTANCE;
        }
        if ((i & 256) != 0) {
            list11 = null;
        }
        if ((i & 512) != 0) {
            z4 = false;
        }
        if ((i & 1024) != 0) {
            list7 = 0;
        }
        if ((i & 2048) != 0) {
            list9 = null;
        }
        if ((i & 4096) != 0) {
            changeInfo2 = new ChangeInfo(EnumC27805Avh.DEFAULT.getValue());
        }
        orderSubmitViewModel.getClass();
        o.LJIIIZ(changeInfo2, "changeInfo");
        C84657XKj LIZ = C77275UUl.LIZ();
        if (orderSubmitViewModel.LLJZIJLIL.LIZJ) {
            C78983UzD.LJIILL("refresh osp when paid failed");
            return null;
        }
        orderSubmitViewModel.withState(new AqS170S0100000_4(orderSubmitViewModel, 1233));
        if (list10 != null && list10.isEmpty() && !z4) {
            C27941Axt c27941Axt = orderSubmitViewModel.LJLL;
            Boolean bool2 = Boolean.FALSE;
            list10 = jw0(c27941Axt, bool2, null, bool2);
        }
        if (list8 == null) {
            list6 = orderSubmitViewModel.ew0(orderSubmitViewModel.LJLJLLL, orderSubmitViewModel.LJLL, list10);
        } else {
            list6 = list8;
        }
        if (list7 == 0) {
            List<VoucherInfoNew> Zv0 = orderSubmitViewModel.Zv0();
            list7 = new ArrayList();
            Iterator it = ((ArrayList) Zv0).iterator();
            while (it.hasNext()) {
                String str2 = ((VoucherInfoNew) it.next()).promotionId;
                if (str2 != null) {
                    list7.add(str2);
                }
            }
        }
        if (list9 == null) {
            list9 = new ArrayList();
            C78609UtB.LJJLI(orderSubmitViewModel.LLIZ, new AqS170S0100000_4(list9, (List<? extends Object>) 1231));
            C78609UtB.LJJLI(orderSubmitViewModel.LLILZLL, new AqS170S0100000_4(list9, (List<? extends Object>) 1232));
        }
        C68322mC c68322mC = new C68322mC();
        String str3 = orderSubmitViewModel.LJLJLJ;
        if (list8 == null) {
            list8 = list6;
        }
        int i2 = orderSubmitViewModel.LJLJJLL;
        PaymentMethodInfo LIZ2 = SA5.LIZ(orderSubmitViewModel.LL, false);
        boolean z10 = orderSubmitViewModel.LLILZ;
        List<String> list12 = orderSubmitViewModel.LLILLJJLI;
        String str4 = orderSubmitViewModel.LLIZLLLIL;
        List<String> list13 = orderSubmitViewModel.LLILLL;
        int[] LJFF = M2T.LJFF(orderSubmitViewModel.LLIL);
        String str5 = orderSubmitViewModel.LLJJ;
        if (list11 == null) {
            list11 = orderSubmitViewModel.LLJJJ;
        }
        OrderSubmitRequestParam orderSubmitRequestParam = orderSubmitViewModel.LJLLLL;
        if (orderSubmitRequestParam != null) {
            num = orderSubmitRequestParam.getOneStepOrderType();
        } else {
            num = null;
        }
        OrderSubmitRequestParam orderSubmitRequestParam2 = orderSubmitViewModel.LJLLLL;
        if (orderSubmitRequestParam2 != null) {
            bool = orderSubmitRequestParam2.isFromFollow();
        } else {
            bool = null;
        }
        if (!orderSubmitViewModel.lv0().getLoadSuccess()) {
            OrderSubmitRequestParam orderSubmitRequestParam3 = orderSubmitViewModel.LJLLLL;
            if (orderSubmitRequestParam3 != null) {
                billInfoParams = orderSubmitRequestParam3.getBillInfoParams();
            }
            billInfoParams = null;
        } else {
            BillInfoData billInfoData = orderSubmitViewModel.LJZ;
            if (billInfoData != null) {
                billInfoParams = billInfoData.getBillInfoParams();
            }
            billInfoParams = null;
        }
        PageSourceInfo LIZJ = C39468FeK.LIZJ();
        if (LIZJ != null) {
            str = C27739Aud.LJI(LIZJ);
        } else {
            str = null;
        }
        int LJ = C27206Am2.LJ(C78866UxK.LJJZZIII(orderSubmitViewModel.LLJLLL), "order_submit", null);
        boolean z11 = orderSubmitViewModel.LLJZ;
        C70313Rif c70313Rif = C70313Rif.LIZ;
        HashMap<String, Object> hashMap = orderSubmitViewModel.LLIL;
        c70313Rif.getClass();
        ?? billInfoRequest = new BillInfoRequest(str3, i2, list8, z7, z5, z6, false, list7, Boolean.valueOf(z10), list12, false, LIZ2, null, str4, list13, list10, LJFF, str5, list11, num, bool, billInfoParams, list9, null, str, LJ, z11, C70313Rif.LIZ(hashMap), changeInfo2, 8393792, null);
        c68322mC.element = billInfoRequest;
        List<OrderShopDigest> orderShop = billInfoRequest.getOrderShop();
        if (orderShop != null && orderShop.isEmpty() && (c27954Ay6 = orderSubmitViewModel.LLILL) != null && (r1 = c27954Ay6.LJLJJLL) != 0) {
            c68322mC.element = r1;
        }
        C78565UsT.LJJIJ(orderSubmitViewModel, MBB.INSTANCE, new C27816Avs(orderSubmitViewModel, c68322mC, false, z8, z9, LIZ, null));
        return LIZ;
    }
}
