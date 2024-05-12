package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C189077bT;
import X.C189157bb;
import X.C189167bc;
import X.C189187be;
import X.C190817eH;
import X.C4LX;
import X.C76800UCe;
import X.InterfaceC194547kI;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.app.Activity;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p005new.PoiDetailContentHeaderNewRegionalAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class AqS28S1300000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS28S1300000_3 aqS28S1300000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Activity) aqS28S1300000_3.l1).getString(R.string.p_3);
        o.LJIIIIZZ(string, "activity.getString(R.str…vacy_setting_dialog_post)");
        actionGroup.LJII(string, new AqS57S1100000_3(aqS28S1300000_3.s0, (InterfaceC65784Pro) aqS28S1300000_3.l2, 4));
        String string2 = ((Activity) aqS28S1300000_3.l1).getString(R.string.cg_);
        o.LJIIIIZZ(string2, "activity.getString(R.string.cancel)");
        actionGroup.LJIIIZ(string2, new AqS57S1100000_3(aqS28S1300000_3.s0, (InterfaceC65784Pro) aqS28S1300000_3.l3, 5));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0164, code lost:
    
        if (r3 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS28S1300000_3 r4, java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS28S1300000_3.invoke$1(kotlin.jvm.internal.AqS28S1300000_3, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AqS28S1300000_3 aqS28S1300000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) aqS28S1300000_3.l1;
        String str = aqS28S1300000_3.s0;
        assemble.nv0(poiDetailContentHeaderBaseAssemV3, new AqS28S1300000_3((C190817eH) aqS28S1300000_3.l3, poiDetailContentHeaderBaseAssemV3, (PoiListApi.PoiDetailResponse) aqS28S1300000_3.l2, str, 3));
        assemble.xv0((PoiDetailContentHeaderBaseAssemV3) aqS28S1300000_3.l1, C189157bb.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS28S1300000_3 aqS28S1300000_3, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        String str = aqS28S1300000_3.s0;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) aqS28S1300000_3.l1;
        hierarchyData.LIZ = new C189187be(str, poiDetailResponse.isCollected, 0, poiDetailResponse.name, poiDetailResponse.address, ((PoiDetailContentHeaderBaseAssemV3) aqS28S1300000_3.l2).A3(poiDetailResponse), (C190817eH) aqS28S1300000_3.l3, 4);
        hierarchyData.LIZIZ = "PoiCollectHierarchyData";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS28S1300000_3 aqS28S1300000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem = (PoiDetailContentHeaderBaseAssem) aqS28S1300000_3.l1;
        String str = aqS28S1300000_3.s0;
        assemble.nv0(poiDetailContentHeaderBaseAssem, new AqS28S1300000_3((C190817eH) aqS28S1300000_3.l3, poiDetailContentHeaderBaseAssem, (PoiListApi.PoiDetailResponse) aqS28S1300000_3.l2, str, 5));
        assemble.xv0((PoiDetailContentHeaderBaseAssem) aqS28S1300000_3.l1, C189167bc.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS28S1300000_3 aqS28S1300000_3, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        String str = aqS28S1300000_3.s0;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) aqS28S1300000_3.l1;
        hierarchyData.LIZ = new C189187be(str, poiDetailResponse.isCollected, 0, poiDetailResponse.name, poiDetailResponse.address, ((PoiDetailContentHeaderBaseAssem) aqS28S1300000_3.l2).x3(poiDetailResponse), (C190817eH) aqS28S1300000_3.l3, 4);
        hierarchyData.LIZIZ = "PoiCollectHierarchyData";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS28S1300000_3 aqS28S1300000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.nv0((PoiDetailContentHeaderNewRegionalAssem) aqS28S1300000_3.l1, new AqS46S1200000_3(aqS28S1300000_3.s0, (PoiListApi.PoiDetailResponse) aqS28S1300000_3.l2, (C190817eH) aqS28S1300000_3.l3, 17));
        assemble.xv0((PoiDetailContentHeaderNewRegionalAssem) aqS28S1300000_3.l1, C189077bT.LJLIL);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS28S1300000_3(X.C190817eH r3, com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3 r4, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r6
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r3
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r6
            r1.l2 = r5
            r1.l3 = r3
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS28S1300000_3.<init>(X.7eH, com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS28S1300000_3(X.C190817eH r3, com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem r4, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 4: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r6
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r3
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r6
            r1.l2 = r5
            r1.l3 = r3
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS28S1300000_3.<init>(X.7eH, com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS28S1300000_3(Activity activity, Activity activity2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(1);
        this.$t = interfaceC65784Pro2;
        this.l1 = activity;
        this.l2 = activity2;
        this.s0 = interfaceC65784Pro;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS28S1300000_3(AbsNowPostUserRowAssem absNowPostUserRowAssem, AbsNowPostUserRowAssem<T, RECEIVER> absNowPostUserRowAssem2, String str, User user, InterfaceC194547kI interfaceC194547kI) {
        super(1);
        this.$t = interfaceC194547kI;
        this.l1 = absNowPostUserRowAssem;
        this.s0 = absNowPostUserRowAssem2;
        this.l2 = str;
        this.l3 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S1300000_3(PoiDetailContentHeaderNewRegionalAssem poiDetailContentHeaderNewRegionalAssem, String str, PoiListApi.PoiDetailResponse poiDetailResponse, C190817eH c190817eH, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiDetailContentHeaderNewRegionalAssem;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = c190817eH;
    }
}
