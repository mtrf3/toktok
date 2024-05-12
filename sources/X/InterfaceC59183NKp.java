package X;

import X.AbstractC59184NKq;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.NKp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC59183NKp<T extends AbstractC59184NKq> extends InterfaceC58172Qb {
    T LIZ(String str);

    int LIZIZ();

    boolean LIZJ(Aweme aweme);

    @Override // X.InterfaceC58172Qb
    void LIZLLL(String str);

    int LJ();

    ConcurrentHashMap<String, T> LJFF();

    boolean LJI();

    String LJII();

    int LJIIIZ();

    void LJIIJJI(Context context, Aweme aweme);

    void LJIIL(WeakReference<Context> weakReference);

    WeakReference<Context> LJIILIIL();

    void releaseAll();
}
