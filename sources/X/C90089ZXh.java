package X;

import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ZXh, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90089ZXh {
    public final Bundle LIZ;
    public List<String> LIZIZ;
    public List<IntentFilter> LIZJ;

    public final void LIZ() {
        if (this.LIZJ == null) {
            ArrayList parcelableArrayList = this.LIZ.getParcelableArrayList("controlFilters");
            this.LIZJ = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.LIZJ = Collections.emptyList();
            }
        }
    }

    public final List<String> LIZIZ() {
        if (this.LIZIZ == null) {
            ArrayList<String> stringArrayList = this.LIZ.getStringArrayList("groupMemberIds");
            this.LIZIZ = stringArrayList;
            if (stringArrayList == null) {
                this.LIZIZ = Collections.emptyList();
            }
        }
        return this.LIZIZ;
    }

    public final android.net.Uri LIZJ() {
        String string = this.LIZ.getString("iconUri");
        if (string == null) {
            return null;
        }
        return UriProtector.parse(string);
    }

    public final String LIZLLL() {
        return this.LIZ.getString("id");
    }

    public final String LJ() {
        return this.LIZ.getString("name");
    }

    public final int LJFF() {
        return this.LIZ.getInt("volume");
    }

    public final int LJI() {
        return this.LIZ.getInt("volumeHandling", 0);
    }

    public final int LJII() {
        return this.LIZ.getInt("volumeMax");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(LIZLLL());
        sb.append(", groupMemberIds=");
        sb.append(LIZIZ());
        sb.append(", name=");
        sb.append(LJ());
        sb.append(", description=");
        sb.append(this.LIZ.getString("status"));
        sb.append(", iconUri=");
        sb.append(LIZJ());
        sb.append(", isEnabled=");
        sb.append(this.LIZ.getBoolean("enabled", true));
        sb.append(", connectionState=");
        sb.append(this.LIZ.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        LIZ();
        sb.append(Arrays.toString(this.LIZJ.toArray()));
        sb.append(", playbackType=");
        sb.append(this.LIZ.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(this.LIZ.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(this.LIZ.getInt("deviceType"));
        sb.append(", volume=");
        sb.append(LJFF());
        sb.append(", volumeMax=");
        sb.append(LJII());
        sb.append(", volumeHandling=");
        sb.append(LJI());
        sb.append(", presentationDisplayId=");
        sb.append(this.LIZ.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(this.LIZ.getBundle("extras"));
        sb.append(", isValid=");
        sb.append(LJIIIIZZ());
        sb.append(", minClientVersion=");
        sb.append(this.LIZ.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(this.LIZ.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(" }");
        return sb.toString();
    }

    public final boolean LJIIIIZZ() {
        LIZ();
        if (TextUtils.isEmpty(LIZLLL()) || TextUtils.isEmpty(LJ()) || this.LIZJ.contains(null)) {
            return false;
        }
        return true;
    }

    public C90089ZXh(Bundle bundle) {
        this.LIZ = bundle;
    }
}
