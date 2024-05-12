package X;

import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.aweme.share.core.ui.campaign.OperationPlatform;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Odb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62355Odb implements Comparator<InterfaceC62225ObV> {
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final OperationPlatform LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public java.util.Map<String, Integer> LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public java.util.Map<String, Integer> LJLLJ;
    public final C62822Ol8 LJLLL;

    public final ArrayList<String> LIZ() {
        return (ArrayList) this.LJLJLLL.getValue();
    }

    public static boolean LIZIZ(String str) {
        if (C47261Igj.LJII("aweme", "aweme_photo", "now_video_memory", "now_post_memory", "now_video", "now_post", "user").contains(str) && C4PT.LIZ()) {
            return true;
        }
        return false;
    }

    public final int LIZJ(InterfaceC62225ObV interfaceC62225ObV) {
        for (SharePlatform sharePlatform : (List) this.LJLJLJ.getValue()) {
            if (o.LJ(sharePlatform.platformId, interfaceC62225ObV.key())) {
                return ((List) this.LJLJLJ.getValue()).indexOf(sharePlatform);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r7.key().equals("more") != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (kotlin.jvm.internal.o.LJ("chat_merge", r7.key()) != false) goto L6;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(X.InterfaceC62225ObV r6, X.InterfaceC62225ObV r7) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62355Odb.compare(java.lang.Object, java.lang.Object):int");
    }

    public C62355Odb(String sharePackageType, boolean z, boolean z2) {
        OperationPlatform operationPlatform;
        o.LJIIIZ(sharePackageType, "sharePackageType");
        this.LJLIL = 0;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = sharePackageType;
        this.LJLJJL = C221108m2.LIZIZ(C62356Odc.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(C53273KvV.LJLIL);
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        if (LIZ != null) {
            operationPlatform = LIZ.operationPlatform;
        } else {
            operationPlatform = null;
        }
        this.LJLJL = operationPlatform;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 573));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 572));
        this.LJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 571));
        this.LJLLI = C113554cx.LJJJLIIL();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 570));
        this.LJLLJ = C113554cx.LJJJLIIL();
        this.LJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 569));
    }

    public /* synthetic */ C62355Odb(String str, boolean z, int i) {
        this((i & 8) != 0 ? "" : str, false, (i & 4) != 0 ? false : z);
    }
}
