package kotlin.jvm.internal;

import X.ARI;
import X.ARL;
import X.ARN;
import X.AbstractC65781Prl;
import X.C234109Gs;
import X.C234159Gx;
import X.C27943Axv;
import X.C4LX;
import X.C70414RkI;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.UPK;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarBaseComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public class AqS8S1201000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS8S1201000_4 aqS8S1201000_4, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C234159Gx(((ProfileNavBarBaseComponent) aqS8S1201000_4.l1).K3(), aqS8S1201000_4.i3, (ProfileComponents) aqS8S1201000_4.l2);
        hierarchyData.LIZIZ = aqS8S1201000_4.s0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS8S1201000_4 aqS8S1201000_4, Object obj) {
        String str;
        String str2;
        int i;
        Integer num;
        Integer num2;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS8S1201000_4.l1).LIZIZ);
        C70414RkI c70414RkI = (C70414RkI) aqS8S1201000_4.l1;
        int i2 = aqS8S1201000_4.i3;
        ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) aqS8S1201000_4.l2;
        String str3 = aqS8S1201000_4.s0;
        c70414RkI.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str4 = "";
        if (reviewFilterStruct == null || (str = reviewFilterStruct.filterId) == null) {
            str = "";
        }
        linkedHashMap.put("filter_id", str);
        if (reviewFilterStruct == null || (str2 = reviewFilterStruct.nameEng) == null) {
            str2 = "";
        }
        linkedHashMap.put("filter_name", str2);
        if (reviewFilterStruct != null && (num2 = reviewFilterStruct.type) != null) {
            if (num2.intValue() == 3) {
                str4 = "impression_tag";
            } else if (num2.intValue() == 2) {
                str4 = "rate";
            } else if (num2.intValue() == 1) {
                str4 = "keyword";
            }
        }
        linkedHashMap.put("filter_type", str4);
        if (reviewFilterStruct != null && (num = reviewFilterStruct.count) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        linkedHashMap.put("review_cnt", Integer.valueOf(i));
        linkedHashMap.put("rank", Integer.valueOf(i2));
        linkedHashMap.put("module_name", str3);
        logNode.compareTo(logNode, linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS8S1201000_4 aqS8S1201000_4, Object obj) {
        String str;
        String str2;
        int i;
        Integer num;
        Integer num2;
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C70414RkI c70414RkI = (C70414RkI) aqS8S1201000_4.l1;
        int i2 = aqS8S1201000_4.i3;
        ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) aqS8S1201000_4.l2;
        String str3 = aqS8S1201000_4.s0;
        c70414RkI.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c70414RkI.LIZIZ);
        String str4 = "";
        if (reviewFilterStruct == null || (str = reviewFilterStruct.filterId) == null) {
            str = "";
        }
        linkedHashMap.put("filter_id", str);
        if (reviewFilterStruct == null || (str2 = reviewFilterStruct.nameEng) == null) {
            str2 = "";
        }
        linkedHashMap.put("filter_name", str2);
        if (reviewFilterStruct != null && (num2 = reviewFilterStruct.type) != null) {
            if (num2.intValue() == 3) {
                str4 = "impression_tag";
            } else if (num2.intValue() == 2) {
                str4 = "rate";
            } else if (num2.intValue() == 1) {
                str4 = "keyword";
            }
        }
        linkedHashMap.put("filter_type", str4);
        if (reviewFilterStruct != null && (num = reviewFilterStruct.count) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        linkedHashMap.put("review_cnt", Integer.valueOf(i));
        linkedHashMap.put("rank", Integer.valueOf(i2));
        linkedHashMap.put("module_name", str3);
        C27943Axv.LIZ(sendLogReturnParams, linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS8S1201000_4 aqS8S1201000_4, Object obj) {
        ARN actionEventArgs = (ARN) obj;
        o.LJIIIZ(actionEventArgs, "actionEventArgs");
        ((ARL) ListProtector.get(((ARI) aqS8S1201000_4.l1).LJFF, 0)).LIZ(new AqS13S1201000_13(aqS8S1201000_4.i3, aqS8S1201000_4.s0, (UPK) aqS8S1201000_4.l2, actionEventArgs, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS8S1201000_4 aqS8S1201000_4, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.nv0((HeaderBaseContainerComponent) aqS8S1201000_4.l1, new AqS2S1001000_4(aqS8S1201000_4.i3, aqS8S1201000_4.s0, 1));
        assemble.wv0((HeaderBaseContainerComponent) aqS8S1201000_4.l1, new AqS58S1100000_4((C234109Gs) aqS8S1201000_4.l2, aqS8S1201000_4.s0, 53));
        ((HeaderBaseContainerComponent) aqS8S1201000_4.l1).LJLJJL.put(aqS8S1201000_4.s0, Integer.valueOf(aqS8S1201000_4.i3));
        ((HeaderBaseContainerComponent) aqS8S1201000_4.l1).LJLJJI.add(aqS8S1201000_4.s0);
        ((ArrayList) ((HeaderBaseContainerComponent) aqS8S1201000_4.l1).LJLJI).add(aqS8S1201000_4.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S1201000_4(ARI ari, int i, String str, UPK upk, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = ari;
        this.i3 = i;
        this.s0 = str;
        this.l2 = upk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S1201000_4(C70414RkI c70414RkI, int i, ReviewFilterStruct reviewFilterStruct, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c70414RkI;
        this.i3 = i;
        this.l2 = reviewFilterStruct;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S1201000_4(HeaderBaseContainerComponent headerBaseContainerComponent, String str, int i, C234109Gs c234109Gs, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = headerBaseContainerComponent;
        this.s0 = str;
        this.i3 = i;
        this.l2 = c234109Gs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S1201000_4(ProfileNavBarBaseComponent profileNavBarBaseComponent, int i, ProfileComponents profileComponents, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = profileNavBarBaseComponent;
        this.i3 = i;
        this.l2 = profileComponents;
        this.s0 = str;
    }
}
