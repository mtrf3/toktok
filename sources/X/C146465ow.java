package X;

import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146465ow extends C147685qu implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILIL;
    public final C82622Wbi LLIILII;
    public final WMH LLIILZL;
    public final int LLIIZ;
    public final C5H3 LLIL;
    public final InterfaceC115514g7 LLILII;

    static {
        TBT tbt = new TBT(C146465ow.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLILIL = new InterfaceC74236TBo[]{tbt};
    }

    private final InterfaceC142515iZ LJJLIIIIJ() {
        return (InterfaceC142515iZ) this.LLILII.LIZ(this, LLILIL[0]);
    }

    private final C147885rE LJJLIIIJJI() {
        return (C147885rE) this.LLIL.getValue();
    }

    private final C147885rE LJJLIIIJILLIZJL() {
        return LJJLIIIJJI();
    }

    @Override // X.C147685qu, X.InterfaceC140385f8
    public void X80() {
        LJJLIIIJJI().LLJJ(null);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLI();
        Qy(LJJLIIIJJI());
        LJJLIIIIJ().M60(this);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLIIIIJ().M60(null);
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LLIILII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C146465ow(C82622Wbi diContainer, WMH parentScene, int i) {
        super(diContainer);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LLIILII = diContainer;
        this.LLIILZL = parentScene;
        this.LLIIZ = i;
        this.LLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 466));
        this.LLILII = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        C147885rE LJJLIIIJJI = LJJLIIIJJI();
        InterfaceC152085y0 interfaceC152085y0 = (InterfaceC152085y0) getDiContainer().LJ(InterfaceC152085y0.class, null);
        LJJLIIIJJI.getClass();
        LJJLIIIJJI.LJLJLLL = interfaceC152085y0;
        LJJLIIIJJI.LJLL = (AnonymousClass655) getDiContainer().LJ(AnonymousClass655.class, null);
        LJJLIIIJJI.LLILLJJLI = (InterfaceC137115Zr) getDiContainer().LJ(InterfaceC137115Zr.class, null);
        parentScene.add(i, LJJLIIIJJI, "EditStickerScene");
    }
}