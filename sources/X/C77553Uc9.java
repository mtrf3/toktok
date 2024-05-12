package X;

import com.bytedance.android.live.wallet.data.api.IExchangeApi;
import com.bytedance.android.live.wallet.data.model.exchange.ExchangeUpdateAddressRequest;
import com.bytedance.android.live.wallet.model.LocationAddress;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Uc9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77553Uc9 implements InterfaceC77761UfV {
    public final /* synthetic */ BillingAddressVM LIZ;

    public C77553Uc9(BillingAddressVM billingAddressVM) {
        this.LIZ = billingAddressVM;
    }

    @Override // X.InterfaceC77761UfV
    public final void LJIILL(String errMsg) {
        o.LJIIIZ(errMsg, "errMsg");
        UIO.LIZIZ("ttlive_wallet_exchange_open_localtion_pick", new UIM(10002, errMsg));
    }

    @Override // X.InterfaceC77761UfV
    public final void LJIILLIIL(boolean z, LocationAddress locationAddress) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C77568UcO c77568UcO;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        if (z) {
            BillingAddressVM billingAddressVM = this.LIZ;
            C77554UcA c77554UcA = billingAddressVM.LJLLL;
            String str13 = "";
            if (c77554UcA != null) {
                LocationObject locationObject = locationAddress.state;
                if (locationObject == null || (str5 = locationObject.name) == null) {
                    str5 = "";
                }
                if (str5.length() > 0) {
                    LocationObject locationObject2 = locationAddress.region;
                    if (locationObject2 == null || (str9 = locationObject2.name) == null) {
                        str9 = "";
                    }
                    LocationObject locationObject3 = locationAddress.state;
                    if (locationObject3 == null || (str10 = locationObject3.name) == null) {
                        str10 = "";
                    }
                    LocationObject locationObject4 = locationAddress.county;
                    if (locationObject4 == null || (str11 = locationObject4.name) == null) {
                        str11 = "";
                    }
                    LocationObject locationObject5 = locationAddress.city;
                    if (locationObject5 == null || (str12 = locationObject5.name) == null) {
                        str12 = "";
                    }
                    c77568UcO = new C77568UcO(str9, str10, str11, str12, null, 16);
                } else {
                    LocationObject locationObject6 = locationAddress.province;
                    if (locationObject6 == null || (str6 = locationObject6.name) == null) {
                        str6 = "";
                    }
                    if (str6.length() > 0) {
                        LocationObject locationObject7 = locationAddress.region;
                        if (locationObject7 == null || (str7 = locationObject7.name) == null) {
                            str7 = "";
                        }
                        LocationObject locationObject8 = locationAddress.province;
                        if (locationObject8 == null || (str8 = locationObject8.name) == null) {
                            str8 = "";
                        }
                        c77568UcO = new C77568UcO(str7, null, null, null, str8, 14);
                    } else {
                        c77568UcO = new C77568UcO(null, null, null, null, null, 31);
                    }
                }
                c77554UcA.LIZIZ = c77568UcO;
                billingAddressVM.LJLLL = c77554UcA;
                billingAddressVM.LJLJLLL.LIZ(c77554UcA);
            }
            BillingAddressVM billingAddressVM2 = this.LIZ;
            billingAddressVM2.getClass();
            ExchangeUpdateAddressRequest exchangeUpdateAddressRequest = new ExchangeUpdateAddressRequest(null, null, null, null, 15, null);
            if (o.LJ(locationAddress.L(), "CA")) {
                exchangeUpdateAddressRequest.countryCode = locationAddress.L();
                LocationObject locationObject9 = locationAddress.province;
                if (locationObject9 != null && (str4 = locationObject9.asciName) != null) {
                    str13 = str4;
                }
                exchangeUpdateAddressRequest.stateCode = str13;
            } else if (o.LJ(locationAddress.L(), "US")) {
                exchangeUpdateAddressRequest.countryCode = locationAddress.L();
                LocationObject locationObject10 = locationAddress.state;
                if (locationObject10 == null || (str = locationObject10.code) == null) {
                    str = "";
                }
                exchangeUpdateAddressRequest.stateCode = str;
                LocationObject locationObject11 = locationAddress.county;
                if (locationObject11 == null || (str2 = locationObject11.asciName) == null) {
                    str2 = "";
                }
                exchangeUpdateAddressRequest.county = str2;
                LocationObject locationObject12 = locationAddress.city;
                if (locationObject12 != null && (str3 = locationObject12.asciName) != null) {
                    str13 = str3;
                }
                exchangeUpdateAddressRequest.city = str13;
            }
            billingAddressVM2.LJLLJ.LIZ(C1EW.LIZ(((IExchangeApi) Q7L.LIZIZ(IExchangeApi.class)).updateBillingAddress(exchangeUpdateAddressRequest)).LJIJJLI(UIN.LJLIL).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9D6
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }, UIQ.LJLIL));
        }
    }
}
