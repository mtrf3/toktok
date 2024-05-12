package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public final class IB7 implements InterfaceC83517Wq9 {
    public final ShortVideoContext LIZ;

    public IB7(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    @Override // X.InterfaceC83517Wq9
    public final void LIZ(Effect effect, String str, String str2) {
        ShortVideoContext shortVideoContext = this.LIZ;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("video_source", "upload");
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("tab_name", str);
        oszArr[2] = new OSZ("prop_id", effect.getEffectId());
        oszArr[3] = new OSZ("click_content", str2);
        C78880UxY.LJJLIIIJL("prop_customized_complete", C78880UxY.LJIJJLI(shortVideoContext, oszArr));
    }

    @Override // X.InterfaceC83517Wq9
    public final void LIZIZ(Effect effect, String str, String str2) {
        ShortVideoContext shortVideoContext = this.LIZ;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("video_source", "upload");
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("tab_name", str);
        oszArr[2] = new OSZ("prop_id", effect.getEffectId());
        oszArr[3] = new OSZ("click_content", str2);
        C78880UxY.LJJLIIIJL("prop_customized_click", C78880UxY.LJIJJLI(shortVideoContext, oszArr));
    }
}
