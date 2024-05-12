package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E31 implements Runnable {
    public final String LJLIL;
    public final java.util.Map<String, String> LJLILLLLZI;
    public final long LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                E32.LIZ(this.LJLIL, this.LJLJI, new JSONObject(this.LJLILLLLZI));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public E31(String str, java.util.Map<String, String> map, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = map;
        this.LJLJI = j;
    }
}
