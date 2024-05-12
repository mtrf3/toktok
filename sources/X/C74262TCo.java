package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.TCo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74262TCo extends ViewOutlineProvider {
    public final /* synthetic */ TDF LIZ;
    public final /* synthetic */ boolean LIZIZ;

    public C74262TCo(TDF tdf, boolean z) {
        this.LIZ = tdf;
        this.LIZIZ = z;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float roundRadiusForIcon;
        int LIZ = C25870zv.LIZ(view, "view", outline, "outline");
        int height = view.getHeight();
        TDF tdf = this.LIZ;
        if (this.LIZIZ) {
            if (!tdf.LJIIJJI()) {
                roundRadiusForIcon = C74275TDb.LIZ(tdf.getBorderWidth());
            } else if (tdf.getEnableCellStyle()) {
                roundRadiusForIcon = C74275TDb.LIZ(12.0f);
            }
            outline.setRoundRect(0, 0, LIZ, height, roundRadiusForIcon);
        }
        roundRadiusForIcon = tdf.getRoundRadiusForIcon();
        outline.setRoundRect(0, 0, LIZ, height, roundRadiusForIcon);
    }
}
