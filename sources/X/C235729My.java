package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.AccountModifyUserNameComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235729My extends AbstractC65781Prl implements InterfaceC88472Yns<C235719Mx, C76800UCe> {
    public final /* synthetic */ AccountModifyUserNameComponent LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C235729My(AccountModifyUserNameComponent accountModifyUserNameComponent, long j, long j2, int i) {
        super(1);
        this.LJLIL = accountModifyUserNameComponent;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C235719Mx c235719Mx) {
        ProfilePlatformViewModel profilePlatformVM;
        boolean z;
        TuxTextView tuxTextView;
        InterfaceC82683Wch interfaceC82683Wch;
        Context context;
        String str;
        UserProfileInfo userProfileInfo;
        C235719Mx it = c235719Mx;
        o.LJIIIZ(it, "it");
        if (this.LJLIL.getContext() != null && !this.LJLIL.x3() && (profilePlatformVM = this.LJLIL.getProfilePlatformVM()) != null) {
            if (this.LJLILLLLZI - this.LJLJI > this.LJLJJI * 3600000) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                boolean z2 = profilePlatformVM.getState().LJLJJL;
                IUserNameAbility iUserNameAbility = (IUserNameAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LJLIL), IUserNameAbility.class, null);
                if (iUserNameAbility != null) {
                    tuxTextView = iUserNameAbility.Qa();
                } else {
                    tuxTextView = null;
                }
                if (z2) {
                    AccountModifyUserNameComponent accountModifyUserNameComponent = this.LJLIL;
                    if (accountModifyUserNameComponent.LJLJJLL) {
                        if (tuxTextView != null) {
                            if (accountModifyUserNameComponent.LJLJLJ == null || !it.LJLIL) {
                                accountModifyUserNameComponent.v3(R.drawable.bxv);
                                AccountModifyUserNameComponent accountModifyUserNameComponent2 = this.LJLIL;
                                View view = accountModifyUserNameComponent2.componentView;
                                if (view != null && (context = accountModifyUserNameComponent2.getContext()) != null) {
                                    C139825eE c139825eE = new C139825eE(context);
                                    c139825eE.LIZ.LIZIZ = view;
                                    c139825eE.LJI(WHL.BOTTOM);
                                    c139825eE.LJIIJJI(R.string.cle);
                                    c139825eE.LJ(new AqS151S0200000_4(tuxTextView, accountModifyUserNameComponent2, 48));
                                    c139825eE.LJII(new AqS154S0100000_4(accountModifyUserNameComponent2, 1201));
                                    interfaceC82683Wch = c139825eE.LIZJ();
                                } else {
                                    interfaceC82683Wch = null;
                                }
                                accountModifyUserNameComponent2.LJLJLJ = interfaceC82683Wch;
                            }
                            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLIL), C36636EZk.LIZ, null, new C63532eT(this.LJLIL, null), 2);
                            ProfileCommonInfo commonInfo = this.LJLIL.getCommonInfo();
                            if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo.getUid()) == null) {
                                str = "";
                            }
                            C9NG.LIZ.LIZLLL().putLong(i0.LJFF("last_time_show_change_username_bubble_", str), this.LJLILLLLZI).apply();
                        }
                    }
                }
                InterfaceC82683Wch interfaceC82683Wch2 = this.LJLIL.LJLJLJ;
                if (interfaceC82683Wch2 != null) {
                    interfaceC82683Wch2.dismiss();
                }
                this.LJLIL.v3(R.drawable.bxv);
            } else {
                AccountModifyUserNameComponent accountModifyUserNameComponent3 = this.LJLIL;
                if (accountModifyUserNameComponent3.LJLJLJ == null || !it.LJLIL) {
                    accountModifyUserNameComponent3.v3(R.drawable.bxw);
                } else {
                    accountModifyUserNameComponent3.v3(R.drawable.bxv);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
