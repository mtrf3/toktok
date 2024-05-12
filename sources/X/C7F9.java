package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7F9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7F9 implements InterfaceC44105HSr {
    public final Aweme LIZ;
    public final Activity LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final JSONObject LJ;
    public final boolean LJFF;
    public final C62822Ol8 LJI;
    public int LJII;

    @Override // X.InterfaceC44105HSr
    public final void LJJLIIJ() {
    }

    public final List<S1E> LIZJ() {
        return (List) this.LJI.getValue();
    }

    @Override // X.InterfaceC44105HSr
    public final boolean LJJLJ() {
        if (this.LJII == -1) {
            this.LJII = LIZIZ();
        }
        if (this.LJII <= 1) {
            return true;
        }
        return false;
    }

    public final int LIZIZ() {
        Iterator<S1E> it = LIZJ().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().LJIILJJIL();
        }
        return i;
    }

    public final S1E LIZLLL() {
        return (S1E) ORZ.LJLLLL(LIZJ());
    }

    @Override // X.InterfaceC44105HSr
    public final Activity LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC44105HSr
    public final String LJJLIIIJLLLLLLLZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44105HSr
    public final JSONObject LJJLIL() {
        return this.LJ;
    }

    @Override // X.InterfaceC44105HSr
    public final String LJJLJLI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC44105HSr
    public final Aweme LJJLL() {
        return this.LIZ;
    }

    public C7F9(Aweme aweme, Activity activity, String str, String str2, JSONObject jSONObject, boolean z) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(activity, "activity");
        this.LIZ = aweme;
        this.LIZIZ = activity;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = jSONObject;
        this.LJFF = z;
        this.LJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 435));
        this.LJII = -1;
    }
}
