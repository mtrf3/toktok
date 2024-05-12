package X;

import android.content.Intent;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* renamed from: X.A2s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25594A2s implements InterfaceC80653En, InterfaceC87283bg {
    public final long LJLIL;
    public final String LJLILLLLZI;
    public final EnumC25627A3z LJLJI;
    public final Intent LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final long LJLJL;
    public final boolean LJLJLJ;
    public final int LJLJLLL;
    public final MutableLiveData<A3N> LJLL;
    public final MutableLiveData<A3P> LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;
    public final String LJLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25594A2s)) {
            return false;
        }
        C25594A2s c25594A2s = (C25594A2s) obj;
        return this.LJLIL == c25594A2s.LJLIL && o.LJ(this.LJLILLLLZI, c25594A2s.LJLILLLLZI) && this.LJLJI == c25594A2s.LJLJI && o.LJ(this.LJLJJI, c25594A2s.LJLJJI) && o.LJ(this.LJLJJL, c25594A2s.LJLJJL) && o.LJ(this.LJLJJLL, c25594A2s.LJLJJLL) && this.LJLJL == c25594A2s.LJLJL && this.LJLJLJ == c25594A2s.LJLJLJ && this.LJLJLLL == c25594A2s.LJLJLLL && o.LJ(this.LJLL, c25594A2s.LJLL) && o.LJ(this.LJLLI, c25594A2s.LJLLI) && o.LJ(this.LJLLILLLL, c25594A2s.LJLLILLLL) && o.LJ(this.LJLLJ, c25594A2s.LJLLJ) && o.LJ(this.LJLLL, c25594A2s.LJLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.LJLJI.hashCode() + C79062V1e.LJ(this.LJLILLLLZI, C16880lQ.LLJIJIL(this.LJLIL) * 31, 31)) * 31;
        Intent intent = this.LJLJJI;
        int i = 0;
        if (intent == null) {
            hashCode = 0;
        } else {
            hashCode = intent.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, C79062V1e.LJ(this.LJLJJL, (hashCode4 + hashCode) * 31, 31), 31), 31);
        boolean z = this.LJLJLJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int hashCode5 = (this.LJLLI.hashCode() + ((this.LJLL.hashCode() + ((((LIZJ + i2) * 31) + this.LJLJLLL) * 31)) * 31)) * 31;
        String str = this.LJLLILLLL;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (hashCode5 + hashCode2) * 31;
        String str2 = this.LJLLJ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.LJLLL;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaidContentCollectionDetailHierarchyData(collectionId=");
        sb.append(this.LJLIL);
        sb.append(", enterFrom=");
        sb.append(this.LJLILLLLZI);
        sb.append(", entrySource=");
        sb.append(this.LJLJI);
        sb.append(", intent=");
        sb.append(this.LJLJJI);
        sb.append(", sessionId=");
        sb.append(this.LJLJJL);
        sb.append(", detailVideoListSessionId=");
        sb.append(this.LJLJJLL);
        sb.append(", roomId=");
        sb.append(this.LJLJL);
        sb.append(", hideBackButton=");
        sb.append(this.LJLJLJ);
        sb.append(", purchaseButtonText=");
        sb.append(this.LJLJLLL);
        sb.append(", purchaseListener=");
        sb.append(this.LJLL);
        sb.append(", scrollListener=");
        sb.append(this.LJLLI);
        sb.append(", anchorId=");
        sb.append(this.LJLLILLLL);
        sb.append(", anchorVideoId=");
        sb.append(this.LJLLJ);
        sb.append(", anchorGroupId=");
        return C07670Rv.LIZIZ(sb, this.LJLLL, ')');
    }

    public C25594A2s(long j, String str, EnumC25627A3z enumC25627A3z, Intent intent, String sessionId, String detailVideoListSessionId, long j2, boolean z, int i, MutableLiveData<A3N> purchaseListener, MutableLiveData<A3P> scrollListener, String str2, String str3, String str4) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(detailVideoListSessionId, "detailVideoListSessionId");
        o.LJIIIZ(purchaseListener, "purchaseListener");
        o.LJIIIZ(scrollListener, "scrollListener");
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = enumC25627A3z;
        this.LJLJJI = intent;
        this.LJLJJL = sessionId;
        this.LJLJJLL = detailVideoListSessionId;
        this.LJLJL = j2;
        this.LJLJLJ = z;
        this.LJLJLLL = i;
        this.LJLL = purchaseListener;
        this.LJLLI = scrollListener;
        this.LJLLILLLL = str2;
        this.LJLLJ = str3;
        this.LJLLL = str4;
        C221108m2.LIZIZ(A3C.LJLIL);
    }
}
