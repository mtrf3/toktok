package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;

/* renamed from: X.CQm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31308CQm implements InterfaceC29521BiH {
    public final /* synthetic */ CSD LIZ;

    public C31308CQm(CSD csd) {
        this.LIZ = csd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC29521BiH
    public final void LIZ(AbstractC31462CWk<? extends AbstractC31467CWp> abstractC31462CWk) {
        String str;
        BadgeStruct LIZ;
        CQL cql;
        InterfaceC29517BiD interfaceC29517BiD;
        BadgeStruct LIZ2;
        CSD csd = this.LIZ;
        boolean z = abstractC31462CWk instanceof InterfaceC29517BiD;
        CR6 cr6 = null;
        if (z && (interfaceC29517BiD = (InterfaceC29517BiD) abstractC31462CWk) != null && (LIZ2 = interfaceC29517BiD.LIZ()) != null) {
            str = Integer.valueOf(LIZ2.badgeScene).toString();
        } else {
            str = null;
        }
        csd.U("badgeview", str);
        if (z && (LIZ = ((InterfaceC29517BiD) abstractC31462CWk).LIZ()) != null && (cql = this.LIZ.LJLJI) != null) {
            cql.LJLLI(LIZ);
        }
        CQO cqo = this.LIZ.LJLJI;
        if (cqo != null) {
            cr6 = cqo.LJIJJLI;
        }
        CR3.LJ(cr6);
    }
}
