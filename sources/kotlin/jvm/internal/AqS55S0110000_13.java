package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.B5G;
import X.C74814TXu;
import X.C75078TdK;
import X.C75236Tfs;
import X.C75545Tkr;
import X.C75832TpU;
import X.C75883TqJ;
import X.C76244Tw8;
import X.C76260TwO;
import X.C76800UCe;
import X.C77249UTl;
import X.C77251UTn;
import X.C77253UTp;
import X.C77254UTq;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.TY1;
import X.US3;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes14.dex */
public class AqS55S0110000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AqS55S0110000_13 aqS55S0110000_13, Object obj) {
        String str;
        String str2;
        C75236Tfs setState = (C75236Tfs) obj;
        o.LJIIIZ(setState, "$this$setState");
        boolean z = aqS55S0110000_13.z1;
        LiveEffect liveEffect = (LiveEffect) aqS55S0110000_13.l0;
        String str3 = null;
        if (liveEffect != null) {
            str = liveEffect.getResourceId();
        } else {
            str = null;
        }
        LiveEffect liveEffect2 = (LiveEffect) aqS55S0110000_13.l0;
        if (liveEffect2 != null) {
            str2 = liveEffect2.shareImageUrl;
            str3 = liveEffect2.shareImagePath;
        } else {
            str2 = null;
        }
        return C75236Tfs.LIZ(setState, false, z, str, str2, str3, 3);
    }

    public static final Object invoke$1(AqS55S0110000_13 aqS55S0110000_13, Object obj) {
        ((Number) obj).intValue();
        C74814TXu c74814TXu = (C74814TXu) aqS55S0110000_13.l0;
        boolean z = aqS55S0110000_13.z1;
        c74814TXu.getClass();
        C75078TdK.LIZ(1, z, c74814TXu.LJLJI, c74814TXu.LJLLJ, new TY1(c74814TXu, z));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS55S0110000_13 aqS55S0110000_13, Object obj) {
        US3 buildAuthPipeline = (US3) obj;
        o.LJIIIZ(buildAuthPipeline, "$this$buildAuthPipeline");
        buildAuthPipeline.LIZLLL((InterfaceC70422pa) aqS55S0110000_13.l0);
        buildAuthPipeline.LIZJ(new AqS17S0010000_13(aqS55S0110000_13.z1, 0));
        buildAuthPipeline.LJ(C77249UTl.LJLIL);
        buildAuthPipeline.LIZIZ(C77253UTp.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS55S0110000_13 aqS55S0110000_13, Object obj) {
        US3 buildAuthPipeline = (US3) obj;
        o.LJIIIZ(buildAuthPipeline, "$this$buildAuthPipeline");
        buildAuthPipeline.LIZLLL((InterfaceC70422pa) aqS55S0110000_13.l0);
        buildAuthPipeline.LIZJ(new AqS17S0010000_13(aqS55S0110000_13.z1, 1));
        buildAuthPipeline.LJ(C77251UTn.LJLIL);
        buildAuthPipeline.LIZIZ(C77254UTq.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS55S0110000_13 aqS55S0110000_13, Object it) {
        Object obj;
        List<C75883TqJ> list;
        MutableLiveData<List<C75883TqJ>> mutableLiveData;
        MutableLiveData<List<C75883TqJ>> mutableLiveData2;
        o.LJIIIZ(it, "it");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C76260TwO) aqS55S0110000_13.l0).LJIIJJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C75832TpU c75832TpU = C75832TpU.LIZ;
        boolean z = aqS55S0110000_13.z1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C75832TpU.LJI(linkedHashMap, z);
        C75832TpU.LJIIL(linkedHashMap, z);
        C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
        C75832TpU.LJIILIIL(linkedHashMap);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        C75832TpU.LIZ(linkedHashMap);
        if (C75832TpU.LJIIZILJ()) {
            C76244Tw8 c76244Tw8 = C75832TpU.LJII;
            List<C75883TqJ> list2 = null;
            if (c76244Tw8 != null && (mutableLiveData2 = c76244Tw8.LJ) != null) {
                list = mutableLiveData2.getValue();
            } else {
                list = null;
            }
            C76244Tw8 c76244Tw82 = C75832TpU.LJII;
            if (c76244Tw82 != null && (mutableLiveData = c76244Tw82.LJFF) != null) {
                list2 = mutableLiveData.getValue();
            }
            C75832TpU.LJIILJJIL(list, list2, linkedHashMap);
            C75832TpU.LJJJIL(c75832TpU, "livesdk_pk_option_click", linkedHashMap, "1");
        } else {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_pk_option_click", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S0110000_13(InterfaceC70422pa interfaceC70422pa, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC70422pa;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S0110000_13(C74814TXu c74814TXu, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c74814TXu;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S0110000_13(C76260TwO c76260TwO, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c76260TwO;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S0110000_13(LiveEffect liveEffect, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = liveEffect;
    }
}
