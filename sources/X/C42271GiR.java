package X;

import Y.ARunnableS11S0101000_7;
import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GiR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42271GiR implements InterfaceC45242HpG {
    public final ActivityC45651qj LIZ;
    public C42278GiY LIZIZ;
    public final boolean LIZJ = GWL.LIZ();
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 645));

    @Override // X.InterfaceC45242HpG
    public final void LIZ() {
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZIZ(int i) {
    }

    @Override // X.InterfaceC45242HpG
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC45242HpG
    public final void dismissDialog() {
    }

    public C42271GiR(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
    }

    public final void LJ(int i) {
        int i2;
        if (i > 1) {
            i2 = 1002;
        } else {
            i2 = 1001;
        }
        if (this.LIZIZ == null) {
            C42279GiZ c42279GiZ = C42279GiZ.LIZ;
            ActivityC45651qj activityC45651qj = this.LIZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(false);
            creativeLoadingDialogBuilder.backCanCancel(false);
            this.LIZIZ = (C42278GiY) c42279GiZ.createLoadingDialog(activityC45651qj, i2, creativeLoadingDialogBuilder);
        }
        if (C41028G8i.LIZ() && !C151435wx.LIZIZ().getDelayLoading()) {
            C42278GiY c42278GiY = this.LIZIZ;
            if (c42278GiY != null) {
                c42278GiY.delayShow(C42279GiZ.LIZ());
                return;
            }
            return;
        }
        C42278GiY c42278GiY2 = this.LIZIZ;
        if (c42278GiY2 == null) {
            return;
        }
        c42278GiY2.show();
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        boolean z;
        o.LJIIIZ(data, "data");
        if (i == 1) {
            Parcelable parcelableExtra = data.getParcelableExtra("key_short_video_context");
            if (parcelableExtra != null) {
                ShortVideoContext shortVideoContext = (ShortVideoContext) parcelableExtra;
                ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
                if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                    H78.LJII("selectedMediaData is invalid when onChosenResult invoked in PhotoMvChosenResultImpl");
                    return;
                }
                int intExtra = data.getIntExtra("key_choose_media_item_size", 0);
                int size = parcelableArrayListExtra.size();
                if (C151435wx.LIZIZ().getDelayLoading()) {
                    ((Handler) this.LIZLLL.getValue()).postDelayed(new ARunnableS11S0101000_7(size, this, 16), 500L);
                } else {
                    LJ(size);
                }
                HA3 LIZ = C42273GiT.LIZ(this.LIZ, null);
                if (LIZ != null) {
                    z = LIZ.LJJL();
                } else {
                    z = true;
                }
                if (this.LIZJ) {
                    String str = ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).fileLocalUriPath;
                    o.LJIIIIZZ(str, "selectedMediaData[0].fileLocalUriPath");
                    shortVideoContext.singleImageCoverBitmapData = new SingleImageCoverBitmapData(str, intExtra, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).date, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).type, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).width, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).height, null, 64, null);
                }
                if (data.getIntExtra("key_choose_scene", -1) == 31) {
                    AVMusic aVMusic = (AVMusic) data.getSerializableExtra("aweme_music");
                    MusicBuzModel musicBuzModel = shortVideoContext.creativeModel.musicBuzModel;
                    musicBuzModel.musicOrigin = "single_song";
                    I9T.LJI(aVMusic, false, musicBuzModel);
                }
                C42264GiK.LJII(new C42263GiJ(this.LIZ, shortVideoContext, parcelableArrayListExtra, z, new AqS157S0100000_7(this, 646), new C42272GiS(this, parcelableArrayListExtra, i, data)));
                HA3 LIZ2 = C42273GiT.LIZ(this.LIZ, null);
                if (LIZ2 != null) {
                    LIZ2.LJZL();
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
        C41993Gdx.LIZ(list, creativeInfo);
        return 0;
    }
}
