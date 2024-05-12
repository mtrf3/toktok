package com.ss.android.ugc.aweme.service;

import X.A2Z;
import X.A8B;
import X.A8D;
import X.A8G;
import X.A8I;
import X.C113554cx;
import X.C221108m2;
import X.C254739zB;
import X.C32I;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C77770Ufe;
import X.F5P;
import X.ORZ;
import X.OSZ;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.android.live.wallet.model.IapProductGetParam;
import com.bytedance.android.live.wallet.model.IapProductGetResult;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.PaidContentAnchorInAppSetting;
import com.ss.android.ugc.aweme.model.PriceInfo;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesPricingServiceImpl implements ISeriesPricingService {
    public final Map<String, IapProductGetResult.Item> LIZ = new LinkedHashMap();
    public final Set<String> LIZIZ;

    public static ISeriesPricingService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(ISeriesPricingService.class, false);
        if (LIZ != null) {
            return (ISeriesPricingService) LIZ;
        }
        if (C58096Mr6.i5 == null) {
            synchronized (ISeriesPricingService.class) {
                if (C58096Mr6.i5 == null) {
                    C58096Mr6.i5 = new SeriesPricingServiceImpl();
                }
            }
        }
        return C58096Mr6.i5;
    }

    public SeriesPricingServiceImpl() {
        PaidContentAnchorInAppSetting.LIZ.getClass();
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PaidContentAnchorInAppSetting.IAPKeys iAPKeys = PaidContentAnchorInAppSetting.LIZIZ;
        PaidContentAnchorInAppSetting.IAPKeys iAPKeys2 = (PaidContentAnchorInAppSetting.IAPKeys) LIZLLL.LJIIIIZZ("paid_content", PaidContentAnchorInAppSetting.IAPKeys.class, iAPKeys);
        this.LIZIZ = ORZ.LLJJ((iAPKeys2 != null ? iAPKeys2 : iAPKeys).iAPIDs);
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesPricingService
    public final LiveData<Map<Long, C254739zB>> LIZ(Context context, List<A2Z> list) {
        IapProductGetResult.Item item;
        String str;
        String str2;
        Long l;
        String iapId;
        o.LJIIIZ(context, "context");
        MutableLiveData mutableLiveData = new MutableLiveData();
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS154S0100000_4(new C77770Ufe(new A8D(mutableLiveData), new A8G()), 791));
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<A2Z> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZIZ.getIapId());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<A2Z> it3 = list.iterator();
        while (it3.hasNext()) {
            PriceInfo priceInfo = it3.next().LIZJ;
            if (priceInfo != null && (iapId = priceInfo.getIapId()) != null) {
                arrayList3.add(iapId);
            }
        }
        List LLIIIZ = ORZ.LLIIIZ(arrayList3, arrayList2);
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = ((ArrayList) LLIIIZ).iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (((String) next2).length() > 0) {
                arrayList4.add(next2);
            }
        }
        Set LLJJ = ORZ.LLJJ(arrayList4);
        if (this.LIZ.isEmpty()) {
            Object value = LIZIZ.getValue();
            o.LJIIIIZZ(value, "fetchPricingFromGooglePlay$lambda$0(...)");
            IapProductGetParam iapProductGetParam = new IapProductGetParam();
            List<String> LLJI = ORZ.LLJI(F5P.LJIIJJI(this.LIZIZ, LLJJ));
            o.LJIIIZ(LLJI, "<set-?>");
            iapProductGetParam.productIdList = LLJI;
            ((A8I) value).PD(context, iapProductGetParam);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (A2Z a2z : list) {
                if (a2z.LIZIZ.getIapId().length() > 0 && !this.LIZ.containsKey(a2z.LIZIZ.getIapId())) {
                    linkedHashSet.add(a2z.LIZIZ.getIapId());
                }
                PriceInfo priceInfo2 = a2z.LIZJ;
                if (priceInfo2 != null && priceInfo2.getIapId().length() > 0 && !this.LIZ.containsKey(priceInfo2.getIapId())) {
                    linkedHashSet.add(priceInfo2.getIapId());
                }
            }
            if (linkedHashSet.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (A2Z a2z2 : list) {
                    PriceInfo priceInfo3 = a2z2.LIZIZ;
                    PriceInfo priceInfo4 = a2z2.LIZJ;
                    IapProductGetResult.Item item2 = (IapProductGetResult.Item) C113554cx.LJJJLL(priceInfo3.getIapId(), this.LIZ);
                    if (priceInfo4 != null) {
                        item = (IapProductGetResult.Item) C113554cx.LJJJLL(priceInfo4.getIapId(), this.LIZ);
                    } else {
                        item = null;
                    }
                    String iapId2 = priceInfo3.getIapId();
                    if (priceInfo4 != null) {
                        str = priceInfo4.getIapId();
                    } else {
                        str = null;
                    }
                    String str3 = item2.price;
                    if (item != null) {
                        str2 = item.price;
                    } else {
                        str2 = null;
                    }
                    Long valueOf = Long.valueOf(item2.priceAmountMicros);
                    if (item != null) {
                        l = Long.valueOf(item.priceAmountMicros);
                    } else {
                        l = null;
                    }
                    OSZ osz = new OSZ(Long.valueOf(a2z2.LIZ), new C254739zB(iapId2, str, str3, str2, LIZJ(valueOf, l, item2.currency), false));
                    linkedHashMap.put(osz.getFirst(), osz.getSecond());
                }
                return new MutableLiveData(linkedHashMap);
            }
            Object value2 = LIZIZ.getValue();
            o.LJIIIIZZ(value2, "fetchPricingFromGooglePlay$lambda$0(...)");
            IapProductGetParam iapProductGetParam2 = new IapProductGetParam();
            List<String> LLJI2 = ORZ.LLJI(linkedHashSet);
            o.LJIIIZ(LLJI2, "<set-?>");
            iapProductGetParam2.productIdList = LLJI2;
            ((A8I) value2).PD(context, iapProductGetParam2);
        }
        LiveData<Map<Long, C254739zB>> map = Transformations.map(mutableLiveData, new A8B(list, this, context));
        o.LJIIIIZZ(map, "override fun fetchPricin…        }\n        }\n    }");
        return map;
    }

    public static String LIZJ(Long l, Long l2, String str) {
        if (l == null || l2 == null || str == null) {
            return null;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        o.LJIIIIZZ(currencyInstance, "getCurrencyInstance()");
        currencyInstance.setMinimumFractionDigits(0);
        currencyInstance.setMaximumFractionDigits(2);
        currencyInstance.setCurrency(Currency.getInstance(str));
        return currencyInstance.format(Float.valueOf(((float) (l.longValue() - l2.longValue())) / 1000000.0f));
    }
}
