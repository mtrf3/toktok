package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7S9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7S9 extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorCommonStruct, CharSequence> {
    public static final C7S9 INSTANCE = new C7S9();

    public C7S9() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(AnchorCommonStruct anchorCommonStruct) {
        try {
            String extra = anchorCommonStruct.getExtra();
            if (extra != null) {
                String optString = new JSONObject(extra).optString("third_id");
                o.LJIIIIZZ(optString, "JSONObject(it).optString(\"third_id\")");
                return optString;
            }
            return "";
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return "";
        }
    }
}
