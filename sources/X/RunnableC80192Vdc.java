package X;

import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.Vdc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80192Vdc implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ MaterialCalendar LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.LJLJLLL.LJLIL(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80192Vdc(MaterialCalendar materialCalendar, int i) {
        this.LJLILLLLZI = materialCalendar;
        this.LJLIL = i;
    }
}
