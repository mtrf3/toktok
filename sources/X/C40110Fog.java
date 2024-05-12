package X;

import com.lynx.tasm.LynxViewClient;

/* renamed from: X.Fog, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40110Fog extends LynxViewClient {
    public final /* synthetic */ int LIZ;

    public C40110Fog(int i) {
        this.LIZ = i;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJ(String str, java.util.Map map, java.util.Map map2) {
        String str2;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1317443398) {
                if (hashCode != -399350870) {
                    if (hashCode != 1882254123) {
                        return;
                    } else {
                        str2 = "_update_timing_from_cache";
                    }
                } else {
                    str2 = "_update_timing_no_data";
                }
                str.equals(str2);
                return;
            }
            if (!str.equals("_update_timing_from_server")) {
                return;
            }
            IK8.LIZIZ(this.LIZ);
        }
    }
}
