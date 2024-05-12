package com.ss.android.ugc.aweme.channel.share.model;

import X.C119604mi;
import X.C62224ObU;
import X.C62313Ocv;
import X.C62314Ocw;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC99233ux;
import X.OYP;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.channel.QrCodeChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class PureLogicChannel implements InterfaceC62225ObV, InterfaceC99233ux {
    @Override // X.InterfaceC62225ObV
    public final boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public void LJFF(View itemView) {
        o.LJIIIZ(itemView, "itemView");
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public boolean LJIIIIZZ() {
        return this instanceof QrCodeChannel;
    }

    @Override // X.InterfaceC62225ObV
    public void LJIIJJI(int i) {
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIILIIL(C62314Ocw content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public boolean LJIILJJIL() {
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final float LJIILLIIL() {
        return 0.34f;
    }

    @Override // X.InterfaceC62225ObV
    public boolean LJIIZILJ() {
        return this instanceof ImChannel;
    }

    @Override // X.InterfaceC62225ObV
    public boolean LJIJ(OYP content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public void LJ(C119604mi imageView, boolean z) {
        o.LJIIIZ(imageView, "imageView");
        imageView.setImageDrawable(LIZJ(imageView.getContext()));
    }
}
