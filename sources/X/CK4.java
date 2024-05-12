package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CK4 {
    public static final CK4 INSTANCE;
    public static final /* synthetic */ CK4[] LJLILLLLZI;
    public final ConcurrentHashMap<Integer, LinkedList<View>> LJLIL = new ConcurrentHashMap<>();

    static {
        CK4 ck4 = new CK4();
        INSTANCE = ck4;
        LJLILLLLZI = new CK4[]{ck4};
    }

    public CK4() {
        new C15Y(EF7.LIZIZ());
    }

    public static CK4[] values() {
        return (CK4[]) LJLILLLLZI.clone();
    }

    public static CK4 valueOf(String str) {
        return (CK4) V0N.LJJJ(CK4.class, str);
    }

    public void setContext(Context context) {
        new C15Y(context);
    }

    public View inflate(Context context, int i, ViewGroup viewGroup) {
        return inflate(C16880lQ.LLZIL(context), context, i, viewGroup);
    }

    public View inflate(LayoutInflater layoutInflater, Context context, int i, ViewGroup viewGroup) {
        LinkedList<View> linkedList = this.LJLIL.get(Integer.valueOf(i));
        if (linkedList == null || linkedList.isEmpty()) {
            return C16880lQ.LLLLIILL(layoutInflater, i, viewGroup, false);
        }
        View poll = linkedList.poll();
        Context context2 = poll.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        }
        return poll;
    }
}
