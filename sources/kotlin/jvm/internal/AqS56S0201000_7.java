package kotlin.jvm.internal;

import X.ARI;
import X.ARN;
import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C41988Gds;
import X.C42176Ggu;
import X.C45628HvU;
import X.C45813HyT;
import X.C45822Hyc;
import X.C76732zl;
import X.C76800UCe;
import X.GS5;
import X.GZU;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewNextBtnState;
import com.zhiliaoapp.musically.R;
import java.io.File;

/* loaded from: classes8.dex */
public class AqS56S0201000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS56S0201000_7 aqS56S0201000_7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean z = !((PreviewNextBtnState) aqS56S0201000_7.l0).isClickable();
        C45628HvU c45628HvU = (C45628HvU) aqS56S0201000_7.l1;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = c45628HvU.LLIIIL;
        if (!choosePhotoPreviewPageConfig.nextRuleAdjustment || aqS56S0201000_7.i2 != 0 || choosePhotoPreviewPageConfig.isAutoCutAnchorMode || choosePhotoPreviewPageConfig.isAIGCAvatar) {
            booleanValue = z;
        }
        c45628HvU.LLJJL(booleanValue);
        C45628HvU c45628HvU2 = (C45628HvU) aqS56S0201000_7.l1;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = c45628HvU2.LLIIIL;
        if (choosePhotoPreviewPageConfig2.isFromCutSame || choosePhotoPreviewPageConfig2.isSoundSync || choosePhotoPreviewPageConfig2.isUgcTemplate || ((Boolean) c45628HvU2.LLJ.getValue()).booleanValue() || ((C45628HvU) aqS56S0201000_7.l1).LLIIIL.isAutoCutAnchorMode) {
            ((C45628HvU) aqS56S0201000_7.l1).LLJJIII().setEnabled(!booleanValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS56S0201000_7 aqS56S0201000_7, Object obj) {
        int floatValue = (int) (((Number) obj).floatValue() * aqS56S0201000_7.i2);
        int i = floatValue - ((C76732zl) aqS56S0201000_7.l0).element;
        if (i > 0) {
            ((C41988Gds) aqS56S0201000_7.l1).LJI(i);
            ((C76732zl) aqS56S0201000_7.l0).element = floatValue;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS56S0201000_7 aqS56S0201000_7, Object obj) {
        ImageSynthesisResult it = (ImageSynthesisResult) obj;
        o.LJIIIZ(it, "it");
        ((GS5) aqS56S0201000_7.l0).LJIJ.put(((SingleImageData) aqS56S0201000_7.l1).getSrcImageInfo().getPath(), it.getPath());
        if (aqS56S0201000_7.i2 == ((GS5) aqS56S0201000_7.l0).LIZ.getCoverPublishModel().getImageCurrentIndex()) {
            ((GS5) aqS56S0201000_7.l0).LJIIIZ(aqS56S0201000_7.i2, 0, 0, it.getPath());
        } else {
            C42176Ggu c42176Ggu = ((GS5) aqS56S0201000_7.l0).LJIIIIZZ;
            if (c42176Ggu != null) {
                c42176Ggu.LIZ(aqS56S0201000_7.i2, new GZU(it.getPath(), 0, 0, 14));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS56S0201000_7 aqS56S0201000_7, Object obj) {
        boolean z;
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        if (C45813HyT.LIZ()) {
            z = ((LocalMusicTabFragment) aqS56S0201000_7.l0).Ql(aqS56S0201000_7.i2);
        } else {
            MusicModel.MusicType musicType = ((MusicModel) aqS56S0201000_7.l1).getMusicType();
            MusicModel.MusicType musicType2 = MusicModel.MusicType.VIDEO_EXTRACT;
            if (musicType == musicType2) {
                MusicModel musicModel = (MusicModel) aqS56S0201000_7.l1;
                o.LJIIIZ(musicModel, "musicModel");
                if (musicModel.getMusicType() == musicType2) {
                    File file = new File(musicModel.getLocalPath());
                    File file2 = new File(musicModel.getLocalThumbPath());
                    try {
                        if (C16880lQ.LLLZZIL(file)) {
                            C16880lQ.LLLZZIL(file2);
                        }
                    } catch (Exception unused) {
                    }
                    if (!file.exists() && !file2.exists()) {
                        z = true;
                    }
                }
            }
            z = false;
        }
        it.LIZ().LIZIZ(null);
        ((LocalMusicTabFragment) aqS56S0201000_7.l0).Pl(aqS56S0201000_7.i2, (MusicModel) aqS56S0201000_7.l1, z, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS56S0201000_7 aqS56S0201000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJ(R.string.bc9, new AqS56S0201000_7((LocalMusicTabFragment) aqS56S0201000_7.l0, aqS56S0201000_7.i2, (MusicModel) aqS56S0201000_7.l1, 3));
        actionGroup.LJIIIIZZ(R.string.bmt, C45822Hyc.LJLIL);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0201000_7(int i, C76732zl c76732zl, C41988Gds c41988Gds, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c76732zl;
        this.l1 = c41988Gds;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0201000_7(GS5 gs5, SingleImageData singleImageData, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = gs5;
        this.l1 = singleImageData;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0201000_7(LocalMusicTabFragment localMusicTabFragment, int i, MusicModel musicModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = localMusicTabFragment;
        this.i2 = i;
        this.l1 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0201000_7(PreviewNextBtnState previewNextBtnState, C45628HvU c45628HvU, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = previewNextBtnState;
        this.l1 = c45628HvU;
        this.i2 = i;
    }
}
