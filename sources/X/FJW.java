package X;

/* loaded from: classes7.dex */
public final class FJW {
    public static volatile FJW LIZJ;
    public volatile ProgressDialogC43242Gy6 LIZ;
    public volatile boolean LIZIZ;

    public static void LIZ(ProgressDialogC43242Gy6 progressDialogC43242Gy6) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/aabplugin/core/base/view/DFProgressDialog", "show", progressDialogC43242Gy6, new Object[0], "void", new C65300Pk0(false, "()V", "4591542633565449324")).LIZ) {
            return;
        }
        progressDialogC43242Gy6.show();
    }

    public static FJW LIZJ() {
        if (LIZJ == null) {
            synchronized (FJW.class) {
                if (LIZJ == null) {
                    LIZJ = new FJW();
                }
            }
        }
        return LIZJ;
    }

    public final void LIZIZ() {
        if (this.LIZ != null && this.LIZ.LJLJJL != null && !this.LIZ.LJLJJL.isFinishing()) {
            this.LIZ.dismiss();
        }
        this.LIZ = null;
        this.LIZIZ = false;
    }

    public final void LIZLLL(long j, long j2) {
        int i;
        if (this.LIZ != null && this.LIZ.LJLJJL != null) {
            if (j <= 0 || j2 <= 0) {
                i = 0;
            } else {
                i = (int) Math.ceil((((float) j) * 100.0f) / ((float) j2));
            }
            int max = Math.max(0, Math.min(i, 100));
            if (max > this.LIZ.getProgress()) {
                this.LIZ.setProgress(max);
            }
        }
    }
}
