package X;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.InZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47685InZ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C47686Ina LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47685InZ(C47686Ina c47686Ina) {
        super(0);
        this.LJLIL = c47686Ina;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C47686Ina c47686Ina = this.LJLIL;
        c47686Ina.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int size = c47686Ina.LJLJJI.size();
        ConcurrentHashMap<SurfaceTexture, Long> concurrentHashMap = c47686Ina.LJLJJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<SurfaceTexture, Long> entry : concurrentHashMap.entrySet()) {
            if (elapsedRealtime - entry.getValue().longValue() > c47686Ina.LJLILLLLZI) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            c47686Ina.LJLJJI.remove(it.next());
        }
        SimRadar.keyScan("TextureView", "DTextureView: trimStore, store.size: " + size + " -> " + c47686Ina.LJLJJI.size(), new Object[0]);
        return C76800UCe.LIZ;
    }
}
