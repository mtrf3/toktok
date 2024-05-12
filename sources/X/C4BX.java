package X;

import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.4BX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4BX {
    public final C105394Br LIZ;
    public InterfaceC105334Bl LIZIZ;
    public C106624Gk LIZJ;
    public C72432sp LIZLLL;
    public C72442sq LJ;
    public NaviStatusCode LJFF;
    public final List<InterfaceC105334Bl> LJI;
    public int LJII;

    public final int LIZJ() {
        return this.LJI.size();
    }

    public final void LJ() {
        ((ArrayList) this.LJI).clear();
        LJI();
        if (C88963eO.LJFF()) {
            LJIIIZ();
            LJFF();
            LJII();
            LJIIIIZZ();
            return;
        }
        LJFF();
        LJIIIZ();
        LJIIIIZZ();
        LJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2ss, X.2sq] */
    public final void LJFF() {
        if (this.LIZ.LIZLLL) {
            C72442sq c72442sq = this.LJ;
            if (c72442sq != null) {
                LIZ(c72442sq);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            ?? r0 = new C72462ss() { // from class: X.2sq
                @Override // X.InterfaceC105334Bl
                public final int LJ() {
                    return 8;
                }

                @Override // X.C72462ss, X.InterfaceC105334Bl
                public final int LJFF() {
                    return 0;
                }

                @Override // X.C72462ss, X.InterfaceC105334Bl
                public final Drawable LIZ() {
                    int i;
                    C2068389v c2068389v = new C2068389v();
                    if (C88963eO.LJFF()) {
                        i = R.raw.icon_gif;
                    } else {
                        i = R.raw.icon_gif_circle;
                    }
                    c2068389v.LIZ = i;
                    c2068389v.LJ = Integer.valueOf(R.attr.go);
                    return c2068389v.LIZ(EF7.LIZIZ());
                }
            };
            LIZ(r0);
            this.LJ = r0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2ss, X.2sp] */
    public final void LJI() {
        if (this.LIZ.LIZJ) {
            C72432sp c72432sp = this.LIZLLL;
            if (c72432sp != null) {
                LIZ(c72432sp);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            ?? r0 = new C72462ss() { // from class: X.2sp
                @Override // X.InterfaceC105334Bl
                public final int LJ() {
                    return 7;
                }

                @Override // X.C72462ss, X.InterfaceC105334Bl
                public final int LJFF() {
                    return 0;
                }

                @Override // X.C72462ss, X.InterfaceC105334Bl
                public final Drawable LIZ() {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_star_light;
                    c2068389v.LJ = Integer.valueOf(R.attr.go);
                    return c2068389v.LIZ(EF7.LIZIZ());
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection, java.util.List<X.4Bx>] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
                @Override // X.C72462ss, X.InterfaceC105334Bl
                public final List<C105454Bx> LJIIJJI() {
                    C71882rw LJIIL;
                    ?? r4;
                    LJIIL = r0.LJIIL(C71512rL.LJII.LJ());
                    List<FavStickerStruct> list = (List) LJIIL.LIZ;
                    if (list != null) {
                        r4 = new ArrayList(C32I.LJJL(list, 10));
                        for (FavStickerStruct favStickerStruct : list) {
                            C105454Bx c105454Bx = new C105454Bx();
                            c105454Bx.LIZLLL = favStickerStruct.getStickerType();
                            c105454Bx.LJ = favStickerStruct.getSetSticker();
                            c105454Bx.LJFF = favStickerStruct.getVideoSticker();
                            r4.add(c105454Bx);
                        }
                    } else {
                        r4 = C61878OQg.INSTANCE;
                    }
                    if (C113644d6.LIZIZ()) {
                        List<C105454Bx> LLJILJILJ = ORZ.LLJILJILJ(r4);
                        C105454Bx c105454Bx2 = new C105454Bx();
                        c105454Bx2.LIZLLL = Integer.valueOf(EnumC73222u6.ENTRANCE.getType());
                        c105454Bx2.LJ = null;
                        c105454Bx2.LJFF = null;
                        ListProtector.add(LLJILJILJ, 0, c105454Bx2);
                        return LLJILJILJ;
                    }
                    return r4;
                }
            };
            LIZ(r0);
            this.LIZLLL = r0;
        }
    }

    public final void LJII() {
        C71882rw LJIIL;
        if (!this.LIZ.LJ) {
            return;
        }
        LJIIL = r0.LJIIL(C71572rR.LJII.LJ());
        List<StickerSetInfo> list = (List) LJIIL.LIZ;
        if (list != null) {
            for (StickerSetInfo stickerSetInfo : list) {
                C72422so c72422so = new C72422so();
                c72422so.LIZIZ = stickerSetInfo;
                LIZ(c72422so);
            }
        }
    }

    public final void LJIIIIZZ() {
        LinkedHashMap<Resources, List<Emoji>> linkedHashMap;
        NaviStatusCode naviStatusCode;
        int i;
        if (this.LIZ.LIZ) {
            C105734Cz c105734Cz = C4FF.LJLJJI;
            this.LJFF = c105734Cz.LIZ;
            if (C4AX.LIZ() && (naviStatusCode = this.LJFF) != null && (i = C105354Bn.LIZ[naviStatusCode.ordinal()]) != -1 && i != 1) {
                LIZ(new C89133ef());
            }
            boolean LIZ = C4AX.LIZ();
            if (LIZ) {
                linkedHashMap = c105734Cz.LIZIZ;
                if (linkedHashMap == null) {
                    return;
                }
            } else if (!LIZ) {
                LinkedHashMap<Resources, List<Emoji>> linkedHashMap2 = c105734Cz.LIZIZ;
                if (linkedHashMap2 == null) {
                    return;
                }
                linkedHashMap = new LinkedHashMap<>();
                for (Map.Entry<Resources, List<Emoji>> entry : linkedHashMap2.entrySet()) {
                    if (!o.LJ(entry.getKey().getType(), "STICKER_NAVI")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                throw new C162476Zf();
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            for (Map.Entry<Resources, List<Emoji>> entry2 : linkedHashMap.entrySet()) {
                Resources key = entry2.getKey();
                List<Emoji> value = entry2.getValue();
                C4BZ c4bz = new C4BZ();
                c4bz.LIZJ = key;
                c4bz.LIZIZ = value;
                LIZ(c4bz);
            }
        }
    }

    public final void LJIIIZ() {
        C105394Br c105394Br = this.LIZ;
        if (c105394Br.LIZIZ) {
            if (this.LIZJ == null) {
                this.LIZJ = new C106624Gk(c105394Br.LJI);
            }
            C106624Gk c106624Gk = this.LIZJ;
            o.LJI(c106624Gk);
            LIZ(c106624Gk);
        }
    }

    public C4BX(C105394Br emojiChooseParams) {
        o.LJIIIZ(emojiChooseParams, "emojiChooseParams");
        this.LIZ = emojiChooseParams;
        this.LJI = new ArrayList();
        LJI();
        LJFF();
        LJIIIZ();
        LIZLLL(0);
    }

    public final void LIZ(C72462ss c72462ss) {
        ((ArrayList) this.LJI).add(c72462ss);
    }

    public final InterfaceC105334Bl LIZIZ(int i) {
        return (InterfaceC105334Bl) ListProtector.get(this.LJI, i);
    }

    public final void LIZLLL(int i) {
        if (i < 0 || i > LIZJ() || this.LJI.isEmpty()) {
            return;
        }
        this.LJII = i;
        this.LIZIZ = (InterfaceC105334Bl) ListProtector.get(this.LJI, i);
    }
}
