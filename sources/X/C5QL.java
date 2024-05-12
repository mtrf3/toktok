package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS14S0000100_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5QL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5QL extends AbstractC48231ut<C5PM, C5Q4, C5QB, C5QJ> implements InterfaceC135635Tz, C5PM {
    public final C82622Wbi LJLL;
    public NLEModel LJLLI;
    public OSZ<Float, Float> LJLLILLLL;
    public final HashMap<String, InterfaceC132925Jo> LJLLJ;
    public volatile C132885Jk LJLLL;
    public OSZ<? extends NLETrack, ? extends NLETrackSlot> LJLLLL;
    public NLEEditor LJLLLLLL;
    public Float LJLZ;

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5QJ> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 697);
    }

    @Override // X.C5PM
    public void T2() {
        LJJZZI(C5QM.LJLIL);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5QB> LJJLIIIJJI() {
        return C5QN.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.C5PM
    public void LJLJLLL(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 40));
    }

    @Override // X.C5PM
    public void LJZ(NLEModel nleModel) {
        NLETrackSlot second;
        NLETrack trackBySlot;
        o.LJIIIZ(nleModel, "nleModel");
        this.LJLLI = nleModel;
        LJJZZI(new AqS168S0100000_2(nleModel, 406));
        OSZ<NLETrack, NLETrackSlot> osz = LJJLJ().LIZIZ;
        if (osz != null && (second = osz.getSecond()) != null) {
            String uuid = second.getUUID();
            o.LJIIIIZZ(uuid, "currentSlot.uuid");
            NLETrackSlot LJIJJ = SFS.LJIJJ(nleModel, uuid);
            if (LJIJJ == null || o.LJ(LJIJJ.getStringId(), second.getStringId()) || (trackBySlot = nleModel.getTrackBySlot(LJIJJ)) == null) {
                return;
            }
            LJJZZI(new AqS133S0200000_2(trackBySlot, LJIJJ, 90));
        }
    }

    @Override // X.C5PM
    public void k6(String materialKey) {
        o.LJIIIZ(materialKey, "materialKey");
        for (Map.Entry<String, InterfaceC132925Jo> entry : this.LJLLJ.entrySet()) {
            if (o.LJ(entry.getKey(), materialKey)) {
                entry.getValue().LJIJI();
            } else {
                entry.getValue().LJIILL();
            }
        }
    }

    @Override // X.C5PM
    public <T extends InterfaceC132925Jo> T s0(String materialKey) {
        o.LJIIIZ(materialKey, "materialKey");
        return (T) this.LJLLJ.get(materialKey);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5QL(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        Float valueOf = Float.valueOf(0.0f);
        this.LJLLILLLL = new OSZ<>(valueOf, valueOf);
        this.LJLLJ = new HashMap<>();
    }

    @Override // X.C5PM
    public void G6(NLETrack track, NLETrackSlot slot) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        LJJZZI(new AqS133S0200000_2(track, slot, 89));
    }

    @Override // X.C5PM
    public void Z8(long j, boolean z) {
        LJJZZI(new AqS14S0000100_2(j, 4));
    }

    @Override // X.C5PM
    public void aJ(String materialKey, InterfaceC132925Jo material) {
        o.LJIIIZ(materialKey, "materialKey");
        o.LJIIIZ(material, "material");
        this.LJLLJ.put(materialKey, material);
        Collection<InterfaceC132925Jo> values = this.LJLLJ.values();
        o.LJIIIIZZ(values, "materials.values");
        LJJZZI(new AqS168S0100000_2(ORZ.LLJI(values), (List<C1536461g>) 404));
    }

    public final void cK(int i, int i2) {
        float f;
        NLEModel nLEModel = this.LJLLI;
        if (nLEModel != null) {
            f = nLEModel.getCanvasRatio();
        } else {
            f = 0.5625f;
        }
        this.LJLLL = new C132885Jk(f, i, i2);
        OSZ<Float, Float> LJLZ = LJLZ(f, i, i2);
        this.LJLLILLLL = LJLZ;
        LJJZZI(new AqS168S0100000_2(LJLZ, (OSZ<Integer, Integer>) 405));
    }

    private final OSZ<Float, Float> LJLZ(float f, float f2, float f3) {
        float f4 = f2 / f3;
        Float valueOf = Float.valueOf(1280.0f);
        Float valueOf2 = Float.valueOf(720.0f);
        if (f4 > f) {
            float f5 = f * f3;
            if (!Float.isInfinite(f5) && !Float.isNaN(f5) && !Float.isInfinite(f3) && !Float.isNaN(f3)) {
                return new OSZ<>(Float.valueOf(f5), Float.valueOf(f3));
            }
            return new OSZ<>(valueOf2, valueOf);
        }
        float f6 = f2 / f;
        if (!Float.isInfinite(f2) && !Float.isNaN(f2) && !Float.isInfinite(f6) && !Float.isNaN(f6)) {
            return new OSZ<>(Float.valueOf(f2), Float.valueOf(f6));
        }
        return new OSZ<>(valueOf2, valueOf);
    }
}
