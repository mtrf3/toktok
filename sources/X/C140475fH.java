package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.5fH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140475fH implements InterfaceC126364xc {
    public final /* synthetic */ VideoPublishEditModel LIZ;
    public final /* synthetic */ C133765Mu LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ Intent LIZLLL;
    public final /* synthetic */ NLEEditor LJ;

    public final void LIZ(Intent intent) {
        this.LJ.LIZJ();
        this.LIZ.nleData = this.LJ.LJIIIIZZ();
        intent.putExtra("NLE", this.LIZ.nleData);
        H7R.LJJLIIJ(intent, this.LIZ);
        HZV.LIZ().LJIIZILJ(this.LIZJ, intent);
        H78.LJI("DraftEditHelper after openVideoPublishPage");
    }

    public C140475fH(VideoPublishEditModel videoPublishEditModel, C133765Mu c133765Mu, Context context, Intent intent, NLEEditor nLEEditor) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = c133765Mu;
        this.LIZJ = context;
        this.LIZLLL = intent;
        this.LJ = nLEEditor;
    }
}
