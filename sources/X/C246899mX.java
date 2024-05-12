package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.9mX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public class C246899mX implements InterfaceC57784Mm4 {
    public final IMUser LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public C246899mX(IMUser friend) {
        o.LJIIIZ(friend, "friend");
        this.LJLIL = friend;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C246899mX)) {
            return false;
        }
        return o.LJ(this.LJLIL.getUniqueId(), ((C246899mX) obj).LJLIL.getUniqueId());
    }
}
