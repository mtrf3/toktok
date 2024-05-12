package X;

import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;

/* loaded from: classes8.dex */
public final class H4B extends AbstractC65781Prl implements InterfaceC88472Yns<TimeSpeedModelExtension, CharSequence> {
    public static final H4B LJLIL = new H4B();

    public H4B() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(TimeSpeedModelExtension timeSpeedModelExtension) {
        String stickerId;
        TimeSpeedModelExtension timeSpeedModelExtension2 = timeSpeedModelExtension;
        if (timeSpeedModelExtension2 == null || (stickerId = timeSpeedModelExtension2.getStickerId()) == null) {
            return "EMPTY";
        }
        return stickerId;
    }
}
