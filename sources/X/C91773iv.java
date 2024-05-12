package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3iv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C91773iv implements InterfaceC57784Mm4 {
    public final IMUser LJLIL;

    @Override // X.InterfaceC57784Mm4
    public Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public C91773iv(IMUser contact) {
        o.LJIIIZ(contact, "contact");
        this.LJLIL = contact;
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C91773iv)) {
            return false;
        }
        return o.LJ(this.LJLIL.getUniqueId(), ((C91773iv) obj).LJLIL.getUniqueId());
    }
}
