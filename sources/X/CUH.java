package X;

import Y.ACListenerS25S0100000_5;
import Y.IDCListenerS110S0200000_5;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenAvatarHiddenSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreNameMaxLengthSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreUserNameColorSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;
import uw.c0;
import zw.c;

/* loaded from: classes6.dex */
public abstract class CUH<MODEL extends c0<? extends CR6>, PINNED_MODEL extends c<MODEL>> extends CUL<MODEL, PINNED_MODEL> {
    public final int LJLJI;
    public MODEL LJLJJI;
    public CR6 LJLJJL;
    public CS6 LJLJJLL;
    public PINNED_MODEL LJLJL;
    public final boolean LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final boolean LJLLI;
    public boolean LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final AqS171S0100000_5 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C5H3 LJZL;
    public final ImageView LL;

    public abstract C74074T5i V();

    public abstract View X();

    public String a0() {
        return "report_message";
    }

    public final C31458CWg P() {
        return (C31458CWg) this.LJLLLLLL.getValue();
    }

    public final C31459CWh Q() {
        return (C31459CWh) this.LJZI.getValue();
    }

    public final C31458CWg T() {
        return (C31458CWg) this.LJZ.getValue();
    }

    public final C31458CWg Y() {
        return (C31458CWg) this.LJLZ.getValue();
    }

    public final void onHide() {
        C29306Beo.LJJLIIIJJI(this.itemView, false);
        T().LIZIZ().LJIILLIIL();
    }

    public final void show() {
        CSG csg;
        CSG csg2 = this.LJLJL;
        if (csg2 instanceof CSG) {
            csg = csg2;
        } else {
            csg = null;
        }
        if (csg != null) {
            csg.LJIIL = true;
        }
        C29306Beo.LJJLIIIJJI(this.itemView, true);
        C29306Beo.LJJLIIIJJI(this.LL, false);
    }

    public String U() {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.nnf);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_pincomment_status_review)");
        return LJIILJJIL;
    }

    public final void N(String str) {
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2;
        Boolean bool;
        String str2;
        Room room2;
        BZI LIZ = C28787BRn.LIZ("livesdk_pin_comment_platform_click");
        CQQ cqq = this.LJLIL;
        User user = null;
        if (cqq != null) {
            dataChannel = cqq.LJIIIIZZ;
        } else {
            dataChannel = null;
        }
        LIZ.LJIILLIIL(dataChannel);
        CQQ cqq2 = this.LJLIL;
        if (cqq2 != null) {
            room = cqq2.LJI;
            dataChannel2 = cqq2.LJIIIIZZ;
        } else {
            room = null;
            dataChannel2 = null;
        }
        LIZ.LJIJJ(C29841BnR.LIZIZ(room, dataChannel2), "admin_type");
        CQQ cqq3 = this.LJLIL;
        if (cqq3 != null) {
            bool = Boolean.valueOf(cqq3.LJIIZILJ);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str2, "is_extended_comment_filed");
        CQQ cqq4 = this.LJLIL;
        if (cqq4 != null) {
            room2 = cqq4.LJI;
        } else {
            room2 = null;
        }
        CS6 cs6 = this.LJLJJLL;
        if (cs6 != null) {
            user = cs6.LIZIZ;
        }
        LIZ.LJIJJ(C29841BnR.LIZ(user, room2), "pin_user");
        LIZ.LJIJJ(str, "click_type");
        LIZ.LJJIIJZLJL();
    }

    public void c0(PINNED_MODEL pinnedPublicScreenMessageModel) {
        boolean z;
        boolean z2;
        CSG csg;
        CS6 cs6;
        CS6 cs62;
        o.LJIIIZ(pinnedPublicScreenMessageModel, "pinnedPublicScreenMessageModel");
        boolean z3 = pinnedPublicScreenMessageModel instanceof CSG;
        CSG csg2 = null;
        if (z3) {
            csg2 = (CSG) pinnedPublicScreenMessageModel;
        }
        if (csg2 != null && (cs62 = csg2.LJIIIZ) != null) {
            z = cs62.LJ;
        } else {
            z = false;
        }
        if (z3 && (csg = (CSG) pinnedPublicScreenMessageModel) != null && (cs6 = csg.LJIIIZ) != null) {
            z2 = cs6.LIZJ;
        } else {
            z2 = false;
        }
        this.LJLLILLLL = z2;
        if (z) {
            if (!z2) {
                C29306Beo.LJJLIIIJJI((View) this.LJZL.getValue(), true);
                return;
            }
            View view = (View) this.LJZL.getValue();
            if (view == null) {
                return;
            }
            view.setVisibility(4);
            return;
        }
        if (z2) {
            View view2 = (View) this.LJZL.getValue();
            if (view2 == null) {
                return;
            }
            view2.setVisibility(4);
            return;
        }
        C29306Beo.LJJLIIIJJI((View) this.LJZL.getValue(), false);
    }

    public CUH(View view, CQQ cqq) {
        super(view, cqq);
        boolean z;
        this.LJLJI = C15380j0.LIZ(16.0f);
        this.LJLJLJ = LivePublicScreenSpaceExploreSetting.INSTANCE.optEnable();
        this.LJLJLLL = LivePublicScreenSpaceExploreUserNameColorSetting.INSTANCE.getNameColor();
        this.LJLL = LivePublicScreenSpaceExploreNameMaxLengthSetting.INSTANCE.getNameMaxLength();
        if (LivePublicScreenAvatarHiddenSetting.getValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLI = z;
        this.LJLLJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 18));
        this.LJLLL = C221108m2.LIZIZ(CUS.INSTANCE);
        this.LJLLLL = new AqS171S0100000_5(this, 33);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS94S0300000_5(view, cqq, this, 2));
        this.LJLZ = C221108m2.LIZIZ(new AqS152S0200000_5(view, cqq, 2));
        this.LJZ = C221108m2.LIZIZ(new AqS94S0300000_5(view, cqq, this, 4));
        this.LJZI = C221108m2.LIZIZ(new AqS94S0300000_5(view, cqq, this, 3));
        this.LJZL = C78996UzQ.LJJIJIIJI(new AqS94S0300000_5(view, cqq, this, 1));
        ImageView imageView = (ImageView) view.findViewById(R.id.hpu);
        C16880lQ.LJIILLIIL(imageView, new ACListenerS25S0100000_5(this, 15));
        this.LL = imageView;
        if (!(this instanceof CV1)) {
            ((AbstractC019505v) view.findViewById(R.id.j2h)).setReferencedIds(new int[]{R.id.bfx, R.id.hpu});
        }
        view.setOnLongClickListener(new IDCListenerS110S0200000_5(cqq, this, 0));
    }

    @Override // X.CUL
    public void M(PINNED_MODEL pinnedModel, List<? extends Object> payloads) {
        boolean z;
        CSG csg;
        CS6 cs6;
        CSG csg2;
        CSG csg3;
        CS6 cs62;
        o.LJIIIZ(pinnedModel, "pinnedModel");
        o.LJIIIZ(payloads, "payloads");
        super.M(pinnedModel, payloads);
        if (!o.LJ(this.LJLJL, pinnedModel) && !pinnedModel.LJ) {
            ((Handler) this.LJLLL.getValue()).removeCallbacks((Runnable) this.LJLLJ.getValue());
        }
        pinnedModel.LIZLLL++;
        this.LJLJL = pinnedModel;
        this.LJLJJI = (CQO) pinnedModel.LIZ();
        this.LJLJJL = ((CQO) pinnedModel.LIZ()).LJIJJLI;
        boolean z2 = pinnedModel instanceof CSG;
        CS6 cs63 = null;
        if (z2 && (csg3 = (CSG) pinnedModel) != null && (cs62 = csg3.LJIIIZ) != null) {
            z = cs62.LIZJ;
        } else {
            z = false;
        }
        this.LJLLILLLL = z;
        if (z2) {
            if (z2 && (csg2 = (CSG) pinnedModel) != null) {
                cs63 = csg2.LJIIIZ;
            }
        }
        this.LJLJJLL = cs63;
        if (z2 && (csg = (CSG) pinnedModel) != null && (cs6 = csg.LJIIIZ) != null) {
            long LIZ = cs6.LIZ();
            if (LIZ != -1) {
                String time = String.valueOf(LIZ);
                o.LJIIIZ(time, "time");
                C31458CWg P = P();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(time);
                LIZ2.append('s');
                String text = X1D.LIZIZ(LIZ2);
                P.getClass();
                o.LJIIIZ(text, "text");
                if (P.LIZIZ().LJJL != 0) {
                    P.LIZIZ().LJJJZ = text;
                    P.LIZIZ().LIZIZ = -1;
                }
                X().requestLayout();
                X().invalidate();
            }
        }
    }
}
