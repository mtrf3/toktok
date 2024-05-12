package X;

import android.text.Editable;
import com.bytedance.android.livesdk.settings.customtab.KevaTestDialog;
import kotlin.jvm.internal.AqS100S0101000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UF9 implements UFA {
    public final /* synthetic */ C48459J0d<?> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<Object, C76800UCe> LIZIZ;
    public final /* synthetic */ KevaTestDialog LIZJ;

    @Override // X.UFA
    public final void LIZ(Editable editable) {
        String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        try {
            try {
                Object LIZJ = this.LIZ.LIZJ();
                if (LIZJ instanceof Integer) {
                    this.LIZ.LIZ(Integer.valueOf(Integer.parseInt(str)));
                } else if (LIZJ instanceof Double) {
                    this.LIZ.LIZ(Double.valueOf(Double.parseDouble(str)));
                } else if (LIZJ instanceof Float) {
                    this.LIZ.LIZ(Float.valueOf(Float.parseFloat(str)));
                } else if (LIZJ instanceof Long) {
                    this.LIZ.LIZ(Long.valueOf(Long.parseLong(str)));
                } else if (LIZJ instanceof Byte) {
                    this.LIZ.LIZ(Byte.valueOf(Byte.parseByte(str)));
                } else if (LIZJ instanceof Character) {
                    this.LIZ.LIZ(Character.valueOf(str.charAt(0)));
                } else if (LIZJ instanceof Short) {
                    this.LIZ.LIZ(Short.valueOf(Short.parseShort(str)));
                } else if (LIZJ instanceof Boolean) {
                    this.LIZ.LIZ(Boolean.valueOf(Boolean.parseBoolean(str)));
                } else if (LIZJ instanceof String) {
                    this.LIZ.LIZ(str);
                } else {
                    C48459J0d<?> c48459J0d = KevaTestDialog.LJLJJLL;
                    if (c48459J0d != null) {
                        C48459J0d<?> c48459J0d2 = this.LIZ;
                        Object LJI = KevaTestDialog.LJLJJL.LJI(str, c48459J0d.LIZJ().getClass());
                        o.LJIIIIZZ(LJI, "gson.fromJson(value, it.value.javaClass)");
                        c48459J0d2.LIZ(LJI);
                    }
                }
                C30868C9o.LJI("save success!!");
                InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns = this.LIZIZ;
                Object LIZJ2 = this.LIZ.LIZJ();
                o.LJIIIIZZ(LIZJ2, "property.value");
                interfaceC88472Yns.invoke(LIZJ2);
            } catch (Throwable th) {
                th = th;
                this.LIZJ.vl();
                this.LIZJ.dismiss();
                throw th;
            }
        } catch (Exception unused) {
            C30868C9o.LJI("save error, because your value is not right!");
        } catch (Throwable th2) {
            th = th2;
            C30868C9o.LJI("save success!!");
            InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2 = this.LIZIZ;
            Object LIZJ3 = this.LIZ.LIZJ();
            o.LJIIIIZZ(LIZJ3, "property.value");
            interfaceC88472Yns2.invoke(LIZJ3);
            this.LIZJ.vl();
            this.LIZJ.dismiss();
            throw th;
        }
        this.LIZJ.vl();
        this.LIZJ.dismiss();
    }

    public UF9(C48459J0d c48459J0d, AqS100S0101000_13 aqS100S0101000_13, KevaTestDialog kevaTestDialog) {
        this.LIZ = c48459J0d;
        this.LIZIZ = aqS100S0101000_13;
        this.LIZJ = kevaTestDialog;
    }
}
