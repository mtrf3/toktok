package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui;

import X.B8F;
import X.BCW;
import X.BYC;
import X.BYF;
import X.BZI;
import X.C05170If;
import X.C05590Jv;
import X.C07840Sm;
import X.C15380j0;
import X.C15490jB;
import X.C15640jQ;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29474BhW;
import X.C32206CkU;
import X.C32364Cn2;
import X.C47121t6;
import X.C63144OqK;
import X.C76800UCe;
import X.CCJ;
import X.CN1;
import X.InterfaceC06390Mx;
import X.InterfaceC64592gB;
import X.Q7L;
import X.Q8U;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.T28;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubActivityBannerSwitchSetting;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FansClubJoinDialog extends LiveDialogFragment {
    public C47121t6 LJLIL;
    public ImageView LJLILLLLZI;
    public LinearLayout LJLJI;
    public C47121t6 LJLJJI;
    public FrameLayout LJLJJL;
    public C47121t6 LJLJJLL;
    public FrameLayout LJLJL;
    public C47121t6 LJLJLJ;
    public C47121t6 LJLJLLL;
    public C47121t6 LJLL;
    public ImageView LJLLI;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public String LJLLILLLL = "";
    public long LJLLJ = -1;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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
            i = R.style.abh;
        } else {
            i = R.style.abq;
        }
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwn);
        c28507BGt.LIZJ = i;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJII = 80;
        return c28507BGt;
    }

    public final String vl(long j) {
        if (j >= 1000000) {
            long j2 = 1 * j;
            if (j > 999000000) {
                j2 = 999000000;
            }
            String LIZIZ = Q8U.LIZIZ(new Object[]{Double.valueOf((j2 * 1.0d) / 1000000)}, 1, "%.3f", "format(format, *args)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(wl(LIZIZ));
            LIZ.append('M');
            return X1D.LIZIZ(LIZ);
        }
        if (j >= 1000) {
            String LIZIZ2 = Q8U.LIZIZ(new Object[]{Double.valueOf((j * 1.0d) / 1000)}, 1, "%.3f", "format(format, *args)");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(wl(LIZIZ2));
            LIZ2.append('K');
            return X1D.LIZIZ(LIZ2);
        }
        return String.valueOf(j);
    }

    public final String wl(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 3) {
            String substring = str.substring(0, 4);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (ujb.o.LJJJJ(substring, ".", false)) {
                String substring2 = substring.substring(0, 3);
                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring2;
            }
            return substring;
        }
        return str;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        boolean z;
        Room room;
        User owner;
        FrameLayout frameLayout;
        Room room2;
        User owner2;
        String secUid;
        Boolean bool;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 426), view.findViewById(R.id.cbw));
        this.LJLJI = (LinearLayout) view.findViewById(R.id.leu);
        this.LJLJJLL = (C47121t6) view.findViewById(R.id.d4j);
        this.LJLJJL = (FrameLayout) view.findViewById(R.id.p7);
        this.LJLIL = (C47121t6) view.findViewById(R.id.nx);
        this.LJLJLJ = (C47121t6) view.findViewById(R.id.d4h);
        this.LJLILLLLZI = (ImageView) view.findViewById(R.id.a3r);
        this.LJLJL = (FrameLayout) view.findViewById(R.id.bye);
        this.LJLJLLL = (C47121t6) view.findViewById(R.id.a25);
        this.LJLL = (C47121t6) view.findViewById(R.id.a9r);
        this.LJLJJI = (C47121t6) view.findViewById(R.id.les);
        this.LJLLI = (ImageView) view.findViewById(R.id.ijg);
        if (FansClubActivityBannerSwitchSetting.INSTANCE.getValue()) {
            FrameLayout frameLayout2 = this.LJLJJL;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            C47121t6 c47121t6 = this.LJLJJLL;
            if (c47121t6 != null) {
                int LIZ = C15380j0.LIZ(12.0f);
                ViewGroup.LayoutParams layoutParams = c47121t6.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.topMargin = LIZ;
                }
            }
        } else {
            FrameLayout frameLayout3 = this.LJLJJL;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8);
            }
            C47121t6 c47121t62 = this.LJLJJLL;
            if (c47121t62 != null) {
                int LIZ2 = C15380j0.LIZ(112.0f);
                ViewGroup.LayoutParams layoutParams2 = c47121t62.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.topMargin = LIZ2;
                }
            }
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2("aweme://roma_redirect/");
        c32364Cn2.LIZJ("roma_group_key", "roma_schema_group_fans_level_main");
        c32364Cn2.LIZJ("roma_page_key", "roma_schema_page_campaign_banner");
        String url = c32364Cn2.LIZLLL();
        Context context = getContext();
        if (context != null) {
            InterfaceC06390Mx LIZ3 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ3, "getService(IHybridContainerService::class.java)");
            o.LJIIIIZZ(url, "url");
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = C05590Jv.LIZIZ((IHybridContainerService) LIZ3, context, url, false, BYC.LJLIL, 4);
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        }
        FrameLayout frameLayout4 = this.LJLJJL;
        if (frameLayout4 != null) {
            frameLayout4.addView(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, -1, -1);
        }
        View findViewById = view.findViewById(R.id.afs);
        View findViewById2 = view.findViewById(R.id.dt6);
        View findViewById3 = view.findViewById(R.id.agp);
        View findViewById4 = view.findViewById(R.id.fq6);
        View findViewById5 = view.findViewById(R.id.af5);
        C15490jB.LJ(findViewById, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_special_badge.png");
        C15490jB.LJ(findViewById2, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_special_gift.png");
        C15490jB.LJ(findViewById3, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_entrance_effect.png");
        C15490jB.LJ(findViewById4, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_level_up_effect.png");
        C15490jB.LJFF(findViewById5, "tiktok_live_fans_club_entrance", "ttlive_bg_fans_club_join_dialog.png", ImageView.ScaleType.FIT_XY, null);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (room = (Room) dataChannel2.kv0(RoomChannel.class)) == null || (owner = room.getOwner()) == null) {
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(C05170If.LIZ(owner));
        C15640jQ.LJIIIIZZ(this.LJLILLLLZI, owner.getAvatarThumb());
        LIZ4.append(C76800UCe.LIZ);
        X1D.LIZIZ(LIZ4);
        if (z) {
            C47121t6 c47121t63 = this.LJLJLLL;
            if (c47121t63 != null) {
                c47121t63.setVisibility(0);
            }
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            C47121t6 c47121t64 = this.LJLL;
            if (c47121t64 != null) {
                c47121t64.setVisibility(8);
            }
            C47121t6 c47121t65 = this.LJLIL;
            if (c47121t65 != null) {
                c47121t65.setText(C15380j0.LJIILJJIL(R.string.l7s));
            }
            C47121t6 c47121t66 = this.LJLJLJ;
            if (c47121t66 != null) {
                c47121t66.setText(C15380j0.LJIILJJIL(R.string.l80));
            }
            C47121t6 c47121t67 = this.LJLJJLL;
            if (c47121t67 != null) {
                c47121t67.setText(C15380j0.LJIILJJIL(R.string.l7z));
            }
            C47121t6 c47121t68 = this.LJLJLLL;
            if (c47121t68 != null) {
                c47121t68.setText(C15380j0.LJIILJJIL(R.string.l7t));
            }
            ImageView imageView = this.LJLLI;
            if (imageView != null) {
                C16880lQ.LJIILLIIL(imageView, new ACListenerS25S0100000_5(this, 421));
            }
            C47121t6 c47121t69 = this.LJLIL;
            if (c47121t69 != null) {
                C16880lQ.LJJIIZ(c47121t69, new ACListenerS25S0100000_5(this, 422));
            }
            BZI LIZ5 = C28787BRn.LIZ("livesdk_anchor_fans_club_first_guide");
            LIZ5.LJIIZILJ();
            C29474BhW.LIZ(LIZ5);
            LIZ5.LJIJJ("show", "action_type");
            LIZ5.LJJIIJZLJL();
            return;
        }
        if (this.LJLLJ >= 0) {
            LinearLayout linearLayout2 = this.LJLJI;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            String valueOf = String.valueOf(this.LJLLJ);
            try {
                valueOf = vl(this.LJLLJ);
            } catch (Exception unused) {
            }
            C47121t6 c47121t610 = this.LJLJJI;
            if (c47121t610 != null) {
                c47121t610.setText(C15380j0.LJIIIIZZ(R.plurals.l3, (int) this.LJLLJ, valueOf));
            }
        } else {
            LinearLayout linearLayout3 = this.LJLJI;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (room2 = (Room) dataChannel3.kv0(RoomChannel.class)) != null && (owner2 = room2.getOwner()) != null && (secUid = owner2.getSecUid()) != null) {
            T28.LIZLLL(((FansClubApi) Q7L.LIZIZ(FansClubApi.class)).getTaskInfo(secUid)).LJJII(new AfS57S0100000_5(this, 335), new InterfaceC64592gB() { // from class: X.9Dd
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        LinearLayout linearLayout4 = this.LJLJI;
        if (linearLayout4 != null) {
            C16880lQ.LJIIZILJ(linearLayout4, new ACListenerS25S0100000_5(this, 423));
        }
        ImageView imageView2 = this.LJLLI;
        if (imageView2 != null) {
            C16880lQ.LJIILLIIL(imageView2, new ACListenerS25S0100000_5(this, 424));
        }
        View generateCPCTopView = ((IGiftService) CN1.LIZ(IGiftService.class)).generateCPCTopView(getContext(), BYF.LJLIL);
        if (generateCPCTopView != null && (frameLayout = this.LJLJL) != null) {
            frameLayout.addView(generateCPCTopView);
        }
        C47121t6 c47121t611 = this.LJLJLLL;
        if (c47121t611 != null) {
            c47121t611.setVisibility(8);
        }
        C47121t6 c47121t612 = this.LJLL;
        if (c47121t612 != null) {
            c47121t612.setVisibility(0);
        }
        C47121t6 c47121t613 = this.LJLL;
        if (c47121t613 != null) {
            c47121t613.setText(C15380j0.LJIILJJIL(R.string.l6t));
        }
        C47121t6 c47121t614 = this.LJLJLJ;
        if (c47121t614 != null) {
            c47121t614.setText(C15380j0.LJIILL(R.string.l7b, C05170If.LIZ(owner)));
        }
        C47121t6 c47121t615 = this.LJLJJLL;
        if (c47121t615 != null) {
            c47121t615.setText(C15380j0.LJIILJJIL(R.string.l7q));
        }
        Locale locale = Locale.US;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l7r);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_fan_send_join_btn)");
        String LIZIZ = C63144OqK.LIZIZ(new Object[]{".", 1}, 2, locale, LJIILJJIL, "format(locale, format, *args)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LIZIZ);
        Drawable drawable = getResources().getDrawable(R.drawable.d27);
        o.LJIIIIZZ(drawable, "resources.getDrawable(R.drawable.ttlive_icon_coin)");
        Drawable mutate = drawable.mutate();
        mutate.setBounds(0, 0, C15380j0.LIZ(14.0f), C15380j0.LIZ(14.0f));
        C07840Sm.LIZJ(mutate, CCJ.LIZ(getContext()) ? 1 : 0);
        spannableStringBuilder.setSpan(new C32206CkU(mutate), LIZIZ.length() - 4, LIZIZ.length() - 2, 34);
        C47121t6 c47121t616 = this.LJLIL;
        if (c47121t616 != null) {
            c47121t616.setText(spannableStringBuilder);
        }
        if (((IGiftService) CN1.LIZ(IGiftService.class)).isFansCLubGiftLimited(this.dataChannel)) {
            C47121t6 c47121t617 = this.LJLIL;
            if (c47121t617 != null) {
                c47121t617.setBackground(C15380j0.LJI(R.drawable.cdg));
            }
            C47121t6 c47121t618 = this.LJLIL;
            if (c47121t618 != null) {
                C16880lQ.LJJIIZ(c47121t618, B8F.LJLIL);
            }
        } else {
            C47121t6 c47121t619 = this.LJLIL;
            if (c47121t619 != null) {
                C16880lQ.LJJIIZ(c47121t619, new ACListenerS25S0100000_5(this, 425));
            }
        }
        C29474BhW.LIZJ("show", this.LJLLILLLL);
    }
}
