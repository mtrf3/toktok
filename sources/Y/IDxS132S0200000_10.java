package Y;

import X.C25574A1y;
import X.C2U8;
import X.C52241Ker;
import X.C62629Oi1;
import X.C62910OmY;
import X.C62913Omb;
import X.C62915Omd;
import X.C62921Omj;
import X.DialogC25756A8y;
import X.EnumC62630Oi2;
import X.InterfaceC116954iR;
import X.InterfaceC62926Omo;
import X.InterfaceC92693kP;
import X.V1B;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDxS132S0200000_10 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onComplete$0(IDxS132S0200000_10 iDxS132S0200000_10) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                return;
            case 1:
                onError$1(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 1:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public static final void onComplete$1(IDxS132S0200000_10 iDxS132S0200000_10) {
        DialogC25756A8y dialogC25756A8y = (DialogC25756A8y) iDxS132S0200000_10.l0;
        if (dialogC25756A8y != null) {
            V1B.LJLILLLLZI(dialogC25756A8y);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r3 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onError$0(Y.IDxS132S0200000_10 r5, java.lang.Throwable r6) {
        /*
            java.lang.String r0 = "e"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.Object r0 = r5.l0
            X.Omo r0 = (X.InterfaceC62926Omo) r0
            if (r0 == 0) goto Le
            r0.onError()
        Le:
            boolean r4 = r6 instanceof X.C38333F2r
            if (r4 == 0) goto L2c
            r0 = r6
            X.F2r r0 = (X.C38333F2r) r0
            java.lang.Object r1 = r0.getRawResponse()
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting"
            kotlin.jvm.internal.o.LJII(r1, r0)
            com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting r1 = (com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting) r1
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r1.getLogPb()
            if (r0 == 0) goto L2c
            java.lang.String r3 = r0.getImprId()
            if (r3 != 0) goto L2e
        L2c:
            java.lang.String r3 = ""
        L2e:
            r2 = 1
            if (r4 == 0) goto L54
            X.F1q r6 = (X.C38306F1q) r6
            int r0 = r6.getErrorCode()
        L37:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "/aweme/v1/compliance/settings/"
            X.C25574A1y.LIZJ(r0, r3, r1)
            int r0 = X.C62913Omb.LIZJ
            if (r0 <= 0) goto L53
            int r0 = r0 - r2
            X.C62913Omb.LIZJ = r0
            java.lang.Object r2 = r5.l1
            X.Omd r2 = (X.C62915Omd) r2
            java.lang.Object r1 = r5.l0
            X.Omo r1 = (X.InterfaceC62926Omo) r1
            r0 = 0
            r2.LIZ(r1, r0)
        L53:
            return
        L54:
            r0 = 1
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDxS132S0200000_10.onError$0(Y.IDxS132S0200000_10, java.lang.Throwable):void");
    }

    public static final void onError$1(IDxS132S0200000_10 iDxS132S0200000_10, Throwable e) {
        o.LJIIIZ(e, "e");
        EnumC62630Oi2 enumC62630Oi2 = EnumC62630Oi2.RESPONSE_ERROR;
        o.LJIIIZ(enumC62630Oi2, "<set-?>");
        C62629Oi1.LIZ = enumC62630Oi2;
        DialogC25756A8y dialogC25756A8y = (DialogC25756A8y) iDxS132S0200000_10.l0;
        if (dialogC25756A8y != null) {
            V1B.LJLILLLLZI(dialogC25756A8y);
        }
    }

    public static final void onNext$0(IDxS132S0200000_10 iDxS132S0200000_10, Object obj) {
        PreferenceSettings preferenceSettings;
        PreferenceSettings preferenceSettings2;
        ComplianceSetting setting = (ComplianceSetting) obj;
        o.LJIIIZ(setting, "setting");
        if (setting.isMixedAge() != 0) {
            C2U8.LIZ(new C62921Omj(setting.isMixedAge()));
        }
        if (C52241Ker.LIZ() && (preferenceSettings = setting.getPreferenceSettings()) != null) {
            int stemFeedStatus = preferenceSettings.getStemFeedStatus();
            ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
            if (LIZ == null || (preferenceSettings2 = LIZ.getPreferenceSettings()) == null || preferenceSettings2.getStemFeedStatus() != stemFeedStatus) {
                C2U8.LIZ(new C62910OmY());
            }
        }
        if (setting.status_code == 0) {
            C62913Omb.LIZ(setting);
            InterfaceC62926Omo interfaceC62926Omo = (InterfaceC62926Omo) iDxS132S0200000_10.l0;
            if (interfaceC62926Omo != null) {
                interfaceC62926Omo.LIZ(setting);
            }
            C25574A1y.LIZ(0, "compliance_api_status", "/aweme/v1/compliance/settings/");
            C62913Omb.LIZJ = 3;
            return;
        }
        InterfaceC62926Omo interfaceC62926Omo2 = (InterfaceC62926Omo) iDxS132S0200000_10.l0;
        if (interfaceC62926Omo2 != null) {
            interfaceC62926Omo2.onError();
        }
        int i = C62913Omb.LIZJ;
        if (i <= 0) {
            return;
        }
        C62913Omb.LIZJ = i - 1;
        ((C62915Omd) iDxS132S0200000_10.l1).LIZ((InterfaceC62926Omo) iDxS132S0200000_10.l0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onNext$1(Y.IDxS132S0200000_10 r6, java.lang.Object r7) {
        /*
            com.ss.android.ugc.aweme.share.silent.util.AuthorizedAppListResponse r7 = (com.ss.android.ugc.aweme.share.silent.util.AuthorizedAppListResponse) r7
            java.lang.String r0 = "t"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Object r0 = r6.l0
            X.A8y r0 = (X.DialogC25756A8y) r0
            if (r0 == 0) goto L10
            X.V1B.LJLILLLLZI(r0)
        L10:
            java.util.ArrayList r0 = r7.getListArray()
            if (r0 == 0) goto L88
            java.lang.Object r3 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.share.silent.util.AuthItem r3 = (com.ss.android.ugc.aweme.share.silent.util.AuthItem) r3
        L1c:
            r2 = 1
            r5 = 0
            if (r3 != 0) goto L67
        L21:
            r4 = 0
        L22:
            boolean r3 = X.C62628Oi0.LIZ()
            java.lang.String r1 = "<set-?>"
            if (r4 == 0) goto L54
            X.C62629Oi1.LJII = r2
            X.Oi2 r0 = X.EnumC62630Oi2.AUTHORIZED
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            X.C62629Oi1.LIZ = r0
            java.lang.Object r1 = r6.l1
            com.bytedance.tux.icon.TuxIconView r1 = (com.bytedance.tux.icon.TuxIconView) r1
            if (r1 == 0) goto L3e
            X.Oed r0 = X.EnumC62419Oed.LEMON8
            X.C62628Oi0.LJFF(r1, r0, r3)
        L3e:
            if (r3 == 0) goto L52
            if (r4 == 0) goto L52
        L42:
            java.lang.String r1 = "auth_status"
            java.lang.String r0 = "is_lighted"
            X.7au r0 = X.C0RN.LIZJ(r4, r1, r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
            java.lang.String r0 = "lemon8_share_icon_show"
            X.FMX.LJIIL(r0, r1)
            return
        L52:
            r2 = 0
            goto L42
        L54:
            X.Oi2 r0 = X.EnumC62630Oi2.UNAUTHORIZED
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            X.C62629Oi1.LIZ = r0
            java.lang.Object r1 = r6.l1
            com.bytedance.tux.icon.TuxIconView r1 = (com.bytedance.tux.icon.TuxIconView) r1
            if (r1 == 0) goto L3e
            X.Oed r0 = X.EnumC62419Oed.LEMON8
            X.C62628Oi0.LJFF(r1, r0, r5)
            goto L3e
        L67:
            java.lang.String r1 = r3.getClientKey()
            java.lang.String r0 = "awrxudrcbk09y7wi"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L21
            java.util.ArrayList r1 = r3.getRawScopes()
            if (r1 != 0) goto L7e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L7e:
            java.lang.String r0 = "post.sync.post_page_selected.lemon8"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L21
            r4 = 1
            goto L22
        L88:
            r3 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDxS132S0200000_10.onNext$1(Y.IDxS132S0200000_10, java.lang.Object):void");
    }

    public IDxS132S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
