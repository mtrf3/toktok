package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.ArN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27537ArN extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ Object LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C70414RkI LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27537ArN(Object obj, long j, int i, C70414RkI c70414RkI) {
        super(1);
        this.LJLIL = obj;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = c70414RkI;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        String str;
        String obj;
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        Object obj2 = this.LJLIL;
        if (obj2 != null && (obj2 instanceof Long)) {
            logNode.put("duration", Long.valueOf(this.LJLILLLLZI - ((Number) obj2).longValue()));
        }
        logNode.put(WM7.SCENE_SERVICE, Integer.valueOf(this.LJLJI));
        Object obj3 = this.LJLJJI.LIZIZ.get("entrance_form");
        String str2 = "";
        if (obj3 == null || (str = obj3.toString()) == null) {
            str = "";
        }
        logNode.put("entrance_form", str);
        Object obj4 = this.LJLJJI.LIZIZ.get("enter_from_info");
        if (obj4 != null && (obj = obj4.toString()) != null) {
            str2 = obj;
        }
        logNode.put("enter_from_info", str2);
        return C76800UCe.LIZ;
    }
}
