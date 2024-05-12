package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.platform.common.helper.SeiAppDataResp;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;

/* renamed from: X.Tk4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75496Tk4 {
    public final InterfaceC75508TkG LIZ;

    public C75496Tk4(InterfaceC75508TkG interfaceC75508TkG) {
        this.LIZ = interfaceC75508TkG;
    }

    public final void LIZ(C28272B7s c28272B7s) {
        SeiAppData seiAppData;
        SeiAppData seiAppData2;
        String str = c28272B7s.LIZIZ;
        if (!TextUtils.isEmpty(str)) {
            try {
                SeiAppDataResp seiAppDataResp = (SeiAppDataResp) C09650Zl.LIZJ.LJI(str, SeiAppDataResp.class);
                if (seiAppDataResp != null && !TextUtils.isEmpty(seiAppDataResp.seiAppDataStr)) {
                    this.LIZ.getClass();
                    String str2 = seiAppDataResp.seiAppDataStr;
                    LiveSeiStruct liveSeiStruct = c28272B7s.LIZ;
                    if (liveSeiStruct != null) {
                        seiAppData = liveSeiStruct.LIZ;
                    } else {
                        seiAppData = null;
                        try {
                            seiAppData2 = (SeiAppData) C09650Zl.LIZIZ.LJI(str2, SeiAppData.class);
                        } catch (Throwable unused) {
                        }
                        if (seiAppData2 != null) {
                            if (seiAppData2.version >= 0) {
                                seiAppData = seiAppData2;
                                ((C75492Tk0) this.LIZ).LJJJJLI(seiAppData);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (seiAppData == null) {
                        return;
                    }
                    ((C75492Tk0) this.LIZ).LJJJJLI(seiAppData);
                    return;
                }
                this.LIZ.getClass();
            } catch (Exception e) {
                C0NB.LJII(e);
            }
        }
    }
}
