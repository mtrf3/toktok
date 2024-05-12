package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C50653JuL;
import X.C76800UCe;
import X.C85855Xml;
import X.InterfaceC88472Yns;
import X.KUB;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.wishlist.WishListFragment;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackViewModel;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class AqS51S0110000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS51S0110000_8 aqS51S0110000_8, Object obj) {
        KUB it = (KUB) obj;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RootPanelComponent>>> ");
        LIZ.append((RootPanelComponent) aqS51S0110000_8.l0);
        LIZ.append(", setUserVisibleHint:");
        LIZ.append(aqS51S0110000_8.z1);
        it.LIZLLL = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS51S0110000_8 aqS51S0110000_8, Object updateSource) {
        Map linkedHashMap;
        o.LJIIIZ(updateSource, "$this$updateSource");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (aqS51S0110000_8.z1) {
            C50653JuL.LJLILLLLZI.getClass();
            C50653JuL c50653JuL = (C50653JuL) C85855Xml.LIZIZ(C50653JuL.class);
            if (c50653JuL == null || (linkedHashMap = c50653JuL.LJLIL) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap2.putAll(linkedHashMap);
        }
        linkedHashMap2.putAll((Map) aqS51S0110000_8.l0);
        return new C50653JuL(linkedHashMap2);
    }

    public static final Object invoke$2(AqS51S0110000_8 aqS51S0110000_8, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        long currentTimeMillis = System.currentTimeMillis();
        WishListFragment wishListFragment = (WishListFragment) aqS51S0110000_8.l0;
        float f = ((float) (currentTimeMillis - wishListFragment.LJLJL)) / 1000.0f;
        sendLog.LIZJ("success", Integer.valueOf(aqS51S0110000_8.z1 ? 1 : 0));
        sendLog.LIZJ("load_time", Float.valueOf(f));
        sendLog.LIZJ("schema_url", wishListFragment.LJLJJLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS51S0110000_8 aqS51S0110000_8, Object it) {
        o.LJIIIZ(it, "it");
        ((HashtagFeedbackViewModel) aqS51S0110000_8.l0).setState(new AqS13S0010000_8(aqS51S0110000_8.z1, 10));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S0110000_8(WishListFragment wishListFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = wishListFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S0110000_8(HashtagFeedbackViewModel hashtagFeedbackViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = hashtagFeedbackViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S0110000_8(RootPanelComponent rootPanelComponent, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = rootPanelComponent;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS51S0110000_8(boolean z, boolean z2, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.z1 = z;
        this.l0 = z2;
    }
}
