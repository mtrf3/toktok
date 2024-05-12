package X;

import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;

/* loaded from: classes9.dex */
public final class KR0 implements KR1 {
    public final /* synthetic */ DiggPanelComponent LIZ;

    public KR0(DiggPanelComponent diggPanelComponent) {
        this.LIZ = diggPanelComponent;
    }

    @Override // X.KR1
    public final void LIZ(int i) {
        C5WY c5wy = this.LIZ.LJLJLJ;
        if (c5wy == null) {
            return;
        }
        c5wy.setTranslationY(i);
    }
}
