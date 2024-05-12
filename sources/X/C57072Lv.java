package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2Lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57072Lv implements IEvent {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final Integer LJLJJI;
    public final boolean LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57072Lv)) {
            return false;
        }
        C57072Lv c57072Lv = (C57072Lv) obj;
        return o.LJ(this.LJLIL, c57072Lv.LJLIL) && this.LJLILLLLZI == c57072Lv.LJLILLLLZI && o.LJ(this.LJLJI, c57072Lv.LJLJI) && o.LJ(this.LJLJJI, c57072Lv.LJLJJI) && this.LJLJJL == c57072Lv.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.LJLJI;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LJLJJI;
        return ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + (this.LJLJJL ? 1 : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentBubbleClickEvent(commentId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", forceRefresh=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", awemeId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", descLines=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", navigateToPostModeOnClick=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public /* synthetic */ C57072Lv(String str) {
        this(str, true, null, null, false);
    }

    public C57072Lv(String str, boolean z, String str2, Integer num, boolean z2) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = str2;
        this.LJLJJI = num;
        this.LJLJJL = z2;
    }
}
