package X;

/* renamed from: X.Blv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29747Blv implements InterfaceC29768BmG {
    public final /* synthetic */ C29746Blu LIZ;

    @Override // X.InterfaceC29768BmG
    public final void LIZ() {
        long j;
        long j2;
        long j3;
        long j4;
        C29746Blu c29746Blu = this.LIZ;
        int i = 0;
        c29746Blu.LJJIIJZLJL = false;
        C29758Bm6 c29758Bm6 = c29746Blu.LJJIIZ;
        C29750Bly c29750Bly = c29746Blu.LIZLLL;
        c29758Bm6.getClass();
        if (c29750Bly != null) {
            j = c29750Bly.LIZ;
            j2 = c29750Bly.LIZIZ;
        } else {
            j = 0;
            j2 = 0;
        }
        while (!c29758Bm6.LIZ.isEmpty()) {
            C29749Blx remove = c29758Bm6.LIZ.remove(i);
            C29750Bly c29750Bly2 = remove.LIZIZ;
            if (c29750Bly2 != null) {
                j3 = c29750Bly2.LIZ;
                j4 = c29750Bly2.LIZIZ;
            } else {
                j3 = 0;
                j4 = 0;
            }
            long j5 = j4 + remove.LIZJ;
            if (j3 > j || j5 > j2 || (j3 >= j && (remove.LIZ == EnumC29752Bm0.FANS_CLUB_ANIM_FINISH_ALL_TASK_TYPE || remove.LIZ == EnumC29752Bm0.FANS_CLUB_ANIM_SLEEP_TO_ACTIVE_TYPE))) {
                c29746Blu.LJIJI(remove.LIZ, c29746Blu.LIZLLL, remove.LIZIZ, remove.LIZJ, false);
                return;
            }
            i = 0;
        }
    }

    public C29747Blv(C29746Blu c29746Blu) {
        this.LIZ = c29746Blu;
    }
}
