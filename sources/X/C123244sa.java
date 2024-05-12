package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123244sa extends F9E {
    public final String LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;

    public C123244sa() {
        this(null, 15);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C123244sa(String musicId, int i) {
        boolean z;
        musicId = (i & 1) != 0 ? "" : musicId;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        String illegalMsg = (i & 8) == 0 ? null : "";
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(illegalMsg, "illegalMsg");
        this.LJLIL = musicId;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = illegalMsg;
    }
}
