package X;

import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.McF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57175McF implements InterfaceC57784Mm4 {
    public final GuideOutPushParam LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57175McF)) {
            return false;
        }
        C57175McF c57175McF = (C57175McF) obj;
        return o.LJ(this.LJLIL, c57175McF.LJLIL) && o.LJ(this.LJLILLLLZI, c57175McF.LJLILLLLZI) && o.LJ(this.LJLJI, c57175McF.LJLJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GuidePushSettingsItem(param=");
        LIZ.append(this.LJLIL);
        LIZ.append(", settingName=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", field=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C57175McF(GuideOutPushParam param, String str, String str2) {
        o.LJIIIZ(param, "param");
        this.LJLIL = param;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
