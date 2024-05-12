package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.Gkm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42416Gkm extends AbstractC42414Gkk {
    public final List<String> LIZJ;

    @Override // X.AbstractC42414Gkk
    public final String LIZIZ() {
        List<String> list = this.LIZJ;
        if (list != null) {
            return TextUtils.join(", ", list);
        }
        return "";
    }

    public C42416Gkm(List<String> list, String str) {
        super(str);
        this.LIZJ = list;
    }
}
