package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.List;

/* loaded from: classes14.dex */
public final class TRG extends F9E {
    public final List<LinkUser> LJLIL;
    public final List<LinkUser> LJLILLLLZI;
    public final List<LinkUser> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public TRG(List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3) {
        C00F.LJ(list, "linkedUsers", list2, "applicants", list3, "invitees");
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = list3;
    }
}
