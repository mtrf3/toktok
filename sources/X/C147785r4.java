package X;

import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5r4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147785r4 extends C147685qu implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILL;
    public final C82622Wbi LLIILII;
    public final WMH LLIILZL;
    public final int LLIIZ;
    public final int LLIL;
    public final C5H3 LLILII;
    public final InterfaceC115514g7 LLILIL;

    static {
        TBT tbt = new TBT(C147785r4.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLILL = new InterfaceC74236TBo[]{tbt};
    }

    private final InterfaceC150895w5 LJJLIIIIJ() {
        return (InterfaceC150895w5) this.LLILIL.LIZ(this, LLILL[0]);
    }

    private final C150845w0 LJJLIIIJILLIZJL() {
        return (C150845w0) this.LLILII.getValue();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLI();
        Qy(LJJLIIIJILLIZJL());
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LLIILII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C147785r4(C82622Wbi diContainer, WMH parentScene, int i, int i2) {
        super(diContainer);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LLIILII = diContainer;
        this.LLIILZL = parentScene;
        this.LLIIZ = i;
        this.LLIL = i2;
        this.LLILII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 88));
        this.LLILIL = new InterfaceC115514g7() { // from class: X.5r5
            @Override // X.InterfaceC115514g7
            public final T LIZ(Object obj, InterfaceC74236TBo<?> interfaceC74236TBo) {
                o.LJIIIZ(obj, "<anonymous parameter 0>");
                o.LJIIIZ(interfaceC74236TBo, "<anonymous parameter 1>");
                InterfaceC151215wb interfaceC151215wb = (InterfaceC151215wb) InterfaceC135635Tz.this.getDiContainer().LJIIIIZZ(null, InterfaceC151215wb.class);
                if (interfaceC151215wb == null) {
                    return null;
                }
                return (T) interfaceC151215wb.br0(InterfaceC150895w5.class);
            }
        };
        C150845w0 LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        InterfaceC152085y0 interfaceC152085y0 = (InterfaceC152085y0) getDiContainer().LJ(InterfaceC152085y0.class, null);
        LJJLIIIJILLIZJL.getClass();
        LJJLIIIJILLIZJL.LJLJLLL = interfaceC152085y0;
        LJJLIIIJILLIZJL.LJLL = (AnonymousClass655) getDiContainer().LJ(AnonymousClass655.class, null);
        LJJLIIIJILLIZJL.LLILLJJLI = (InterfaceC137115Zr) getDiContainer().LJ(InterfaceC137115Zr.class, null);
        parentScene.add(i, LJJLIIIJILLIZJL, "EditStickerScene");
    }
}
