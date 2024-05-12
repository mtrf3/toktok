package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.base.TraceEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public final class VNV extends LynxViewClient {
    public final CopyOnWriteArrayList<LynxViewClient> LIZ = new CopyOnWriteArrayList<>();

    @Override // com.lynx.tasm.LynxViewClient
    public final void LIZLLL() {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJ() {
        TraceEvent.LIZIZ("Client.onDestory");
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJ();
        }
        TraceEvent.LJ("Client.onDestory");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJII();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIJJI();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILIIL() {
        TraceEvent.LIZIZ("Client.onLynxViewAndJSRuntimeDestroy");
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIILIIL();
        }
        TraceEvent.LJ("Client.onLynxViewAndJSRuntimeDestroy");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIILLIIL();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJIFFI();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJZLJL() {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJIIJZLJL();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC79290V9y
    public final String LIZIZ(String str) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            String LIZIZ = it.next().LIZIZ(str);
            if (LIZIZ != null) {
                return LIZIZ;
            }
        }
        return null;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LIZJ(java.util.Map<String, Object> map) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(map);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJFF(HashMap<String, Object> hashMap) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJFF(hashMap);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJI(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIIIZZ(C60877Nur c60877Nur) {
        TraceEvent.LIZIZ("Client.onFling");
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ(c60877Nur);
        }
        TraceEvent.LJ("Client.onFling");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIIZ(JavaOnlyMap javaOnlyMap) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ(javaOnlyMap);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ(String str) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIJ(str);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIL(C40154FpO c40154FpO) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIL(c40154FpO);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIILL(str);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        TraceEvent.LIZIZ("Client.onPiperInvoked");
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIZILJ(map);
        }
        TraceEvent.LJ("Client.onPiperInvoked");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIJ(lynxError);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJI(String str) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIJI(str);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJJ(LynxError lynxError) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIJJ(lynxError);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJJLI(LynxError lynxError) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIJJLI(lynxError);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIL(LynxError lynxError) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIL(lynxError);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJ(java.util.Set<String> set) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJ(set);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJI(VMD vmd) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJI(vmd);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJII(C60877Nur c60877Nur) {
        TraceEvent.LIZIZ("Client.onScrollStart");
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJII(c60877Nur);
        }
        TraceEvent.LJ("Client.onScrollStart");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIII(C60877Nur c60877Nur) {
        TraceEvent.LIZIZ("Client.onScrollStop");
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJIII(c60877Nur);
        }
        TraceEvent.LJ("Client.onScrollStop");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(LynxPerfMetric lynxPerfMetric) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJIIZ(lynxPerfMetric);
        }
    }

    public final void LJJIIZI(LynxViewClient lynxViewClient) {
        if (!this.LIZ.contains(lynxViewClient)) {
            this.LIZ.add(lynxViewClient);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(java.util.Map<String, Object> map) {
        TraceEvent.LIZIZ("Client.onTimingSetup");
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().onTimingSetup(map);
        }
        TraceEvent.LJ("Client.onTimingSetup");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL(int i, String str, String str2) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIILJJIL(i, str, str2);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJ(String str, java.util.Map map, java.util.Map map2) {
        TraceEvent.LIZIZ("Client.onTimingUpdate");
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJIIJ(str, map, map2);
        }
        TraceEvent.LJ("Client.onTimingUpdate");
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC79290V9y
    public final void LIZ(VNU vnu, String str, float f, float f2, C79286V9u c79286V9u) {
        Iterator<LynxViewClient> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(vnu, str, f, f2, c79286V9u);
        }
    }
}
