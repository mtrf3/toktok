package Y;

import X.AI8;
import X.C139825eE;
import X.C16880lQ;
import X.C232469Ak;
import X.C26045AKb;
import X.C26064AKu;
import X.C27913AxR;
import X.C45804HyK;
import X.C5S1;
import X.C66822jm;
import X.C70901Rs9;
import X.C75792yF;
import X.C78946Uyc;
import X.C79057V0z;
import X.C82682Wcg;
import X.C94I;
import X.InterfaceC26061AKr;
import X.WHL;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import com.ss.android.ugc.aweme.profile.widgets.header.avatar.OtherProfileAvatarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ARunnableS5S1100000_4 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Context context = ((View) this.l1).getContext();
        o.LJIIIIZZ(context, "context");
        C139825eE c139825eE = new C139825eE(context);
        c139825eE.LJIIL(this.s0);
        View summary_panel_touch_area = ((View) this.l1).findViewById(R.id.ktu);
        o.LJIIIIZZ(summary_panel_touch_area, "summary_panel_touch_area");
        c139825eE.LIZ.LIZIZ = summary_panel_touch_area;
        c139825eE.LJI(WHL.TOP);
        c139825eE.LJIIIZ(R.attr.eh);
        C82682Wcg c82682Wcg = c139825eE.LIZ;
        c82682Wcg.LJIIIZ = true;
        c82682Wcg.LJIIL = true;
        c139825eE.LIZJ().show();
        C79057V0z.LJJJJJL(C66822jm.LIZ, "show_sh_button_pop_tips", false);
        C78946Uyc.LJJIIJ((View) this.l1, new C70901Rs9(), C27913AxR.LJLIL);
    }

    public final void LIZ$1() {
        if (((ProfileEditFragment) this.l1).Sl()) {
            User user = ((ProfileEditFragment) this.l1).LLJJIJIL;
            if (user != null) {
                user.setYoutubeChannelTitle(this.s0);
                ((ProfileEditFragment) this.l1).Am();
                ProfileEditFragment profileEditFragment = (ProfileEditFragment) this.l1;
                AI8 ai8 = profileEditFragment.LLIIJLIL;
                if (ai8 != null) {
                    profileEditFragment.Pm(ai8, "youtube", TextUtils.isEmpty(this.s0));
                    ((ProfileEditFragment) this.l1).Al(false);
                    return;
                } else {
                    o.LJIJI("youtubeTuxCell");
                    throw null;
                }
            }
            o.LJIJI("userCache");
            throw null;
        }
        if (((ProfileEditFragment) this.l1).Ql()) {
            User user2 = ((ProfileEditFragment) this.l1).LLJJIJIL;
            if (user2 != null) {
                user2.setYoutubeChannelTitle(this.s0);
                ((ProfileEditFragment) this.l1).zm();
                ProfileEditFragment profileEditFragment2 = (ProfileEditFragment) this.l1;
                AI8 ai82 = profileEditFragment2.LLIIJLIL;
                if (ai82 != null) {
                    profileEditFragment2.Pm(ai82, "youtube", TextUtils.isEmpty(this.s0));
                    ((ProfileEditFragment) this.l1).Al(false);
                    return;
                } else {
                    o.LJIJI("youtubeTuxCell");
                    throw null;
                }
            }
            o.LJIJI("userCache");
            throw null;
        }
        if (((ProfileEditFragment) this.l1).getContext() == null) {
            return;
        }
        if (TextUtils.isEmpty(this.s0)) {
            ProfileEditFragment profileEditFragment3 = (ProfileEditFragment) this.l1;
            AI8 ai83 = profileEditFragment3.LLIIJLIL;
            if (ai83 != null) {
                profileEditFragment3.Im(ai83, profileEditFragment3.requireContext().getString(R.string.fku), false);
            } else {
                o.LJIJI("youtubeTuxCell");
                throw null;
            }
        } else {
            ProfileEditFragment profileEditFragment4 = (ProfileEditFragment) this.l1;
            AI8 ai84 = profileEditFragment4.LLIIJLIL;
            if (ai84 != null) {
                profileEditFragment4.Im(ai84, this.s0, true);
            } else {
                o.LJIJI("youtubeTuxCell");
                throw null;
            }
        }
        ProfileEditFragment profileEditFragment5 = (ProfileEditFragment) this.l1;
        AI8 ai85 = profileEditFragment5.LLIIJLIL;
        if (ai85 != null) {
            profileEditFragment5.Pm(ai85, "youtube", TextUtils.isEmpty(this.s0));
            ((ProfileEditFragment) this.l1).Al(false);
        } else {
            o.LJIJI("youtubeTuxCell");
            throw null;
        }
    }

    public static final void run$0(ARunnableS5S1100000_4 aRunnableS5S1100000_4) {
        boolean LIZ;
        try {
            Activity LJIJJ = C45804HyK.LJIJJ((Context) aRunnableS5S1100000_4.l1);
            if (LJIJJ != null) {
                C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                c26045AKb.LJIIIZ(aRunnableS5S1100000_4.s0);
                c26045AKb.LJIIJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S1100000_4 aRunnableS5S1100000_4) {
        boolean LIZ;
        try {
            aRunnableS5S1100000_4.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS5S1100000_4 aRunnableS5S1100000_4) {
        boolean LIZ;
        try {
            VideoItemParams videoItemParams = ((VideoViewCell) aRunnableS5S1100000_4.l1).LJLLJ;
            if (videoItemParams != null) {
                videoItemParams.setEnterMethodValue(aRunnableS5S1100000_4.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS5S1100000_4 aRunnableS5S1100000_4) {
        boolean LIZ;
        try {
            if (((ProfileEditFragment) aRunnableS5S1100000_4.l1).isViewValid()) {
                ((ProfileEditFragment) aRunnableS5S1100000_4.l1).Al(false);
                C26045AKb c26045AKb = new C26045AKb((ProfileEditFragment) aRunnableS5S1100000_4.l1);
                c26045AKb.LJIIIZ(aRunnableS5S1100000_4.s0);
                c26045AKb.LJIIJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS5S1100000_4 aRunnableS5S1100000_4) {
        boolean LIZ;
        try {
            if (((ProfileEditFragment) aRunnableS5S1100000_4.l1).isViewValid()) {
                ((ProfileEditFragment) aRunnableS5S1100000_4.l1).Al(false);
                C26045AKb c26045AKb = new C26045AKb((ProfileEditFragment) aRunnableS5S1100000_4.l1);
                c26045AKb.LJIIIZ(aRunnableS5S1100000_4.s0);
                c26045AKb.LJIIJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS5S1100000_4 aRunnableS5S1100000_4) {
        boolean LIZ;
        try {
            aRunnableS5S1100000_4.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS5S1100000_4 aRunnableS5S1100000_4) {
        boolean LIZ;
        try {
            if (((ProfileEditFragment) aRunnableS5S1100000_4.l1).isViewValid()) {
                ((ProfileEditFragment) aRunnableS5S1100000_4.l1).Al(false);
                C5S1 c5s1 = new C5S1(((ProfileEditFragment) aRunnableS5S1100000_4.l1).getContext());
                c5s1.LIZLLL(aRunnableS5S1100000_4.s0);
                c5s1.LJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS5S1100000_4 aRunnableS5S1100000_4) {
        boolean LIZ;
        SlimRoom slimRoom;
        try {
            OtherProfileAvatarAssem otherProfileAvatarAssem = (OtherProfileAvatarAssem) aRunnableS5S1100000_4.l1;
            String roomData = aRunnableS5S1100000_4.s0;
            o.LJIIIZ(roomData, "roomData");
            try {
                slimRoom = (SlimRoom) C75792yF.LIZ(roomData, SlimRoom.class);
            } catch (Exception unused) {
                slimRoom = null;
            }
            otherProfileAvatarAssem.LJLLI = slimRoom;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS5S1100000_4 aRunnableS5S1100000_4) {
        boolean LIZ;
        try {
            try {
                ((InterfaceC26061AKr) aRunnableS5S1100000_4.l1).LIZIZ();
                ((InterfaceC26061AKr) aRunnableS5S1100000_4.l1).LIZ(aRunnableS5S1100000_4.s0);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS5S1100000_4 aRunnableS5S1100000_4) {
        boolean LIZ;
        try {
            C232469Ak.LIZ.LJ(aRunnableS5S1100000_4.s0, (C94I) aRunnableS5S1100000_4.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S1100000_4(C26064AKu c26064AKu, int i) {
        this.$t = i;
        this.l1 = c26064AKu;
        this.s0 = "personal_homepage";
    }

    public ARunnableS5S1100000_4(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
