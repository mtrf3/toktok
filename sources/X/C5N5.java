package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.5N5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5N5 extends F9E implements Serializable {
    public String LJLIL;
    public String LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public String LJLJJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5N5() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r4 = r3
            r5 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5N5.<init>():void");
    }

    public static /* synthetic */ C5N5 copy$default(C5N5 c5n5, String str, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c5n5.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c5n5.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z = c5n5.LJLJI;
        }
        if ((i & 8) != 0) {
            z2 = c5n5.LJLJJI;
        }
        if ((i & 16) != 0) {
            str3 = c5n5.LJLJJL;
        }
        return c5n5.copy(str, str2, z, z2, str3);
    }

    public final C5N5 copy(String libraryId, String sourceType, boolean z, boolean z2, String identityKey) {
        o.LJIIIZ(libraryId, "libraryId");
        o.LJIIIZ(sourceType, "sourceType");
        o.LJIIIZ(identityKey, "identityKey");
        return new C5N5(libraryId, sourceType, z, z2, identityKey);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), this.LJLJJL};
    }

    public final boolean getHasAudio() {
        return this.LJLJJI;
    }

    public final boolean getHasAudioSlot() {
        return this.LJLJI;
    }

    public final String getIdentityKey() {
        return this.LJLJJL;
    }

    public final String getLibraryId() {
        return this.LJLIL;
    }

    public final String getSourceType() {
        return this.LJLILLLLZI;
    }

    public final void setHasAudio(boolean z) {
        this.LJLJJI = z;
    }

    public final void setHasAudioSlot(boolean z) {
        this.LJLJI = z;
    }

    public final void setIdentityKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJL = str;
    }

    public final void setLibraryId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public final void setSourceType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    public C5N5(String str, String str2, boolean z, boolean z2, String str3) {
        HH1.LIZ(str, "libraryId", str2, "sourceType", str3, "identityKey");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = str3;
    }

    public /* synthetic */ C5N5(String str, String str2, boolean z, boolean z2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) == 0 ? str3 : "");
    }
}
