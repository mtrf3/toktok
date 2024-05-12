package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C176356w3;
import X.C177336xd;
import X.C1794472m;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C224748ru;
import X.C30581Hy;
import X.C38489F8r;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55247LmF;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70G;
import X.C70I;
import X.C70J;
import X.C70M;
import X.C70R;
import X.C71Y;
import X.C78886Uxe;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.HG3;
import X.InterfaceC55251LmJ;
import X.TBT;
import Y.ACListenerS38S0200000_3;
import Y.IDObjectS120S0200000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.IDqS450S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentMentionAssem extends UIContentAssem implements IKeyboardProtocol {
    public boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public C224748ru LJLJJI;
    public boolean LJLJJL;

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void LLJJJ() {
    }

    public CommentMentionAssem() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(C70M.LJLIL);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(KeyboardVMV2.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 107), C70J.INSTANCE, null);
        this.LJLJJL = true;
    }

    public final Set<String> A3() {
        CommentEditText$MentionSpan[] mentionSpan;
        HashSet hashSet = new HashSet();
        C224748ru c224748ru = this.LJLJJI;
        if (c224748ru != null && (mentionSpan = c224748ru.getMentionSpan()) != null && mentionSpan.length != 0) {
            C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(mentionSpan);
            while (LJJIIJZLJL.hasNext()) {
                String str = ((CommentEditText$MentionSpan) LJJIIJZLJL.next()).uid;
                if (str != null) {
                    hashSet.add(str);
                }
            }
        }
        return hashSet;
    }

    public final KeyboardVMV2 E3() {
        return (KeyboardVMV2) this.LJLJI.getValue();
    }

    public final C1794472m F3() {
        String str;
        Aweme aweme;
        NowPostInfo nowPostInfo;
        C177336xd C3 = C3();
        String str2 = null;
        if (C3 != null) {
            str = C3.LJLJJLL;
        } else {
            str = null;
        }
        C177336xd C32 = C3();
        if (C32 != null && (aweme = C32.LJLLI) != null && (nowPostInfo = aweme.nowPostInfo) != null) {
            str2 = nowPostInfo.getNowMediaType();
        }
        return new C1794472m(str, str2);
    }

    public final boolean H3() {
        ArrayList<TextExtraStruct> mentionExtraStructList;
        C224748ru c224748ru = this.LJLJJI;
        if (c224748ru == null || (mentionExtraStructList = c224748ru.getMentionExtraStructList()) == null || mentionExtraStructList.size() < 5) {
            return false;
        }
        return true;
    }

    public final C70G x3() {
        return (C70G) this.LJLILLLLZI.getValue();
    }

    public final C177336xd C3() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(this), C177336xd.class, "source_default_key");
        if (LIZLLL != null) {
            return (C177336xd) LIZLLL.getSource();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void LLZZ() {
        x3().LJFF(F3());
        C71Y.LIZLLL("CommentMentionAssem", "resetViewForReused");
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    public final boolean v3() {
        ArrayList<TextExtraStruct> mentionExtraStructList;
        if (!HG3.LJIILL().isLogin()) {
            return false;
        }
        C224748ru c224748ru = this.LJLJJI;
        if (c224748ru != null && (mentionExtraStructList = c224748ru.getMentionExtraStructList()) != null && mentionExtraStructList.size() >= 5) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C224748ru c224748ru;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IKeyboardProtocol.class, C47261Igj.LJJIJIL(this));
        IKeyboardInputPanelAssemAbility LIZ = C176356w3.LIZ(C55096Ljo.LJIIZILJ(this));
        if (LIZ != null) {
            c224748ru = LIZ.U1();
        } else {
            c224748ru = null;
        }
        this.LJLJJI = c224748ru;
        if (c224748ru != null) {
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                C70G x3 = x3();
                Context context = view.getContext();
                o.LJIIIIZZ(context, "rootView.context");
                ViewGroup viewGroup = (ViewGroup) view;
                x3.LJ(context, viewGroup, new C70R(C70I.NORMAL_COMMENT_MENTION));
                C70G x32 = x3();
                Context context2 = viewGroup.getContext();
                o.LJIIIIZZ(context2, "rootView.context");
                x32.LJII(context2, LIZLLL, A3(), new ACListenerS38S0200000_3(this, c224748ru, 53), new AqS169S0100000_3(this, 635), new IDqS450S0100000_3(this, 1), new AqS169S0100000_3(this, 636));
                x3().LJFF(F3());
                Context context3 = c224748ru.getContext();
                o.LJIIIIZZ(context3, "editText.context");
                c224748ru.setHighlightColor(C78886Uxe.LJJIFFI(R.attr.cf, R.color.al, context3));
            }
            c224748ru.addTextChangedListener(new IDObjectS120S0200000_3(this, c224748ru, 1));
            c224748ru.setHighlightColor(c224748ru.getContext().getResources().getColor(R.color.al));
        }
        C8YN.LJII(this, E3(), new TBT() { // from class: X.6ys
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C177616y5) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 22), 4);
        C8YN.LJIIJ(this, E3(), new TBT() { // from class: X.70H
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C177616y5) obj).LJLJL);
            }
        }, new TBT() { // from class: X.6yr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C177616y5) obj).LJLJLJ);
            }
        }, C213688a4.LIZLLL(), new IDqS428S0100000_3(this, 1), 8);
        C8YN.LJII(this, E3(), new TBT() { // from class: X.70K
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C177616y5) obj).LJLZ;
            }
        }, null, new AqS185S0100000_3(this, 23), 6);
    }
}
