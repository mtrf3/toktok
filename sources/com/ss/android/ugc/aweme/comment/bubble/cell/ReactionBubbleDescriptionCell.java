package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.AV1;
import X.C06460Ne;
import X.C07290Qj;
import X.C110614Vt;
import X.C118824lS;
import X.C1809978l;
import X.C1811278y;
import X.C187227Wk;
import X.C187707Yg;
import X.C188727au;
import X.C19N;
import X.C2051183f;
import X.C2065688u;
import X.C2065988x;
import X.C220488l2;
import X.C222578oP;
import X.C2U8;
import X.C36922EeM;
import X.C42625Go9;
import X.C54838Lfe;
import X.C57072Lv;
import X.C59948Nfs;
import X.C5F1;
import X.C7BR;
import X.C7G0;
import X.C7G6;
import X.C7MY;
import X.C7ZV;
import X.C81Y;
import X.C90193gN;
import X.FMX;
import X.InterfaceC203977zV;
import X.JHM;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.X1D;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ReactionBubbleDescriptionCell extends PowerCell<C1809978l> {
    public SmartImageView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public C187707Yg LJLJJI;
    public C59948Nfs LJLJJL;
    public C5F1 LJLJJLL;
    public TuxTextView LJLJL;
    public C7BR LJLJLJ;
    public C7G0 LJLJLLL;
    public C1809978l LJLL;
    public TextView LJLLI;
    public String LJLLILLLL;
    public final Drawable LJLLJ = C06460Ne.LIZ(this.itemView, "itemView.context", new C110614Vt());
    public final Drawable LJLLL;

    public final String P() {
        C1809978l c1809978l = this.LJLL;
        if (c1809978l != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c1809978l.LJLIL);
            LIZ.append('_');
            LIZ.append(c1809978l.LJLILLLLZI.getUid());
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    public ReactionBubbleDescriptionCell() {
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d0);
        c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(24));
        this.LJLLL = C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1811278y c1811278y;
        Set<String> set;
        String str;
        String authorUid;
        String str2;
        String str3;
        super.onViewAttachedToWindow();
        C1809978l c1809978l = this.LJLL;
        if (c1809978l != null && (c1811278y = c1809978l.LJLJJL) != null && (set = c1811278y.LJI) != null && !set.contains(P())) {
            set.add(P());
            C1809978l c1809978l2 = this.LJLL;
            String str4 = null;
            if (c1809978l2 != null) {
                OSZ[] oszArr = new OSZ[4];
                C1811278y c1811278y2 = c1809978l2.LJLJJL;
                if (c1811278y2 != null) {
                    str2 = c1811278y2.LIZIZ;
                } else {
                    str2 = null;
                }
                oszArr[0] = new OSZ(str2, "enter_from");
                C1811278y c1811278y3 = c1809978l2.LJLJJL;
                if (c1811278y3 != null) {
                    str3 = c1811278y3.LJ;
                } else {
                    str3 = null;
                }
                oszArr[1] = new OSZ(str3, "story_type");
                oszArr[2] = new OSZ("creator", "notice_type");
                oszArr[3] = new OSZ(c1809978l2.LJLILLLLZI.getUid(), "from_user_id");
                FMX.LJIILL("interaction_bullet_show", oszArr);
            }
            C7BR c7br = this.LJLJLJ;
            if (c7br != null && FMX.LIZJ("tag_anchor_show")) {
                C188727au c188727au = new C188727au();
                C1811278y c1811278y4 = c7br.LJLJI;
                if (c1811278y4 != null) {
                    str = c1811278y4.LIZIZ;
                } else {
                    str = null;
                }
                c188727au.LJIIIZ("enter_from", str);
                Aweme aweme = c7br.LJLILLLLZI;
                if (aweme != null) {
                    str4 = aweme.getAid();
                }
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                c188727au.LJIIIZ("group_id", str4);
                Aweme aweme2 = c7br.LJLILLLLZI;
                if (aweme2 != null && (authorUid = aweme2.getAuthorUid()) != null) {
                    str5 = authorUid;
                }
                c188727au.LJIIIZ("author_id", str5);
                c188727au.LJIIIZ("anchor_type", "low_interest");
                FMX.LJIIL("tag_anchor_show", c188727au.LIZ);
            }
            C7G0 c7g0 = this.LJLJLLL;
            if (c7g0 != null) {
                C7G6 c7g6 = c7g0.LJLIL;
                c7g6.LJLIL.LIZ(c7g6);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        C1811278y c1811278y;
        Set<String> set;
        super.onViewDetachedFromWindow();
        C1809978l c1809978l = this.LJLL;
        if (c1809978l != null && (c1811278y = c1809978l.LJLJJL) != null && (set = c1811278y.LJI) != null) {
            set.clear();
        }
    }

    public final void L(Aweme aweme) {
        C81Y c81y;
        C81Y c81y2;
        int i;
        if (aweme == null) {
            return;
        }
        if (C54838Lfe.LJIIZILJ(aweme)) {
            View view = this.itemView;
            if ((view instanceof C81Y) && (c81y2 = (C81Y) view) != null) {
                c81y2.setBackground(this.LJLLJ);
                Integer[] numArr = {Integer.valueOf(R.attr.gh), Integer.valueOf(R.attr.gg), Integer.valueOf(R.attr.gf)};
                ArrayList arrayList = new ArrayList(3);
                int i2 = 0;
                do {
                    Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", numArr[i2].intValue());
                    if (LIZIZ != null) {
                        i = LIZIZ.intValue();
                    } else {
                        i = 0;
                    }
                    arrayList.add(Integer.valueOf(C07290Qj.LJIIL(i, 128)));
                    i2++;
                } while (i2 < 3);
                int[] LLJ = ORZ.LLJ(arrayList);
                float[] LJJLIIJ = ORY.LJJLIIJ(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.5f), Float.valueOf(1.0f)});
                float LIZIZ2 = C7MY.LIZIZ(24);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
                o.LJIIIZ(orientation, "orientation");
                c81y2.LJLJL = LLJ;
                c81y2.LJLJLJ = LJJLIIJ;
                c81y2.LJLJJI = LIZIZ2;
                c81y2.LJLJLLL = orientation;
                return;
            }
            return;
        }
        View view2 = this.itemView;
        if ((view2 instanceof C81Y) && (c81y = (C81Y) view2) != null) {
            c81y.setColors(null);
            c81y.setPositions(null);
            c81y.setLg(null);
            c81y.setBackground(this.LJLLL);
        }
    }

    public final void N(C1809978l c1809978l) {
        int i;
        boolean z;
        C187707Yg c187707Yg;
        String aid = c1809978l.LJLJI.getAid();
        C187707Yg c187707Yg2 = this.LJLJJI;
        if (c187707Yg2 != null) {
            i = c187707Yg2.getLineCount();
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        if (((Boolean) C2051183f.LIZ.getValue()).booleanValue() || ((c187707Yg = this.LJLJJI) != null && c187707Yg.getShowingEllipsize())) {
            z = true;
        } else {
            z = false;
        }
        C2U8.LIZ(new C57072Lv("bubble_desc_click_faker_cid", false, aid, valueOf, z));
        Q(c1809978l.LJLILLLLZI, c1809978l.LJLJJL);
    }

    public final void T(C1809978l c1809978l) {
        String string;
        boolean z;
        String LJJJJZ;
        if (c1809978l == null) {
            return;
        }
        if (C54838Lfe.LJIIZILJ(c1809978l.LJLJI)) {
            string = this.itemView.getResources().getString(R.string.qgt);
        } else {
            string = this.itemView.getContext().getString(R.string.g41);
        }
        o.LJIIIIZZ(string, "if (isStoryAweme(item.aw…posted_a_video)\n        }");
        final C187707Yg c187707Yg = this.LJLJJI;
        if (c187707Yg != null) {
            Aweme aweme = c1809978l.LJLJI;
            C1811278y c1811278y = c1809978l.LJLJJL;
            o.LJIIIZ(aweme, "aweme");
            c187707Yg.LLFF = aweme;
            c187707Yg.LLFFF = c1811278y;
            c187707Yg.LLF = false;
            String desc = aweme.getDesc();
            if (desc == null || desc.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LJJJJZ = ujb.o.LJJJJZ(string, " ", " ", false);
            } else {
                String desc2 = aweme.getDesc();
                o.LJIIIIZZ(desc2, "aweme.desc");
                LJJJJZ = ujb.o.LJJJJZ(desc2, " ", " ", false);
            }
            SpannableStringBuilder text = new SpannableStringBuilder(LJJJJZ).append((CharSequence) c187707Yg.LJJJ(aweme));
            if (!TextUtils.isEmpty(text)) {
                o.LJIIIIZZ(text, "text");
                c187707Yg.LJJJI(text, false, 0);
                c187707Yg.setVisibility(0);
                C118824lS.LIZJ(c187707Yg, null);
            } else {
                c187707Yg.setVisibility(8);
            }
            Integer num = c187707Yg.LLFZ;
            if (num != null) {
                c187707Yg.setTextColor(num.intValue());
            }
            c187707Yg.setSpanColor(c187707Yg.getCurrentTextColor());
            c187707Yg.setOnSpanClickListener(new InterfaceC203977zV() { // from class: X.7Fu
                @Override // X.InterfaceC203977zV
                public final void LIZ(TextExtraStruct textExtraStruct) {
                    InterfaceC65784Pro<C76800UCe> spanClickInterceptor;
                    if (C187707Yg.this.getSpanClickInterceptor() != null && (spanClickInterceptor = C187707Yg.this.getSpanClickInterceptor()) != null) {
                        spanClickInterceptor.invoke();
                    }
                }
            });
            c187707Yg.setSpanColor(c187707Yg.getCurrentTextColor());
            final Aweme aweme2 = c187707Yg.LLFF;
            if (aweme2 != null) {
                try {
                    if (C90193gN.LIZIZ(c187707Yg.getContext())) {
                        if (C2065688u.LIZ == null) {
                            C2065688u.LIZ = new C2065688u();
                        }
                        c187707Yg.setMovementMethod(C2065688u.LIZ);
                    } else {
                        c187707Yg.setMovementMethod(C2065988x.LIZ());
                    }
                } catch (IndexOutOfBoundsException e) {
                    C36922EeM.LIZ(e);
                }
                c187707Yg.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.7Yf
                    /* JADX WARN: Can't wrap try/catch for region: R(16:12|(1:14)(1:59)|15|(1:17)|18|(2:20|(5:(1:23)(1:33)|24|25|(1:29)|30))|34|35|36|(2:38|39)(4:45|(4:47|(2:(1:51)(1:52)|48)|53|54)|56|57)|40|(1:42)(1:44)|43|25|(2:27|29)|30) */
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onGlobalLayout() {
                        /*
                            Method dump skipped, instructions count: 467
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC187697Yf.onGlobalLayout():void");
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x023e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026d  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C1809978l r12) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        View inflate = View.inflate(viewGroup.getContext(), R.layout.qx, null);
        this.LJLIL = (SmartImageView) inflate.findViewById(R.id.abk);
        this.LJLILLLLZI = (TuxTextView) inflate.findViewById(R.id.gvu);
        this.LJLJI = (TuxTextView) inflate.findViewById(R.id.l7q);
        this.LJLJJI = (C187707Yg) inflate.findViewById(R.id.c70);
        this.LJLJJL = (C59948Nfs) inflate.findViewById(R.id.hgy);
        this.LJLJJLL = (C5F1) inflate.findViewById(R.id.qv);
        this.LJLJLJ = (C7BR) inflate.findViewById(R.id.b0o);
        this.LJLJLLL = (C7G0) inflate.findViewById(R.id.gpo);
        this.LJLJL = (TuxTextView) inflate.findViewById(R.id.zl);
        this.LJLLI = (TextView) inflate.findViewById(R.id.bug);
        C42625Go9.LIZIZ(this);
        return inflate;
    }

    @QD3
    public final void onPrivateModelEvent(C187227Wk privateModelEvent) {
        String str;
        Aweme aweme;
        o.LJIIIZ(privateModelEvent, "privateModelEvent");
        Aweme aweme2 = privateModelEvent.LJLILLLLZI;
        if (aweme2 != null) {
            C1809978l item = getItem();
            Aweme aweme3 = null;
            if (item != null && (aweme = item.LJLJI) != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (o.LJ(str, aweme2.getAid())) {
                T(getItem());
                C1809978l item2 = getItem();
                if (item2 != null) {
                    aweme3 = item2.LJLJI;
                }
                L(aweme3);
            }
        }
    }

    public final void M(User user, C1811278y c1811278y) {
        if (AV1.LJIJI(user.getUid())) {
            return;
        }
        if (c1811278y != null) {
            C220488l2 c220488l2 = C220488l2.LIZIZ;
            C7ZV c7zv = new C7ZV();
            c7zv.LJJIJ(c1811278y.LIZ);
            String str = c1811278y.LIZIZ;
            if (str == null) {
                str = "";
            }
            c7zv.LIZLLL = str;
            c7zv.LJJLI = "click_head";
            c7zv.LJJLJLI = "bullet";
            c7zv.LJJLL = "bullet";
            c7zv.LJJJJZ = c1811278y.LIZLLL;
            Object LJII = c220488l2.LJII(c1811278y.LIZ, c7zv);
            C222578oP.LIZJ(LJII, c1811278y.LIZ, null, null, 14);
            ((JHM) LJII).LJIILIIL();
        }
        Q(user, c1811278y);
        Context context = this.itemView.getContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://user/profile/");
        LIZ.append(user.getUid());
        SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ));
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.open();
    }

    public final void Q(User user, C1811278y c1811278y) {
        String str;
        String str2;
        OSZ[] oszArr = new OSZ[4];
        Aweme aweme = null;
        if (c1811278y != null) {
            str = c1811278y.LIZIZ;
        } else {
            str = null;
        }
        oszArr[0] = new OSZ(str, "enter_from");
        if (c1811278y != null) {
            aweme = c1811278y.LIZ;
        }
        if (C54838Lfe.LJIIZILJ(aweme)) {
            str2 = "story";
        } else {
            str2 = "post";
        }
        oszArr[1] = new OSZ(str2, "story_type");
        oszArr[2] = new OSZ("creator", "notice_type");
        oszArr[3] = new OSZ(user.getUid(), "from_user_id");
        FMX.LJIILL("interaction_bullet_click", oszArr);
    }
}
