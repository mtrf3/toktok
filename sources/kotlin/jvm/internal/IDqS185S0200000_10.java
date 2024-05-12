package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C4LD;
import X.C60193Njp;
import X.C60213Nk9;
import X.C62473OfV;
import X.C76800UCe;
import X.InterfaceC40516FvE;
import X.InterfaceC60172NjU;
import X.InterfaceC88473Ynt;
import X.KL2;
import X.OSZ;
import X.OXH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import java.util.List;

/* loaded from: classes11.dex */
public class IDqS185S0200000_10 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS185S0200000_10(OXH oxh, WebShareInfo.HybridContainerInfo hybridContainerInfo, int i) {
        super(3);
        this.$t = i;
        this.l0 = oxh;
        this.l1 = hybridContainerInfo;
    }

    public final void invoke$0(InterfaceC40516FvE instance, List<? extends C60213Nk9<? extends View>> viewComponents, boolean z) {
        o.LJIIJ(instance, "instance");
        o.LJIIJ(viewComponents, "viewComponents");
        ((C60193Njp) this.l0).LLIIL(viewComponents, (Uri) this.l1, instance, z);
        InterfaceC60172NjU interfaceC60172NjU = ((C60193Njp) this.l0).LJLILLLLZI;
        if (interfaceC60172NjU != null) {
            interfaceC60172NjU.LLIIL(viewComponents, (Uri) this.l1, instance, z);
        }
    }

    public final OSZ<View, FrameLayout.LayoutParams> invoke$1(int i, boolean z, int i2) {
        if (!z) {
            return null;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = ((OXH) this.l0).LJ;
        o.LJII(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "null cannot be cast to non-null type android.view.View");
        FrameLayout.LayoutParams LJII = C4LD.LIZIZ.LJII(((OXH) this.l0).LIZ, i2, (int) KL2.LIZJ(((OXH) this.l0).LIZ, ((WebShareInfo.HybridContainerInfo) this.l1).height), (int) KL2.LIZJ(((OXH) this.l0).LIZ, ((WebShareInfo.HybridContainerInfo) this.l1).width), (int) KL2.LIZJ(((OXH) this.l0).LIZ, ((WebShareInfo.HybridContainerInfo) this.l1).offsetX), (int) KL2.LIZJ(((OXH) this.l0).LIZ, ((WebShareInfo.HybridContainerInfo) this.l1).offsetY), ((WebShareInfo.HybridContainerInfo) this.l1).alignType);
        C16880lQ.LJIIJ(null, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        return new OSZ<>(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, LJII);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS185S0200000_10(Uri uri, C60193Njp c60193Njp, int i) {
        super(3);
        this.$t = i;
        this.l0 = c60193Njp;
        this.l1 = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS185S0200000_10(AwemeSharePackage awemeSharePackage, Context context, int i) {
        super(3);
        this.$t = i;
        this.l0 = awemeSharePackage;
        this.l1 = context;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(IDqS185S0200000_10 iDqS185S0200000_10, Object obj, Object obj2, Object obj3) {
        iDqS185S0200000_10.invoke$0((InterfaceC40516FvE) obj, (List) obj2, ((Boolean) obj3).booleanValue());
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(IDqS185S0200000_10 iDqS185S0200000_10, Object obj, Object obj2, Object obj3) {
        return iDqS185S0200000_10.invoke$1(((Number) obj).intValue(), ((Boolean) obj2).booleanValue(), ((Number) obj3).intValue());
    }

    public static final Object invoke$2(IDqS185S0200000_10 iDqS185S0200000_10, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        ((Number) obj3).intValue();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        String string = ((AwemeSharePackage) iDqS185S0200000_10.l0).extras.getString("aweme_cover_url_opt");
        if (string == null) {
            string = "";
        }
        C62473OfV c62473OfV = new C62473OfV((Context) iDqS185S0200000_10.l1);
        AwemeSharePackage pkg = (AwemeSharePackage) iDqS185S0200000_10.l0;
        o.LJIIIZ(pkg, "pkg");
        c62473OfV.LJLIL = string;
        c62473OfV.LJLILLLLZI = pkg;
        return new OSZ(c62473OfV, layoutParams);
    }
}
