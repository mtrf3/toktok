package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.VLs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79596VLs extends AbstractC38228EzQ {
    public final JSONObject LJLILLLLZI;

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        C77123UOp.LJIJJLI(jSONObject, this.LJLILLLLZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79596VLs(String eventType, JSONObject data) {
        super(eventType);
        o.LJIIJ(eventType, "eventType");
        o.LJIIJ(data, "data");
        this.LJLILLLLZI = data;
    }
}
