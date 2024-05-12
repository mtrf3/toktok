package X;

/* renamed from: X.Ik1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC47465Ik1 implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public final void LIZ() {
        if (C47455Ijr.LJFF != null) {
            try {
                C47470Ik6 c47470Ik6 = new C47470Ik6();
                c47470Ik6.LIZIZ = this.LJLIL;
                c47470Ik6.LIZJ = this.LJLILLLLZI;
                c47470Ik6.LIZ = this.LJLJI;
                C47464Ik0 c47464Ik0 = (C47464Ik0) C47455Ijr.LJFF;
                c47464Ik0.getClass();
                String str = c47470Ik6.LIZ;
                if (str != null && c47470Ik6.LIZJ >= 0 && c47470Ik6.LIZIZ > 0) {
                    c47464Ik0.LIZ.ioReadTimeInfoMap.put(str, c47470Ik6);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
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

    public RunnableC47465Ik1(long j, long j2, String str, String str2) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = str;
    }
}
