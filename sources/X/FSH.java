package X;

import X.FSM;
import android.os.AsyncTask;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FSH extends ThreadPoolExecutor {
    public static final int LJLIL;
    public static final int LJLILLLLZI;
    public static final FSI LJLJI;
    public static final BlockingQueue<Runnable> LJLJJI;

    public FSH() {
        super(LJLIL, LJLILLLLZI, 30L, TimeUnit.SECONDS, LJLJJI, LJLJI);
        allowCoreThreadTimeOut(true);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        LJLIL = Math.max(2, Math.min(availableProcessors - 1, 4));
        LJLILLLLZI = (availableProcessors * 2) + 1;
        LJLJI = new FSI();
        LJLJJI = new ArrayBlockingQueue(128);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        String sb;
        int i;
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e) {
            HashMap hashMap = new HashMap();
            for (Runnable runnable2 : (Runnable[]) getQueue().toArray(new Runnable[0])) {
                Class<?> cls = runnable2.getClass();
                if (cls == FSM.b.class) {
                    try {
                        cls = FSM.this.getClass();
                    } catch (IllegalAccessException | NoSuchFieldException unused) {
                    }
                } else if (cls.getEnclosingClass() == AsyncTask.class) {
                    Field declaredField = cls.getDeclaredField("this$0");
                    declaredField.setAccessible(true);
                    cls = declaredField.get(runnable2).getClass();
                }
                String name = cls.getName();
                if (hashMap.containsKey(name)) {
                    i = ((Integer) hashMap.get(name)).intValue();
                } else {
                    i = 0;
                }
                hashMap.put(name, Integer.valueOf(i + 1));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Prominent classes in AsyncTask: ");
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 32) {
                    sb2.append((String) entry.getKey());
                    sb2.append(' ');
                }
            }
            if (sb2.length() == 0) {
                sb = "NO CLASSES FOUND";
            } else {
                sb = sb2.toString();
            }
            LIZ.append(sb);
            throw new RejectedExecutionException(X1D.LIZIZ(LIZ), e);
        }
    }
}
