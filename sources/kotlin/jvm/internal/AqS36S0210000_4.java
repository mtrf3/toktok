package kotlin.jvm.internal;

import X.AbstractC238349Xa;
import X.AbstractC65781Prl;
import X.C119324mG;
import X.C188727au;
import X.C25770A9m;
import X.C38350F3i;
import X.C76800UCe;
import X.C9XX;
import X.HG3;
import X.InterfaceC65784Pro;
import X.RBX;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.profile.widgets.recommend.UserProfileUserCardAssem;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.business.HeaderRecommendUserCardUserComponent;

/* loaded from: classes5.dex */
public class AqS36S0210000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS36S0210000_4 aqS36S0210000_4) {
        if (!aqS36S0210000_4.z2) {
            C25770A9m c25770A9m = ((UserProfileUserCardAssem) aqS36S0210000_4.l0).LJLJJL;
            if (c25770A9m != null) {
                c25770A9m.setVisibility(8);
                C119324mG c119324mG = ((UserProfileUserCardAssem) aqS36S0210000_4.l0).LJLJJLL;
                if (c119324mG != null) {
                    c119324mG.setAlpha(1.0f);
                    ((UserProfileUserCardAssem) aqS36S0210000_4.l0).R3();
                } else {
                    o.LJIJI("userInfoLayout");
                    throw null;
                }
            } else {
                o.LJIJI("horizontalUserCardLayout");
                throw null;
            }
        } else {
            C25770A9m c25770A9m2 = ((UserProfileUserCardAssem) aqS36S0210000_4.l0).LJLJJL;
            if (c25770A9m2 != null) {
                c25770A9m2.setVisibility(0);
            } else {
                o.LJIJI("horizontalUserCardLayout");
                throw null;
            }
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS36S0210000_4.l1;
        if (interfaceC65784Pro == null) {
            return null;
        }
        interfaceC65784Pro.invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS36S0210000_4 aqS36S0210000_4) {
        Integer num;
        C188727au c188727au = new C188727au();
        C9XX c9xx = (C9XX) aqS36S0210000_4.l0;
        boolean z = aqS36S0210000_4.z2;
        c9xx.getClass();
        c188727au.LJIIIZ("is_login", AbstractC238349Xa.LIZJ(z));
        String queryParameter = UriProtector.getQueryParameter((Uri) aqS36S0210000_4.l1, "social_share_type");
        if (queryParameter != null) {
            num = C38350F3i.LJJIL(queryParameter);
        } else {
            num = null;
        }
        c188727au.LJFF(num, "share_type");
        c188727au.LJIIIZ("share_source", UriProtector.getQueryParameter((Uri) aqS36S0210000_4.l1, "utm_source"));
        c188727au.LJIIIZ("share_link_id", UriProtector.getQueryParameter((Uri) aqS36S0210000_4.l1, "share_link_id"));
        c188727au.LJIIIZ("share_uid", UriProtector.getQueryParameter((Uri) aqS36S0210000_4.l1, "user_id"));
        C9XX c9xx2 = (C9XX) aqS36S0210000_4.l0;
        Uri uri = (Uri) aqS36S0210000_4.l1;
        c9xx2.getClass();
        c188727au.LJIIIZ("is_myself", AbstractC238349Xa.LIZJ(o.LJ(UriProtector.getQueryParameter(uri, "user_id"), ((RBX) HG3.LJIILL()).getCurUserId())));
        c188727au.LJIIIZ("checksum", UriProtector.getQueryParameter((Uri) aqS36S0210000_4.l1, "checksum"));
        c188727au.LJIIIZ("utm_campaign", UriProtector.getQueryParameter((Uri) aqS36S0210000_4.l1, "utm_campaign"));
        return c188727au.LIZ;
    }

    public static final Object invoke$2(AqS36S0210000_4 aqS36S0210000_4) {
        if (!aqS36S0210000_4.z2) {
            ((HeaderRecommendUserCardUserComponent) aqS36S0210000_4.l0).A3().setVisibility(8);
            ((HeaderRecommendUserCardUserComponent) aqS36S0210000_4.l0).F3(-2);
            ((HeaderRecommendUserCardUserComponent) aqS36S0210000_4.l0).C3(-2);
            ((HeaderRecommendUserCardUserComponent) aqS36S0210000_4.l0).E3(1.0f);
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS36S0210000_4.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            return C76800UCe.LIZ;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS36S0210000_4(C9XX c9xx, boolean z, Uri uri, int i) {
        super(0);
        this.$t = i;
        this.l0 = c9xx;
        this.z2 = z;
        this.l1 = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS36S0210000_4(boolean z, boolean z2, UserProfileUserCardAssem userProfileUserCardAssem, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = userProfileUserCardAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS36S0210000_4(boolean z, boolean z2, HeaderRecommendUserCardUserComponent headerRecommendUserCardUserComponent, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = headerRecommendUserCardUserComponent;
    }
}
