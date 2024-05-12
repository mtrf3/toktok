package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IB6 {
    public final ShortVideoContext LIZ;

    public IB6(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = shortVideoContext;
    }

    public final void LIZ(IBL ibl) {
        ShortVideoContext shortVideoContext = this.LIZ;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("picture_source", ibl.LJLJI);
        oszArr[1] = new OSZ("prop_id", ibl.LJLIL.getEffectId());
        oszArr[2] = new OSZ("click_content", ibl.LJLILLLLZI);
        String str = ibl.LJLJJI;
        if (str == null) {
            str = "";
        }
        oszArr[3] = new OSZ("video_source", str);
        C78880UxY.LJJLIIIJL("prop_customized_click", C78880UxY.LJIJJLI(shortVideoContext, oszArr));
    }

    public final void LIZIZ(IBL ibl) {
        String LJIIJJI = DiyPropParser.LJIIJJI(ibl.LJLIL);
        String LJIILL = DiyPropParser.LJIILL(ibl.LJLIL);
        ShortVideoContext shortVideoContext = this.LIZ;
        OSZ[] oszArr = new OSZ[8];
        oszArr[0] = new OSZ("picture_source", ibl.LJLJI);
        oszArr[1] = new OSZ("prop_id", ibl.LJLIL.getEffectId());
        oszArr[2] = new OSZ("click_content", ibl.LJLILLLLZI);
        String str = ibl.LJLJJI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        oszArr[3] = new OSZ("video_source", str);
        String str3 = ibl.LJLJJL;
        if (str3 == null) {
            str3 = "";
        }
        oszArr[4] = new OSZ("pic_cnt", str3);
        String str4 = ibl.LJLJJLL;
        if (str4 != null) {
            str2 = str4;
        }
        oszArr[5] = new OSZ("video_cnt", str2);
        oszArr[6] = new OSZ("is_reuse_create_effect", LJIIJJI);
        oszArr[7] = new OSZ("reuse_effect_id", LJIILL);
        C78880UxY.LJJLIIIJL("prop_customized_complete", C78880UxY.LJIJJLI(shortVideoContext, oszArr));
        C78880UxY.LJJLIIIJL("mobile_effect_customized_click", C78880UxY.LJIJJLI(this.LIZ, new OSZ("template_id", ibl.LJLIL.getEffectId()), new OSZ("template_name", ibl.LJLIL.getName()), new OSZ("is_reuse_create_effect", LJIIJJI), new OSZ("reuse_effect_id", LJIILL)));
    }
}
