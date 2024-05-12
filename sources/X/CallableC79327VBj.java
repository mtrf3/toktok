package X;

import com.ss.videoarch.strategy.LiveStrategyManager;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.VBj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CallableC79327VBj implements Callable<String> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ LiveStrategyManager LJLJJL;

    @Override // java.util.concurrent.Callable
    public final String call() {
        Object LIZ;
        String str;
        if (this.LJLIL == 54) {
            if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableSetConfigToLiveIO != 1) {
                return null;
            }
            InterfaceC79328VBk interfaceC79328VBk = this.LJLJJL.mHashCodeToBundleMap.get(Integer.valueOf(this.LJLILLLLZI));
            if (interfaceC79328VBk != null && (LIZ = interfaceC79328VBk.LIZ("LiveIOSessionId", "LiveIOSessionId")) != null) {
                try {
                    this.LJLJI.put("session_id", LIZ);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        JSONObject jSONObject = this.LJLJI;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = "";
        }
        return this.LJLJJL.nativeExecuteCommand(this.LJLJJI, this.LJLIL, this.LJLILLLLZI, str);
    }

    public CallableC79327VBj(LiveStrategyManager liveStrategyManager, int i, int i2, JSONObject jSONObject, int i3) {
        this.LJLJJL = liveStrategyManager;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = jSONObject;
        this.LJLJJI = i3;
    }
}
