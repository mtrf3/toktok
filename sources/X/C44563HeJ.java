package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HeJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44563HeJ extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44539Hdv LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams2 = vEVideoEncodeConfigParams;
        SettingsManager.LIZLLL().getClass();
        vEVideoEncodeConfigParams2.setEnableRemuxVideoForRotation(SettingsManager.LIZ("ve_fast_import_ignore_recode_for_rotation", false));
        C44539Hdv c44539Hdv = this.LIZIZ;
        VideoPublishEditModel videoPublishEditModel = c44539Hdv.LIZ;
        String workSpace = c44539Hdv.LIZLLL.getWorkspace();
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(vEVideoEncodeConfigParams2, 15);
        AqS189S0100000_7 aqS189S0100000_7 = new AqS189S0100000_7(vEVideoEncodeConfigParams2, 0);
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(workSpace, "workSpace");
        if (videoPublishEditModel.mOrigin == 1) {
            if (H7R.LJJJZ(videoPublishEditModel)) {
                C5Z5.LIZIZ("UploadNeedRecode; LastRemux ; isRecordVideoSizeDiversed forShoot : false ;");
                aqS173S0100000_7.invoke(Boolean.FALSE);
                return;
            }
            File file = new File(workSpace);
            if (!file.exists() || !file.isDirectory()) {
                file.mkdirs();
            }
            C5Z5.LIZIZ("UploadNeedRecode; LastRemux ; !isRecordVideoSizeDiversed forShoot : true ;");
            if (videoPublishEditModel.isStitchMode()) {
                int width = ((EditVideoSegment) ORZ.LJLLJ(videoPublishEditModel.getPreviewInfo().getVideoList())).getVideoFileInfo().getWidth();
                int height = ((EditVideoSegment) ORZ.LJLLJ(videoPublishEditModel.getPreviewInfo().getVideoList())).getVideoFileInfo().getHeight();
                List<EditVideoSegment> videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
                if (!(videoList instanceof Collection) || !videoList.isEmpty()) {
                    for (EditVideoSegment editVideoSegment : videoList) {
                        if (editVideoSegment.getVideoFileInfo().getWidth() != width || editVideoSegment.getVideoFileInfo().getHeight() != height) {
                            aqS173S0100000_7.invoke(Boolean.FALSE);
                            return;
                        }
                    }
                }
            }
            aqS173S0100000_7.invoke(Boolean.TRUE);
            return;
        }
        if (!videoPublishEditModel.isUseMultiEdit()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadNeedRecode; LastRemux ; isUseMultiEdit forNormal : false ; forRotation : ");
        SettingsManager.LIZLLL().getClass();
        LIZ.append(SettingsManager.LIZ("ve_fast_import_ignore_recode_for_rotation", false));
        LIZ.append(';');
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
        Boolean bool = Boolean.FALSE;
        SettingsManager.LIZLLL().getClass();
        aqS189S0100000_7.invoke(bool, Boolean.valueOf(SettingsManager.LIZ("ve_fast_import_ignore_recode_for_rotation", false)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44563HeJ(InterfaceC44653Hfl strategy, C44539Hdv initParams) {
        super(strategy);
        C44576HeW c44576HeW = C44576HeW.LIZ;
        String name = c44576HeW.key;
        int i = c44576HeW.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
