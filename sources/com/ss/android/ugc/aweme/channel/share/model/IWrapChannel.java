package com.ss.android.ugc.aweme.channel.share.model;

import X.AbstractC62304Ocm;
import X.C62313Ocv;
import X.C62314Ocw;
import X.InterfaceC62573Oh7;
import X.InterfaceC99233ux;
import X.OYP;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public abstract class IWrapChannel extends AbstractC62304Ocm implements InterfaceC99233ux {
    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        return null;
    }

    public abstract String LJJIFFI();

    public abstract String LJJII();

    public abstract boolean LJJIII(OYP oyp, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7);

    public abstract boolean LJJIIJ(C62313Ocv c62313Ocv, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7);

    public abstract boolean LJJIIJZLJL(C62314Ocw c62314Ocw, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7);

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "";
    }

    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return LJJII();
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return LJJIFFI();
    }
}
