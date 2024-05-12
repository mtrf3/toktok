package X;

import java.util.HashMap;

/* renamed from: X.ImK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47608ImK {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public C47610ImM LJ;

    public final synchronized C47610ImM LIZIZ() {
        if (this.LJ == null) {
            this.LJ = new C47610ImM();
        }
        return this.LJ;
    }

    public final void LIZ(java.util.Map<String, Object> map) {
        Object obj;
        int i;
        this.LIZ = C47756Ioi.LJIIZILJ("video_bitrarte", map);
        this.LIZIZ = C47756Ioi.LJIIZILJ("audio_bitrarte", map);
        this.LIZLLL = C47756Ioi.LJIIZILJ("video_bitrarte_origin", map);
        if (map == null) {
            obj = null;
        } else {
            obj = ((HashMap) map).get("downgrade_type");
        }
        if (obj instanceof Integer) {
            i = ((Integer) obj).intValue();
        } else {
            i = 0;
        }
        this.LIZJ = i;
    }
}
