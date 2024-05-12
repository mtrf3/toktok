package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.TcU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75026TcU extends AbstractC03120Ai {
    public final CJ2 LIZ;
    public final CJ2 LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C75026TcU(CJ2 cj2, CJ2 cj22) {
        this.LIZ = cj2;
        this.LIZIZ = cj22;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        Object obj = this.LIZ.get(i);
        Object obj2 = this.LIZIZ.get(i2);
        if ((obj instanceof C75069TdB) && (obj2 instanceof C75069TdB)) {
            return true;
        }
        if ((obj instanceof C74900TaS) && (obj2 instanceof C74900TaS) && o.LJ(((C74900TaS) obj).LJLIL, ((C74900TaS) obj2).LJLIL)) {
            return true;
        }
        if (!(obj instanceof LinkPlayerInfo) || !(obj2 instanceof LinkPlayerInfo)) {
            return false;
        }
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
        LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj2;
        if (linkPlayerInfo.LIZIZ == linkPlayerInfo2.LIZIZ && linkPlayerInfo.LIZJ == linkPlayerInfo2.LIZJ && linkPlayerInfo.mUser.getId() == linkPlayerInfo2.mUser.getId() && linkPlayerInfo.LIZ == linkPlayerInfo2.LIZ && linkPlayerInfo.mModifyTime == linkPlayerInfo2.mModifyTime) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(C65352Pkq.LIZ(this.LIZ.get(i).getClass()), C65352Pkq.LIZ(this.LIZIZ.get(i2).getClass()));
    }
}
