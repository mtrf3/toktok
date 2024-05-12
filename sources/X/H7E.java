package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H7E extends AbstractC65781Prl implements InterfaceC88472Yns<CreateAnchorInfo, CharSequence> {
    public static final H7E LJLIL = new H7E();

    public H7E() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(CreateAnchorInfo createAnchorInfo) {
        CreateAnchorInfo it = createAnchorInfo;
        o.LJIIIZ(it, "it");
        String string = JSONObjectProtectorUtils.getString(new JSONObject(it.getContent()), "third_id");
        o.LJIIIIZZ(string, "JSONObject(it.content).g…ID,\n                    )");
        return string;
    }
}
