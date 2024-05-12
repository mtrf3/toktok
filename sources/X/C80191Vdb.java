package X;

import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.Vdb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80191Vdb extends C80145Vcr {
    public final /* synthetic */ int LLIIIJ;
    public final /* synthetic */ MaterialCalendar LLIIIL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void LLIIIL(C0AC c0ac, int[] iArr) {
        if (this.LLIIIJ == 0) {
            iArr[0] = this.LLIIIL.LJLJLLL.getWidth();
            iArr[1] = this.LLIIIL.LJLJLLL.getWidth();
        } else {
            iArr[0] = this.LLIIIL.LJLJLLL.getHeight();
            iArr[1] = this.LLIIIL.LJLJLLL.getHeight();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80191Vdb(MaterialCalendar materialCalendar, int i, int i2) {
        super(i);
        this.LLIIIL = materialCalendar;
        this.LLIIIJ = i2;
    }
}
