package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import ud2.ApS199S0100000_2;

/* renamed from: X.5w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150845w0 extends C63C {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJJJJJIL;
    public final C82631Wbr LLJJIJI;
    public final C146275od LLJJIJIIJIL;
    public final C82631Wbr LLJJIJIL;
    public final C62822Ol8 LLJJJ;
    public final C82632Wbs LLJJJIL;
    public final C62822Ol8 LLJJJJ;

    static {
        TBT tbt = new TBT(C150845w0.class, "globalEditStickerNewEngineApi", "getGlobalEditStickerNewEngineApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/GlobalEditStickerNewEngineApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLJJJJJIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C150845w0.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150845w0.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150845w0.class, "imageEditTempModel", "getImageEditTempModel()Lcom/ss/android/ugc/aweme/image/base/ImageEditTempModel;", 0, c65351Pkp)};
    }

    @Override // X.C63C
    public final InterfaceC1541063a LLJJIJIIJIL() {
        return new InterfaceC1541063a() { // from class: X.5w1
            @Override // X.InterfaceC1541063a
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1541063a
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1541063a
            public final boolean LIZLLL() {
                return true;
            }

            @Override // X.InterfaceC1541063a
            public final int[] LJFF(View view) {
                o.LJIIIZ(view, "view");
                return null;
            }

            @Override // X.InterfaceC1541063a
            public final InfoStickerModel LIZ() {
                C150845w0 c150845w0 = C150845w0.this;
                return (InfoStickerModel) ((C151155wV) c150845w0.LLJJJIL.LIZ(c150845w0, C150845w0.LLJJJJJIL[3])).LIZIZ.getValue();
            }

            @Override // X.InterfaceC1541063a
            public final boolean LJ() {
                return !C150845w0.this.LLJILJIL();
            }

            @Override // X.InterfaceC1541063a
            public final OSZ<Integer, Integer> LJI() {
                return new OSZ<>(Integer.valueOf(C151105wQ.LIZIZ), Integer.valueOf(C151105wQ.LIZ));
            }
        };
    }

    @Override // X.C63C
    public final C1545664u LLLF() {
        return (C1545664u) this.LLJJJJ.getValue();
    }

    @Override // X.C63C
    public final void LLLLIIL() {
        C63D c63d = this.LLJI;
        if (c63d != null) {
            c63d.LLILLIZIL(new OSZ<>(Integer.valueOf(C151105wQ.LIZIZ), Integer.valueOf(C151105wQ.LIZ)));
        }
    }

    public final InterfaceC150685vk LLLLIILLL() {
        return (InterfaceC150685vk) this.LLJJIJIL.LIZ(this, LLJJJJJIL[2]);
    }

    @Override // X.C63C
    public final void LLLJ(C82621Wbh builder) {
        o.LJIIIZ(builder, "builder");
        builder.LIZLLL(AnonymousClass671.class, null, new ApS199S0100000_2(this, 15));
    }

    @Override // X.C63C, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLJLIL().Eo(new C66F() { // from class: X.5w3
            @Override // X.C66F
            public final void LIZ() {
                InterfaceC150685vk LLLLIILLL = C150845w0.this.LLLLIILLL();
                if (LLLLIILLL != null) {
                    LLLLIILLL.Pr();
                }
            }

            @Override // X.C66F
            public final void LIZIZ() {
                InterfaceC150685vk LLLLIILLL = C150845w0.this.LLLLIILLL();
                if (LLLLIILLL != null) {
                    LLLLIILLL.Pr();
                }
            }

            @Override // X.C66F
            public final void LIZJ() {
                InterfaceC150685vk LLLLIILLL = C150845w0.this.LLLLIILLL();
                if (LLLLIILLL != null) {
                    LLLLIILLL.Pr();
                }
            }
        });
        C63D c63d = this.LLJI;
        if (c63d != null) {
            c63d.Bj0(new AnonymousClass688() { // from class: X.5w2
                @Override // X.AnonymousClass688
                public final void LJ() {
                }

                @Override // X.AnonymousClass688
                public final void LIZ(C67P stickerView) {
                    o.LJIIIZ(stickerView, "stickerView");
                    InterfaceC150685vk LLLLIILLL = C150845w0.this.LLLLIILLL();
                    if (LLLLIILLL != null) {
                        LLLLIILLL.Pr();
                    }
                }

                @Override // X.AnonymousClass688
                public final void LIZIZ(C67P stickerView) {
                    o.LJIIIZ(stickerView, "stickerView");
                    InterfaceC150685vk LLLLIILLL = C150845w0.this.LLLLIILLL();
                    if (LLLLIILLL != null) {
                        LLLLIILLL.Pr();
                    }
                }

                @Override // X.AnonymousClass688
                public final void LIZJ(C67P stickerView) {
                    o.LJIIIZ(stickerView, "stickerView");
                    InterfaceC150685vk LLLLIILLL = C150845w0.this.LLLLIILLL();
                    if (LLLLIILLL != null) {
                        LLLLIILLL.Pr();
                    }
                }

                @Override // X.AnonymousClass688
                public final void LIZLLL(C67P stickerView) {
                    o.LJIIIZ(stickerView, "stickerView");
                    InterfaceC150685vk LLLLIILLL = C150845w0.this.LLLLIILLL();
                    if (LLLLIILLL != null) {
                        LLLLIILLL.Pr();
                    }
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C150845w0(int i, C82622Wbi diContainer) {
        super(i, diContainer);
        o.LJIIIZ(diContainer, "diContainer");
        this.LLJJIJI = UCI.LJII(this.LJLIL, InterfaceC150885w4.class, null);
        this.LLJJIJIIJIL = new C146275od(this);
        this.LLJJIJIL = UCI.LJII(this.LJLIL, InterfaceC150685vk.class, null);
        this.LLJJJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 90));
        this.LLJJJIL = UCI.LJI(diContainer, C151155wV.class, null);
        this.LLJJJJ = C221108m2.LIZIZ(new AqS152S0100000_2(diContainer, 91));
    }

    @Override // X.C63C, X.InterfaceC150395vH
    public final void O9(Effect effect, String str) {
        boolean contains;
        ConcurrentHashMap<String, Object> LIZ;
        C1548165t c1548165t;
        o.LJIIIZ(effect, "effect");
        LLLII();
        if (this.mActivity == null) {
            return;
        }
        C137965bE c137965bE = (C137965bE) this.LJLJL.LIZ(this, C63C.LLJJIII[4]);
        AbstractC42651GoZ LJJIJIIJIL = C86793Y4n.LJJIJIIJIL(this);
        c137965bE.getClass();
        new C41386GMc(LJJIJIIJIL, ID0.LIZ(effect)).LIZ(new C137975bF(c137965bE, effect));
        if (C77117UOj.LJIJ(effect)) {
            if (!TextUtils.isEmpty(str) && (LIZ = C63872f1.LIZ(str)) != null && (c1548165t = (C1548165t) this.LLJJJ.getValue()) != null) {
                Object obj = LIZ.get("stickerId");
                o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = LIZ.get("path");
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = LIZ.get("width");
                o.LJII(obj3, "null cannot be cast to non-null type kotlin.String");
                int parseInt = CastIntegerProtector.parseInt((String) obj3);
                Object obj4 = LIZ.get("height");
                o.LJII(obj4, "null cannot be cast to non-null type kotlin.String");
                int parseInt2 = CastIntegerProtector.parseInt((String) obj4);
                Object obj5 = LIZ.get("cutout");
                o.LJII(obj5, "null cannot be cast to non-null type kotlin.String");
                c1548165t.LLJILJIL((String) obj, (String) obj2, parseInt, parseInt2, Boolean.parseBoolean((String) obj5));
                return;
            }
            return;
        }
        List<String> tags = effect.getTags();
        if (tags == null || !tags.contains("hashtag_global")) {
            List<String> tags2 = effect.getTags();
            if (tags2 == null) {
                contains = false;
            } else {
                contains = tags2.contains("hashtag_single");
            }
            if (contains) {
                InterfaceC150895w5 interfaceC150895w5 = (InterfaceC150895w5) this.LLJJIJIIJIL.LIZ(this, LLJJJJJIL[1]);
                if (interfaceC150895w5 != null) {
                    interfaceC150895w5.Sx();
                    return;
                }
                return;
            }
            List<String> tags3 = effect.getTags();
            if (tags3 == null || !tags3.contains("hashtag_embed")) {
                C1548165t c1548165t2 = (C1548165t) this.LLJJJ.getValue();
                if (c1548165t2 != null) {
                    c1548165t2.LLJILJILJ(effect, str);
                    return;
                }
                return;
            }
            InterfaceC150895w5 interfaceC150895w52 = (InterfaceC150895w5) this.LLJJIJIIJIL.LIZ(this, LLJJJJJIL[1]);
            if (interfaceC150895w52 != null) {
                interfaceC150895w52.wq0();
                return;
            }
            return;
        }
        InterfaceC150885w4 interfaceC150885w4 = (InterfaceC150885w4) this.LLJJIJI.LIZ(this, LLJJJJJIL[0]);
        if (interfaceC150885w4 != null) {
            interfaceC150885w4.Ot0();
        }
    }
}
