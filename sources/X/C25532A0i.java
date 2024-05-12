package X;

import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionInfo;
import com.ss.android.ugc.aweme.model.ManagementPagePaidVideo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A0i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25532A0i implements C33Q {
    public final String LJLIL;
    public final AbstractC72932td<ManagementPagePaidCollectionInfo> LJLILLLLZI;
    public final AbstractC72932td<C76800UCe> LJLJI;
    public final AbstractC72932td<C76800UCe> LJLJJI;
    public final AbstractC72932td<C76800UCe> LJLJJL;
    public final AbstractC72932td<C76800UCe> LJLJJLL;
    public final ManagementPagePaidCollectionInfo LJLJL;
    public final List<ManagementPagePaidVideo> LJLJLJ;
    public final EnumC25549A0z LJLJLLL;
    public final java.util.Map<A15, A16> LJLL;
    public final C43I<C25545A0v> LJLLI;
    public final C43I<String> LJLLILLLL;
    public final C43I<C25531A0h> LJLLJ;

    public C25532A0i() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25532A0i)) {
            return false;
        }
        C25532A0i c25532A0i = (C25532A0i) obj;
        return o.LJ(this.LJLIL, c25532A0i.LJLIL) && o.LJ(this.LJLILLLLZI, c25532A0i.LJLILLLLZI) && o.LJ(this.LJLJI, c25532A0i.LJLJI) && o.LJ(this.LJLJJI, c25532A0i.LJLJJI) && o.LJ(this.LJLJJL, c25532A0i.LJLJJL) && o.LJ(this.LJLJJLL, c25532A0i.LJLJJLL) && o.LJ(this.LJLJL, c25532A0i.LJLJL) && o.LJ(this.LJLJLJ, c25532A0i.LJLJLJ) && this.LJLJLLL == c25532A0i.LJLJLLL && o.LJ(this.LJLL, c25532A0i.LJLL) && o.LJ(this.LJLLI, c25532A0i.LJLLI) && o.LJ(this.LJLLILLLL, c25532A0i.LJLLILLLL) && o.LJ(this.LJLLJ, c25532A0i.LJLLJ);
    }

    public final String toString() {
        return "ManageSeriesState(collectionId=" + this.LJLIL + ", collectionDetailResponse=" + this.LJLILLLLZI + ", editVideoResponse=" + this.LJLJI + ", setTrailerResponse=" + this.LJLJJI + ", videoDeleteResponse=" + this.LJLJJL + ", reorderResponse=" + this.LJLJJLL + ", collectionInfo=" + this.LJLJL + ", videos=" + this.LJLJLJ + ", manageMode=" + this.LJLJLLL + ", videoUploads=" + this.LJLL + ", showPopupWindowEvent=" + this.LJLLI + ", showDeleteDialogEvent=" + this.LJLLILLLL + ", reorderErrorEvent=" + this.LJLLJ + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZ = C03090Af.LIZ(this.LJLJJLL, C03090Af.LIZ(this.LJLJJL, C03090Af.LIZ(this.LJLJJI, C03090Af.LIZ(this.LJLJI, C03090Af.LIZ(this.LJLILLLLZI, hashCode * 31, 31), 31), 31), 31), 31);
        ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo = this.LJLJL;
        if (managementPagePaidCollectionInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = managementPagePaidCollectionInfo.hashCode();
        }
        int i2 = (LIZ + hashCode2) * 31;
        List<ManagementPagePaidVideo> list = this.LJLJLJ;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int LIZ2 = C12400eC.LIZ(this.LJLL, (this.LJLJLLL.hashCode() + ((i2 + hashCode3) * 31)) * 31, 31);
        C43I<C25545A0v> c43i = this.LJLLI;
        if (c43i == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c43i.hashCode();
        }
        int i3 = (LIZ2 + hashCode4) * 31;
        C43I<String> c43i2 = this.LJLLILLLL;
        if (c43i2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c43i2.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        C43I<C25531A0h> c43i3 = this.LJLLJ;
        if (c43i3 != null) {
            i = c43i3.hashCode();
        }
        return i4 + i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C25532A0i(int r15) {
        /*
            r14 = this;
            r1 = 0
            X.33X r2 = X.C33X.LIZ
            X.A0z r9 = X.EnumC25549A0z.STANDARD
            X.3mF r10 = X.C113554cx.LJJJLIIL()
            r0 = r14
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r1
            r8 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25532A0i.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C25532A0i(String str, AbstractC72932td<ManagementPagePaidCollectionInfo> collectionDetailResponse, AbstractC72932td<C76800UCe> editVideoResponse, AbstractC72932td<C76800UCe> setTrailerResponse, AbstractC72932td<C76800UCe> videoDeleteResponse, AbstractC72932td<C76800UCe> reorderResponse, ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo, List<ManagementPagePaidVideo> list, EnumC25549A0z manageMode, java.util.Map<A15, ? extends A16> videoUploads, C43I<C25545A0v> c43i, C43I<String> c43i2, C43I<C25531A0h> c43i3) {
        o.LJIIIZ(collectionDetailResponse, "collectionDetailResponse");
        o.LJIIIZ(editVideoResponse, "editVideoResponse");
        o.LJIIIZ(setTrailerResponse, "setTrailerResponse");
        o.LJIIIZ(videoDeleteResponse, "videoDeleteResponse");
        o.LJIIIZ(reorderResponse, "reorderResponse");
        o.LJIIIZ(manageMode, "manageMode");
        o.LJIIIZ(videoUploads, "videoUploads");
        this.LJLIL = str;
        this.LJLILLLLZI = collectionDetailResponse;
        this.LJLJI = editVideoResponse;
        this.LJLJJI = setTrailerResponse;
        this.LJLJJL = videoDeleteResponse;
        this.LJLJJLL = reorderResponse;
        this.LJLJL = managementPagePaidCollectionInfo;
        this.LJLJLJ = list;
        this.LJLJLLL = manageMode;
        this.LJLL = videoUploads;
        this.LJLLI = c43i;
        this.LJLLILLLL = c43i2;
        this.LJLLJ = c43i3;
    }

    public static C25532A0i LIZ(C25532A0i c25532A0i, String str, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, AbstractC72932td abstractC72932td3, AbstractC72932td abstractC72932td4, AbstractC72932td abstractC72932td5, ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo, List list, EnumC25549A0z enumC25549A0z, java.util.Map map, C43I c43i, C43I c43i2, C43I c43i3, int i) {
        C43I c43i4 = c43i3;
        C43I c43i5 = c43i2;
        C43I c43i6 = c43i;
        java.util.Map videoUploads = map;
        EnumC25549A0z manageMode = enumC25549A0z;
        List list2 = list;
        ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo2 = managementPagePaidCollectionInfo;
        AbstractC72932td collectionDetailResponse = abstractC72932td;
        String str2 = str;
        AbstractC72932td editVideoResponse = abstractC72932td2;
        AbstractC72932td setTrailerResponse = abstractC72932td3;
        AbstractC72932td videoDeleteResponse = abstractC72932td4;
        AbstractC72932td reorderResponse = abstractC72932td5;
        if ((i & 1) != 0) {
            str2 = c25532A0i.LJLIL;
        }
        if ((i & 2) != 0) {
            collectionDetailResponse = c25532A0i.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            editVideoResponse = c25532A0i.LJLJI;
        }
        if ((i & 8) != 0) {
            setTrailerResponse = c25532A0i.LJLJJI;
        }
        if ((i & 16) != 0) {
            videoDeleteResponse = c25532A0i.LJLJJL;
        }
        if ((i & 32) != 0) {
            reorderResponse = c25532A0i.LJLJJLL;
        }
        if ((i & 64) != 0) {
            managementPagePaidCollectionInfo2 = c25532A0i.LJLJL;
        }
        if ((i & 128) != 0) {
            list2 = c25532A0i.LJLJLJ;
        }
        if ((i & 256) != 0) {
            manageMode = c25532A0i.LJLJLLL;
        }
        if ((i & 512) != 0) {
            videoUploads = c25532A0i.LJLL;
        }
        if ((i & 1024) != 0) {
            c43i6 = c25532A0i.LJLLI;
        }
        if ((i & 2048) != 0) {
            c43i5 = c25532A0i.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            c43i4 = c25532A0i.LJLLJ;
        }
        c25532A0i.getClass();
        o.LJIIIZ(collectionDetailResponse, "collectionDetailResponse");
        o.LJIIIZ(editVideoResponse, "editVideoResponse");
        o.LJIIIZ(setTrailerResponse, "setTrailerResponse");
        o.LJIIIZ(videoDeleteResponse, "videoDeleteResponse");
        o.LJIIIZ(reorderResponse, "reorderResponse");
        o.LJIIIZ(manageMode, "manageMode");
        o.LJIIIZ(videoUploads, "videoUploads");
        return new C25532A0i(str2, collectionDetailResponse, editVideoResponse, setTrailerResponse, videoDeleteResponse, reorderResponse, managementPagePaidCollectionInfo2, list2, manageMode, videoUploads, c43i6, c43i5, c43i4);
    }
}
