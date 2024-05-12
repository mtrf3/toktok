package X;

import Y.ACallableS110S0100000_7;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import defpackage.e1;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HMO implements HMV {
    public final Context LIZ;
    public final C62822Ol8 LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public final boolean LJ;
    public final Handler LJFF;

    public HMO(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = C221108m2.LIZIZ(HMP.LJLIL);
        this.LIZJ = true;
        this.LIZLLL = "";
        this.LJ = e1.LIZ(31744, "creative_tools_upload_format_ext", true, false);
        this.LJFF = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // X.HMV
    public final void setEnterFrom(String str) {
        this.LIZLLL = str;
    }

    public static final void LIZIZ(HMO hmo, MediaModel mediaModel, InterfaceC88472Yns<? super C43933HMb, C76800UCe> interfaceC88472Yns, long j, String str, InterfaceC88472Yns<? super C43933HMb, C76800UCe> interfaceC88472Yns2) {
        C10K.LIZIZ(new ACallableS110S0100000_7(mediaModel, 3), (Executor) hmo.LIZIZ.getValue(), null).LJ(new HMN(hmo, interfaceC88472Yns, j, str, interfaceC88472Yns2), C10K.LJIIIIZZ, null);
    }

    @Override // X.HMV
    public final void LIZ(MediaModel mediaModel, boolean z, long j, long j2, boolean z2, boolean z3, InterfaceC88472Yns<? super C43933HMb, C76800UCe> onSuccess, InterfaceC88472Yns<? super C43933HMb, C76800UCe> onError) {
        o.LJIIIZ(mediaModel, "mediaModel");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onError, "onError");
        C44687HgJ.LIZ(mediaModel.fileLocalUriPath, new HML(this, mediaModel, z, j, j2, System.currentTimeMillis(), HMW.LIZ(mediaModel.fileName), z2, z3, onSuccess, onError));
    }
}
