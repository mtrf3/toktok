package X;

/* loaded from: classes15.dex */
public final class VEG extends QXX {
    public final /* synthetic */ String[] LJLIL;
    public final /* synthetic */ VNU LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.QXX
    public final void LLLILZJ(VEH<String> veh) {
        String str = veh.LIZJ;
        if (str != null) {
            this.LJLIL[0] = str;
        } else {
            this.LJLILLLLZI.LJIIJ(this.LJLJI, "font", veh.LIZ.getMessage());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VEG(String[] strArr, VNU vnu, String str) {
        super((Object) null);
        this.LJLIL = strArr;
        this.LJLILLLLZI = vnu;
        this.LJLJI = str;
    }
}
