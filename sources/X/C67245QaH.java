package X;

import com.bytedance.push.PushBody;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.QaH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67245QaH implements Serializable {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final String LJLJL;
    public final int LJLJLJ;

    public static /* synthetic */ C67245QaH copy$default(C67245QaH c67245QaH, long j, long j2, String str, String str2, String str3, int i, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = c67245QaH.LJLIL;
        }
        if ((i3 & 2) != 0) {
            j2 = c67245QaH.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            str = c67245QaH.LJLJI;
        }
        if ((i3 & 8) != 0) {
            str2 = c67245QaH.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            str3 = c67245QaH.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            i = c67245QaH.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            str4 = c67245QaH.LJLJL;
        }
        if ((i3 & 128) != 0) {
            i2 = c67245QaH.LJLJLJ;
        }
        return c67245QaH.copy(j, j2, str, str2, str3, i, str4, i2);
    }

    public final C67245QaH copy(long j, long j2, String text, String title, String openUrl, int i, String notifyChannel, int i2) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(openUrl, "openUrl");
        o.LJIIIZ(notifyChannel, "notifyChannel");
        return new C67245QaH(j, j2, text, title, openUrl, i, notifyChannel, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67245QaH)) {
            return false;
        }
        C67245QaH c67245QaH = (C67245QaH) obj;
        return this.LJLIL == c67245QaH.LJLIL && this.LJLILLLLZI == c67245QaH.LJLILLLLZI && o.LJ(this.LJLJI, c67245QaH.LJLJI) && o.LJ(this.LJLJJI, c67245QaH.LJLJJI) && o.LJ(this.LJLJJL, c67245QaH.LJLJJL) && this.LJLJJLL == c67245QaH.LJLJJLL && o.LJ(this.LJLJL, c67245QaH.LJLJL) && this.LJLJLJ == c67245QaH.LJLJLJ;
    }

    public int hashCode() {
        return C79062V1e.LJ(this.LJLJL, (C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, JBR.LIZJ(this.LJLILLLLZI, C16880lQ.LLJIJIL(this.LJLIL) * 31, 31), 31), 31), 31) + this.LJLJJLL) * 31, 31) + this.LJLJLJ;
    }

    public final PushBody toPushBody() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.LJLIL);
        jSONObject.put("rid64", this.LJLILLLLZI);
        jSONObject.put("text", this.LJLJI);
        jSONObject.put("title", this.LJLJJI);
        jSONObject.put("open_url", this.LJLJJL);
        jSONObject.put("image_type", this.LJLJJLL);
        jSONObject.put("notify_channel", this.LJLJL);
        return new PushBody(jSONObject);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NonLoginPush(id=");
        LIZ.append(this.LJLIL);
        LIZ.append(", rid64=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", text=");
        LIZ.append(this.LJLJI);
        LIZ.append(", title=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", openUrl=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", imageType=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", notifyChannel=");
        LIZ.append(this.LJLJL);
        LIZ.append(", showIndex=");
        return b0.LIZJ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    public final long getId() {
        return this.LJLIL;
    }

    public final int getImageType() {
        return this.LJLJJLL;
    }

    public final String getNotifyChannel() {
        return this.LJLJL;
    }

    public final String getOpenUrl() {
        return this.LJLJJL;
    }

    public final long getRid64() {
        return this.LJLILLLLZI;
    }

    public final int getShowIndex() {
        return this.LJLJLJ;
    }

    public final String getText() {
        return this.LJLJI;
    }

    public final String getTitle() {
        return this.LJLJJI;
    }

    public C67245QaH(long j, long j2, String str, String str2, String str3, int i, String str4, int i2) {
        C43588H8u.LIZLLL(str, "text", str2, "title", str3, "openUrl", str4, "notifyChannel");
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = i;
        this.LJLJL = str4;
        this.LJLJLJ = i2;
    }

    public /* synthetic */ C67245QaH(long j, long j2, String str, String str2, String str3, int i, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0L : j2, str, str2, str3, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? "other_channel" : str4, (i3 & 128) != 0 ? 0 : i2);
    }
}
