package X;

import android.widget.EditText;

/* renamed from: X.0gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC14040gq implements Runnable {
    public final /* synthetic */ C40901j4 LJLIL;
    public final /* synthetic */ EditText LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public RunnableC14040gq(C40901j4 c40901j4, EditText editText, long j, int i, int i2) {
        this.LJLIL = c40901j4;
        this.LJLILLLLZI = editText;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLIL.LJLJLJ) {
                C29306Beo.LJJLIIIJL(this.LJLILLLLZI);
                C40901j4 c40901j4 = this.LJLIL;
                EditText editText = this.LJLILLLLZI;
                long j = this.LJLJI;
                int i = this.LJLJJI + 1;
                int i2 = this.LJLJJL;
                c40901j4.getClass();
                if (i > i2 || editText == null) {
                    return;
                }
                editText.postDelayed(new RunnableC14040gq(c40901j4, editText, j, i, i2), j);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
