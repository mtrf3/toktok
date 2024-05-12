package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S6F implements InterfaceC208718Hb<S6F, ImageItem> {
    public final AbstractC72932td<Boolean> LJLIL;
    public final Boolean LJLILLLLZI;
    public final AbstractC72932td<Boolean> LJLJI;
    public final int LJLJJI;
    public final AbstractC72932td<C71525S5h> LJLJJL;
    public final AbstractC72932td<Boolean> LJLJJLL;
    public final AbstractC72932td<Boolean> LJLJL;
    public final C8HZ<ImageItem> LJLJLJ;

    public S6F() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        Boolean bool = this.LJLILLLLZI;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return this.LJLJLJ.hashCode() + C03090Af.LIZ(this.LJLJL, C03090Af.LIZ(this.LJLJJLL, C03090Af.LIZ(this.LJLJJL, (C03090Af.LIZ(this.LJLJI, (hashCode2 + hashCode) * 31, 31) + this.LJLJJI) * 31, 31), 31), 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<ImageItem> getListItemState() {
        return C208708Ha.LIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadLatestState() {
        return C208708Ha.LIZIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadMoreState() {
        return C208708Ha.LIZJ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getRefreshState() {
        return C208708Ha.LIZLLL(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageListState(fetchListStatus=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isEmptyList=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isUploadAndDisplayLoading=");
        LIZ.append(this.LJLJI);
        LIZ.append(", totalImageCount=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", uploadImageStatus=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", useEffectStatus=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", cancelDisplayStatus=");
        LIZ.append(this.LJLJL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<ImageItem> getListState() {
        return this.LJLJLJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ S6F(int r10) {
        /*
            r9 = this;
            X.33X r1 = X.C33X.LIZ
            r2 = 0
            r4 = 0
            X.8HZ r8 = new X.8HZ
            r0 = 15
            r8.<init>(r2, r2, r0)
            r0 = r9
            r3 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S6F.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S6F)) {
            return false;
        }
        S6F s6f = (S6F) obj;
        if (o.LJ(this.LJLIL, s6f.LJLIL) && o.LJ(this.LJLILLLLZI, s6f.LJLILLLLZI) && o.LJ(this.LJLJI, s6f.LJLJI) && this.LJLJJI == s6f.LJLJJI && o.LJ(this.LJLJJL, s6f.LJLJJL) && o.LJ(this.LJLJJLL, s6f.LJLJJLL) && o.LJ(this.LJLJL, s6f.LJLJL) && o.LJ(this.LJLJLJ, s6f.LJLJLJ)) {
            return true;
        }
        return false;
    }

    public S6F(AbstractC72932td<Boolean> fetchListStatus, Boolean bool, AbstractC72932td<Boolean> isUploadAndDisplayLoading, int i, AbstractC72932td<C71525S5h> uploadImageStatus, AbstractC72932td<Boolean> useEffectStatus, AbstractC72932td<Boolean> cancelDisplayStatus, C8HZ<ImageItem> listState) {
        o.LJIIIZ(fetchListStatus, "fetchListStatus");
        o.LJIIIZ(isUploadAndDisplayLoading, "isUploadAndDisplayLoading");
        o.LJIIIZ(uploadImageStatus, "uploadImageStatus");
        o.LJIIIZ(useEffectStatus, "useEffectStatus");
        o.LJIIIZ(cancelDisplayStatus, "cancelDisplayStatus");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = fetchListStatus;
        this.LJLILLLLZI = bool;
        this.LJLJI = isUploadAndDisplayLoading;
        this.LJLJJI = i;
        this.LJLJJL = uploadImageStatus;
        this.LJLJJLL = useEffectStatus;
        this.LJLJL = cancelDisplayStatus;
        this.LJLJLJ = listState;
    }

    public static S6F LIZ(S6F s6f, AbstractC72932td abstractC72932td, Boolean bool, AbstractC72932td abstractC72932td2, int i, AbstractC72932td abstractC72932td3, AbstractC72932td abstractC72932td4, AbstractC72932td abstractC72932td5, C8HZ c8hz, int i2) {
        C8HZ listState = c8hz;
        AbstractC72932td cancelDisplayStatus = abstractC72932td5;
        Boolean bool2 = bool;
        AbstractC72932td fetchListStatus = abstractC72932td;
        AbstractC72932td isUploadAndDisplayLoading = abstractC72932td2;
        int i3 = i;
        AbstractC72932td uploadImageStatus = abstractC72932td3;
        AbstractC72932td useEffectStatus = abstractC72932td4;
        if ((i2 & 1) != 0) {
            fetchListStatus = s6f.LJLIL;
        }
        if ((i2 & 2) != 0) {
            bool2 = s6f.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            isUploadAndDisplayLoading = s6f.LJLJI;
        }
        if ((i2 & 8) != 0) {
            i3 = s6f.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            uploadImageStatus = s6f.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            useEffectStatus = s6f.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            cancelDisplayStatus = s6f.LJLJL;
        }
        if ((i2 & 128) != 0) {
            listState = s6f.LJLJLJ;
        }
        s6f.getClass();
        o.LJIIIZ(fetchListStatus, "fetchListStatus");
        o.LJIIIZ(isUploadAndDisplayLoading, "isUploadAndDisplayLoading");
        o.LJIIIZ(uploadImageStatus, "uploadImageStatus");
        o.LJIIIZ(useEffectStatus, "useEffectStatus");
        o.LJIIIZ(cancelDisplayStatus, "cancelDisplayStatus");
        o.LJIIIZ(listState, "listState");
        return new S6F(fetchListStatus, bool2, isUploadAndDisplayLoading, i3, uploadImageStatus, useEffectStatus, cancelDisplayStatus, listState);
    }
}
