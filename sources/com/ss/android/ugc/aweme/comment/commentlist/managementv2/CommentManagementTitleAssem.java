package com.ss.android.ugc.aweme.comment.commentlist.managementv2;

import X.AV1;
import X.ActivityC45651qj;
import X.C06530Nl;
import X.C110614Vt;
import X.C16880lQ;
import X.C174366sq;
import X.C174846tc;
import X.C175536uj;
import X.C175686uy;
import X.C175706v0;
import X.C17N;
import X.C188727au;
import X.C2068389v;
import X.C212428Vi;
import X.C214298b3;
import X.C245319jz;
import X.C252669vq;
import X.C268713r;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55247LmF;
import X.C57414Mg6;
import X.C61328O5c;
import X.C65352Pkq;
import X.C78920UyC;
import X.C78926UyI;
import X.C88463da;
import X.C8YN;
import X.C9BD;
import X.EnumC1796673i;
import X.FMX;
import X.HG3;
import X.InterfaceC55251LmJ;
import X.RBX;
import X.TBV;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS42S1100000_3;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.CommentFilterDislikeControl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentManagementTitleAssem extends UISlotAssem implements IManagementTitleAbility {
    public TuxIconView LJLJLLL;
    public TextView LJLL;
    public final C214298b3 LJLLI;
    public TuxIconView LJLLILLLL;
    public Space LJLLJ;
    public TuxSheet LJLLL;

    public final void L3() {
        String str;
        boolean z;
        String str2;
        FragmentManager fragmentManager;
        C174366sq c174366sq;
        C175536uj I3;
        FragmentManager fragmentManager2;
        TuxSheet tuxSheet;
        Aweme aweme;
        String aid;
        Aweme aweme2;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        C175536uj I32 = I3();
        String str3 = null;
        if (I32 != null && (aweme2 = I32.LJLJI) != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        if (C174846tc.LIZ(curUserId, str) && (I3 = I3()) != null && I3.LJLILLLLZI == 1) {
            String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId2, "userService().curUserId");
            C175536uj I33 = I3();
            if (I33 != null && (aweme = I33.LJLJI) != null && (aid = aweme.getAid()) != null) {
                str4 = aid;
            }
            C174846tc.LIZIZ(curUserId2, str4);
            TuxIconView tuxIconView = this.LJLLILLLL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            Context context = getContext();
            if (context == null) {
                return;
            }
            this.LJLLL = C57414Mg6.LIZ(context);
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null && (fragmentManager2 = LIZLLL.getFragmentManager()) != null && (tuxSheet = this.LJLLL) != null) {
                tuxSheet.show(fragmentManager2, "first_notice");
                return;
            }
            return;
        }
        C245319jz c245319jz = new C245319jz();
        C175536uj I34 = I3();
        if (I34 != null && I34.LJLILLLLZI == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("  ");
            Context context2 = getContext();
            if (context2 != null) {
                str3 = context2.getString(R.string.dl5);
            }
            LIZ.append(str3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X1D.LIZIZ(LIZ));
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_shield_exclamation;
            c2068389v.LJ = Integer.valueOf(R.attr.gx);
            c2068389v.LIZJ = C17N.LJIILL(14.0d);
            c2068389v.LIZIZ = C17N.LJIILL(14.0d);
            Context context3 = getContext();
            if (context3 == null) {
                return;
            }
            spannableStringBuilder.setSpan(c2068389v.LIZIZ(2, context3), 0, 1, 18);
            c245319jz.LIZ.LJLLILLLL = spannableStringBuilder;
        }
        C175536uj I35 = I3();
        if (I35 != null && (c174366sq = I35.LJLIL) != null && c174366sq.getCommentNotice() == 1) {
            str2 = "inbox";
        } else {
            str2 = "comments_management_sheet";
        }
        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.djf);
        LIZIZ.LJ = new ACListenerS42S1100000_3(this, str2, 0);
        C252669vq LIZIZ2 = C06530Nl.LIZIZ(R.string.dij);
        LIZIZ2.LJ = new ACListenerS42S1100000_3(this, str2, 1);
        c245319jz.LIZIZ(LIZIZ, LIZIZ2);
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null && (fragmentManager = LIZLLL2.getFragmentManager()) != null) {
            c245319jz.LIZJ().show(fragmentManager, "CommentManagementView");
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.wa;
    }

    public CommentManagementTitleAssem() {
        new LinkedHashMap();
        this.LJLLI = C78926UyI.LJ(this, C65352Pkq.LIZ(CommentManagementAssemVM.class), C9BD.LIZ, new AqS153S0100000_3(this, 85), C175706v0.INSTANCE, null);
    }

    public final CommentManagementAssemVM K3() {
        return (CommentManagementAssemVM) this.LJLLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.managementv2.IManagementTitleAbility
    public final void Y9() {
        boolean z;
        C175536uj I3;
        C174366sq c174366sq;
        String aid;
        C174366sq c174366sq2;
        String aid2;
        C174366sq c174366sq3;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2 = this.LJLLILLLL;
        if (tuxIconView2 != null && tuxIconView2.getVisibility() == 0 && (tuxIconView = this.LJLLILLLL) != null) {
            tuxIconView.setVisibility(8);
        }
        if (CommentFilterDislikeControl.isNewVersion()) {
            C175536uj I32 = I3();
            if (I32 != null && (c174366sq3 = I32.LJLIL) != null && c174366sq3.getCommentNotice() == 1) {
                z = true;
            } else {
                z = false;
            }
            String str = "";
            if (z) {
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                o.LJIIIIZZ(curUserId, "userService().curUserId");
                C175536uj I33 = I3();
                if (I33 != null && (c174366sq2 = I33.LJLIL) != null && (aid2 = c174366sq2.getAid()) != null) {
                    str = aid2;
                }
                C174846tc.LIZIZ(curUserId, str);
                L3();
                return;
            }
            String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId2, "userService().curUserId");
            C175536uj I34 = I3();
            if (I34 != null && (c174366sq = I34.LJLIL) != null && (aid = c174366sq.getAid()) != null) {
                str = aid;
            }
            if (!C174846tc.LIZ(curUserId2, str) || (I3 = I3()) == null || I3.LJLILLLLZI != 1) {
                return;
            }
            FMX.onEventV3("cmt_tool_remind_shield_show");
            TuxIconView tuxIconView3 = this.LJLLILLLL;
            if (tuxIconView3 == null) {
                return;
            }
            tuxIconView3.setVisibility(0);
        }
    }

    public final C175536uj I3() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(this), C175536uj.class, "source_default_key");
        if (LIZLLL != null) {
            return (C175536uj) LIZLLL.getSource();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.managementv2.IManagementTitleAbility
    public final void MN() {
        CommentManagementAssemVM K3 = K3();
        K3.getClass();
        K3.setState(new AqS8S0010000_3(true, 1));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "pop_up");
        FMX.LJIIL("comment_batch_management_sw", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.managementv2.IManagementTitleAbility
    public final void Xg0() {
        C174366sq c174366sq;
        String str;
        TuxIconView tuxIconView;
        C174366sq c174366sq2;
        C175536uj I3 = I3();
        if (I3 != null && (c174366sq2 = I3.LJLIL) != null && c174366sq2.isForceHideBatchManagementView()) {
            return;
        }
        CommentManagementAssemVM K3 = K3();
        C175536uj I32 = I3();
        String str2 = null;
        if (I32 != null) {
            c174366sq = I32.LJLIL;
        } else {
            c174366sq = null;
        }
        K3.getClass();
        if (c174366sq != null) {
            str = c174366sq.getAuthorUid();
        } else {
            str = null;
        }
        if (!AV1.LJIJI(str)) {
            if (c174366sq != null) {
                str2 = c174366sq.getAuthorUid();
            }
            if ((AV1.LJIJI(str2) || !K3.iv0()) && ((tuxIconView = this.LJLJLLL) == null || tuxIconView.getVisibility() != 0)) {
                return;
            }
        }
        CommentManagementAssemVM K32 = K3();
        K32.getClass();
        K32.setState(new AqS8S0010000_3(false, 1));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, IManagementTitleAbility.class, C175686uy.LIZ(C212428Vi.LIZLLL(this)));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), IManagementTitleAbility.class, null);
        }
    }

    public final void H3(String enterFrom) {
        Keva repo = Keva.getRepo("keva_repo_batch");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("keva_key_portal");
        int i = 0;
        if (!C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, false)) {
            Keva repo2 = Keva.getRepo("keva_repo_batch");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("keva_key_portal");
            LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
            repo2.storeBoolean(X1D.LIZIZ(LIZ2), true);
            i = 1;
        }
        FMX.LJIIL("comment_batch_management_portal_left_ck", C78920UyC.LIZJ(i, "is_first").LIZ);
        CommentManagementAssemVM K3 = K3();
        K3.getClass();
        K3.setState(new AqS8S0010000_3(true, 1));
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("comment_batch_management_sw", c188727au.LIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C174366sq c174366sq;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJLLL = (TuxIconView) view.findViewById(R.id.ite);
        this.LJLL = (TextView) view.findViewById(R.id.itg);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.iti);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cr);
        c110614Vt.LIZJ = C61328O5c.LIZJ(16);
        Context context = tuxIconView.getContext();
        o.LJIIIIZZ(context, "context");
        tuxIconView.setBackground(c110614Vt.LIZ(context));
        this.LJLLILLLL = tuxIconView;
        this.LJLLJ = (Space) view.findViewById(R.id.itc);
        C175536uj I3 = I3();
        if (I3 != null && (c174366sq = I3.LJLIL) != null && c174366sq.isSplitMode()) {
            Space space = this.LJLLJ;
            if (space != null) {
                space.setVisibility(8);
            }
            TuxIconView tuxIconView2 = this.LJLJLLL;
            if (tuxIconView2 != null && (tuxIconView2.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                ViewGroup.LayoutParams layoutParams = tuxIconView2.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginEnd(0);
                layoutParams2.removeRule(16);
                layoutParams2.addRule(21);
            }
        }
        C8YN.LJII(this, K3(), new TBV() { // from class: X.6vE
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C175886vI) obj).LJLILLLLZI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                C175886vI c175886vI = (C175886vI) obj;
                C43I<Boolean> c43i = (C43I) obj2;
                c175886vI.getClass();
                o.LJIIIZ(c43i, "<set-?>");
                c175886vI.LJLILLLLZI = c43i;
            }
        }, null, new AqS185S0100000_3(this, 17), 6);
        C8YN.LJII(this, K3(), new TBV() { // from class: X.6vH
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C175886vI) obj).LJLJJLL);
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C175886vI) obj).LJLJJLL = ((Boolean) obj2).booleanValue();
            }
        }, null, new AqS185S0100000_3(this, 18), 6);
        TuxIconView tuxIconView3 = this.LJLJLLL;
        if (tuxIconView3 != null) {
            C16880lQ.LJJJ(tuxIconView3, new ACListenerS23S0100000_3(this, 17));
        }
        TextView textView = this.LJLL;
        if (textView != null) {
            C16880lQ.LJIJI(textView, new ACListenerS23S0100000_3(this, 18));
        }
        C88463da c88463da = C88463da.LIZ;
        TuxIconView tuxIconView4 = this.LJLJLLL;
        EnumC1796673i enumC1796673i = EnumC1796673i.BUTTON;
        C88463da.LIZJ(c88463da, tuxIconView4, enumC1796673i, 0.0f, 12);
        C88463da.LIZIZ(this.LJLL, enumC1796673i, 0.0f, null);
    }
}
