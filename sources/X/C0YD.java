package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0YD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YD<CacheKey, V> {
    public static final C19180p8 LJIILLIIL;
    public CacheKey LJIIJJI;
    public InterfaceC006200s<CacheKey, V> LJIIL;
    public InterfaceC006000q<CacheKey, FeedExtra> LJIILIIL;
    public InterfaceC09740Zu<V> LJIILL;
    public final MutableLiveData<C06900Ow> LIZ = new MutableLiveData<>();
    public final MutableLiveData<C06900Ow> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LIZJ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LIZLLL = new MutableLiveData<>();
    public final C73893SzJ<Object> LJ = new C73893SzJ<>();
    public final C73893SzJ<Object> LJFF = new C73893SzJ<>();
    public final C73893SzJ<Object> LJI = new C73893SzJ<>();
    public volatile boolean LJII = false;
    public volatile boolean LJIIIIZZ = false;
    public final MutableLiveData<Integer> LJIIIZ = new MutableLiveData<>();
    public final AtomicLong LJIIJ = new AtomicLong(0);
    public C19180p8 LJIILJJIL = LJIILLIIL;

    static {
        C19170p7 c19170p7 = new C19170p7();
        c19170p7.LIZLLL = false;
        c19170p7.LIZ = 12;
        c19170p7.LIZIZ = 12;
        LJIILLIIL = c19170p7.LIZ();
    }
}
