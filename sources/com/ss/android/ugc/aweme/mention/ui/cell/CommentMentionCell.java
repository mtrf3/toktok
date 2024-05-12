package com.ss.android.ugc.aweme.mention.ui.cell;

import X.AJ9;
import X.AP9;
import X.C107724Kq;
import X.C118264kY;
import X.C16880lQ;
import X.C1794472m;
import X.C1794572n;
import X.C1DI;
import X.C217868go;
import X.C217888gq;
import X.C221108m2;
import X.C3B3;
import X.C56331M8x;
import X.C62822Ol8;
import X.C78897Uxp;
import X.C78946Uyc;
import X.C7DS;
import X.QD3;
import X.Y9G;
import X.Y9H;
import Y.ACListenerS23S0100000_3;
import Y.AObserverS69S0100000_1;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class CommentMentionCell extends PowerCell<C217868go> {
    public LiveData<ActivityStatus> LJLILLLLZI;
    public String LJLJI;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C217888gq.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 679));

    public final boolean L() {
        C217868go item;
        Y9G y9g;
        return IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF() && (item = getItem()) != null && (y9g = item.LJLIL) != null && y9g.LIZIZ == 2;
    }

    public final C107724Kq M() {
        return (C107724Kq) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 90), this.itemView);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78897Uxp.LJJJJJ(itemView, 0);
        C16880lQ.LJJJJI((TuxTextView) this.itemView.findViewById(R.id.m8q), new ACListenerS23S0100000_3(this, 91));
        this.itemView.findViewById(R.id.pq).setVisibility(8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onCreate() {
        super.onCreate();
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onDestroy() {
        super.onDestroy();
        LiveData<ActivityStatus> liveData = this.LJLILLLLZI;
        if (liveData != null) {
            liveData.removeObservers(this);
        }
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        LiveData<ActivityStatus> liveData = this.LJLILLLLZI;
        if (liveData != null) {
            liveData.observe(this, new AObserverS69S0100000_1(this, 119));
        }
        if (L()) {
            C107724Kq M = M();
            M.LJFF = Integer.valueOf(getBindingAdapterPosition());
            C78946Uyc.LJJIJL(M);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        LiveData<ActivityStatus> liveData = this.LJLILLLLZI;
        if (liveData != null) {
            liveData.removeObservers(this);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C217868go c217868go) {
        float f;
        boolean z;
        String str;
        C217868go t = c217868go;
        o.LJIIIZ(t, "t");
        View view = this.itemView;
        if (t.LJLIL.LJIJI.LIZ) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        view.setAlpha(f);
        Context context = this.itemView.getContext();
        SpannableString spannableString = new SpannableString(C56331M8x.LIZ(Y9H.LIZJ(t.LJLIL), false, false));
        AP9 ap9 = (AP9) this.itemView.findViewById(R.id.jd7);
        Y9G y9g = t.LJLIL;
        ap9.setUserData(new UserVerify(y9g.LJFF, y9g.LJIIIIZZ, y9g.LJIIIZ, Integer.valueOf(y9g.LJIIJ)));
        List<Position> list = t.LJLIL.LJIJI.LJII;
        boolean z2 = true;
        if (list != null && !list.isEmpty()) {
            for (Position position : t.LJLIL.LJIJI.LJII) {
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C118264kY.LIZIZ(itemView, spannableString, position.getBegin(), position.getEnd() + 1);
            }
        }
        ((AP9) this.itemView.findViewById(R.id.jd7)).LIZ();
        Context context2 = this.itemView.getContext();
        Y9G y9g2 = t.LJLIL;
        AJ9.LJ(context2, y9g2.LJIIIIZZ, y9g2.LJIIIZ, (TextView) this.itemView.findViewById(R.id.mby));
        this.itemView.findViewById(R.id.m8q).setVisibility(8);
        this.itemView.findViewById(R.id.mk_).setVisibility(0);
        String LIZ = ((ISearchUserService) this.LJLIL.getValue()).LIZ(context, t.LJLIL.LJIJI.LJ);
        if (LIZ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LIZ = ((ISearchUserService) this.LJLIL.getValue()).LIZJ(context, Integer.valueOf(t.LJLIL.LIZIZ));
        }
        if (LIZ.length() <= 0) {
            z2 = false;
        }
        if (z2 && ((ISearchUserService) this.LJLIL.getValue()).LJ()) {
            ((TextView) this.itemView.findViewById(R.id.m75)).setText(" · ".concat(LIZ));
            this.itemView.findViewById(R.id.m75).setVisibility(0);
        } else {
            this.itemView.findViewById(R.id.m75).setVisibility(8);
        }
        ((TextView) this.itemView.findViewById(R.id.mk_)).setText(spannableString);
        ((TextView) this.itemView.findViewById(R.id.mby)).setText(C56331M8x.LIZIZ(Y9H.LIZJ(t.LJLIL), false, false));
        this.itemView.findViewById(R.id.pq).setVisibility(8);
        this.LJLJI = t.LJLIL.LIZ;
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        if (L()) {
            LiveData<ActivityStatus> LIZ2 = C3B3.LIZ(createIIMServicebyMonsterPlugin.getActivityStatusViewModel(), t.LJLIL.LIZ, null, null, 14);
            this.LJLILLLLZI = LIZ2;
            if (LIZ2 != null) {
                LIZ2.observe(this, new AObserverS69S0100000_1(this, 119));
            }
        }
        if (t.LJLIL.LJIJI.LIZJ) {
            C7DS.LIZIZ("trending_words_show", new AqS134S0200000_3(t, this, 245));
        }
        C107724Kq M = M();
        C1794472m c1794472m = t.LJLJI;
        if (c1794472m == null || (str = c1794472m.LIZ) == null) {
            str = "";
        }
        M.LIZLLL = str;
        M.LIZJ = t.LJLIL.LIZ;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bs8, viewGroup, false, "from(parent.context)\n   …list_item, parent, false)");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onMentionPanelEvent(C1794572n c1794572n) {
        LifecycleOwner lifecycleOwner;
        if (c1794572n == null || c1794572n.LJLIL || (lifecycleOwner = M().LIZ) == null) {
            return;
        }
        IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LIZJ(lifecycleOwner);
    }
}
