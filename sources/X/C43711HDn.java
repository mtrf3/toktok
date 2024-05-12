package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HDn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43711HDn implements InterfaceC44507HdP {
    public ProgressDialogC173686rk LIZ;
    public final /* synthetic */ C46005I3t LIZIZ;
    public final /* synthetic */ Workspace LIZJ;
    public final /* synthetic */ LibraryParams LIZLLL;
    public final /* synthetic */ CutVideoCompileConfigure LJ;
    public final /* synthetic */ C44428Hc8 LJFF;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r0.Mv0().LJIL != false) goto L12;
     */
    @Override // X.InterfaceC134045Nw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompileDone() {
        /*
            Method dump skipped, instructions count: 2352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43711HDn.onCompileDone():void");
    }

    @Override // X.InterfaceC44507HdP
    public final void LIZ(boolean z) {
        C46005I3t c46005I3t = this.LIZIZ;
        c46005I3t.LJZ = z;
        if (!z) {
            ProgressDialogC173686rk LIZJ = ProgressDialogC173686rk.LIZJ(c46005I3t.mActivity, c46005I3t.getResources().getString(R.string.ra6));
            this.LIZ = LIZJ;
            LIZJ.setIndeterminate(false);
            C46005I3t.LLJJ(true);
        }
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileProgress(float f) {
        ProgressDialogC173686rk progressDialogC173686rk = this.LIZ;
        if (progressDialogC173686rk != null && progressDialogC173686rk.isShowing()) {
            progressDialogC173686rk.setProgress((int) (f * 100));
        }
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileError(int i, int i2, float f, String str) {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.LIZIZ.LJLL;
        if (cutVideoTitleBarViewModel != null) {
            cutVideoTitleBarViewModel.Mv0(true);
            C135115Rz.LIZ(this.LIZ);
            C46005I3t.LLJJ(false);
            String string = this.LIZIZ.getString(R.string.dse, Integer.valueOf(i));
            o.LJIIIIZZ(string, "getString(R.string.concat_error, error)");
            Activity activity = this.LIZIZ.mActivity;
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(string);
                C78915Uy7.LJJIIZI(activity, 1036, creativeToastBuilder);
            }
            FMX.LJIIL("import_transcoding_end", GFJ.LIZIZ(0, "status").LIZ);
            return;
        }
        o.LJIJI("titleBarViewModel");
        throw null;
    }

    public C43711HDn(C46005I3t c46005I3t, Workspace workspace, LibraryParams libraryParams, CutVideoCompileConfigure cutVideoCompileConfigure, C44428Hc8 c44428Hc8) {
        this.LIZIZ = c46005I3t;
        this.LIZJ = workspace;
        this.LIZLLL = libraryParams;
        this.LJ = cutVideoCompileConfigure;
        this.LJFF = c44428Hc8;
    }
}
