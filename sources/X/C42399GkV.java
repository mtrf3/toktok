package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.GkV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42399GkV extends AbstractC42411Gkh {
    public final List<String> LIZJ;

    @Override // X.AbstractC42411Gkh
    public final String LIZ() {
        List<String> list = this.LIZJ;
        if (list != null) {
            return TextUtils.join(", ", list);
        }
        return "";
    }

    public C42399GkV(List<String> list, String str) {
        super(str);
        this.LIZJ = list;
    }
}
