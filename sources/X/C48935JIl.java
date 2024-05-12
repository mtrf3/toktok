package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JIl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48935JIl implements InterfaceC48940JIq {
    public JIB LIZ;
    public JGU LIZIZ;
    public C49153JQv LIZJ;
    public AbstractC49155JQx LIZLLL;
    public InterfaceC48908JHk LJ;
    public int LJFF;
    public Aweme LJI;
    public JQA LJII;
    public InterfaceC86353Xun LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public AbstractC48937JIn LJIIJJI;
    public InterfaceC65784Pro<? extends java.util.Map<String, String>> LJIIL;

    public C48935JIl() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        JIB jib = this.LIZ;
        int i = 0;
        if (jib == null) {
            hashCode = 0;
        } else {
            hashCode = jib.hashCode();
        }
        int i2 = hashCode * 31;
        JGU jgu = this.LIZIZ;
        if (jgu == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = jgu.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C49153JQv c49153JQv = this.LIZJ;
        if (c49153JQv == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c49153JQv.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        AbstractC49155JQx abstractC49155JQx = this.LIZLLL;
        if (abstractC49155JQx == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC49155JQx.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        InterfaceC48908JHk interfaceC48908JHk = this.LJ;
        if (interfaceC48908JHk == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = interfaceC48908JHk.hashCode();
        }
        int i6 = (((i5 + hashCode5) * 31) + this.LJFF) * 31;
        Aweme aweme = this.LJI;
        if (aweme == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = aweme.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        JQA jqa = this.LJII;
        if (jqa == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = jqa.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        InterfaceC86353Xun interfaceC86353Xun = this.LJIIIIZZ;
        if (interfaceC86353Xun == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = interfaceC86353Xun.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        boolean z = this.LJIIIZ;
        int i10 = 1;
        int i11 = z;
        if (z != 0) {
            i11 = 1;
        }
        int i12 = (i9 + i11) * 31;
        if (!this.LJIIJ) {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31 * 31;
        AbstractC48937JIn abstractC48937JIn = this.LJIIJJI;
        if (abstractC48937JIn == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = abstractC48937JIn.hashCode();
        }
        int i14 = (i13 + hashCode9) * 31;
        InterfaceC65784Pro<? extends java.util.Map<String, String>> interfaceC65784Pro = this.LJIIL;
        if (interfaceC65784Pro != null) {
            i = interfaceC65784Pro.hashCode();
        }
        return i14 + i;
    }

    public final String toString() {
        return "SearchLiveDataProvider(containerStatusProvider=" + this.LIZ + ", mPlayVideoObserver=" + this.LIZIZ + ", mScrollStateManager=" + this.LIZJ + ", mScrollStateObserver=" + this.LIZLLL + ", searchMediaLiveHelper=" + this.LJ + ", rank=" + this.LJFF + ", aweme=" + this.LJI + ", itemMobParam=" + this.LJII + ", mLivePlayHelper=" + this.LJIIIIZZ + ", mLiveStarted=" + this.LJIIIZ + ", mAttached=" + this.LJIIJ + ", mobListener=null, defaultSearchLivePlayListener=" + this.LJIIJJI + ", onLiveDurationParams=" + this.LJIIL + ')';
    }

    @Override // X.InterfaceC48940JIq
    public final Aweme getAweme() {
        return this.LJI;
    }

    public C48935JIl(Object obj) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = -1;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LJIIJJI = null;
        this.LJIIL = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48935JIl)) {
            return false;
        }
        C48935JIl c48935JIl = (C48935JIl) obj;
        if (o.LJ(this.LIZ, c48935JIl.LIZ) && o.LJ(this.LIZIZ, c48935JIl.LIZIZ) && o.LJ(this.LIZJ, c48935JIl.LIZJ) && o.LJ(this.LIZLLL, c48935JIl.LIZLLL) && o.LJ(this.LJ, c48935JIl.LJ) && this.LJFF == c48935JIl.LJFF && o.LJ(this.LJI, c48935JIl.LJI) && o.LJ(this.LJII, c48935JIl.LJII) && o.LJ(this.LJIIIIZZ, c48935JIl.LJIIIIZZ) && this.LJIIIZ == c48935JIl.LJIIIZ && this.LJIIJ == c48935JIl.LJIIJ && o.LJ(null, null) && o.LJ(this.LJIIJJI, c48935JIl.LJIIJJI) && o.LJ(this.LJIIL, c48935JIl.LJIIL)) {
            return true;
        }
        return false;
    }
}
