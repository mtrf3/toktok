package com.ss.android.ugc.aweme.prefab;

import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C7MY;
import X.EV9;
import X.InterfaceC55235Lm3;
import X.SY4;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SubmitButtonAssem extends DynamicAssem implements ItemSelectAbility {
    public final C62822Ol8 LJLJLLL;
    public SY4 LJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c2m;
    }

    public SubmitButtonAssem() {
        new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 795));
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility
    public final void M7(int i) {
        boolean z;
        if (i == 0) {
            x3().setVisibility(8);
        } else {
            x3().setVisibility(0);
        }
        SY4 sy4 = this.LJLL;
        if (sy4 != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            sy4.setEnabled(z);
            SY4 sy42 = this.LJLL;
            if (sy42 != null) {
                String LLLZ = C16880lQ.LLLZ((String) this.LJLJLLL.getValue(), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                o.LJIIIIZZ(LLLZ, "format(this, *args)");
                sy42.setText(LLLZ);
                return;
            }
            o.LJIJI("submitButton");
            throw null;
        }
        o.LJIJI("submitButton");
        throw null;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        SY4 sy4 = (SY4) C7MY.LIZLLL(view, "view", R.id.mls, "view.findViewById(R.id.tv_submit)");
        this.LJLL = sy4;
        C16880lQ.LJJIZ(sy4, new ACListenerS23S0100000_3(this, 136));
        M7(0);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, ItemSelectAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, ItemSelectAbility.class, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(this);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(this);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(ItemSelectAbility.class.getClassLoader(), new Class[]{ItemSelectAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, ItemSelectAbility.class, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility");
            }
        }
    }
}
