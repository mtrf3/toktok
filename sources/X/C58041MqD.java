package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.MqD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58041MqD extends F9E implements Serializable {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public C58041MqD() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C58041MqD copy$default(C58041MqD c58041MqD, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c58041MqD.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str = c58041MqD.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            str2 = c58041MqD.LJLJI;
        }
        if ((i2 & 8) != 0) {
            str3 = c58041MqD.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            str4 = c58041MqD.LJLJJL;
        }
        return c58041MqD.copy(i, str, str2, str3, str4);
    }

    public final C58041MqD copy(int i, String title, String subTitle, String buttonText, String toast) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(subTitle, "subTitle");
        o.LJIIIZ(buttonText, "buttonText");
        o.LJIIIZ(toast, "toast");
        return new C58041MqD(i, title, subTitle, buttonText, toast);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public final String getButtonText() {
        return this.LJLJJI;
    }

    public final int getSocialRecType() {
        return this.LJLIL;
    }

    public final String getSubTitle() {
        return this.LJLJI;
    }

    public final String getTitle() {
        return this.LJLILLLLZI;
    }

    public final String getToast() {
        return this.LJLJJL;
    }

    public C58041MqD(int i, String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "title", str2, "subTitle", str3, "buttonText", str4, "toast");
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
    }

    public /* synthetic */ C58041MqD(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) == 0 ? str4 : "");
    }
}
