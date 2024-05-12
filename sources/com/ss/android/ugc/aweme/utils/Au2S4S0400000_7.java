package com.ss.android.ugc.aweme.utils;

import X.AI8;
import X.AI9;
import X.AIF;
import X.C00F;
import X.C40977G6j;
import X.C40984G6q;
import X.C78857UxB;
import X.C81556Vzc;
import X.EnumC81480VyO;
import X.G7M;
import X.G7Y;
import X.KL2;
import X.TAT;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class Au2S4S0400000_7 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S4S0400000_7 au2S4S0400000_7, View view) {
        AIF aif;
        int i;
        C40984G6q c40984G6q = (C40984G6q) au2S4S0400000_7.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) au2S4S0400000_7.l1;
        c40984G6q.getClass();
        C40984G6q.LJIILIIL(videoPublishEditModel);
        C40984G6q c40984G6q2 = (C40984G6q) au2S4S0400000_7.l0;
        if (c40984G6q2.LJII == null) {
            c40984G6q2.LJII = C40984G6q.LJII(c40984G6q2.LIZLLL, (VideoPublishEditModel) au2S4S0400000_7.l1, (VideoPublishViewModel) au2S4S0400000_7.l2, c40984G6q2.LJ);
        }
        AI9 ai9 = null;
        if (C40977G6j.LIZ()) {
            C40984G6q c40984G6q3 = (C40984G6q) au2S4S0400000_7.l0;
            if (c40984G6q3.LJIIJ == null) {
                G7Y g7y = new G7Y();
                AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7((C40984G6q) au2S4S0400000_7.l0, 526);
                C81556Vzc c81556Vzc = g7y.LIZ;
                c81556Vzc.LJLJJL = false;
                c81556Vzc.LJLJJI = aqS157S0100000_7;
                g7y.LIZ(EnumC81480VyO.FIXED);
                if (((C40984G6q) au2S4S0400000_7.l0).LJFF != null) {
                    C81556Vzc c81556Vzc2 = g7y.LIZ;
                    c81556Vzc2.LJLJL = (int) (KL2.LJIIIZ(r0) * 0.7f);
                    c81556Vzc2.LL = true;
                    c81556Vzc2.LJZL = true;
                    c81556Vzc2.LJLL = true;
                    c81556Vzc2.LJLLL = R.style.uw;
                    g7y.LIZ.LLF = -1;
                    AqS157S0100000_7 aqS157S0100000_72 = new AqS157S0100000_7((C40984G6q) au2S4S0400000_7.l0, 527);
                    C81556Vzc c81556Vzc3 = g7y.LIZ;
                    c81556Vzc3.LJLZ = aqS157S0100000_72;
                    c40984G6q3.LJIIJ = c81556Vzc3;
                } else {
                    o.LJIJI("mContext");
                    throw null;
                }
            }
        }
        ((C40984G6q) au2S4S0400000_7.l0).LJIIZILJ(C78857UxB.LJJJJZI((LinearLayout) au2S4S0400000_7.l3));
        if ((C00F.LIZ(31744, 0, "creative_tools_publish_first_frame_opt", true) & 4) != 0) {
            ((C40984G6q) au2S4S0400000_7.l0).LJ();
        } else {
            AI8 ai8 = ((C40984G6q) au2S4S0400000_7.l0).LJIILJJIL;
            if (ai8 != null) {
                ai9 = ai8.getAccessory();
            }
            if ((ai9 instanceof AIF) && (aif = (AIF) ai9) != null) {
                aif.LJIILIIL(((C40984G6q) au2S4S0400000_7.l0).LJIJ);
            }
        }
        if (((C40984G6q) au2S4S0400000_7.l0).LIZLLL) {
            Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
            AI8 ai82 = ((C40984G6q) au2S4S0400000_7.l0).LJIILJJIL;
            if (ai82 != null) {
                ai82.setShowAlertBadge(false);
            }
        }
        if (!((C40984G6q) au2S4S0400000_7.l0).LJIIJJI || (i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("click_advanced_settings_times", 0)) >= 3) {
            return;
        }
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("click_advanced_settings_times", i + 1);
    }

    public static final void LIZ$1(Au2S4S0400000_7 au2S4S0400000_7, View view) {
        AIF aif;
        int i;
        C40984G6q c40984G6q = (C40984G6q) au2S4S0400000_7.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) au2S4S0400000_7.l1;
        c40984G6q.getClass();
        C40984G6q.LJIILIIL(videoPublishEditModel);
        C40984G6q c40984G6q2 = (C40984G6q) au2S4S0400000_7.l0;
        if (c40984G6q2.LJII == null) {
            c40984G6q2.LJII = C40984G6q.LJII(c40984G6q2.LIZLLL, (VideoPublishEditModel) au2S4S0400000_7.l1, (VideoPublishViewModel) au2S4S0400000_7.l2, c40984G6q2.LJ);
        }
        G7M g7m = ((C40984G6q) au2S4S0400000_7.l0).LJII;
        if (g7m != null) {
            g7m.LJLJL = ((VideoPublishEditModel) au2S4S0400000_7.l1).creativeModel.trendingUploadModel.trendingTopic;
        }
        AI9 ai9 = null;
        if (C40977G6j.LIZ()) {
            C40984G6q c40984G6q3 = (C40984G6q) au2S4S0400000_7.l0;
            if (c40984G6q3.LJIIJ == null) {
                G7Y g7y = new G7Y();
                AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7((C40984G6q) au2S4S0400000_7.l0, 529);
                C81556Vzc c81556Vzc = g7y.LIZ;
                c81556Vzc.LJLJJL = false;
                c81556Vzc.LJLJJI = aqS157S0100000_7;
                g7y.LIZ(EnumC81480VyO.FIXED);
                if (((C40984G6q) au2S4S0400000_7.l0).LJFF != null) {
                    C81556Vzc c81556Vzc2 = g7y.LIZ;
                    c81556Vzc2.LJLJL = (int) (KL2.LJIIIZ(r0) * 0.7f);
                    c81556Vzc2.LL = true;
                    c81556Vzc2.LJZL = true;
                    c81556Vzc2.LJLL = true;
                    c81556Vzc2.LJLLL = R.style.uw;
                    g7y.LIZ.LLF = -1;
                    AqS157S0100000_7 aqS157S0100000_72 = new AqS157S0100000_7((C40984G6q) au2S4S0400000_7.l0, 530);
                    C81556Vzc c81556Vzc3 = g7y.LIZ;
                    c81556Vzc3.LJLZ = aqS157S0100000_72;
                    c40984G6q3.LJIIJ = c81556Vzc3;
                } else {
                    o.LJIJI("mContext");
                    throw null;
                }
            }
        }
        ((C40984G6q) au2S4S0400000_7.l0).LJIIZILJ(C78857UxB.LJJJJZI((LinearLayout) au2S4S0400000_7.l3));
        if ((C00F.LIZ(31744, 0, "creative_tools_publish_first_frame_opt", true) & 4) != 0) {
            ((C40984G6q) au2S4S0400000_7.l0).LJ();
        } else {
            AI8 ai8 = ((C40984G6q) au2S4S0400000_7.l0).LJIILJJIL;
            if (ai8 != null) {
                ai9 = ai8.getAccessory();
            }
            if ((ai9 instanceof AIF) && (aif = (AIF) ai9) != null) {
                aif.LJIILIIL(((C40984G6q) au2S4S0400000_7.l0).LJIJ);
            }
        }
        if (((C40984G6q) au2S4S0400000_7.l0).LIZLLL) {
            Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
            AI8 ai82 = ((C40984G6q) au2S4S0400000_7.l0).LJIILJJIL;
            if (ai82 != null) {
                ai82.setShowAlertBadge(false);
            }
        }
        if (!((C40984G6q) au2S4S0400000_7.l0).LJIIJJI || (i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("click_advanced_settings_times", 0)) >= 3) {
            return;
        }
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("click_advanced_settings_times", i + 1);
    }

    public Au2S4S0400000_7(C40984G6q c40984G6q, VideoPublishEditModel videoPublishEditModel, VideoPublishViewModel videoPublishViewModel, LinearLayout linearLayout, int i) {
        this.$t = i;
        this.l0 = c40984G6q;
        this.l1 = videoPublishEditModel;
        this.l2 = videoPublishViewModel;
        this.l3 = linearLayout;
    }
}
