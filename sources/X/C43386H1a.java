package X;

import Y.ARunnableS43S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H1a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43386H1a implements GUG {
    public final GUU LIZ;
    public final InterfaceC43387H1b LIZIZ;
    public volatile C87614Ya2 LIZJ;
    public final C43404H1s LIZLLL;
    public final C43403H1r LJ;

    @Override // X.GUG
    public final void LIZ() {
    }

    @Override // X.GUG
    public final void LIZJ() {
    }

    @Override // X.GUG
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.GUG
    public final boolean LJFF(ARunnableS43S0100000_7 compileSuccessAfterPauseCallback) {
        o.LJIIIZ(compileSuccessAfterPauseCallback, "compileSuccessAfterPauseCallback");
        return false;
    }

    @Override // X.GUG
    public final void resume() {
        C87614Ya2 c87614Ya2 = this.LIZJ;
        if (c87614Ya2 != null) {
            C87614Ya2.LJ(c87614Ya2);
        } else {
            o.LJIJI("net");
            throw null;
        }
    }

    @Override // X.GUG
    public final void LIZIZ(GUX gux) {
        C87612Ya0 c87612Ya0 = new C87612Ya0(H1U.AUTH_KEY, C43363H0d.LJLIL);
        C87612Ya0 c87612Ya02 = new C87612Ya0(H1U.COVER_TEXT_UPLOAD, new AqS157S0100000_7(this, 453));
        C87612Ya0 c87612Ya03 = new C87612Ya0(H1U.EDIT_POST, C41786Gac.LJLIL);
        H6E h6e = new H6E("EditPostPublisher", (C87612Ya0[]) Arrays.copyOf(new C87612Ya0[]{c87612Ya0}, 1));
        ArrayList arrayList = (ArrayList) h6e.LIZ;
        arrayList.add(this.LIZLLL);
        arrayList.add(this.LJ);
        arrayList.add(new C43397H1l(this.LIZ.LIZIZ));
        arrayList.add(this.LIZIZ);
        this.LIZIZ.LIZLLL();
        h6e.LIZLLL = new C43400H1o(C75806Tp4.LJI());
        this.LIZJ = h6e.LIZ();
        c87612Ya02.LIZ(c87612Ya0);
        c87612Ya03.LIZ(c87612Ya02, c87612Ya0);
        C87614Ya2 c87614Ya2 = this.LIZJ;
        if (c87614Ya2 != null) {
            C87614Ya2 c87614Ya22 = this.LIZJ;
            if (c87614Ya22 != null) {
                c87614Ya2.LIZ(new C41737GZp(c87614Ya22.LJII, gux));
                C87614Ya2 c87614Ya23 = this.LIZJ;
                if (c87614Ya23 != null) {
                    c87614Ya23.LJIIIIZZ();
                    return;
                } else {
                    o.LJIJI("net");
                    throw null;
                }
            }
            o.LJIJI("net");
            throw null;
        }
        o.LJIJI("net");
        throw null;
    }

    @Override // X.GUG
    public final void LJ(C41359GLb cancelCause) {
        o.LJIIIZ(cancelCause, "cancelCause");
        if (this.LIZJ != null) {
            C87614Ya2 c87614Ya2 = this.LIZJ;
            if (c87614Ya2 != null) {
                c87614Ya2.LIZIZ(cancelCause);
            } else {
                o.LJIJI("net");
                throw null;
            }
        }
    }

    public C43386H1a(GUU record, String publishId, C43478H4o c43478H4o) {
        o.LJIIIZ(record, "record");
        o.LJIIIZ(publishId, "publishId");
        this.LIZ = record;
        this.LIZIZ = c43478H4o;
        this.LIZLLL = new C43404H1s(record.LIZ);
        BaseShortVideoContext baseShortVideoContext = record.LIZ.editModel;
        o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        this.LJ = new C43403H1r((VideoPublishEditModel) baseShortVideoContext);
    }
}
