package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aed, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94291aed implements InterfaceC93650aUI {
    public EnumC93710aVG LIZ;

    @Override // X.InterfaceC93650aUI
    public final int LIZ() {
        if (C93866aXm.LIZJ[this.LIZ.ordinal()] != 1) {
            return R.color.aeu;
        }
        return R.color.aev;
    }

    @Override // X.InterfaceC93650aUI
    public final int LIZIZ() {
        switch (C93866aXm.LIZ[this.LIZ.ordinal()]) {
            case 1:
            case 5:
                return R.string.fxc;
            case 2:
                return R.string.fxt;
            case 3:
                return R.string.fy0;
            case 4:
            case 6:
                return R.string.fx9;
            case 7:
                return R.string.fvm;
            case 8:
                return R.string.fx_;
            case 9:
                return R.string.fxd;
            case 10:
                return R.string.fxa;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return R.string.fxe;
            case 12:
                return R.string.fvx;
            default:
                return R.string.tz_;
        }
    }

    @Override // X.InterfaceC93650aUI
    public final int LIZJ() {
        switch (C93866aXm.LIZIZ[this.LIZ.ordinal()]) {
            case 1:
                return R.drawable.di7;
            case 2:
                return R.drawable.di9;
            case 3:
                return R.drawable.di8;
            case 4:
            case 5:
            case 6:
            default:
                return R.drawable.di4;
            case 7:
                return R.drawable.di2;
            case 8:
                return R.drawable.di5;
            case 9:
                return R.drawable.di_;
            case 10:
                return R.drawable.di6;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return R.drawable.dia;
            case 12:
                return R.drawable.di3;
        }
    }

    public C94291aed(EnumC93710aVG type) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
    }
}
