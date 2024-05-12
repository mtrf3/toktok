package Y;

import X.C145995oB;
import X.C16880lQ;
import X.C45804HyK;
import X.FMX;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* loaded from: classes8.dex */
public class IDCListenerS50S0200000_7 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS50S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(IDCListenerS50S0200000_7 iDCListenerS50S0200000_7, DialogInterface dialogInterface, int i) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) iDCListenerS50S0200000_7.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) iDCListenerS50S0200000_7.l1;
        videoPublishContainerScene.getClass();
        C45804HyK.LJJJJJ(videoPublishEditModel, true);
        C145995oB LLLILZLLLI = videoPublishContainerScene.LLLILZLLLI();
        LLLILZLLLI.LJI("click_type", "not_now");
        FMX.LJIIL("click_audio_clear_popup", LLLILZLLLI.LIZ);
    }

    public static final void onClick$1(IDCListenerS50S0200000_7 iDCListenerS50S0200000_7, DialogInterface dialogInterface, int i) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) iDCListenerS50S0200000_7.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) iDCListenerS50S0200000_7.l1;
        videoPublishContainerScene.getClass();
        C45804HyK.LJJJJJ(videoPublishEditModel, true);
        C145995oB LLLILZLLLI = videoPublishContainerScene.LLLILZLLLI();
        LLLILZLLLI.LJI("click_type", "not_now");
        FMX.LJIIL("click_audio_clear_popup", LLLILZLLLI.LIZ);
    }

    public static final void onClick$2(IDCListenerS50S0200000_7 iDCListenerS50S0200000_7, DialogInterface dialogInterface, int i) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) iDCListenerS50S0200000_7.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) iDCListenerS50S0200000_7.l1;
        videoPublishContainerScene.getClass();
        C45804HyK.LJJJJJ(videoPublishEditModel, false);
        videoPublishContainerScene.LLLJL();
        videoPublishContainerScene.a("short_video_draft_music_legality");
        C145995oB LLLILZLLLI = videoPublishContainerScene.LLLILZLLLI();
        LLLILZLLLI.LJI("click_type", "select");
        FMX.LJIIL("click_audio_clear_popup", LLLILZLLLI.LIZ);
    }

    public static final void onClick$3(IDCListenerS50S0200000_7 iDCListenerS50S0200000_7, DialogInterface dialogInterface, int i) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) iDCListenerS50S0200000_7.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) iDCListenerS50S0200000_7.l1;
        videoPublishContainerScene.getClass();
        C45804HyK.LJJJJJ(videoPublishEditModel, false);
        videoPublishContainerScene.LLLJL();
        videoPublishContainerScene.a("long_video_draft_music_legality");
        C145995oB LLLILZLLLI = videoPublishContainerScene.LLLILZLLLI();
        LLLILZLLLI.LJI("click_type", "select");
        FMX.LJIIL("click_audio_clear_popup", LLLILZLLLI.LIZ);
    }

    public static final void onClick$4(IDCListenerS50S0200000_7 iDCListenerS50S0200000_7, DialogInterface dialogInterface, int i) {
        C16880lQ.LIZJ((Context) iDCListenerS50S0200000_7.l0, (Intent) iDCListenerS50S0200000_7.l1);
    }
}
