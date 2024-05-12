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
/* loaded from: classes9.dex */
public final class KOM {
    public static final KOM INSTANCE;
    public static final /* synthetic */ KOM[] LJLIL;
    public ConcurrentHashMap<Integer, LinkedList<View>> storage = new ConcurrentHashMap<>();
    public C15Y asyncLayoutInflater = new C15Y(EF7.LIZIZ());

    static {
        KOM kom = new KOM();
        INSTANCE = kom;
        LJLIL = new KOM[]{kom};
    }

    public static KOM[] values() {
        return (KOM[]) LJLIL.clone();
    }

    public static KOM valueOf(String str) {
        return (KOM) V0N.LJJJ(KOM.class, str);
    }

    public void setContext(Context context) {
        this.asyncLayoutInflater = new C15Y(context);
    }

    public AbstractC73672Svk<View> preInflate(int i, ViewGroup viewGroup) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i));
        if (linkedList != null && !linkedList.isEmpty()) {
            return C73536StY.LJLIL;
        }
        return AbstractC73672Svk.LJIIJ(new V1G(this, i, viewGroup));
    }

    public void recycle(int i, View view) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i));
        if (linkedList != null) {
            linkedList.add(view);
        }
    }

    public View inflate(Context context, int i, ViewGroup viewGroup) {
        return inflate(C16880lQ.LLZIL(context), context, i, viewGroup);
    }

    public View inflate(LayoutInflater layoutInflater, Context context, int i, ViewGroup viewGroup) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i));
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
