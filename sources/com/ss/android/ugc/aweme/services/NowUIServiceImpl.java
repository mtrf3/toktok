package com.ss.android.ugc.aweme.services;

import X.ActivityC45651qj;
import X.C145995oB;
import X.C149225tO;
import X.C43664HBs;
import X.C44260HYq;
import X.C46001I3p;
import X.C6IA;
import X.C6IB;
import X.C76800UCe;
import X.C78866UxK;
import X.C82622Wbi;
import X.GX0;
import X.HCB;
import X.HJ4;
import X.I0N;
import X.InterfaceC44259HYp;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class NowUIServiceImpl implements HJ4 {
    @Override // X.HJ4
    public boolean enlargeEffectAndUploadEntrance() {
        return C44260HYq.LIZ();
    }

    @Override // X.HJ4
    public String getTabName() {
        if (GX0.LIZ()) {
            C149225tO.LIZ.getClass();
            if (C149225tO.LIZ()) {
                return "story";
            }
            return "photo";
        }
        return "now";
    }

    @Override // X.HJ4
    public StickerInfo buildStickerInfo(C82622Wbi c82622Wbi) {
        I0N i0n;
        if (c82622Wbi == null || (i0n = (I0N) c82622Wbi.LJIIIIZZ(null, I0N.class)) == null) {
            return null;
        }
        C46001I3p.LJLLLL.getClass();
        return HCB.LIZ(i0n);
    }

    @Override // X.HJ4
    public boolean enablePhotoTab(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        return C78866UxK.LJJLL(shortVideoContext);
    }

    @Override // X.HJ4
    public int getSurfaceTopMargin(Context context) {
        o.LJIIIZ(context, "context");
        return C6IB.LIZLLL(context);
    }

    public InterfaceC44259HYp getWithUploadBar(ActivityC45651qj activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        return new WithUploadNowsBarUIProvider(activity, z);
    }

    @Override // X.HJ4
    public void resetSurface(View view, Context context) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(context, "context");
        C6IA.LJII(context, view);
    }

    @Override // X.HJ4
    public void mobTakePhoto(ShortVideoContext shortVideoContext, long j, long j2, C82622Wbi objectContainer, InterfaceC88472Yns<? super C145995oB, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(objectContainer, "objectContainer");
        C43664HBs.LIZ(shortVideoContext, j, j2, new AqS157S0100000_7(objectContainer, 169), interfaceC88472Yns);
    }
}
