package X;

import android.os.Bundle;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.JRe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49162JRe implements IEvent {
    public final Bundle LJLIL;
    public final Integer LJLILLLLZI;
    public final Integer LJLJI;
    public final Integer LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49162JRe)) {
            return false;
        }
        C49162JRe c49162JRe = (C49162JRe) obj;
        return o.LJ(this.LJLIL, c49162JRe.LJLIL) && o.LJ(this.LJLILLLLZI, c49162JRe.LJLILLLLZI) && o.LJ(this.LJLJI, c49162JRe.LJLJI) && o.LJ(this.LJLJJI, c49162JRe.LJLJJI) && o.LJ(this.LJLJJL, c49162JRe.LJLJJL) && o.LJ(this.LJLJJLL, c49162JRe.LJLJJLL) && o.LJ(this.LJLJL, c49162JRe.LJLJL) && o.LJ(this.LJLJLJ, c49162JRe.LJLJLJ) && o.LJ(this.LJLJLLL, c49162JRe.LJLJLLL);
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

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.LJLIL.hashCode() * 31;
        Integer num = this.LJLILLLLZI;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Integer num2 = this.LJLJI;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num3 = this.LJLJJI;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return this.LJLJLLL.hashCode() + C79062V1e.LJ(this.LJLJLJ, C79062V1e.LJ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, C79062V1e.LJ(this.LJLJJL, (i3 + i) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenHotSpotEvent(toDetailBundle=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isActivityCard=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isOfficialCard=");
        LIZ.append(this.LJLJI);
        LIZ.append(", tabIndex=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", backtrace=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", activityKeyword=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", videoCardType=");
        LIZ.append(this.LJLJL);
        LIZ.append(", cid=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", fromCardType=");
        return q.LIZIZ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    public C49162JRe(Bundle bundle, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5) {
        this.LJLIL = bundle;
        this.LJLILLLLZI = num;
        this.LJLJI = num2;
        this.LJLJJI = num3;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = str4;
        this.LJLJLLL = str5;
    }
}
