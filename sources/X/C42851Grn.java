package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Grn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42851Grn extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42851Grn(String str, String str2) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject addParam = jSONObject;
        o.LJIIIZ(addParam, "$this$addParam");
        addParam.put("enter_from", "video_edit_page");
        addParam.put("shoot_way", this.LJLIL);
        addParam.put("creation_id", this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
