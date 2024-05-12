package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148105ra extends WI1 {
    public boolean LJIIIZ;
    public WI0 LJIIJ;
    public final C6MP LJIIJJI;

    @Override // X.WI1
    public final int LJII() {
        return R.string.ita;
    }

    @Override // X.WI1
    public final boolean LJIIIZ() {
        if (this.LJII) {
            return this.LJIIIZ;
        }
        return false;
    }

    @Override // X.WI1
    public final int LJ() {
        if (C149055t7.LIZ()) {
            return R.raw.icon_camera_waveform;
        }
        return R.raw.icon_camera_denoise;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJJI;
    }

    public C148105ra(VideoPublishEditModel model) {
        boolean z;
        int i;
        o.LJIIIZ(model, "model");
        if (model.mOrigin == 1) {
            z = C5WS.LIZ();
        } else {
            z = C5WV.LIZ.getBoolean("audio_music_sound", C5WS.LIZ());
        }
        this.LJIIIZ = z;
        if (C151975xp.LIZ(model)) {
            i = 100;
        } else {
            i = 150;
        }
        this.LJIIJ = new WI0(null, i, false, 5);
        this.LJIIJJI = C6MP.AUDIO_ENHANCE;
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIJ = wi0;
    }
}
