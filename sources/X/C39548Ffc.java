package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.jsbridge.LynxUIMethodModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.utils.LynxUIMethodsExecutor;
import defpackage.i0;

/* renamed from: X.Ffc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39548Ffc extends VO1 {
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ReadableArray LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ ReadableMap LJLJJL;
    public final /* synthetic */ Callback LJLJJLL;
    public final /* synthetic */ LynxUIMethodModule LJLJL;

    @Override // X.VO1
    public final void LIZ() {
        int i;
        boolean z;
        if (!this.LJLILLLLZI.isEmpty()) {
            i = CastIntegerProtector.parseInt(this.LJLILLLLZI);
        } else {
            i = -1;
        }
        VNU vnu = this.LJLJL.mLynxContext;
        ReadableArray readableArray = this.LJLJI;
        String str = this.LJLJJI;
        ReadableMap readableMap = this.LJLJJL;
        Callback wrapCallback = LynxUIMethodModule.wrapCallback(this.LJLJJLL);
        VOR vor = vnu.LJLLI.get();
        if (vor != null) {
            LynxBaseUI LJFF = vor.LJFF(i);
            String str2 = "component not found";
            if (LJFF != null) {
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    String string = readableArray.getString(i2);
                    if (readableMap != null && readableMap.size() > 0 && readableMap.hasKey("_isCallByRefId") && readableMap.getBoolean("_isCallByRefId")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!string.startsWith("#") && !z) {
                        if (wrapCallback != null) {
                            wrapCallback.invoke(5, i0.LJFF(string, " not support，only support id selector currently"));
                            return;
                        }
                        return;
                    }
                    String substring = string.substring(1);
                    if (z) {
                        LJFF = VOR.LJIIIZ(string, LJFF);
                    } else {
                        LJFF = VOR.LJII(substring, LJFF);
                    }
                    if (LJFF == null) {
                        str2 = i0.LJFF("not found ", string);
                    } else {
                        if (LJFF.getIdSelector() != null) {
                            LJFF.getIdSelector().equals(substring);
                        }
                    }
                }
                LynxUIMethodsExecutor.LIZ(LJFF, str, readableMap, wrapCallback);
                return;
            }
            if (wrapCallback == null) {
                return;
            }
            wrapCallback.invoke(2, str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39548Ffc(LynxUIMethodModule lynxUIMethodModule, VNU vnu, String str, ReadableArray readableArray, String str2, ReadableMap readableMap, Callback callback) {
        super(vnu);
        this.LJLJL = lynxUIMethodModule;
        this.LJLILLLLZI = str;
        this.LJLJI = readableArray;
        this.LJLJJI = str2;
        this.LJLJJL = readableMap;
        this.LJLJJLL = callback;
    }
}
