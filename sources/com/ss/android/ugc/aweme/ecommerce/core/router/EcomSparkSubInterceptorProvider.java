package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C73372uL;
import X.InterfaceC73352uJ;
import X.ORZ;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.GlobalOrderListPreLoad;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.OrderListPreLoad;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomOrderListPreLoadOptConfig;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSparkChannelInterceptorService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.impl.LauncherTaskApiImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomSparkSubInterceptorProvider implements IEcomSparkChannelInterceptorService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomSparkChannelInterceptorService
    public final List<InterfaceC73352uJ> LIZ() {
        ArrayList arrayList = new ArrayList();
        if (C73372uL.LIZ) {
            arrayList.add(new InterfaceC73352uJ() { // from class: X.2up
                @Override // X.InterfaceC73352uJ
                public final boolean LIZ(String str) {
                    return o.LJ(str, "fe_tiktok_ecommerce_shop_cart");
                }

                @Override // X.InterfaceC73352uJ
                public final void LIZIZ(SparkContext sparkContext, String url, String str) {
                    o.LJIIIZ(sparkContext, "sparkContext");
                    o.LJIIIZ(url, "url");
                    IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cart_cache_");
                    LIZ.append(createIUserServicebyMonsterPlugin.getCurrentUserID());
                    List LJJIJ = C47261Igj.LJJIJ(C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, "cart_cache"), new OSZ("key", X1D.LIZIZ(LIZ))));
                    StringBuilder LIZJ = b1.LIZJ(url, "&lru_cache_init=");
                    LIZJ.append(C27739Aud.LJI(LJJIJ));
                    sparkContext.LJJIJLIJ(X1D.LIZIZ(LIZJ));
                    if (sparkContext.usePreload) {
                        return;
                    }
                    C64762gS.LIZ.getClass();
                    if (C64762gS.LIZIZ) {
                        EnumC70569Rmn enumC70569Rmn = EnumC70569Rmn.CART_PRODUCT;
                        if (!C73732uv.LIZ(enumC70569Rmn.getValue())) {
                            AbstractC73692ur abstractC73692ur = new AbstractC73692ur(enumC70569Rmn.getValue()) { // from class: X.2un
                                @Override // X.AbstractC73692ur
                                public final List<C78727Uv5> LIZ() {
                                    CopyOnWriteArrayList<String> copyOnWriteArrayList = C64752gR.LIZ;
                                    if (copyOnWriteArrayList.isEmpty() && C64752gR.LIZIZ.isEmpty()) {
                                        C64752gR.LIZIZ(C64752gR.LIZ());
                                    }
                                    int LJIILL = C17N.LJIILL(C64842ga.LIZIZ) - (C17N.LJIILL(C64842ga.LIZJ) * 2);
                                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(copyOnWriteArrayList, 10));
                                    Iterator<String> it = copyOnWriteArrayList.iterator();
                                    while (it.hasNext()) {
                                        String it2 = it.next();
                                        String value = EnumC70569Rmn.CART_PRODUCT.getValue();
                                        o.LJIIIIZZ(it2, "it");
                                        arrayList2.add(new C78727Uv5(value, it2, LJIILL, LJIILL, 16368));
                                    }
                                    return arrayList2;
                                }
                            };
                            C73732uv.LIZIZ.put(abstractC73692ur.LIZ, abstractC73692ur);
                        }
                        EnumC70569Rmn enumC70569Rmn2 = EnumC70569Rmn.CART_SELLER;
                        if (!C73732uv.LIZ(enumC70569Rmn2.getValue())) {
                            AbstractC73692ur abstractC73692ur2 = new AbstractC73692ur(enumC70569Rmn2.getValue()) { // from class: X.2uo
                                @Override // X.AbstractC73692ur
                                public final List<C78727Uv5> LIZ() {
                                    if (C64752gR.LIZ.isEmpty() && C64752gR.LIZIZ.isEmpty()) {
                                        C64752gR.LIZIZ(C64752gR.LIZ());
                                    }
                                    CopyOnWriteArrayList<String> copyOnWriteArrayList = C64752gR.LIZIZ;
                                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(copyOnWriteArrayList, 10));
                                    Iterator<String> it = copyOnWriteArrayList.iterator();
                                    while (it.hasNext()) {
                                        String it2 = it.next();
                                        String value = EnumC70569Rmn.CART_SELLER.getValue();
                                        o.LJIIIIZZ(it2, "it");
                                        arrayList2.add(new C78727Uv5(value, it2, 0, 0, 16380));
                                    }
                                    return arrayList2;
                                }
                            };
                            C73732uv.LIZIZ.put(abstractC73692ur2.LIZ, abstractC73692ur2);
                        }
                        C73732uv.LIZIZ(enumC70569Rmn.getValue());
                        C73732uv.LIZIZ(enumC70569Rmn2.getValue());
                    }
                    if (C73702us.LIZ) {
                        sparkContext.LJJIJIIJI(new C40092FoO());
                    }
                }
            });
            arrayList.add(new InterfaceC73352uJ() { // from class: X.2wZ
                @Override // X.InterfaceC73352uJ
                public final boolean LIZ(String str) {
                    return o.LJ(str, "fe_teu_lynx_order_center");
                }

                @Override // X.InterfaceC73352uJ
                public final void LIZIZ(SparkContext sparkContext, String url, String str) {
                    Integer num;
                    int i;
                    o.LJIIIZ(sparkContext, "sparkContext");
                    o.LJIIIZ(url, "url");
                    String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(url), "tab");
                    if (queryParameter != null) {
                        num = C38350F3i.LJJIL(queryParameter);
                    } else {
                        num = null;
                    }
                    FFL LJIIIZ = FFL.LJIIIZ();
                    EcomOrderListPreLoadOptConfig ecomOrderListPreLoadOptConfig = C2YS.LIZ;
                    LJIIIZ.getClass();
                    EcomOrderListPreLoadOptConfig ecomOrderListPreLoadOptConfig2 = (EcomOrderListPreLoadOptConfig) FFL.LJIJ(true, "ecom_order_list_preload_opt", 31744, EcomOrderListPreLoadOptConfig.class, ecomOrderListPreLoadOptConfig);
                    if (ecomOrderListPreLoadOptConfig2 == null) {
                        ecomOrderListPreLoadOptConfig2 = ecomOrderListPreLoadOptConfig;
                    }
                    int i2 = 0;
                    if (o.LJ(ecomOrderListPreLoadOptConfig2.region, "sea")) {
                        OrderListPreLoad.Companion.getClass();
                        LauncherTaskApiImpl.LJIIIIZZ().LIZJ();
                        Bundle bundle = new Bundle();
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        bundle.putInt("tab", i);
                        C74782wc.LIZ().LIZIZ(bundle, OrderListPreLoad.class, new X8Q() { // from class: X.2wb
                            @Override // X.X8Q
                            public final void LIZ(Exception exception) {
                                o.LJIIIZ(exception, "exception");
                                new C71001Rtl().LJIIIIZZ(0, "/api/v1/trade/list_order/get");
                            }

                            @Override // X.X8Q
                            public final void onSuccess(Object obj) {
                                new C71001Rtl().LJIIIIZZ(1, "/api/v1/trade/list_order/get");
                            }
                        });
                    }
                    FFL.LJIIIZ().getClass();
                    EcomOrderListPreLoadOptConfig ecomOrderListPreLoadOptConfig3 = (EcomOrderListPreLoadOptConfig) FFL.LJIJ(true, "ecom_order_list_preload_opt", 31744, EcomOrderListPreLoadOptConfig.class, ecomOrderListPreLoadOptConfig);
                    if (ecomOrderListPreLoadOptConfig3 != null) {
                        ecomOrderListPreLoadOptConfig = ecomOrderListPreLoadOptConfig3;
                    }
                    if (o.LJ(ecomOrderListPreLoadOptConfig.region, "global")) {
                        GlobalOrderListPreLoad.Companion.getClass();
                        LauncherTaskApiImpl.LJIIIIZZ().LIZJ();
                        Bundle bundle2 = new Bundle();
                        if (num != null) {
                            i2 = num.intValue();
                        }
                        bundle2.putInt("tab", i2);
                        C74782wc.LIZ().LIZIZ(bundle2, GlobalOrderListPreLoad.class, new X8Q() { // from class: X.2wa
                            @Override // X.X8Q
                            public final void LIZ(Exception exception) {
                                o.LJIIIZ(exception, "exception");
                                new C71001Rtl().LJIIIIZZ(0, "/api/v1/aftersale/list_order/get");
                            }

                            @Override // X.X8Q
                            public final void onSuccess(Object obj) {
                                new C71001Rtl().LJIIIIZZ(1, "/api/v1/aftersale/list_order/get");
                            }
                        });
                    }
                }
            });
        }
        return ORZ.LLJI(arrayList);
    }
}
