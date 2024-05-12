package X;

/* loaded from: classes15.dex */
public final class WW7 implements W4E {
    public final /* synthetic */ C82410WVy LIZ;

    public WW7(C82410WVy c82410WVy) {
        this.LIZ = c82410WVy;
    }

    @Override // X.W4E
    public final boolean LIZ(boolean z) {
        String str;
        boolean z2;
        TEZ LLLLL;
        C74385THh LJJIL;
        I0N LLF = this.LIZ.LLF();
        if (LLF != null && (LLLLL = LLF.LLLLL()) != null && (LJJIL = LLLLL.LJJIL()) != null) {
            str = LJJIL.LJLJJLL;
        } else {
            str = null;
        }
        if (z && C78685UuP.LJJJZ(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LIZ.AO() || z2) {
            return false;
        }
        C82130WLe.LIZ(this.LIZ, true, false, true, "click_effect", false, 38);
        return true;
    }
}
