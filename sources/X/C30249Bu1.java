package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Stack;

/* renamed from: X.Bu1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30249Bu1 {
    public static final C30249Bu1 LIZ = new C30249Bu1();
    public static final java.util.Map<Integer, Stack<View>> LIZIZ = new LinkedHashMap();
    public static C15Y LIZJ;
    public static LayoutInflater LIZLLL;

    public static View LIZ(Context context, DataChannel dataChannel, int i) {
        boolean z;
        MutableContextWrapper mutableContextWrapper;
        Stack stack = (Stack) ((LinkedHashMap) LIZIZ).get(Integer.valueOf(i));
        if (stack == null || stack.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LayoutInflater layoutInflater = LIZLLL;
            if (layoutInflater == null) {
                return null;
            }
            return C16880lQ.LLLLIILL(layoutInflater, i, null, false);
        }
        View view = (View) stack.pop();
        Context context2 = view.getContext();
        if ((context2 instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context2) != null) {
            mutableContextWrapper.setBaseContext(context);
        }
        if (C29306Beo.LJIIL(dataChannel)) {
            LIZ.getClass();
            C15Y c15y = LIZJ;
            if (c15y != null) {
                c15y.LIZ(i, null, new C1TJ(i));
            }
        }
        return view;
    }
}
