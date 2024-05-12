package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.b1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Thr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75359Thr implements IPR {
    public final /* synthetic */ C75360Ths LJLIL;

    @Override // X.IPR
    public final void LIZIZ(int i) {
    }

    @Override // X.IPR
    public final void LJIILL(String str) {
    }

    @Override // X.IPR
    public final void LJJJI() {
    }

    @Override // X.IPR
    public final void LJJJJZI() {
    }

    @Override // X.IPR
    public final void onBuffering(boolean z) {
    }

    @Override // X.IPR
    public final void onPlayProgressChange(float f) {
    }

    @Override // X.IPR
    public final void LIZ() {
        C0NB.LJIIIZ("MultiGuestAdPlayer", "multiGuest ad onRenderFirstFrame");
        this.LJLIL.LJFF = System.currentTimeMillis();
        C75360Ths c75360Ths = this.LJLIL;
        String str = "1";
        if (c75360Ths.LIZJ) {
            String adId = c75360Ths.LIZIZ;
            o.LJIIIZ(adId, "adId");
            HashMap hashMap = new HashMap();
            TTK.LIZ(hashMap);
            hashMap.put("ad_id", adId);
            if (C74838TYs.LJ().LJJ == 0) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_guest_connection", str);
            TTK.LIZLLL("livesdk_anchor_ops_material_start", hashMap);
            return;
        }
        String adId2 = c75360Ths.LIZIZ;
        o.LJIIIZ(adId2, "adId");
        TTK.LIZIZ = System.currentTimeMillis();
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
        TTK.LIZLLL("livesdk_ops_material_view_start", hashMap2);
    }

    public C75359Thr(C75360Ths c75360Ths) {
        this.LJLIL = c75360Ths;
    }

    @Override // X.IPR
    public final void LIZJ(String str) {
        C279017q.LJ("onPlayFailed error:", str, "MultiGuestAdPlayer");
        InterfaceC75372Ti4 interfaceC75372Ti4 = this.LJLIL.LJI;
        if (interfaceC75372Ti4 != null) {
            interfaceC75372Ti4.LIZJ(str);
        }
    }

    @Override // X.IPR
    public final void onPlayCompleted(String str) {
        InterfaceC75372Ti4 interfaceC75372Ti4;
        this.LJLIL.LJ++;
        StringBuilder LIZIZ = C25620zW.LIZIZ("onPlayCompleted sourceId:", str, ", currentPlayTimes:");
        LIZIZ.append(this.LJLIL.LJ);
        LIZIZ.append(", playTimes:");
        b1.LJ(LIZIZ, this.LJLIL.LIZLLL, LIZIZ, "MultiGuestAdPlayer");
        C75360Ths c75360Ths = this.LJLIL;
        if (c75360Ths.LJ >= c75360Ths.LIZLLL && (interfaceC75372Ti4 = c75360Ths.LJI) != null) {
            interfaceC75372Ti4.LIZ();
        }
    }

    @Override // X.IPR
    public final void onResumePlay(String str) {
        C279017q.LJ("onResumePlay sourceId:", str, "MultiGuestAdPlayer");
    }
}
