package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.8kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220228kc implements InterfaceC87283bg {
    public final String LJLIL;
    public final Integer LJLILLLLZI;
    public final AddYoursAvatar[] LJLJI;
    public final Aweme LJLJJI;
    public final boolean LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C220228kc)) {
            return false;
        }
        C220228kc c220228kc = (C220228kc) obj;
        return o.LJ(this.LJLIL, c220228kc.LJLIL) && o.LJ(this.LJLILLLLZI, c220228kc.LJLILLLLZI) && o.LJ(this.LJLJI, c220228kc.LJLJI) && o.LJ(this.LJLJJI, c220228kc.LJLJJI) && this.LJLJJL == c220228kc.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        Integer num = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        AddYoursAvatar[] addYoursAvatarArr = this.LJLJI;
        int hashCode3 = (hashCode2 + (addYoursAvatarArr == null ? 0 : Arrays.hashCode(addYoursAvatarArr))) * 31;
        Aweme aweme = this.LJLJJI;
        int hashCode4 = (hashCode3 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        boolean z = this.LJLJJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursDetailPageHierarchyData(enterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", followStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", userAvatars=");
        LIZ.append(Arrays.toString(this.LJLJI));
        LIZ.append(", fromAweme=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", fromQaSticker=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public C220228kc(String enterFrom, Integer num, AddYoursAvatar[] addYoursAvatarArr, Aweme aweme, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = num;
        this.LJLJI = addYoursAvatarArr;
        this.LJLJJI = aweme;
        this.LJLJJL = z;
    }
}
