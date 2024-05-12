package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.InterestGroupSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LAM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final LAM LJLIL = new LAM();

    public LAM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        String str;
        Integer num;
        Keva keva = LAL.LIZIZ;
        try {
            InterestGroupSetting interestGroupSetting = LAL.LIZJ;
            if (interestGroupSetting != null) {
                num = Integer.valueOf(interestGroupSetting.useNewKey);
            } else {
                num = null;
            }
            z = o.LJ(num, 1);
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            str = "keva_key_video_seen_once_new";
        } else {
            str = "keva_key_video_seen_once";
        }
        return Boolean.valueOf(keva.getBoolean(str, true));
    }
}
