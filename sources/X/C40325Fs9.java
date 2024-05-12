package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.fe.method.DownloadFileMethod;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* renamed from: X.Fs9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40325Fs9 implements InterfaceC61118Nyk {
    public final /* synthetic */ DownloadFileMethod LIZ;
    public final /* synthetic */ JSONObject LIZIZ;
    public final /* synthetic */ InterfaceC36488ETs LIZJ;
    public final /* synthetic */ Activity LIZLLL;

    public C40325Fs9(DownloadFileMethod downloadFileMethod, JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs, Activity activity) {
        this.LIZ = downloadFileMethod;
        this.LIZIZ = jSONObject;
        this.LIZJ = interfaceC36488ETs;
        this.LIZLLL = activity;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] iArr, String[] strArr) {
        if (iArr == null || iArr.length == 0 || iArr[0] != 0) {
            C26045AKb c26045AKb = new C26045AKb(this.LIZLLL);
            c26045AKb.LJIIIZ(this.LIZLLL.getString(R.string.bse));
            c26045AKb.LJIIJ();
            return;
        }
        this.LIZ.LIZLLL(this.LIZIZ, this.LIZJ);
    }
}
