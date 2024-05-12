package com.ss.android.ugc.aweme.profile.ui;

import X.AI8;
import X.ARI;
import X.ActivityC45651qj;
import X.AnonymousClass078;
import X.C119634ml;
import X.C16880lQ;
import X.C188727au;
import X.C1A7;
import X.C244309iM;
import X.C244369iS;
import X.C244379iT;
import X.C244389iU;
import X.C244399iV;
import X.C244409iW;
import X.C244419iX;
import X.C244449ia;
import X.C255199zv;
import X.C26227ARb;
import X.C26356AWa;
import X.C2U8;
import X.C35936E8m;
import X.C38306F1q;
import X.C38333F2r;
import X.C38891fp;
import X.C5S1;
import X.C62846OlW;
import X.C72433Sbl;
import X.C72434Sbm;
import X.C73040SlY;
import X.C73318Sq2;
import X.C78598Ut0;
import X.C78765Uvh;
import X.C85940Xo8;
import X.C9TY;
import X.C9VE;
import X.EF7;
import X.EnumC244439iZ;
import X.FMX;
import X.HG3;
import X.InterfaceC252619vl;
import X.InterfaceC26315AUl;
import X.KL2;
import X.RBX;
import X.STD;
import X.STO;
import X.T5U;
import Y.ACListenerS24S0100000_4;
import Y.ACallableS82S0200000_4;
import Y.ARunnableS8S0400000_4;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.edit.AvatarVideoPresenter;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class MusProfileEditFragment extends ProfileEditFragment implements InterfaceC26315AUl, InterfaceC252619vl {
    public static final /* synthetic */ int LLLIIII = 0;
    public RelativeLayout LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public RelativeLayout LLJJL;
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public C119634ml LLJL;
    public TuxIconView LLJLIL;
    public C72434Sbm LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public C72434Sbm LLJLLIL;
    public AvatarVideoPresenter LLJLLL;
    public boolean LLJZIJLIL;
    public View LLLFF;
    public View LLLFFI;
    public TuxSheet LLLFZ;
    public final Map<Integer, View> LLLII = new LinkedHashMap();
    public boolean LLJZ = true;
    public final C73318Sq2 LLL = new C73318Sq2();
    public final Set<String> LLLF = new HashSet();
    public final C244449ia LLLI = new STO() { // from class: X.9ia
        @Override // X.STO
        public void onUpdate(ST8 callback) {
            o.LJIIIZ(callback, "callback");
            MusProfileEditFragment musProfileEditFragment = MusProfileEditFragment.this;
            if (musProfileEditFragment.LLILZ || musProfileEditFragment.LLILZIL || !C26356AWa.LIZ()) {
                MusProfileEditFragment.this.Ym().setVisibility(8);
                return;
            }
            C244459ib LIZ = ST7.LIZ(callback);
            MusProfileEditFragment musProfileEditFragment2 = MusProfileEditFragment.this;
            musProfileEditFragment2.LLL.LIZ(AbstractC73547Stj.LJI(new ACallableS82S0200000_4(musProfileEditFragment2, LIZ, 0)).LJIILIIL(C73969T1h.LIZIZ()).LJIIJJI());
        }
    };

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLLII).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLLII;
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

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void Vm() {
        if (this.LLILZ) {
            ConstraintLayout constraintLayout = this.LLJJLIIIJLLLLLLLZ;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
                TuxTextView tuxTextView = this.LLJJJJLIIL;
                if (tuxTextView != null) {
                    tuxTextView.setTuxFont(62);
                    TuxTextView tuxTextView2 = this.LLJJJJLIIL;
                    if (tuxTextView2 != null) {
                        C16880lQ.LJJJJI(tuxTextView2, new ACListenerS24S0100000_4(this, 119));
                        RelativeLayout relativeLayout = this.LLJJL;
                        if (relativeLayout != null) {
                            relativeLayout.setAlpha(0.34f);
                            RelativeLayout relativeLayout2 = this.LLJJJJJIL;
                            if (relativeLayout2 != null) {
                                relativeLayout2.setAlpha(0.34f);
                            }
                            Nl().setAlpha(0.34f);
                            Xl().setAlpha(0.34f);
                            Kl().setAlpha(0.34f);
                            AI8 ai8 = this.LL;
                            if (ai8 != null) {
                                ai8.setAlpha(0.34f);
                            }
                            cm().setAlpha(0.34f);
                            FMX.LJIIL("tns_ags_float_profile_ban", new C35936E8m().LIZ);
                            return;
                        }
                        o.LJIJI("changeAvatarPhoto");
                        throw null;
                    }
                    o.LJIJI("viewDetails");
                    throw null;
                }
                o.LJIJI("viewDetails");
                throw null;
            }
            o.LJIJI("bannedHint");
            throw null;
        }
        ConstraintLayout constraintLayout2 = this.LLJJLIIIJLLLLLLLZ;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
            RelativeLayout relativeLayout3 = this.LLJJL;
            if (relativeLayout3 != null) {
                relativeLayout3.setAlpha(1.0f);
                RelativeLayout relativeLayout4 = this.LLJJJJJIL;
                if (relativeLayout4 != null) {
                    relativeLayout4.setAlpha(1.0f);
                }
                Nl().setAlpha(1.0f);
                Xl().setAlpha(1.0f);
                Kl().setAlpha(1.0f);
                AI8 ai82 = this.LL;
                if (ai82 != null) {
                    ai82.setAlpha(1.0f);
                }
                cm().setAlpha(1.0f);
                return;
            }
            o.LJIJI("changeAvatarPhoto");
            throw null;
        }
        o.LJIJI("bannedHint");
        throw null;
    }

    public final View Ym() {
        View view = this.LLLFF;
        if (view != null) {
            return view;
        }
        o.LJIJI("aigcBanner");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Vm();
        if (C26356AWa.LIZ() && this.LLJIJIL && !C244419iX.LIZIZ().getBoolean(C9TY.LIZ("has_shown_notification_permission"), false)) {
            String[] timestamps = C244419iX.LIZIZ().getStringArray(C9TY.LIZ("shown_notification_timestamp_array"), new String[0]);
            ArrayList arrayList = new ArrayList();
            o.LJIIIIZZ(timestamps, "timestamps");
            for (String timestamp : timestamps) {
                o.LJIIIIZZ(timestamp, "timestamp");
                if (((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 86400000) - ((CastLongProtector.parseLong(timestamp) + TimeZone.getDefault().getRawOffset()) / 86400000) < 7) {
                    arrayList.add(timestamp);
                }
            }
            if (arrayList.size() < 3) {
                if (!new AnonymousClass078(requireContext()).LIZIZ()) {
                    C244419iX.LIZIZ().storeBoolean(C9TY.LIZ("has_shown_notification_permission"), true);
                    C244419iX.LIZ();
                    ActivityC45651qj requireActivity = requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    ARI ari = new ARI(requireActivity);
                    STD.LJII("normal");
                    ari.LJI(R.string.cq, new AqS170S0100000_4(this, 569));
                    ari.LJIIIIZZ(R.string.cr, C244399iV.LJLIL);
                    Context requireContext = requireContext();
                    o.LJIIIIZZ(requireContext, "requireContext()");
                    C26227ARb c26227ARb = new C26227ARb(requireContext);
                    c26227ARb.LIZ(R.string.cp);
                    c26227ARb.LJIIL = ari;
                    c26227ARb.LJI().LIZLLL();
                    return;
                }
                PushSettings LJ = C85940Xo8.LIZIZ.LJ();
                if (LJ == null || LJ.otherChannel != 0) {
                    return;
                }
                C244419iX.LIZIZ().storeBoolean(C9TY.LIZ("has_shown_notification_permission"), true);
                C244419iX.LIZ();
                ActivityC45651qj requireActivity2 = requireActivity();
                o.LJIIIIZZ(requireActivity2, "requireActivity()");
                ARI ari2 = new ARI(requireActivity2);
                STD.LJII("toggle");
                ari2.LJI(R.string.cu, new AqS170S0100000_4(this, 570));
                ari2.LJIIIIZZ(R.string.cv, C244409iW.LJLIL);
                Context requireContext2 = requireContext();
                o.LJIIIIZZ(requireContext2, "requireContext()");
                String string = requireContext2.getString(R.string.ct);
                o.LJIIIIZZ(string, "context\n            .get…ng(placeholderResourceId)");
                String string2 = requireContext2.getString(R.string.cs, string);
                o.LJIIIIZZ(string2, "context.getString(fullResourceId, placeholder)");
                int LJJLIIIJL = s.LJJLIIIJL(string2, string, 0, false, 6);
                if (LJJLIIIJL != -1) {
                    SpannableString spannableString = new SpannableString(string2);
                    spannableString.setSpan(new T5U(33, false), LJJLIIIJL, string.length() + LJJLIIIJL, 18);
                    string2 = spannableString.toString();
                    o.LJIIIIZZ(string2, "{\n            val spanna…able.toString()\n        }");
                }
                Context requireContext3 = requireContext();
                o.LJIIIIZZ(requireContext3, "requireContext()");
                C26227ARb c26227ARb2 = new C26227ARb(requireContext3);
                c26227ARb2.LIZIZ(string2);
                c26227ARb2.LJIIL = ari2;
                c26227ARb2.LJI().LIZLLL();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment
    public final int Ol() {
        if (Sl()) {
            return R.layout.c51;
        }
        if (Ql()) {
            return R.layout.c50;
        }
        return R.layout.c65;
    }

    public final void Xm() {
        User curUser;
        String str;
        View view;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - C244389iU.LIZ;
        C244389iU.LIZ = currentTimeMillis;
        int i = 0;
        if ((j > 0 && j < 650) || (curUser = ((RBX) HG3.LJIILL()).getCurUser()) == null || this.LLILZ) {
            return;
        }
        UrlModel avatarVideoUri = curUser.getAvatarVideoUri();
        if (avatarVideoUri != null) {
            str = avatarVideoUri.getUri();
        } else {
            str = null;
        }
        if (Rl()) {
            if (getUser().naviId != null) {
                i = 1;
            }
            C244309iM.LJI(i, "replace_profile_video", "video");
        }
        if (TextUtils.isEmpty(str)) {
            AvatarVideoPresenter avatarVideoPresenter = this.LLJLLL;
            if (avatarVideoPresenter != null) {
                avatarVideoPresenter.toSelectVideo();
                return;
            } else {
                o.LJIJI("avatarVideoPresenter");
                throw null;
            }
        }
        View view2 = this.LLLFFI;
        if (view2 == null || !Pl() || (view = view2.findViewById(R.id.n4g)) == null) {
            view = this.LLJL;
        }
        AvatarVideoPresenter avatarVideoPresenter2 = this.LLJLLL;
        if (avatarVideoPresenter2 != null) {
            avatarVideoPresenter2.onClickAvatarVideo(view);
        } else {
            o.LJIJI("avatarVideoPresenter");
            throw null;
        }
    }

    @Override // X.InterfaceC26315AUl
    public final void fT() {
        TuxSheet tuxSheet;
        Wl();
        C244379iT Wl = Wl();
        Wl.LJ = TextUtils.isEmpty("");
        Wl.LIZLLL = "";
        Yl().updateUserInfo(Wl().LIZ());
        if (Pl() && (tuxSheet = this.LLLFZ) != null) {
            tuxSheet.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment
    public final void initData() {
        int i;
        super.initData();
        RelativeLayout relativeLayout = this.LLJJJJJIL;
        if (relativeLayout != null) {
            User user = getUser();
            if (((user.getAvatarThumb() == null || C38891fp.LJJI(user.getAvatarThumb().getUrlList())) && ((user.getAvatarMedium() == null || C38891fp.LJJI(user.getAvatarMedium().getUrlList())) && (user.getAvatarLarger() == null || C38891fp.LJJI(user.getAvatarLarger().getUrlList())))) || ((user.getAvatarThumb() != null && !C38891fp.LJJI(user.getAvatarThumb().getUrlList()) && ((String) ListProtector.get(user.getAvatarThumb().getUrlList(), 0)).contains("1594805258216454")) || FunctionSupportService.INSTANCE.notSupport(IFunctionKey.PROFILE_VIDEO_HEAD))) {
                i = 8;
            } else {
                i = 0;
            }
            relativeLayout.setVisibility(i);
        }
        C119634ml c119634ml = this.LLJL;
        if (c119634ml != null && c119634ml.getVisibility() == 0) {
            C78765Uvh.LIZLLL(this.LLJL, getUser().getAvatarVideoUri());
        }
        hn(getUser(), false);
        dn(getUser(), false);
        if (this.LLJZ) {
            this.LLJZ = false;
            C188727au c188727au = this.LJLJJL;
            if (c188727au != null) {
                c188727au.LJIIIZ("event_type", "enter");
                FMX.LJIIL("profile_edit_status", c188727au.LIZ);
            }
        }
        Vm();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        HG3.LJIILL().removeUserChangeListener(this);
        this.LLL.LIZLLL();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        AIGCAvatarServiceImpl.LJIILL().LIZJ(EnumC244439iZ.SOCIAL, this.LLLI);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        AIGCAvatarServiceImpl.LJIILL().LIZLLL(EnumC244439iZ.SOCIAL, this.LLLI);
        ((HashSet) this.LLLF).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment, X.InterfaceC26189APp
    public final void FI(boolean z) {
        if (z) {
            AvatarVideoPresenter avatarVideoPresenter = this.LLJLLL;
            if (avatarVideoPresenter != null) {
                if (avatarVideoPresenter.isRemovedVideoIcon()) {
                    C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                    c5s1.LIZJ(R.string.pgb);
                    c5s1.LJ();
                    AvatarVideoPresenter avatarVideoPresenter2 = this.LLJLLL;
                    if (avatarVideoPresenter2 != null) {
                        avatarVideoPresenter2.setIsRemovedVideoIcon(Boolean.FALSE);
                        C2U8.LIZ(new C9VE());
                        return;
                    } else {
                        o.LJIJI("avatarVideoPresenter");
                        throw null;
                    }
                }
                if (!Yl().getIsUpdateUserIdRemovingVerification().booleanValue()) {
                    C5S1 c5s12 = new C5S1(EF7.LIZIZ());
                    c5s12.LIZLLL(getString(R.string.cba, 48));
                    c5s12.LJ();
                    return;
                }
            } else {
                o.LJIJI("avatarVideoPresenter");
                throw null;
            }
        }
        super.FI(z);
    }

    @Override // X.InterfaceC26315AUl
    public final void Ni(AvatarUri avatarUri) {
        o.LJIIIZ(avatarUri, "avatarUri");
        if (!isViewValid() || mo49getActivity() == null) {
            return;
        }
        AvatarVideoPresenter avatarVideoPresenter = this.LLJLLL;
        if (avatarVideoPresenter != null) {
            avatarVideoPresenter.dismissProgressDialog();
            C244379iT Wl = Wl();
            String str = avatarUri.uri;
            Wl.LJ = TextUtils.isEmpty(str);
            Wl.LIZLLL = str;
            return;
        }
        o.LJIJI("avatarVideoPresenter");
        throw null;
    }

    public final void Zm(TuxIconView tuxIconView) {
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.dl);
        layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.dl);
        tuxIconView.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment, X.InterfaceC26320AUq
    public final void cq(Exception exc) {
        Al(false);
        Jl().dismissProgressDialog();
        if (!isViewValid()) {
            return;
        }
        if ((exc instanceof C38333F2r) && ((C38306F1q) exc).getErrorCode() == 20022) {
            C73040SlY.LJII(mo49getActivity(), "profile_image_setting", "review_failure");
        }
        C1A7.LJIJJLI(mo49getActivity(), exc, R.string.b5f);
    }

    @Override // X.InterfaceC26315AUl
    public final void iS(String filePath) {
        TuxSheet tuxSheet;
        o.LJIIIZ(filePath, "filePath");
        if (!isViewValid() || mo49getActivity() == null || !Pl() || (tuxSheet = this.LLLFZ) == null) {
            return;
        }
        tuxSheet.dismiss();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment
    public final void initView(View view) {
        View view2;
        this.LLJJJJJIL = (RelativeLayout) view.findViewById(R.id.j43);
        View findViewById = view.findViewById(R.id.i6w);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.profile_banned_edit_hint)");
        this.LLJJLIIIJLLLLLLLZ = (ConstraintLayout) findViewById;
        this.LLJL = (C119634ml) view.findViewById(R.id.e48);
        this.LLJLIL = (TuxIconView) view.findViewById(R.id.e49);
        this.LLJLILLLLZIIL = (C72434Sbm) view.findViewById(R.id.e4_);
        View findViewById2 = view.findViewById(R.id.n_t);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.view_details)");
        this.LLJJJJLIIL = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.j42);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.rl_avatar_change_photo)");
        this.LLJJL = (RelativeLayout) findViewById3;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e46);
        o.LJIIIIZZ(tuxIconView, "view.header_image_photo_icon");
        this.LLJLL = tuxIconView;
        C72434Sbm c72434Sbm = (C72434Sbm) view.findViewById(R.id.e47);
        o.LJIIIIZZ(c72434Sbm, "view.header_image_photo_icon_placeholder");
        this.LLJLLIL = c72434Sbm;
        View findViewById4 = view.findViewById(R.id.zu);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.aigc_status)");
        this.LLLFF = findViewById4;
        View findViewById5 = view.findViewById(R.id.j43);
        if (findViewById5 != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, LiveTryModeCountDownThresholdSetting.DEFAULT), findViewById5);
        }
        super.initView(view);
        AvatarVideoPresenter avatarVideoPresenter = new AvatarVideoPresenter();
        avatarVideoPresenter.bindView((InterfaceC26315AUl) this);
        avatarVideoPresenter.initHeadVideoUploadHelper(mo49getActivity(), this);
        this.LLJLLL = avatarVideoPresenter;
        C119634ml c119634ml = this.LLJL;
        if (c119634ml != null) {
            c119634ml.LJLLL = true;
        }
        ((RBX) HG3.LJIILL()).addUserChangeListener(this);
        if (Pl()) {
            this.LLLFFI = View.inflate(this.LJLIL, R.layout.c3o, null);
            if (Pl() && (view2 = this.LLLFFI) != null) {
                C16880lQ.LJIILJJIL((FrameLayout) view2.findViewById(R.id.dfl), new ACListenerS24S0100000_4(this, 136));
                C16880lQ.LJIILJJIL((FrameLayout) view2.findViewById(R.id.dht), new ACListenerS24S0100000_4(this, 137));
                ((C72433Sbl) view2.findViewById(R.id.n4g)).LJLLL = true;
            }
            Ll().LJLLL = true;
        }
        if (Rl()) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 121), view.findViewById(R.id.egd));
        }
    }

    @Override // X.InterfaceC26315AUl
    public final void rr(Exception e) {
        o.LJIIIZ(e, "e");
        Al(false);
        Jl().dismissProgressDialog();
        if (!isViewValid()) {
            return;
        }
        if ((e instanceof C38333F2r) && ((C38306F1q) e).getErrorCode() == 20022) {
            C73040SlY.LJII(mo49getActivity(), "profile_image_setting", "review_failure");
        }
        C1A7.LJIJJLI(mo49getActivity(), e, R.string.b5f);
        C78598Ut0.LJIIZILJ(e.getMessage(), "avatar");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment, X.InterfaceC26320AUq
    public final void rs0(String str) {
        TuxSheet tuxSheet;
        if (Pl() && (tuxSheet = this.LLLFZ) != null) {
            tuxSheet.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment, X.InterfaceC26320AUq
    public final void yH(AvatarUri avatarUri) {
        if (avatarUri == null || C38891fp.LJJI(avatarUri.urlList) || TextUtils.isEmpty((CharSequence) ListProtector.get(avatarUri.urlList, 0))) {
            Jl().dismissProgressDialog();
            C5S1 c5s1 = new C5S1(mo49getActivity());
            c5s1.LIZJ(R.string.b5f);
            c5s1.LJ();
            return;
        }
        Jl().dismissProgressDialog();
        Wl().LIZJ = avatarUri.uri;
        C78765Uvh.LJIIIZ(Ll(), (String) ListProtector.get(avatarUri.urlList, 0), (int) KL2.LIZJ(this.LJLIL, 84.0f), (int) KL2.LIZJ(this.LJLIL, 84.0f));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment, X.InterfaceC26189APp
    public final void Pp0(User data, int i) {
        o.LJIIIZ(data, "data");
        super.Pp0(data, i);
        if (i == 112) {
            getUser().setAvatarVideoUri(data.getAvatarVideoUri());
        }
    }

    public final void an(String str, boolean z) {
        List<String> list;
        if (z && (list = ((RBX) HG3.LJIILL()).getCurUser().boldFields) != null) {
            if (list.size() > 0 && !list.contains(str)) {
                list.add(str);
                ((RBX) HG3.LJIILL()).getCurUser().setBoldFields(list);
            }
            Rm(str, "is_edited", false);
        }
    }

    public final void cn(String str, boolean z) {
        List<String> list;
        if (z && (list = ((RBX) HG3.LJIILL()).getCurUser().boldFields) != null) {
            if (list.size() > 0 && list.contains(str)) {
                list.remove(str);
                ((RBX) HG3.LJIILL()).getCurUser().setBoldFields(list);
            }
            Rm(str, "blank", true);
        }
    }

    public final void dn(User user, boolean z) {
        ImageView imageView;
        boolean z2;
        String uri;
        UrlModel avatarMedium = user.getAvatarMedium();
        View view = getView();
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.e45);
        } else {
            imageView = null;
        }
        boolean LIZIZ = C244369iS.LIZIZ(avatarMedium);
        boolean z3 = !C255199zv.LJIIJ(user, "photo");
        if (Pl()) {
            View view2 = this.LLLFFI;
            if (view2 == null) {
                return;
            }
            C62846OlW c62846OlW = (C62846OlW) view2.findViewById(R.id.ho1);
            TuxIconView tuxIconView = (TuxIconView) view2.findViewById(R.id.ho0);
            UrlModel avatarVideoUri = user.getAvatarVideoUri();
            if (avatarVideoUri == null || (uri = avatarVideoUri.getUri()) == null || uri.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (LIZIZ && !z3) {
                C78765Uvh.LJFF(c62846OlW, avatarMedium);
                c62846OlW.setVisibility(0);
                tuxIconView.setTintColorRes(R.attr.dj);
                ((TextView) view2.findViewById(R.id.m1y)).setText(getString(R.string.fhm));
                if (z2) {
                    C78765Uvh.LJFF(Ll(), avatarMedium);
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    C119634ml Ll = Ll();
                    TuxIconView tuxIconView2 = this.LLJLL;
                    if (tuxIconView2 != null) {
                        C72434Sbm c72434Sbm = this.LLJLLIL;
                        if (c72434Sbm != null) {
                            C244369iS.LIZJ(Ll, tuxIconView2, c72434Sbm);
                            ((RBX) HG3.LJIILL()).getCurUser().setAvatarUpdateReminder(false);
                            an("photo", z);
                            return;
                        }
                        o.LJIJI("headerImagePhotoIconPlaceholder");
                        throw null;
                    }
                    o.LJIJI("headerImagePhotoIcon");
                    throw null;
                }
                return;
            }
            c62846OlW.setVisibility(4);
            tuxIconView.setTintColorRes(R.attr.gu);
            ((TextView) view2.findViewById(R.id.m1y)).setText(getString(R.string.fhp));
            if (!z2) {
                return;
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            C119634ml Ll2 = Ll();
            TuxIconView tuxIconView3 = this.LLJLL;
            if (tuxIconView3 != null) {
                C72434Sbm c72434Sbm2 = this.LLJLLIL;
                if (c72434Sbm2 != null) {
                    C244369iS.LIZ(Ll2, tuxIconView3, c72434Sbm2);
                    cn("photo", z);
                    return;
                } else {
                    o.LJIJI("headerImagePhotoIconPlaceholder");
                    throw null;
                }
            }
            o.LJIJI("headerImagePhotoIcon");
            throw null;
        }
        if (LIZIZ && (!Rl() || !z3)) {
            C78765Uvh.LJFF(Ll(), avatarMedium);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            C119634ml Ll3 = Ll();
            TuxIconView tuxIconView4 = this.LLJLL;
            if (tuxIconView4 != null) {
                C72434Sbm c72434Sbm3 = this.LLJLLIL;
                if (c72434Sbm3 != null) {
                    C244369iS.LIZJ(Ll3, tuxIconView4, c72434Sbm3);
                    ((RBX) HG3.LJIILL()).getCurUser().setAvatarUpdateReminder(false);
                    an("photo", z);
                    return;
                }
                o.LJIJI("headerImagePhotoIconPlaceholder");
                throw null;
            }
            o.LJIJI("headerImagePhotoIcon");
            throw null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        C119634ml Ll4 = Ll();
        TuxIconView tuxIconView5 = this.LLJLL;
        if (tuxIconView5 != null) {
            C72434Sbm c72434Sbm4 = this.LLJLLIL;
            if (c72434Sbm4 != null) {
                C244369iS.LIZ(Ll4, tuxIconView5, c72434Sbm4);
                cn("photo", z);
                return;
            } else {
                o.LJIJI("headerImagePhotoIconPlaceholder");
                throw null;
            }
        }
        o.LJIJI("headerImagePhotoIcon");
        throw null;
    }

    public final void hn(User user, boolean z) {
        C72434Sbm c72434Sbm;
        TuxIconView tuxIconView;
        ImageView imageView;
        UrlModel avatarVideoUri = user.getAvatarVideoUri();
        boolean LIZIZ = C244369iS.LIZIZ(avatarVideoUri);
        if (Pl()) {
            View view = this.LLLFFI;
            if (view == null) {
                return;
            }
            C119634ml c119634ml = (C119634ml) view.findViewById(R.id.n4g);
            TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.n4f);
            View view2 = getView();
            if (view2 != null) {
                imageView = (ImageView) view2.findViewById(R.id.e45);
            } else {
                imageView = null;
            }
            if (LIZIZ) {
                C78765Uvh.LIZLLL(c119634ml, avatarVideoUri);
                c119634ml.setVisibility(0);
                tuxIconView2.setTintColorRes(R.attr.dj);
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                C78765Uvh.LIZLLL(Ll(), avatarVideoUri);
                C119634ml Ll = Ll();
                TuxIconView tuxIconView3 = this.LLJLL;
                if (tuxIconView3 != null) {
                    C72434Sbm c72434Sbm2 = this.LLJLLIL;
                    if (c72434Sbm2 != null) {
                        C244369iS.LIZJ(Ll, tuxIconView3, c72434Sbm2);
                        ((RBX) HG3.LJIILL()).getCurUser().setAvatarUpdateReminder(false);
                        ((TextView) view.findViewById(R.id.m23)).setText(getString(R.string.fhz));
                        an("video", z);
                        return;
                    }
                    o.LJIJI("headerImagePhotoIconPlaceholder");
                    throw null;
                }
                o.LJIJI("headerImagePhotoIcon");
                throw null;
            }
            c119634ml.setVisibility(4);
            tuxIconView2.setTintColorRes(R.attr.gu);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            C119634ml Ll2 = Ll();
            TuxIconView tuxIconView4 = this.LLJLL;
            if (tuxIconView4 != null) {
                C72434Sbm c72434Sbm3 = this.LLJLLIL;
                if (c72434Sbm3 != null) {
                    C244369iS.LIZ(Ll2, tuxIconView4, c72434Sbm3);
                    ((TextView) view.findViewById(R.id.m23)).setText(getString(R.string.fhn));
                    cn("video", z);
                    return;
                }
                o.LJIJI("headerImagePhotoIconPlaceholder");
                throw null;
            }
            o.LJIJI("headerImagePhotoIcon");
            throw null;
        }
        C119634ml c119634ml2 = this.LLJL;
        if (c119634ml2 == null || (c72434Sbm = this.LLJLILLLLZIIL) == null || (tuxIconView = this.LLJLIL) == null) {
            return;
        }
        if (LIZIZ) {
            C78765Uvh.LIZLLL(c119634ml2, avatarVideoUri);
            C244369iS.LIZJ(c119634ml2, tuxIconView, c72434Sbm);
            ((RBX) HG3.LJIILL()).getCurUser().setAvatarUpdateReminder(false);
            an("video", z);
            return;
        }
        C244369iS.LIZ(c119634ml2, tuxIconView, c72434Sbm);
        cn("video", z);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1000 && i != 1001) {
            AvatarVideoPresenter avatarVideoPresenter = this.LLJLLL;
            if (avatarVideoPresenter != null) {
                avatarVideoPresenter.onActivityResult(i, i2, intent);
            } else {
                o.LJIJI("avatarVideoPresenter");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.runOnUiThread(new ARunnableS8S0400000_4(mo49getActivity, user, user2, this, 3));
        }
    }
}
