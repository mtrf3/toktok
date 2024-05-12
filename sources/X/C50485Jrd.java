package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jrd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50485Jrd implements InterfaceC63694OzC<C50485Jrd> {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final Word LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50485Jrd() {
        /*
            r2 = this;
            r1 = 0
            r0 = 31
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50485Jrd.<init>():void");
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hint_word", this.LJLIL);
        linkedHashMap.put("hint_word_id", this.LJLILLLLZI);
        linkedHashMap.put("inbox_word", this.LJLJI);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        Word word = this.LJLJI;
        if (word == null) {
            hashCode = 0;
        } else {
            hashCode = word.hashCode();
        }
        int i = (LJ + hashCode) * 31;
        boolean z = this.LJLJJI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.LJLJJL.hashCode() + ((i + i2) * 31);
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchInputState(hintWord=");
        LIZ.append(this.LJLIL);
        LIZ.append(", hintWordId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", inboxWord=");
        LIZ.append(this.LJLJI);
        LIZ.append(", openKeyboardWhenResume=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50485Jrd)) {
            return false;
        }
        C50485Jrd c50485Jrd = (C50485Jrd) obj;
        if (o.LJ(this.LJLIL, c50485Jrd.LJLIL) && o.LJ(this.LJLILLLLZI, c50485Jrd.LJLILLLLZI) && o.LJ(this.LJLJI, c50485Jrd.LJLJI) && this.LJLJJI == c50485Jrd.LJLJJI && o.LJ(this.LJLJJL, c50485Jrd.LJLJJL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C50485Jrd(java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r6 = this;
            r1 = r7
            r0 = r9 & 1
            java.lang.String r2 = ""
            if (r0 == 0) goto L8
            r1 = r2
        L8:
            r0 = r9 & 2
            if (r0 == 0) goto L1f
        Lc:
            r3 = 0
            r4 = 0
            r0 = r9 & 16
            if (r0 == 0) goto L1d
            java.lang.String r0 = "randomUUID().toString()"
            java.lang.String r5 = X.AnonymousClass629.LIZ(r0)
        L18:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L1d:
            r5 = 0
            goto L18
        L1f:
            r2 = r8
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50485Jrd.<init>(java.lang.String, java.lang.String, int):void");
    }

    public static C50485Jrd LIZ(C50485Jrd c50485Jrd, String str, boolean z, int i) {
        String hintWordId;
        Word word;
        boolean z2 = z;
        String hintWord = str;
        if ((i & 1) != 0) {
            hintWord = c50485Jrd.LJLIL;
        }
        String sourceId = null;
        if ((i & 2) != 0) {
            hintWordId = c50485Jrd.LJLILLLLZI;
        } else {
            hintWordId = null;
        }
        if ((i & 4) != 0) {
            word = c50485Jrd.LJLJI;
        } else {
            word = null;
        }
        if ((i & 8) != 0) {
            z2 = c50485Jrd.LJLJJI;
        }
        if ((i & 16) != 0) {
            sourceId = c50485Jrd.LJLJJL;
        }
        c50485Jrd.getClass();
        o.LJIIIZ(hintWord, "hintWord");
        o.LJIIIZ(hintWordId, "hintWordId");
        o.LJIIIZ(sourceId, "sourceId");
        return new C50485Jrd(hintWord, hintWordId, word, z2, sourceId);
    }

    public C50485Jrd(String str, String str2, Word word, boolean z, String str3) {
        HH1.LIZ(str, "hintWord", str2, "hintWordId", str3, "sourceId");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = word;
        this.LJLJJI = z;
        this.LJLJJL = str3;
    }
}
