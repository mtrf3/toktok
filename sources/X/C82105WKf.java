package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.WKf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82105WKf {
    public final InterfaceC82118WKs LIZ;
    public final WJA LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C08630Vn<Boolean> LJ;
    public final C08630Vn<Float> LJFF;
    public final C08630Vn<C165206e4> LJI;
    public final C08630Vn<C165236e7> LJII;
    public final C08630Vn<Integer> LJIIIIZZ;
    public final ShortVideoContext LJIIIZ;
    public final VideoPublishEditModel LJIIJ;
    public final C08630Vn<Boolean> LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82105WKf)) {
            return false;
        }
        C82105WKf c82105WKf = (C82105WKf) obj;
        return o.LJ(this.LIZ, c82105WKf.LIZ) && o.LJ(this.LIZIZ, c82105WKf.LIZIZ) && this.LIZJ == c82105WKf.LIZJ && this.LIZLLL == c82105WKf.LIZLLL && o.LJ(this.LJ, c82105WKf.LJ) && o.LJ(this.LJFF, c82105WKf.LJFF) && o.LJ(this.LJI, c82105WKf.LJI) && o.LJ(this.LJII, c82105WKf.LJII) && o.LJ(this.LJIIIIZZ, c82105WKf.LJIIIIZZ) && o.LJ(this.LJIIIZ, c82105WKf.LJIIIZ) && o.LJ(this.LJIIJ, c82105WKf.LJIIJ) && o.LJ(this.LJIIJJI, c82105WKf.LJIIJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
        C08630Vn<Boolean> c08630Vn = this.LJ;
        int hashCode2 = (i2 + (c08630Vn == null ? 0 : c08630Vn.hashCode())) * 31;
        C08630Vn<Float> c08630Vn2 = this.LJFF;
        int hashCode3 = (hashCode2 + (c08630Vn2 == null ? 0 : c08630Vn2.hashCode())) * 31;
        C08630Vn<C165206e4> c08630Vn3 = this.LJI;
        int hashCode4 = (hashCode3 + (c08630Vn3 == null ? 0 : c08630Vn3.hashCode())) * 31;
        C08630Vn<C165236e7> c08630Vn4 = this.LJII;
        int hashCode5 = (hashCode4 + (c08630Vn4 == null ? 0 : c08630Vn4.hashCode())) * 31;
        C08630Vn<Integer> c08630Vn5 = this.LJIIIIZZ;
        int hashCode6 = (hashCode5 + (c08630Vn5 == null ? 0 : c08630Vn5.hashCode())) * 31;
        ShortVideoContext shortVideoContext = this.LJIIIZ;
        int hashCode7 = (hashCode6 + (shortVideoContext == null ? 0 : shortVideoContext.hashCode())) * 31;
        VideoPublishEditModel videoPublishEditModel = this.LJIIJ;
        int hashCode8 = (hashCode7 + (videoPublishEditModel == null ? 0 : videoPublishEditModel.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn6 = this.LJIIJJI;
        return hashCode8 + (c08630Vn6 != null ? c08630Vn6.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarSceneState(toolbarApi=" + this.LIZ + ", toolbarManager=" + this.LIZIZ + ", showMore=" + this.LIZJ + ", toolbarVisible=" + this.LIZLLL + ", show=" + this.LJ + ", alpha=" + this.LJFF + ", getItemView=" + this.LJI + ", showLottieAnimator=" + this.LJII + ", marginTop=" + this.LJIIIIZZ + ", shortVideoContext=" + this.LJIIIZ + ", model=" + this.LJIIJ + ", relayout=" + this.LJIIJJI + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C82105WKf(X.InterfaceC82118WKs r14, X.WJA r15, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r16, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r17, int r18) {
        /*
            r13 = this;
            r1 = r18
            r10 = r16
            r11 = r17
            r0 = r1 & 4
            if (r0 == 0) goto L29
            r3 = 1
        Lb:
            r0 = r1 & 8
            if (r0 == 0) goto L27
            r4 = 1
        L10:
            r5 = 0
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L16
            r10 = r5
        L16:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L1b
            r11 = r5
        L1b:
            r1 = r14
            r2 = r15
            r0 = r13
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r12 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L27:
            r4 = 0
            goto L10
        L29:
            r3 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82105WKf.<init>(X.WKs, X.WJA, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int):void");
    }

    public static C82105WKf LIZ(C82105WKf c82105WKf, boolean z, C08630Vn c08630Vn, C08630Vn c08630Vn2, C08630Vn c08630Vn3, C08630Vn c08630Vn4, C08630Vn c08630Vn5, C08630Vn c08630Vn6, int i) {
        InterfaceC82118WKs toolbarApi;
        WJA toolbarManager;
        boolean z2;
        ShortVideoContext shortVideoContext;
        C08630Vn c08630Vn7 = c08630Vn6;
        C08630Vn c08630Vn8 = c08630Vn;
        boolean z3 = z;
        C08630Vn c08630Vn9 = c08630Vn2;
        C08630Vn c08630Vn10 = c08630Vn3;
        C08630Vn c08630Vn11 = c08630Vn4;
        C08630Vn c08630Vn12 = c08630Vn5;
        VideoPublishEditModel videoPublishEditModel = null;
        if ((i & 1) != 0) {
            toolbarApi = c82105WKf.LIZ;
        } else {
            toolbarApi = null;
        }
        if ((i & 2) != 0) {
            toolbarManager = c82105WKf.LIZIZ;
        } else {
            toolbarManager = null;
        }
        if ((i & 4) != 0) {
            z2 = c82105WKf.LIZJ;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = c82105WKf.LIZLLL;
        }
        if ((i & 16) != 0) {
            c08630Vn8 = c82105WKf.LJ;
        }
        if ((i & 32) != 0) {
            c08630Vn9 = c82105WKf.LJFF;
        }
        if ((i & 64) != 0) {
            c08630Vn10 = c82105WKf.LJI;
        }
        if ((i & 128) != 0) {
            c08630Vn11 = c82105WKf.LJII;
        }
        if ((i & 256) != 0) {
            c08630Vn12 = c82105WKf.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            shortVideoContext = c82105WKf.LJIIIZ;
        } else {
            shortVideoContext = null;
        }
        if ((i & 1024) != 0) {
            videoPublishEditModel = c82105WKf.LJIIJ;
        }
        if ((i & 2048) != 0) {
            c08630Vn7 = c82105WKf.LJIIJJI;
        }
        c82105WKf.getClass();
        o.LJIIIZ(toolbarApi, "toolbarApi");
        o.LJIIIZ(toolbarManager, "toolbarManager");
        return new C82105WKf(toolbarApi, toolbarManager, z2, z3, c08630Vn8, c08630Vn9, c08630Vn10, c08630Vn11, c08630Vn12, shortVideoContext, videoPublishEditModel, c08630Vn7);
    }

    public C82105WKf(InterfaceC82118WKs toolbarApi, WJA toolbarManager, boolean z, boolean z2, C08630Vn<Boolean> c08630Vn, C08630Vn<Float> c08630Vn2, C08630Vn<C165206e4> c08630Vn3, C08630Vn<C165236e7> c08630Vn4, C08630Vn<Integer> c08630Vn5, ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel, C08630Vn<Boolean> c08630Vn6) {
        o.LJIIIZ(toolbarApi, "toolbarApi");
        o.LJIIIZ(toolbarManager, "toolbarManager");
        this.LIZ = toolbarApi;
        this.LIZIZ = toolbarManager;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = c08630Vn;
        this.LJFF = c08630Vn2;
        this.LJI = c08630Vn3;
        this.LJII = c08630Vn4;
        this.LJIIIIZZ = c08630Vn5;
        this.LJIIIZ = shortVideoContext;
        this.LJIIJ = videoPublishEditModel;
        this.LJIIJJI = c08630Vn6;
    }
}
