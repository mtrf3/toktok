package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SBd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71677SBd implements C33Q {
    public final PaymentMethod LJLIL;
    public final List<InterfaceC57784Mm4> LJLILLLLZI;
    public final String LJLJI;
    public final PaymentInfo LJLJJI;
    public final boolean LJLJJL;
    public final Object LJLJJLL;
    public final Object LJLJL;
    public final C27919AxX<PaymentInfo> LJLJLJ;
    public final C27919AxX<OSZ<String, String>> LJLJLLL;
    public final C27919AxX<String> LJLL;
    public final Boolean LJLLI;
    public final Boolean LJLLILLLL;

    public C71677SBd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71677SBd)) {
            return false;
        }
        C71677SBd c71677SBd = (C71677SBd) obj;
        return o.LJ(this.LJLIL, c71677SBd.LJLIL) && o.LJ(this.LJLILLLLZI, c71677SBd.LJLILLLLZI) && o.LJ(this.LJLJI, c71677SBd.LJLJI) && o.LJ(this.LJLJJI, c71677SBd.LJLJJI) && this.LJLJJL == c71677SBd.LJLJJL && o.LJ(this.LJLJJLL, c71677SBd.LJLJJLL) && o.LJ(this.LJLJL, c71677SBd.LJLJL) && o.LJ(this.LJLJLJ, c71677SBd.LJLJLJ) && o.LJ(this.LJLJLLL, c71677SBd.LJLJLLL) && o.LJ(this.LJLL, c71677SBd.LJLL) && o.LJ(this.LJLLI, c71677SBd.LJLLI) && o.LJ(this.LJLLILLLL, c71677SBd.LJLLILLLL);
    }

    public final String toString() {
        return "CCDCAddCardState(ccdcPaymentMethod=" + this.LJLIL + ", powerItemList=" + this.LJLILLLLZI + ", systemError=" + this.LJLJI + ", paymentInfo=" + this.LJLJJI + ", needSave=" + this.LJLJJL + ", dismissCCDCPageAction=" + this.LJLJJLL + ", dismissAll=" + this.LJLJL + ", editBillingAddress=" + this.LJLJLJ + ", showLearnMore=" + this.LJLJLLL + ", toast=" + this.LJLL + ", sameAsShippingAddressSwitch=" + this.LJLLI + ", bottomButtonEnableState=" + this.LJLLILLLL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        PaymentMethod paymentMethod = this.LJLIL;
        int i = 0;
        if (paymentMethod == null) {
            hashCode = 0;
        } else {
            hashCode = paymentMethod.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJLILLLLZI, hashCode * 31, 31);
        String str = this.LJLJI;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (LIZIZ + hashCode2) * 31;
        PaymentInfo paymentInfo = this.LJLJJI;
        if (paymentInfo == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = paymentInfo.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        boolean z = this.LJLJJL;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        Object obj = this.LJLJJLL;
        if (obj == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        Object obj2 = this.LJLJL;
        if (obj2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = obj2.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        C27919AxX<PaymentInfo> c27919AxX = this.LJLJLJ;
        if (c27919AxX == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c27919AxX.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        C27919AxX<OSZ<String, String>> c27919AxX2 = this.LJLJLLL;
        if (c27919AxX2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c27919AxX2.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        C27919AxX<String> c27919AxX3 = this.LJLL;
        if (c27919AxX3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c27919AxX3.hashCode();
        }
        int i10 = (i9 + hashCode8) * 31;
        Boolean bool = this.LJLLI;
        if (bool == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool.hashCode();
        }
        int i11 = (i10 + hashCode9) * 31;
        Boolean bool2 = this.LJLLILLLL;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i11 + i;
    }

    public /* synthetic */ C71677SBd(int i) {
        this(null, new ArrayList(), null, null, false, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C71677SBd(PaymentMethod paymentMethod, List<? extends InterfaceC57784Mm4> powerItemList, String str, PaymentInfo paymentInfo, boolean z, Object obj, Object obj2, C27919AxX<PaymentInfo> c27919AxX, C27919AxX<OSZ<String, String>> c27919AxX2, C27919AxX<String> c27919AxX3, Boolean bool, Boolean bool2) {
        o.LJIIIZ(powerItemList, "powerItemList");
        this.LJLIL = paymentMethod;
        this.LJLILLLLZI = powerItemList;
        this.LJLJI = str;
        this.LJLJJI = paymentInfo;
        this.LJLJJL = z;
        this.LJLJJLL = obj;
        this.LJLJL = obj2;
        this.LJLJLJ = c27919AxX;
        this.LJLJLLL = c27919AxX2;
        this.LJLL = c27919AxX3;
        this.LJLLI = bool;
        this.LJLLILLLL = bool2;
    }

    public static C71677SBd LIZ(C71677SBd c71677SBd, PaymentMethod paymentMethod, List list, String str, PaymentInfo paymentInfo, boolean z, Object obj, Object obj2, C27919AxX c27919AxX, C27919AxX c27919AxX2, C27919AxX c27919AxX3, Boolean bool, Boolean bool2, int i) {
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        C27919AxX c27919AxX4 = c27919AxX3;
        C27919AxX c27919AxX5 = c27919AxX2;
        C27919AxX c27919AxX6 = c27919AxX;
        Object obj3 = obj2;
        List powerItemList = list;
        PaymentMethod paymentMethod2 = paymentMethod;
        String str2 = str;
        PaymentInfo paymentInfo2 = paymentInfo;
        boolean z2 = z;
        Object obj4 = obj;
        if ((i & 1) != 0) {
            paymentMethod2 = c71677SBd.LJLIL;
        }
        if ((i & 2) != 0) {
            powerItemList = c71677SBd.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str2 = c71677SBd.LJLJI;
        }
        if ((i & 8) != 0) {
            paymentInfo2 = c71677SBd.LJLJJI;
        }
        if ((i & 16) != 0) {
            z2 = c71677SBd.LJLJJL;
        }
        if ((i & 32) != 0) {
            obj4 = c71677SBd.LJLJJLL;
        }
        if ((i & 64) != 0) {
            obj3 = c71677SBd.LJLJL;
        }
        if ((i & 128) != 0) {
            c27919AxX6 = c71677SBd.LJLJLJ;
        }
        if ((i & 256) != 0) {
            c27919AxX5 = c71677SBd.LJLJLLL;
        }
        if ((i & 512) != 0) {
            c27919AxX4 = c71677SBd.LJLL;
        }
        if ((i & 1024) != 0) {
            bool4 = c71677SBd.LJLLI;
        }
        if ((i & 2048) != 0) {
            bool3 = c71677SBd.LJLLILLLL;
        }
        c71677SBd.getClass();
        o.LJIIIZ(powerItemList, "powerItemList");
        return new C71677SBd(paymentMethod2, powerItemList, str2, paymentInfo2, z2, obj4, obj3, c27919AxX6, c27919AxX5, c27919AxX4, bool4, bool3);
    }
}
