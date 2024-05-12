package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.MmC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57792MmC implements InterfaceC57784Mm4 {
    public final User LJLIL;
    public final EnumC72483ScZ LJLILLLLZI;
    public final MufPageTrackInfo LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57792MmC)) {
            return false;
        }
        C57792MmC c57792MmC = (C57792MmC) obj;
        return o.LJ(this.LJLIL, c57792MmC.LJLIL) && this.LJLILLLLZI == c57792MmC.LJLILLLLZI && o.LJ(this.LJLJI, c57792MmC.LJLJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31;
        MufPageTrackInfo mufPageTrackInfo = this.LJLJI;
        return hashCode + (mufPageTrackInfo == null ? 0 : mufPageTrackInfo.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MufUserItem(user=");
        LIZ.append(this.LJLIL);
        LIZ.append(", scene=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", trackInfo=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        String str;
        C57792MmC c57792MmC;
        User user;
        String uid = this.LJLIL.getUid();
        if (!(interfaceC57784Mm4 instanceof C57792MmC) || (c57792MmC = (C57792MmC) interfaceC57784Mm4) == null || (user = c57792MmC.LJLIL) == null || (str = user.getUid()) == null) {
            str = "";
        }
        return o.LJ(uid, str);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        String str;
        C57792MmC c57792MmC;
        User user;
        String uid = this.LJLIL.getUid();
        if (!(interfaceC57784Mm4 instanceof C57792MmC) || (c57792MmC = (C57792MmC) interfaceC57784Mm4) == null || (user = c57792MmC.LJLIL) == null || (str = user.getUid()) == null) {
            str = "";
        }
        return o.LJ(uid, str);
    }

    public C57792MmC(User user, EnumC72483ScZ scene, MufPageTrackInfo mufPageTrackInfo) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(scene, "scene");
        this.LJLIL = user;
        this.LJLILLLLZI = scene;
        this.LJLJI = mufPageTrackInfo;
    }
}
