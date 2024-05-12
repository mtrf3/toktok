package Y;

import X.C188727au;
import X.C68322mC;
import X.C6ES;
import X.C76800UCe;
import X.C78983UzD;
import X.FMX;
import X.H7R;
import X.InterfaceC88472Yns;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACListenerS2S1301000_2 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS2S1301000_2 aCListenerS2S1301000_2, View view) {
        DialogFragment dialogFragment = (DialogFragment) ((C68322mC) aCListenerS2S1301000_2.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS2S1301000_2.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(1);
        }
        String creationId = ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).getCreationId();
        o.LJIIIIZZ(creationId, "videoPublishEditModel.creationId");
        String str = ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).mShootWay;
        o.LJIIIIZZ(str, "videoPublishEditModel.mShootWay");
        C6ES.LJ(creationId, str, String.valueOf(((VideoPublishEditModel) aCListenerS2S1301000_2.l3).draftId), aCListenerS2S1301000_2.s0, H7R.LJIIIZ((VideoPublishEditModel) aCListenerS2S1301000_2.l3), H7R.LJIIIIZZ((VideoPublishEditModel) aCListenerS2S1301000_2.l3), aCListenerS2S1301000_2.i4, ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).getMusicId(), ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).getVideoLength(), C78983UzD.LJJJJJL((VideoPublishEditModel) aCListenerS2S1301000_2.l3) ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(ACListenerS2S1301000_2 aCListenerS2S1301000_2, View view) {
        DialogFragment dialogFragment = (DialogFragment) ((C68322mC) aCListenerS2S1301000_2.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS2S1301000_2.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(1);
        }
        String creationId = ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).getCreationId();
        o.LJIIIIZZ(creationId, "videoPublishEditModel.creationId");
        String str = ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).mShootWay;
        o.LJIIIIZZ(str, "videoPublishEditModel.mShootWay");
        C6ES.LJ(creationId, str, String.valueOf(((VideoPublishEditModel) aCListenerS2S1301000_2.l3).draftId), aCListenerS2S1301000_2.s0, H7R.LJIIIZ((VideoPublishEditModel) aCListenerS2S1301000_2.l3), H7R.LJIIIIZZ((VideoPublishEditModel) aCListenerS2S1301000_2.l3), aCListenerS2S1301000_2.i4, ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).getMusicId(), ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).getVideoLength(), C78983UzD.LJJJJJL((VideoPublishEditModel) aCListenerS2S1301000_2.l3) ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$2(ACListenerS2S1301000_2 aCListenerS2S1301000_2, View view) {
        DialogFragment dialogFragment = (DialogFragment) ((C68322mC) aCListenerS2S1301000_2.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS2S1301000_2.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(5);
        }
        String creationId = ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).getCreationId();
        o.LJIIIIZZ(creationId, "videoPublishEditModel.creationId");
        String str = ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).mShootWay;
        o.LJIIIIZZ(str, "videoPublishEditModel.mShootWay");
        String enterFrom = aCListenerS2S1301000_2.s0;
        String contentType = H7R.LJIIIZ((VideoPublishEditModel) aCListenerS2S1301000_2.l3);
        String contentSource = H7R.LJIIIIZZ((VideoPublishEditModel) aCListenerS2S1301000_2.l3);
        int i = aCListenerS2S1301000_2.i4;
        int videoLength = ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).getVideoLength();
        boolean LJJJJJL = C78983UzD.LJJJJJL((VideoPublishEditModel) aCListenerS2S1301000_2.l3);
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("shoot_way", str);
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LIZLLL(videoLength, "creation_duration");
        C6ES.LIZ(i, LJJJJJL ? 1 : 0, c188727au);
        FMX.LJIIL("sound_copyright_edit_video_click", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$3(ACListenerS2S1301000_2 aCListenerS2S1301000_2, View view) {
        DialogFragment dialogFragment = (DialogFragment) ((C68322mC) aCListenerS2S1301000_2.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS2S1301000_2.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(3);
        }
        String creationId = ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).getCreationId();
        o.LJIIIIZZ(creationId, "videoPublishEditModel.creationId");
        String str = ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).mShootWay;
        o.LJIIIIZZ(str, "videoPublishEditModel.mShootWay");
        String enterFrom = aCListenerS2S1301000_2.s0;
        String contentType = H7R.LJIIIZ((VideoPublishEditModel) aCListenerS2S1301000_2.l3);
        String contentSource = H7R.LJIIIIZZ((VideoPublishEditModel) aCListenerS2S1301000_2.l3);
        int i = aCListenerS2S1301000_2.i4;
        int videoLength = ((VideoPublishEditModel) aCListenerS2S1301000_2.l3).getVideoLength();
        boolean LJJJJJL = C78983UzD.LJJJJJL((VideoPublishEditModel) aCListenerS2S1301000_2.l3);
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("shoot_way", str);
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LIZLLL(videoLength, "creation_duration");
        C6ES.LIZ(i, LJJJJJL ? 1 : 0, c188727au);
        FMX.LJIIL("sound_copyright_post_anyway_click", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS2S1301000_2(C68322mC c68322mC, C68322mC<TuxSheet> c68322mC2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, VideoPublishEditModel videoPublishEditModel, String str, int i) {
        this.$t = i;
        this.l1 = c68322mC;
        this.l2 = c68322mC2;
        this.l3 = interfaceC88472Yns;
        this.s0 = videoPublishEditModel;
        this.i4 = str;
    }
}
