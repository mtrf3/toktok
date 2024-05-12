package X;

import Y.ARunnableS28S0200000_9;
import Y.IDCListenerS300S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MiD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57545MiD extends RelativeLayout implements G27 {
    public String LJLIL;
    public RecyclerView LJLILLLLZI;
    public C57547MiF LJLJI;
    public GalleryLayoutManager LJLJJI;
    public List<UserWithAweme> LJLJJL;
    public IDCListenerS300S0100000_9 LJLJJLL;

    public final C57547MiF getAdapter() {
        C57547MiF c57547MiF = this.LJLJI;
        if (c57547MiF != null) {
            return c57547MiF;
        }
        o.LJIJI("adapter");
        throw null;
    }

    public final GalleryLayoutManager getLayoutManager() {
        GalleryLayoutManager galleryLayoutManager = this.LJLJJI;
        if (galleryLayoutManager != null) {
            return galleryLayoutManager;
        }
        o.LJIJI("layoutManager");
        throw null;
    }

    public final RecyclerView getList() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("list");
        throw null;
    }

    public final void LIZIZ() {
        RecyclerView.ViewHolder LJJIZ = getList().LJJIZ(getLayoutManager().LJZL);
        if (LJJIZ != null) {
            ((ViewOnClickListenerC57546MiE) LJJIZ).LLLLLLLLL();
        }
        RecyclerView.ViewHolder LJJIZ2 = getList().LJJIZ(getLayoutManager().LJZL + 1);
        if (LJJIZ2 != null) {
            ((ViewOnClickListenerC57546MiE) LJJIZ2).P().setVisibility(0);
        }
        RecyclerView.ViewHolder LJJIZ3 = getList().LJJIZ(getLayoutManager().LJZL - 1);
        if (LJJIZ3 != null) {
            ((ViewOnClickListenerC57546MiE) LJJIZ3).P().setVisibility(0);
        }
    }

    public final void LIZJ() {
        if (getLayoutManager() != null) {
            Iterator<InterfaceC57552MiK> it = getLayoutManager().LLII.iterator();
            while (it.hasNext()) {
                it.next().x();
            }
        }
    }

    public final List<UserWithAweme> getMCardItems() {
        return this.LJLJJL;
    }

    public final String getRequestId() {
        return this.LJLIL;
    }

    public static int LIZ(Context context) {
        return ((int) (((C53946LFe.LIZJ(context, null).LIZIZ * 0.712f) * 1.34f) / 0.93f)) - C17N.LJIILL(58.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!(parent instanceof RecyclerView));
        }
        return super.dispatchTouchEvent(ev);
    }

    public final void setAdapter(C57547MiF c57547MiF) {
        o.LJIIIZ(c57547MiF, "<set-?>");
        this.LJLJI = c57547MiF;
    }

    public final void setContainer(WeakReference<Activity> activityRef) {
        int i;
        o.LJIIIZ(activityRef, "activityRef");
        getLayoutManager().LLI = activityRef;
        Activity activity = activityRef.get();
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = 0;
        }
        C9XU.LIZ(i, this);
    }

    public final void setData(List<UserWithAweme> users) {
        o.LJIIIZ(users, "users");
        try {
            this.LJLJJL = users;
            getAdapter().mmItems = ORZ.LLJILJILJ(this.LJLJJL);
            C57547MiF adapter = getAdapter();
            String str = this.LJLIL;
            adapter.getClass();
            o.LJIIIZ(str, "<set-?>");
            adapter.LJLJI = str;
            getLayoutManager().LJIL();
            if (getList().LJJJLL() || getList().LJJJLIIL()) {
                getList().post(new ARunnableS28S0200000_9(users, this, 12));
            } else {
                getAdapter().notifyDataSetChanged();
            }
        } catch (Throwable th) {
            C221018lt.LIZJ("RecSuperUser", "setData error", th);
        }
    }

    public final void setLayoutManager(GalleryLayoutManager galleryLayoutManager) {
        o.LJIIIZ(galleryLayoutManager, "<set-?>");
        this.LJLJJI = galleryLayoutManager;
    }

    public final void setList(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "<set-?>");
        this.LJLILLLLZI = recyclerView;
    }

    public final void setMCardItems(List<UserWithAweme> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJJL = list;
    }

    public final void setOnItemOperationListener(InterfaceC57527Mhv onItemOperationListener) {
        o.LJIIIZ(onItemOperationListener, "onItemOperationListener");
        C57547MiF adapter = getAdapter();
        adapter.getClass();
        adapter.LJLJJL = onItemOperationListener;
    }

    public final void setOnViewFirstShowListener(InterfaceC57556MiO<ViewOnClickListenerC57546MiE> onViewAttachedToWindowListener) {
        o.LJIIIZ(onViewAttachedToWindowListener, "onViewAttachedToWindowListener");
        C57547MiF adapter = getAdapter();
        adapter.getClass();
        adapter.LJLJJI = onViewAttachedToWindowListener;
    }

    public final void setRequestId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57545MiD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LJLIL = "";
        this.LJLJJL = new ArrayList();
        setList(new RecyclerView(getContext(), null));
        addView(getList(), new ViewGroup.LayoutParams(-1, -1));
        setLayoutManager(new GalleryLayoutManager());
        GalleryLayoutManager layoutManager = getLayoutManager();
        RecyclerView list = getList();
        if (list != null) {
            layoutManager.LLIIII = list;
            layoutManager.LJZI = Math.max(0, 0);
            list.setLayoutManager(layoutManager);
            layoutManager.LLF.LIZIZ(list);
            list.LJIIJJI(layoutManager.LLFF);
            GalleryLayoutManager layoutManager2 = getLayoutManager();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            layoutManager2.LLIFFJFJJ = new C57549MiH(context2);
            GalleryLayoutManager layoutManager3 = getLayoutManager();
            o.LJIIIZ(layoutManager3, "layoutManager");
            C57547MiF c57547MiF = new C57547MiF(layoutManager3, new AqS159S0100000_9(this, 988));
            c57547MiF.setShowFooter(false);
            setAdapter(c57547MiF);
            getList().setAdapter(getAdapter());
            getList().setItemAnimator(new C86997YCj(getList()));
            if (!this.LJLJJL.isEmpty()) {
                setData(this.LJLJJL);
                return;
            }
            return;
        }
        layoutManager.getClass();
        throw new IllegalArgumentException("The attach RecycleView must not null!!");
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        if (activity != null && LIZ(activity) != getLayoutParams().height) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            layoutParams.height = LIZ(context);
            requestLayout();
            getAdapter().LJLLLLLL(activity);
            getAdapter().notifyDataSetChanged();
        }
    }
}
