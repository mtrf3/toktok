package com.bytedance.tiktok.homepage.mainfragment;

import X.C221108m2;
import X.C62822Ol8;
import X.EnumC53763L8d;
import X.InterfaceC99233ux;
import X.LCY;
import X.LGE;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class TopTabProtocol implements InterfaceC99233ux {
    public final String LJLIL = "";
    public final int LJLILLLLZI = -2;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 41));

    public void LIZIZ() {
    }

    public abstract EnumC53763L8d LIZLLL();

    public LGE LJ() {
        return null;
    }

    public void LJII(String str, String str2) {
    }

    public void LJIIIIZZ(String str) {
    }

    public boolean LJIIJ() {
        return true;
    }

    public abstract Class<? extends Fragment> LJJJJZI();

    public abstract boolean enable();

    public abstract String getTag();

    public void init(Context context) {
        o.LJIIIZ(context, "context");
    }

    public abstract String w0(Context context);

    public LCY LIZJ() {
        return new LCY();
    }

    public final LCY LJFF() {
        return (LCY) this.LJLJI.getValue();
    }

    public int LJI() {
        return this.LJLILLLLZI;
    }

    public String LJIIIZ() {
        return this.LJLIL;
    }

    public Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        return new Bundle();
    }
}
