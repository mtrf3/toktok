package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Ga, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106524Ga extends BaseAdapter {
    public final List<C105454Bx> LJLIL = new ArrayList();

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    public C106524Ga(C106564Ge c106564Ge) {
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ListProtector.get(this.LJLIL, i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C106534Gb c106534Gb;
        int i2;
        C105454Bx c105454Bx = (C105454Bx) ListProtector.get(this.LJLIL, i);
        if (view != null && c105454Bx != null && c105454Bx.equals(view.getTag(R.id.fdv))) {
            return view;
        }
        if (view == null) {
            LayoutInflater LLZIL = C16880lQ.LLZIL(viewGroup.getContext());
            if (i == ((ArrayList) this.LJLIL).size() - 1) {
                i2 = R.layout.atn;
            } else {
                i2 = R.layout.atl;
            }
            view = C16880lQ.LLLLIILL(LLZIL, i2, viewGroup, false);
            c106534Gb = new C106534Gb(view);
            view.setTag(R.id.fdu, c106534Gb);
        } else {
            c106534Gb = (C106534Gb) view.getTag(R.id.fdu);
        }
        view.setTag(R.id.fdv, c105454Bx);
        if (c105454Bx == null) {
            c106534Gb.getClass();
        } else {
            if (c106534Gb.LJLIL != null) {
                if (c105454Bx.LIZ() && c105454Bx.LIZJ.getStaticUrl() != null) {
                    c106534Gb.LJLIL.getHierarchy().LJIIZILJ(R.drawable.ast);
                    c106534Gb.LJLIL.getHierarchy().LJIJ(R.drawable.ast);
                } else {
                    c106534Gb.LJLIL.getHierarchy().LJIILL(null, 5);
                    c106534Gb.LJLIL.getHierarchy().LJIILL(null, 1);
                }
            }
            Context context = c106534Gb.itemView.getContext();
            if (c105454Bx.LIZ() && (c105454Bx.LIZJ instanceof ImSysEmojiModel)) {
                TextView textView = c106534Gb.LJLILLLLZI;
                if (textView != null) {
                    textView.setVisibility(0);
                    c106534Gb.LJLILLLLZI.setText(((ImSysEmojiModel) c105454Bx.LIZJ).getPreviewEmoji());
                    c106534Gb.LJLILLLLZI.setContentDescription(context.getString(R.string.g25, c105454Bx.LIZIZ));
                }
            } else {
                if (c106534Gb.LJLIL != null) {
                    if (!c105454Bx.LIZ() && c105454Bx.LIZ > 0) {
                        c106534Gb.LJLIL.setVisibility(0);
                        c106534Gb.LJLIL.setImageResource(c105454Bx.LIZ);
                        c106534Gb.LJLIL.setContentDescription(context.getString(R.string.g25, c105454Bx.LIZIZ));
                    } else {
                        c106534Gb.LJLIL.setVisibility(8);
                    }
                }
                TextView textView2 = c106534Gb.LJLILLLLZI;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
        }
        return view;
    }
}
