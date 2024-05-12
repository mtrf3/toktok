package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AM2 implements Serializable {
    public final String LJLIL;
    public long LJLILLLLZI;
    public final AwemeRawAd LJLJI;

    public /* synthetic */ AM2(String str, long j, AwemeRawAd awemeRawAd, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, awemeRawAd);
    }

    public static /* synthetic */ AM2 copy$default(AM2 am2, String str, long j, AwemeRawAd awemeRawAd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = am2.LJLIL;
        }
        if ((i & 2) != 0) {
            j = am2.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            awemeRawAd = am2.LJLJI;
        }
        return am2.copy(str, j, awemeRawAd);
    }

    public final AM2 copy(String tag, long j, AwemeRawAd awemeRawAd) {
        o.LJIIIZ(tag, "tag");
        return new AM2(tag, j, awemeRawAd);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AM2)) {
            return false;
        }
        AM2 am2 = (AM2) obj;
        return o.LJ(this.LJLIL, am2.LJLIL) && this.LJLILLLLZI == am2.LJLILLLLZI && o.LJ(this.LJLJI, am2.LJLJI);
    }

    public int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        AwemeRawAd awemeRawAd = this.LJLJI;
        if (awemeRawAd == null) {
            hashCode = 0;
        } else {
            hashCode = awemeRawAd.hashCode();
        }
        return LIZJ + hashCode;
    }

    public final String toJson() {
        String json = GsonProtectorUtils.toJson(new Gson(), this);
        o.LJIIIIZZ(json, "Gson().toJson(this)");
        return json;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tag=");
        LIZ.append(this.LJLIL);
        LIZ.append(", startTime=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", awemeRawAd=");
        LIZ.append(this.LJLJI);
        return X1D.LIZIZ(LIZ);
    }

    public final AwemeRawAd getAwemeRawAd() {
        return this.LJLJI;
    }

    public final long getStartTime() {
        return this.LJLILLLLZI;
    }

    public final String getTag() {
        return this.LJLIL;
    }

    public final void setStartTime(long j) {
        this.LJLILLLLZI = j;
    }

    public AM2(String str, long j, AwemeRawAd awemeRawAd) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = awemeRawAd;
    }
}
