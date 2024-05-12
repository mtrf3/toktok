package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import org.json.JSONObject;

/* renamed from: X.IGi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC46332IGi implements Runnable {
    public final /* synthetic */ OnUIPlayListener LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ IPH LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ java.util.Map LJLJJLL;
    public final /* synthetic */ JSONObject LJLJL;
    public final /* synthetic */ ITG LJLJLJ;

    public final void LIZ() {
        OnUIPlayListener onUIPlayListener;
        if (!IUH.LIZ(this.LJLJLJ.LIZ.LJ) && (onUIPlayListener = this.LJLIL) != null) {
            onUIPlayListener.onPlayStop(this.LJLILLLLZI);
            this.LJLIL.onPlayStop(this.LJLILLLLZI, this.LJLJLJ.LIZ.LIZLLL());
            IPH iph = this.LJLJI;
            long j = this.LJLJJI;
            iph.LIZLLL = j;
            iph.LJFF = j;
            iph.LJ = this.LJLJJL;
            java.util.Map<? extends String, ? extends Object> map = this.LJLJJLL;
            if (map != null) {
                iph.LJIIL.putAll(map);
            }
            this.LJLIL.onPlayStop(this.LJLILLLLZI, this.LJLJL, iph);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC46332IGi(ITG itg, OnUIPlayListener onUIPlayListener, String str, IPH iph, long j, long j2, java.util.Map map, JSONObject jSONObject) {
        this.LJLJLJ = itg;
        this.LJLIL = onUIPlayListener;
        this.LJLILLLLZI = str;
        this.LJLJI = iph;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = map;
        this.LJLJL = jSONObject;
    }
}
