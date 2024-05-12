package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C184197Kt;
import X.C184207Ku;
import X.C184217Kv;
import X.C184227Kw;
import X.C234889Js;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.fragment.StickerSetContentFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.fragment.VideoStickerContentFragment;

/* loaded from: classes2.dex */
public class AqS0S2102000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public int i4;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S2102000_1 aqS0S2102000_1, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((StickerSetContentFragment) aqS0S2102000_1.l2, new AqS0S2002000_1(aqS0S2102000_1.i3, aqS0S2102000_1.i4, aqS0S2102000_1.s0, aqS0S2102000_1.s1, 0));
        assemble.wv0((StickerSetContentFragment) aqS0S2102000_1.l2, C184197Kt.LJLIL);
        assemble.wv0((StickerSetContentFragment) aqS0S2102000_1.l2, C184207Ku.LJLIL);
        assemble.wv0((StickerSetContentFragment) aqS0S2102000_1.l2, C184217Kv.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2102000_1 aqS0S2102000_1, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((VideoStickerContentFragment) aqS0S2102000_1.l2, new AqS0S2002000_1(aqS0S2102000_1.i3, aqS0S2102000_1.i4, aqS0S2102000_1.s0, aqS0S2102000_1.s1, 1));
        assemble.wv0((VideoStickerContentFragment) aqS0S2102000_1.l2, C184227Kw.LJLIL);
        assemble.wv0((VideoStickerContentFragment) aqS0S2102000_1.l2, C234889Js.LJLIL);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2102000_1(StickerSetContentFragment stickerSetContentFragment, int i, int i2, String str, String str2, int i3) {
        super(1);
        this.$t = i3;
        this.l2 = stickerSetContentFragment;
        this.i3 = i;
        this.i4 = i2;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2102000_1(VideoStickerContentFragment videoStickerContentFragment, int i, int i2, String str, String str2, int i3) {
        super(1);
        this.$t = i3;
        this.l2 = videoStickerContentFragment;
        this.i3 = i;
        this.i4 = i2;
        this.s0 = str;
        this.s1 = str2;
    }
}
