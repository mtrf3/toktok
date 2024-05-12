package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UQI extends F9E implements Serializable {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final int LJLJLLL;

    public static /* synthetic */ UQI copy$default(UQI uqi, int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = uqi.LJLIL;
        }
        if ((i4 & 2) != 0) {
            str = uqi.LJLILLLLZI;
        }
        if ((i4 & 4) != 0) {
            i2 = uqi.LJLJI;
        }
        if ((i4 & 8) != 0) {
            str2 = uqi.LJLJJI;
        }
        if ((i4 & 16) != 0) {
            str3 = uqi.LJLJJL;
        }
        if ((i4 & 32) != 0) {
            str4 = uqi.LJLJJLL;
        }
        if ((i4 & 64) != 0) {
            str5 = uqi.LJLJL;
        }
        if ((i4 & 128) != 0) {
            str6 = uqi.LJLJLJ;
        }
        if ((i4 & 256) != 0) {
            i3 = uqi.LJLJLLL;
        }
        return uqi.copy(i, str, i2, str2, str3, str4, str5, str6, i3);
    }

    public final UQI copy(int i, String header, int i2, String title, String desc, String leftButtonText, String rightButtonText, String toast, int i3) {
        o.LJIIIZ(header, "header");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(leftButtonText, "leftButtonText");
        o.LJIIIZ(rightButtonText, "rightButtonText");
        o.LJIIIZ(toast, "toast");
        return new UQI(i, header, i2, title, desc, leftButtonText, rightButtonText, toast, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, Integer.valueOf(this.LJLJLLL)};
    }

    public final String getDesc() {
        return this.LJLJJL;
    }

    public final String getHeader() {
        return this.LJLILLLLZI;
    }

    public final int getIconRes() {
        return this.LJLJI;
    }

    public final String getLeftButtonText() {
        return this.LJLJJLL;
    }

    public final String getRightButtonText() {
        return this.LJLJL;
    }

    public final int getSocialRecType() {
        return this.LJLIL;
    }

    public final int getStep() {
        return this.LJLJLLL;
    }

    public final String getTitle() {
        return this.LJLJJI;
    }

    public final String getToast() {
        return this.LJLJLJ;
    }

    public UQI(int i, String header, int i2, String title, String desc, String leftButtonText, String rightButtonText, String toast, int i3) {
        o.LJIIIZ(header, "header");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(leftButtonText, "leftButtonText");
        o.LJIIIZ(rightButtonText, "rightButtonText");
        o.LJIIIZ(toast, "toast");
        this.LJLIL = i;
        this.LJLILLLLZI = header;
        this.LJLJI = i2;
        this.LJLJJI = title;
        this.LJLJJL = desc;
        this.LJLJJLL = leftButtonText;
        this.LJLJL = rightButtonText;
        this.LJLJLJ = toast;
        this.LJLJLLL = i3;
    }

    public /* synthetic */ UQI(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? "" : str5, (i4 & 128) == 0 ? str6 : "", i3);
    }
}
