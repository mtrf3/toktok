package X;

import java.util.Objects;

/* renamed from: X.4Vb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110434Vb extends C3UY {
    public final String LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final int LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZLLL, Long.valueOf(this.LJ), this.LJFF, Integer.valueOf(this.LJI), this.LJII, Integer.valueOf(this.LJIIIIZZ), Integer.valueOf(this.LJIIIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C110434Vb) {
            return C78966Uyw.LJIIIZ(((C110434Vb) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("EnterGroupChatInviteCardEventBody:%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C110434Vb(int i, String str, String str2, int i2, long j, String str3, int i3) {
        super(C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, str), new OSZ("is_network_success", str2), new OSZ("is_assem", str3), new OSZ("invite_error_code", Integer.valueOf(i2)), new OSZ("invitee_group_status", Integer.valueOf(i3))), C113554cx.LJJL(new OSZ("network_time_cost", Long.valueOf(j)), new OSZ("retry_times", Integer.valueOf(i))), null, 4);
        HH1.LIZ(str, WM7.SCENE_SERVICE, str2, "isNetworkSuccess", str3, "isAssem");
        this.LIZLLL = str;
        this.LJ = j;
        this.LJFF = str2;
        this.LJI = i;
        this.LJII = str3;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = i3;
    }
}
