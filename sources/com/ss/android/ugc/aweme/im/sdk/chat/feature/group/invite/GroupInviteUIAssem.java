package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite;

import X.AnonymousClass453;
import X.C110434Vb;
import X.C111334Yn;
import X.C16880lQ;
import X.C212428Vi;
import X.C223338pd;
import X.C254939zV;
import X.C47261Igj;
import X.C47704Ins;
import X.C4PJ;
import X.C55749LuL;
import X.C62846OlW;
import X.C7MY;
import X.C80763Ey;
import X.C84683Ua;
import X.C8YN;
import X.EnumC254979zZ;
import X.PO8;
import X.SY4;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.InviteError;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS120S0300000_1;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GroupInviteUIAssem extends UIContentAssem {
    public final AnonymousClass453 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public GroupInviteViewModel LJLJI;
    public int LJLJJI;

    public GroupInviteUIAssem() {
        PO8 po8 = new PO8("ChatGroupInvite::GroupInviteUIAssem");
        new LinkedHashMap();
        this.LJLIL = po8;
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C111334Yn.class, null), checkSupervisorPrepared());
        this.LJLJJI = 1;
    }

    public final boolean A3() {
        String str;
        Long l = ((C111334Yn) this.LJLILLLLZI.getValue()).LJLIL;
        if (l != null) {
            str = l.toString();
        } else {
            str = null;
        }
        return C80763Ey.LIZ(false).equals(str);
    }

    public final SY4 v3() {
        return (SY4) getContainerView().findViewById(R.id.aw0);
    }

    public final int x3() {
        int i;
        if (A3()) {
            i = 216;
        } else {
            i = 342;
        }
        return C7MY.LIZIZ(i);
    }

    public final void C3(FrameLayout frameLayout) {
        frameLayout.getLayoutParams().height = x3();
        C223338pd c223338pd = (C223338pd) getContainerView().findViewById(R.id.chz);
        c223338pd.setVisibility(8);
        c223338pd.LIZJ();
        getContainerView().findViewById(R.id.bul).setVisibility(8);
        getContainerView().findViewById(R.id.cyv).setVisibility(0);
        if (this.LJLJJI >= 1) {
            C84683Ua c84683Ua = C84683Ua.LJFF;
            C4PJ c4pj = new C4PJ();
            GroupInviteViewModel groupInviteViewModel = this.LJLJI;
            if (groupInviteViewModel != null) {
                C254939zV jv0 = groupInviteViewModel.jv0();
                c84683Ua.LIZ(c4pj, new C110434Vb(jv0.LJII, jv0.LIZ, jv0.LIZLLL, jv0.LJ, jv0.LIZJ - jv0.LIZIZ, jv0.LJI, jv0.LJFF));
                this.LJLJJI--;
                return;
            }
            o.LJIJI("viewModel");
            throw null;
        }
    }

    public final String F3(int i) {
        Context context = getContext();
        if (context != null) {
            return context.getString(i);
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJI = ((C111334Yn) this.LJLILLLLZI.getValue()).LJLJJI;
        this.LJLIL.d("onViewCreated: GroupInviteUIAssem");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bst);
        frameLayout.getLayoutParams().height = x3();
        C16880lQ.LJJIZ(v3(), new ACListenerS24S0100000_4(this, 60));
        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.f0h), new ACListenerS24S0100000_4(this, 61));
        C16880lQ.LJJIZ((SY4) view.findViewById(R.id.aym), new ACListenerS24S0100000_4(this, 62));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.m7y);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.m7w);
        C62846OlW c62846OlW = (C62846OlW) view.findViewById(R.id.abh);
        GroupInviteViewModel groupInviteViewModel = this.LJLJI;
        if (groupInviteViewModel != null) {
            C8YN.LJII(this, groupInviteViewModel, new TBT() { // from class: X.4ho
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C254969zY) obj).LJLIL;
                }
            }, null, new AqS120S0300000_1(c62846OlW, tuxTextView, tuxTextView2, 1), 6);
            GroupInviteViewModel groupInviteViewModel2 = this.LJLJI;
            if (groupInviteViewModel2 != null) {
                AssemViewModel.asyncSubscribe$default(groupInviteViewModel2, new TBT() { // from class: X.9zc
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C254969zY) obj).LJLILLLLZI;
                    }
                }, null, new AqS135S0200000_4(this, frameLayout, 64), new AqS154S0100000_4(this, 360), new AqS135S0200000_4(this, frameLayout, 65), 2, null);
                SY4 sy4 = (SY4) view.findViewById(R.id.auj);
                GroupInviteViewModel groupInviteViewModel3 = this.LJLJI;
                if (groupInviteViewModel3 != null) {
                    AssemViewModel.asyncSubscribe$default(groupInviteViewModel3, new TBT() { // from class: X.9zb
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C254969zY) obj).LJLJI;
                        }
                    }, null, new AqS170S0100000_4(sy4, 386), new AqS154S0100000_4(sy4, 359), new AqS135S0200000_4(sy4, this, 63), 2, null);
                    Fragment LIZLLL = C212428Vi.LIZLLL(this);
                    if (LIZLLL != null) {
                        GroupInviteViewModel groupInviteViewModel4 = this.LJLJI;
                        if (groupInviteViewModel4 != null) {
                            C8YN.LJII(this, groupInviteViewModel4, new TBT() { // from class: X.9za
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return Boolean.valueOf(((C254969zY) obj).LJLJJI);
                                }
                            }, null, new AqS183S0100000_1(LIZLLL, 6), 6);
                            return;
                        } else {
                            o.LJIJI("viewModel");
                            throw null;
                        }
                    }
                    "Required value was null.".toString();
                    throw new IllegalStateException("Required value was null.");
                }
                o.LJIJI("viewModel");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public final void E3(Integer num, InviteError inviteError, boolean z) {
        String str;
        EnumC254979zZ enumC254979zZ;
        int i;
        int i2;
        String str2;
        String str3;
        String str4;
        int i3;
        int i4;
        int i5;
        String str5;
        String str6;
        getContainerView().findViewById(R.id.bst).getLayoutParams().height = -2;
        C223338pd c223338pd = (C223338pd) getContainerView().findViewById(R.id.chz);
        int i6 = 8;
        c223338pd.setVisibility(8);
        c223338pd.LIZJ();
        getContainerView().findViewById(R.id.bul).setVisibility(0);
        getContainerView().findViewById(R.id.cyv).setVisibility(8);
        if (A3()) {
            if (inviteError == null) {
                if (num == null || num.intValue() != 3) {
                    SY4 v3 = v3();
                    Context context = getContext();
                    if (context != null) {
                        str6 = context.getString(R.string.gxt);
                    } else {
                        str6 = null;
                    }
                    v3.setText(str6);
                    v3.setEnabled(false);
                } else {
                    SY4 v32 = v3();
                    Context context2 = getContext();
                    if (context2 != null) {
                        str5 = context2.getString(R.string.gxn);
                    } else {
                        str5 = null;
                    }
                    v32.setText(str5);
                    v32.setEnabled(true);
                }
                enumC254979zZ = EnumC254979zZ.ENTER;
            } else {
                ((TextView) getContainerView().findViewById(R.id.m6e)).setText(inviteError.errorMessage);
                enumC254979zZ = EnumC254979zZ.EXPIRE;
            }
        } else if (inviteError == null) {
            if (num != null) {
                if (num.intValue() == 3) {
                    SY4 v33 = v3();
                    Context context3 = getContext();
                    if (context3 != null) {
                        str4 = context3.getString(R.string.gxn);
                    } else {
                        str4 = null;
                    }
                    v33.setText(str4);
                    v33.setEnabled(true);
                    enumC254979zZ = EnumC254979zZ.ENTER;
                } else if (num != null) {
                    if (num.intValue() == 2) {
                        SY4 sy4 = (SY4) getContainerView().findViewById(R.id.auj);
                        Context context4 = getContext();
                        if (context4 != null) {
                            str3 = context4.getString(R.string.guu);
                        } else {
                            str3 = null;
                        }
                        sy4.setText(str3);
                        sy4.setEnabled(false);
                        enumC254979zZ = EnumC254979zZ.INVITE;
                    } else if (num.intValue() == 1 || num.intValue() == 0) {
                        SY4 sy42 = (SY4) getContainerView().findViewById(R.id.auj);
                        Context context5 = getContext();
                        if (context5 != null) {
                            str2 = context5.getString(R.string.gus);
                        } else {
                            str2 = null;
                        }
                        sy42.setText(str2);
                        sy42.setButtonVariant(0);
                        C16880lQ.LJJIZ(sy42, new ACListenerS39S0200000_4(this, (TuxIconView) getContainerView().findViewById(R.id.f0h), 113));
                        enumC254979zZ = EnumC254979zZ.INVITE;
                    }
                }
            }
            enumC254979zZ = EnumC254979zZ.INVITE;
        } else if (inviteError.LIZIZ()) {
            View findViewById = getContainerView().findViewById(R.id.m7y);
            o.LJIIIIZZ(findViewById, "getGroupName()");
            findViewById.setVisibility(8);
            View findViewById2 = getContainerView().findViewById(R.id.m7w);
            o.LJIIIIZZ(findViewById2, "getGroupCount()");
            findViewById2.setVisibility(8);
            TextView showGroupSuspendedTemporarilyView$lambda$2 = (TextView) getContainerView().findViewById(R.id.m80);
            o.LJIIIIZZ(showGroupSuspendedTemporarilyView$lambda$2, "showGroupSuspendedTemporarilyView$lambda$2");
            showGroupSuspendedTemporarilyView$lambda$2.setVisibility(0);
            showGroupSuspendedTemporarilyView$lambda$2.setText(F3(R.string.gu5));
            TextView showGroupSuspendedTemporarilyView$lambda$3 = (TextView) getContainerView().findViewById(R.id.m99);
            o.LJIIIIZZ(showGroupSuspendedTemporarilyView$lambda$3, "showGroupSuspendedTemporarilyView$lambda$3");
            showGroupSuspendedTemporarilyView$lambda$3.setVisibility(0);
            showGroupSuspendedTemporarilyView$lambda$3.setText(F3(R.string.guh));
            SY4 showGroupSuspendedTemporarilyView$lambda$4 = v3();
            o.LJIIIIZZ(showGroupSuspendedTemporarilyView$lambda$4, "showGroupSuspendedTemporarilyView$lambda$4");
            showGroupSuspendedTemporarilyView$lambda$4.setVisibility(0);
            showGroupSuspendedTemporarilyView$lambda$4.setEnabled(z);
            if (z) {
                i2 = R.string.gxn;
            } else {
                i2 = R.string.gui;
            }
            showGroupSuspendedTemporarilyView$lambda$4.setText(F3(i2));
            showGroupSuspendedTemporarilyView$lambda$4.setButtonVariant(5);
            enumC254979zZ = EnumC254979zZ.GROUP_SUSPENDED_TEMPORARILY;
        } else if (inviteError.LIZ()) {
            View findViewById3 = getContainerView().findViewById(R.id.m7y);
            o.LJIIIIZZ(findViewById3, "getGroupName()");
            findViewById3.setVisibility(8);
            View findViewById4 = getContainerView().findViewById(R.id.m7w);
            o.LJIIIIZZ(findViewById4, "getGroupCount()");
            findViewById4.setVisibility(8);
            TextView showGroupSuspendedPermanentlyView$lambda$5 = (TextView) getContainerView().findViewById(R.id.m80);
            o.LJIIIIZZ(showGroupSuspendedPermanentlyView$lambda$5, "showGroupSuspendedPermanentlyView$lambda$5");
            showGroupSuspendedPermanentlyView$lambda$5.setVisibility(0);
            showGroupSuspendedPermanentlyView$lambda$5.setText(F3(R.string.gu4));
            TextView showGroupSuspendedPermanentlyView$lambda$6 = (TextView) getContainerView().findViewById(R.id.m7z);
            o.LJIIIIZZ(showGroupSuspendedPermanentlyView$lambda$6, "showGroupSuspendedPermanentlyView$lambda$6");
            showGroupSuspendedPermanentlyView$lambda$6.setVisibility(0);
            showGroupSuspendedPermanentlyView$lambda$6.setText(F3(R.string.gug));
            SY4 showGroupSuspendedPermanentlyView$lambda$7 = v3();
            o.LJIIIIZZ(showGroupSuspendedPermanentlyView$lambda$7, "showGroupSuspendedPermanentlyView$lambda$7");
            showGroupSuspendedPermanentlyView$lambda$7.setVisibility(0);
            showGroupSuspendedPermanentlyView$lambda$7.setEnabled(true);
            if (z) {
                i = R.string.gxn;
            } else {
                i = R.string.h7q;
            }
            showGroupSuspendedPermanentlyView$lambda$7.setText(F3(i));
            if (!z) {
                C16880lQ.LJJIZ(showGroupSuspendedPermanentlyView$lambda$7, new ACListenerS21S0100000_1(this, LiveCoverMinSizeSetting.DEFAULT));
            }
            showGroupSuspendedPermanentlyView$lambda$7.setButtonVariant(5);
            enumC254979zZ = EnumC254979zZ.GROUP_SUSPENDED_PERMANENTLY;
        } else {
            Integer num2 = inviteError.errorCode;
            if (num2 == null || num2.intValue() != 7817) {
                str = inviteError.errorMessage;
            } else {
                Context context6 = getContext();
                if (context6 != null) {
                    str = context6.getString(R.string.gyx);
                } else {
                    str = null;
                }
            }
            ((TextView) getContainerView().findViewById(R.id.m6e)).setText(str);
            enumC254979zZ = EnumC254979zZ.EXPIRE;
        }
        SY4 v34 = v3();
        o.LJIIIIZZ(v34, "getEnterBtn()");
        EnumC254979zZ enumC254979zZ2 = EnumC254979zZ.GROUP_SUSPENDED_TEMPORARILY;
        EnumC254979zZ enumC254979zZ3 = EnumC254979zZ.GROUP_SUSPENDED_PERMANENTLY;
        if (C47261Igj.LJJIJIIJI(EnumC254979zZ.ENTER, enumC254979zZ2, enumC254979zZ3).contains(enumC254979zZ)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        v34.setVisibility(i3);
        View findViewById5 = getContainerView().findViewById(R.id.m7z);
        o.LJIIIIZZ(findViewById5, "getGroupSuspendDescription()");
        if (C47261Igj.LJJIJIIJI(enumC254979zZ2, enumC254979zZ3).contains(enumC254979zZ)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        findViewById5.setVisibility(i4);
        View findViewById6 = getContainerView().findViewById(R.id.g43);
        o.LJIIIIZZ(findViewById6, "getLLInviteView()");
        if (enumC254979zZ == EnumC254979zZ.INVITE) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        findViewById6.setVisibility(i5);
        View findViewById7 = getContainerView().findViewById(R.id.m6e);
        o.LJIIIIZZ(findViewById7, "getExpireTextView()");
        if (enumC254979zZ == EnumC254979zZ.EXPIRE) {
            i6 = 0;
        }
        findViewById7.setVisibility(i6);
        if (this.LJLJJI >= 1) {
            C84683Ua c84683Ua = C84683Ua.LJFF;
            C4PJ c4pj = new C4PJ();
            GroupInviteViewModel groupInviteViewModel = this.LJLJI;
            if (groupInviteViewModel != null) {
                C254939zV jv0 = groupInviteViewModel.jv0();
                c84683Ua.LIZ(c4pj, new C110434Vb(jv0.LJII, jv0.LIZ, jv0.LIZLLL, jv0.LJ, jv0.LIZJ - jv0.LIZIZ, jv0.LJI, jv0.LJFF));
                this.LJLJJI--;
                return;
            }
            o.LJIJI("viewModel");
            throw null;
        }
    }
}
