package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C06490Nh;
import X.C110614Vt;
import X.C116724i4;
import X.C16880lQ;
import X.C1809878k;
import X.C1811278y;
import X.C32151Nz;
import X.C54838Lfe;
import X.C78939UyV;
import X.C7MY;
import X.FMX;
import X.InterfaceC57784Mm4;
import X.O6R;
import X.OSZ;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class ReactionBubbleContentCell<ITEM extends C1809878k> extends PowerCell<ITEM> {
    public SmartImageView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxIconView LJLJJI;
    public TuxTextView LJLJJL;

    public abstract String L(ITEM item);

    public abstract C1811278y M();

    public abstract String N(ITEM item);

    public abstract String P(ITEM item);

    public abstract boolean T(ITEM item);

    public abstract String V();

    public abstract void X(View view);

    public abstract User getUser();

    public final void Q(boolean z) {
        float f;
        TextPaint paint;
        TextPaint paint2;
        CharSequence charSequence;
        if (z) {
            TuxTextView tuxTextView = this.LJLILLLLZI;
            CharSequence charSequence2 = null;
            float f2 = 0.0f;
            if (tuxTextView != null && (paint2 = tuxTextView.getPaint()) != null) {
                TuxTextView tuxTextView2 = this.LJLILLLLZI;
                if (tuxTextView2 != null) {
                    charSequence = tuxTextView2.getText();
                } else {
                    charSequence = null;
                }
                f = paint2.measureText(String.valueOf(charSequence));
            } else {
                f = 0.0f;
            }
            TuxTextView tuxTextView3 = this.LJLJJL;
            if (tuxTextView3 != null && (paint = tuxTextView3.getPaint()) != null) {
                TuxTextView tuxTextView4 = this.LJLJJL;
                if (tuxTextView4 != null) {
                    charSequence2 = tuxTextView4.getText();
                }
                f2 = paint.measureText(String.valueOf(charSequence2));
            }
            if (f + f2 > C7MY.LIZIZ(220)) {
                if (f2 < C7MY.LIZIZ(60)) {
                    TuxTextView tuxTextView5 = this.LJLILLLLZI;
                    if (tuxTextView5 == null) {
                        return;
                    }
                    tuxTextView5.setMaxWidth((int) (C7MY.LIZIZ(220) - f2));
                    return;
                }
                TuxTextView tuxTextView6 = this.LJLILLLLZI;
                if (tuxTextView6 != null) {
                    tuxTextView6.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(160)));
                }
                TuxTextView tuxTextView7 = this.LJLJJL;
                if (tuxTextView7 == null) {
                    return;
                }
                tuxTextView7.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(60)));
                return;
            }
            return;
        }
        TuxTextView tuxTextView8 = this.LJLILLLLZI;
        if (tuxTextView8 == null) {
            return;
        }
        tuxTextView8.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(236)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        TuxTextView tuxTextView;
        C1809878k item = (C1809878k) interfaceC57784Mm4;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        User user = getUser();
        if (user == null) {
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(user.getAvatarThumb()));
        LJII.LIZIZ("ReactionBubbleCommentCell");
        LJII.LJJIIJ = this.LJLIL;
        S3I s3i = new S3I();
        s3i.LIZ = true;
        LJII.LJIJJLI = new S3L(s3i);
        LJII.LIZLLL = true;
        C16880lQ.LLJJJ(LJII);
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, user, 93), this.itemView);
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS38S0200000_3(this, user, 94));
        }
        TuxTextView tuxTextView2 = this.LJLILLLLZI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(N(item));
        }
        String L = L(item);
        if (L != null && L.length() != 0 && (tuxTextView = this.LJLJI) != null) {
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZIZ(L);
            tuxTextView.setText(c116724i4.LIZ);
        }
        String P = P(item);
        if (TextUtils.isEmpty(P)) {
            TuxIconView tuxIconView = this.LJLJJI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            TuxTextView tuxTextView3 = this.LJLJJL;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(8);
            }
            Q(false);
        } else {
            TuxIconView tuxIconView2 = this.LJLJJI;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
            }
            TuxTextView tuxTextView4 = this.LJLJJL;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(0);
            }
            TuxTextView tuxTextView5 = this.LJLJJL;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(P);
            }
            Q(true);
        }
        if (T(item)) {
            this.itemView.setVisibility(0);
            this.itemView.setTag(1);
        } else {
            this.itemView.setVisibility(4);
            this.itemView.setTag(0);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "viewGroup", R.layout.qw, viewGroup, false);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d8);
        c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(24));
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "viewGroup.context");
        LIZIZ.setBackground(c110614Vt.LIZ(context));
        this.LJLIL = (SmartImageView) LIZIZ.findViewById(R.id.abk);
        this.LJLILLLLZI = (TuxTextView) LIZIZ.findViewById(R.id.gvu);
        this.LJLJI = (TuxTextView) LIZIZ.findViewById(R.id.c6z);
        this.LJLJJI = (TuxIconView) LIZIZ.findViewById(R.id.ivw);
        this.LJLJJL = (TuxTextView) LIZIZ.findViewById(R.id.ivx);
        LIZIZ.setVisibility(4);
        return LIZIZ;
    }

    public final void U(User user, C1811278y c1811278y) {
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
        oszArr[1] = new OSZ(V(), "notice_type");
        if (c1811278y != null) {
            aweme = c1811278y.LIZ;
        }
        if (C54838Lfe.LJIIZILJ(aweme)) {
            str2 = "story";
        } else {
            str2 = "post";
        }
        oszArr[2] = new OSZ(str2, "story_type");
        oszArr[3] = new OSZ(user.getUid(), "from_user_id");
        FMX.LJIILL("interaction_bullet_click", oszArr);
    }
}
