package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* renamed from: X.Wf2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C82828Wf2 extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C82828Wf2(C82829Wf3 c82829Wf3) {
        super(0, c82829Wf3, C82829Wf3.class, "mobShowReuseMusicPopup", "mobShowReuseMusicPopup()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        CreativeModel creativeModel;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel;
        C82829Wf3 c82829Wf3 = (C82829Wf3) this.receiver;
        ShortVideoContext shortVideoContext = c82829Wf3.LIZ;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (reuseSoundAndEffectModel = creativeModel.reuseSoundAndEffectModel) != null) {
            str = reuseSoundAndEffectModel.getSoundId();
        } else {
            str = null;
        }
        C145995oB LIZ = c82829Wf3.LIZ();
        LIZ.LJI("music_id", str);
        LIZ.LJI("popup_source", "previous_video_music");
        FMX.LJIIL("show_music_popup", LIZ.LIZ);
        return C76800UCe.LIZ;
    }
}
