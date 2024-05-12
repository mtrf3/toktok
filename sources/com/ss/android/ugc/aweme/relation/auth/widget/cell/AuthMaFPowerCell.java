package com.ss.android.ugc.aweme.relation.auth.widget.cell;

import X.AJ9;
import X.AV1;
import X.C12460eI;
import X.C16880lQ;
import X.C1AU;
import X.C221108m2;
import X.C226668v0;
import X.C227328w4;
import X.C56750MPa;
import X.C57362MfG;
import X.C57738MlK;
import X.C62822Ol8;
import X.C78939UyV;
import X.EnumC112694bZ;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.InterfaceC57702Mkk;
import X.P1I;
import X.P1J;
import X.P1K;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class AuthMaFPowerCell<T extends P1K> extends PowerCell<T> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS160S0100000_10((AuthMaFPowerCell) this, 310));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10((AuthMaFPowerCell) this, 309));
    public SmartAvatarImageView LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public RelationButton LJLJJLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.i3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.ad0);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar_view)");
        this.LJLJI = (SmartAvatarImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.i4b);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.primary_area_tv)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.jim);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.second_area_tv)");
        this.LJLJJL = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.dk3);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.follow_button)");
        this.LJLJJLL = (RelationButton) findViewById4;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new P1I(this));
    }

    public final void L(User user, P1J trackInfo) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(trackInfo, "trackInfo");
        W5F LJII = W5U.LJII(C78939UyV.LJ(user.getAvatarThumb()));
        SmartAvatarImageView smartAvatarImageView = this.LJLJI;
        if (smartAvatarImageView != null) {
            LJII.LJJIIJ = smartAvatarImageView;
            LJII.LIZIZ("Widget");
            C16880lQ.LLJJJ(LJII);
            TuxTextView tuxTextView = this.LJLJJI;
            if (tuxTextView != null) {
                tuxTextView.setText(user.getNickname());
                TuxTextView tuxTextView2 = this.LJLJJL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(AV1.LIZLLL(user));
                    Context context = this.itemView.getContext();
                    String customVerify = user.getCustomVerify();
                    String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
                    TuxTextView tuxTextView3 = this.LJLJJL;
                    if (tuxTextView3 != null) {
                        AJ9.LJ(context, customVerify, enterpriseVerifyReason, tuxTextView3);
                        RelationButton relationButton = this.LJLJJLL;
                        if (relationButton != null) {
                            C226668v0 c226668v0 = new C226668v0();
                            LifecycleOwner lifecycleOwner = (Fragment) this.LJLIL.getValue();
                            if (lifecycleOwner == null) {
                                lifecycleOwner = (C1AU) this.LJLILLLLZI.getValue();
                            }
                            c226668v0.LJIIIZ = lifecycleOwner;
                            ViewModelStoreOwner viewModelStoreOwner = (Fragment) this.LJLIL.getValue();
                            if (viewModelStoreOwner == null) {
                                viewModelStoreOwner = (ComponentActivity) this.LJLILLLLZI.getValue();
                            }
                            c226668v0.LJIIJ = viewModelStoreOwner;
                            c226668v0.LIZ = user;
                            c226668v0.LIZIZ = true;
                            c226668v0.LIZIZ(EnumC112694bZ.MESSAGE_ICE_BREAKING);
                            c226668v0.LJIIIIZZ = true;
                            relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
                            RelationButton relationButton2 = this.LJLJJLL;
                            if (relationButton2 != null) {
                                relationButton2.setDataChangeListener(new AqS176S0100000_10(user, 60));
                                RelationButton relationButton3 = this.LJLJJLL;
                                if (relationButton3 != null) {
                                    relationButton3.setTracker(new AqS99S0300000_10(trackInfo, (P1J) user, (User) this, 2));
                                    return;
                                } else {
                                    o.LJIJI("relationButton");
                                    throw null;
                                }
                            }
                            o.LJIJI("relationButton");
                            throw null;
                        }
                        o.LJIJI("relationButton");
                        throw null;
                    }
                    o.LJIJI("secondTv");
                    throw null;
                }
                o.LJIJI("secondTv");
                throw null;
            }
            o.LJIJI("primaryTv");
            throw null;
        }
        o.LJIJI("avatarView");
        throw null;
    }

    public final void M(T item, String str) {
        o.LJIIIZ(item, "item");
        P1J p1j = item.LJLJI;
        User LIZIZ = item.LIZIZ();
        new C227328w4(p1j.LJLIL, LIZIZ, p1j.LJLJI, p1j.LJLILLLLZI, p1j.LJLJJI, Integer.valueOf(item.LIZ()), str, null, null, null, null, 1920).LIZLLL(null);
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI(p1j.LJLIL);
        c57362MfG.LJJJI(p1j.LJLILLLLZI);
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.ENTER_PROFILE;
        c57362MfG.LJJJJIZL(LIZIZ);
        c57362MfG.LJIILIIL();
        InterfaceC57702Mkk LJIILIIL = C57738MlK.LIZIZ.LJIILIIL();
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C56750MPa.LIZIZ(LJIILIIL, context, LIZIZ, p1j.LJLIL, p1j.LJLJJI, p1j.LJLILLLLZI, p1j.LJLJI, null, 64);
    }
}
