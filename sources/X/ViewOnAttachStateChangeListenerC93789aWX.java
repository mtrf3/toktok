package X;

import Y.IDTListenerS124S0100000_42;
import android.app.Activity;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aWX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnAttachStateChangeListenerC93789aWX implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C68322mC LJLIL;
    public final /* synthetic */ C93792aWa LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ InterfaceC93791aWZ LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, X.aWa] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ?? r2;
        C68322mC c68322mC = this.LJLIL;
        C93792aWa c93792aWa = this.LJLILLLLZI;
        ?? r6 = c93792aWa;
        if (c93792aWa == null) {
            r6 = new C93792aWa(this.LJLJI);
        }
        List<OSZ<View, InterfaceC93791aWZ>> list = r6.LIZ.get(Integer.valueOf(this.LJLJJI));
        if (list != null) {
            r2 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<OSZ<View, InterfaceC93791aWZ>> it = list.iterator();
            while (it.hasNext()) {
                r2.add(it.next().getFirst());
            }
        } else {
            r2 = C61878OQg.INSTANCE;
        }
        if (!r2.contains(this.LJLJJL)) {
            HashMap<Integer, List<OSZ<View, InterfaceC93791aWZ>>> hashMap = r6.LIZ;
            Integer valueOf = Integer.valueOf(this.LJLJJI);
            List<OSZ<View, InterfaceC93791aWZ>> list2 = r6.LIZ.get(Integer.valueOf(this.LJLJJI));
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            list2.add(new OSZ<>(this.LJLJJL, this.LJLJJLL));
            hashMap.put(valueOf, list2);
        }
        c68322mC.element = r6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C93790aWY c93790aWY = C93792aWa.LJII;
        Activity activity = this.LJLJI;
        C93792aWa touchHelper = (C93792aWa) this.LJLIL.element;
        int i = this.LJLJJI;
        View view2 = this.LJLJJL;
        InterfaceC93791aWZ interfaceC93791aWZ = this.LJLJJLL;
        boolean z = this.LJLJL;
        c93790aWY.getClass();
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(touchHelper, "touchHelper");
        List<OSZ<View, InterfaceC93791aWZ>> list = touchHelper.LIZ.get(Integer.valueOf(i));
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OSZ osz = (OSZ) it.next();
                if (o.LJ(osz.getFirst(), view2) || o.LJ(osz.getSecond(), interfaceC93791aWZ)) {
                    list.remove(osz);
                    if (list.isEmpty()) {
                        touchHelper.LIZ.remove(Integer.valueOf(i));
                    }
                    if (touchHelper.LIZ.isEmpty() && z) {
                        C93792aWa.LJII.getClass();
                        C94164aca c94164aca = (C94164aca) activity.findViewById(R.id.nm_);
                        if (c94164aca != null) {
                            IDTListenerS124S0100000_42 touchListener = touchHelper.LJI;
                            o.LJIIIZ(touchListener, "touchListener");
                            ((ArrayList) c94164aca.LJLIL).remove(touchListener);
                        }
                    }
                    ((InterfaceC93791aWZ) osz.getSecond()).LLZ();
                }
            }
        }
    }

    public ViewOnAttachStateChangeListenerC93789aWX(C68322mC c68322mC, C93792aWa c93792aWa, ActivityC45651qj activityC45651qj, int i, View view, C94254ae2 c94254ae2, boolean z) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c93792aWa;
        this.LJLJI = activityC45651qj;
        this.LJLJJI = i;
        this.LJLJJL = view;
        this.LJLJJLL = c94254ae2;
        this.LJLJL = z;
    }
}
