package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.NKo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59182NKo {
    public static <T extends AbstractC59184NKq> void LJ(InterfaceC59183NKp<T> interfaceC59183NKp) {
        for (Map.Entry<String, T> entry : interfaceC59183NKp.LJFF().entrySet()) {
            C60193Njp c60193Njp = entry.getValue().LIZJ;
            if (c60193Njp != null) {
                c60193Njp.release();
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = entry.getValue().LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            }
        }
        interfaceC59183NKp.LJFF().clear();
    }

    public static <T extends AbstractC59184NKq> void LIZ(InterfaceC59183NKp<T> interfaceC59183NKp, Context context) {
        if (context == null) {
            return;
        }
        interfaceC59183NKp.LJIIL(new WeakReference<>(context));
    }

    public static <T extends AbstractC59184NKq> T LIZIZ(InterfaceC59183NKp<T> interfaceC59183NKp, String str) {
        return interfaceC59183NKp.LJFF().get(str);
    }

    public static <T extends AbstractC59184NKq> void LIZLLL(InterfaceC59183NKp<T> interfaceC59183NKp, Aweme aweme) {
        Context context;
        T t;
        o.LJIIIZ(aweme, "aweme");
        synchronized (aweme) {
            WeakReference<Context> LJIILIIL = interfaceC59183NKp.LJIILIIL();
            if (LJIILIIL != null && (context = LJIILIIL.get()) != null) {
                if (interfaceC59183NKp.LIZJ(aweme) && (!interfaceC59183NKp.LJFF().containsKey(aweme.getAid()) || ((t = interfaceC59183NKp.LJFF().get(aweme.getAid())) != null && t.LIZ == 2))) {
                    interfaceC59183NKp.LJIIJJI(context, aweme);
                }
            }
        }
    }

    public static <T extends AbstractC59184NKq> void LJFF(InterfaceC59183NKp<T> interfaceC59183NKp, String str) {
        T t;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (str != null && (t = interfaceC59183NKp.LJFF().get(str)) != null) {
            C60193Njp c60193Njp = t.LIZJ;
            if (c60193Njp != null) {
                ViewParent parent = c60193Njp.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    C16880lQ.LJLLL(c60193Njp, viewGroup2);
                }
                c60193Njp.release();
                interfaceC59183NKp.LJFF().remove(str);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = t.LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                ViewParent parent2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                    C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, viewGroup);
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                interfaceC59183NKp.LJFF().remove(str);
            }
        }
    }

    public static void LIZJ(int i, InterfaceC59183NKp interfaceC59183NKp, List list) {
        Context context;
        AbstractC59184NKq abstractC59184NKq;
        AbstractC59184NKq abstractC59184NKq2;
        AbstractC59184NKq abstractC59184NKq3;
        o.LJIIIZ(list, "list");
        WeakReference<Context> LJIILIIL = interfaceC59183NKp.LJIILIIL();
        if (LJIILIIL == null || (context = LJIILIIL.get()) == null) {
            return;
        }
        int size = list.size();
        for (int i2 = i + 2; i2 < size; i2++) {
            Aweme aweme = (Aweme) ListProtector.get(list, i2);
            if (!interfaceC59183NKp.LJFF().containsKey(aweme.getAid()) || ((abstractC59184NKq2 = (AbstractC59184NKq) interfaceC59183NKp.LJFF().get(aweme.getAid())) != null && abstractC59184NKq2.LIZ == 2 && (abstractC59184NKq3 = (AbstractC59184NKq) interfaceC59183NKp.LJFF().get(aweme.getAid())) != null && abstractC59184NKq3.LIZ == 0)) {
                if (interfaceC59183NKp.LIZJ(aweme) && (!interfaceC59183NKp.LJFF().containsKey(aweme.getAid()) || ((abstractC59184NKq = (AbstractC59184NKq) interfaceC59183NKp.LJFF().get(aweme.getAid())) != null && abstractC59184NKq.LIZ == 2))) {
                    interfaceC59183NKp.LJIIJJI(context, aweme);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static void LJI(int i, InterfaceC59183NKp interfaceC59183NKp, List items) {
        o.LJIIIZ(items, "items");
        if (i < 0 || i >= items.size() || ((Aweme) ListProtector.get(items, i)).isAd() || interfaceC59183NKp.LJFF().size() == 0) {
            return;
        }
        String str = "1";
        if (interfaceC59183NKp.LIZIZ() >= interfaceC59183NKp.LJ()) {
            String LJII = interfaceC59183NKp.LJII();
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(interfaceC59183NKp.LIZIZ(), "cache_number");
            if (!interfaceC59183NKp.LJI()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("is_spark", str);
            FMX.LJIIL(LJII, c188727au.LIZ);
            interfaceC59183NKp.releaseAll();
            return;
        }
        if (interfaceC59183NKp.LIZIZ() >= interfaceC59183NKp.LJIIIZ()) {
            String LJII2 = interfaceC59183NKp.LJII();
            C188727au c188727au2 = new C188727au();
            c188727au2.LIZLLL(interfaceC59183NKp.LIZIZ(), "cache_number");
            if (!interfaceC59183NKp.LJI()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au2.LJIIIZ("is_spark", str);
            FMX.LJIIL(LJII2, c188727au2.LIZ);
            interfaceC59183NKp.releaseAll();
            return;
        }
        Iterator it = items.iterator();
        boolean z = true;
        int i2 = 0;
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            if (interfaceC59183NKp.LIZJ(aweme) && i2 + 6 < i) {
                interfaceC59183NKp.LIZLLL(aweme.getAid());
            }
            if (interfaceC59183NKp.LJFF().containsKey(aweme.getAid())) {
                z = false;
            }
            i2++;
        }
        if (!z || interfaceC59183NKp.LIZIZ() == 0) {
            return;
        }
        interfaceC59183NKp.releaseAll();
    }
}
