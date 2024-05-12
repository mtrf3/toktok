package com.bytedance.android.livesdk.usercard.profilev3;

import X.B83;
import X.C05170If;
import X.C10A;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C28507BGt;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29506Bi2;
import X.C47061t0;
import X.C47121t6;
import X.C61712OJw;
import X.C61713OJx;
import X.C76800UCe;
import X.C78720Uuy;
import X.InterfaceC28822BSw;
import X.InterfaceC29405BgP;
import X.InterfaceC29502Bhy;
import X.InterfaceC65784Pro;
import Y.ACListenerS25S0100000_5;
import Y.AfS44S0300000_5;
import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveNickNameFontOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import q03.IDaS485S0100000_5;

/* loaded from: classes6.dex */
public final class TryModeLiveProfileDialog extends LiveDialogFragment implements InterfaceC28822BSw, InterfaceC29502Bhy {
    public long LJLIL;
    public User LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public C47061t0 LJLJJLL;
    public C47121t6 LJLJL;
    public C47121t6 LJLJLJ;
    public C47121t6 LJLJLLL;
    public C47121t6 LJLL;
    public C47121t6 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cym);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LIZJ = R.style.rt;
        c28507BGt.LJIILIIL = 3;
        c28507BGt.LJI = 0.0f;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(UserProfileShowingChannel.class, Boolean.TRUE);
        }
        return c28507BGt;
    }

    public final void wl() {
        View view = this.LJLJJI;
        if (view != null) {
            if (C29306Beo.LJJIIJ(view)) {
                View view2 = this.LJLJJI;
                if (view2 != null) {
                    C29306Beo.LJI(view2);
                } else {
                    o.LJIJI("loadingLayout");
                    throw null;
                }
            }
            View view3 = this.LJLJJL;
            if (view3 != null) {
                C29306Beo.LJJLJLI(view3);
                return;
            } else {
                o.LJIJI("layoutError");
                throw null;
            }
        }
        o.LJIJI("loadingLayout");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        if (C29306Beo.LIZIZ(getContext()) != null) {
            C61713OJx LIZ = C61712OJw.LIZ(this);
            LIZ.LIZIZ(false, false);
            LIZ.LIZIZ.LJIIL();
            LIZ.LJFF(-16777216);
            LIZ.LIZIZ.LJII(false);
            LIZ.LIZJ();
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    public final void vl(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        User user = this.LJLILLLLZI;
        if (user != null && user.getId() == ((C29374Bfu) LIZIZ).LJ().getId()) {
            C29374Bfu c29374Bfu = (C29374Bfu) LIZIZ;
            c29374Bfu.LJIJJLI().LJJII(new AfS44S0300000_5(interfaceC65784Pro, this, c29374Bfu, 2), C29506Bi2.LJLIL);
        } else {
            ((C29374Bfu) LIZIZ).LJIILL(this.LJLIL, "try mode fetch moderator's User").LJJII(new AfS54S0200000_5(this, interfaceC65784Pro, 26), new AfS57S0100000_5(this, 167));
        }
    }

    public final void xl(User user) {
        long j;
        String bioText;
        int i;
        float f;
        C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(user.getAvatarThumb());
        LJIIIZ.LIZLLL(ImageView.ScaleType.FIT_CENTER);
        LJIIIZ.LJIIJJI(this.LJLJJLL);
        String LIZLLL = C05170If.LIZLLL(user);
        if (LiveNickNameFontOptSetting.INSTANCE.enableOptFont()) {
            if (((int) C15380j0.LJIJ(C15380j0.LJIIL())) < 375) {
                i = 10;
            } else {
                i = 15;
            }
            C47121t6 c47121t6 = this.LJLJL;
            if (c47121t6 != null) {
                if (LIZLLL.length() <= i) {
                    f = 24.0f;
                } else {
                    f = 20.0f;
                }
                c47121t6.setTextSize(f);
            }
        }
        C47121t6 c47121t62 = this.LJLJL;
        if (c47121t62 != null) {
            c47121t62.setText(C05170If.LIZLLL(user));
        }
        C47121t6 c47121t63 = this.LJLJLJ;
        if (c47121t63 != null) {
            c47121t63.setText(C05170If.LJ(user));
        }
        C47121t6 c47121t64 = this.LJLJLLL;
        long j2 = 0;
        if (c47121t64 != null) {
            FollowInfo followInfo = user.getFollowInfo();
            if (followInfo != null) {
                j = followInfo.getFollowerCount();
            } else {
                j = 0;
            }
            c47121t64.setText(b.LJIILLIIL(j));
        }
        C47121t6 c47121t65 = this.LJLL;
        if (c47121t65 != null) {
            FollowInfo followInfo2 = user.getFollowInfo();
            if (followInfo2 != null) {
                j2 = followInfo2.getFollowingCount();
            }
            c47121t65.setText(b.LJIILLIIL(j2));
        }
        if (!TextUtils.isEmpty(user.getAutoGraph())) {
            bioText = user.getAutoGraph();
        } else {
            bioText = C15380j0.LJIILJJIL(R.string.spl);
        }
        C47121t6 c47121t66 = this.LJLLI;
        if (c47121t66 == null) {
            return;
        }
        o.LJIIIIZZ(bioText, "bioText");
        c47121t66.setText(ujb.o.LJJJJZ(bioText, "\n", " ", false));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        View findViewById = view.findViewById(R.id.liz);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, LiveCoverMinSizeSetting.DEFAULT), findViewById);
        }
        View findViewById2 = view.findViewById(R.id.g25);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.ll_cell_container)");
        this.LJLJI = findViewById2;
        View findViewById3 = view.findViewById(R.id.deo);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.fl_loading_progress)");
        this.LJLJJI = findViewById3;
        if (this.LJLILLLLZI != null) {
            C29306Beo.LJI(findViewById3);
        }
        View findViewById4 = view.findViewById(R.id.g3_);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.ll_error)");
        this.LJLJJL = findViewById4;
        View findViewById5 = view.findViewById(R.id.fo1);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.lb_retry)");
        C16880lQ.LJIIJ(new IDaS485S0100000_5(this, 4), findViewById5);
        this.LJLJJLL = (C47061t0) view.findViewById(R.id.abh);
        this.LJLJL = (C47121t6) view.findViewById(R.id.h1_);
        this.LJLJLJ = (C47121t6) view.findViewById(R.id.mzt);
        this.LJLJLLL = (C47121t6) view.findViewById(R.id.dl4);
        this.LJLL = (C47121t6) view.findViewById(R.id.dle);
        this.LJLLI = (C47121t6) view.findViewById(R.id.h9r);
        User user = this.LJLILLLLZI;
        if (user != null) {
            xl(user);
            vl(null);
            return;
        }
        View view2 = this.LJLJI;
        if (view2 != null) {
            C29306Beo.LJI(view2);
            View view3 = this.LJLJJI;
            if (view3 != null) {
                C29306Beo.LJJLJLI(view3);
                vl(new AqS155S0100000_5(this, 459));
                return;
            } else {
                o.LJIJI("loadingLayout");
                throw null;
            }
        }
        o.LJIJI("contentLayout");
        throw null;
    }
}
