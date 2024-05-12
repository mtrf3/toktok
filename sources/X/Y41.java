package X;

import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;

/* loaded from: classes16.dex */
public final class Y41 implements C75O {
    public final /* synthetic */ C86775Y3v LJLIL;

    public Y41(C86775Y3v c86775Y3v) {
        this.LJLIL = c86775Y3v;
    }

    @Override // X.C75O
    public final void O4(float f, float f2) {
        VideoShrinkAbility videoShrinkAbility = (VideoShrinkAbility) this.LJLIL.LJLL.getValue();
        if (videoShrinkAbility != null) {
            videoShrinkAbility.Ui0(f, f2);
        }
    }
}
