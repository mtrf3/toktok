package com.ss.android.ugc.aweme.relation.fragment.muflist;

import X.C16880lQ;
import X.C1DI;
import X.C221108m2;
import X.C226668v0;
import X.C57802MmM;
import X.C62822Ol8;
import X.C78939UyV;
import X.EnumC112694bZ;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import Y.ACListenerS29S0100000_9;
import Y.ACListenerS44S0200000_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MufSearchCell extends PowerCell<C57802MmM> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 541));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 543));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 542));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C57802MmM c57802MmM) {
        C57802MmM t = c57802MmM;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        TextView textView = (TextView) this.LJLILLLLZI.getValue();
        String name = t.LJLILLLLZI.getNickName();
        if (name == null || name.length() == 0) {
            name = t.LJLILLLLZI.getUniqueId();
        }
        o.LJIIIIZZ(name, "name");
        textView.setText(name);
        RelationButton relationButton = (RelationButton) this.LJLJI.getValue();
        C226668v0 c226668v0 = new C226668v0();
        c226668v0.LIZ = IMUser.toUser(t.LJLILLLLZI);
        c226668v0.LIZIZ(EnumC112694bZ.MESSAGE);
        relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
        ((RelationButton) this.LJLJI.getValue()).setTracker(new AqS156S0200000_9(this, t, 92));
        C16880lQ.LJIIJ(new ACListenerS44S0200000_9(t, this, 32), this.itemView);
        C16880lQ.LJJJJL((SmartAvatarImageView) this.LJLIL.getValue(), new ACListenerS29S0100000_9(this, 141));
        UrlModel avatarThumb = t.LJLILLLLZI.getAvatarThumb();
        o.LJIIIIZZ(avatarThumb, "this.imUser.avatarThumb");
        W5F LJII = W5U.LJII(C78939UyV.LJ(avatarThumb));
        LJII.LJJIIJ = (SmartImageView) this.LJLIL.getValue();
        S3I s3i = new S3I();
        s3i.LIZ = true;
        LJII.LJIJJLI = new S3L(s3i);
        LJII.LIZLLL = true;
        C16880lQ.LLJJJ(LJII);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.aya, viewGroup, false, "from(parent.context)\n   …ll_layout, parent, false)");
    }
}
