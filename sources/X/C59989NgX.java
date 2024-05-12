package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import djb.IDaS25S0000000_10;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.NgX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59989NgX {
    public static final C59989NgX LIZLLL = new C59989NgX();
    public final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public final C64962gm LIZIZ = C48841JEv.LIZ(MBE.LIZ(T2R.LJIIJJI(), new IDaS25S0000000_10(CoroutineExceptionHandler.LJJJJIZL, 1)));
    public final java.util.Map<Integer, String> LIZJ = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(Context context, View view, HashSet<String> hashSet, NBY nby, InterfaceC59990NgY interfaceC59990NgY) {
        int i;
        OSZ osz;
        Activity activity;
        WindowManager.LayoutParams layoutParams;
        HashSet<String> hashSet2 = hashSet;
        o.LJIIIZ(context, "context");
        if (view != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int width = view.getWidth();
            int height = view.getHeight();
            int i2 = width * height;
            EnumC58698N1y enumC58698N1y = nby.LIZIZ;
            EnumC58698N1y enumC58698N1y2 = EnumC58698N1y.USE_ONE_PIV;
            Float valueOf = Float.valueOf(1.0f);
            if (enumC58698N1y == enumC58698N1y2) {
                osz = new OSZ(valueOf, 1);
            } else if (enumC58698N1y == EnumC58698N1y.USE_HALF) {
                osz = new OSZ(Float.valueOf(0.5f), Integer.valueOf(i2 / 2));
            } else {
                Integer num = nby.LIZJ;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                osz = new OSZ(valueOf, Integer.valueOf(i));
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(iArr[0]);
            LIZ.append(", ");
            C15890jp.LIZIZ(LIZ, iArr[1], ", ", width, ", ");
            LIZ.append(height);
            String LIZIZ = X1D.LIZIZ(LIZ);
            String LIZ2 = AnonymousClass629.LIZ("randomUUID().toString()");
            if (hashSet2 == null) {
                hashSet2 = new HashSet<>();
            }
            int intValue = ((Number) osz.getSecond()).intValue();
            C59885Ner c59885Ner = new C59885Ner(System.nanoTime(), LIZ2);
            c59885Ner.LIZJ = true;
            if (NR1.LIZ(view)) {
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    c59885Ner.LIZLLL = new C59993Ngb(rect.left, rect.top, rect.right, rect.bottom, view.getContext().getResources().getResourceEntryName(view.getId()));
                    if (rect.height() * rect.width() >= intValue) {
                        IBinder iBinder = null;
                        View view2 = view;
                        if (LIZ(view, hashSet2, c59885Ner, rect, nby, view)) {
                            LIZLLL(view, hashSet2, c59885Ner, rect, nby);
                        }
                        View view3 = view;
                        while (true) {
                            if (view2.getParent() instanceof ViewGroup) {
                                ViewParent parent = view2.getParent();
                                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                                ViewGroup viewGroup = (ViewGroup) parent;
                                if (viewGroup.getVisibility() != 0) {
                                    break;
                                }
                                int i3 = 0;
                                while (i3 < viewGroup.getChildCount() && !o.LJ(viewGroup.getChildAt(i3), view3)) {
                                    i3++;
                                }
                                int childCount = viewGroup.getChildCount();
                                for (int i4 = i3 + 1; i4 < childCount; i4++) {
                                    View childAt = viewGroup.getChildAt(i4);
                                    if (childAt != null && LIZ(childAt, hashSet2, c59885Ner, rect, nby, null)) {
                                        LIZLLL(childAt, hashSet2, c59885Ner, rect, nby);
                                    }
                                }
                                view3 = viewGroup;
                                view2 = viewGroup;
                            } else {
                                Context context2 = view.getContext();
                                if ((context2 instanceof Activity) && (activity = (Activity) context2) != null) {
                                    ArrayList arrayList = new ArrayList();
                                    try {
                                        Object LLILIL = C16880lQ.LLILIL(activity, "window");
                                        IBinder iBinder2 = activity.getWindow().getAttributes().token;
                                        Object obj = C165066dq.LIZIZ(LLILIL.getClass(), "mGlobal").get(LLILIL);
                                        Object obj2 = C165066dq.LIZIZ(obj.getClass(), "mRoots").get(obj);
                                        o.LJII(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                                        List list = (List) obj2;
                                        View decorView = activity.getWindow().getDecorView();
                                        o.LJIIIIZZ(decorView, "activity.window.decorView");
                                        if (!list.isEmpty()) {
                                            int indexOf = list.indexOf(decorView) + 1;
                                            int size = list.size();
                                            while (indexOf < size) {
                                                Object obj3 = ListProtector.get(list, indexOf);
                                                Object obj4 = C165066dq.LIZIZ(obj3.getClass(), "mWindowAttributes").get(obj3);
                                                if (obj4 instanceof WindowManager.LayoutParams) {
                                                    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj4;
                                                    layoutParams = layoutParams2;
                                                    if (layoutParams2 != null) {
                                                        iBinder = layoutParams2.token;
                                                        layoutParams = layoutParams2;
                                                    }
                                                } else {
                                                    layoutParams = iBinder;
                                                }
                                                if (!o.LJ(iBinder, iBinder2)) {
                                                    if (layoutParams != 0) {
                                                        if (layoutParams.type != 1000 && layoutParams.type != 2038) {
                                                        }
                                                    }
                                                    indexOf++;
                                                    iBinder = null;
                                                }
                                                Object obj5 = C165066dq.LIZIZ(obj3.getClass(), "mView").get(obj3);
                                                o.LJII(obj5, "null cannot be cast to non-null type android.view.View");
                                                View view4 = (View) obj5;
                                                if (!o.LJ(decorView, view4)) {
                                                    arrayList.add(view4);
                                                }
                                                indexOf++;
                                                iBinder = null;
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        View findViewById = ((View) it.next()).findViewById(R.id.content);
                                        if (findViewById != null && LIZ(findViewById, hashSet2, c59885Ner, rect, nby, null)) {
                                            LIZLLL(findViewById, hashSet2, c59885Ner, rect, nby);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            XKX.LIZLLL(this.LIZIZ, C36636EZk.LIZ.LJJIJIL(), null, new C59991NgZ(nby, height, width, c59885Ner, osz, SystemClock.elapsedRealtime() - elapsedRealtime, LIZIZ, interfaceC59990NgY, null), 2);
            return;
        }
        interfaceC59990NgY.LIZ(new C60002Ngk(0));
    }

    public final void LIZLLL(View view, HashSet<String> hashSet, C59885Ner c59885Ner, Rect rect, NBY nby) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && LIZ(childAt, hashSet, c59885Ner, rect, nby, null)) {
                LIZLLL(childAt, hashSet, c59885Ner, rect, nby);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.view.View r13, java.util.HashSet<java.lang.String> r14, X.C59885Ner r15, android.graphics.Rect r16, X.NBY r17, android.view.View r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59989NgX.LIZ(android.view.View, java.util.HashSet, X.Ner, android.graphics.Rect, X.NBY, android.view.View):boolean");
    }
}
