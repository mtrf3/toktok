package com.ss.android.ugc.now.interaction.assem;

import X.C178166yy;
import X.C1794472m;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C224738rt;
import X.C2K0;
import X.C30581Hy;
import X.C38489F8r;
import X.C55096Ljo;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70G;
import X.C70I;
import X.C70R;
import X.C70S;
import X.C70T;
import X.C70V;
import X.C73G;
import X.C78926UyI;
import X.C79045V0n;
import X.C8YN;
import X.C9BD;
import X.HG3;
import X.InterfaceC55102Lju;
import X.TBT;
import Y.ACListenerS38S0200000_3;
import Y.IDObjectS120S0200000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.INowKeyboardInputPanelAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowCommentMentionAssem extends UIContentAssem implements ICommentMentionAssemAbility, InterfaceC55102Lju {
    public C73G LJLIL;
    public boolean LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C70G LJLJJI;
    public C224738rt LJLJJL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 731495615) {
            return null;
        }
        return this;
    }

    public NowCommentMentionAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NowKeyboardVM.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1380), C70S.INSTANCE, null);
        this.LJLJJI = C70T.LIZIZ.LIZ();
    }

    public final Set<String> A3() {
        MentionEditText$MentionSpan[] mentionText;
        HashSet hashSet = new HashSet();
        C224738rt c224738rt = this.LJLJJL;
        if (c224738rt != null && (mentionText = c224738rt.getMentionText()) != null && mentionText.length != 0) {
            C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(mentionText);
            while (LJJIIJZLJL.hasNext()) {
                String str = ((MentionEditText$MentionSpan) LJJIIJZLJL.next()).mId;
                o.LJIIIIZZ(str, "span.id");
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final NowKeyboardVM C3() {
        return (NowKeyboardVM) this.LJLJI.getValue();
    }

    public final C1794472m E3() {
        String str;
        NowPostInfo nowPostInfo;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = x3().LJLJJL;
        String str2 = null;
        if (nowFeedMobHierarchyData != null) {
            str = nowFeedMobHierarchyData.getEnterFrom();
        } else {
            str = null;
        }
        Aweme aweme = x3().LJLIL;
        if (aweme != null && (nowPostInfo = aweme.nowPostInfo) != null) {
            str2 = nowPostInfo.getNowMediaType();
        }
        return new C1794472m(str, str2);
    }

    public final boolean F3() {
        ArrayList<TextExtraStruct> textExtraStructList;
        C224738rt c224738rt = this.LJLJJL;
        if (c224738rt == null || (textExtraStructList = c224738rt.getTextExtraStructList()) == null || textExtraStructList.size() < 5) {
            return false;
        }
        return true;
    }

    public final C73G x3() {
        C73G c73g = this.LJLIL;
        if (c73g == null) {
            return C63081OpJ.LJJII(this);
        }
        return c73g;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    public final boolean v3() {
        ArrayList<TextExtraStruct> textExtraStructList;
        if (!HG3.LJIILL().isLogin()) {
            return false;
        }
        C224738rt c224738rt = this.LJLJJL;
        if (c224738rt != null && (textExtraStructList = c224738rt.getTextExtraStructList()) != null && textExtraStructList.size() >= 5) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.now.interaction.assem.ICommentMentionAssemAbility
    public final void LLJJIJI(C73G c73g) {
        if (this.LJLJJL != null) {
            getContainerView();
        }
        this.LJLIL = c73g;
        this.LJLJJI.LJFF(E3());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C224738rt c224738rt;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        INowKeyboardInputPanelAssemAbility LIZIZ = C178166yy.LIZIZ(C55096Ljo.LJIIZILJ(this));
        if (LIZIZ != null) {
            c224738rt = LIZIZ.U1();
        } else {
            c224738rt = null;
        }
        this.LJLJJL = c224738rt;
        if (c224738rt != null) {
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                C70G c70g = this.LJLJJI;
                Context context = view.getContext();
                o.LJIIIIZZ(context, "rootView.context");
                ViewGroup viewGroup = (ViewGroup) view;
                c70g.LJ(context, viewGroup, new C70R(C70I.NOW_COMMENT_MENTION));
                this.LJLJJI.LJFF(E3());
                C70G c70g2 = this.LJLJJI;
                Context context2 = viewGroup.getContext();
                o.LJIIIIZZ(context2, "rootView.context");
                c70g2.LJII(context2, LIZLLL, A3(), new ACListenerS38S0200000_3(this, c224738rt, 75), null, new C70V(this), new AqS169S0100000_3(this, 736));
                c224738rt.addTextChangedListener(new IDObjectS120S0200000_3(this, c224738rt, 3));
                Context context3 = c224738rt.getContext();
                o.LJIIIIZZ(context3, "editText.context");
                Integer LJI = C79045V0n.LJI(R.attr.cf, context3);
                if (LJI != null) {
                    c224738rt.setHighlightColor(LJI.intValue());
                }
            }
            c224738rt.addTextChangedListener(new IDObjectS120S0200000_3(this, c224738rt, 2));
        }
        C8YN.LJII(this, C3(), new TBT() { // from class: X.70Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 129), 4);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.70P
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C178336zF) obj).LJLJLJ);
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 130), 4);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.70O
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLLLLLL;
            }
        }, null, new AqS185S0100000_3(this, 131), 6);
    }
}
