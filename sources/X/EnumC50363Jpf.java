package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Jpf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC50363Jpf {
    public static final EnumC50363Jpf INSTANCE;
    public static final /* synthetic */ EnumC50363Jpf[] LJLJI;
    public final java.util.Map<Class, Object> LJLIL = new HashMap();
    public final ExecutorService executorService = C37191Eih.LIZ(new C38027EwB(FSY.SERIAL));
    public final LinkedList<Future> LJLILLLLZI = new LinkedList<>();

    static {
        EnumC50363Jpf enumC50363Jpf = new EnumC50363Jpf();
        INSTANCE = enumC50363Jpf;
        LJLJI = new EnumC50363Jpf[]{enumC50363Jpf};
    }

    public static EnumC50363Jpf[] values() {
        return (EnumC50363Jpf[]) LJLJI.clone();
    }

    public void await() {
        if (!C50365Jph.LIZ) {
            return;
        }
        Iterator<Future> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            try {
                it.next().get();
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            } catch (ExecutionException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        this.LJLILLLLZI.clear();
    }

    public static EnumC50363Jpf valueOf(String str) {
        return (EnumC50363Jpf) V0N.LJJJ(EnumC50363Jpf.class, str);
    }

    public void async(Runnable runnable) {
        if (C50365Jph.LIZ) {
            this.LJLILLLLZI.add(this.executorService.submit(runnable));
        } else {
            runnable.run();
        }
    }

    public <T> T computeIfAbsent(Class<T> cls, InterfaceC50364Jpg<Class<T>, T> interfaceC50364Jpg) {
        T t = (T) ((HashMap) this.LJLIL).get(cls);
        if (t == null) {
            return (T) interfaceC50364Jpg.apply();
        }
        ((HashMap) this.LJLIL).remove(cls);
        return t;
    }

    public View getView(Context context, int i, ViewGroup viewGroup) {
        return KOM.INSTANCE.inflate(context, i, viewGroup);
    }

    public View getView(LayoutInflater layoutInflater, Context context, int i, ViewGroup viewGroup) {
        return KOM.INSTANCE.inflate(layoutInflater, context, i, viewGroup);
    }
}
