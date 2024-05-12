package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gio, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42294Gio implements InterfaceC45242HpG {
    public static final int[] LJII;
    public final Activity LIZ;
    public long LIZIZ;
    public C42278GiY LIZJ;
    public final File LIZLLL;
    public final File LJ;
    public final File LJFF;
    public final C62822Ol8 LJI;

    @Override // X.InterfaceC45242HpG
    public final void LIZ() {
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZIZ(int i) {
    }

    @Override // X.InterfaceC45242HpG
    public final void LJIJJLI() {
    }

    static {
        int[] LIZ = J7H.LIZ(301);
        if (LIZ == null) {
            LIZ = new int[]{LiveTryModeCountDownThresholdSetting.DEFAULT, LiveTryModeCountDownThresholdSetting.DEFAULT};
        }
        LJII = LIZ;
    }

    @Override // X.InterfaceC45242HpG
    public final void dismissDialog() {
        C42278GiY c42278GiY = this.LIZJ;
        if (c42278GiY != null) {
            c42278GiY.dismiss();
        }
    }

    public C42294Gio(Activity activity) {
        this.LIZ = activity;
        H8C h8c = new H8C();
        EnumC43651HBf enumC43651HBf = EnumC43651HBf.LOCAL_EXTRACT_MUSIC;
        this.LIZLLL = h8c.LIZ(enumC43651HBf, "tmp/", true);
        this.LJ = h8c.LIZ(enumC43651HBf, "audio/", true);
        this.LJFF = h8c.LIZ(enumC43651HBf, "thumb/", true);
        this.LJI = C221108m2.LIZIZ(C42276GiW.LJLIL);
    }

    public final void LJ(String str) {
        Bundle bundle;
        String str2;
        String str3;
        String string;
        Bundle LIZLLL = C60903NvH.LJIIJJI().LJIL().LIZLLL(this.LIZ);
        if (LIZLLL != null) {
            bundle = LIZLLL.getBundle("extra_log_info_map");
        } else {
            bundle = null;
        }
        String str4 = "";
        if (bundle == null || (str2 = bundle.getString("shoot_way")) == null) {
            str2 = "";
        }
        if (bundle == null || (str3 = bundle.getString("enter_from")) == null) {
            str3 = "";
        }
        C188727au c188727au = new C188727au();
        if (bundle != null && (string = bundle.getString("creation_id")) != null) {
            str4 = string;
        }
        c188727au.LJIIIZ("creation_id", str4);
        c188727au.LJIIIZ("shoot_way", str2);
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("fail_type", str);
        FMX.LJIIL("upload_sound_from_video_popup_show", c188727au.LIZ);
    }

    public final void LJI(int i) {
        C6QQ.LIZ(new AqS157S0100000_7(this, 474));
        LJ("import_failed");
        LJFF(0L, 0L, false, i, 0L);
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent intent) {
        MediaModel mediaModel;
        o.LJIIIZ(intent, "intent");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null && (mediaModel = (MediaModel) ORZ.LJLLLL(parcelableArrayListExtra)) != null) {
            long j = mediaModel.duration;
            if (j < 1000) {
                Activity activity = this.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(R.string.bmf);
                C78915Uy7.LJJIIZI(activity, 3051, creativeToastBuilder);
                LJ("video_too_short");
                return;
            }
            if (j > 1200000) {
                Activity activity2 = this.LIZ;
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(R.string.bmj);
                C78915Uy7.LJJIIZI(activity2, 3051, creativeToastBuilder2);
                LJ("video_too_long");
                return;
            }
            C6QQ.LIZ(new AqS154S0200000_7(this, XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C42277GiX(this, mediaModel, intent, null), 3), 82));
        }
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
        C41993Gdx.LIZ(list, creativeInfo);
        return 0;
    }

    public static void LJFF(long j, long j2, boolean z, int i, long j3) {
        int i2;
        C188727au c188727au = new C188727au();
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c188727au.LIZLLL(i2, "status");
        if (z) {
            c188727au.LJ(j, "time");
            c188727au.LJ(j2, "audio_file_size");
            c188727au.LJ(j3, "thumb_file_size");
        } else {
            c188727au.LIZLLL(i, "error_code");
        }
        FMX.LJIIL("av_performance_extract_audio_from_video", c188727au.LIZ);
    }
}
