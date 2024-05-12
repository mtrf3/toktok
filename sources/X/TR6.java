package X;

/* loaded from: classes14.dex */
public final class TR6 implements Runnable {
    public final /* synthetic */ boolean LJLIL;

    public TR6(boolean z) {
        this.LJLIL = z;
    }

    public final void LIZ() {
        TRS trs;
        String str;
        if (!this.LJLIL) {
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryLogCameraOnDurationWhenGuestLeaveOrVideoMute, startCameraTimeMills=");
            LIZ.append(TR8.LIZJ);
            String LIZIZ = X1D.LIZIZ(LIZ);
            LJIILIIL.getClass();
            C0NE.LJII("MultiGuestCameraOnDurationLogHelper", LIZIZ);
            if (TR8.LIZJ > 0) {
                TR8.LIZJ();
                return;
            }
            return;
        }
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (obj instanceof TQ8) {
            trs = (TRS) obj;
        } else {
            trs = null;
        }
        if (trs == null || (str = trs.LIZIZ(((C29374Bfu) B83.LIZ().LIZIZ()).LJ().getId())) == null) {
            str = "null";
        }
        TR8.LIZIZ = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
