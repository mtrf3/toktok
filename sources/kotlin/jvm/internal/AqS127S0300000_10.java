package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C025908h;
import X.C16880lQ;
import X.C1DI;
import X.C36746EbW;
import X.C48479J0x;
import X.C58655N0h;
import X.C58704N2e;
import X.C59989NgX;
import X.C62059OXf;
import X.C62061OXh;
import X.C76800UCe;
import X.EnumC57435MgR;
import X.EnumC58698N1y;
import X.InterfaceC36488ETs;
import X.InterfaceC37146Ehy;
import X.InterfaceC60949Nw1;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.N5M;
import X.NBY;
import X.NVO;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import Y.ARunnableS21S0300000_10;
import Y.ARunnableS29S0200000_10;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.TopVideoAdServiceImpl;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AqS127S0300000_10 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public final void invoke$0(boolean z, String str) {
        int i;
        C62061OXh c62061OXh;
        if (z) {
            JSONObject jSONObject = new JSONObject();
            InterfaceC36488ETs interfaceC36488ETs = (InterfaceC36488ETs) this.l1;
            InterfaceC37146Ehy interfaceC37146Ehy = (InterfaceC37146Ehy) this.l2;
            jSONObject.put("sms_code", str);
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS21S0300000_10(interfaceC36488ETs, jSONObject, interfaceC37146Ehy, 4));
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS29S0200000_10((InterfaceC36488ETs) this.l1, (InterfaceC37146Ehy) this.l2, 20));
        }
        C62059OXf c62059OXf = (C62059OXf) this.l0;
        c62059OXf.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopBroadcastReceiver, mCanUseFeature:");
        C1DI.LIZJ(LIZ, c62059OXf.LIZIZ, LIZ, 4);
        try {
            i = C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), c62059OXf.LIZ);
        } catch (Exception unused) {
            i = 1;
        }
        if (C48479J0x.LIZ(c62059OXf.LIZ) && i == 0 && (c62061OXh = c62059OXf.LIZLLL) != null) {
            try {
                C16880lQ.LJJLIIIJL(c62061OXh.LIZ, c62061OXh);
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("unregister exception: ");
                LIZ2.append(e.getMessage());
                C36746EbW.LIZ(4, X1D.LIZIZ(LIZ2));
            }
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS127S0300000_10 aqS127S0300000_10, Object obj, Object obj2) {
        aqS127S0300000_10.invoke$0(((Boolean) obj).booleanValue(), (String) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS127S0300000_10 aqS127S0300000_10, Object obj, Object targetType) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(targetType, "targetType");
        if (targetType == EnumC57435MgR.FOLLOWED) {
            SearchAdServiceImpl searchAdServiceImpl = (SearchAdServiceImpl) aqS127S0300000_10.l0;
            AwemeRawAd awemeRawAd = (AwemeRawAd) aqS127S0300000_10.l1;
            searchAdServiceImpl.getClass();
            C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad_bg", "follow", awemeRawAd);
            LIZLLL.LIZIZ(1, "is_ci");
            LIZLLL.LIZJ("bg_button", "refer");
            LIZLLL.LJI();
            ((SearchAdServiceImpl) aqS127S0300000_10.l0).LJII = true;
            ((InterfaceC65784Pro) aqS127S0300000_10.l2).invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS127S0300000_10 aqS127S0300000_10, Object obj, Object targetType) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(targetType, "targetType");
        if (targetType == EnumC57435MgR.FOLLOWED) {
            C025908h.LIZLLL("result_ad_bg", "follow", (AwemeRawAd) aqS127S0300000_10.l0, "bg_button", "refer");
            ((TopVideoAdServiceImpl) aqS127S0300000_10.l1).LJ = true;
            ((InterfaceC65784Pro) aqS127S0300000_10.l2).invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS127S0300000_10 aqS127S0300000_10, Object obj, Object obj2) {
        InterfaceC60949Nw1 receiver = (InterfaceC60949Nw1) obj;
        SparkPopup popup = (SparkPopup) obj2;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(popup, "popup");
        receiver.LJIJJ(popup, (LayoutInflater) aqS127S0300000_10.l0, (ViewGroup) aqS127S0300000_10.l1, (Bundle) aqS127S0300000_10.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS127S0300000_10 aqS127S0300000_10, Object obj, Object obj2) {
        InterfaceC60949Nw1 receiver = (InterfaceC60949Nw1) obj;
        SparkPopup popup = (SparkPopup) obj2;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(popup, "popup");
        receiver.LJIIIIZZ(popup, (LayoutInflater) aqS127S0300000_10.l0, (ViewGroup) aqS127S0300000_10.l1, (Bundle) aqS127S0300000_10.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS127S0300000_10 aqS127S0300000_10, Object obj, Object itemID) {
        Context context;
        View view = (View) obj;
        o.LJIIIZ(itemID, "itemID");
        if (view != null && (context = view.getContext()) != null) {
            C59989NgX.LIZLLL.LIZJ(context, (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) aqS127S0300000_10.l0, (HashSet) aqS127S0300000_10.l1, new NBY(EnumC58698N1y.USE_HALF, false, false, 28), new N5M((NVO) aqS127S0300000_10.l2));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS127S0300000_10(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, NVO nvo, HashSet hashSet, int i) {
        super(2);
        this.$t = i;
        this.l0 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.l1 = hashSet;
        this.l2 = nvo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS127S0300000_10(C62059OXf c62059OXf, InterfaceC36488ETs interfaceC36488ETs, InterfaceC37146Ehy interfaceC37146Ehy, int i) {
        super(2);
        this.$t = i;
        this.l0 = c62059OXf;
        this.l1 = interfaceC36488ETs;
        this.l2 = interfaceC37146Ehy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS127S0300000_10(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i) {
        super(2);
        this.$t = i;
        this.l0 = layoutInflater;
        this.l1 = viewGroup;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS127S0300000_10(SearchAdServiceImpl searchAdServiceImpl, AwemeRawAd awemeRawAd, AqS160S0100000_10 aqS160S0100000_10, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchAdServiceImpl;
        this.l1 = awemeRawAd;
        this.l2 = aqS160S0100000_10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS127S0300000_10(AwemeRawAd awemeRawAd, TopVideoAdServiceImpl topVideoAdServiceImpl, AqS160S0100000_10 aqS160S0100000_10, int i) {
        super(2);
        this.$t = i;
        this.l0 = awemeRawAd;
        this.l1 = topVideoAdServiceImpl;
        this.l2 = aqS160S0100000_10;
    }
}
