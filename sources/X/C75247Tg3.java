package X;

import android.graphics.Rect;
import kotlin.jvm.internal.o;

/* renamed from: X.Tg3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75247Tg3 implements C33Q {
    public Integer LJLIL;
    public Integer LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public Rect LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75247Tg3)) {
            return false;
        }
        C75247Tg3 c75247Tg3 = (C75247Tg3) obj;
        return o.LJ(this.LJLIL, c75247Tg3.LJLIL) && o.LJ(this.LJLILLLLZI, c75247Tg3.LJLILLLLZI) && o.LJ(this.LJLJI, c75247Tg3.LJLJI) && this.LJLJJI == c75247Tg3.LJLJJI && o.LJ(this.LJLJJL, c75247Tg3.LJLJJL);
    }

    public final int hashCode() {
        Integer num = this.LJLIL;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LJLJI;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LJLJJI) * 31;
        Rect rect = this.LJLJJL;
        return hashCode3 + (rect != null ? rect.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestTheme(emptyMaskBackgroundColor=");
        LIZ.append(this.LJLIL);
        LIZ.append(", emptyMaskPlusIconResId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", playerBgFilePath=");
        LIZ.append(this.LJLJI);
        LIZ.append(", dividerType=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", playerForegroundClipRect=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C75247Tg3(Integer num, Integer num2, String str, int i, Rect rect) {
        this.LJLIL = num;
        this.LJLILLLLZI = num2;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = rect;
    }
}
