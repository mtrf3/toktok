package com.ss.android.ugc.aweme.relation.auth.widget.cell;

import X.C16880lQ;
import X.C62792Oke;
import X.C62794Okg;
import X.EMX;
import X.SY4;
import X.W5F;
import X.W5U;
import Y.ACListenerS45S0200000_10;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ContactUnRegisterCell extends PowerCell<C62792Oke> {
    public SmartAvatarImageView LJLIL;
    public SY4 LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.i0;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.ad0);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar_view)");
        this.LJLIL = (SmartAvatarImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.i4b);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.primary_area_tv)");
        this.LJLJI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.jim);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.second_area_tv)");
        this.LJLJJI = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.eru);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.invite_button)");
        this.LJLILLLLZI = (SY4) findViewById4;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C62792Oke c62792Oke) {
        C62792Oke t = c62792Oke;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        EMX emx = t.LJLILLLLZI;
        if (emx.getPhotoUri() != null) {
            W5F LJFF = W5U.LJFF(UriProtector.parse(emx.getPhotoUri()));
            SmartAvatarImageView smartAvatarImageView = this.LJLIL;
            if (smartAvatarImageView != null) {
                LJFF.LJJIIJ = smartAvatarImageView;
                C16880lQ.LLJJJ(LJFF);
            } else {
                o.LJIJI("avatarView");
                throw null;
            }
        } else {
            SmartAvatarImageView smartAvatarImageView2 = this.LJLIL;
            if (smartAvatarImageView2 != null) {
                smartAvatarImageView2.setActualImageResource(R.drawable.b7n);
            } else {
                o.LJIJI("avatarView");
                throw null;
            }
        }
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(emx.getContactName());
            TuxTextView tuxTextView2 = this.LJLJJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(emx.getPhoneNumber());
                SY4 sy4 = this.LJLILLLLZI;
                if (sy4 != null) {
                    if (!t.LJLJI) {
                        sy4.setEnabled(true);
                        SY4 sy42 = this.LJLILLLLZI;
                        if (sy42 != null) {
                            sy42.setButtonVariant(0);
                            SY4 sy43 = this.LJLILLLLZI;
                            if (sy43 != null) {
                                sy43.setText(R.string.hiw);
                                ContactMaFWidgetVM LIZ = C62794Okg.LIZ(t.LJLJJI);
                                SY4 sy44 = this.LJLILLLLZI;
                                if (sy44 != null) {
                                    C16880lQ.LJJIZ(sy44, new ACListenerS45S0200000_10(LIZ, t, 15));
                                    return;
                                } else {
                                    o.LJIJI("invitedButton");
                                    throw null;
                                }
                            }
                            o.LJIJI("invitedButton");
                            throw null;
                        }
                        o.LJIJI("invitedButton");
                        throw null;
                    }
                    sy4.setButtonVariant(5);
                    SY4 sy45 = this.LJLILLLLZI;
                    if (sy45 != null) {
                        sy45.setEnabled(false);
                        SY4 sy46 = this.LJLILLLLZI;
                        if (sy46 != null) {
                            sy46.setText(R.string.hjc);
                            SY4 sy47 = this.LJLILLLLZI;
                            if (sy47 != null) {
                                C16880lQ.LJJIZ(sy47, null);
                                return;
                            } else {
                                o.LJIJI("invitedButton");
                                throw null;
                            }
                        }
                        o.LJIJI("invitedButton");
                        throw null;
                    }
                    o.LJIJI("invitedButton");
                    throw null;
                }
                o.LJIJI("invitedButton");
                throw null;
            }
            o.LJIJI("secondTextView");
            throw null;
        }
        o.LJIJI("primaryTextView");
        throw null;
    }
}
