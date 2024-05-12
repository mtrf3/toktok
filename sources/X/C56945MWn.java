package X;

import Y.ACListenerS39S0200000_4;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MWn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56945MWn extends AbstractC51777KTt<User> {
    @Override // X.AbstractC51777KTt
    public final RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup) {
        o.LJI(viewGroup);
        return new C56946MWo(C1FL.LIZIZ(viewGroup, R.layout.dto, viewGroup, false, "from(parent!!.context).i…user_item, parent, false)"));
    }

    @Override // X.AbstractC51777KTt
    public final void LJLLLLLL(RecyclerView.ViewHolder viewHolder, int i) {
        List<User> data = getData();
        if (data == null) {
            return;
        }
        o.LJII(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh.PollUserViewHolder");
        C56946MWo c56946MWo = (C56946MWo) viewHolder;
        Object obj = ListProtector.get(data, i);
        o.LJIIIIZZ(obj, "notNullData[position]");
        User user = (User) obj;
        C78765Uvh.LJFF(c56946MWo.LJLIL, user.getAvatarMedium());
        c56946MWo.LJLILLLLZI.setText(AV1.LIZ(user, true));
        c56946MWo.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS39S0200000_4(c56946MWo, user, 107)));
        C16880lQ.LJIJI(c56946MWo.LJLILLLLZI, new ACListenerS39S0200000_4(c56946MWo, user, 108));
        c56946MWo.LJLJJLL = C47261Igj.LJJIJ(user);
        c56946MWo.LJLJJI.setVisibility(8);
        C57446Mgc c57446Mgc = c56946MWo.LJLJJL;
        C7YW c7yw = new C7YW();
        c7yw.LIZ = user;
        c7yw.LIZIZ(EnumC57119MbL.NORMAL);
        c57446Mgc.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
        c56946MWo.LJLJJL.setDataChangeListener(new AqS140S0200000_9(user, c56946MWo, 94));
        C57434MgQ.LIZIZ.contains(Integer.valueOf(user.getFollowStatus()));
        C26338AVi.LJI(c56946MWo.LJLJJL, AnonymousClass391.LIZJ(4), null, null, null, false, 30);
        C55888Lwa.LIZIZ.LIZIZ().LIZJ(c56946MWo.LJLJJL, "", C47261Igj.LJJIJ(user), false, null);
    }
}
