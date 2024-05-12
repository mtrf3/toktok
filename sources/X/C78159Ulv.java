package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.gift.render.model.Effect;
import kotlin.jvm.internal.AqS17S0200100_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ulv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78159Ulv extends AbstractC78171Um7 {
    public final C78160Ulw LIZ;
    public final Effect LIZIZ;
    public final boolean LIZJ;
    public C78174UmA LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        C78248UnM.LJIILJJIL(this.LIZ, "playLoaded");
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZIZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        C78248UnM.LJIILJJIL(this.LIZ, "playPrepared");
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        C78174UmA c78174UmA = this.LIZLLL;
        if (c78174UmA != null) {
            c78174UmA.LIZJ();
        }
        LJIIJ(this, false, "unknown", new C78163Ulz(-29, "stopped", 4), 0.0f, 0.0f, null, 192);
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZLLL(EnumC78220Umu engine) {
        int i;
        int i2;
        o.LJIIIZ(engine, "engine");
        this.LJ = C32257ClJ.LIZLLL().LIZ();
        if (!this.LIZJ) {
            AssetsModel LIZ = this.LIZIZ.LIZ();
            C78160Ulw c78160Ulw = this.LIZ;
            Effect effect = this.LIZIZ;
            long j = effect.giftId;
            long j2 = effect.assetId;
            long j3 = this.LJ;
            C78248UnM.LJIILJJIL(c78160Ulw, "playStart");
            boolean z = false;
            if (c78160Ulw != null && c78160Ulw.LIZJ) {
                i = 1;
            } else {
                i = 0;
                if (C32257ClJ.LJFF() == 1) {
                    i = 0;
                    i2 = 1;
                    C78248UnM.LJIILIIL(j, j2, j3, LIZ, c78160Ulw, "_anchor");
                    if (c78160Ulw != null && c78160Ulw.LJIILJJIL == i2) {
                        z = true;
                    }
                    if (!GiftEventTrackSamplingSetting.shouldBlock(z) && (!GiftEventTrackSamplingSetting.enable() || (i != i2 && C32257ClJ.LJFF() != i2))) {
                        C78248UnM.LJIILIIL(j, j2, j3, LIZ, c78160Ulw, "");
                    }
                }
            }
            i2 = 1;
            if (i == 1) {
                C78248UnM.LJIILIIL(j, j2, j3, LIZ, c78160Ulw, "_self");
            }
            if (c78160Ulw != null) {
                z = true;
            }
            if (!GiftEventTrackSamplingSetting.shouldBlock(z)) {
                C78248UnM.LJIILIIL(j, j2, j3, LIZ, c78160Ulw, "");
            }
        }
        C78248UnM.LJIILJJIL(this.LIZ, "playLoad");
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        C78248UnM.LJIILJJIL(this.LIZ, "playPrepare");
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJIIIIZZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        C78174UmA c78174UmA = new C78174UmA();
        c78174UmA.LIZIZ();
        this.LIZLLL = c78174UmA;
        this.LJFF = C32257ClJ.LIZLLL().LIZ() - this.LJ;
        this.LJI = C32257ClJ.LIZLLL().LIZ();
        C78248UnM.LJIILJJIL(this.LIZ, "playFirstFrame");
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJFF(EnumC78220Umu engine, C78163Ulz error) {
        String str;
        o.LJIIIZ(engine, "engine");
        o.LJIIIZ(error, "error");
        C78174UmA c78174UmA = this.LIZLLL;
        if (c78174UmA != null) {
            c78174UmA.LIZJ();
        }
        C78165Um1 c78165Um1 = error.LIZLLL;
        if (c78165Um1 == null || (str = c78165Um1.LJIIIZ) == null) {
            str = "unknown";
        }
        LJIIJ(this, false, str, error, 0.0f, 0.0f, null, 192);
    }

    @Override // X.InterfaceC78206Umg
    public final void LJII(EnumC78220Umu engine, C78165Um1 c78165Um1) {
        o.LJIIIZ(engine, "engine");
        C78174UmA c78174UmA = this.LIZLLL;
        if (c78174UmA != null && 1 != 0 && c78174UmA != null) {
            long LIZ = C32257ClJ.LIZLLL().LIZ() - this.LJI;
            C78174UmA c78174UmA2 = this.LIZLLL;
            if (c78174UmA2 != null) {
                c78174UmA2.LIZLLL(new AqS17S0200100_13(this, c78165Um1, LIZ, 1));
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        LJIIJ(this, true, c78165Um1.LJIIIZ, null, c78165Um1.LIZIZ, c78165Um1.LIZJ, c78165Um1.LJIIJ, 128);
    }

    public C78159Ulv(C78160Ulw c78160Ulw, Effect effect, boolean z) {
        this.LIZ = c78160Ulw;
        this.LIZIZ = effect;
        this.LIZJ = z;
    }

    public static /* synthetic */ void LJIIJ(C78159Ulv c78159Ulv, boolean z, String str, C78163Ulz c78163Ulz, float f, float f2, JSONObject jSONObject, int i) {
        Long l;
        JSONObject jSONObject2 = jSONObject;
        if ((i & 64) != 0) {
            jSONObject2 = null;
        }
        if ((i & 128) != 0) {
            l = Long.valueOf(C32257ClJ.LIZLLL().LIZ() - c78159Ulv.LJI);
        } else {
            l = null;
        }
        c78159Ulv.LJIIIZ(z, str, c78163Ulz, f, f2, null, jSONObject2, l);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(boolean r29, java.lang.String r30, X.C78163Ulz r31, float r32, float r33, X.C78164Um0 r34, org.json.JSONObject r35, java.lang.Long r36) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78159Ulv.LJIIIZ(boolean, java.lang.String, X.Ulz, float, float, X.Um0, org.json.JSONObject, java.lang.Long):void");
    }
}
