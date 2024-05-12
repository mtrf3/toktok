package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ts1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75989Ts1 {
    public final String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public String LJ;
    public long LJFF;
    public C75768ToS LJI;
    public int LJII;
    public final int LJIIIIZZ;
    public final EnumC75909Tqj LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    public C75989Ts1() {
        this("");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiHostFeedUser(uid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", roomId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", channelId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", linkMicId='");
        LIZ.append(this.LIZ);
        LIZ.append("', currentRoomAnchorLinkmicId='");
        LIZ.append(this.LJ);
        LIZ.append("', groupChannelId=");
        LIZ.append(this.LJFF);
        LIZ.append(", userInfo=");
        LIZ.append(this.LJI);
        LIZ.append(", randomAvatarResId=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", state=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C75989Ts1(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LIZ = linkMicId;
        this.LJ = "";
        this.LJII = EnumC31946CgI.MULTI_ARCH.getType();
        this.LJIIIIZZ = ((Number) ORZ.LLIIJLIL(C123084sK.LIZ, V0Q.Default)).intValue();
        this.LJIIIZ = EnumC75909Tqj.IDLE;
    }
}
