package com.ss.android.ugc.aweme.notification.cell;

import X.AnonymousClass636;
import X.C06490Nh;
import X.C119624mk;
import X.C16880lQ;
import X.C221108m2;
import X.C53341Kwb;
import X.C56824MRw;
import X.C62822Ol8;
import X.C78765Uvh;
import X.MVP;
import X.MVR;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeChannelInfoCell extends PowerCell<C56824MRw> {
    public C119624mk LJLIL;
    public TuxTextView LJLILLLLZI;
    public ImageView LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 362));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 25), this.itemView);
        C119624mk c119624mk = this.LJLIL;
        if (c119624mk != null) {
            C16880lQ.LJJJJIZL(c119624mk, new ACListenerS29S0100000_9(this, 26));
        }
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(this.LJLIL, MVP.AVATAR, 0.0f);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C56824MRw c56824MRw) {
        C56824MRw t = c56824MRw;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        Context context = getContext();
        if (context != null && AnonymousClass636.LJIILJJIL(context)) {
            C78765Uvh.LJFF(this.LJLIL, t.LJLIL.logoDark);
        } else {
            C78765Uvh.LJFF(this.LJLIL, t.LJLIL.logo);
        }
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setText(t.LJLIL.name);
        }
        if (t.LJLIL.hasRead) {
            ImageView imageView = this.LJLJI;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.LJLJI;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.s_, viewGroup, false);
        this.LJLIL = (C119624mk) LIZIZ.findViewById(R.id.ew1);
        this.LJLILLLLZI = (TuxTextView) LIZIZ.findViewById(R.id.lvt);
        this.LJLJI = (ImageView) LIZIZ.findViewById(R.id.ewq);
        return LIZIZ;
    }
}
