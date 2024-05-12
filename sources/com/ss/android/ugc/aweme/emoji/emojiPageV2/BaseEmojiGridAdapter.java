package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import X.C105454Bx;
import X.C16880lQ;
import X.C3UR;
import X.C45804HyK;
import X.C4CH;
import X.C4CM;
import X.C62846OlW;
import X.C72042sC;
import X.C8HS;
import X.C9XU;
import X.G27;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class BaseEmojiGridAdapter<T> extends C8HS<T> implements G27 {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Context LJLJI;
    public RecyclerView LJLJJI;
    public C3UR LJLJJL;

    public abstract int LJLZ();

    public abstract void LJZ(BaseEmojiGridAdapter<T>.a aVar, int i);

    public abstract int LJZL();

    public final C3UR LJLLLLLL() {
        C3UR c3ur = this.LJLJJL;
        if (c3ur != null) {
            return c3ur;
        }
        o.LJIJI("inputViewBridge");
        throw null;
    }

    @Override // X.MK7, X.C4II, X.AbstractC029409q
    public final int getItemCount() {
        if (this.mShowFooter) {
            return getBasicItemCount() + 1;
        }
        return getBasicItemCount();
    }

    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        public final C62846OlW LJLIL;

        public a(View view) {
            super(view);
            this.LJLIL = (C62846OlW) view.findViewById(R.id.cud);
            view.findViewById(R.id.lao);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseEmojiGridAdapter(LifecycleOwner owner) {
        super(false, 1, null);
        o.LJIIIZ(owner, "owner");
        this.LJLIL = 7;
        this.LJLILLLLZI = 4;
        this.LJLJI = (Context) owner;
        this.mShowFooter = false;
        owner.getLifecycle().addObserver(new GenericLifecycleObserver(this) { // from class: com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter.1
            public final /* synthetic */ BaseEmojiGridAdapter<T> LJLIL;

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                C9XU.LIZLLL(this.LJLIL);
            }

            {
                this.LJLIL = this;
            }
        });
    }

    public void LJZI(C4CM c4cm) {
        this.LJLJJI = c4cm;
        Context context = c4cm.getContext();
        o.LJIIIIZZ(context, "rv.context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C9XU.LIZIZ(LJIJJ, this);
        }
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C105454Bx c105454Bx;
        C72042sC c72042sC;
        List<T> data = getData();
        Object obj = null;
        if (data != null) {
            obj = ListProtector.get(data, i);
        }
        if (!(obj instanceof C105454Bx) || (c105454Bx = (C105454Bx) obj) == null) {
            return;
        }
        if (viewHolder instanceof C4CH) {
            if ((c105454Bx instanceof C72042sC) && (c72042sC = (C72042sC) c105454Bx) != null) {
                C4CH c4ch = (C4CH) viewHolder;
                c4ch.getClass();
                c4ch.LJLIL.setText(c72042sC.LJIIIIZZ);
                return;
            }
            return;
        }
        LJZ((a) viewHolder, i);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null) {
            recyclerView.post(new ARunnableS37S0100000_1(this, 23));
        }
    }

    @Override // X.C4II
    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJI), LJLZ(), viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        return new a(itemView);
    }
}
