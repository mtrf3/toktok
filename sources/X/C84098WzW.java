package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.ss.android.vesdk.VESize;
import java.util.Objects;

/* renamed from: X.WzW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84098WzW {
    public boolean LJFF;
    public EnumC63969P8r LIZ = EnumC63969P8r.NORMAL_GET_FRAME_MODE;
    public VESize LIZIZ = new VESize(576, 1024);
    public final VESize LIZJ = new VESize(360, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT);
    public boolean LIZLLL = false;
    public EnumC63956P8e LJ = EnumC63956P8e.NO_EFFECT;
    public EnumC78791Uw7 LJI = EnumC78791Uw7.CENTER_CROP;
    public InterfaceC63970P8s LJII = null;
    public EnumC84113Wzl LJIIIIZZ = EnumC84113Wzl.NO_MIRROR;
    public boolean LJIIIZ = true;
    public int LJIIJ = 0;
    public boolean LJIIJJI = false;
    public final String LJIIL = "";
    public EnumC63957P8f LJIILIIL = EnumC63957P8f.RGBA_ARRAY;
    public String LJIILJJIL = null;
    public String LJIILL = "";
    public final String LJIILLIIL = "";
    public final int LJIIZILJ = -1;
    public Bitmap LJIJ = null;
    public final int LJIJI = -1;
    public boolean LJIJJ = false;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C84098WzW)) {
            return false;
        }
        C84098WzW c84098WzW = (C84098WzW) obj;
        if (this.LIZ != c84098WzW.LIZ || this.LJ != c84098WzW.LJ || this.LJFF != c84098WzW.LJFF || this.LJI != c84098WzW.LJI || !this.LIZIZ.equals(c84098WzW.LIZIZ) || !this.LIZJ.equals(c84098WzW.LIZJ) || this.LJI != c84098WzW.LJI || this.LJIIIIZZ != c84098WzW.LJIIIIZZ || this.LJIIIZ != c84098WzW.LJIIIZ || this.LJIIJ != c84098WzW.LJIIJ || this.LJIIJJI != c84098WzW.LJIIJJI || !this.LJIIL.equals(c84098WzW.LJIIL) || this.LJIILIIL != c84098WzW.LJIILIIL || !this.LJIILL.equals(c84098WzW.LJIILL) || !this.LJIILLIIL.equals(c84098WzW.LJIILLIIL) || this.LJIIZILJ != c84098WzW.LJIIZILJ || this.LJIJ != c84098WzW.LJIJ || this.LJIJI != c84098WzW.LJIJI || this.LJIJJ != c84098WzW.LJIJJ || !Objects.equals(this.LJIILJJIL, c84098WzW.LJIILJJIL)) {
            return false;
        }
        return true;
    }
}
