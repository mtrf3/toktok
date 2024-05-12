package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.jvm.internal.o;

/* renamed from: X.Ht5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45479Ht5 extends AbstractC65781Prl implements InterfaceC88472Yns<ChoosePhotoPreviewPageConfig, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ MvChoosePhotoScene LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45479Ht5(boolean z, MvChoosePhotoScene mvChoosePhotoScene, boolean z2) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = mvChoosePhotoScene;
        this.LJLJI = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = choosePhotoPreviewPageConfig;
        o.LJIIIZ(choosePhotoPreviewPageConfig2, "$this$choosePhotoPreviewPageConfig");
        choosePhotoPreviewPageConfig2.isFromCutSame = this.LJLIL;
        choosePhotoPreviewPageConfig2.isSoundSync = this.LJLILLLLZI.LLLLZLLIL();
        choosePhotoPreviewPageConfig2.isUgcTemplate = this.LJLILLLLZI.LLLLZLLLI();
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLILLLLZI;
        boolean z5 = false;
        if (mvChoosePhotoScene.LJLLJ == 25) {
            z = true;
        } else {
            z = false;
        }
        choosePhotoPreviewPageConfig2.isAIGCAvatar = z;
        choosePhotoPreviewPageConfig2.isEditorProReplace = mvChoosePhotoScene.LLLLLZL();
        choosePhotoPreviewPageConfig2.isAutoCutSoundSyncMode = this.LJLILLLLZI.LLLLLLJ();
        choosePhotoPreviewPageConfig2.isAutoCutAnchorMode = this.LJLILLLLZI.LLLLLLIL();
        boolean z6 = this.LJLIL;
        choosePhotoPreviewPageConfig2.supportRepeatSelect = z6;
        if (!this.LJLJI && (z6 || this.LJLILLLLZI.LLZL)) {
            z2 = true;
        } else {
            z2 = false;
        }
        choosePhotoPreviewPageConfig2.showDockInPreviewPage = z2;
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLILLLLZI;
        if (mvChoosePhotoScene2.LLZLI && !mvChoosePhotoScene2.LLLLZLL()) {
            z3 = true;
        } else {
            z3 = false;
        }
        choosePhotoPreviewPageConfig2.nextRuleAdjustment = z3;
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LJLILLLLZI;
        choosePhotoPreviewPageConfig2.stickerMultiPhotosMode = mvChoosePhotoScene3.LLZLLIL;
        int i = mvChoosePhotoScene3.LJLLJ;
        ShortVideoContext shortVideoContext = mvChoosePhotoScene3.LLJLLIL;
        if (shortVideoContext != null && shortVideoContext.LJJIIZ()) {
            z4 = true;
        } else {
            z4 = false;
        }
        choosePhotoPreviewPageConfig2.showAutoCutBtn = C44703HgZ.LIZIZ(i, z4);
        choosePhotoPreviewPageConfig2.showEditorPro = C43818HHq.LIZ(this.LJLILLLLZI.LJLLJ, null);
        if (HOA.LIZ() && this.LJLILLLLZI.LJLLJ == 0 && !C1DG.LJIIIIZZ()) {
            C60903NvH.LJIIJJI().getAccountService().LJI();
            if (this.LJLILLLLZI.LLLLIIIILLL() != null || this.LJLILLLLZI.LLIFFJFJJ) {
                z5 = true;
            }
        }
        choosePhotoPreviewPageConfig2.enablePreviewClipAdjust = z5;
        choosePhotoPreviewPageConfig2.chooseSceneMode = this.LJLILLLLZI.LJLLJ;
        return C76800UCe.LIZ;
    }
}
