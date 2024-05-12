package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui;

import X.BCW;
import X.BZI;
import X.C07840Sm;
import X.C10A;
import X.C15380j0;
import X.C15490jB;
import X.C15640jQ;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29474BhW;
import X.C32206CkU;
import X.C47121t6;
import X.C5S0;
import X.C63144OqK;
import X.CCJ;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FansClubJoinGiftDialog extends LiveDialogFragment {
    public C47121t6 LJLIL;
    public ImageView LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        int i;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCW.class)) == null || bool.booleanValue()) {
            i = R.style.abg;
        } else {
            i = R.style.abq;
        }
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwo);
        c28507BGt.LIZJ = i;
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJII = 17;
        c28507BGt.LJ = false;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Dialog dialog;
        Window window;
        Window window2;
        View decorView;
        super.onStart();
        if (this.dataChannel != null && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window.setNavigationBarColor(-16777216);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = C5S0.LIZ(310.0f);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null && (decorView = window2.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        User owner;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        BZI LIZ = C28787BRn.LIZ("livesdk_fans_club_first_join_notice");
        LIZ.LJIIZILJ();
        C29474BhW.LIZ(LIZ);
        LIZ.LJIJJ("show", "action_type");
        LIZ.LJJIIJZLJL();
        C16880lQ.LJIILLIIL((ImageView) view.findViewById(R.id.cbw), new ACListenerS25S0100000_5(this, 427));
        C47121t6 c47121t6 = (C47121t6) view.findViewById(R.id.nx);
        this.LJLIL = c47121t6;
        if (c47121t6 != null) {
            C16880lQ.LJJIIZ(c47121t6, new ACListenerS25S0100000_5(this, 428));
        }
        this.LJLILLLLZI = (ImageView) view.findViewById(R.id.a3r);
        View findViewById = view.findViewById(R.id.afs);
        View findViewById2 = view.findViewById(R.id.dt6);
        View findViewById3 = view.findViewById(R.id.agp);
        View findViewById4 = view.findViewById(R.id.fq6);
        C15490jB.LJ(findViewById, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_special_badge.png");
        C15490jB.LJ(findViewById2, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_special_gift.png");
        C15490jB.LJ(findViewById3, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_entrance_effect.png");
        C15490jB.LJ(findViewById4, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_level_up_effect.png");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || (owner = room.getOwner()) == null) {
            return;
        }
        C15640jQ.LJIIIIZZ(this.LJLILLLLZI, owner.getAvatarThumb());
        Locale locale = Locale.US;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l71);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_fa…giftpanel_popup_join_btn)");
        String LIZIZ = C63144OqK.LIZIZ(new Object[]{".", 1}, 2, locale, LJIILJJIL, "format(locale, format, *args)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LIZIZ);
        Drawable drawable = getResources().getDrawable(R.drawable.d27);
        o.LJIIIIZZ(drawable, "resources.getDrawable(R.drawable.ttlive_icon_coin)");
        Drawable mutate = drawable.mutate();
        mutate.setBounds(0, 0, C5S0.LIZ(14.0f), C5S0.LIZ(14.0f));
        C07840Sm.LIZJ(mutate, CCJ.LIZ(getContext()) ? 1 : 0);
        spannableStringBuilder.setSpan(new C32206CkU(mutate), LIZIZ.length() - 4, LIZIZ.length() - 2, 34);
        C47121t6 c47121t62 = this.LJLIL;
        if (c47121t62 == null) {
            return;
        }
        c47121t62.setText(spannableStringBuilder);
    }
}
