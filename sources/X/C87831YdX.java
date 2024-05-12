package X;

import android.widget.TextView;

/* renamed from: X.YdX, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87831YdX implements InterfaceC78031Ujr {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C87822YdO LIZJ;

    @Override // X.InterfaceC78031Ujr
    public final void LIZ() {
    }

    @Override // X.InterfaceC78031Ujr
    public final void LJIILIIL(long j) {
        long j2 = this.LIZ - (this.LIZIZ - j);
        TextView textView = this.LIZJ.LJIIJ;
        String LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_hourly_refresh");
        if (LIZ == null) {
            LIZ = "";
        }
        textView.setText(C87822YdO.LJIILIIL(j2, LIZ));
    }

    public C87831YdX(long j, long j2, C87822YdO c87822YdO) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c87822YdO;
    }
}
