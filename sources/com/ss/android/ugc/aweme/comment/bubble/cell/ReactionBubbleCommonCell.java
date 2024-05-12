package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C110614Vt;
import X.C16880lQ;
import X.C1811078w;
import X.C1811278y;
import X.C78857UxB;
import X.C78939UyV;
import X.C7MY;
import X.FMX;
import X.OSZ;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ReactionBubbleCommonCell extends PowerCell<C1811078w> {
    public SmartImageView LJLIL;
    public TuxIconView LJLILLLLZI;
    public TuxTextView LJLJI;
    public C1811078w LJLJJI;

    public final String L() {
        C1811078w c1811078w = this.LJLJJI;
        if (c1811078w != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c1811078w.LJLIL);
            LIZ.append('_');
            LIZ.append(c1811078w.LJLILLLLZI.getUid());
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1811278y c1811278y;
        Set<String> set;
        String str;
        super.onViewAttachedToWindow();
        C1811078w c1811078w = this.LJLJJI;
        if (c1811078w != null && (c1811278y = c1811078w.LJLJJLL) != null && (set = c1811278y.LJI) != null && !set.contains(L())) {
            set.add(L());
            C1811078w c1811078w2 = this.LJLJJI;
            if (c1811078w2 != null) {
                OSZ[] oszArr = new OSZ[4];
                C1811278y c1811278y2 = c1811078w2.LJLJJLL;
                String str2 = null;
                if (c1811278y2 != null) {
                    str = c1811278y2.LIZIZ;
                } else {
                    str = null;
                }
                oszArr[0] = new OSZ(str, "enter_from");
                C1811278y c1811278y3 = c1811078w2.LJLJJLL;
                if (c1811278y3 != null) {
                    str2 = c1811278y3.LJ;
                }
                oszArr[1] = new OSZ(str2, "story_type");
                oszArr[2] = new OSZ(c1811078w2.LJLJJL, "notice_type");
                oszArr[3] = new OSZ(c1811078w2.LJLILLLLZI.getUid(), "from_user_id");
                FMX.LJIILL("interaction_bullet_show", oszArr);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C1811078w c1811078w) {
        C1811078w item = c1811078w;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.d8);
            c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(24));
            Context context = smartImageView.getContext();
            o.LJIIIIZZ(context, "it.context");
            smartImageView.setBackground(c110614Vt.LIZ(context));
            W5F LJII = W5U.LJII(C78939UyV.LJ(item.LJLILLLLZI.getAvatarThumb()));
            LJII.LIZIZ("ReactionBubbleCommentCell");
            SmartImageView smartImageView2 = this.LJLIL;
            if (smartImageView2 != null) {
                LJII.LJJIIJ = smartImageView2;
                S3I s3i = new S3I();
                s3i.LIZ = true;
                LJII.LJIJJLI = new S3L(s3i);
                LJII.LIZLLL = true;
                C16880lQ.LLJJJ(LJII);
                SmartImageView smartImageView3 = this.LJLIL;
                if (smartImageView3 != null) {
                    C16880lQ.LJJIJLIJ(smartImageView3, new ACListenerS38S0200000_3(this, item, 92));
                    this.LJLJJI = item;
                    TuxIconView tuxIconView = this.LJLILLLLZI;
                    if (tuxIconView != null) {
                        tuxIconView.setVisibility(8);
                        TuxTextView tuxTextView = this.LJLJI;
                        if (tuxTextView != null) {
                            tuxTextView.setVisibility(8);
                            List<Integer> list = item.LJLJI;
                            if (list.size() == 1) {
                                int intValue = ((Number) ListProtector.get(list, 0)).intValue();
                                if (intValue == 1001 || intValue == 1002 || intValue == 1003) {
                                    TuxIconView tuxIconView2 = this.LJLILLLLZI;
                                    if (tuxIconView2 != null) {
                                        tuxIconView2.setVisibility(0);
                                        TuxTextView tuxTextView2 = this.LJLJI;
                                        if (tuxTextView2 != null) {
                                            tuxTextView2.setVisibility(8);
                                            TuxIconView tuxIconView3 = this.LJLILLLLZI;
                                            if (tuxIconView3 != null) {
                                                switch (intValue) {
                                                    case 1001:
                                                        tuxIconView3.setIconRes(R.raw.icon_color_like_circle);
                                                        break;
                                                    case 1002:
                                                        tuxIconView3.setIconRes(R.raw.icon_color_view_circle);
                                                        break;
                                                    case 1003:
                                                        tuxIconView3.setIconRes(R.raw.icon_color_paperplane_circle);
                                                        break;
                                                }
                                            } else {
                                                o.LJIJI("iconIv");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("emojiTv");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("iconIv");
                                        throw null;
                                    }
                                }
                            } else if (C78857UxB.LJJJIL(item.LJLJJI)) {
                                String str = item.LJLJJI;
                                TuxIconView tuxIconView4 = this.LJLILLLLZI;
                                if (tuxIconView4 != null) {
                                    tuxIconView4.setVisibility(8);
                                    TuxTextView tuxTextView3 = this.LJLJI;
                                    if (tuxTextView3 != null) {
                                        tuxTextView3.setVisibility(0);
                                        TuxTextView tuxTextView4 = this.LJLJI;
                                        if (tuxTextView4 != null) {
                                            tuxTextView4.setText(str);
                                        } else {
                                            o.LJIJI("emojiTv");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("emojiTv");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("iconIv");
                                    throw null;
                                }
                            }
                            this.itemView.setVisibility(4);
                            this.itemView.setTag(0);
                            return;
                        }
                        o.LJIJI("emojiTv");
                        throw null;
                    }
                    o.LJIJI("iconIv");
                    throw null;
                }
                o.LJIJI("avatarIv");
                throw null;
            }
            o.LJIJI("avatarIv");
            throw null;
        }
        o.LJIJI("avatarIv");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        View inflate = View.inflate(viewGroup.getContext(), R.layout.p0, null);
        View findViewById = inflate.findViewById(R.id.abk);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.avatarIv)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.ea_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iconIv)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.cu1);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.emojiTv)");
        this.LJLJI = (TuxTextView) findViewById3;
        inflate.setVisibility(4);
        return inflate;
    }
}
