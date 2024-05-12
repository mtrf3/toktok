package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Grv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42859Grv extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42859Grv(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject addParam = jSONObject;
        o.LJIIIZ(addParam, "$this$addParam");
        addParam.put("enter_from", "video_edit_page");
        addParam.put("shoot_way", this.LJLIL);
        addParam.put("creation_id", this.LJLILLLLZI);
        addParam.put("ngo_name", this.LJLJI);
        addParam.put("powered_by", this.LJLJJI);
        addParam.put("language", C42862Gry.LIZ.getValue());
        addParam.put("content_source", this.LJLJJL);
        addParam.put("content_type", this.LJLJJLL);
        addParam.put("impr_position", this.LJLJL);
        return C76800UCe.LIZ;
    }
}
