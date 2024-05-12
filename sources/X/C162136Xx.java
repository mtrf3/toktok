package X;

import Y.AObjectS120S0200000_2;
import com.ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;

/* renamed from: X.6Xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C162136Xx implements InterfaceC65784Pro {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        EffectTextModel effectTextModel;
        EffectTextModel effectTextModel2;
        switch (this.LJLIL) {
            case 0:
                ((EventActivityComponent) this.LJLILLLLZI).LIZ((C43694HCw) this.LJLJI, (ActivityC45651qj) this.LJLJJI);
                return null;
            default:
                VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) this.LJLILLLLZI;
                EffectTextModel effectTextModel3 = (EffectTextModel) this.LJLJI;
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.LJLJJI;
                vEChooseVideoCoverFragment.getClass();
                boolean z = false;
                if (effectTextModel3.getTextSticker() != null && effectTextModel3.getHasCoverText()) {
                    vEChooseVideoCoverFragment.LJLLLLLL.put(0, effectTextModel3);
                } else {
                    vEChooseVideoCoverFragment.LJLLLLLL.put(0, new EffectTextModel());
                }
                if (!vEChooseVideoCoverFragment.wl()) {
                    C6Y2 c6y2 = vEChooseVideoCoverFragment.LJLLL;
                    if (c6y2 != null && (effectTextModel = c6y2.LIZLLL().getCoverPublishModel().getEffectTextModel()) != (effectTextModel2 = vEChooseVideoCoverFragment.LJLLLLLL.get(0)) && effectTextModel.getTextSticker() != effectTextModel2.getTextSticker()) {
                        if (effectTextModel.getTextSticker() != null && effectTextModel2.getTextSticker() != null) {
                            if (effectTextModel.getTextSticker().stickerId != null && effectTextModel2.getTextSticker().stickerId != null) {
                                if (effectTextModel.getTextSticker().stickerId.equals(effectTextModel2.getTextSticker().stickerId)) {
                                    try {
                                        TextStickerData textStickerData = (TextStickerData) C60903NvH.LJIIJJI().LIZ().LJI(effectTextModel.getTextSticker().extra, TextStickerData.class);
                                        TextStickerData textStickerData2 = (TextStickerData) C60903NvH.LJIIJJI().LIZ().LJI(effectTextModel2.getTextSticker().extra, TextStickerData.class);
                                        if (textStickerData != textStickerData2) {
                                            if (textStickerData != null && textStickerData2 != null) {
                                                if (C5LE.LIZ(textStickerData, textStickerData2)) {
                                                }
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    vEChooseVideoCoverFragment.wl();
                    C60903NvH.LJIIJJI().LJFF().LIZJ(valueOf.booleanValue(), new AObjectS120S0200000_2(vEChooseVideoCoverFragment, interfaceC88472Yns, 0));
                    return C76800UCe.LIZ;
                }
                z = true;
                Boolean valueOf2 = Boolean.valueOf(z);
                vEChooseVideoCoverFragment.wl();
                C60903NvH.LJIIJJI().LJFF().LIZJ(valueOf2.booleanValue(), new AObjectS120S0200000_2(vEChooseVideoCoverFragment, interfaceC88472Yns, 0));
                return C76800UCe.LIZ;
        }
    }

    public /* synthetic */ C162136Xx(int i, Object obj, Object obj2, Object obj3) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
    }
}
