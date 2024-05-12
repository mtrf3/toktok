package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OeD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62393OeD extends C62415OeZ {
    public final /* synthetic */ Aweme LIZ;

    public C62393OeD(Aweme aweme) {
        this.LIZ = aweme;
    }

    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        if (o.LJ("chat_merge", channel.key())) {
            str = "publish_share_panel";
        } else {
            str = "release";
        }
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C50921Jyf c50921Jyf = new C50921Jyf();
        c50921Jyf.LIZLLL = str;
        c50921Jyf.LJJLIL = "publish_then_share";
        c50921Jyf.LJJIIZ(this.LIZ);
        c50921Jyf.LJJLIIIIJ = channel.key();
        c50921Jyf.LJJLIIIJ = C62340OdM.LJFF(channel.key()).ordinal();
        c50921Jyf.LJJZZI = 0;
        if (baseSharePackage != null && (bundle3 = baseSharePackage.extras) != null) {
            str2 = bundle3.getString("share_form");
        } else {
            str2 = null;
        }
        c50921Jyf.LJLLL = str2;
        Aweme aweme = this.LIZ;
        if (baseSharePackage != null && (bundle2 = baseSharePackage.extras) != null) {
            str3 = bundle2.getString("share_form");
        } else {
            str3 = null;
        }
        if (o.LJ(str3, "url_form")) {
            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
                str4 = bundle.getString("share_url");
            } else {
                str4 = null;
            }
            c50921Jyf.LJJZZIII = str4;
        } else {
            String shareUrl = aweme.getShareInfo().getShareUrl();
            if (shareUrl == null) {
                shareUrl = aweme.getShareUrl();
            }
            c50921Jyf.LJJZZIII = shareUrl;
        }
        Object LJII = c220488l2.LJII(this.LIZ, c50921Jyf);
        C222578oP.LIZJ(LJII, this.LIZ, null, null, 14);
        ((JHM) LJII).LJIILIIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r8, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r9, X.InterfaceC62225ObV r10, X.InterfaceC67352kd r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C62413OeX
            if (r0 == 0) goto La0
            r4 = r11
            X.OeX r4 = (X.C62413OeX) r4
            int r2 = r4.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La0
            int r2 = r2 - r1
            r4.LJLJJLL = r2
        L12:
            java.lang.Object r6 = r4.LJLJJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJLL
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L26
            if (r1 == r0) goto L38
            if (r1 != r5) goto La7
            X.C141335gf.LIZJ(r6)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.C141335gf.LIZJ(r6)
            r4.LJLIL = r7
            r4.LJLILLLLZI = r10
            r4.LJLJI = r8
            r4.LJLJJLL = r0
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r3) goto L36
            return r3
        L36:
            r2 = r7
            goto L43
        L38:
            java.lang.Object r8 = r4.LJLJI
            android.content.Context r8 = (android.content.Context) r8
            X.ObV r10 = r4.LJLILLLLZI
            X.OeD r2 = r4.LJLIL
            X.C141335gf.LIZJ(r6)
        L43:
            boolean r0 = r10.LJIIIIZZ()
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LIZ
            int r1 = r0.getAwemeType()
            r0 = 40
            if (r1 == r0) goto Lba
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LIZ
            r2 = 0
            boolean r0 = X.C62359Odf.LJ(r0, r10, r2)
            if (r0 == 0) goto Lba
            boolean r0 = X.C53274KvW.LIZ()
            if (r0 == 0) goto Lba
            java.lang.String r1 = r10.key()
            java.lang.String r0 = "copy"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto Laf
            X.C53275KvX.LIZ()
            android.app.Activity r0 = X.C45804HyK.LJIJJ(r8)
            if (r0 == 0) goto L8c
            X.AKb r2 = new X.AKb
            r2.<init>(r0)
            long r0 = X.C52191Ke3.LIZ()
            r2.LIZLLL(r0)
            r0 = 2131827870(0x7f111c9e, float:1.9288665E38)
            r2.LJIIIIZZ(r0)
            r2.LJIIJ()
        L8c:
            long r1 = X.C52191Ke3.LIZ()
            r0 = 0
            r4.LJLIL = r0
            r4.LJLILLLLZI = r0
            r4.LJLJI = r0
            r4.LJLJJLL = r5
            java.lang.Object r0 = X.C1JD.LIZJ(r1, r4)
            if (r0 != r3) goto L23
            return r3
        La0:
            X.OeX r4 = new X.OeX
            r4.<init>(r7, r11)
            goto L12
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laf:
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r2)
            X.Lug r0 = r0.getAutoMessageTooltipHelper()
            r0.LIZLLL()
        Lba:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62393OeD.LIZJ(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, X.ObV, X.2kd):java.lang.Object");
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LJI(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        String str;
        String str2;
        Bundle bundle;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        String key = channel.key();
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        if (baseSharePackage == null || (bundle = baseSharePackage.extras) == null || (str2 = bundle.getString("now_type")) == null) {
            str2 = "";
        }
        C62468OfQ.LJII(baseSharePackage, key, str, str2, null, 48);
    }
}
