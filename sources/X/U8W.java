package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8W implements UBK {
    public final C76665U6z LIZ;
    public final InterfaceC65784Pro<LinkUser> LIZIZ;
    public final InterfaceC65784Pro<Boolean> LIZJ;
    public final int LIZLLL;

    public final String LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InternalMicPositionManager");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.UBK
    public final LinkUser LIZ(long j) {
        Long l;
        Long userId;
        if (this.LIZJ.invoke().booleanValue()) {
            LinkUser LJIJI = this.LIZ.LJFF.LJIJI(j);
            LinkUser invoke = this.LIZIZ.invoke();
            if (LJIJI != null || (userId = invoke.getUserId()) == null || j != userId.longValue()) {
                String str = null;
                if (LJIJI != null) {
                    l = LJIJI.getUserId();
                } else {
                    l = null;
                }
                if (o.LJ(l, invoke.getUserId())) {
                    if (LJIJI != null) {
                        str = LJIJI.getLinkMicId();
                    }
                    invoke.setLinkMicId(str);
                }
                String LIZIZ = LIZIZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("InternalUserManager.findLinkUserByUid(");
                LIZ.append(j);
                LIZ.append(") result is linkUser = ");
                LIZ.append(LJIJI);
                C0NB.LIZIZ(LIZIZ, X1D.LIZIZ(LIZ));
                return LJIJI;
            }
            return invoke;
        }
        return this.LIZ.LJFF.LJJIII(j);
    }

    @Override // X.UBK
    public final LinkUser LJI(String linkMicId) {
        Long l;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (this.LIZJ.invoke().booleanValue()) {
            LinkUser LJJ = this.LIZ.LJFF.LJJ(linkMicId);
            LinkUser invoke = this.LIZIZ.invoke();
            if (LJJ == null && o.LJ(linkMicId, invoke.getActualLinkMicId())) {
                return invoke;
            }
            String str = null;
            if (LJJ != null) {
                l = LJJ.getUserId();
            } else {
                l = null;
            }
            if (o.LJ(l, invoke.getUserId())) {
                if (LJJ != null) {
                    str = LJJ.getLinkMicId();
                }
                invoke.setLinkMicId(str);
            }
            String LIZIZ = LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InternalUserManager.findLinkUserByLinkMicId(");
            LIZ.append(linkMicId);
            LIZ.append(") ForAnchorAndGuest. result is linkUser = ");
            LIZ.append(LJJ);
            C0NB.LIZIZ(LIZIZ, X1D.LIZIZ(LIZ));
            return LJJ;
        }
        FP1.LJFF("audience findLinkUserByLinkMicId linkMicId = ", linkMicId, LIZIZ());
        return this.LIZ.LJFF.LJIL(linkMicId);
    }

    public U8W(C76665U6z config, AqS163S0100000_13 aqS163S0100000_13, AqS163S0100000_13 aqS163S0100000_132) {
        o.LJIIIZ(config, "config");
        this.LIZ = config;
        this.LIZIZ = aqS163S0100000_13;
        this.LIZJ = aqS163S0100000_132;
        this.LIZLLL = hashCode();
    }
}
