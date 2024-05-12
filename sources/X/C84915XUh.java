package X;

import Y.AfS1S0112000_15;
import Y.AfS67S0100000_15;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XUh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84915XUh extends AbstractC84920XUm {
    public final boolean LJIIIIZZ;
    public final C62873Olx LJIIIZ;
    public final boolean LJIIJ;

    @Override // X.AbstractC84920XUm
    public final InterfaceC64592gB<C84768XOq> LJ() {
        return new AfS1S0112000_15(this, 1);
    }

    @Override // X.AbstractC84920XUm
    public final InterfaceC64592gB<C84767XOp> LJFF() {
        return new AfS67S0100000_15(this, 69);
    }

    @Override // X.AbstractC84920XUm
    public final boolean LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC84920XUm
    public final boolean LJI() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC84920XUm
    public final void LIZIZ(InterfaceC84926XUs interfaceC84926XUs) {
        C84919XUl c84919XUl = this.LJII;
        if (c84919XUl != null) {
            c84919XUl.LJFF(interfaceC84926XUs);
        }
    }

    @Override // X.AbstractC84920XUm
    public final void LIZ(C84868XSm musicFetcher, MusicModel musicModel) {
        o.LJIIIZ(musicFetcher, "musicFetcher");
        if (musicModel != null) {
            String musicId = musicModel.getMusicId();
            o.LJIIIIZZ(musicId, "it.musicId");
            musicFetcher.LIZ(musicId);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C84915XUh(android.content.Context r10, java.lang.String r11, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r12, java.lang.String r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            r4 = r10
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            android.content.Context r2 = X.C16880lQ.LLLLL(r4)
            java.lang.String r0 = "context.applicationContext"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            X.XSm r3 = new X.XSm
            r6 = 0
            r7 = 1
            java.lang.String r5 = "prop_detail_page"
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8)
            X.XSc r1 = r3.LIZ
            r0 = 2
            r1.LJ = r0
            r9.<init>(r2, r11, r12, r3)
            r9.LJIIIIZZ = r14
            X.Olx r1 = new X.Olx
            if (r12 == 0) goto L33
            java.lang.String r0 = r12.getMusicId()
        L2b:
            r1.<init>(r13, r11, r0)
            r9.LJIIIZ = r1
            r9.LJIIJ = r7
            return
        L33:
            r0 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84915XUh.<init>(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, boolean):void");
    }
}
