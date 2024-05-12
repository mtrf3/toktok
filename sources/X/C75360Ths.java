package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ths, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75360Ths {
    public InterfaceC75370Ti2 LIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJFF;
    public InterfaceC75372Ti4 LJI;
    public String LIZIZ = "";
    public final C75359Thr LJII = new C75359Thr(this);

    public final void LIZ() {
        String valueOf;
        C0NB.LJIIIZ("MultiGuestAdPlayer", "release");
        if (this.LJFF > 0) {
            int i = this.LJ;
            int i2 = this.LIZLLL;
            if (i < i2) {
                i2 = i + 1;
            }
            String str = "1";
            if (this.LIZJ) {
                String adId = this.LIZIZ;
                String playTimes = String.valueOf(i2);
                String duration = String.valueOf(System.currentTimeMillis() - this.LJFF);
                o.LJIIIZ(adId, "adId");
                o.LJIIIZ(playTimes, "playTimes");
                o.LJIIIZ(duration, "duration");
                HashMap hashMap = new HashMap();
                TTK.LIZ(hashMap);
                hashMap.put("ad_id", adId);
                if (C74838TYs.LJ().LJJ == 0) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("is_guest_connection", str);
                hashMap.put("play_cnt", playTimes);
                hashMap.put("duration", duration);
                TTK.LIZLLL("livesdk_anchor_ops_material_duration", hashMap);
            } else {
                String adId2 = this.LIZIZ;
                String playTimes2 = String.valueOf(i2);
                o.LJIIIZ(adId2, "adId");
                o.LJIIIZ(playTimes2, "playTimes");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("enter_method", BJM.LJIIIIZZ());
                hashMap2.put("enter_from_merge", BJM.LJFF());
                hashMap2.put("action_type", BJM.LIZLLL());
                TTK.LIZ(hashMap2);
                hashMap2.put("ad_id", adId2);
                if (C74838TYs.LJ().LJJ == 0) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap2.put("is_guest_connection", str);
                hashMap2.put("play_cnt", playTimes2);
                if (TTK.LIZJ) {
                    valueOf = String.valueOf(TTK.LIZ);
                } else {
                    valueOf = String.valueOf((System.currentTimeMillis() - TTK.LIZIZ) + TTK.LIZ);
                }
                hashMap2.put("duration", valueOf);
                TTK.LIZ = 0L;
                TTK.LIZIZ = 0L;
                TTK.LIZLLL("livesdk_ops_material_view_duration", hashMap2);
            }
        }
        this.LJ = 0;
        InterfaceC75370Ti2 interfaceC75370Ti2 = this.LIZ;
        if (interfaceC75370Ti2 != null) {
            interfaceC75370Ti2.release();
        }
        this.LIZ = null;
        this.LJFF = 0L;
    }
}
