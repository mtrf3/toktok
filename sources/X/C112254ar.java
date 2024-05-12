package X;

import X.C112224ao;
import X.C73411SrX;
import X.EnumC112364b2;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.analytics.ActivityStatusAccuracyImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS448S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.4ar, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112254ar implements InterfaceC100173wT {
    public final EnumC112364b2 LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final IDqS448S0100000_1 LIZLLL;

    @Override // X.InterfaceC100173wT
    public final void onInvisible() {
        ActivityStatusAccuracyImpl activityStatusAccuracyImpl;
        C42625Go9.LIZJ(this);
        EnumC112364b2 enumC112364b2 = this.LIZ;
        EnumC112364b2 enumC112364b22 = EnumC112364b2.INBOX_TOP;
        if (enumC112364b2 == enumC112364b22 && (activityStatusAccuracyImpl = (ActivityStatusAccuracyImpl) ((LinkedHashMap) C112224ao.LIZIZ).get(enumC112364b22)) != null) {
            activityStatusAccuracyImpl.LJ = false;
            activityStatusAccuracyImpl.LIZ();
        }
    }

    @Override // X.InterfaceC100173wT
    public final void onVisible() {
        ActivityStatusAccuracyImpl activityStatusAccuracyImpl;
        C42625Go9.LIZIZ(this);
        EnumC112364b2 enumC112364b2 = this.LIZ;
        EnumC112364b2 enumC112364b22 = EnumC112364b2.INBOX_TOP;
        if (enumC112364b2 == enumC112364b22 && (activityStatusAccuracyImpl = (ActivityStatusAccuracyImpl) ((LinkedHashMap) C112224ao.LIZIZ).get(enumC112364b22)) != null) {
            activityStatusAccuracyImpl.LJ = true;
            activityStatusAccuracyImpl.LIZ();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNotifyActivityStatusAccuracyInfoCollectionEvent(C112274at event) {
        ViewGroup viewGroup;
        o.LJIIIZ(event, "event");
        EnumC112364b2 enumC112364b2 = event.LJLIL;
        EnumC112364b2 enumC112364b22 = this.LIZ;
        if (enumC112364b2 != enumC112364b22) {
            return;
        }
        View view = this.LIZIZ;
        int i = 0;
        if (enumC112364b22 == EnumC112364b2.LONG_PRESS_PANEL) {
            View view2 = this.LIZJ;
            if (view2 == null || !(view instanceof RecyclerView) || (viewGroup = (ViewGroup) view) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Rect LIZJ = C73098SmU.LIZJ(view2);
            int i2 = LIZJ.top;
            int i3 = LIZJ.bottom;
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getGlobalVisibleRect(LIZJ)) {
                    int i4 = LIZJ.top;
                    int i5 = LIZJ.bottom;
                    if (i4 >= i3) {
                        break;
                    }
                    if (i5 > i2) {
                        Object tag = childAt.getTag(R.id.eg1);
                        if ((tag instanceof C112234ap) && tag != null) {
                            arrayList.add(tag);
                        }
                    }
                }
                i++;
            }
            C112224ao.LJ(this.LIZ, arrayList);
            return;
        }
        if (view instanceof RecyclerView) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            int childCount2 = viewGroup2.getChildCount();
            ArrayList arrayList2 = new ArrayList();
            while (i < childCount2) {
                View item = viewGroup2.getChildAt(i);
                o.LJIIIIZZ(item, "item");
                if (item.getVisibility() != 8) {
                    Object tag2 = item.getTag(R.id.eg1);
                    if ((tag2 instanceof C112234ap) && tag2 != null) {
                        arrayList2.add(tag2);
                    }
                }
                i++;
            }
            C112224ao.LJ(this.LIZ, arrayList2);
            return;
        }
        if (enumC112364b22 != null) {
            Object tag3 = view.getTag(R.id.eg1);
            if ((tag3 instanceof C112234ap) && tag3 != null) {
                C112224ao.LJ(enumC112364b22, C47261Igj.LJJIJ(tag3));
            }
        }
    }

    public C112254ar(final EnumC112364b2 position, View view, LifecycleOwner lifecycleOwner, Context context, View view2) {
        o.LJIIIZ(position, "position");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = position;
        this.LIZIZ = view;
        this.LIZJ = view2;
        IDqS448S0100000_1 iDqS448S0100000_1 = new IDqS448S0100000_1(this, 2);
        this.LIZLLL = iDqS448S0100000_1;
        if (C35564DxY.LIZ()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) C112224ao.LIZIZ;
            if (linkedHashMap.get(position) == null) {
                ActivityStatusAccuracyImpl activityStatusAccuracyImpl = new ActivityStatusAccuracyImpl(position, lifecycleOwner, context);
                lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.activitystatus.analytics.ActivityStatusAccuracyAnalysis$initActivityStatusAccuracy$1$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                        ActivityStatusAccuracyImpl remove;
                        o.LJIIIZ(source, "source");
                        o.LJIIIZ(event, "event");
                        if (event == Lifecycle.Event.ON_DESTROY && (remove = C112224ao.LIZIZ.remove(EnumC112364b2.this)) != null) {
                            remove.LIZIZ("clear");
                            remove.LIZIZ("stop polling");
                            C73411SrX c73411SrX = remove.LIZJ;
                            if (c73411SrX != null) {
                                c73411SrX.dispose();
                            }
                            remove.LIZJ = null;
                        }
                    }
                });
                linkedHashMap.put(position, activityStatusAccuracyImpl);
            }
        }
        if (position == EnumC112364b2.INBOX_TOP) {
            HG3.LJIIL();
            HG3.LJLJL.LJIILJJIL(new C112264as(iDqS448S0100000_1));
        }
    }
}
