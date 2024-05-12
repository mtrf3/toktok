package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextEffectExtra;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.6Hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157776Hd extends C157816Hh {
    public InnerEffectTextLayoutConfig LJLIL;
    public java.util.Set<C157916Hr> LJLILLLLZI;
    public final EffectTextEffectExtra LJLJI;

    public C157776Hd() {
        throw null;
    }

    @Override // X.C157816Hh
    public final boolean LIZIZ() {
        EffectTextEffectExtra effectTextEffectExtra = this.LJLJI;
        if (effectTextEffectExtra.ifStandard || effectTextEffectExtra.LJLIL || super.LIZIZ()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.effect.getEffectId().hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (((java.lang.Boolean) r1).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C157786He
            if (r0 == 0) goto L4b
            r6 = r8
            X.6He r6 = (X.C157786He) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L51
            X.C141335gf.LIZJ(r1)
        L20:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L49
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L2d:
            X.C141335gf.LIZJ(r1)
            boolean r0 = r7.LIZIZ()
            if (r0 != 0) goto L49
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r7.effect
            r6.LJLJI = r4
            X.XIA r2 = X.C78613UtF.LIZJ
            X.6Fe r1 = new X.6Fe
            r0 = 0
            r1.<init>(r3, r0)
            java.lang.Object r1 = X.XKX.LJI(r2, r1, r6)
            if (r1 != r5) goto L20
            return r5
        L49:
            r4 = 0
            goto L28
        L4b:
            X.6He r6 = new X.6He
            r6.<init>(r7, r8)
            goto L12
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157776Hd.LIZLLL(X.2kd):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C157776Hd) {
            return o.LJ(((C157816Hh) obj).effect.getEffectId(), this.effect.getEffectId());
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157776Hd(Effect effect, EffectTextEffectExtra effectTextEffectExtra) {
        super(effect);
        HashSet hashSet = new HashSet();
        this.LJLIL = null;
        this.LJLILLLLZI = hashSet;
        this.LJLJI = effectTextEffectExtra;
    }
}
