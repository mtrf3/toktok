package com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C17J;
import X.C212428Vi;
import X.C234999Kd;
import X.C235519Md;
import X.C235539Mf;
import X.C235639Mp;
import X.C255199zv;
import X.C255209zw;
import X.C26335AVf;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C6ZT;
import X.C8VC;
import X.C9AC;
import X.C9AE;
import X.C9IL;
import X.C9UJ;
import X.InterfaceC235069Kk;
import X.InterfaceC235629Mo;
import X.X1D;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.header.IMineProfileEditAbility;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.ProfileHeaderAddBioComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderBaseSignatureComponent;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import o3.IDaS88S0000000_1;
import o3.h0;
import ujb.s;

/* loaded from: classes5.dex */
public final class ProfileHeaderAddBioComponent extends ProfileHeaderBaseSignatureComponent {
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderBaseSignatureComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderBaseSignatureComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderBaseSignatureComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        super.actionsAfterUpdateUI();
        if (C235539Mf.LIZ()) {
            IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null);
            if (iHeaderBioAbility != null) {
                iHeaderBioAbility.Aa0(this.componentView);
            }
            ProfilePlatformViewModel x3 = x3();
            if (x3 != null) {
                x3.sv0(C235519Md.LJLIL);
            }
            ProfilePlatformViewModel x32 = x3();
            if (x32 != null) {
                x32.ov0(new AqS170S0100000_4(this, 833));
                return;
            }
            return;
        }
        IHeaderBioAbility iHeaderBioAbility2 = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null);
        if (iHeaderBioAbility2 != null) {
            iHeaderBioAbility2.Kq(this.componentView);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        User user;
        User user2;
        C26335AVf.LIZLLL();
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
        } else {
            user = null;
        }
        C255209zw.LIZLLL("bio", !C255199zv.LJIIJ(user, "bio"));
        C255199zv.LJII = false;
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            C234999Kd c234999Kd2 = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
            if (c234999Kd2 != null) {
                user2 = c234999Kd2.LIZ;
            } else {
                user2 = null;
            }
            if (!C6ZT.LIZ(tuxTextView)) {
                Keva keva = C235539Mf.LIZ;
                if (keva != null) {
                    keva.storeBoolean("profile_v2_show_bio_hint", false);
                }
                ProfileEditBioFragment LIZ = C9UJ.LIZ("bio", "", C255199zv.LJI(user2, "click_card", "bio"));
                LIZ.setUserVisibleHint(true);
                LIZ.LJLZ = new InterfaceC235629Mo() { // from class: X.9Mb
                    @Override // X.InterfaceC235629Mo
                    public final void LIZ(String content) {
                        o.LJIIIZ(content, "content");
                        IMineProfileEditAbility iMineProfileEditAbility = (IMineProfileEditAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(ProfileHeaderAddBioComponent.this), IMineProfileEditAbility.class, null);
                        if (iMineProfileEditAbility != null) {
                            iMineProfileEditAbility.Ad(content);
                        }
                    }
                };
                ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
                if (LIZ2 != null) {
                    FragmentManager supportFragmentManager = LIZ2.getSupportFragmentManager();
                    o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
                    LIZ.show(supportFragmentManager, "EditNicknameDialog");
                }
                IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null);
                if (iHeaderBioAbility != null) {
                    iHeaderBioAbility.Kq(this.LJLJJL);
                }
            }
        }
        C17J.LJJJ(this, true, "add_bio");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderBaseSignatureComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ISignatureAbility
    public final void W8(int i, String str) {
        String str2;
        String LJJZ;
        Describe describe;
        Describe describe2;
        if (!C235539Mf.LIZ()) {
            return;
        }
        boolean L7 = L7();
        C9IL c9il = C9IL.BIO;
        String lowerCase = "HAS_ADD_BIO".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, L7, c9il, lowerCase, C44384HbQ.LLFF(this.LJLJJL));
        ProfileViewModel profileViewModel = this.LJLJJI;
        if (profileViewModel != null) {
            profileViewModel.Hv0(C255199zv.LJIILL());
        }
        C255199zv.LJII = true;
        A3();
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            BizBaseData bizBaseData = this.LJLIL;
            C235639Mp c235639Mp = null;
            if (bizBaseData != null && (describe2 = bizBaseData.getDescribe()) != null) {
                str2 = describe2.getText();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("+ ");
                LIZ.append(C44384HbQ.LJJZ(R.string.bft));
                str2 = X1D.LIZIZ(LIZ);
            } else if (!s.LJJJZ(str2, '+')) {
                str2 = i0.LJFF("+ ", str2);
            }
            Context context = getContext();
            if (context != null) {
                c235639Mp = new C235639Mp(context);
                ((TuxTag) c235639Mp.LJLIL).setTagSize(3);
                c235639Mp.LIZ(str2);
                ((TuxTag) c235639Mp.LJLIL).setTagTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, context));
                ((TuxTag) c235639Mp.LJLIL).setTagBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cg, context));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            BizBaseData bizBaseData2 = this.LJLIL;
            if (bizBaseData2 == null || (describe = bizBaseData2.getDescribe()) == null || (LJJZ = describe.getText()) == null) {
                LJJZ = C44384HbQ.LJJZ(R.string.bft);
            }
            spannableStringBuilder.append((CharSequence) LJJZ);
            spannableStringBuilder.setSpan(c235639Mp, 0, spannableStringBuilder.length(), 17);
            tuxTextView.setText(spannableStringBuilder);
            h0.LJIJI(tuxTextView, new IDaS88S0000000_1(7));
        }
        C9AE.LIZ(this.LJLJJL, C9AC.LIGHT_MASK, 0.0f);
    }
}
