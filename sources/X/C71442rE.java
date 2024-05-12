package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerSetDetailListResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSet;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2rE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71442rE extends AbstractC71812rp<StickerSet, StickerSetDetailListResponse, Long, InterfaceC71462rG> {
    public static final C71442rE LJII = new C71442rE();

    @Override // X.AbstractC71812rp
    public final String LJIIIIZZ() {
        return "sticker_set_detail";
    }

    @Override // X.AbstractC71812rp
    public final Long LJ() {
        return -1L;
    }

    @Override // X.AbstractC71812rp
    public final List<Long> LJFF() {
        return C47261Igj.LJJIJ(-1L);
    }

    public static String LJJ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("/sticker_store_resources/sticker_set_detail/");
        LIZ.append(j);
        LIZ.append('_');
        return UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ);
    }

    @Override // X.AbstractC71812rp
    public final String LJIIIZ(List<? extends Long> keys) {
        o.LJIIIZ(keys, "keys");
        return ORZ.LLD(keys, null, null, null, null, 63);
    }

    @Override // X.AbstractC71812rp
    public final Object LJIIZILJ(Object obj) {
        long longValue = ((Number) obj).longValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath());
        LIZ.append(LJJ(longValue));
        List LIZJ = C64544PUu.LIZJ(new File(X1D.LIZIZ(LIZ)), StickerSet.class);
        if (LIZJ != null) {
            return ORZ.LJLLLLLL(0, LIZJ);
        }
        return null;
    }

    @Override // X.AbstractC71812rp
    public final void LJIL(List<? extends Long> list) {
        C71582rS.LIZJ(list, false);
    }

    @Override // X.AbstractC71812rp
    public final InterfaceC71482rI LJI(final List keyList, final C84654XKg c84654XKg) {
        o.LJIIIZ(keyList, "keyList");
        return new InterfaceC71462rG() { // from class: X.2rH
            @Override // X.InterfaceC71462rG
            public final void Pd(List<Long> setIdList) {
                o.LJIIIZ(setIdList, "setIdList");
                if (setIdList.containsAll(keyList)) {
                    InterfaceC67352kd<C76800UCe> interfaceC67352kd = c84654XKg;
                    C76800UCe c76800UCe = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(c76800UCe);
                    interfaceC67352kd.resumeWith(c76800UCe);
                    C71442rE.LJII.LJIJ(this);
                }
            }
        };
    }

    @Override // X.AbstractC71812rp
    public final Object LJII(StickerSetDetailListResponse stickerSetDetailListResponse, InterfaceC67352kd<? super List<? extends OSZ<? extends Long, ? extends StickerSet>>> interfaceC67352kd) {
        Long setId;
        List<StickerSet> stickerSetList = stickerSetDetailListResponse.getStickerSetList();
        if (stickerSetList != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerSet stickerSet : stickerSetList) {
                StickerSetInfo info = stickerSet.getInfo();
                if (info != null && (setId = info.getSetId()) != null) {
                    arrayList.add(new OSZ(new Long(setId.longValue()), StickerSet.copy$default(stickerSet, StickerSetInfo.copy$default(stickerSet.getInfo(), null, null, null, null, null, null, null, null, new Integer(C1E4.LJIIJJI(stickerSet.getInfo())), null, null, null, null, 7935, null), null, 2, null)));
                }
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.AbstractC71812rp
    public final void LJIILJJIL(List<? extends Long> keys, InterfaceC71462rG interfaceC71462rG) {
        o.LJIIIZ(keys, "keys");
        interfaceC71462rG.Pd(keys);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.AbstractC71812rp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.util.List<? extends java.lang.Long> r13, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerSetDetailListResponse> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C71452rF
            if (r0 == 0) goto L1e
            r5 = r14
            X.2rF r5 = (X.C71452rF) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L24
            goto L5d
        L1e:
            X.2rF r5 = new X.2rF
            r5.<init>(r12, r14)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r1)
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r2 = X.C74722wW.LIZ()     // Catch: java.lang.Exception -> L63
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L63
            r0 = 91
            r1.append(r0)     // Catch: java.lang.Exception -> L63
            java.lang.String r7 = ","
            r8 = 0
            r11 = 62
            r6 = r13
            r9 = r8
            r10 = r8
            java.lang.String r0 = X.ORZ.LLD(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L63
            r1.append(r0)     // Catch: java.lang.Exception -> L63
            r0 = 93
            r1.append(r0)     // Catch: java.lang.Exception -> L63
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L63
            r5.LJLJI = r3     // Catch: java.lang.Exception -> L63
            java.lang.Object r1 = r2.batchGetStickerSetDetailList(r0, r5)     // Catch: java.lang.Exception -> L63
            if (r1 != r4) goto L60
            return r4
        L5d:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L63
        L60:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerSetDetailListResponse r1 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerSetDetailListResponse) r1     // Catch: java.lang.Exception -> L63
            goto L6a
        L63:
            r1 = move-exception
            java.lang.String r0 = "StickerSetDetailManager"
            X.C34B.LJ(r0, r1)
            r1 = 0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71442rE.LJIILLIIL(java.util.List, X.2kd):java.lang.Object");
    }

    @Override // X.AbstractC71812rp
    public final /* bridge */ /* synthetic */ void LJIJJ(Long l, StickerSet stickerSet) {
        LJJI(l.longValue(), stickerSet);
    }

    @Override // X.AbstractC71812rp
    public final void LJIJJLI(Long l, StickerSet result) {
        long longValue = l.longValue();
        o.LJIIIZ(result, "result");
        this.LIZ.put(Long.valueOf(longValue), result);
    }

    public final void LJJI(long j, StickerSet result) {
        o.LJIIIZ(result, "result");
        XKX.LIZLLL(this.LIZJ, null, null, new C71382r8(j, result, null), 3);
    }
}
