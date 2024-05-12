package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.7nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196597nb extends F9E implements Serializable {
    public static final C196677nj Companion = new Object() { // from class: X.7nj
    };
    public final EnumC196637nf LJLIL;
    public final EnumC196637nf LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C196597nb() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C196597nb copy$default(C196597nb c196597nb, EnumC196637nf enumC196637nf, EnumC196637nf enumC196637nf2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC196637nf = c196597nb.LJLIL;
        }
        if ((i & 2) != 0) {
            enumC196637nf2 = c196597nb.LJLILLLLZI;
        }
        return c196597nb.copy(enumC196637nf, enumC196637nf2);
    }

    public final C196597nb copy(EnumC196637nf largeImage, EnumC196637nf smallImage) {
        o.LJIIIZ(largeImage, "largeImage");
        o.LJIIIZ(smallImage, "smallImage");
        return new C196597nb(largeImage, smallImage);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public final EnumC196637nf getLargeImage() {
        return this.LJLIL;
    }

    public final EnumC196637nf getSmallImage() {
        return this.LJLILLLLZI;
    }

    public C196597nb(EnumC196637nf largeImage, EnumC196637nf smallImage) {
        o.LJIIIZ(largeImage, "largeImage");
        o.LJIIIZ(smallImage, "smallImage");
        this.LJLIL = largeImage;
        this.LJLILLLLZI = smallImage;
    }

    public /* synthetic */ C196597nb(EnumC196637nf enumC196637nf, EnumC196637nf enumC196637nf2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC196637nf.BACK_IMAGE : enumC196637nf, (i & 2) != 0 ? EnumC196637nf.FRONT_IMAGE_THUMBNAIL : enumC196637nf2);
    }
}
