package X;

import Y.ALAdapterS0S0201000_1;
import Y.AUListenerS90S0100000_1;
import Y.IDTListenerS87S0200000_1;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.search.ui.widget.IMSearchBarEntranceWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.4aO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111964aO extends AbstractC029409q<RecyclerView.ViewHolder> {
    public Animator LJLIL;
    public View LJLILLLLZI;
    public final /* synthetic */ IMSearchBarEntranceWidget LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return 1;
    }

    public C111964aO(IMSearchBarEntranceWidget iMSearchBarEntranceWidget) {
        this.LJLJI = iMSearchBarEntranceWidget;
        setHasStableIds(true);
    }

    public final void LJLLLLLL(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        this.LJLJI.LJIJ().LJFF("click search entrance");
        long currentTimeMillis = System.currentTimeMillis();
        Rect rect = new Rect();
        view.findViewById(R.id.jij).getGlobalVisibleRect(rect);
        InterfaceC111984aQ searchService = IMService.createIIMServicebyMonsterPlugin(false).getSearchService();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        searchService.LIZIZ(context, false, Integer.valueOf(rect.left), Integer.valueOf(rect.top));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C98453th LJIJ = this.LJLJI.LJIJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("click search entrance cost ");
        LIZ.append(currentTimeMillis2);
        LIZ.append("ms");
        LJIJ.LJFF(X1D.LIZIZ(LIZ));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSearchBarEntranceAnimationStartEvent(C96273qB event) {
        View findViewById;
        View findViewById2;
        o.LJIIIZ(event, "event");
        if (event.LJLIL) {
            View view = this.LJLILLLLZI;
            if (view != null && (findViewById2 = view.findViewById(R.id.jij)) != null) {
                C17N.LJJLIIIJJI(findViewById2);
                return;
            }
            return;
        }
        View view2 = this.LJLILLLLZI;
        if (view2 == null || (findViewById = view2.findViewById(R.id.jij)) == null) {
            return;
        }
        findViewById.setVisibility(4);
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        C42625Go9.LIZIZ(this);
        this.LJLILLLLZI = holder.itemView;
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        this.LJLJI.LJIJ().LJFF("onViewDetachedFromWindow");
        C42625Go9.LIZJ(this);
        Animator animator = this.LJLIL;
        if (animator != null) {
            animator.cancel();
        }
        this.LJLILLLLZI = null;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        this.LJLJI.LJIJ().LJFF("onBindViewHolder");
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        view.findViewById(R.id.bew).setOnTouchListener(new IDTListenerS87S0200000_1(this, view, 2));
        view.setOnTouchListener(new IDTListenerS87S0200000_1(this, view, 3));
        C17N.LJJLIIIJJI(view.findViewById(R.id.jij));
        IMSearchBarEntranceWidget iMSearchBarEntranceWidget = this.LJLJI;
        if (iMSearchBarEntranceWidget.LJLJLJ && !iMSearchBarEntranceWidget.LJLJLLL) {
            iMSearchBarEntranceWidget.LJLJLLL = true;
            int LJIJ = C78897Uxp.LJIJ(R.dimen.v8, view);
            this.LJLJI.LJIJ().LJFF("play show animation");
            ValueAnimator ofInt = ValueAnimator.ofInt(0, LJIJ);
            ofInt.setDuration(200L);
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(view, 48));
            ofInt.addListener(new ALAdapterS0S0201000_1(this.LJLJI, view, LJIJ, 0));
            ofInt.start();
            this.LJLIL = ofInt;
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        final View LIZIZ = C1FL.LIZIZ(parent, R.layout.b5l, parent, false, "from(parent.context)\n   …_entrance, parent, false)");
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(LIZIZ) { // from class: X.4aP
        };
        C0AX.LIZ(parent, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C111974aP.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C111974aP.class.getName();
        return viewHolder;
    }
}
