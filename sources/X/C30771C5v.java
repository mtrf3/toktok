package X;

/* renamed from: X.C5v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30771C5v implements InterfaceC19880qG {
    public final /* synthetic */ C30775C5z LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ InterfaceC19880qG LJ;

    public C30771C5v(C30775C5z c30775C5z, String str, String str2, String str3, InterfaceC19880qG interfaceC19880qG) {
        this.LIZ = c30775C5z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = interfaceC19880qG;
    }

    @Override // X.InterfaceC19880qG
    public final void LIZ(int i) {
        BZI LIZ;
        String str;
        if (C30770C5u.LJ) {
            LIZ = C28787BRn.LIZ("livesdk_anchor_bubble_duration");
        } else {
            LIZ = C28787BRn.LIZ("livesdk_bubble_duration");
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 6) {
                    LIZ.LJIJJ("other", "reason");
                } else {
                    LIZ.LJIJJ("click", "reason");
                }
            } else {
                LIZ.LJIJJ("leave_page", "reason");
            }
        } else {
            LIZ.LJIJJ("no_action", "reason");
        }
        CharSequence LIZ2 = this.LIZ.LIZ.LIZ();
        if (LIZ2 == null || (str = LIZ2.toString()) == null) {
            str = "";
        }
        LIZ.LJIJJ(str, "content");
        LIZ.LJIJJ(this.LIZIZ, "event_page");
        LIZ.LJIJJ(this.LIZJ, "position");
        LIZ.LJIJJ(this.LIZLLL, "content_id");
        C28289B8j.LIZJ(System.currentTimeMillis(), this.LIZ.LJ, LIZ, "duration");
        InterfaceC19880qG interfaceC19880qG = this.LJ;
        if (interfaceC19880qG != null) {
            interfaceC19880qG.LIZ(i);
        }
    }
}
