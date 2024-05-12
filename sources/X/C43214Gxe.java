package X;

import Y.IDeS155S0200000_7;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gxe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43214Gxe implements InterfaceC134045Nw {
    public final /* synthetic */ C43213Gxd LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ VideoPublishEditModel LIZJ;

    @Override // X.InterfaceC134045Nw
    public final void onCompileDone() {
        AqS96S0300000_7 aqS96S0300000_7 = new AqS96S0300000_7(this.LIZ, this.LIZIZ, this.LIZJ, 11);
        if (Build.VERSION.SDK_INT >= 29) {
            aqS96S0300000_7.invoke();
            return;
        }
        C43213Gxd c43213Gxd = this.LIZ;
        Activity activity = this.LIZIZ;
        TokenCert with = TokenCert.Companion.with("bpea-tools_request_storage_permission_save_draft");
        c43213Gxd.getClass();
        C61100NyS LIZ = C61099NyR.LIZIZ.LIZIZ(activity, with).LIZ("android.permission.WRITE_EXTERNAL_STORAGE");
        LIZ.LIZ(new C61109Nyb(activity));
        LIZ.LIZJ(new IDeS155S0200000_7(activity, aqS96S0300000_7, 0));
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileProgress(float f) {
        C43213Gxd c43213Gxd = this.LIZ;
        if (c43213Gxd.LIZ) {
            return;
        }
        C43199GxP c43199GxP = c43213Gxd.LIZIZ;
        Activity context = this.LIZIZ;
        VideoPublishEditModel editModel = this.LIZJ;
        c43199GxP.getClass();
        o.LJIIIZ(context, "context");
        o.LJIIIZ(editModel, "editModel");
        new Handler().post(new RunnableC43200GxQ(f * 80, c43199GxP, editModel));
    }

    public C43214Gxe(C43213Gxd c43213Gxd, ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = c43213Gxd;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = videoPublishEditModel;
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileError(int i, int i2, float f, String str) {
        C43199GxP c43199GxP = this.LIZ.LIZIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        c43199GxP.getClass();
        C43199GxP.LIZ(videoPublishEditModel);
    }
}
