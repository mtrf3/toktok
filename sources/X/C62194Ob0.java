package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.jvm.internal.o;

/* renamed from: X.Ob0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62194Ob0 extends GKC {
    public final NewFaceStickerBean LJLILLLLZI;
    public final String LJLJI;

    public C62194Ob0(NewFaceStickerBean sticker, String str) {
        o.LJIIIZ(sticker, "sticker");
        this.LJLILLLLZI = sticker;
        this.LJLJI = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r3 == null) goto L17;
     */
    @Override // X.InterfaceC62486Ofi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.content.Context r8, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r9) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "sharePackage"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            X.7au r6 = new X.7au
            r6.<init>()
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r0 = r7.LJLILLLLZI
            java.lang.String r1 = r0.id
            java.lang.String r0 = "prop_id"
            r6.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r0 = r7.LJLILLLLZI
            java.lang.String r1 = r0.ownerId
            java.lang.String r0 = "to_user_id"
            r6.LJIIIZ(r0, r1)
            java.lang.String r1 = r7.LJLJI
            java.lang.String r0 = "group_id"
            r6.LJIIIZ(r0, r1)
            java.lang.String r0 = "prop_page"
            java.lang.String r5 = "enter_from"
            r6.LJIIIZ(r5, r0)
            java.lang.String r0 = "click_name"
            java.lang.String r4 = "enter_method"
            r6.LJIIIZ(r4, r0)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L42
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L45
        L42:
            r1 = r2
            if (r3 == 0) goto Lb3
        L45:
            boolean r0 = r3.isConnected()
        L49:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.LJFF(r0, r1)
            if (r3 == 0) goto L58
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L5b
        L58:
            r1 = r2
            if (r3 == 0) goto L61
        L5b:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto Lb1
        L61:
            r6.LJIIIZ(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r6.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.FMX.LJIIL(r0, r1)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r0 = r7.LJLILLLLZI
            java.lang.String r1 = r0.name
            java.lang.String r0 = "display_name"
            r2.putString(r0, r1)
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r0 = r7.LJLILLLLZI
            long r0 = r0.userCount
            java.lang.String r3 = "display_count"
            r2.putLong(r3, r0)
            java.lang.String r0 = "sticker"
            r2.putString(r5, r0)
            android.os.Bundle r0 = r9.extras
            java.lang.String r5 = r0.getString(r5)
            android.os.Bundle r0 = r9.extras
            java.lang.String r6 = r0.getString(r4)
            X.Oau r4 = new X.Oau
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r0 = r7.LJLILLLLZI
            java.lang.String r1 = r0.id
            java.lang.String r0 = "sticker.id"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 17
            r4.<init>(r0, r1, r2)
            android.app.Activity r2 = X.C78609UtB.LJJLIIIJ(r8)
            if (r2 == 0) goto Lb0
            com.ss.android.ugc.aweme.share.ShareService r1 = X.C4LD.LIZ
            java.lang.String r3 = r9.itemType
            r1.LJJJI(r2, r3, r4, r5, r6)
        Lb0:
            return
        Lb1:
            r2 = r0
            goto L61
        Lb3:
            r0 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62194Ob0.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
    }
}
