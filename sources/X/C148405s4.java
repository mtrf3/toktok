package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5s4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148405s4 extends WI1 {
    public boolean LJIIIZ;
    public final int LJIIJ;
    public final C6MP LJIIJJI;

    @Override // X.WI1
    public final int LJ() {
        return R.raw.icon_camera_enhancephoto_fill;
    }

    @Override // X.WI1
    public final int LJII() {
        return R.string.fiz;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return new WI0(null, this.LJIIJ, false, 5);
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJJI;
    }

    @Override // X.WI1
    public final boolean LJIIIZ() {
        return this.LJIIIZ;
    }

    public C148405s4(VideoPublishEditModel model, ImageAlbumData imageAlbumData) {
        boolean LJFF;
        int i;
        o.LJIIIZ(model, "model");
        if (H7R.LJJJJL(model)) {
            if (imageAlbumData != null) {
                LJFF = imageAlbumData.getAutoEnhanceOn();
            } else {
                LJFF = false;
            }
        } else {
            LJFF = H7R.LJFF(model);
        }
        this.LJIIIZ = LJFF;
        if (C151975xp.LIZ(model)) {
            i = UserLevelGeckoUpdateSetting.DEFAULT;
        } else {
            i = 130;
        }
        this.LJIIJ = i;
        this.LJIIJJI = C6MP.AUTO_ENHANCE;
    }
}
