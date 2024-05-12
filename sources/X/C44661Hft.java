package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Hft, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44661Hft implements InterfaceC44516HdY {
    public final int LIZ;

    public C44661Hft(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC44516HdY
    public final Integer LIZIZ(int i) {
        if (i <= this.LIZ && 1081 <= i) {
            int LJIIIIZZ = C44660Hfs.LJIIIIZZ();
            int LIZIZ = Q7K.LIZIZ("fast_import_4k_second_fps_limited", 50);
            int LIZIZ2 = Q7K.LIZIZ("fast_import_4k_third_fps_limited", 60);
            if (C44660Hfs.LJI()) {
                return Integer.valueOf(LIZIZ);
            }
            if (C44660Hfs.LJII()) {
                return Integer.valueOf(LIZIZ2);
            }
            return Integer.valueOf(LJIIIIZZ);
        }
        return null;
    }

    @Override // X.InterfaceC44516HdY
    public final OSZ<Boolean, OSZ<Integer, Boolean>> LIZ(int i, int i2, int i3, int i4) {
        boolean z;
        boolean LJ;
        OSZ osz;
        int LJIIIIZZ = C44660Hfs.LJIIIIZZ();
        int LIZIZ = Q7K.LIZIZ("fast_import_4k_second_fps_limited", 50);
        int LIZIZ2 = Q7K.LIZIZ("fast_import_4k_third_fps_limited", 60);
        C60903NvH.LJIIJJI().LJJIIJ();
        if (i <= this.LIZ && 1081 <= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C44664Hfw.LIZ.getClass();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("high_res_basic_benchmark_enable", false)) {
                if (i4 != 28) {
                    if (i4 == 174) {
                        Boolean bool = C44984Hl6.LJFF;
                        if (bool != null) {
                            LJ = bool.booleanValue();
                        } else {
                            LJ = C19N.LJ("enable_bytevc1_hw_decoder", false);
                        }
                    }
                } else {
                    Boolean bool2 = C44984Hl6.LIZJ;
                    if (bool2 != null) {
                        LJ = bool2.booleanValue();
                    } else {
                        LJ = C19N.LJ("enable_h264_hw_decoder", false);
                    }
                }
                if (LJ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("bytebench 50fps: ");
                    LIZ.append(C44660Hfs.LJ());
                    LIZ.append(" 60fps: ");
                    LIZ.append(C44660Hfs.LJFF());
                    H78.LIZ(X1D.LIZIZ(LIZ));
                    if (i3 <= LJIIIIZZ) {
                        return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.FALSE));
                    }
                    OSZ osz2 = new OSZ(Integer.valueOf(i), Integer.valueOf(i2));
                    if (!TextUtils.isEmpty("2160*3840") && new OJD("[0-9]+\\*[0-9]*").matches("2160*3840")) {
                        List LJLJJL = s.LJLJJL("2160*3840", new String[]{"*"}, 0, 6);
                        if (o.LJ(ListProtector.get(LJLJJL, 1), "")) {
                            osz = new OSZ(Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 0))), -1);
                        } else {
                            osz = new OSZ(Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 0))), Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 1))));
                        }
                        if (((Number) osz.getSecond()).intValue() > 0) {
                        }
                    }
                    if ((LJIIIIZZ + 1 <= i3 && i3 <= LIZIZ && C44660Hfs.LJI()) || (LIZIZ + 1 <= i3 && i3 <= LIZIZ2 && C44660Hfs.LJII())) {
                        if (i4 == 28) {
                            if (C19N.LJ("enable_bytevc0_high_res_fast_import", false)) {
                                return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.FALSE));
                            }
                        } else if (i4 == 174 && C19N.LJ("enable_bytevc1_high_res_fast_import", false)) {
                            return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.FALSE));
                        }
                        Boolean bool3 = Boolean.FALSE;
                        return new OSZ<>(bool3, new OSZ(-11006, bool3));
                    }
                    Boolean bool4 = Boolean.FALSE;
                    return new OSZ<>(bool4, new OSZ(-11005, bool4));
                }
            }
        }
        Boolean bool5 = Boolean.FALSE;
        return new OSZ<>(bool5, new OSZ(-1, bool5));
    }
}
