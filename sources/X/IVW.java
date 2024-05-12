package X;

import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IVW implements Serializable {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    public int getDimension() {
        return this.LJLILLLLZI;
    }

    public int getProjectionModel() {
        return this.LJLJI;
    }

    public int getStreamingType() {
        return this.LJLJJL;
    }

    public int getVideoStyle() {
        return this.LJLIL;
    }

    public int getViewSize() {
        return this.LJLJJI;
    }

    public static IVW fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new IVW(jSONObject.optInt("Vstyle", 0), jSONObject.optInt("Dimension", 0), jSONObject.optInt("ProjectionModel", 0), jSONObject.optInt("ViewSize", 0), jSONObject.optInt("VRStreamingType", 0));
        } catch (Throwable unused) {
            return null;
        }
    }

    public IVW(int i, int i2, int i3, int i4, int i5) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
    }
}
