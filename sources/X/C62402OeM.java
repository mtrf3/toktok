package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.jvm.internal.o;

/* renamed from: X.OeM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62402OeM implements InterfaceC62474OfW {
    public final /* synthetic */ NewFaceStickerBean LIZ;

    public C62402OeM(NewFaceStickerBean newFaceStickerBean) {
        this.LIZ = newFaceStickerBean;
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
        OQD.LIZIZ(baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage baseSharePackage) {
        OQD.LIZJ(baseSharePackage, context);
    }

    public static void LJII(String str, boolean z, NewFaceStickerBean newFaceStickerBean) {
        if (!z || newFaceStickerBean == null) {
            return;
        }
        C8BR c8br = new C8BR();
        c8br.LJJ(new C43169Gwv());
        C62683Oit c62683Oit = new C62683Oit();
        c62683Oit.LIZ = newFaceStickerBean.id;
        c62683Oit.LIZIZ = 1;
        c62683Oit.LJI = 5;
        c62683Oit.LJII = str;
        c8br.LJIILL(c62683Oit.LIZ());
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        if (C62379Odz.LIZ(action)) {
            LJII(action.key(), true, this.LIZ);
        }
    }

    @Override // X.InterfaceC62474OfW
    public final void LJFF(View view, C62387Oe7 c62387Oe7, C5JV c5jv) {
        OQD.LIZLLL(view, c62387Oe7, c5jv);
    }

    @Override // X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(0, channel.key());
        String key = channel.key();
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        LJII(key, z, this.LIZ);
    }

    @Override // X.InterfaceC110854Wr
    public final Object LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC62474OfW
    public final void LJI(InterfaceC62225ObV interfaceC62225ObV, boolean z, BaseSharePackage baseSharePackage, Context context) {
        OQD.LJ(interfaceC62225ObV, context);
    }
}
