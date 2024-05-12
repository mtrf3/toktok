package com.bytedance.tiktok.homepage.mainfragment;

import X.AbstractC38911fr;
import X.C221108m2;
import X.C54117LLt;
import X.C62822Ol8;
import X.EnumC53761L8b;
import X.InterfaceC99233ux;
import X.LH6;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class BottomTabProtocol implements InterfaceC99233ux {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 40));
    public final String LJLILLLLZI = "";

    public abstract LH6 LIZJ();

    public abstract EnumC53761L8b LIZLLL();

    public AbstractC38911fr LJ() {
        return null;
    }

    public void LJFF(Context context) {
        o.LJIIIZ(context, "context");
    }

    public void LJI(Context context) {
        o.LJIIIZ(context, "context");
    }

    public abstract Class<? extends Fragment> LJJJJZI();

    public abstract boolean enable();

    public abstract String getTag();

    public void init(Context context) {
        o.LJIIIZ(context, "context");
    }

    public abstract String w0(Context context);

    public C54117LLt LIZ() {
        return new C54117LLt();
    }

    public String LJIIIZ() {
        return this.LJLILLLLZI;
    }

    public Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        return new Bundle();
    }
}
