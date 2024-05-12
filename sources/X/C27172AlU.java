package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import kotlin.jvm.internal.o;

/* renamed from: X.AlU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27172AlU implements InterfaceC27624Asm {
    public final CharSequence LJLIL;
    public final String LJLILLLLZI;
    public final Integer LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;
    public final LogisticLinkRichText LJLJL;
    public final int LJLJLJ;

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        CharSequence charSequence = this.LJLIL;
        int i = 0;
        if (charSequence == null) {
            hashCode = 0;
        } else {
            hashCode = charSequence.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, hashCode * 31, 31);
        Integer num = this.LJLJI;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i2 = (((LJ + hashCode2) * 31) + this.LJLJJI) * 31;
        boolean z = this.LJLJJL;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str = this.LJLJJLL;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        LogisticLinkRichText logisticLinkRichText = this.LJLJL;
        if (logisticLinkRichText != null) {
            i = logisticLinkRichText.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductTextVO(text=");
        LIZ.append((Object) this.LJLIL);
        LIZ.append(", style=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", textId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", indexNum=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", showViewMore=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", reportData=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", linkRichText=");
        LIZ.append(this.LJLJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC27624Asm
    public final String getStyle() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27172AlU)) {
            return false;
        }
        C27172AlU c27172AlU = (C27172AlU) obj;
        if (o.LJ(this.LJLIL, c27172AlU.LJLIL) && o.LJ(this.LJLILLLLZI, c27172AlU.LJLILLLLZI) && o.LJ(this.LJLJI, c27172AlU.LJLJI) && this.LJLJJI == c27172AlU.LJLJJI && this.LJLJJL == c27172AlU.LJLJJL && o.LJ(this.LJLJJLL, c27172AlU.LJLJJLL) && o.LJ(this.LJLJL, c27172AlU.LJLJL)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C27172AlU(CharSequence charSequence, String str, Integer num, int i, String str2, LogisticLinkRichText logisticLinkRichText, int i2) {
        this((i2 & 1) != 0 ? null : charSequence, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? 0 : i, false, (i2 & 32) != 0 ? null : str2, (i2 & 64) == 0 ? logisticLinkRichText : null);
    }

    public C27172AlU(CharSequence charSequence, String style, Integer num, int i, boolean z, String str, LogisticLinkRichText logisticLinkRichText) {
        o.LJIIIZ(style, "style");
        this.LJLIL = charSequence;
        this.LJLILLLLZI = style;
        this.LJLJI = num;
        this.LJLJJI = i;
        this.LJLJJL = z;
        this.LJLJJLL = str;
        this.LJLJL = logisticLinkRichText;
        this.LJLJLJ = EnumC27721AuL.DESCRIPTION.getValue();
    }
}
