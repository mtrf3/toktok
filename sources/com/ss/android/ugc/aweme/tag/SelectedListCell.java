package com.ss.android.ugc.aweme.tag;

import X.C16880lQ;
import X.C1DI;
import X.C214298b3;
import X.C246899mX;
import X.C248429p0;
import X.C248439p1;
import X.C248449p2;
import X.C248459p3;
import X.C27710AuA;
import X.C27711AuB;
import X.C27712AuC;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78765Uvh;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.QD3;
import X.YE1;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class SelectedListCell extends PowerCell<C246899mX> {
    public final C214298b3 LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 185), this.itemView);
    }

    public SelectedListCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTagFriendsListViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 858);
        C248429p0 c248429p0 = C248429p0.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27711AuB.INSTANCE, new AqS154S0100000_4(this, 859), new AqS154S0100000_4(this, 860), C248459p3.INSTANCE, c248429p0, new AqS154S0100000_4(this, 861), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27712AuC.INSTANCE, new AqS154S0100000_4(this, 862), new AqS154S0100000_4(this, 853), C248449p2.INSTANCE, c248429p0, new AqS154S0100000_4(this, 854), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27710AuA.INSTANCE, new AqS154S0100000_4(this, 855), new AqS154S0100000_4(this, 856), new AqS154S0100000_4(this, 857), c248429p0, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C246899mX c246899mX) {
        C246899mX friendsListItem = c246899mX;
        o.LJIIIZ(friendsListItem, "friendsListItem");
        View view = this.itemView;
        C78765Uvh.LJFF((C62846OlW) view.findViewById(R.id.abt), friendsListItem.LJLIL.getDisplayAvatar());
        TextView textView = (TextView) view.findViewById(R.id.l0p);
        this.LJLIL.getValue();
        textView.setText(VideoTagFriendsListViewModel.hv0(friendsListItem.LJLIL));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBrandedContentPageEvent(C248439p1 event) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        o.LJIIIZ(event, "event");
        VideoTagFriendsListViewModel videoTagFriendsListViewModel = (VideoTagFriendsListViewModel) this.LJLIL.getValue();
        int i = event.LJLIL;
        boolean z = event.LJLILLLLZI;
        Aweme aweme = videoTagFriendsListViewModel.gv0().getAweme();
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            commerceVideoAuthInfo.setBrandedContentType(i);
            commerceVideoAuthInfo.setAdvPromotable(z);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bsd, viewGroup, false, "from(parent.context)\n   …_headview, parent, false)");
    }
}
