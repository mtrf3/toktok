package X;

import org.json.JSONObject;

/* renamed from: X.UAj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76753UAj implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ JSONObject LJLJJI;
    public final /* synthetic */ C76762UAs LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;

    public RunnableC76753UAj(U66 u66, long j, long j2, JSONObject jSONObject, C76762UAs c76762UAs, int i, int i2, int i3) {
        this.LJLIL = u66;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = jSONObject;
        this.LJLJJL = c76762UAs;
        this.LJLJJLL = i;
        this.LJLJL = i2;
        this.LJLJLJ = i3;
    }

    public final void LIZ() {
        U66 u66 = this.LJLIL;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        JSONObject jSONObject = this.LJLJJI;
        JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
        int i = this.LJLJJLL;
        int i2 = this.LJLJL;
        int i3 = this.LJLJLJ;
        LJIIZILJ.put("capture_status", i);
        LJIIZILJ.put("capture_devices", i2);
        LJIIZILJ.put("capture_fps", i3);
        UC0.LJJJJJL(u66, j, j2, jSONObject, "video_capture_callback", LJIIZILJ, this.LJLJJL.LIZIZ.LIZLLL(this.LJLIL), this.LJLJJL.LIZJ);
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
}
