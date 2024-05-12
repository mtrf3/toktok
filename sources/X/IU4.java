package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.List;

/* loaded from: classes9.dex */
public final class IU4 implements IU5 {
    public final /* synthetic */ List LIZ;

    public IU4(List list) {
        this.LIZ = list;
    }

    @Override // X.IU5
    public final void LIZ(String str) {
        if (str.isEmpty()) {
            return;
        }
        for (String str2 : str.split(" ")) {
            this.LIZ.add(Long.valueOf(CastLongProtector.parseLong(str2)));
        }
    }
}
