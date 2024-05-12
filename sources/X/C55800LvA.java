package X;

import android.app.Activity;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LvA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55800LvA implements InterfaceC84760XOi {
    public final C54505LaH LIZ = new C54505LaH();
    public final OG9 LIZIZ = new OG9();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1014));
    public String LIZLLL;
    public long LJ;
    public boolean LJFF;

    public static String LIZJ(String str) {
        List<String> split;
        if (TextUtils.isEmpty(str) || str == null || (split = new OJD("\\.").split(str, 0)) == null || split.isEmpty()) {
            return "unknown";
        }
        return (String) C64504PTg.LIZIZ(split, -1, split);
    }

    @Override // X.InterfaceC84760XOi
    public final void LIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZLLL = activity.getClass().getName();
        this.LJ = System.currentTimeMillis();
        this.LJFF = true;
    }

    @Override // X.InterfaceC84760XOi
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (TextUtils.isEmpty(this.LIZLLL) || !this.LJFF || this.LJ == 0 || !TextUtils.equals(activity.getClass().getName(), this.LIZLLL)) {
            return;
        }
        LIZLLL(LIZJ(this.LIZLLL), EnumC1804076e.CANCEL, 0L);
        this.LJFF = false;
    }

    @Override // X.InterfaceC84760XOi
    public final void LIZIZ(Activity activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        if (!z || TextUtils.isEmpty(this.LIZLLL) || !this.LJFF || this.LJ == 0 || !TextUtils.equals(activity.getClass().getName(), this.LIZLLL)) {
            return;
        }
        String type = LIZJ(this.LIZLLL);
        long currentTimeMillis = System.currentTimeMillis() - this.LJ;
        OG9 og9 = this.LIZIZ;
        if (og9 != null) {
            o.LJIIIZ(type, "type");
            C38995FSd.LIZIZ().execute(new RunnableC54507LaJ(og9, type, currentTimeMillis));
        }
        LIZLLL(type, EnumC1804076e.SUCCESS, currentTimeMillis);
        this.LJFF = false;
    }

    public final void LIZLLL(String str, EnumC1804076e result, long j) {
        String str2;
        C54505LaH c54505LaH;
        if (TextUtils.isEmpty(str) || !((ConcurrentHashMap) this.LIZJ.getValue()).containsKey(str) || (str2 = (String) ((ConcurrentHashMap) this.LIZJ.getValue()).get(str)) == null || (c54505LaH = this.LIZ) == null) {
            return;
        }
        o.LJIIIZ(result, "result");
        c54505LaH.LIZ(str2, result, j, null);
    }
}
