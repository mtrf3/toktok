package X;

import Y.ARunnableS9S0200100_13;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.gift.render.model.Effect;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Ulu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78158Ulu extends AbstractC78171Um7 {
    public final C32449CoP LIZ;
    public final Effect LIZIZ;
    public final C78217Umr LIZJ;
    public C78174UmA LIZLLL;
    public final AssetsModel LJ;
    public long LJFF;
    public long LJI;

    public C78158Ulu(C32449CoP request) {
        AssetsModel assetsModel;
        o.LJIIIZ(request, "request");
        this.LIZ = request;
        Effect effect = request.LIZ;
        this.LIZIZ = effect;
        C78217Umr c78217Umr = request.LJIIJJI;
        if (c78217Umr != null) {
            this.LIZJ = c78217Umr;
            if (effect != null) {
                assetsModel = effect.LIZ();
            } else {
                assetsModel = null;
            }
            this.LJ = assetsModel;
            return;
        }
        throw new IllegalStateException("Request.LynxInfo should not be null");
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        C78174UmA c78174UmA = new C78174UmA();
        c78174UmA.LIZIZ();
        this.LIZLLL = c78174UmA;
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        LJFF(engine, new C78163Ulz(-29, (String) null, 6));
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        this.LJFF = System.currentTimeMillis();
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJIIIIZZ(EnumC78220Umu engine) {
        AssetsModel assetsModel;
        Long l;
        boolean z;
        o.LJIIIZ(engine, "engine");
        this.LJI = System.currentTimeMillis();
        Effect effect = this.LIZ.LIZ;
        Long l2 = null;
        if (effect != null) {
            assetsModel = effect.LIZ();
        } else {
            assetsModel = null;
        }
        C32449CoP c32449CoP = this.LIZ;
        C78160Ulw c78160Ulw = c32449CoP.LIZJ;
        Effect effect2 = c32449CoP.LIZ;
        if (effect2 != null) {
            l = Long.valueOf(effect2.giftId);
        } else {
            l = null;
        }
        Effect effect3 = this.LIZ.LIZ;
        if (effect3 != null) {
            l2 = Long.valueOf(effect3.assetId);
        }
        Long valueOf = Long.valueOf(this.LJI);
        boolean z2 = false;
        if (c78160Ulw != null && c78160Ulw.LIZJ) {
            z = true;
            LJIIJJI("_self", assetsModel, c78160Ulw, l, l2, valueOf);
        } else {
            z = false;
            if (C32257ClJ.LJFF() == 1) {
                LJIIJJI("_anchor", assetsModel, c78160Ulw, l, l2, valueOf);
            }
        }
        if (c78160Ulw != null && c78160Ulw.LJIILJJIL) {
            z2 = true;
        }
        if (GiftEventTrackSamplingSetting.shouldBlock(z2)) {
            return;
        }
        if (GiftEventTrackSamplingSetting.enable() && (z || C32257ClJ.LJFF() == 1)) {
            return;
        }
        LJIIJJI("", assetsModel, c78160Ulw, l, l2, valueOf);
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJFF(EnumC78220Umu engine, C78163Ulz error) {
        o.LJIIIZ(engine, "engine");
        o.LJIIIZ(error, "error");
        C78174UmA c78174UmA = this.LIZLLL;
        if (c78174UmA != null) {
            c78174UmA.LIZJ();
        }
        long j = 0;
        if (this.LJI > 0) {
            j = System.currentTimeMillis() - this.LJI;
        }
        C65032gt.LIZ(new ARunnableS9S0200100_13(this, error, j, 1));
    }

    @Override // X.InterfaceC78206Umg
    public final void LJII(EnumC78220Umu engine, C78165Um1 c78165Um1) {
        o.LJIIIZ(engine, "engine");
        C78174UmA c78174UmA = this.LIZLLL;
        if (c78174UmA != null) {
            c78174UmA.LIZLLL(new AqS144S0200000_13(this, c78165Um1, 101));
        } else {
            LJIIIZ(c78165Um1, null, System.currentTimeMillis());
        }
    }

    public final void LJIIIZ(C78165Um1 c78165Um1, C78164Um0 c78164Um0, long j) {
        int i;
        java.util.Map<String, String> map;
        String str;
        Integer LJJIL;
        C78160Ulw c78160Ulw = this.LIZ.LIZJ;
        boolean z = false;
        if (c78160Ulw != null && (map = c78160Ulw.LJ) != null && (str = map.get("is_own_send")) != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        if (i == 0) {
            if (C32257ClJ.LJFF() == 1) {
                LJIIJ("_anchor", c78165Um1, c78164Um0, j);
            }
        } else if (i == 1) {
            LJIIJ("_self", c78165Um1, c78164Um0, j);
        }
        C78160Ulw c78160Ulw2 = this.LIZ.LIZJ;
        if (c78160Ulw2 != null && c78160Ulw2.LJIILJJIL) {
            z = true;
        }
        if (GiftEventTrackSamplingSetting.shouldBlock(z)) {
            return;
        }
        if (GiftEventTrackSamplingSetting.enable() && (i == 1 || C32257ClJ.LJFF() == 1)) {
            return;
        }
        LJIIJ("", c78165Um1, c78164Um0, j);
    }

    public final void LJIIJ(String str, C78165Um1 c78165Um1, C78164Um0 c78164Um0, long j) {
        C65032gt.LIZ(new RunnableC78157Ult(this, c78165Um1, j, c78164Um0, str));
    }

    public final void LJIIJJI(String str, AssetsModel assetsModel, C78160Ulw c78160Ulw, Long l, Long l2, Long l3) {
        C65032gt.LIZ(new RunnableC78155Ulr(c78160Ulw, l3, l2, this, str, l, assetsModel));
    }
}
