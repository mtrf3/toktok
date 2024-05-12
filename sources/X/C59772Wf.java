package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2Wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59772Wf implements Serializable {
    public int LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public java.util.Map<String, EAN> LJLJJL = new LinkedHashMap();

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectBitrateRecord(index_offset=");
        LIZ.append(this.LJLIL);
        LIZ.append(", cal_bandwidth_usage_factor=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", internet_speed=");
        LIZ.append(this.LJLJI);
        LIZ.append(", selected_bitrate=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", playlist=");
        return C15890jp.LIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public final float getCal_bandwidth_usage_factor() {
        return this.LJLILLLLZI;
    }

    public final int getIndex_offset() {
        return this.LJLIL;
    }

    public final int getInternet_speed() {
        return this.LJLJI;
    }

    public final java.util.Map<String, EAN> getPlaylist() {
        return this.LJLJJL;
    }

    public final int getSelected_bitrate() {
        return this.LJLJJI;
    }

    public final void setCal_bandwidth_usage_factor(float f) {
        this.LJLILLLLZI = f;
    }

    public final void setIndex_offset(int i) {
        this.LJLIL = i;
    }

    public final void setInternet_speed(int i) {
        this.LJLJI = i;
    }

    public final void setPlaylist(java.util.Map<String, EAN> map) {
        o.LJIIIZ(map, "<set-?>");
        this.LJLJJL = map;
    }

    public final void setSelected_bitrate(int i) {
        this.LJLJJI = i;
    }

    public C59772Wf(int i, float f, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = f;
        this.LJLJI = i2;
    }
}
