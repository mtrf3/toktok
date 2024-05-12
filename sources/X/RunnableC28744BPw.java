package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* renamed from: X.BPw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC28744BPw implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    public /* synthetic */ RunnableC28744BPw(C28736BPo c28736BPo, String str) {
        this.LJLIL = 0;
        this.LJLJI = c28736BPo;
        this.LJLJJI = null;
        this.LJLILLLLZI = str;
    }

    public /* synthetic */ RunnableC28744BPw(WeakReference weakReference, String str, C37400Em4 c37400Em4) {
        this.LJLIL = 1;
        this.LJLJI = weakReference;
        this.LJLILLLLZI = str;
        this.LJLJJI = c37400Em4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                C28736BPo c28736BPo = (C28736BPo) this.LJLJI;
                c28736BPo.LIZJ((Context) this.LJLJJI, this.LJLILLLLZI, true);
                C28739BPr c28739BPr = c28736BPo.LIZIZ;
                HashSet hashSet = (HashSet) C28742BPu.LIZJ;
                hashSet.remove(c28739BPr);
                if (hashSet.isEmpty()) {
                    try {
                        C28742BPu.LIZ.abandonAudioFocus(C28742BPu.LIZIZ);
                    } catch (Exception unused) {
                        C0NB.LJIIL("AudioFocusUtil", "returnFocus error");
                    }
                }
                try {
                    C28742BPu.LIZ.abandonAudioFocus(C28742BPu.LIZIZ);
                    return;
                } catch (Exception unused2) {
                    C0NB.LJIIL("AudioFocusUtil", "returnFocus error");
                    return;
                }
            default:
                Reference reference = (Reference) this.LJLJI;
                String str = this.LJLILLLLZI;
                BQ6 bq6 = (BQ6) this.LJLJJI;
                BQ8 bq8 = (BQ8) reference.get();
                if (bq8 == null) {
                    return;
                }
                Object obj = bq8.get(str);
                if (!(obj instanceof C37558Eoc)) {
                    return;
                }
                C37558Eoc c37558Eoc = (C37558Eoc) obj;
                if (!c37558Eoc.LIZ()) {
                    return;
                }
                bq6.accept(new C37394Ely(-10006));
                c37558Eoc.LJI(null);
                bq8.remove(str);
                return;
        }
    }
}
