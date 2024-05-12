package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class HTH implements InterfaceC82611WbX {
    public final /* synthetic */ VoiceConversionRecordService LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ Activity LJ;

    @Override // X.InterfaceC82611WbX
    public final void LIZJ() {
        DialogC25756A8y dialogC25756A8y;
        VoiceConversionRecordService voiceConversionRecordService = this.LIZ;
        DialogC25756A8y dialogC25756A8y2 = voiceConversionRecordService.LJFF;
        if (dialogC25756A8y2 == null) {
            DialogC25756A8y dialogC25756A8y3 = new DialogC25756A8y(this.LJ);
            dialogC25756A8y3.LIZJ(C44384HbQ.LJJZ(R.string.bng));
            dialogC25756A8y3.LIZLLL(true);
            voiceConversionRecordService.LJFF = dialogC25756A8y3;
            DialogC25756A8y dialogC25756A8y4 = this.LIZ.LJFF;
            if (dialogC25756A8y4 != null) {
                V1B.LJLJJL(dialogC25756A8y4);
                return;
            }
            return;
        }
        if (dialogC25756A8y2.isShowing() || (dialogC25756A8y = this.LIZ.LJFF) == null || new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "-8342714663616766869")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    @Override // X.InterfaceC82611WbX
    public final void LIZ(CategoryPageModel categoryPageModel) {
        DialogC25756A8y dialogC25756A8y;
        VoiceConversionRecordService voiceConversionRecordService = this.LIZ;
        DialogC25756A8y dialogC25756A8y2 = voiceConversionRecordService.LJFF;
        if (dialogC25756A8y2 != null && dialogC25756A8y2.isShowing() && (dialogC25756A8y = voiceConversionRecordService.LJFF) != null) {
            dialogC25756A8y.dismiss();
        }
        this.LIZ.LJFF(this.LIZIZ, this.LIZJ, this.LIZLLL, null, this.LJ, false);
    }

    @Override // X.InterfaceC82611WbX
    public final void LIZIZ(int i, String str) {
        DialogC25756A8y dialogC25756A8y;
        VoiceConversionRecordService voiceConversionRecordService = this.LIZ;
        DialogC25756A8y dialogC25756A8y2 = voiceConversionRecordService.LJFF;
        if (dialogC25756A8y2 != null && dialogC25756A8y2.isShowing() && (dialogC25756A8y = voiceConversionRecordService.LJFF) != null) {
            dialogC25756A8y.dismiss();
        }
    }

    public HTH(VoiceConversionRecordService voiceConversionRecordService, String str, String str2, String str3, Activity activity) {
        this.LIZ = voiceConversionRecordService;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = activity;
    }
}
