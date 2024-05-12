package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ly7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55983Ly7 extends F9E implements C33Q {
    public final AbstractC72932td<M1E> LJLIL;
    public final EnumC55985Ly9 LJLILLLLZI;
    public final AbstractC72932td<C76800UCe> LJLJI;
    public final AbstractC72932td<C55813LvN> LJLJJI;
    public final AbstractC72932td<C68672ml> LJLJJL;
    public final AbstractC72932td<String> LJLJJLL;

    public C55983Ly7() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C55983Ly7(int r8) {
        /*
            r7 = this;
            X.33X r1 = X.C33X.LIZ
            X.Ly9 r2 = X.EnumC55985Ly9.DEFAULT
            r0 = r7
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55983Ly7.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C55983Ly7(AbstractC72932td<? extends M1E> loadDataStatus, EnumC55985Ly9 networkState, AbstractC72932td<C76800UCe> loadLynxStatus, AbstractC72932td<C55813LvN> shoppingCartCard, AbstractC72932td<C68672ml> shopCartTooltip, AbstractC72932td<String> topBarContentStyle) {
        o.LJIIIZ(loadDataStatus, "loadDataStatus");
        o.LJIIIZ(networkState, "networkState");
        o.LJIIIZ(loadLynxStatus, "loadLynxStatus");
        o.LJIIIZ(shoppingCartCard, "shoppingCartCard");
        o.LJIIIZ(shopCartTooltip, "shopCartTooltip");
        o.LJIIIZ(topBarContentStyle, "topBarContentStyle");
        this.LJLIL = loadDataStatus;
        this.LJLILLLLZI = networkState;
        this.LJLJI = loadLynxStatus;
        this.LJLJJI = shoppingCartCard;
        this.LJLJJL = shopCartTooltip;
        this.LJLJJLL = topBarContentStyle;
    }

    public static C55983Ly7 L(C55983Ly7 c55983Ly7, AbstractC72932td abstractC72932td, EnumC55985Ly9 enumC55985Ly9, AbstractC72932td abstractC72932td2, AbstractC72932td abstractC72932td3, AbstractC72932td abstractC72932td4, C72912tb c72912tb, int i) {
        AbstractC72932td<String> topBarContentStyle = c72912tb;
        AbstractC72932td shopCartTooltip = abstractC72932td4;
        AbstractC72932td shoppingCartCard = abstractC72932td3;
        AbstractC72932td loadLynxStatus = abstractC72932td2;
        AbstractC72932td loadDataStatus = abstractC72932td;
        EnumC55985Ly9 networkState = enumC55985Ly9;
        if ((i & 1) != 0) {
            loadDataStatus = c55983Ly7.LJLIL;
        }
        if ((i & 2) != 0) {
            networkState = c55983Ly7.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            loadLynxStatus = c55983Ly7.LJLJI;
        }
        if ((i & 8) != 0) {
            shoppingCartCard = c55983Ly7.LJLJJI;
        }
        if ((i & 16) != 0) {
            shopCartTooltip = c55983Ly7.LJLJJL;
        }
        if ((i & 32) != 0) {
            topBarContentStyle = c55983Ly7.LJLJJLL;
        }
        c55983Ly7.getClass();
        o.LJIIIZ(loadDataStatus, "loadDataStatus");
        o.LJIIIZ(networkState, "networkState");
        o.LJIIIZ(loadLynxStatus, "loadLynxStatus");
        o.LJIIIZ(shoppingCartCard, "shoppingCartCard");
        o.LJIIIZ(shopCartTooltip, "shopCartTooltip");
        o.LJIIIZ(topBarContentStyle, "topBarContentStyle");
        return new C55983Ly7(loadDataStatus, networkState, loadLynxStatus, shoppingCartCard, shopCartTooltip, topBarContentStyle);
    }
}
