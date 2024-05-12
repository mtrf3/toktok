package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.HashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8N implements U92 {
    public final C76665U6z LIZ;
    public final OnLineMicInfo LIZIZ;
    public final InterfaceC65784Pro<LinkUser> LIZJ;
    public final InterfaceC65784Pro<Boolean> LIZLLL;
    public final int LJ;

    @Override // X.U92
    public final java.util.Map<String, OnLineMicInfo> LIZ() {
        if (this.LIZLLL.invoke().booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.LIZ.LJFF.LIZ());
            String LIZLLL = LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("guestOrAnchor getFixedPositionMap size = ");
            LIZ.append(hashMap.size());
            C0NB.LJIIIZ(LIZLLL, X1D.LIZIZ(LIZ));
            return hashMap;
        }
        C0NB.LJIIIZ(LIZLLL(), "audience getFixedPositionMap");
        return this.LIZ.LJFF.LIZLLL();
    }

    @Override // X.U92
    public final int LJIIIIZZ() {
        if (this.LIZLLL.invoke().booleanValue()) {
            return this.LIZ.LJFF.LJIIIIZZ();
        }
        return this.LIZ.LJFF.LJIJ();
    }

    @Override // X.U92
    public final boolean LJIIIZ() {
        return this.LIZ.LJFF.LJIIIZ();
    }

    @Override // X.U92
    public final java.util.Map<String, OnLineMicInfo> LJIILJJIL() {
        if (this.LIZLLL.invoke().booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.LIZ.LJFF.LJIILJJIL());
            return hashMap;
        }
        return this.LIZ.LJFF.LJJIIJZLJL();
    }

    public final String LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InternalMicPositionManager");
        LIZ.append(this.LJ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.U92
    public final OnLineMicInfo LIZIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        if (this.LIZLLL.invoke().booleanValue()) {
            FP1.LJFF("guestOrAnchor getFloatPosition linkMicId = ", linkMicId, LIZLLL());
            OnLineMicInfo LIZIZ = this.LIZ.LJFF.LIZIZ(linkMicId);
            if (LIZIZ == null && o.LJ(linkMicId, this.LIZJ.invoke().getActualLinkMicId())) {
                return this.LIZIZ;
            }
            return LIZIZ;
        }
        FP1.LJFF("audience getFloatPosition linkMicId = ", linkMicId, LIZLLL());
        return this.LIZ.LJFF.LJIJJLI(linkMicId);
    }

    @Override // X.U92
    public final void LIZJ(java.util.Map map) {
        this.LIZ.LJFF.LIZJ(map);
    }

    @Override // X.U92
    public final OnLineMicInfo LJII(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        if (this.LIZLLL.invoke().booleanValue()) {
            OnLineMicInfo LJII = this.LIZ.LJFF.LJII(linkMicId);
            if (LJII == null) {
                if (o.LJ(linkMicId, this.LIZJ.invoke().getActualLinkMicId())) {
                    return this.LIZIZ;
                }
                return null;
            }
            return LJII;
        }
        return this.LIZ.LJFF.LJJII(linkMicId);
    }

    @Override // X.U92
    public final int LJIILIIL(int i) {
        return this.LIZ.LJFF.LJIILIIL(i);
    }

    public U8N(C76665U6z config, OnLineMicInfo selfOnLineMicInfo, AqS163S0100000_13 aqS163S0100000_13, AqS163S0100000_13 aqS163S0100000_132) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(selfOnLineMicInfo, "selfOnLineMicInfo");
        this.LIZ = config;
        this.LIZIZ = selfOnLineMicInfo;
        this.LIZJ = aqS163S0100000_13;
        this.LIZLLL = aqS163S0100000_132;
        this.LJ = hashCode();
    }
}
