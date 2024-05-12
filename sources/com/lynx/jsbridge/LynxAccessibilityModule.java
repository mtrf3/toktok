package com.lynx.jsbridge;

import X.C03880Dg;
import X.C65300Pk0;
import X.C79411VEp;
import X.InterfaceC37728ErM;
import X.VNU;
import X.VOA;
import X.VPJ;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.UIBody;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes15.dex */
public class LynxAccessibilityModule extends LynxContextModule {
    public static final String NAME = "LynxAccessibilityModule";

    public LynxAccessibilityModule(VNU vnu) {
        super(vnu);
    }

    @InterfaceC37728ErM
    public void registerMutationStyle(ReadableMap readableMap, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "-2034477063808785520");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxAccessibilityModule", "registerMutationStyle", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxAccessibilityModule", "registerMutationStyle", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new VOA(this, this.mLynxContext, readableMap, callback));
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxAccessibilityModule", "registerMutationStyle", null, objArr, this, c65300Pk0, true);
        }
    }

    public void registerMutationStyleInner(ReadableMap readableMap, JavaOnlyMap javaOnlyMap) {
        UIBody uIBody = this.mLynxContext.LJLJLLL;
        if (uIBody == null) {
            javaOnlyMap.putString("msg", "Fail: init accessibility env error with uiBody is null");
            return;
        }
        VPJ vpj = uIBody.LJLJJI;
        if (vpj == null) {
            javaOnlyMap.putString("msg", "Fail: init accessibility env error with delegate is null");
            return;
        }
        ReadableArray array = readableMap.getArray("mutation_styles", null);
        if (array == null) {
            javaOnlyMap.putString("msg", "Fail: params error with keymutation_styles");
            return;
        }
        Set<String> set = vpj.LJIIL;
        if (set != null) {
            ((HashSet) set).clear();
            for (int i = 0; i < array.size(); i++) {
                if (array.getType(i) == ReadableType.String) {
                    ((HashSet) vpj.LJIIL).add(array.getString(i));
                }
            }
        }
        javaOnlyMap.putString("msg", "Success: finish register");
    }
}
