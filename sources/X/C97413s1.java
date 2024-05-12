package X;

import Y.ACListenerS20S0101000_1;
import Y.AObserverS69S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.DmViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3s1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97413s1 extends C8HS<C97383ry> {
    public static final int LJLJJI = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
    public final MessageRequestViewModel LJLIL;
    public final C29S LJLILLLLZI;
    public final EnumC97443s4 LJLJI;

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        SessionListViewHolder sessionListViewHolder;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof SessionListViewHolder) && (sessionListViewHolder = (SessionListViewHolder) holder) != null) {
            sessionListViewHolder.N();
        }
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        C97383ry c97383ry;
        int i2;
        SessionListViewHolder sessionListViewHolder;
        o.LJIIIZ(holder, "holder");
        List<T> list = this.mmItems;
        if (list != 0) {
            c97383ry = (C97383ry) ListProtector.get(list, i);
        } else {
            c97383ry = null;
        }
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C4T2 c4t2 = this.LJLIL.getState().LJLIL;
        if (c97383ry != null) {
            if ((holder instanceof SessionListViewHolder) && (sessionListViewHolder = (SessionListViewHolder) holder) != null) {
                sessionListViewHolder.P(c97383ry.LJLJI, i);
            }
            C71897SJp checkBox = (C71897SJp) view.findViewById(R.id.jq9);
            View avatar = view.findViewById(R.id.ac_);
            o.LJIIIIZZ(checkBox, "checkBox");
            C4T1 c4t1 = C4T1.LIZ;
            int i3 = 0;
            if (o.LJ(c4t2, c4t1)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            checkBox.setVisibility(i2);
            if (checkBox.getVisibility() == 0) {
                checkBox.setChecked(c97383ry.LJLIL);
            }
            if (o.LJ(c4t2, c4t1)) {
                ACListenerS20S0101000_1 aCListenerS20S0101000_1 = new ACListenerS20S0101000_1(this, i, 4);
                o.LJIIIIZZ(avatar, "avatar");
                C16880lQ.LJIIJ(null, avatar);
                avatar.setClickable(false);
                C16880lQ.LJIIJ(null, checkBox);
                checkBox.setClickable(false);
                C16880lQ.LJIIJ(aCListenerS20S0101000_1, view);
                view.setOnLongClickListener(null);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i == 0 && o.LJ(c4t2, C4T3.LIZ)) {
                i3 = LJLJJI;
            }
            marginLayoutParams.topMargin = i3;
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        String str;
        o.LJIIIZ(parent, "parent");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLILLLLZI), R.layout.b5z, parent, false);
        o.LJIIIIZZ(itemView, "itemView");
        int i2 = C97433s3.LIZ[this.LJLJI.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                str = "filtered_message_request";
            } else {
                throw new C162476Zf();
            }
        } else {
            str = "non_filtered_message_request";
        }
        return new SessionListViewHolder(itemView, new C3OA(this.LJLILLLLZI, str, "cell"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C97413s1(MessageRequestViewModel vm, C29S c29s, EnumC97443s4 requestType) {
        super(false, 1, null);
        LiveData liveData;
        o.LJIIIZ(vm, "vm");
        o.LJIIIZ(requestType, "requestType");
        this.LJLIL = vm;
        this.LJLILLLLZI = c29s;
        this.LJLJI = requestType;
        setLoadEmptyText("");
        setShowFooter(true);
        DmViewModel dmViewModel = (DmViewModel) ViewModelProviders.of(c29s).get(DmViewModel.class);
        if (dmViewModel != null && (liveData = (LiveData) dmViewModel.LJLIL.getValue()) != null) {
            liveData.observe(c29s, new AObserverS69S0100000_1(this, 144));
        }
    }
}
