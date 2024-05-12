package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C174076sN;
import X.C174596tD;
import X.C176356w3;
import X.C177236xT;
import X.C177336xd;
import X.C2068389v;
import X.C2K0;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55247LmF;
import X.C62814Ol0;
import X.C71Y;
import X.C72O;
import X.C79045V0n;
import X.C7HV;
import X.C7MY;
import X.InterfaceC175156u7;
import X.InterfaceC55102Lju;
import X.InterfaceC55251LmJ;
import X.KL2;
import X.V8L;
import X.V92;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentRepostCardAssem extends UIContentAssem implements IKeyboardProtocol, IRepostCardAssemAbility, InterfaceC55102Lju {
    public static final C177236xT LJLJL = new Object() { // from class: X.6xT
    };
    public TextView LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public SmartImageView LJLJJI;
    public ViewGroup LJLJJL;
    public C174596tD LJLJJLL;

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void LLJJJ() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 906244472) {
            return null;
        }
        return this;
    }

    public CommentRepostCardAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void LLZZ() {
        Aweme aweme;
        C71Y.LIZLLL("CommentRepostCardAssem", "resetViewForReused");
        if (C72O.LIZ()) {
            InterfaceC175156u7 LJIL = C7HV.LIZIZ.LJIL();
            C177336xd v3 = v3();
            if (v3 != null) {
                aweme = v3.LJLLI;
            } else {
                aweme = null;
            }
            if (LJIL.LIZJ(aweme)) {
                C174076sN.LIZIZ(Boolean.TRUE);
            } else {
                C174076sN.LIZ();
            }
        }
        r70();
    }

    public final void x3() {
        int i;
        SmartImageView smartImageView = this.LJLJJI;
        if (smartImageView != null) {
            Context context = smartImageView.getContext();
            SmartImageView smartImageView2 = this.LJLJJI;
            if (smartImageView2 != null) {
                V92 hierarchy = smartImageView2.getHierarchy();
                if (hierarchy != null) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_color_repost;
                    c2068389v.LIZIZ = C7MY.LIZIZ(16);
                    c2068389v.LIZJ = C7MY.LIZIZ(16);
                    o.LJIIIIZZ(context, "context");
                    hierarchy.LJIILL(c2068389v.LIZ(context), 1);
                }
                SmartImageView smartImageView3 = this.LJLJJI;
                if (smartImageView3 != null) {
                    V8L v8l = smartImageView3.getHierarchy().LIZJ;
                    if (v8l == null) {
                        v8l = new V8L();
                    }
                    v8l.LIZLLL(KL2.LIZJ(context, 1.0f));
                    o.LJIIIIZZ(context, "context");
                    Integer LJI = C79045V0n.LJI(R.attr.cl, context);
                    if (LJI != null) {
                        i = LJI.intValue();
                    } else {
                        i = 0;
                    }
                    v8l.LJFF = i;
                    SmartImageView smartImageView4 = this.LJLJJI;
                    if (smartImageView4 != null) {
                        smartImageView4.getHierarchy().LJIL(v8l);
                        SmartImageView smartImageView5 = this.LJLJJI;
                        if (smartImageView5 != null) {
                            smartImageView5.setVisibility(0);
                            return;
                        } else {
                            o.LJIJI("upvoteIcon");
                            throw null;
                        }
                    }
                    o.LJIJI("upvoteIcon");
                    throw null;
                }
                o.LJIJI("upvoteIcon");
                throw null;
            }
            o.LJIJI("upvoteIcon");
            throw null;
        }
        o.LJIJI("upvoteIcon");
        throw null;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d4, code lost:
    
        if (r1 != null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRepostCardAssemAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r70() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentRepostCardAssem.r70():void");
    }

    public final C177336xd v3() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(this), C177336xd.class, "source_default_key");
        if (LIZLLL != null) {
            return (C177336xd) LIZLLL.getSource();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.w1);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.add_repost_comment_text)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.f20);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_divider)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = view.findViewById(R.id.ezq);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.iv_cancel)");
        this.LJLJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.fc7);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.iv_upvote)");
        this.LJLJJI = (SmartImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.w0);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.add_repost_comment_card)");
        this.LJLJJL = (ViewGroup) findViewById5;
        if (C72O.LIZ() && (view instanceof ViewGroup)) {
            Aweme aweme = null;
            this.LJLJJLL = new C174596tD((ViewGroup) view, null, C176356w3.LIZ(C55096Ljo.LJIIZILJ(this)));
            InterfaceC175156u7 LJIL = C7HV.LIZIZ.LJIL();
            C177336xd v3 = v3();
            if (v3 != null) {
                aweme = v3.LJLLI;
            }
            if (LJIL.LIZJ(aweme)) {
                C174076sN.LIZIZ(Boolean.TRUE);
            } else {
                C174076sN.LIZ();
            }
        }
        r70();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IKeyboardProtocol.class, C47261Igj.LJJIJIL(this));
    }
}
