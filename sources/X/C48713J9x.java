package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.speed.TabletPlaybackSpeedComponent;

/* renamed from: X.J9x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C48713J9x extends TBS implements InterfaceC88471Ynr<Float, Aweme, C76800UCe> {
    public C48713J9x(Object obj) {
        super(2, obj, TabletPlaybackSpeedComponent.class, "onSpeedChange", "onSpeedChange(FLcom/ss/android/ugc/aweme/feed/model/Aweme;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Float f, Aweme aweme) {
        f.floatValue();
        Aweme aweme2 = aweme;
        TabletPlaybackSpeedComponent tabletPlaybackSpeedComponent = (TabletPlaybackSpeedComponent) this.receiver;
        if (aweme2 == null) {
            aweme2 = tabletPlaybackSpeedComponent.getAweme();
        }
        tabletPlaybackSpeedComponent.C3(aweme2);
        return C76800UCe.LIZ;
    }
}
