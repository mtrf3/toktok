package X;

import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class F0Q extends AbstractC39428Fdg {
    public final EnumC39924Flg LJLJI;

    @Override // X.AbstractC39428Fdg, X.InterfaceC40516FvE
    public final F0S LLLIZZ() {
        EnumC39924Flg enumC39924Flg = this.LJLJI;
        if (enumC39924Flg == EnumC39924Flg.LYNX) {
            return F0S.LYNX;
        }
        if (enumC39924Flg == EnumC39924Flg.WEB) {
            return F0S.WEB;
        }
        return F0S.NONE;
    }

    public F0Q(EnumC39924Flg enumC39924Flg, WeakReference<InterfaceC60761Nsz> weakReference) {
        super(weakReference);
        this.LJLJI = enumC39924Flg;
    }
}
