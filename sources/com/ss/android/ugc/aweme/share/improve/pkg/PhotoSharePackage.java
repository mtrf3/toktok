package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C189747cY;
import X.C42592Gnc;
import X.C42593Gnd;
import X.C43170Gww;
import X.C44498HdG;
import X.C44896Hjg;
import X.C44950HkY;
import X.C47261Igj;
import X.C4LD;
import X.C5H3;
import X.C62233Obd;
import X.C62274OcI;
import X.C62283OcR;
import X.C62297Ocf;
import X.C62324Od6;
import X.C62387Oe7;
import X.C62394OeE;
import X.C62398OeI;
import X.C62563Ogx;
import X.C65352Pkq;
import X.C78609UtB;
import X.C87O;
import X.InterfaceC62225ObV;
import X.InterfaceC62474OfW;
import X.InterfaceC74236TBo;
import X.TBV;
import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class PhotoSharePackage extends LinkDefaultSharePackage {
    public static final int $stable;
    public static final C62563Ogx Companion;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLIL;
    public static final ArrayList<String> doNotRecordChannels;
    public final C87O activity$delegate;
    public C62398OeI params;
    public final C5H3 shareListener$delegate;

    static {
        TBV tbv = new TBV(PhotoSharePackage.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C65352Pkq.LIZ.getClass();
        LJLIL = new InterfaceC74236TBo[]{tbv};
        Companion = new C62563Ogx();
        $stable = 8;
        doNotRecordChannels = C47261Igj.LJII("download", "copy");
    }

    public abstract void LJIILL(C62394OeE c62394OeE);

    public final Activity LJIILLIIL() {
        return (Activity) this.activity$delegate.LIZ(LJLIL[0]);
    }

    public final C62387Oe7 LJIIZILJ() {
        C62394OeE c62394OeE = new C62394OeE();
        c62394OeE.LJIIZILJ = this;
        ShareDependService.LIZ.getClass();
        ImChannel LJJIJIIJI = C44498HdG.LIZ().LJJIJIIJI(this, "");
        if (LJJIJIIJI != null) {
            c62394OeE.LIZIZ(LJJIJIIJI);
        }
        c62394OeE.LIZIZ(new CopyLinkChannel(false));
        C62324Od6.LIZ("whatsapp_status", new C62297Ocf(new C62283OcR(this), C62274OcI.LJLIL), c62394OeE);
        ShareService shareService = C4LD.LIZ;
        o.LJIIIIZZ(shareService, "shareService()");
        C189747cY.LIZ(shareService, c62394OeE, LJIILLIIL(), 8);
        c62394OeE.LJI = true;
        c62394OeE.LJIJ = true;
        c62394OeE.LJIILIIL = R.string.r5i;
        c62394OeE.LJIILLIIL = R.string.cg_;
        c62394OeE.LJJIJ = false;
        InterfaceC62474OfW listener = (InterfaceC62474OfW) this.shareListener$delegate.getValue();
        o.LJIIIZ(listener, "listener");
        c62394OeE.LJJ = listener;
        LJIILL(c62394OeE);
        if (c62394OeE.LJIJ) {
            c62394OeE.LJJII = true;
        }
        if (!this.params.LJIILLIIL) {
            c62394OeE.LJJIIJZLJL = true;
        }
        return new C62387Oe7(c62394OeE);
    }

    public String LJIJ() {
        List<String> urlList;
        UrlModel urlModel = this.params.LJII;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || !(!urlList.isEmpty())) {
            return null;
        }
        return (String) ListProtector.get(urlList, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PhotoSharePackage(android.app.Activity r16, X.C62398OeI r17) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage.<init>(android.app.Activity, X.OeI):void");
    }

    public boolean LJIJI(InterfaceC62225ObV channel, Context context, Aweme aweme, int i, boolean z) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        if (z) {
            C62233Obd.LIZLLL(channel, this.extras.getString("download_share_path"), context, this, i);
            return true;
        }
        String LJIJ = LJIJ();
        if (LJIJ != null) {
            this.extras.putString("download_method", "download_to_share");
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            if (LJJLIIIJ == null) {
                return true;
            }
            int i2 = this.extras.getInt("page_type");
            C44950HkY c44950HkY = new C44950HkY(LJJLIIIJ, aweme, this, channel, context, i);
            C42592Gnc c42592Gnc = (C42592Gnc) C62233Obd.LIZ.getValue();
            c42592Gnc.LIZIZ = true;
            C42593Gnd LIZ = c42592Gnc.LIZ();
            C43170Gww c43170Gww = new C43170Gww(new WeakReference(LJJLIIIJ), Integer.valueOf(i2));
            C44896Hjg.LIZJ = LJIJ;
            C44896Hjg.LJIJJLI = true;
            c43170Gww.LIZ(LJIJ, c44950HkY, LIZ);
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean LJIJJ(PhotoSharePackage photoSharePackage, InterfaceC62225ObV interfaceC62225ObV, Context context, Aweme aweme, int i, int i2) {
        if ((i2 & 4) != 0) {
            aweme = null;
        }
        if ((i2 & 8) != 0) {
            i = 4;
        }
        return photoSharePackage.LJIJI(interfaceC62225ObV, context, aweme, i, false);
    }
}
