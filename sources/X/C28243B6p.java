package X;

import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveUseSurfaceViewExperiment;

/* renamed from: X.B6p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28243B6p extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28243B6p LJLIL = new C28243B6p();

    public C28243B6p() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveUseSurfaceViewExperiment.INSTANCE.isEnable());
    }
}
