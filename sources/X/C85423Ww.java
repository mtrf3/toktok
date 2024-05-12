package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85423Ww extends RecyclerView.ViewHolder {
    public SmartAvatarImageView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public LinearLayout LJLJJL;

    public C85423Ww(View view) {
        super(view);
    }

    public final void L(C80353Dj c80353Dj, View.OnClickListener onClickListener) {
        View findViewById = this.itemView.findViewById(R.id.ios);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.reaction_avatar)");
        this.LJLIL = (SmartAvatarImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.iou);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.reaction_emoji)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.ip0);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.reaction_username)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ioz);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.….reaction_text_container)");
        this.LJLJJL = (LinearLayout) findViewById4;
        if (c80353Dj.LJLJJLL) {
            View findViewById5 = this.itemView.findViewById(R.id.ioy);
            o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.reaction_tap_to_remove)");
            TuxTextView tuxTextView = (TuxTextView) findViewById5;
            this.LJLJJI = tuxTextView;
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = this.LJLJJI;
            if (tuxTextView2 != null) {
                C1DG.LJI(this.itemView, R.string.eph, tuxTextView2);
                LinearLayout linearLayout = this.LJLJJL;
                if (linearLayout != null) {
                    C16880lQ.LJIIZILJ(linearLayout, onClickListener);
                    TuxTextView tuxTextView3 = this.LJLILLLLZI;
                    if (tuxTextView3 != null) {
                        C16880lQ.LJJJJI(tuxTextView3, onClickListener);
                        TuxTextView tuxTextView4 = this.LJLILLLLZI;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setTag(1);
                            LinearLayout linearLayout2 = this.LJLJJL;
                            if (linearLayout2 != null) {
                                linearLayout2.setTag(1);
                            } else {
                                o.LJIJI("textContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("emojiView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("emojiView");
                        throw null;
                    }
                } else {
                    o.LJIJI("textContainer");
                    throw null;
                }
            } else {
                o.LJIJI("actionHintView");
                throw null;
            }
        } else {
            this.itemView.setTag(0);
            C16880lQ.LJIIJ(onClickListener, this.itemView);
        }
        SmartAvatarImageView smartAvatarImageView = this.LJLIL;
        if (smartAvatarImageView != null) {
            C16880lQ.LJJJJL(smartAvatarImageView, onClickListener);
            TuxTextView tuxTextView5 = this.LJLJI;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(c80353Dj.LJLIL);
                TuxTextView tuxTextView6 = this.LJLILLLLZI;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(c80353Dj.LJLJJI);
                    W5F LJII = W5U.LJII(C78939UyV.LJ(c80353Dj.LJLJI));
                    LJII.LJIILL = R.drawable.b0p;
                    LJII.LJJIII = EnumC62195Ob1.SMALL;
                    SmartAvatarImageView smartAvatarImageView2 = this.LJLIL;
                    if (smartAvatarImageView2 != null) {
                        LJII.LJJIIJ = smartAvatarImageView2;
                        C43659HBn.LJIIZILJ(LJII, "ReactionRecordViewHolder:avatar", c80353Dj.LJLILLLLZI, 0, null, 28);
                        return;
                    } else {
                        o.LJIJI("avatarView");
                        throw null;
                    }
                }
                o.LJIJI("emojiView");
                throw null;
            }
            o.LJIJI("usernameView");
            throw null;
        }
        o.LJIJI("avatarView");
        throw null;
    }
}
