package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243369gq implements InterfaceC87283bg {
    public final String LJLIL;
    public Aweme LJLILLLLZI;
    public final String LJLJI;
    public String LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C243369gq)) {
            return false;
        }
        C243369gq c243369gq = (C243369gq) obj;
        return o.LJ(this.LJLIL, c243369gq.LJLIL) && o.LJ(this.LJLILLLLZI, c243369gq.LJLILLLLZI) && o.LJ(this.LJLJI, c243369gq.LJLJI) && o.LJ(this.LJLJJI, c243369gq.LJLJJI);
    }

    public C243369gq() {
        this("", "", "", null);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        return this.LJLJJI.hashCode() + C79062V1e.LJ(this.LJLJI, (hashCode2 + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeatureVideoAwemeListInitData(selectedEffectId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectedFeaturedVideo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", selectedAuthorID=");
        LIZ.append(this.LJLJI);
        LIZ.append(", selectedVideoID=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public C243369gq(String str, String str2, String str3, Aweme aweme) {
        HH1.LIZ(str, "selectedEffectId", str2, "selectedAuthorID", str3, "selectedVideoID");
        this.LJLIL = str;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }
}
