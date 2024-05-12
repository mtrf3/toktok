package X;

import Y.ARunnableS21S0200000_2;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.60E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60E implements C60G {
    public final /* synthetic */ C60B LIZ;
    public final /* synthetic */ View LIZIZ;

    @Override // X.C60G
    public final void LIZ() {
        boolean z;
        Integer LJIILLIIL;
        int i;
        C78934UyQ.LJLIL.getMusicService().LJIL();
        TCM tcm = new TCM();
        C60F vq = this.LIZ.LJ.vq();
        boolean z2 = false;
        if (vq != null) {
            if (!TCM.LJIIJJI() && ((LJIILLIIL = TCM.LJIILLIIL()) == null || LJIILLIIL.intValue() != 3)) {
                z = true;
            } else {
                z = false;
            }
            vq.LIZJ = z;
        }
        C60B c60b = this.LIZ;
        c60b.LIZ.runOnUiThread(new ARunnableS21S0200000_2(this.LIZIZ, c60b, 35));
        C60F vq2 = this.LIZ.LJ.vq();
        if (vq2 == null || !vq2.LIZJ || TCM.LJII() < 0) {
            return;
        }
        VideoPublishEditModel model = this.LIZ.LIZIZ;
        o.LJIIIZ(model, "model");
        StringBuilder sb = new StringBuilder();
        if (!TCM.LJIIJJI()) {
            for (AVMusic aVMusic : TCM.LJIIL()) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(aVMusic.getMid());
                z2 = true;
            }
        }
        C145995oB LJJJLIIL = H8F.LJJJLIIL(model);
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        LJJJLIIL.LIZ(TCM.LJIIL().size(), "music_upload_num");
        LJJJLIIL.LIZIZ(TCM.LJII(), "music_upload_duration");
        LJJJLIIL.LJI("music_id_list", sb.toString());
        Integer LJIILLIIL2 = TCM.LJIILLIIL();
        if (LJIILLIIL2 != null) {
            i = LJIILLIIL2.intValue();
        } else {
            i = 2;
        }
        LJJJLIIL.LIZ(i, "music_rec_type");
        FMX.LJIIL("music_upload_done", LJJJLIIL.LIZ);
        tcm.LJIILL();
    }

    public C60E(View view, C60B c60b) {
        this.LIZ = c60b;
        this.LIZIZ = view;
    }
}
