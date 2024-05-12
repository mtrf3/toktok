package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import kotlin.jvm.internal.o;

/* renamed from: X.T9t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74189T9t implements C33Q, InterfaceC87283bg {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final UrlModel LJLJJI;
    public final String LJLJJL;
    public final EditImage LJLJJLL;
    public final Boolean LJLJL;
    public final C43I<AbstractC36384EPs> LJLJLJ;
    public final C43I<EnumC74190T9u> LJLJLLL;
    public final EffectHintWrapper LJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74189T9t)) {
            return false;
        }
        C74189T9t c74189T9t = (C74189T9t) obj;
        return this.LJLIL == c74189T9t.LJLIL && o.LJ(this.LJLILLLLZI, c74189T9t.LJLILLLLZI) && o.LJ(this.LJLJI, c74189T9t.LJLJI) && o.LJ(this.LJLJJI, c74189T9t.LJLJJI) && o.LJ(this.LJLJJL, c74189T9t.LJLJJL) && o.LJ(this.LJLJJLL, c74189T9t.LJLJJLL) && o.LJ(this.LJLJL, c74189T9t.LJLJL) && o.LJ(this.LJLJLJ, c74189T9t.LJLJLJ) && o.LJ(this.LJLJLLL, c74189T9t.LJLJLLL) && o.LJ(this.LJLL, c74189T9t.LJLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectEditState(on=");
        LIZ.append(this.LJLIL);
        LIZ.append(", effectName=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", author=");
        LIZ.append(this.LJLJI);
        LIZ.append(", effectEditImage=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", effectPublishImage=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", editedImage=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", loading=");
        LIZ.append(this.LJLJL);
        LIZ.append(", effectUpdateResultEvent=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", uiEvent=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", effectHint=");
        LIZ.append(this.LJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, r0 * 31, 31), 31);
        UrlModel urlModel = this.LJLJJI;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str = this.LJLJJL;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        EditImage editImage = this.LJLJJLL;
        if (editImage == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = editImage.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool = this.LJLJL;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        C43I<AbstractC36384EPs> c43i = this.LJLJLJ;
        if (c43i == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c43i.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        C43I<EnumC74190T9u> c43i2 = this.LJLJLLL;
        if (c43i2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c43i2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        EffectHintWrapper effectHintWrapper = this.LJLL;
        if (effectHintWrapper != null) {
            i = effectHintWrapper.hashCode();
        }
        return i7 + i;
    }

    public /* synthetic */ C74189T9t(String str, String str2, UrlModel urlModel, String str3, EffectHintWrapper effectHintWrapper, int i) {
        this(true, str, str2, urlModel, str3, null, null, null, null, (i & 512) != 0 ? null : effectHintWrapper);
    }

    public static C74189T9t LIZ(C74189T9t c74189T9t, String str, EditImage editImage, Boolean bool, C43I c43i, C43I c43i2, EffectHintWrapper effectHintWrapper, int i) {
        boolean z;
        String author;
        UrlModel urlModel;
        EditImage editImage2 = editImage;
        String effectName = str;
        Boolean bool2 = bool;
        C43I c43i3 = c43i;
        C43I c43i4 = c43i2;
        EffectHintWrapper effectHintWrapper2 = effectHintWrapper;
        if ((i & 1) != 0) {
            z = c74189T9t.LJLIL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            effectName = c74189T9t.LJLILLLLZI;
        }
        String str2 = null;
        if ((i & 4) != 0) {
            author = c74189T9t.LJLJI;
        } else {
            author = null;
        }
        if ((i & 8) != 0) {
            urlModel = c74189T9t.LJLJJI;
        } else {
            urlModel = null;
        }
        if ((i & 16) != 0) {
            str2 = c74189T9t.LJLJJL;
        }
        if ((i & 32) != 0) {
            editImage2 = c74189T9t.LJLJJLL;
        }
        if ((i & 64) != 0) {
            bool2 = c74189T9t.LJLJL;
        }
        if ((i & 128) != 0) {
            c43i3 = c74189T9t.LJLJLJ;
        }
        if ((i & 256) != 0) {
            c43i4 = c74189T9t.LJLJLLL;
        }
        if ((i & 512) != 0) {
            effectHintWrapper2 = c74189T9t.LJLL;
        }
        c74189T9t.getClass();
        o.LJIIIZ(effectName, "effectName");
        o.LJIIIZ(author, "author");
        return new C74189T9t(z, effectName, author, urlModel, str2, editImage2, bool2, c43i3, c43i4, effectHintWrapper2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C74189T9t(boolean z, String str, String str2, UrlModel urlModel, String str3, EditImage editImage, Boolean bool, C43I<? extends AbstractC36384EPs> c43i, C43I<? extends EnumC74190T9u> c43i2, EffectHintWrapper effectHintWrapper) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = urlModel;
        this.LJLJJL = str3;
        this.LJLJJLL = editImage;
        this.LJLJL = bool;
        this.LJLJLJ = c43i;
        this.LJLJLLL = c43i2;
        this.LJLL = effectHintWrapper;
    }
}
