package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* renamed from: X.Wf0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C82826Wf0 extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C82826Wf0(C82829Wf3 c82829Wf3) {
        super(0, c82829Wf3, C82829Wf3.class, "mobShowReuseSoundAndPropPopup", "mobShowReuseSoundAndPropPopup()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        CreativeModel creativeModel;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel;
        CreativeModel creativeModel2;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel2;
        C82829Wf3 c82829Wf3 = (C82829Wf3) this.receiver;
        ShortVideoContext shortVideoContext = c82829Wf3.LIZ;
        String str2 = null;
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (reuseSoundAndEffectModel2 = creativeModel2.reuseSoundAndEffectModel) != null) {
            str = reuseSoundAndEffectModel2.getSoundId();
        } else {
            str = null;
        }
        ShortVideoContext shortVideoContext2 = c82829Wf3.LIZ;
        if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null && (reuseSoundAndEffectModel = creativeModel.reuseSoundAndEffectModel) != null) {
            str2 = reuseSoundAndEffectModel.getEffectId();
        }
        C145995oB LIZ = c82829Wf3.LIZ();
        LIZ.LJI("prop_id", str2);
        LIZ.LJI("music_id", str);
        LIZ.LJI("popup_source", "previous_video");
        FMX.LJIIL("show_music_and_prop_popup", LIZ.LIZ);
        return C76800UCe.LIZ;
    }
}
