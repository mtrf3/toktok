package com.ss.android.ugc.aweme.share.qrcode.pkg;

import X.C44927HkB;
import X.C4LD;
import X.C62108OZc;
import X.C62180Oam;
import X.C62374Odu;
import X.C76800UCe;
import X.C78609UtB;
import X.InterfaceC43330GzW;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OZ4;
import X.OZ9;
import X.OZX;
import X.OZY;
import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class QRCodeSharePackage extends SharePackage {
    public InterfaceC43330GzW callback;
    public View qrCodeContainerView;
    public static final OZY Companion = new OZY();
    public static final int $stable = 8;

    public QRCodeSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJI(Context context, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        KeyEvent.Callback callback = this.qrCodeContainerView;
        if (callback != null) {
            ((OZX) callback).LIZ();
        }
        super.LJI(context, interfaceC62225ObV, view, interfaceC65784Pro);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(0, channel.key());
        View view2 = this.qrCodeContainerView;
        if (view2 != 0 && (view2 instanceof OZX)) {
            C62180Oam qrCodeSquareView = ((OZX) view2).getQrCodeSquareView();
            if (channel instanceof C62108OZc) {
                Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
                if (LJJLIIIJ != null) {
                    C44927HkB.LIZ(LJJLIIIJ, TokenCert.Companion.with("bpea-check_save_square_view_qrcode_permission"), new AqS99S0300000_10(context, view2, qrCodeSquareView, 0));
                }
            } else {
                OZ4.LIZ(context, view2, qrCodeSquareView, false, true, new OZ9(context, channel));
            }
            interfaceC88472Yns.invoke(Boolean.TRUE);
            return true;
        }
        return true;
    }
}
