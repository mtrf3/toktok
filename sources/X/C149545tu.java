package X;

import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.ui.ImageEditRootScene$nextToPublish$1$1", f = "ImageEditRootScene.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149545tu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ImageEditRootScene LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C149545tu(ImageEditRootScene imageEditRootScene, InterfaceC67352kd<? super C149545tu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = imageEditRootScene;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C149545tu(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        C141335gf.LIZJ(obj);
        VideoPublishEditModel videoPublishEditModel = this.LJLIL.LJLLJ;
        if (videoPublishEditModel != null) {
            if (!C40980G6m.LIZ()) {
                CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                if (creativeModel.draftInfoModel.isDraft) {
                    AIGCInfo aIGCInfo = creativeModel.privacySettingModel.aigcInfo;
                    if (aIGCInfo.AIGCLabelType == 2) {
                        aIGCInfo.AIGCLabelType = 0;
                        aIGCInfo.manualChangeSwitch = false;
                    }
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.clear();
                AIGCInfo aIGCInfo2 = videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo;
                if (aIGCInfo2.manualChangeSwitch) {
                    i = aIGCInfo2.AIGCLabelType;
                } else {
                    i = 0;
                }
                int LIZJ = C152165y8.LIZJ(videoPublishEditModel);
                AIGCInfo aIGCInfo3 = videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo;
                if (i < LIZJ) {
                    i2 = LIZJ;
                } else {
                    i2 = i;
                }
                aIGCInfo3.AIGCLabelType = i2;
                if (LIZJ > i) {
                    aIGCInfo3.manualChangeSwitch = false;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AIGCManager -> updateImageModeAIGCType = ");
                LIZ.append(videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType);
                H78.LIZ(X1D.LIZIZ(LIZ));
                C152165y8.LJ(currentTimeMillis, videoPublishEditModel);
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
