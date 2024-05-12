package X;

import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TkP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75517TkP implements InterfaceC28235B6h {
    public final LiveMode LIZ;
    public boolean LIZIZ;

    public C75517TkP(LiveMode mode) {
        o.LJIIIZ(mode, "mode");
        this.LIZ = mode;
    }

    @Override // X.InterfaceC28235B6h
    public final void onSei(C28272B7s seiData) {
        int optInt;
        o.LJIIIZ(seiData, "seiData");
        if (this.LIZIZ) {
            return;
        }
        try {
            String str = seiData.LIZIZ;
            if (str == null) {
                str = "";
            }
            JSONObject jSONObject = new JSONObject(str);
            LiveSeiStruct liveSeiStruct = seiData.LIZ;
            if (liveSeiStruct != null) {
                SeiAppData seiAppData = liveSeiStruct.LIZ;
                if (seiAppData == null) {
                    return;
                } else {
                    optInt = seiAppData.version;
                }
            } else {
                String optString = jSONObject.optString("app_data");
                if (optString == null) {
                    return;
                } else {
                    optInt = new JSONObject(optString).optInt("ver");
                }
            }
            if (optInt == 16) {
                if (this.LIZ != LiveMode.LIVE_VOICE) {
                    C76177Tv3 c76177Tv3 = C76177Tv3.LIZ;
                    C65864Pt6 c65864Pt6 = new C65864Pt6();
                    c65864Pt6.put("version", String.valueOf(optInt));
                    c65864Pt6.put("live_room_mode", String.valueOf(this.LIZ.ordinal()));
                    c65864Pt6.build();
                    c76177Tv3.LIZ(90001, "voice chat mismatch", c65864Pt6);
                    this.LIZIZ = true;
                    return;
                }
                return;
            }
            if (this.LIZ == LiveMode.LIVE_VOICE) {
                C76177Tv3 c76177Tv32 = C76177Tv3.LIZ;
                C65864Pt6 c65864Pt62 = new C65864Pt6();
                c65864Pt62.put("version", String.valueOf(optInt));
                c65864Pt62.put("live_room_mode", String.valueOf(this.LIZ.ordinal()));
                c65864Pt62.build();
                c76177Tv32.LIZ(90001, "voice chat mismatch", c65864Pt62);
                this.LIZIZ = true;
            }
        } catch (Exception unused) {
        }
    }
}
